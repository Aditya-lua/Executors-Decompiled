package p365q;

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
import p181i.C6589a;
import p181i.C6594f;
import p261l2.C7975b;
import p350p3.AbstractC10156c;

/* JADX INFO: renamed from: q.u0 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC10404u0 extends AbstractC10156c implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public final SearchView f37479l;

    /* JADX INFO: renamed from: m */
    public final SearchableInfo f37480m;

    /* JADX INFO: renamed from: n */
    public final Context f37481n;

    /* JADX INFO: renamed from: o */
    public final WeakHashMap<String, Drawable.ConstantState> f37482o;

    /* JADX INFO: renamed from: p */
    public final int f37483p;

    /* JADX INFO: renamed from: q */
    public boolean f37484q;

    /* JADX INFO: renamed from: r */
    public int f37485r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f37486s;

    /* JADX INFO: renamed from: t */
    public int f37487t;

    /* JADX INFO: renamed from: u */
    public int f37488u;

    /* JADX INFO: renamed from: v */
    public int f37489v;

    /* JADX INFO: renamed from: w */
    public int f37490w;

    /* JADX INFO: renamed from: x */
    public int f37491x;

    /* JADX INFO: renamed from: y */
    public int f37492y;

    /* JADX INFO: renamed from: q.u0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f37493a;

        /* JADX INFO: renamed from: b */
        public final TextView f37494b;

        /* JADX INFO: renamed from: c */
        public final ImageView f37495c;

        /* JADX INFO: renamed from: d */
        public final ImageView f37496d;

        /* JADX INFO: renamed from: e */
        public final ImageView f37497e;

        public a(View view) {
            this.f37493a = (TextView) view.findViewById(R.id.text1);
            this.f37494b = (TextView) view.findViewById(R.id.text2);
            this.f37495c = (ImageView) view.findViewById(R.id.icon1);
            this.f37496d = (ImageView) view.findViewById(R.id.icon2);
            this.f37497e = (ImageView) view.findViewById(C6594f.f25152s);
        }
    }

    public ViewOnClickListenerC10404u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f37484q = false;
        this.f37485r = 1;
        this.f37487t = -1;
        this.f37488u = -1;
        this.f37489v = -1;
        this.f37490w = -1;
        this.f37491x = -1;
        this.f37492y = -1;
        this.f37479l = searchView;
        this.f37480m = searchableInfo;
        this.f37483p = searchView.getSuggestionCommitIconResId();
        this.f37481n = context;
        this.f37482o = weakHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static String m40038n(Cursor cursor, String str) {
        return m40039v(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: v */
    public static String m40039v(Cursor cursor, int i10) {
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

    /* JADX INFO: renamed from: A */
    public final void m40040A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p350p3.AbstractC10154a, p350p3.C10155b.a
    /* JADX INFO: renamed from: a */
    public void mo39095a(Cursor cursor) {
        if (this.f37484q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo39095a(cursor);
            if (cursor != null) {
                this.f37487t = cursor.getColumnIndex("suggest_text_1");
                this.f37488u = cursor.getColumnIndex("suggest_text_2");
                this.f37489v = cursor.getColumnIndex("suggest_text_2_url");
                this.f37490w = cursor.getColumnIndex("suggest_icon_1");
                this.f37491x = cursor.getColumnIndex("suggest_icon_2");
                this.f37492y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p350p3.C10155b.a
    /* JADX INFO: renamed from: b */
    public Cursor mo39103b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f37479l.getVisibility() == 0 && this.f37479l.getWindowVisibility() == 0) {
            try {
                Cursor cursorM40051u = m40051u(this.f37480m, string, 50);
                if (cursorM40051u != null) {
                    cursorM40051u.getCount();
                    return cursorM40051u;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p350p3.AbstractC10154a, p350p3.C10155b.a
    public CharSequence convertToString(Cursor cursor) {
        String strM40038n;
        String strM40038n2;
        if (cursor == null) {
            return null;
        }
        String strM40038n3 = m40038n(cursor, "suggest_intent_query");
        if (strM40038n3 != null) {
            return strM40038n3;
        }
        if (this.f37480m.shouldRewriteQueryFromData() && (strM40038n2 = m40038n(cursor, "suggest_intent_data")) != null) {
            return strM40038n2;
        }
        if (!this.f37480m.shouldRewriteQueryFromText() || (strM40038n = m40038n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM40038n;
    }

    @Override // p350p3.AbstractC10154a
    /* JADX INFO: renamed from: d */
    public void mo39097d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f37492y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f37493a != null) {
            m40054y(aVar.f37493a, m40039v(cursor, this.f37487t));
        }
        if (aVar.f37494b != null) {
            String strM40039v = m40039v(cursor, this.f37489v);
            CharSequence charSequenceM40042k = strM40039v != null ? m40042k(strM40039v) : m40039v(cursor, this.f37488u);
            if (TextUtils.isEmpty(charSequenceM40042k)) {
                TextView textView = aVar.f37493a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f37493a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f37493a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f37493a.setMaxLines(1);
                }
            }
            m40054y(aVar.f37494b, charSequenceM40042k);
        }
        ImageView imageView = aVar.f37495c;
        if (imageView != null) {
            m40053x(imageView, m40049s(cursor), 4);
        }
        ImageView imageView2 = aVar.f37496d;
        if (imageView2 != null) {
            m40053x(imageView2, m40050t(cursor), 8);
        }
        int i12 = this.f37485r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f37497e.setVisibility(8);
            return;
        }
        aVar.f37497e.setVisibility(0);
        aVar.f37497e.setTag(aVar.f37493a.getText());
        aVar.f37497e.setOnClickListener(this);
    }

    @Override // p350p3.AbstractC10156c, p350p3.AbstractC10154a
    /* JADX INFO: renamed from: g */
    public View mo39100g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo39100g = super.mo39100g(context, cursor, viewGroup);
        viewMo39100g.setTag(new a(viewMo39100g));
        ((ImageView) viewMo39100g.findViewById(C6594f.f25152s)).setImageResource(this.f37483p);
        return viewMo39100g;
    }

    @Override // p350p3.AbstractC10154a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewMo39099f = mo39099f(this.f37481n, mo39096c(), viewGroup);
            if (viewMo39099f != null) {
                ((a) viewMo39099f.getTag()).f37493a.setText(e10.toString());
            }
            return viewMo39099f;
        }
    }

    @Override // p350p3.AbstractC10154a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewMo39100g = mo39100g(this.f37481n, mo39096c(), viewGroup);
            if (viewMo39100g != null) {
                ((a) viewMo39100g.getTag()).f37493a.setText(e10.toString());
            }
            return viewMo39100g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Drawable m40041j(String str) {
        Drawable.ConstantState constantState = this.f37482o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m40042k(CharSequence charSequence) {
        if (this.f37486s == null) {
            TypedValue typedValue = new TypedValue();
            this.f37481n.getTheme().resolveAttribute(C6589a.f25019O, typedValue, true);
            this.f37486s = this.f37481n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f37486s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m40043l(ComponentName componentName) {
        PackageManager packageManager = this.f37481n.getPackageManager();
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

    /* JADX INFO: renamed from: m */
    public final Drawable m40044m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f37482o.containsKey(strFlattenToShortString)) {
            Drawable drawableM40043l = m40043l(componentName);
            this.f37482o.put(strFlattenToShortString, drawableM40043l != null ? drawableM40043l.getConstantState() : null);
            return drawableM40043l;
        }
        Drawable.ConstantState constantState = this.f37482o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f37481n.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m40040A(mo39096c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m40040A(mo39096c());
    }

    /* JADX INFO: renamed from: o */
    public final Drawable m40045o() {
        Drawable drawableM40044m = m40044m(this.f37480m.getSearchActivity());
        return drawableM40044m != null ? drawableM40044m : this.f37481n.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f37479l.m1832S((CharSequence) tag);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Drawable m40046p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m40047q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f37481n.getContentResolver().openInputStream(uri);
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

    /* JADX INFO: renamed from: q */
    public Drawable m40047q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f37481n.getPackageManager().getResourcesForApplication(authority);
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

    /* JADX INFO: renamed from: r */
    public final Drawable m40048r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f37481n.getPackageName() + "/" + i10;
            Drawable drawableM40041j = m40041j(str2);
            if (drawableM40041j != null) {
                return drawableM40041j;
            }
            Drawable drawableM33008f = C7975b.m33008f(this.f37481n, i10);
            m40055z(str2, drawableM33008f);
            return drawableM33008f;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM40041j2 = m40041j(str);
            if (drawableM40041j2 != null) {
                return drawableM40041j2;
            }
            Drawable drawableM40046p = m40046p(Uri.parse(str));
            m40055z(str, drawableM40046p);
            return drawableM40046p;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Drawable m40049s(Cursor cursor) {
        int i10 = this.f37490w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableM40048r = m40048r(cursor.getString(i10));
        return drawableM40048r != null ? drawableM40048r : m40045o();
    }

    /* JADX INFO: renamed from: t */
    public final Drawable m40050t(Cursor cursor) {
        int i10 = this.f37491x;
        if (i10 == -1) {
            return null;
        }
        return m40048r(cursor.getString(i10));
    }

    /* JADX INFO: renamed from: u */
    public Cursor m40051u(SearchableInfo searchableInfo, String str, int i10) {
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
        return this.f37481n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: w */
    public void m40052w(int i10) {
        this.f37485r = i10;
    }

    /* JADX INFO: renamed from: x */
    public final void m40053x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* JADX INFO: renamed from: y */
    public final void m40054y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m40055z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f37482o.put(str, drawable.getConstantState());
        }
    }
}
