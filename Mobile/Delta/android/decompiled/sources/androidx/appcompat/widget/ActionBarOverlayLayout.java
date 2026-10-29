package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.i;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import com.google.mlkit.vision.barcode.common.Barcode;
import q.e0;
import q.f0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements e0, v, w {
    public static final int[] G = {i.a.b, R.attr.windowContentOverlay};
    public static final WindowInsetsCompat H = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.of(0, 1, 0, 1)).build();
    public static final Rect I = new Rect();
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final x E;
    public final f F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1024a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f1027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f1035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f1036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f1037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f1040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f1041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f1042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f1043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f1044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f1045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f1046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f1047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OverScroller f1048z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1032j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1032j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1026d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1026d.animate().translationY(-ActionBarOverlayLayout.this.f1026d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f1035m = new Rect();
        this.f1036n = new Rect();
        this.f1037o = new Rect();
        this.f1038p = new Rect();
        this.f1039q = new Rect();
        this.f1040r = new Rect();
        this.f1041s = new Rect();
        this.f1042t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f1043u = windowInsetsCompat;
        this.f1044v = windowInsetsCompat;
        this.f1045w = windowInsetsCompat;
        this.f1046x = windowInsetsCompat;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        w(context);
        this.E = new x(this);
        f fVar = new f(context);
        this.F = fVar;
        addView(fVar);
    }

    public void A() {
        if (this.f1025c == null) {
            this.f1025c = (ContentFrameLayout) findViewById(i.f.b);
            this.f1026d = (ActionBarContainer) findViewById(i.f.f19955c);
            this.f1027e = u(findViewById(i.f.f19954a));
        }
    }

    public final void B() {
        v();
        this.C.run();
    }

    public final boolean C(float f10) {
        this.f1048z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1048z.getFinalY() > this.f1026d.getHeight();
    }

    @Override // q.e0
    public boolean a() {
        A();
        return this.f1027e.a();
    }

    @Override // q.e0
    public boolean b() {
        A();
        return this.f1027e.b();
    }

    @Override // q.e0
    public boolean c() {
        A();
        return this.f1027e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // q.e0
    public void d(Menu menu, i.a aVar) {
        A();
        this.f1027e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f1028f != null) {
            int bottom = this.f1026d.getVisibility() == 0 ? (int) (this.f1026d.getBottom() + this.f1026d.getTranslationY() + 0.5f) : 0;
            this.f1028f.setBounds(0, bottom, getWidth(), this.f1028f.getIntrinsicHeight() + bottom);
            this.f1028f.draw(canvas);
        }
    }

    @Override // q.e0
    public boolean e() {
        A();
        return this.f1027e.e();
    }

    @Override // q.e0
    public void f() {
        A();
        this.f1027e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // q.e0
    public boolean g() {
        A();
        return this.f1027e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1026d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f1027e.getTitle();
    }

    @Override // q.e0
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f1027e.m();
        } else if (i10 == 5) {
            this.f1027e.t();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.v
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.v
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.v
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // q.e0
    public void l() {
        A();
        this.f1027e.o();
    }

    @Override // androidx.core.view.w
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.v
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.v
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        A();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean zQ = q(this.f1026d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        o0.f(this, windowInsetsCompat, this.f1035m);
        Rect rect = this.f1035m;
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f1043u = windowInsetsCompatInset;
        boolean z10 = true;
        if (!this.f1044v.equals(windowInsetsCompatInset)) {
            this.f1044v = this.f1043u;
            zQ = true;
        }
        if (this.f1036n.equals(this.f1035m)) {
            z10 = zQ;
        } else {
            this.f1036n.set(this.f1035m);
        }
        if (z10) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        o0.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f1026d, i10, 0, i11, 0);
        e eVar = (e) this.f1026d.getLayoutParams();
        int iMax = Math.max(0, this.f1026d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1026d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1026d.getMeasuredState());
        boolean z10 = (o0.K(this) & Barcode.FORMAT_QR_CODE) != 0;
        if (z10) {
            measuredHeight = this.f1024a;
            if (this.f1030h && this.f1026d.getTabContainer() != null) {
                measuredHeight += this.f1024a;
            }
        } else {
            measuredHeight = this.f1026d.getVisibility() != 8 ? this.f1026d.getMeasuredHeight() : 0;
        }
        this.f1037o.set(this.f1035m);
        this.f1045w = this.f1043u;
        if (this.f1029g || z10 || !r()) {
            this.f1045w = new WindowInsetsCompat.Builder(this.f1045w).setSystemWindowInsets(Insets.of(this.f1045w.getSystemWindowInsetLeft(), this.f1045w.getSystemWindowInsetTop() + measuredHeight, this.f1045w.getSystemWindowInsetRight(), this.f1045w.getSystemWindowInsetBottom())).build();
        } else {
            Rect rect = this.f1037o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f1045w = this.f1045w.inset(0, measuredHeight, 0, 0);
        }
        q(this.f1025c, this.f1037o, true, true, true, true);
        if (!this.f1046x.equals(this.f1045w)) {
            WindowInsetsCompat windowInsetsCompat = this.f1045w;
            this.f1046x = windowInsetsCompat;
            o0.g(this.f1025c, windowInsetsCompat);
        }
        measureChildWithMargins(this.f1025c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1025c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1025c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1025c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1025c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1031i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f1032j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1033k + i11;
        this.f1033k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.b(view, view2, i10);
        this.f1033k = getActionBarHideOffset();
        v();
        d dVar = this.f1047y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1026d.getVisibility() != 0) {
            return false;
        }
        return this.f1031i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1031i && !this.f1032j) {
            if (this.f1033k <= this.f1026d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f1047y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f1034l ^ i10;
        this.f1034l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & Barcode.FORMAT_QR_CODE) != 0;
        d dVar = this.f1047y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f1047y.a();
            } else {
                this.f1047y.d();
            }
        }
        if ((i11 & Barcode.FORMAT_QR_CODE) == 0 || this.f1047y == null) {
            return;
        }
        o0.j0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.b = i10;
        d dVar = this.f1047y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public final void p() {
        v();
        this.D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final boolean q(@NonNull View view, @NonNull Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    public final boolean r() {
        o0.f(this.F, H, this.f1038p);
        return !this.f1038p.equals(I);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f1026d.setTranslationY(-Math.max(0, Math.min(i10, this.f1026d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1047y = dVar;
        if (getWindowToken() != null) {
            this.f1047y.onWindowVisibilityChanged(this.b);
            int i10 = this.f1034l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                o0.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1030h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1031i) {
            this.f1031i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f1027e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f1027e.q(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1029g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // q.e0
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f1027e.setWindowCallback(callback);
    }

    @Override // q.e0
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f1027e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 u(View view) {
        if (view instanceof f0) {
            return (f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void v() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f1024a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1028f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1048z = new OverScroller(context);
    }

    public boolean x() {
        return this.f1029g;
    }

    public final void y() {
        v();
        postDelayed(this.D, 600L);
    }

    public final void z() {
        v();
        postDelayed(this.C, 600L);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f1027e.setIcon(drawable);
    }
}
