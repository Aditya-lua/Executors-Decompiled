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
import androidx.customview.view.AbsSavedState;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.a1;
import q.e1;
import q.g1;
import q.u0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements o.c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final o f1130o0;
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
    public CharSequence f1131a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1132b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1133c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SearchableInfo f1134d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Bundle f1135e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Runnable f1136f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Runnable f1137g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1138h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final View.OnClickListener f1139i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View.OnKeyListener f1140j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f1141k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f1142l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f1143m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextWatcher f1144n0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f1145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f1146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f1147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f1148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f1149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f1150u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f1151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f1152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f1153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p f1154y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f1155z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1156c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1156c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1156c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1156c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends q.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f1158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f1160h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.f19901q);
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
                SearchView.f1130o0.c(this);
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
            if (this.f1159g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1159g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1157e <= 0 || super.enoughToFilter();
        }

        @Override // q.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1159g) {
                removeCallbacks(this.f1160h);
                post(this.f1160h);
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
            this.f1158f.X();
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
                        this.f1158f.clearFocus();
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
            if (z10 && this.f1158f.hasFocus() && getVisibility() == 0) {
                this.f1159g = true;
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
                this.f1159g = false;
                removeCallbacks(this.f1160h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1159g = true;
                    return;
                }
                this.f1159g = false;
                removeCallbacks(this.f1160h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1158f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1157e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1160h = new a();
            this.f1157e = getThreshold();
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
            if (aVar instanceof u0) {
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
            if (view == searchView.f1149t) {
                searchView.T();
                return;
            }
            if (view == searchView.f1151v) {
                searchView.P();
                return;
            }
            if (view == searchView.f1150u) {
                searchView.U();
            } else if (view == searchView.f1152w) {
                searchView.Y();
            } else if (view == searchView.f1145p) {
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
            if (searchView.f1134d0 == null) {
                return false;
            }
            if (searchView.f1145p.isPopupShowing() && SearchView.this.f1145p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f1145p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f1145p.getText().toString());
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
        public Method f1172a;
        public Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f1173c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1172a = null;
            this.b = null;
            this.f1173c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1172a = declaredMethod;
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
                this.f1173c = method;
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
            Method method = this.f1172a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1173c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1174a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f1175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f1176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1178f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1177e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.f1176d = new Rect();
            this.f1175c = new Rect();
            a(rect, rect2);
            this.f1174a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f1176d.set(rect);
            Rect rect3 = this.f1176d;
            int i10 = this.f1177e;
            rect3.inset(-i10, -i10);
            this.f1175c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1178f;
                    if (z11 && !this.f1176d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1178f;
                    this.f1178f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.b.contains(x10, y10)) {
                this.f1178f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1175c.contains(x10, y10)) {
                Rect rect = this.f1175c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1174a.getWidth() / 2, this.f1174a.getHeight() / 2);
            }
            return this.f1174a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1130o0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.f19924g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f19925h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1145p.setText(charSequence);
        this.f1145p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1131a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1135e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1134d0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = u0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f1134d0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = u0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f1134d0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = u0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), u0.n(cursor, "suggest_intent_extra_data"), u0.n(cursor, "suggest_intent_query"), i10, str);
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
        Bundle bundle2 = this.f1135e0;
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
        this.f1145p.dismissDropDown();
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1145p);
            return;
        }
        o oVar = f1130o0;
        oVar.b(this.f1145p);
        oVar.a(this.f1145p);
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
        int textSize = (int) (((double) this.f1145p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1134d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f1134d0.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else {
                intent = this.f1134d0.getVoiceSearchLaunchRecognizer() ? this.I : null;
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
        if (!TextUtils.isEmpty(this.f1145p.getText())) {
            this.f1145p.setText("");
            this.f1145p.requestFocus();
            this.f1145p.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            i0(true);
        }
    }

    public boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f1145p.setImeVisibility(false);
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
        this.f1145p.requestFocus();
        this.f1145p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.f1145p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.K;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f1134d0 != null) {
                N(0, null, text.toString());
            }
            this.f1145p.setImeVisibility(false);
            E();
        }
    }

    public boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f1134d0 != null && this.P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f1145p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1145p.setSelection(i10 == 21 ? 0 : this.f1145p.length());
                this.f1145p.setListSelection(0);
                this.f1145p.clearListSelection();
                this.f1145p.b();
                return true;
            }
            if (i10 == 19) {
                this.f1145p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.f1145p.getText();
        this.f1131a0 = text;
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
        if (this.f1145p.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.f1134d0;
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
        post(this.f1136f0);
    }

    public final void a0(int i10) {
        Editable text = this.f1145p.getText();
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
        this.f1145p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1145p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1131a0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1145p.getText());
        this.f1151v.setVisibility(!zIsEmpty || (this.N && !this.f1132b0) ? 0 : 8);
        Drawable drawable = this.f1151v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.T = true;
        super.clearFocus();
        this.f1145p.clearFocus();
        this.f1145p.setImeVisibility(false);
        this.T = false;
    }

    public void d0() {
        int[] iArr = this.f1145p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1147r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1148s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1145p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.f1145p.setThreshold(this.f1134d0.getSuggestThreshold());
        this.f1145p.setImeOptions(this.f1134d0.getImeOptions());
        int inputType = this.f1134d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1134d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f1145p.setInputType(inputType);
        p3.a aVar = this.P;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1134d0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.f1134d0, this.f1138h0);
            this.P = u0Var;
            this.f1145p.setAdapter(u0Var);
            ((u0) this.P).w(this.S ? 2 : 1);
        }
    }

    public final void g0() {
        this.f1148s.setVisibility((L() && (this.f1150u.getVisibility() == 0 || this.f1152w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f1145p.getImeOptions();
    }

    public int getInputType() {
        return this.f1145p.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f1145p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1134d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f1134d0.getHintId());
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
        this.f1150u.setVisibility((this.Q && L() && hasFocus() && (z10 || !this.V)) ? 0 : 8);
    }

    public final void i0(boolean z10) {
        this.O = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1145p.getText());
        this.f1149t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f1146q.setVisibility(z10 ? 8 : 0);
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
            this.f1150u.setVisibility(8);
            i10 = 0;
        }
        this.f1152w.setVisibility(i10);
    }

    @Override // o.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f1145p.setImeOptions(this.f1133c0);
        this.f1132b0 = false;
    }

    @Override // o.c
    public void onActionViewExpanded() {
        if (this.f1132b0) {
            return;
        }
        this.f1132b0 = true;
        int imeOptions = this.f1145p.getImeOptions();
        this.f1133c0 = imeOptions;
        this.f1145p.setImeOptions(imeOptions | 33554432);
        this.f1145p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1136f0);
        post(this.f1137g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f1145p, this.f1155z);
            Rect rect = this.A;
            Rect rect2 = this.f1155z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f1154y;
            if (pVar != null) {
                pVar.a(this.A, this.f1155z);
                return;
            }
            p pVar2 = new p(this.A, this.f1155z, this.f1145p);
            this.f1154y = pVar2;
            setTouchDelegate(pVar2);
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
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        i0(savedState.f1156c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1156c = J();
        return savedState;
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
        boolean zRequestFocus = this.f1145p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1135e0 = bundle;
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
        this.f1145p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1145p.setInputType(i10);
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
        if (aVar instanceof u0) {
            ((u0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1134d0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.V = zI;
        if (zI) {
            this.f1145p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.Q = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(p3.a aVar) {
        this.P = aVar;
        this.f1145p.setAdapter(aVar);
    }

    public void z() {
        if (this.f1153x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1147r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = g1.b(this);
            int dimensionPixelSize = this.N ? resources.getDimensionPixelSize(i.d.f19922e) + resources.getDimensionPixelSize(i.d.f19923f) : 0;
            this.f1145p.getDropDownBackground().getPadding(rect);
            this.f1145p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1145p.setDropDownWidth((((this.f1153x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.K);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1155z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1136f0 = new b();
        this.f1137g0 = new c();
        this.f1138h0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1139i0 = fVar;
        this.f1140j0 = new g();
        h hVar = new h();
        this.f1141k0 = hVar;
        i iVar = new i();
        this.f1142l0 = iVar;
        j jVar = new j();
        this.f1143m0 = jVar;
        this.f1144n0 = new a();
        int[] iArr = i.j.f20055h2;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, a1VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(a1VarV.n(i.j.f20105r2, i.g.f19997t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.I);
        this.f1145p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1146q = findViewById(i.f.E);
        View viewFindViewById = findViewById(i.f.H);
        this.f1147r = viewFindViewById;
        View viewFindViewById2 = findViewById(i.f.O);
        this.f1148s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.C);
        this.f1149t = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.F);
        this.f1150u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.D);
        this.f1151v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.J);
        this.f1152w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.G);
        this.D = imageView5;
        o0.q0(viewFindViewById, a1VarV.g(i.j.f20110s2));
        o0.q0(viewFindViewById2, a1VarV.g(i.j.f20130w2));
        int i11 = i.j.f20125v2;
        imageView.setImageDrawable(a1VarV.g(i11));
        imageView2.setImageDrawable(a1VarV.g(i.j.f20095p2));
        imageView3.setImageDrawable(a1VarV.g(i.j.f20080m2));
        imageView4.setImageDrawable(a1VarV.g(i.j.f20140y2));
        imageView5.setImageDrawable(a1VarV.g(i11));
        this.E = a1VarV.g(i.j.f20120u2);
        e1.a(imageView, getResources().getString(i.h.f20013p));
        this.F = a1VarV.n(i.j.f20135x2, i.g.f19996s);
        this.G = a1VarV.n(i.j.f20085n2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1144n0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1140j0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a1VarV.a(i.j.f20100q2, true));
        int iF = a1VarV.f(i.j.f20065j2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.J = a1VarV.p(i.j.f20090o2);
        this.R = a1VarV.p(i.j.f20115t2);
        int iK = a1VarV.k(i.j.f20075l2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = a1VarV.k(i.j.f20070k2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(a1VarV.a(i.j.f20060i2, true));
        a1VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1153x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.N);
        e0();
    }
}
