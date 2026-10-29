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
import androidx.core.view.C0625o0;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p181i.C6589a;
import p181i.C6592d;
import p181i.C6594f;
import p181i.C6595g;
import p181i.C6596h;
import p181i.C6598j;
import p316o.InterfaceC9610c;
import p350p3.AbstractC10154a;
import p365q.C10357a1;
import p365q.C10364d;
import p365q.C10369e1;
import p365q.C10375g1;
import p365q.ViewOnClickListenerC10404u0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends C0484b implements InterfaceC9610c {

    /* JADX INFO: renamed from: o0 */
    public static final C0468o f1455o0;

    /* JADX INFO: renamed from: A */
    public Rect f1456A;

    /* JADX INFO: renamed from: B */
    public int[] f1457B;

    /* JADX INFO: renamed from: C */
    public int[] f1458C;

    /* JADX INFO: renamed from: D */
    public final ImageView f1459D;

    /* JADX INFO: renamed from: E */
    public final Drawable f1460E;

    /* JADX INFO: renamed from: F */
    public final int f1461F;

    /* JADX INFO: renamed from: G */
    public final int f1462G;

    /* JADX INFO: renamed from: H */
    public final Intent f1463H;

    /* JADX INFO: renamed from: I */
    public final Intent f1464I;

    /* JADX INFO: renamed from: J */
    public final CharSequence f1465J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0466m f1466K;

    /* JADX INFO: renamed from: L */
    public View.OnFocusChangeListener f1467L;

    /* JADX INFO: renamed from: M */
    public View.OnClickListener f1468M;

    /* JADX INFO: renamed from: N */
    public boolean f1469N;

    /* JADX INFO: renamed from: O */
    public boolean f1470O;

    /* JADX INFO: renamed from: P */
    public AbstractC10154a f1471P;

    /* JADX INFO: renamed from: Q */
    public boolean f1472Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f1473R;

    /* JADX INFO: renamed from: S */
    public boolean f1474S;

    /* JADX INFO: renamed from: T */
    public boolean f1475T;

    /* JADX INFO: renamed from: U */
    public int f1476U;

    /* JADX INFO: renamed from: V */
    public boolean f1477V;

    /* JADX INFO: renamed from: W */
    public CharSequence f1478W;

    /* JADX INFO: renamed from: a0 */
    public CharSequence f1479a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f1480b0;

    /* JADX INFO: renamed from: c0 */
    public int f1481c0;

    /* JADX INFO: renamed from: d0 */
    public SearchableInfo f1482d0;

    /* JADX INFO: renamed from: e0 */
    public Bundle f1483e0;

    /* JADX INFO: renamed from: f0 */
    public final Runnable f1484f0;

    /* JADX INFO: renamed from: g0 */
    public Runnable f1485g0;

    /* JADX INFO: renamed from: h0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1486h0;

    /* JADX INFO: renamed from: i0 */
    public final View.OnClickListener f1487i0;

    /* JADX INFO: renamed from: j0 */
    public View.OnKeyListener f1488j0;

    /* JADX INFO: renamed from: k0 */
    public final TextView.OnEditorActionListener f1489k0;

    /* JADX INFO: renamed from: l0 */
    public final AdapterView.OnItemClickListener f1490l0;

    /* JADX INFO: renamed from: m0 */
    public final AdapterView.OnItemSelectedListener f1491m0;

    /* JADX INFO: renamed from: n0 */
    public TextWatcher f1492n0;

    /* JADX INFO: renamed from: p */
    public final SearchAutoComplete f1493p;

    /* JADX INFO: renamed from: q */
    public final View f1494q;

    /* JADX INFO: renamed from: r */
    public final View f1495r;

    /* JADX INFO: renamed from: s */
    public final View f1496s;

    /* JADX INFO: renamed from: t */
    public final ImageView f1497t;

    /* JADX INFO: renamed from: u */
    public final ImageView f1498u;

    /* JADX INFO: renamed from: v */
    public final ImageView f1499v;

    /* JADX INFO: renamed from: w */
    public final ImageView f1500w;

    /* JADX INFO: renamed from: x */
    public final View f1501x;

    /* JADX INFO: renamed from: y */
    public C0469p f1502y;

    /* JADX INFO: renamed from: z */
    public Rect f1503z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0452a();

        /* JADX INFO: renamed from: c */
        public boolean f1504c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public class C0452a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1504c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1504c));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1504c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C10364d {

        /* JADX INFO: renamed from: e */
        public int f1505e;

        /* JADX INFO: renamed from: f */
        public SearchView f1506f;

        /* JADX INFO: renamed from: g */
        public boolean f1507g;

        /* JADX INFO: renamed from: h */
        public final Runnable f1508h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0453a implements Runnable {
            public RunnableC0453a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m1856d();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C6589a.f25038q);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: b */
        public void m1854b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1455o0.m1864c(this);
                return;
            }
            C0464k.m1858b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m1855c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* JADX INFO: renamed from: d */
        public void m1856d() {
            if (this.f1507g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1507g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1505e <= 0 || super.enoughToFilter();
        }

        @Override // p365q.C10364d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1507g) {
                removeCallbacks(this.f1508h);
                post(this.f1508h);
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
            this.f1506f.m1837X();
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
                        this.f1506f.clearFocus();
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
            if (z10 && this.f1506f.hasFocus() && getVisibility() == 0) {
                this.f1507g = true;
                if (SearchView.m1814K(getContext())) {
                    m1854b();
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
                this.f1507g = false;
                removeCallbacks(this.f1508h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1507g = true;
                    return;
                }
                this.f1507g = false;
                removeCallbacks(this.f1508h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1506f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1505e = i10;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1508h = new RunnableC0453a();
            this.f1505e = getThreshold();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0454a implements TextWatcher {
        public C0454a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.m1836W(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0455b implements Runnable {
        public RunnableC0455b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m1843d0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0456c implements Runnable {
        public RunnableC0456c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC10154a abstractC10154a = SearchView.this.f1471P;
            if (abstractC10154a instanceof ViewOnClickListenerC10404u0) {
                abstractC10154a.mo39095a(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0457d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0457d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1467L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0458e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0458e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.m1850z();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0459f implements View.OnClickListener {
        public ViewOnClickListenerC0459f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1497t) {
                searchView.m1833T();
                return;
            }
            if (view == searchView.f1499v) {
                searchView.m1829P();
                return;
            }
            if (view == searchView.f1498u) {
                searchView.m1834U();
            } else if (view == searchView.f1500w) {
                searchView.m1838Y();
            } else if (view == searchView.f1493p) {
                searchView.m1820F();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0460g implements View.OnKeyListener {
        public ViewOnKeyListenerC0460g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1482d0 == null) {
                return false;
            }
            if (searchView.f1493p.isPopupShowing() && SearchView.this.f1493p.getListSelection() != -1) {
                return SearchView.this.m1835V(view, i10, keyEvent);
            }
            if (SearchView.this.f1493p.m1855c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m1827N(0, null, searchView2.f1493p.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0461h implements TextView.OnEditorActionListener {
        public C0461h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.m1834U();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0462i implements AdapterView.OnItemClickListener {
        public C0462i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m1830Q(i10, 0, null);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0463j implements AdapterView.OnItemSelectedListener {
        public C0463j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m1831R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0464k {
        /* JADX INFO: renamed from: a */
        public static void m1857a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* JADX INFO: renamed from: b */
        public static void m1858b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0465l {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0466m {
        /* JADX INFO: renamed from: a */
        boolean mo1859a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo1860b(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0467n {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0468o {

        /* JADX INFO: renamed from: a */
        public Method f1520a;

        /* JADX INFO: renamed from: b */
        public Method f1521b;

        /* JADX INFO: renamed from: c */
        public Method f1522c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0468o() {
            this.f1520a = null;
            this.f1521b = null;
            this.f1522c = null;
            m1861d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1520a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f1521b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1522c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m1861d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* JADX INFO: renamed from: a */
        public void m1862a(AutoCompleteTextView autoCompleteTextView) {
            m1861d();
            Method method = this.f1521b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m1863b(AutoCompleteTextView autoCompleteTextView) {
            m1861d();
            Method method = this.f1520a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m1864c(AutoCompleteTextView autoCompleteTextView) {
            m1861d();
            Method method = this.f1522c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0469p extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        public final View f1523a;

        /* JADX INFO: renamed from: b */
        public final Rect f1524b;

        /* JADX INFO: renamed from: c */
        public final Rect f1525c;

        /* JADX INFO: renamed from: d */
        public final Rect f1526d;

        /* JADX INFO: renamed from: e */
        public final int f1527e;

        /* JADX INFO: renamed from: f */
        public boolean f1528f;

        public C0469p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1527e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1524b = new Rect();
            this.f1526d = new Rect();
            this.f1525c = new Rect();
            m1865a(rect, rect2);
            this.f1523a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m1865a(Rect rect, Rect rect2) {
            this.f1524b.set(rect);
            this.f1526d.set(rect);
            Rect rect3 = this.f1526d;
            int i10 = this.f1527e;
            rect3.inset(-i10, -i10);
            this.f1525c.set(rect2);
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
                    z11 = this.f1528f;
                    if (z11 && !this.f1526d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1528f;
                    this.f1528f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1524b.contains(x10, y10)) {
                this.f1528f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1525c.contains(x10, y10)) {
                Rect rect = this.f1525c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1523a.getWidth() / 2, this.f1523a.getHeight() / 2);
            }
            return this.f1523a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1455o0 = Build.VERSION.SDK_INT < 29 ? new C0468o() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1814K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C6592d.f25063g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C6592d.f25064h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1493p.setText(charSequence);
        this.f1493p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: A */
    public final Intent m1815A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1479a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1483e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1482d0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: B */
    public final Intent m1816B(Cursor cursor, int i10, String str) {
        int position;
        String strM40038n;
        try {
            String strM40038n2 = ViewOnClickListenerC10404u0.m40038n(cursor, "suggest_intent_action");
            if (strM40038n2 == null) {
                strM40038n2 = this.f1482d0.getSuggestIntentAction();
            }
            if (strM40038n2 == null) {
                strM40038n2 = "android.intent.action.SEARCH";
            }
            String str2 = strM40038n2;
            String strM40038n3 = ViewOnClickListenerC10404u0.m40038n(cursor, "suggest_intent_data");
            if (strM40038n3 == null) {
                strM40038n3 = this.f1482d0.getSuggestIntentData();
            }
            if (strM40038n3 != null && (strM40038n = ViewOnClickListenerC10404u0.m40038n(cursor, "suggest_intent_data_id")) != null) {
                strM40038n3 = strM40038n3 + "/" + Uri.encode(strM40038n);
            }
            return m1815A(str2, strM40038n3 == null ? null : Uri.parse(strM40038n3), ViewOnClickListenerC10404u0.m40038n(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC10404u0.m40038n(cursor, "suggest_intent_query"), i10, str);
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

    /* JADX INFO: renamed from: C */
    public final Intent m1817C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1483e0;
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

    /* JADX INFO: renamed from: D */
    public final Intent m1818D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* JADX INFO: renamed from: E */
    public final void m1819E() {
        this.f1493p.dismissDropDown();
    }

    /* JADX INFO: renamed from: F */
    public void m1820F() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0464k.m1857a(this.f1493p);
            return;
        }
        C0468o c0468o = f1455o0;
        c0468o.m1863b(this.f1493p);
        c0468o.m1862a(this.f1493p);
    }

    /* JADX INFO: renamed from: G */
    public final void m1821G(View view, Rect rect) {
        view.getLocationInWindow(this.f1457B);
        getLocationInWindow(this.f1458C);
        int[] iArr = this.f1457B;
        int i10 = iArr[1];
        int[] iArr2 = this.f1458C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m1822H(CharSequence charSequence) {
        if (!this.f1469N || this.f1460E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1493p.getTextSize()) * 1.25d);
        this.f1460E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1460E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1823I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1482d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f1482d0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1463H;
            } else {
                intent = this.f1482d0.getVoiceSearchLaunchRecognizer() ? this.f1464I : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m1824J() {
        return this.f1470O;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1825L() {
        return (this.f1472Q || this.f1477V) && !m1824J();
    }

    /* JADX INFO: renamed from: M */
    public final void m1826M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m1827N(int i10, String str, String str2) {
        getContext().startActivity(m1815A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1828O(int i10, int i11, String str) {
        Cursor cursorMo39096c = this.f1471P.mo39096c();
        if (cursorMo39096c == null || !cursorMo39096c.moveToPosition(i10)) {
            return false;
        }
        m1826M(m1816B(cursorMo39096c, i11, str));
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m1829P() {
        if (!TextUtils.isEmpty(this.f1493p.getText())) {
            this.f1493p.setText("");
            this.f1493p.requestFocus();
            this.f1493p.setImeVisibility(true);
        } else if (this.f1469N) {
            clearFocus();
            m1848i0(true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m1830Q(int i10, int i11, String str) {
        m1828O(i10, 0, null);
        this.f1493p.setImeVisibility(false);
        m1819E();
        return true;
    }

    /* JADX INFO: renamed from: R */
    public boolean m1831R(int i10) {
        m1840a0(i10);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m1832S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: T */
    public void m1833T() {
        m1848i0(false);
        this.f1493p.requestFocus();
        this.f1493p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1468M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m1834U() {
        Editable text = this.f1493p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0466m interfaceC0466m = this.f1466K;
        if (interfaceC0466m == null || !interfaceC0466m.mo1860b(text.toString())) {
            if (this.f1482d0 != null) {
                m1827N(0, null, text.toString());
            }
            this.f1493p.setImeVisibility(false);
            m1819E();
        }
    }

    /* JADX INFO: renamed from: V */
    public boolean m1835V(View view, int i10, KeyEvent keyEvent) {
        if (this.f1482d0 != null && this.f1471P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return m1830Q(this.f1493p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1493p.setSelection(i10 == 21 ? 0 : this.f1493p.length());
                this.f1493p.setListSelection(0);
                this.f1493p.clearListSelection();
                this.f1493p.m1854b();
                return true;
            }
            if (i10 == 19) {
                this.f1493p.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public void m1836W(CharSequence charSequence) {
        Editable text = this.f1493p.getText();
        this.f1479a0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        m1847h0(!zIsEmpty);
        m1849j0(zIsEmpty);
        m1842c0();
        m1846g0();
        if (this.f1466K != null && !TextUtils.equals(charSequence, this.f1478W)) {
            this.f1466K.mo1859a(charSequence.toString());
        }
        this.f1478W = charSequence.toString();
    }

    /* JADX INFO: renamed from: X */
    public void m1837X() {
        m1848i0(m1824J());
        m1839Z();
        if (this.f1493p.hasFocus()) {
            m1820F();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m1838Y() {
        SearchableInfo searchableInfo = this.f1482d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m1818D(this.f1463H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m1817C(this.f1464I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m1839Z() {
        post(this.f1484f0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1840a0(int i10) {
        Editable text = this.f1493p.getText();
        Cursor cursorMo39096c = this.f1471P.mo39096c();
        if (cursorMo39096c == null) {
            return;
        }
        if (!cursorMo39096c.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f1471P.convertToString(cursorMo39096c);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m1841b0(CharSequence charSequence, boolean z10) {
        this.f1493p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1493p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1479a0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m1834U();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1842c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1493p.getText());
        this.f1499v.setVisibility(!zIsEmpty || (this.f1469N && !this.f1480b0) ? 0 : 8);
        Drawable drawable = this.f1499v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1475T = true;
        super.clearFocus();
        this.f1493p.clearFocus();
        this.f1493p.setImeVisibility(false);
        this.f1475T = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m1843d0() {
        int[] iArr = this.f1493p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1495r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1496s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1844e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1493p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1822H(queryHint));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1845f0() {
        this.f1493p.setThreshold(this.f1482d0.getSuggestThreshold());
        this.f1493p.setImeOptions(this.f1482d0.getImeOptions());
        int inputType = this.f1482d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1482d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f1493p.setInputType(inputType);
        AbstractC10154a abstractC10154a = this.f1471P;
        if (abstractC10154a != null) {
            abstractC10154a.mo39095a(null);
        }
        if (this.f1482d0.getSuggestAuthority() != null) {
            ViewOnClickListenerC10404u0 viewOnClickListenerC10404u0 = new ViewOnClickListenerC10404u0(getContext(), this, this.f1482d0, this.f1486h0);
            this.f1471P = viewOnClickListenerC10404u0;
            this.f1493p.setAdapter(viewOnClickListenerC10404u0);
            ((ViewOnClickListenerC10404u0) this.f1471P).m40052w(this.f1474S ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1846g0() {
        this.f1496s.setVisibility((m1825L() && (this.f1498u.getVisibility() == 0 || this.f1500w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f1493p.getImeOptions();
    }

    public int getInputType() {
        return this.f1493p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1476U;
    }

    public CharSequence getQuery() {
        return this.f1493p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1473R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1482d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1465J : getContext().getText(this.f1482d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1462G;
    }

    public int getSuggestionRowLayout() {
        return this.f1461F;
    }

    public AbstractC10154a getSuggestionsAdapter() {
        return this.f1471P;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1847h0(boolean z10) {
        this.f1498u.setVisibility((this.f1472Q && m1825L() && hasFocus() && (z10 || !this.f1477V)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1848i0(boolean z10) {
        this.f1470O = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1493p.getText());
        this.f1497t.setVisibility(i11);
        m1847h0(!zIsEmpty);
        this.f1494q.setVisibility(z10 ? 8 : 0);
        if (this.f1459D.getDrawable() != null && !this.f1469N) {
            i10 = 0;
        }
        this.f1459D.setVisibility(i10);
        m1842c0();
        m1849j0(zIsEmpty);
        m1846g0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1849j0(boolean z10) {
        int i10 = 8;
        if (this.f1477V && !m1824J() && z10) {
            this.f1498u.setVisibility(8);
            i10 = 0;
        }
        this.f1500w.setVisibility(i10);
    }

    @Override // p316o.InterfaceC9610c
    public void onActionViewCollapsed() {
        m1841b0("", false);
        clearFocus();
        m1848i0(true);
        this.f1493p.setImeOptions(this.f1481c0);
        this.f1480b0 = false;
    }

    @Override // p316o.InterfaceC9610c
    public void onActionViewExpanded() {
        if (this.f1480b0) {
            return;
        }
        this.f1480b0 = true;
        int imeOptions = this.f1493p.getImeOptions();
        this.f1481c0 = imeOptions;
        this.f1493p.setImeOptions(imeOptions | 33554432);
        this.f1493p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1484f0);
        post(this.f1485g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m1821G(this.f1493p, this.f1503z);
            Rect rect = this.f1456A;
            Rect rect2 = this.f1503z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            C0469p c0469p = this.f1502y;
            if (c0469p != null) {
                c0469p.m1865a(this.f1456A, this.f1503z);
                return;
            }
            C0469p c0469p2 = new C0469p(this.f1456A, this.f1503z, this.f1493p);
            this.f1502y = c0469p2;
            setTouchDelegate(c0469p2);
        }
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (m1824J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f1476U;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1476U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f1476U) > 0) {
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
        super.onRestoreInstanceState(savedState.m3321a());
        m1848i0(savedState.f1504c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1504c = m1824J();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m1839Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1475T || !isFocusable()) {
            return false;
        }
        if (m1824J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1493p.requestFocus(i10, rect);
        if (zRequestFocus) {
            m1848i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1483e0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m1829P();
        } else {
            m1833T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1469N == z10) {
            return;
        }
        this.f1469N = z10;
        m1848i0(z10);
        m1844e0();
    }

    public void setImeOptions(int i10) {
        this.f1493p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1493p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1476U = i10;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0465l interfaceC0465l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1467L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0466m interfaceC0466m) {
        this.f1466K = interfaceC0466m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1468M = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0467n interfaceC0467n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1473R = charSequence;
        m1844e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1474S = z10;
        AbstractC10154a abstractC10154a = this.f1471P;
        if (abstractC10154a instanceof ViewOnClickListenerC10404u0) {
            ((ViewOnClickListenerC10404u0) abstractC10154a).m40052w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1482d0 = searchableInfo;
        if (searchableInfo != null) {
            m1845f0();
            m1844e0();
        }
        boolean zM1823I = m1823I();
        this.f1477V = zM1823I;
        if (zM1823I) {
            this.f1493p.setPrivateImeOptions("nm");
        }
        m1848i0(m1824J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1472Q = z10;
        m1848i0(m1824J());
    }

    public void setSuggestionsAdapter(AbstractC10154a abstractC10154a) {
        this.f1471P = abstractC10154a;
        this.f1493p.setAdapter(abstractC10154a);
    }

    /* JADX INFO: renamed from: z */
    public void m1850z() {
        if (this.f1501x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1495r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM39840b = C10375g1.m39840b(this);
            int dimensionPixelSize = this.f1469N ? resources.getDimensionPixelSize(C6592d.f25061e) + resources.getDimensionPixelSize(C6592d.f25062f) : 0;
            this.f1493p.getDropDownBackground().getPadding(rect);
            this.f1493p.setDropDownHorizontalOffset(zM39840b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1493p.setDropDownWidth((((this.f1501x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25015K);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1503z = new Rect();
        this.f1456A = new Rect();
        this.f1457B = new int[2];
        this.f1458C = new int[2];
        this.f1484f0 = new RunnableC0455b();
        this.f1485g0 = new RunnableC0456c();
        this.f1486h0 = new WeakHashMap<>();
        ViewOnClickListenerC0459f viewOnClickListenerC0459f = new ViewOnClickListenerC0459f();
        this.f1487i0 = viewOnClickListenerC0459f;
        this.f1488j0 = new ViewOnKeyListenerC0460g();
        C0461h c0461h = new C0461h();
        this.f1489k0 = c0461h;
        C0462i c0462i = new C0462i();
        this.f1490l0 = c0462i;
        C0463j c0463j = new C0463j();
        this.f1491m0 = c0463j;
        this.f1492n0 = new C0454a();
        int[] iArr = C6598j.f25364h2;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        LayoutInflater.from(context).inflate(c10357a1M39728v.m39742n(C6598j.f25414r2, C6595g.f25179t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C6594f.f25121I);
        this.f1493p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1494q = findViewById(C6594f.f25117E);
        View viewFindViewById = findViewById(C6594f.f25120H);
        this.f1495r = viewFindViewById;
        View viewFindViewById2 = findViewById(C6594f.f25127O);
        this.f1496s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C6594f.f25115C);
        this.f1497t = imageView;
        ImageView imageView2 = (ImageView) findViewById(C6594f.f25118F);
        this.f1498u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C6594f.f25116D);
        this.f1499v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C6594f.f25122J);
        this.f1500w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C6594f.f25119G);
        this.f1459D = imageView5;
        C0625o0.m3048q0(viewFindViewById, c10357a1M39728v.m39735g(C6598j.f25419s2));
        C0625o0.m3048q0(viewFindViewById2, c10357a1M39728v.m39735g(C6598j.f25439w2));
        int i11 = C6598j.f25434v2;
        imageView.setImageDrawable(c10357a1M39728v.m39735g(i11));
        imageView2.setImageDrawable(c10357a1M39728v.m39735g(C6598j.f25404p2));
        imageView3.setImageDrawable(c10357a1M39728v.m39735g(C6598j.f25389m2));
        imageView4.setImageDrawable(c10357a1M39728v.m39735g(C6598j.f25449y2));
        imageView5.setImageDrawable(c10357a1M39728v.m39735g(i11));
        this.f1460E = c10357a1M39728v.m39735g(C6598j.f25429u2);
        C10369e1.m39834a(imageView, getResources().getString(C6596h.f25196p));
        this.f1461F = c10357a1M39728v.m39742n(C6598j.f25444x2, C6595g.f25178s);
        this.f1462G = c10357a1M39728v.m39742n(C6598j.f25394n2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0459f);
        imageView3.setOnClickListener(viewOnClickListenerC0459f);
        imageView2.setOnClickListener(viewOnClickListenerC0459f);
        imageView4.setOnClickListener(viewOnClickListenerC0459f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0459f);
        searchAutoComplete.addTextChangedListener(this.f1492n0);
        searchAutoComplete.setOnEditorActionListener(c0461h);
        searchAutoComplete.setOnItemClickListener(c0462i);
        searchAutoComplete.setOnItemSelectedListener(c0463j);
        searchAutoComplete.setOnKeyListener(this.f1488j0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0457d());
        setIconifiedByDefault(c10357a1M39728v.m39729a(C6598j.f25409q2, true));
        int iM39734f = c10357a1M39728v.m39734f(C6598j.f25374j2, -1);
        if (iM39734f != -1) {
            setMaxWidth(iM39734f);
        }
        this.f1465J = c10357a1M39728v.m39744p(C6598j.f25399o2);
        this.f1473R = c10357a1M39728v.m39744p(C6598j.f25424t2);
        int iM39739k = c10357a1M39728v.m39739k(C6598j.f25384l2, -1);
        if (iM39739k != -1) {
            setImeOptions(iM39739k);
        }
        int iM39739k2 = c10357a1M39728v.m39739k(C6598j.f25379k2, -1);
        if (iM39739k2 != -1) {
            setInputType(iM39739k2);
        }
        setFocusable(c10357a1M39728v.m39729a(C6598j.f25369i2, true));
        c10357a1M39728v.m39749x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1463H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1464I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1501x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0458e());
        }
        m1848i0(this.f1469N);
        m1844e0();
    }
}
