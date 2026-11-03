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
public class o0 implements p.f {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29400a;
    public ListAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f29401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f29414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f29416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f29417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f29418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f29419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f29420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f29421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f29422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f29423y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f29424z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = o0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            o0.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            l0 l0Var;
            if (i10 == -1 || (l0Var = o0.this.f29401c) == null) {
                return;
            }
            l0Var.setListSelectionHidden(false);
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
            o0.this.q();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (o0.this.a()) {
                o0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            o0.this.dismiss();
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
            if (i10 != 1 || o0.this.z() || o0.this.F.getContentView() == null) {
                return;
            }
            o0 o0Var = o0.this;
            o0Var.B.removeCallbacks(o0Var.f29421w);
            o0.this.f29421w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = o0.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < o0.this.F.getWidth() && y10 >= 0 && y10 < o0.this.F.getHeight()) {
                o0 o0Var = o0.this;
                o0Var.B.postDelayed(o0Var.f29421w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            o0 o0Var2 = o0.this;
            o0Var2.B.removeCallbacks(o0Var2.f29421w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0Var = o0.this.f29401c;
            if (l0Var == null || !l0Var.isAttachedToWindow() || o0.this.f29401c.getCount() <= o0.this.f29401c.getChildCount()) {
                return;
            }
            int childCount = o0.this.f29401c.getChildCount();
            o0 o0Var = o0.this;
            if (childCount <= o0Var.f29413o) {
                o0Var.F.setInputMethodMode(2);
                o0.this.show();
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

    public o0(@NonNull Context context) {
        this(context, null, i.a.G);
    }

    public boolean A() {
        return this.E;
    }

    public final void B() {
        View view = this.f29414p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29414p);
            }
        }
    }

    public void C(View view) {
        this.f29417s = view;
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
        this.f29403e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f29410l = i10;
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
        this.f29419u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f29420v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f29409k = true;
        this.f29408j = z10;
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
        this.f29415q = i10;
    }

    public void P(int i10) {
        l0 l0Var = this.f29401c;
        if (!a() || l0Var == null) {
            return;
        }
        l0Var.setListSelectionHidden(false);
        l0Var.setSelection(i10);
        if (l0Var.getChoiceMode() != 0) {
            l0Var.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f29403e = i10;
    }

    @Override // p.f
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f29404f;
    }

    @Override // p.f
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f29401c = null;
        this.B.removeCallbacks(this.f29421w);
    }

    public void e(int i10) {
        this.f29404f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f29405g = i10;
        this.f29407i = true;
    }

    public int l() {
        if (this.f29407i) {
            return this.f29405g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f29416r;
        if (dataSetObserver == null) {
            this.f29416r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f29416r);
        }
        l0 l0Var = this.f29401c;
        if (l0Var != null) {
            l0Var.setAdapter(this.b);
        }
    }

    @Override // p.f
    public ListView o() {
        return this.f29401c;
    }

    public final int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f29401c == null) {
            Context context = this.f29400a;
            this.A = new a();
            l0 l0VarR = r(context, !this.E);
            this.f29401c = l0VarR;
            Drawable drawable = this.f29418t;
            if (drawable != null) {
                l0VarR.setSelector(drawable);
            }
            this.f29401c.setAdapter(this.b);
            this.f29401c.setOnItemClickListener(this.f29419u);
            this.f29401c.setFocusable(true);
            this.f29401c.setFocusableInTouchMode(true);
            this.f29401c.setOnItemSelectedListener(new b());
            this.f29401c.setOnScrollListener(this.f29423y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f29420v;
            if (onItemSelectedListener != null) {
                this.f29401c.setOnItemSelectedListener(onItemSelectedListener);
            }
            l0 l0Var = this.f29401c;
            View view2 = this.f29414p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f29415q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(l0Var, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f29415q);
                } else {
                    linearLayout.addView(l0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f29403e;
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
                view = l0Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f29414p;
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
            if (!this.f29407i) {
                this.f29405g = -i14;
            }
        } else {
            this.C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f29405g, this.F.getInputMethodMode() == 2);
        if (this.f29411m || this.f29402d == -1) {
            return iT + i10;
        }
        int i15 = this.f29403e;
        if (i15 == -2) {
            int i16 = this.f29400a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f29400a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f29401c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f29401c.getPaddingTop() + this.f29401c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void q() {
        l0 l0Var = this.f29401c;
        if (l0Var != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
    }

    @NonNull
    public l0 r(Context context, boolean z10) {
        return new l0(context, z10);
    }

    public View s() {
        return this.f29417s;
    }

    @Override // p.f
    public void show() {
        int iP = p();
        boolean z10 = z();
        d3.h.b(this.F, this.f29406h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f29403e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f29402d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f29403e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f29403e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.F.setOutsideTouchable((this.f29412n || this.f29411m) ? false : true);
                this.F.update(s(), this.f29404f, this.f29405g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f29403e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f29402d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f29412n || this.f29411m) ? false : true);
        this.F.setTouchInterceptor(this.f29422x);
        if (this.f29409k) {
            d3.h.a(this.F, this.f29408j);
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
        d3.h.c(this.F, s(), this.f29404f, this.f29405g, this.f29410l);
        this.f29401c.setSelection(-1);
        if (!this.E || this.f29401c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f29424z);
    }

    public final int t(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    public Object u() {
        if (a()) {
            return this.f29401c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f29401c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f29401c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f29401c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f29403e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f29402d = -2;
        this.f29403e = -2;
        this.f29406h = 1002;
        this.f29410l = 0;
        this.f29411m = false;
        this.f29412n = false;
        this.f29413o = Integer.MAX_VALUE;
        this.f29415q = 0;
        this.f29421w = new i();
        this.f29422x = new h();
        this.f29423y = new g();
        this.f29424z = new e();
        this.C = new Rect();
        this.f29400a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f20200n1, i10, i11);
        this.f29404f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f20205o1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f20210p1, 0);
        this.f29405g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f29407i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.F = sVar;
        sVar.setInputMethodMode(1);
    }
}
