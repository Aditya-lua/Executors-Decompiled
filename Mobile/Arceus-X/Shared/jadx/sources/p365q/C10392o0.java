package p365q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.reflect.Method;
import p066d3.C4430h;
import p181i.C6589a;
import p181i.C6598j;
import p346p.InterfaceC10082f;

/* JADX INFO: renamed from: q.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C10392o0 implements InterfaceC10082f {

    /* JADX INFO: renamed from: G */
    public static Method f37392G;

    /* JADX INFO: renamed from: H */
    public static Method f37393H;

    /* JADX INFO: renamed from: A */
    public Runnable f37394A;

    /* JADX INFO: renamed from: B */
    public final Handler f37395B;

    /* JADX INFO: renamed from: C */
    public final Rect f37396C;

    /* JADX INFO: renamed from: D */
    public Rect f37397D;

    /* JADX INFO: renamed from: E */
    public boolean f37398E;

    /* JADX INFO: renamed from: F */
    public PopupWindow f37399F;

    /* JADX INFO: renamed from: a */
    public Context f37400a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f37401b;

    /* JADX INFO: renamed from: c */
    public C10386l0 f37402c;

    /* JADX INFO: renamed from: d */
    public int f37403d;

    /* JADX INFO: renamed from: e */
    public int f37404e;

    /* JADX INFO: renamed from: f */
    public int f37405f;

    /* JADX INFO: renamed from: g */
    public int f37406g;

    /* JADX INFO: renamed from: h */
    public int f37407h;

    /* JADX INFO: renamed from: i */
    public boolean f37408i;

    /* JADX INFO: renamed from: j */
    public boolean f37409j;

    /* JADX INFO: renamed from: k */
    public boolean f37410k;

    /* JADX INFO: renamed from: l */
    public int f37411l;

    /* JADX INFO: renamed from: m */
    public boolean f37412m;

    /* JADX INFO: renamed from: n */
    public boolean f37413n;

    /* JADX INFO: renamed from: o */
    public int f37414o;

    /* JADX INFO: renamed from: p */
    public View f37415p;

    /* JADX INFO: renamed from: q */
    public int f37416q;

    /* JADX INFO: renamed from: r */
    public DataSetObserver f37417r;

    /* JADX INFO: renamed from: s */
    public View f37418s;

    /* JADX INFO: renamed from: t */
    public Drawable f37419t;

    /* JADX INFO: renamed from: u */
    public AdapterView.OnItemClickListener f37420u;

    /* JADX INFO: renamed from: v */
    public AdapterView.OnItemSelectedListener f37421v;

    /* JADX INFO: renamed from: w */
    public final i f37422w;

    /* JADX INFO: renamed from: x */
    public final h f37423x;

    /* JADX INFO: renamed from: y */
    public final g f37424y;

    /* JADX INFO: renamed from: z */
    public final e f37425z;

    /* JADX INFO: renamed from: q.o0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM39964s = C10392o0.this.m39964s();
            if (viewM39964s == null || viewM39964s.getWindowToken() == null) {
                return;
            }
            C10392o0.this.show();
        }
    }

    /* JADX INFO: renamed from: q.o0$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            C10386l0 c10386l0;
            if (i10 == -1 || (c10386l0 = C10392o0.this.f37402c) == null) {
                return;
            }
            c10386l0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: q.o0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m39972a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: renamed from: q.o0$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static void m39973a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* JADX INFO: renamed from: b */
        public static void m39974b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: renamed from: q.o0$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10392o0.this.m39962q();
        }
    }

    /* JADX INFO: renamed from: q.o0$f */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C10392o0.this.mo1574a()) {
                C10392o0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C10392o0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: q.o0$g */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || C10392o0.this.m39971z() || C10392o0.this.f37399F.getContentView() == null) {
                return;
            }
            C10392o0 c10392o0 = C10392o0.this;
            c10392o0.f37395B.removeCallbacks(c10392o0.f37422w);
            C10392o0.this.f37422w.run();
        }
    }

    /* JADX INFO: renamed from: q.o0$h */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C10392o0.this.f37399F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < C10392o0.this.f37399F.getWidth() && y10 >= 0 && y10 < C10392o0.this.f37399F.getHeight()) {
                C10392o0 c10392o0 = C10392o0.this;
                c10392o0.f37395B.postDelayed(c10392o0.f37422w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C10392o0 c10392o1 = C10392o0.this;
            c10392o1.f37395B.removeCallbacks(c10392o1.f37422w);
            return false;
        }
    }

    /* JADX INFO: renamed from: q.o0$i */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10386l0 c10386l0 = C10392o0.this.f37402c;
            if (c10386l0 == null || !c10386l0.isAttachedToWindow() || C10392o0.this.f37402c.getCount() <= C10392o0.this.f37402c.getChildCount()) {
                return;
            }
            int childCount = C10392o0.this.f37402c.getChildCount();
            C10392o0 c10392o0 = C10392o0.this;
            if (childCount <= c10392o0.f37414o) {
                c10392o0.f37399F.setInputMethodMode(2);
                C10392o0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f37392G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f37393H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10392o0(@NonNull Context context) {
        this(context, null, C6589a.f25011G);
    }

    /* JADX INFO: renamed from: A */
    public boolean m39938A() {
        return this.f37398E;
    }

    /* JADX INFO: renamed from: B */
    public final void m39939B() {
        View view = this.f37415p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f37415p);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m39940C(View view) {
        this.f37418s = view;
    }

    /* JADX INFO: renamed from: D */
    public void m39941D(int i10) {
        this.f37399F.setAnimationStyle(i10);
    }

    /* JADX INFO: renamed from: E */
    public void m39942E(int i10) {
        Drawable background = this.f37399F.getBackground();
        if (background == null) {
            m39954Q(i10);
            return;
        }
        background.getPadding(this.f37396C);
        Rect rect = this.f37396C;
        this.f37404e = rect.left + rect.right + i10;
    }

    /* JADX INFO: renamed from: F */
    public void m39943F(int i10) {
        this.f37411l = i10;
    }

    /* JADX INFO: renamed from: G */
    public void m39944G(Rect rect) {
        this.f37397D = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: H */
    public void m39945H(int i10) {
        this.f37399F.setInputMethodMode(i10);
    }

    /* JADX INFO: renamed from: I */
    public void m39946I(boolean z10) {
        this.f37398E = z10;
        this.f37399F.setFocusable(z10);
    }

    /* JADX INFO: renamed from: J */
    public void m39947J(PopupWindow.OnDismissListener onDismissListener) {
        this.f37399F.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: K */
    public void m39948K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f37420u = onItemClickListener;
    }

    /* JADX INFO: renamed from: L */
    public void m39949L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f37421v = onItemSelectedListener;
    }

    /* JADX INFO: renamed from: M */
    public void m39950M(boolean z10) {
        this.f37410k = true;
        this.f37409j = z10;
    }

    /* JADX INFO: renamed from: N */
    public final void m39951N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m39974b(this.f37399F, z10);
            return;
        }
        Method method = f37392G;
        if (method != null) {
            try {
                method.invoke(this.f37399F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m39952O(int i10) {
        this.f37416q = i10;
    }

    /* JADX INFO: renamed from: P */
    public void m39953P(int i10) {
        C10386l0 c10386l0 = this.f37402c;
        if (!mo1574a() || c10386l0 == null) {
            return;
        }
        c10386l0.setListSelectionHidden(false);
        c10386l0.setSelection(i10);
        if (c10386l0.getChoiceMode() != 0) {
            c10386l0.setItemChecked(i10, true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m39954Q(int i10) {
        this.f37404e = i10;
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: a */
    public boolean mo1574a() {
        return this.f37399F.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public void m39955b(Drawable drawable) {
        this.f37399F.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: c */
    public int m39956c() {
        return this.f37405f;
    }

    @Override // p346p.InterfaceC10082f
    public void dismiss() {
        this.f37399F.dismiss();
        m39939B();
        this.f37399F.setContentView(null);
        this.f37402c = null;
        this.f37395B.removeCallbacks(this.f37422w);
    }

    /* JADX INFO: renamed from: e */
    public void m39957e(int i10) {
        this.f37405f = i10;
    }

    /* JADX INFO: renamed from: g */
    public Drawable m39958g() {
        return this.f37399F.getBackground();
    }

    /* JADX INFO: renamed from: i */
    public void m39959i(int i10) {
        this.f37406g = i10;
        this.f37408i = true;
    }

    /* JADX INFO: renamed from: l */
    public int m39960l() {
        if (this.f37408i) {
            return this.f37406g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public void mo1805m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f37417r;
        if (dataSetObserver == null) {
            this.f37417r = new f();
        } else {
            ListAdapter listAdapter2 = this.f37401b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f37401b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f37417r);
        }
        C10386l0 c10386l0 = this.f37402c;
        if (c10386l0 != null) {
            c10386l0.setAdapter(this.f37401b);
        }
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: o */
    public ListView mo1579o() {
        return this.f37402c;
    }

    /* JADX INFO: renamed from: p */
    public final int m39961p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f37402c == null) {
            Context context = this.f37400a;
            this.f37394A = new a();
            C10386l0 c10386l0Mo39963r = mo39963r(context, !this.f37398E);
            this.f37402c = c10386l0Mo39963r;
            Drawable drawable = this.f37419t;
            if (drawable != null) {
                c10386l0Mo39963r.setSelector(drawable);
            }
            this.f37402c.setAdapter(this.f37401b);
            this.f37402c.setOnItemClickListener(this.f37420u);
            this.f37402c.setFocusable(true);
            this.f37402c.setFocusableInTouchMode(true);
            this.f37402c.setOnItemSelectedListener(new b());
            this.f37402c.setOnScrollListener(this.f37424y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f37421v;
            if (onItemSelectedListener != null) {
                this.f37402c.setOnItemSelectedListener(onItemSelectedListener);
            }
            C10386l0 c10386l0 = this.f37402c;
            View view2 = this.f37415p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f37416q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c10386l0, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f37416q);
                } else {
                    linearLayout.addView(c10386l0, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f37404e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c10386l0;
            }
            this.f37399F.setContentView(view);
        } else {
            View view3 = this.f37415p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f37399F.getBackground();
        if (background != null) {
            background.getPadding(this.f37396C);
            Rect rect = this.f37396C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f37408i) {
                this.f37406g = -i14;
            }
        } else {
            this.f37396C.setEmpty();
            i10 = 0;
        }
        int iM39965t = m39965t(m39964s(), this.f37406g, this.f37399F.getInputMethodMode() == 2);
        if (this.f37412m || this.f37403d == -1) {
            return iM39965t + i10;
        }
        int i15 = this.f37404e;
        if (i15 == -2) {
            int i16 = this.f37400a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f37396C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f37400a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f37396C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo39898d = this.f37402c.mo39898d(iMakeMeasureSpec, 0, -1, iM39965t - measuredHeight, -1);
        if (iMo39898d > 0) {
            measuredHeight += i10 + this.f37402c.getPaddingTop() + this.f37402c.getPaddingBottom();
        }
        return iMo39898d + measuredHeight;
    }

    /* JADX INFO: renamed from: q */
    public void m39962q() {
        C10386l0 c10386l0 = this.f37402c;
        if (c10386l0 != null) {
            c10386l0.setListSelectionHidden(true);
            c10386l0.requestLayout();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public C10386l0 mo39963r(Context context, boolean z10) {
        return new C10386l0(context, z10);
    }

    /* JADX INFO: renamed from: s */
    public View m39964s() {
        return this.f37418s;
    }

    @Override // p346p.InterfaceC10082f
    public void show() {
        int iM39961p = m39961p();
        boolean zM39971z = m39971z();
        C4430h.m22290b(this.f37399F, this.f37407h);
        if (this.f37399F.isShowing()) {
            if (m39964s().isAttachedToWindow()) {
                int width = this.f37404e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m39964s().getWidth();
                }
                int i10 = this.f37403d;
                if (i10 == -1) {
                    if (!zM39971z) {
                        iM39961p = -1;
                    }
                    if (zM39971z) {
                        this.f37399F.setWidth(this.f37404e == -1 ? -1 : 0);
                        this.f37399F.setHeight(0);
                    } else {
                        this.f37399F.setWidth(this.f37404e == -1 ? -1 : 0);
                        this.f37399F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iM39961p = i10;
                }
                this.f37399F.setOutsideTouchable((this.f37413n || this.f37412m) ? false : true);
                this.f37399F.update(m39964s(), this.f37405f, this.f37406g, width < 0 ? -1 : width, iM39961p < 0 ? -1 : iM39961p);
                return;
            }
            return;
        }
        int width2 = this.f37404e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m39964s().getWidth();
        }
        int i11 = this.f37403d;
        if (i11 == -1) {
            iM39961p = -1;
        } else if (i11 != -2) {
            iM39961p = i11;
        }
        this.f37399F.setWidth(width2);
        this.f37399F.setHeight(iM39961p);
        m39951N(true);
        this.f37399F.setOutsideTouchable((this.f37413n || this.f37412m) ? false : true);
        this.f37399F.setTouchInterceptor(this.f37423x);
        if (this.f37410k) {
            C4430h.m22289a(this.f37399F, this.f37409j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f37393H;
            if (method != null) {
                try {
                    method.invoke(this.f37399F, this.f37397D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.m39973a(this.f37399F, this.f37397D);
        }
        C4430h.m22291c(this.f37399F, m39964s(), this.f37405f, this.f37406g, this.f37411l);
        this.f37402c.setSelection(-1);
        if (!this.f37398E || this.f37402c.isInTouchMode()) {
            m39962q();
        }
        if (this.f37398E) {
            return;
        }
        this.f37395B.post(this.f37425z);
    }

    /* JADX INFO: renamed from: t */
    public final int m39965t(View view, int i10, boolean z10) {
        return c.m39972a(this.f37399F, view, i10, z10);
    }

    /* JADX INFO: renamed from: u */
    public Object m39966u() {
        if (mo1574a()) {
            return this.f37402c.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public long m39967v() {
        if (mo1574a()) {
            return this.f37402c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: w */
    public int m39968w() {
        if (mo1574a()) {
            return this.f37402c.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public View m39969x() {
        if (mo1574a()) {
            return this.f37402c.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public int m39970y() {
        return this.f37404e;
    }

    /* JADX INFO: renamed from: z */
    public boolean m39971z() {
        return this.f37399F.getInputMethodMode() == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10392o0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C10392o0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f37403d = -2;
        this.f37404e = -2;
        this.f37407h = PointerIconCompat.TYPE_HAND;
        this.f37411l = 0;
        this.f37412m = false;
        this.f37413n = false;
        this.f37414o = Integer.MAX_VALUE;
        this.f37416q = 0;
        this.f37422w = new i();
        this.f37423x = new h();
        this.f37424y = new g();
        this.f37425z = new e();
        this.f37396C = new Rect();
        this.f37400a = context;
        this.f37395B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25393n1, i10, i11);
        this.f37405f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6598j.f25398o1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6598j.f25403p1, 0);
        this.f37406g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f37408i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C10399s c10399s = new C10399s(context, attributeSet, i10, i11);
        this.f37399F = c10399s;
        c10399s.setInputMethodMode(1);
    }
}
