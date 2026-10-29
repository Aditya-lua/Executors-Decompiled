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
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.C0642x;
import androidx.core.view.InterfaceC0638v;
import androidx.core.view.InterfaceC0640w;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p181i.C6589a;
import p181i.C6594f;
import p365q.InterfaceC10368e0;
import p365q.InterfaceC10371f0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC10368e0, InterfaceC0638v, InterfaceC0640w {

    /* JADX INFO: renamed from: G */
    public static final int[] f1322G = {C6589a.f25023b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H */
    public static final WindowInsetsCompat f1323H = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.m2661of(0, 1, 0, 1)).build();

    /* JADX INFO: renamed from: I */
    public static final Rect f1324I = new Rect();

    /* JADX INFO: renamed from: A */
    public ViewPropertyAnimator f1325A;

    /* JADX INFO: renamed from: B */
    public final AnimatorListenerAdapter f1326B;

    /* JADX INFO: renamed from: C */
    public final Runnable f1327C;

    /* JADX INFO: renamed from: D */
    public final Runnable f1328D;

    /* JADX INFO: renamed from: E */
    public final C0642x f1329E;

    /* JADX INFO: renamed from: F */
    public final C0430f f1330F;

    /* JADX INFO: renamed from: a */
    public int f1331a;

    /* JADX INFO: renamed from: b */
    public int f1332b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f1333c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f1334d;

    /* JADX INFO: renamed from: e */
    public InterfaceC10371f0 f1335e;

    /* JADX INFO: renamed from: f */
    public Drawable f1336f;

    /* JADX INFO: renamed from: g */
    public boolean f1337g;

    /* JADX INFO: renamed from: h */
    public boolean f1338h;

    /* JADX INFO: renamed from: i */
    public boolean f1339i;

    /* JADX INFO: renamed from: j */
    public boolean f1340j;

    /* JADX INFO: renamed from: k */
    public int f1341k;

    /* JADX INFO: renamed from: l */
    public int f1342l;

    /* JADX INFO: renamed from: m */
    public final Rect f1343m;

    /* JADX INFO: renamed from: n */
    public final Rect f1344n;

    /* JADX INFO: renamed from: o */
    public final Rect f1345o;

    /* JADX INFO: renamed from: p */
    public final Rect f1346p;

    /* JADX INFO: renamed from: q */
    public final Rect f1347q;

    /* JADX INFO: renamed from: r */
    public final Rect f1348r;

    /* JADX INFO: renamed from: s */
    public final Rect f1349s;

    /* JADX INFO: renamed from: t */
    public final Rect f1350t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public WindowInsetsCompat f1351u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public WindowInsetsCompat f1352v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public WindowInsetsCompat f1353w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public WindowInsetsCompat f1354x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0428d f1355y;

    /* JADX INFO: renamed from: z */
    public OverScroller f1356z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0425a extends AnimatorListenerAdapter {
        public C0425a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1325A = null;
            actionBarOverlayLayout.f1340j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1325A = null;
            actionBarOverlayLayout.f1340j = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0426b implements Runnable {
        public RunnableC0426b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1740v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1325A = actionBarOverlayLayout.f1334d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1326B);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0427c implements Runnable {
        public RunnableC0427c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1740v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1325A = actionBarOverlayLayout.f1334d.animate().translationY(-ActionBarOverlayLayout.this.f1334d.getHeight()).setListener(ActionBarOverlayLayout.this.f1326B);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0428d {
        /* JADX INFO: renamed from: a */
        void mo1745a();

        /* JADX INFO: renamed from: b */
        void mo1746b();

        /* JADX INFO: renamed from: c */
        void mo1747c(boolean z10);

        /* JADX INFO: renamed from: d */
        void mo1748d();

        /* JADX INFO: renamed from: e */
        void mo1749e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0429e extends ViewGroup.MarginLayoutParams {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0429e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0429e(int i10, int i11) {
            super(i10, i11);
        }

        public C0429e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$f */
    public static final class C0430f extends View {
        public C0430f(Context context) {
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
        this.f1332b = 0;
        this.f1343m = new Rect();
        this.f1344n = new Rect();
        this.f1345o = new Rect();
        this.f1346p = new Rect();
        this.f1347q = new Rect();
        this.f1348r = new Rect();
        this.f1349s = new Rect();
        this.f1350t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f1351u = windowInsetsCompat;
        this.f1352v = windowInsetsCompat;
        this.f1353w = windowInsetsCompat;
        this.f1354x = windowInsetsCompat;
        this.f1326B = new C0425a();
        this.f1327C = new RunnableC0426b();
        this.f1328D = new RunnableC0427c();
        m1741w(context);
        this.f1329E = new C0642x(this);
        C0430f c0430f = new C0430f(context);
        this.f1330F = c0430f;
        addView(c0430f);
    }

    /* JADX INFO: renamed from: A */
    public void m1716A() {
        if (this.f1333c == null) {
            this.f1333c = (ContentFrameLayout) findViewById(C6594f.f25135b);
            this.f1334d = (ActionBarContainer) findViewById(C6594f.f25136c);
            this.f1335e = m1739u(findViewById(C6594f.f25134a));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1717B() {
        m1740v();
        this.f1327C.run();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m1718C(float f10) {
        this.f1356z.fling(0, 0, 0, (int) f10, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
        return this.f1356z.getFinalY() > this.f1334d.getHeight();
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: a */
    public boolean mo1719a() {
        m1716A();
        return this.f1335e.mo2001a();
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: b */
    public boolean mo1720b() {
        m1716A();
        return this.f1335e.mo2002b();
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: c */
    public boolean mo1721c() {
        m1716A();
        return this.f1335e.mo2003c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0429e;
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: d */
    public void mo1722d(Menu menu, InterfaceC0419i.a aVar) {
        m1716A();
        this.f1335e.mo2004d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f1336f != null) {
            int bottom = this.f1334d.getVisibility() == 0 ? (int) (this.f1334d.getBottom() + this.f1334d.getTranslationY() + 0.5f) : 0;
            this.f1336f.setBounds(0, bottom, getWidth(), this.f1336f.getIntrinsicHeight() + bottom);
            this.f1336f.draw(canvas);
        }
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: e */
    public boolean mo1723e() {
        m1716A();
        return this.f1335e.mo2005e();
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: f */
    public void mo1724f() {
        m1716A();
        this.f1335e.mo2006f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: g */
    public boolean mo1725g() {
        m1716A();
        return this.f1335e.mo2007g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1334d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1329E.m3219a();
    }

    public CharSequence getTitle() {
        m1716A();
        return this.f1335e.getTitle();
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: h */
    public void mo1726h(int i10) {
        m1716A();
        if (i10 == 2) {
            this.f1335e.mo2013m();
        } else if (i10 == 5) {
            this.f1335e.mo2020t();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: i */
    public void mo1727i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: j */
    public void mo1728j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: k */
    public void mo1729k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // p365q.InterfaceC10368e0
    /* JADX INFO: renamed from: l */
    public void mo1730l() {
        m1716A();
        this.f1335e.mo2015o();
    }

    @Override // androidx.core.view.InterfaceC0640w
    /* JADX INFO: renamed from: m */
    public void mo1731m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo1732n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: n */
    public void mo1732n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: o */
    public boolean mo1733o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m1716A();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean zM1735q = m1735q(this.f1334d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        C0625o0.m3025f(this, windowInsetsCompat, this.f1343m);
        Rect rect = this.f1343m;
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f1351u = windowInsetsCompatInset;
        boolean z10 = true;
        if (!this.f1352v.equals(windowInsetsCompatInset)) {
            this.f1352v = this.f1351u;
            zM1735q = true;
        }
        if (this.f1344n.equals(this.f1343m)) {
            z10 = zM1735q;
        } else {
            this.f1344n.set(this.f1343m);
        }
        if (z10) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1741w(getContext());
        C0625o0.m3034j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1740v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0429e c0429e = (C0429e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0429e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0429e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        m1716A();
        measureChildWithMargins(this.f1334d, i10, 0, i11, 0);
        C0429e c0429e = (C0429e) this.f1334d.getLayoutParams();
        int iMax = Math.max(0, this.f1334d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0429e).leftMargin + ((ViewGroup.MarginLayoutParams) c0429e).rightMargin);
        int iMax2 = Math.max(0, this.f1334d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0429e).topMargin + ((ViewGroup.MarginLayoutParams) c0429e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1334d.getMeasuredState());
        boolean z10 = (C0625o0.m2998K(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1331a;
            if (this.f1338h && this.f1334d.getTabContainer() != null) {
                measuredHeight += this.f1331a;
            }
        } else {
            measuredHeight = this.f1334d.getVisibility() != 8 ? this.f1334d.getMeasuredHeight() : 0;
        }
        this.f1345o.set(this.f1343m);
        this.f1353w = this.f1351u;
        if (this.f1337g || z10 || !m1736r()) {
            this.f1353w = new WindowInsetsCompat.Builder(this.f1353w).setSystemWindowInsets(Insets.m2661of(this.f1353w.getSystemWindowInsetLeft(), this.f1353w.getSystemWindowInsetTop() + measuredHeight, this.f1353w.getSystemWindowInsetRight(), this.f1353w.getSystemWindowInsetBottom())).build();
        } else {
            Rect rect = this.f1345o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f1353w = this.f1353w.inset(0, measuredHeight, 0, 0);
        }
        m1735q(this.f1333c, this.f1345o, true, true, true, true);
        if (!this.f1354x.equals(this.f1353w)) {
            WindowInsetsCompat windowInsetsCompat = this.f1353w;
            this.f1354x = windowInsetsCompat;
            C0625o0.m3027g(this.f1333c, windowInsetsCompat);
        }
        measureChildWithMargins(this.f1333c, i10, 0, i11, 0);
        C0429e c0429e2 = (C0429e) this.f1333c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1333c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0429e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0429e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1333c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0429e2).topMargin + ((ViewGroup.MarginLayoutParams) c0429e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1333c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1339i || !z10) {
            return false;
        }
        if (m1718C(f11)) {
            m1734p();
        } else {
            m1717B();
        }
        this.f1340j = true;
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
        int i14 = this.f1341k + i11;
        this.f1341k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1329E.m3220b(view, view2, i10);
        this.f1341k = getActionBarHideOffset();
        m1740v();
        InterfaceC0428d interfaceC0428d = this.f1355y;
        if (interfaceC0428d != null) {
            interfaceC0428d.mo1749e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1334d.getVisibility() != 0) {
            return false;
        }
        return this.f1339i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1339i && !this.f1340j) {
            if (this.f1341k <= this.f1334d.getHeight()) {
                m1744z();
            } else {
                m1743y();
            }
        }
        InterfaceC0428d interfaceC0428d = this.f1355y;
        if (interfaceC0428d != null) {
            interfaceC0428d.mo1746b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m1716A();
        int i11 = this.f1342l ^ i10;
        this.f1342l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        InterfaceC0428d interfaceC0428d = this.f1355y;
        if (interfaceC0428d != null) {
            interfaceC0428d.mo1747c(!z11);
            if (z10 || !z11) {
                this.f1355y.mo1745a();
            } else {
                this.f1355y.mo1748d();
            }
        }
        if ((i11 & 256) == 0 || this.f1355y == null) {
            return;
        }
        C0625o0.m3034j0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1332b = i10;
        InterfaceC0428d interfaceC0428d = this.f1355y;
        if (interfaceC0428d != null) {
            interfaceC0428d.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1734p() {
        m1740v();
        this.f1328D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final boolean m1735q(@NonNull View view, @NonNull Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        C0429e c0429e = (C0429e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) c0429e).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c0429e).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) c0429e).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) c0429e).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) c0429e).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) c0429e).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) c0429e).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c0429e).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1736r() {
        C0625o0.m3025f(this.f1330F, f1323H, this.f1346p);
        return !this.f1346p.equals(f1324I);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0429e generateDefaultLayoutParams() {
        return new C0429e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        m1740v();
        this.f1334d.setTranslationY(-Math.max(0, Math.min(i10, this.f1334d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0428d interfaceC0428d) {
        this.f1355y = interfaceC0428d;
        if (getWindowToken() != null) {
            this.f1355y.onWindowVisibilityChanged(this.f1332b);
            int i10 = this.f1342l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                C0625o0.m3034j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1338h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1339i) {
            this.f1339i = z10;
            if (z10) {
                return;
            }
            m1740v();
            setActionBarHideOffset(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(int i10) {
        m1716A();
        this.f1335e.setIcon(i10);
    }

    public void setLogo(int i10) {
        m1716A();
        this.f1335e.mo2017q(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1337g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p365q.InterfaceC10368e0
    public void setWindowCallback(Window.Callback callback) {
        m1716A();
        this.f1335e.setWindowCallback(callback);
    }

    @Override // p365q.InterfaceC10368e0
    public void setWindowTitle(CharSequence charSequence) {
        m1716A();
        this.f1335e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0429e generateLayoutParams(AttributeSet attributeSet) {
        return new C0429e(getContext(), attributeSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final InterfaceC10371f0 m1739u(View view) {
        if (view instanceof InterfaceC10371f0) {
            return (InterfaceC10371f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: v */
    public void m1740v() {
        removeCallbacks(this.f1327C);
        removeCallbacks(this.f1328D);
        ViewPropertyAnimator viewPropertyAnimator = this.f1325A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1741w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1322G);
        this.f1331a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1336f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1356z = new OverScroller(context);
    }

    /* JADX INFO: renamed from: x */
    public boolean m1742x() {
        return this.f1337g;
    }

    /* JADX INFO: renamed from: y */
    public final void m1743y() {
        m1740v();
        postDelayed(this.f1328D, 600L);
    }

    /* JADX INFO: renamed from: z */
    public final void m1744z() {
        m1740v();
        postDelayed(this.f1327C, 600L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0429e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1716A();
        this.f1335e.setIcon(drawable);
    }
}
