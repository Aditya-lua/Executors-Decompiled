package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.t;
import androidx.customview.view.AbsSavedState;
import gd.g;
import gd.h;
import hc.j;
import hc.k;
import java.lang.ref.WeakReference;
import java.util.List;
import jc.e;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f7476y = j.f18935f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7477a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WindowInsetsCompat f7482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<a> f7483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<View> f7489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f7491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f7492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f7493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TimeInterpolator f7494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f7495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f7496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f7497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f7498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Behavior f7499x;

    public static class BaseBehavior<T extends AppBarLayout> extends jc.a<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ValueAnimator f7502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public SavedState f7503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public WeakReference<View> f7504o;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f7510a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7510a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f7510a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends androidx.core.view.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f7512d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f7513e;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f7512d = appBarLayout;
                this.f7513e = coordinatorLayout;
            }

            @Override // androidx.core.view.a
            public void g(View view, @NonNull p pVar) {
                View viewJ0;
                super.g(view, pVar);
                pVar.l0(ScrollView.class.getName());
                if (this.f7512d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f7513e)) == null || !BaseBehavior.this.f0(this.f7512d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f7512d.getTotalScrollRange())) {
                    pVar.b(p.a.f35514q);
                    pVar.G0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        pVar.b(p.a.f35515r);
                        pVar.G0(true);
                    } else if ((-this.f7512d.getDownNestedPreScrollRange()) != 0) {
                        pVar.b(p.a.f35515r);
                        pVar.G0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.core.view.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f7512d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f7513e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f7512d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f7512d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f7513e, this.f7512d, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public static View h0(@NonNull AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            int topInset = t8.getTopInset() + t8.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(t8, iQ);
            if (iI0 >= 0) {
                View childAt = t8.getChildAt(iI0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iI0 == 0 && o0.w(t8) && o0.w(childAt)) {
                        topInset2 -= t8.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iA += o0.A(childAt);
                    } else if (e0(iC, 5)) {
                        int iA2 = o0.A(childAt) + iA;
                        if (iQ < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t8, s2.a.c(b0(iQ, iA, topInset2) + topInset, -t8.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, boolean z10) {
            View viewH0 = h0(t8, i10);
            boolean zU = false;
            if (viewH0 != null) {
                int iC = ((d) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = o0.A(viewH0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - iA) - t8.getTopInset()) : (-i10) >= (viewH0.getBottom() - iA) - t8.getTopInset()) {
                        zU = true;
                    }
                }
            }
            if (t8.k()) {
                zU = t8.u(g0(coordinatorLayout));
            }
            boolean zR = t8.r(zU);
            if (z10 || (zR && z0(coordinatorLayout, t8))) {
                if (t8.getBackground() != null) {
                    t8.getBackground().jumpToCurrentState();
                }
                if (t8.getForeground() != null) {
                    t8.getForeground().jumpToCurrentState();
                }
                if (t8.getStateListAnimator() != null) {
                    t8.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // jc.a
        public int Q() {
            return I() + this.f7500k;
        }

        public final void Y(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            if (o0.M(coordinatorLayout)) {
                return;
            }
            o0.m0(coordinatorLayout, new b(t8, coordinatorLayout));
        }

        public final void Z(CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, float f10) {
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            a0(coordinatorLayout, t8, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t8.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, T t8, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f7502m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f7502m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f7502m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7502m = valueAnimator3;
                valueAnimator3.setInterpolator(ic.a.f20474e);
                this.f7502m.addUpdateListener(new a(coordinatorLayout, t8));
            } else {
                valueAnimator2.cancel();
            }
            this.f7502m.setDuration(Math.min(i11, 600));
            this.f7502m.setIntValues(iQ, i10);
            this.f7502m.start();
        }

        public final int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        @Override // jc.a
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t8) {
            WeakReference<View> weakReference = this.f7504o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view) {
            return t8.i() && coordinatorLayout.getHeight() - view.getHeight() <= t8.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f7516a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof t) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(@NonNull T t8, int i10) {
            int childCount = t8.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t8.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (e0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // jc.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(@NonNull T t8) {
            return (-t8.getDownNestedScrollRange()) + t8.getTopInset();
        }

        @Override // jc.a
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(@NonNull T t8) {
            return t8.getTotalScrollRange();
        }

        public final int m0(@NonNull T t8, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t8.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t8.getChildAt(i11);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= o0.A(childAt);
                        }
                    }
                    if (o0.w(childAt)) {
                        topInset -= t8.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        @Override // jc.a
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            A0(coordinatorLayout, t8);
            if (t8.k()) {
                t8.r(t8.u(g0(coordinatorLayout)));
            }
        }

        @Override // jc.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10) {
            boolean zP = super.p(coordinatorLayout, t8, i10);
            int pendingAction = t8.getPendingAction();
            SavedState savedState = this.f7503n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t8.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, t8, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, t8, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, t8, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, t8, 0);
                        }
                    }
                }
            } else if (savedState.f7505c) {
                T(coordinatorLayout, t8, -t8.getTotalScrollRange());
            } else if (savedState.f7506d) {
                T(coordinatorLayout, t8, 0);
            } else {
                View childAt = t8.getChildAt(savedState.f7507e);
                T(coordinatorLayout, t8, (-childAt.getBottom()) + (this.f7503n.f7509g ? o0.A(childAt) + t8.getTopInset() : Math.round(childAt.getHeight() * this.f7503n.f7508f)));
            }
            t8.n();
            this.f7503n = null;
            K(s2.a.c(I(), -t8.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t8, I(), 0, true);
            t8.m(I());
            Y(coordinatorLayout, t8);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t8.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t8, i10, i11, i12, i13);
            }
            coordinatorLayout.J(t8, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10, int i11, int[] iArr, int i12) {
            T t10;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                t10 = t8;
            } else {
                if (i11 < 0) {
                    i13 = -t8.getTotalScrollRange();
                    downNestedPreScrollRange = t8.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t8.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    t10 = t8;
                    iArr[1] = S(coordinatorLayout, t10, i11, i14, i15);
                } else {
                    t10 = t8;
                }
            }
            if (t10.k()) {
                t10.r(t10.u(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, t10, i15, -t8.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                w0((SavedState) parcelable, true);
                super.B(coordinatorLayout, t8, this.f7503n.a());
            } else {
                super.B(coordinatorLayout, t8, parcelable);
                this.f7503n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            Parcelable parcelableC = super.C(coordinatorLayout, t8);
            SavedState savedStateX0 = x0(parcelableC, t8);
            return savedStateX0 == null ? parcelableC : savedStateX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t8.k() || d0(coordinatorLayout, t8, view));
            if (z10 && (valueAnimator = this.f7502m) != null) {
                valueAnimator.cancel();
            }
            this.f7504o = null;
            this.f7501l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10) {
            if (this.f7501l == 0 || i10 == 1) {
                A0(coordinatorLayout, t8);
                if (t8.k()) {
                    t8.r(t8.u(view));
                }
            }
            this.f7504o = new WeakReference<>(view);
        }

        public void w0(SavedState savedState, boolean z10) {
            if (this.f7503n == null || z10) {
                this.f7503n = savedState;
            }
        }

        public SavedState x0(Parcelable parcelable, @NonNull T t8) {
            int I = I();
            int childCount = t8.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t8.getChildAt(i10);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = I == 0;
                    savedState.f7506d = z10;
                    savedState.f7505c = !z10 && (-I) >= t8.getTotalScrollRange();
                    savedState.f7507e = i10;
                    savedState.f7509g = bottom == o0.A(childAt) + t8.getTopInset();
                    savedState.f7508f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // jc.a
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int iQ = Q();
            int i13 = 0;
            if (i11 == 0 || iQ < i11 || iQ > i12) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                this.f7500k = 0;
            } else {
                int iC = s2.a.c(i10, i11, i12);
                if (iQ != iC) {
                    int iM0 = t8.g() ? m0(t8, iC) : iC;
                    boolean zK = K(iM0);
                    int i14 = iQ - iC;
                    this.f7500k = iC - iM0;
                    if (zK) {
                        while (i13 < t8.getChildCount()) {
                            d dVar = (d) t8.getChildAt(i13).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(t8, t8.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && t8.g()) {
                        coordinatorLayout.f(t8);
                    }
                    t8.m(I());
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                    B0(coordinatorLayout2, t10, iC, iC < iQ ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                }
            }
            Y(coordinatorLayout2, t10);
            return i13;
        }

        public final boolean z0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            List<View> listS = coordinatorLayout.s(t8);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listS.get(i10).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f7505c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f7506d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f7507e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f7508f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f7509g;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7505c = parcel.readByte() != 0;
                this.f7506d = parcel.readByte() != 0;
                this.f7507e = parcel.readInt();
                this.f7508f = parcel.readFloat();
                this.f7509g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f7505c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f7506d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f7507e);
                parcel.writeFloat(this.f7508f);
                parcel.writeByte(this.f7509g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // jc.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // jc.c
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // jc.c
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // jc.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends jc.b {
        public ScrollingViewBehavior() {
        }

        public static int V(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.r(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f21248d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.o(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // jc.b
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // jc.b
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // jc.b
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(@NonNull List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void W(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                o0.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f7500k) + Q()) - M(view2));
            }
        }

        public final void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.k()) {
                    appBarLayout.r(appBarLayout.u(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                o0.m0(coordinatorLayout, null);
            }
        }

        @Override // jc.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // jc.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f19000e5);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f19009f5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t8, int i10);
    }

    public static abstract class b {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f7515a = new Rect();
        public final Rect b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10) {
            b(this.f7515a, appBarLayout, view);
            float fAbs = this.f7515a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                o0.t0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fB = 1.0f - s2.a.b(Math.abs(fAbs / this.f7515a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f7515a.height() * 0.3f) * (1.0f - (fB * fB)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.b);
            this.b.offset(0, (int) (-fHeight));
            if (fHeight >= this.b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            o0.t0(view, this.b);
        }
    }

    public final void a() {
        WeakReference<View> weakReference = this.f7489n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7489n = null;
    }

    public final Integer b() {
        Drawable drawable = this.f7496u;
        if (drawable instanceof g) {
            return Integer.valueOf(((g) drawable).A());
        }
        ColorStateList colorStateListG = vc.c.g(drawable);
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    public final View c(View view) {
        int i10;
        if (this.f7489n == null && (i10 = this.f7488m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f7488m);
            }
            if (viewFindViewById != null) {
                this.f7489n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f7489n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f7477a);
            this.f7496u.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7496u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public boolean g() {
        return this.f7480e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f7499x = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i10 = this.f7478c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f7516a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iA = o0.A(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iA = measuredHeight - o0.A(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && o0.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f7478c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f7479d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i12 = dVar.f7516a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i12 & 2) != 0) {
                    iA -= o0.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.f7479d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f7488m;
    }

    public g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g) {
            return (g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = o0.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? o0.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f7481f;
    }

    public Drawable getStatusBarForeground() {
        return this.f7496u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f7482g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f7516a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && o0.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iA -= o0.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return getTotalScrollRange() != 0;
    }

    public final void j() {
        Behavior behavior = this.f7499x;
        BaseBehavior.SavedState savedStateX0 = (behavior == null || this.b == -1 || this.f7481f != 0) ? null : behavior.x0(AbsSavedState.b, this);
        this.b = -1;
        this.f7478c = -1;
        this.f7479d = -1;
        if (savedStateX0 != null) {
            this.f7499x.w0(savedStateX0, false);
        }
    }

    public boolean k() {
        return this.f7487l;
    }

    public final boolean l() {
        return getBackground() instanceof g;
    }

    public void m(int i10) {
        this.f7477a = i10;
        if (!willNotDraw()) {
            o0.d0(this);
        }
        List<a> list = this.f7483h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f7483h.get(i11);
                if (aVar != null) {
                    aVar.a(this, i10);
                }
            }
        }
    }

    public void n() {
        this.f7481f = 0;
    }

    public void o(boolean z10, boolean z11) {
        p(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f7495t == null) {
            this.f7495t = new int[4];
        }
        int[] iArr = this.f7495t;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f7485j;
        int i11 = hc.b.f18772c0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f7486k) ? hc.b.f18774d0 : -hc.b.f18774d0;
        int i12 = hc.b.Y;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f7486k) ? hc.b.X : -hc.b.X;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (o0.w(this) && v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o0.X(getChildAt(childCount), topInset);
            }
        }
        j();
        this.f7480e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f7480e = true;
                break;
            }
        }
        Drawable drawable = this.f7496u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f7484i) {
            return;
        }
        if (!this.f7487l && !h()) {
            z11 = false;
        }
        q(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && o0.w(this) && v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = s2.a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        j();
    }

    public final void p(boolean z10, boolean z11, boolean z12) {
        this.f7481f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public final boolean q(boolean z10) {
        if (this.f7485j == z10) {
            return false;
        }
        this.f7485j = z10;
        refreshDrawableState();
        return true;
    }

    public boolean r(boolean z10) {
        return s(z10, !this.f7484i);
    }

    public boolean s(boolean z10, boolean z11) {
        if (!z11 || this.f7486k == z10) {
            return false;
        }
        this.f7486k = z10;
        refreshDrawableState();
        if (!l()) {
            return true;
        }
        if (this.f7490o) {
            w(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f7487l) {
            return true;
        }
        w(z10 ? 0.0f : this.f7498w, z10 ? this.f7498w : 0.0f);
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        o(z10, o0.R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f7487l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f7488m = -1;
        if (view == null) {
            a();
        } else {
            this.f7489n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f7488m = i10;
        a();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f7484i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f7496u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f7496u = drawable != null ? drawable.mutate() : null;
            this.f7497v = b();
            Drawable drawable3 = this.f7496u;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7496u.setState(getDrawableState());
                }
                q2.a.m(this.f7496u, o0.z(this));
                this.f7496u.setVisible(getVisibility() == 0, false);
                this.f7496u.setCallback(this);
            }
            x();
            o0.d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(k.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        e.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f7496u;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean t() {
        return this.f7496u != null && getTopInset() > 0;
    }

    public boolean u(View view) {
        View viewC = c(view);
        if (viewC != null) {
            view = viewC;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean v() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !o0.w(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7496u;
    }

    public final void w(float f10, float f11) {
        ValueAnimator valueAnimator = this.f7491p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f7491p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f7493r);
        this.f7491p.setInterpolator(this.f7494s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f7492q;
        if (animatorUpdateListener != null) {
            this.f7491p.addUpdateListener(animatorUpdateListener);
        }
        this.f7491p.start();
    }

    public final void x() {
        setWillNotDraw(!t());
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7516a;
        public b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f7517c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7516a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f19066m);
            this.f7516a = typedArrayObtainStyledAttributes.getInt(k.f19084o, 0);
            f(typedArrayObtainStyledAttributes.getInt(k.f19075n, 0));
            int i10 = k.f19093p;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f7517c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.b;
        }

        public int c() {
            return this.f7516a;
        }

        public Interpolator d() {
            return this.f7517c;
        }

        public boolean e() {
            int i10 = this.f7516a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.b = a(i10);
        }

        public void g(int i10) {
            this.f7516a = i10;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f7516a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7516a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7516a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7516a = 1;
        }
    }
}
