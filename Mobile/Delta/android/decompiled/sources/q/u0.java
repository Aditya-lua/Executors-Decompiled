package q;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends p3.c implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SearchView f29115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchableInfo f29116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f29117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f29118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f29119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f29122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f29128y;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f29129a;
        public final TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f29130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f29131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f29132e;

        public a(View view) {
            this.f29129a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.f29130c = (ImageView) view.findViewById(R.id.icon1);
            this.f29131d = (ImageView) view.findViewById(R.id.icon2);
            this.f29132e = (ImageView) view.findViewById(i.f.f19971s);
        }
    }

    public u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f29120q = false;
        this.f29121r = 1;
        this.f29123t = -1;
        this.f29124u = -1;
        this.f29125v = -1;
        this.f29126w = -1;
        this.f29127x = -1;
        this.f29128y = -1;
        this.f29115l = searchView;
        this.f29116m = searchableInfo;
        this.f29119p = searchView.getSuggestionCommitIconResId();
        this.f29117n = context;
        this.f29118o = weakHashMap;
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    public static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public final void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p3.a, p3.b.a
    public void a(Cursor cursor) {
        if (this.f29120q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f29123t = cursor.getColumnIndex("suggest_text_1");
                this.f29124u = cursor.getColumnIndex("suggest_text_2");
                this.f29125v = cursor.getColumnIndex("suggest_text_2_url");
                this.f29126w = cursor.getColumnIndex("suggest_icon_1");
                this.f29127x = cursor.getColumnIndex("suggest_icon_2");
                this.f29128y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p3.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f29115l.getVisibility() == 0 && this.f29115l.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f29116m, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p3.a, p3.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f29116m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f29116m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // p3.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f29128y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f29129a != null) {
            y(aVar.f29129a, v(cursor, this.f29123t));
        }
        if (aVar.b != null) {
            String strV = v(cursor, this.f29125v);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f29124u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f29129a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f29129a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f29129a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f29129a.setMaxLines(1);
                }
            }
            y(aVar.b, charSequenceK);
        }
        ImageView imageView = aVar.f29130c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f29131d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f29121r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f29132e.setVisibility(8);
            return;
        }
        aVar.f29132e.setVisibility(0);
        aVar.f29132e.setTag(aVar.f29129a.getText());
        aVar.f29132e.setOnClickListener(this);
    }

    @Override // p3.c, p3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(i.f.f19971s)).setImageResource(this.f29119p);
        return viewG;
    }

    @Override // p3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewF = f(this.f29117n, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f29129a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // p3.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f29117n, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f29129a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable j(String str) {
        Drawable.ConstantState constantState = this.f29118o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence k(CharSequence charSequence) {
        if (this.f29122s == null) {
            TypedValue typedValue = new TypedValue();
            this.f29117n.getTheme().resolveAttribute(i.a.O, typedValue, true);
            this.f29122s = this.f29117n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f29122s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f29117n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    public final Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f29118o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f29118o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = this.f29118o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f29117n.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    public final Drawable o() {
        Drawable drawableM = m(this.f29116m.getSearchActivity());
        return drawableM != null ? drawableM : this.f29117n.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f29115l.S((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f29117n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
                throw th2;
            }
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    public Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f29117n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f29117n.getPackageName() + "/" + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableF = l2.b.f(this.f29117n, i10);
            z(str2, drawableF);
            return drawableF;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    public final Drawable s(Cursor cursor) {
        int i10 = this.f29126w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    public final Drawable t(Cursor cursor) {
        int i10 = this.f29127x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    public Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f29117n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f29121r = i10;
    }

    public final void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f29118o.put(str, drawable.getConstantState());
        }
    }
}
