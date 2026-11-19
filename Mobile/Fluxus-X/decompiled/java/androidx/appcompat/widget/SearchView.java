package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.b1;
import q.f1;
import q.h1;
import q.v0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements o.c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final o f937o0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public m K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public p3.a P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f938a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f939b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f940c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SearchableInfo f941d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Bundle f942e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Runnable f943f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Runnable f944g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f945h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final View.OnClickListener f946i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View.OnKeyListener f947j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f948k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f949l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f950m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextWatcher f951n0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f962z;

    public static class SearchAutoComplete extends q.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f966h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.f18744q);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return Barcode.FORMAT_QR_CODE;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f937o0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f965g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f965g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f963e <= 0 || super.enoughToFilter();
        }

        @Override // q.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f965g) {
                removeCallbacks(this.f966h);
                post(this.f966h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f964f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f964f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f964f.hasFocus() && getVisibility() == 0) {
                this.f965g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f965g = false;
                removeCallbacks(this.f966h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f965g = true;
                    return;
                }
                this.f965g = false;
                removeCallbacks(this.f966h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f964f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f963e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f966h = new a();
            this.f963e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p3.a aVar = SearchView.this.P;
            if (aVar instanceof v0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f956t) {
                searchView.T();
                return;
            }
            if (view == searchView.f958v) {
                searchView.P();
                return;
            }
            if (view == searchView.f957u) {
                searchView.U();
            } else if (view == searchView.f959w) {
                searchView.Y();
            } else if (view == searchView.f952p) {
                searchView.F();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f941d0 == null) {
                return false;
            }
            if (searchView.f952p.isPopupShowing() && SearchView.this.f952p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f952p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f952p.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f978a;
        public Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f979c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f978a = null;
            this.b = null;
            this.f979c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f978a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f979c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f978a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f979c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends r3.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f980c;

        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f980c + "}";
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f980c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f980c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f981a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f985f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f984e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.f983d = new Rect();
            this.f982c = new Rect();
            a(rect, rect2);
            this.f981a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f983d.set(rect);
            Rect rect3 = this.f983d;
            int i10 = this.f984e;
            rect3.inset(-i10, -i10);
            this.f982c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x5 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f985f;
                    if (z11 && !this.f983d.contains(x5, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f985f;
                    this.f985f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.b.contains(x5, y10)) {
                this.f985f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f982c.contains(x5, y10)) {
                Rect rect = this.f982c;
                motionEvent.setLocation(x5 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f981a.getWidth() / 2, this.f981a.getHeight() / 2);
            }
            return this.f981a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f937o0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.f18767g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f18768h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f952p.setText(charSequence);
        this.f952p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f938a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f942e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f941d0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = v0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f941d0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = v0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f941d0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = v0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), v0.n(cursor, "suggest_intent_extra_data"), v0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f942e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.f952p.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f952p);
            return;
        }
        o oVar = f937o0;
        oVar.b(this.f952p);
        oVar.a(this.f952p);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.N || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f952p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f941d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f941d0.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else {
                intent = this.f941d0.getVoiceSearchLaunchRecognizer() ? this.I : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean J() {
        return this.O;
    }

    public final boolean L() {
        return (this.Q || this.V) && !J();
    }

    public final void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    public void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    public final boolean O(int i10, int i11, String str) {
        Cursor cursorC = this.P.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorC, i11, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.f952p.getText())) {
            this.f952p.setText(BuildConfig.FLAVOR);
            this.f952p.requestFocus();
            this.f952p.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            i0(true);
        }
    }

    public boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f952p.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i10) {
        a0(i10);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.f952p.requestFocus();
        this.f952p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.f952p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.K;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f941d0 != null) {
                N(0, null, text.toString());
            }
            this.f952p.setImeVisibility(false);
            E();
        }
    }

    public boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f941d0 != null && this.P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f952p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f952p.setSelection(i10 == 21 ? 0 : this.f952p.length());
                this.f952p.setListSelection(0);
                this.f952p.clearListSelection();
                this.f952p.b();
                return true;
            }
            if (i10 == 19) {
                this.f952p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.f952p.getText();
        this.f938a0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        if (this.K != null && !TextUtils.equals(charSequence, this.W)) {
            this.K.a(charSequence.toString());
        }
        this.W = charSequence.toString();
    }

    public void X() {
        i0(J());
        Z();
        if (this.f952p.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.f941d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Z() {
        post(this.f943f0);
    }

    public final void a0(int i10) {
        Editable text = this.f952p.getText();
        Cursor cursorC = this.P.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.P.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f952p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f952p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f938a0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f952p.getText());
        this.f958v.setVisibility(!zIsEmpty || (this.N && !this.f939b0) ? 0 : 8);
        Drawable drawable = this.f958v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.T = true;
        super.clearFocus();
        this.f952p.clearFocus();
        this.f952p.setImeVisibility(false);
        this.T = false;
    }

    public void d0() {
        int[] iArr = this.f952p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f954r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f955s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f952p;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.f952p.setThreshold(this.f941d0.getSuggestThreshold());
        this.f952p.setImeOptions(this.f941d0.getImeOptions());
        int inputType = this.f941d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f941d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f952p.setInputType(inputType);
        p3.a aVar = this.P;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f941d0.getSuggestAuthority() != null) {
            v0 v0Var = new v0(getContext(), this, this.f941d0, this.f945h0);
            this.P = v0Var;
            this.f952p.setAdapter(v0Var);
            ((v0) this.P).w(this.S ? 2 : 1);
        }
    }

    public final void g0() {
        this.f955s.setVisibility((L() && (this.f957u.getVisibility() == 0 || this.f959w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f952p.getImeOptions();
    }

    public int getInputType() {
        return this.f952p.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f952p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f941d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f941d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public p3.a getSuggestionsAdapter() {
        return this.P;
    }

    public final void h0(boolean z10) {
        this.f957u.setVisibility((this.Q && L() && hasFocus() && (z10 || !this.V)) ? 0 : 8);
    }

    public final void i0(boolean z10) {
        this.O = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f952p.getText());
        this.f956t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f953q.setVisibility(z10 ? 8 : 0);
        if (this.D.getDrawable() != null && !this.N) {
            i10 = 0;
        }
        this.D.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    public final void j0(boolean z10) {
        int i10 = 8;
        if (this.V && !J() && z10) {
            this.f957u.setVisibility(8);
            i10 = 0;
        }
        this.f959w.setVisibility(i10);
    }

    @Override // o.c
    public void onActionViewCollapsed() {
        b0(BuildConfig.FLAVOR, false);
        clearFocus();
        i0(true);
        this.f952p.setImeOptions(this.f940c0);
        this.f939b0 = false;
    }

    @Override // o.c
    public void onActionViewExpanded() {
        if (this.f939b0) {
            return;
        }
        this.f939b0 = true;
        int imeOptions = this.f952p.getImeOptions();
        this.f940c0 = imeOptions;
        this.f952p.setImeOptions(imeOptions | 33554432);
        this.f952p.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f943f0);
        post(this.f944g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f952p, this.f962z);
            Rect rect = this.A;
            Rect rect2 = this.f962z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f961y;
            if (qVar != null) {
                qVar.a(this.A, this.f962z);
                return;
            }
            q qVar2 = new q(this.A, this.f962z, this.f952p);
            this.f961y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.U;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.U) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        i0(pVar.f980c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f980c = J();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f952p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f942e0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f952p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f952p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.U = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.K = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.S = z10;
        p3.a aVar = this.P;
        if (aVar instanceof v0) {
            ((v0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f941d0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.V = zI;
        if (zI) {
            this.f952p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.Q = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(p3.a aVar) {
        this.P = aVar;
        this.f952p.setAdapter(aVar);
    }

    public void z() {
        if (this.f960x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f954r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = h1.b(this);
            int dimensionPixelSize = this.N ? resources.getDimensionPixelSize(i.d.f18765e) + resources.getDimensionPixelSize(i.d.f18766f) : 0;
            this.f952p.getDropDownBackground().getPadding(rect);
            this.f952p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f952p.setDropDownWidth((((this.f960x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.K);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f962z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f943f0 = new b();
        this.f944g0 = new c();
        this.f945h0 = new WeakHashMap<>();
        f fVar = new f();
        this.f946i0 = fVar;
        this.f947j0 = new g();
        h hVar = new h();
        this.f948k0 = hVar;
        i iVar = new i();
        this.f949l0 = iVar;
        j jVar = new j();
        this.f950m0 = jVar;
        this.f951n0 = new a();
        b1 b1VarV = b1.v(context, attributeSet, i.j.f18898h2, i10, 0);
        o0.k0(this, context, i.j.f18898h2, attributeSet, b1VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(b1VarV.n(i.j.f18948r2, i.g.f18840t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.I);
        this.f952p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f953q = findViewById(i.f.E);
        View viewFindViewById = findViewById(i.f.H);
        this.f954r = viewFindViewById;
        View viewFindViewById2 = findViewById(i.f.O);
        this.f955s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.C);
        this.f956t = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.F);
        this.f957u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.D);
        this.f958v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.J);
        this.f959w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.G);
        this.D = imageView5;
        o0.q0(viewFindViewById, b1VarV.g(i.j.f18953s2));
        o0.q0(viewFindViewById2, b1VarV.g(i.j.f18973w2));
        imageView.setImageDrawable(b1VarV.g(i.j.f18968v2));
        imageView2.setImageDrawable(b1VarV.g(i.j.f18938p2));
        imageView3.setImageDrawable(b1VarV.g(i.j.f18923m2));
        imageView4.setImageDrawable(b1VarV.g(i.j.f18983y2));
        imageView5.setImageDrawable(b1VarV.g(i.j.f18968v2));
        this.E = b1VarV.g(i.j.f18963u2);
        f1.a(imageView, getResources().getString(i.h.f18856p));
        this.F = b1VarV.n(i.j.f18978x2, i.g.f18839s);
        this.G = b1VarV.n(i.j.f18928n2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f951n0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f947j0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(b1VarV.a(i.j.f18943q2, true));
        int iF = b1VarV.f(i.j.f18908j2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.J = b1VarV.p(i.j.f18933o2);
        this.R = b1VarV.p(i.j.f18958t2);
        int iK = b1VarV.k(i.j.f18918l2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = b1VarV.k(i.j.f18913k2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(b1VarV.a(i.j.f18903i2, true));
        b1VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f960x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.N);
        e0();
    }
}
