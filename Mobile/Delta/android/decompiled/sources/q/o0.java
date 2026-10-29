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
    public Context f29047a;
    public ListAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f29048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f29061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f29063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f29064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f29065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f29066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f29067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f29068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f29069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f29070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f29071z;

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
            if (i10 == -1 || (l0Var = o0.this.f29048c) == null) {
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
            o0Var.B.removeCallbacks(o0Var.f29068w);
            o0.this.f29068w.run();
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
                o0Var.B.postDelayed(o0Var.f29068w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            o0 o0Var2 = o0.this;
            o0Var2.B.removeCallbacks(o0Var2.f29068w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0Var = o0.this.f29048c;
            if (l0Var == null || !l0Var.isAttachedToWindow() || o0.this.f29048c.getCount() <= o0.this.f29048c.getChildCount()) {
                return;
            }
            int childCount = o0.this.f29048c.getChildCount();
            o0 o0Var = o0.this;
            if (childCount <= o0Var.f29060o) {
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
        View view = this.f29061p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f29061p);
            }
        }
    }

    public void C(View view) {
        this.f29064s = view;
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
        this.f29050e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f29057l = i10;
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
        this.f29066u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f29067v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f29056k = true;
        this.f29055j = z10;
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
        this.f29062q = i10;
    }

    public void P(int i10) {
        l0 l0Var = this.f29048c;
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
        this.f29050e = i10;
    }

    @Override // p.f
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f29051f;
    }

    @Override // p.f
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f29048c = null;
        this.B.removeCallbacks(this.f29068w);
    }

    public void e(int i10) {
        this.f29051f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f29052g = i10;
        this.f29054i = true;
    }

    public int l() {
        if (this.f29054i) {
            return this.f29052g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f29063r;
        if (dataSetObserver == null) {
            this.f29063r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f29063r);
        }
        l0 l0Var = this.f29048c;
        if (l0Var != null) {
            l0Var.setAdapter(this.b);
        }
    }

    @Override // p.f
    public ListView o() {
        return this.f29048c;
    }

    public final int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f29048c == null) {
            Context context = this.f29047a;
            this.A = new a();
            l0 l0VarR = r(context, !this.E);
            this.f29048c = l0VarR;
            Drawable drawable = this.f29065t;
            if (drawable != null) {
                l0VarR.setSelector(drawable);
            }
            this.f29048c.setAdapter(this.b);
            this.f29048c.setOnItemClickListener(this.f29066u);
            this.f29048c.setFocusable(true);
            this.f29048c.setFocusableInTouchMode(true);
            this.f29048c.setOnItemSelectedListener(new b());
            this.f29048c.setOnScrollListener(this.f29070y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f29067v;
            if (onItemSelectedListener != null) {
                this.f29048c.setOnItemSelectedListener(onItemSelectedListener);
            }
            l0 l0Var = this.f29048c;
            View view2 = this.f29061p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f29062q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(l0Var, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f29062q);
                } else {
                    linearLayout.addView(l0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f29050e;
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
            View view3 = this.f29061p;
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
            if (!this.f29054i) {
                this.f29052g = -i14;
            }
        } else {
            this.C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f29052g, this.F.getInputMethodMode() == 2);
        if (this.f29058m || this.f29049d == -1) {
            return iT + i10;
        }
        int i15 = this.f29050e;
        if (i15 == -2) {
            int i16 = this.f29047a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f29047a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f29048c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f29048c.getPaddingTop() + this.f29048c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void q() {
        l0 l0Var = this.f29048c;
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
        return this.f29064s;
    }

    @Override // p.f
    public void show() {
        int iP = p();
        boolean z10 = z();
        d3.h.b(this.F, this.f29053h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f29050e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f29049d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f29050e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f29050e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.F.setOutsideTouchable((this.f29059n || this.f29058m) ? false : true);
                this.F.update(s(), this.f29051f, this.f29052g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f29050e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f29049d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f29059n || this.f29058m) ? false : true);
        this.F.setTouchInterceptor(this.f29069x);
        if (this.f29056k) {
            d3.h.a(this.F, this.f29055j);
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
        d3.h.c(this.F, s(), this.f29051f, this.f29052g, this.f29057l);
        this.f29048c.setSelection(-1);
        if (!this.E || this.f29048c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f29071z);
    }

    public final int t(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    public Object u() {
        if (a()) {
            return this.f29048c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f29048c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f29048c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f29048c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f29050e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public o0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f29049d = -2;
        this.f29050e = -2;
        this.f29053h = 1002;
        this.f29057l = 0;
        this.f29058m = false;
        this.f29059n = false;
        this.f29060o = Integer.MAX_VALUE;
        this.f29062q = 0;
        this.f29068w = new i();
        this.f29069x = new h();
        this.f29070y = new g();
        this.f29071z = new e();
        this.C = new Rect();
        this.f29047a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f20084n1, i10, i11);
        this.f29051f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f20089o1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f20094p1, 0);
        this.f29052g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f29054i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.F = sVar;
        sVar.setInputMethodMode(1);
    }
}
