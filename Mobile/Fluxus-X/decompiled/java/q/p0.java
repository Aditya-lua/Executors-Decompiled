package q;

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
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class p0 implements p.f {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29591a;
    public ListAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f29592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f29605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f29607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f29608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f29609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f29610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f29611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f29612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f29613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f29614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f29615z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = p0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            p0.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            m0 m0Var;
            if (i10 == -1 || (m0Var = p0.this.f29592c) == null) {
                return;
            }
            m0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.q();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (p0.this.a()) {
                p0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            p0.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || p0.this.z() || p0.this.F.getContentView() == null) {
                return;
            }
            p0 p0Var = p0.this;
            p0Var.B.removeCallbacks(p0Var.f29612w);
            p0.this.f29612w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x5 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = p0.this.F) != null && popupWindow.isShowing() && x5 >= 0 && x5 < p0.this.F.getWidth() && y10 >= 0 && y10 < p0.this.F.getHeight()) {
                p0 p0Var = p0.this;
                p0Var.B.postDelayed(p0Var.f29612w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            p0 p0Var2 = p0.this;
            p0Var2.B.removeCallbacks(p0Var2.f29612w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0 m0Var = p0.this.f29592c;
            if (m0Var == null || !m0Var.isAttachedToWindow() || p0.this.f29592c.getCount() <= p0.this.f29592c.getChildCount()) {
                return;
            }
            int childCount = p0.this.f29592c.getChildCount();
            p0 p0Var = p0.this;
            if (childCount <= p0Var.f29604o) {
                p0Var.F.setInputMethodMode(2);
                p0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public p0(@NonNull Context context) {
        this(context, null, i.a.G);
    }

    public boolean A() {
        return this.E;
    }

    public final void B() {
        View view = this.f29605p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29605p);
            }
        }
    }

    public void C(View view) {
        this.f29608s = view;
    }

    public void D(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f29594e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f29601l = i10;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f29610u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f29611v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f29600k = true;
        this.f29599j = z10;
    }

    public final void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z10);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void O(int i10) {
        this.f29606q = i10;
    }

    public void P(int i10) {
        m0 m0Var = this.f29592c;
        if (!a() || m0Var == null) {
            return;
        }
        m0Var.setListSelectionHidden(false);
        m0Var.setSelection(i10);
        if (m0Var.getChoiceMode() != 0) {
            m0Var.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f29594e = i10;
    }

    @Override // p.f
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f29595f;
    }

    @Override // p.f
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f29592c = null;
        this.B.removeCallbacks(this.f29612w);
    }

    public void e(int i10) {
        this.f29595f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f29596g = i10;
        this.f29598i = true;
    }

    public int l() {
        if (this.f29598i) {
            return this.f29596g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f29607r;
        if (dataSetObserver == null) {
            this.f29607r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f29607r);
        }
        m0 m0Var = this.f29592c;
        if (m0Var != null) {
            m0Var.setAdapter(this.b);
        }
    }

    @Override // p.f
    public ListView o() {
        return this.f29592c;
    }

    public final int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f29592c == null) {
            Context context = this.f29591a;
            this.A = new a();
            m0 m0VarR = r(context, !this.E);
            this.f29592c = m0VarR;
            Drawable drawable = this.f29609t;
            if (drawable != null) {
                m0VarR.setSelector(drawable);
            }
            this.f29592c.setAdapter(this.b);
            this.f29592c.setOnItemClickListener(this.f29610u);
            this.f29592c.setFocusable(true);
            this.f29592c.setFocusableInTouchMode(true);
            this.f29592c.setOnItemSelectedListener(new b());
            this.f29592c.setOnScrollListener(this.f29614y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f29611v;
            if (onItemSelectedListener != null) {
                this.f29592c.setOnItemSelectedListener(onItemSelectedListener);
            }
            m0 m0Var = this.f29592c;
            View view2 = this.f29605p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f29606q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(m0Var, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f29606q);
                } else {
                    linearLayout.addView(m0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f29594e;
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
                view = m0Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f29605p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f29598i) {
                this.f29596g = -i14;
            }
        } else {
            this.C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f29596g, this.F.getInputMethodMode() == 2);
        if (this.f29602m || this.f29593d == -1) {
            return iT + i10;
        }
        int i15 = this.f29594e;
        if (i15 == -2) {
            int i16 = this.f29591a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f29591a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f29592c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f29592c.getPaddingTop() + this.f29592c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void q() {
        m0 m0Var = this.f29592c;
        if (m0Var != null) {
            m0Var.setListSelectionHidden(true);
            m0Var.requestLayout();
        }
    }

    @NonNull
    public m0 r(Context context, boolean z10) {
        return new m0(context, z10);
    }

    public View s() {
        return this.f29608s;
    }

    @Override // p.f
    public void show() {
        int iP = p();
        boolean z10 = z();
        d3.h.b(this.F, this.f29597h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f29594e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f29593d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f29594e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f29594e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.F.setOutsideTouchable((this.f29603n || this.f29602m) ? false : true);
                this.F.update(s(), this.f29595f, this.f29596g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f29594e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f29593d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f29603n || this.f29602m) ? false : true);
        this.F.setTouchInterceptor(this.f29613x);
        if (this.f29600k) {
            d3.h.a(this.F, this.f29599j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        d3.h.c(this.F, s(), this.f29595f, this.f29596g, this.f29601l);
        this.f29592c.setSelection(-1);
        if (!this.E || this.f29592c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f29615z);
    }

    public final int t(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    public Object u() {
        if (a()) {
            return this.f29592c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f29592c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f29592c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f29592c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f29594e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public p0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public p0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f29593d = -2;
        this.f29594e = -2;
        this.f29597h = 1002;
        this.f29601l = 0;
        this.f29602m = false;
        this.f29603n = false;
        this.f29604o = Integer.MAX_VALUE;
        this.f29606q = 0;
        this.f29612w = new i();
        this.f29613x = new h();
        this.f29614y = new g();
        this.f29615z = new e();
        this.C = new Rect();
        this.f29591a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f18927n1, i10, i11);
        this.f29595f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f18932o1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f18937p1, 0);
        this.f29596g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f29598i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.F = sVar;
        sVar.setInputMethodMode(1);
    }
}
