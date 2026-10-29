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
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0634t;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.List;
import p168hd.C6363g;
import p168hd.C6364h;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7137a;
import p232k.C7399a;
import p245kc.AbstractC7538a;
import p245kc.AbstractC7539b;
import p245kc.C7542e;
import p368q2.C10425a;
import p426s2.C11162a;
import p513wc.C12348c;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0523b {

    /* JADX INFO: renamed from: y */
    public static final int f9566y = C6746j.f26114f;

    /* JADX INFO: renamed from: a */
    public int f9567a;

    /* JADX INFO: renamed from: b */
    public int f9568b;

    /* JADX INFO: renamed from: c */
    public int f9569c;

    /* JADX INFO: renamed from: d */
    public int f9570d;

    /* JADX INFO: renamed from: e */
    public boolean f9571e;

    /* JADX INFO: renamed from: f */
    public int f9572f;

    /* JADX INFO: renamed from: g */
    public WindowInsetsCompat f9573g;

    /* JADX INFO: renamed from: h */
    public List<InterfaceC2730a> f9574h;

    /* JADX INFO: renamed from: i */
    public boolean f9575i;

    /* JADX INFO: renamed from: j */
    public boolean f9576j;

    /* JADX INFO: renamed from: k */
    public boolean f9577k;

    /* JADX INFO: renamed from: l */
    public boolean f9578l;

    /* JADX INFO: renamed from: m */
    public int f9579m;

    /* JADX INFO: renamed from: n */
    public WeakReference<View> f9580n;

    /* JADX INFO: renamed from: o */
    public final boolean f9581o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f9582p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f9583q;

    /* JADX INFO: renamed from: r */
    public final long f9584r;

    /* JADX INFO: renamed from: s */
    public final TimeInterpolator f9585s;

    /* JADX INFO: renamed from: t */
    public int[] f9586t;

    /* JADX INFO: renamed from: u */
    public Drawable f9587u;

    /* JADX INFO: renamed from: v */
    public Integer f9588v;

    /* JADX INFO: renamed from: w */
    public final float f9589w;

    /* JADX INFO: renamed from: x */
    public Behavior f9590x;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC7538a<T> {

        /* JADX INFO: renamed from: k */
        public int f9591k;

        /* JADX INFO: renamed from: l */
        public int f9592l;

        /* JADX INFO: renamed from: m */
        public ValueAnimator f9593m;

        /* JADX INFO: renamed from: n */
        public SavedState f9594n;

        /* JADX INFO: renamed from: o */
        public WeakReference<View> f9595o;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C2728a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CoordinatorLayout f9601a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AppBarLayout f9602b;

            public C2728a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f9601a = coordinatorLayout;
                this.f9602b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.m31183T(this.f9601a, this.f9602b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C2729b extends C0582a {

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AppBarLayout f9604d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoordinatorLayout f9605e;

            public C2729b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f9604d = appBarLayout;
                this.f9605e = coordinatorLayout;
            }

            @Override // androidx.core.view.C0582a
            /* JADX INFO: renamed from: g */
            public void mo2799g(View view, @NonNull C13017p c13017p) {
                View viewM11948j0;
                super.mo2799g(view, c13017p);
                c13017p.m48408l0(ScrollView.class.getName());
                if (this.f9604d.getTotalScrollRange() == 0 || (viewM11948j0 = BaseBehavior.this.m11948j0(this.f9605e)) == null || !BaseBehavior.this.m11945f0(this.f9604d)) {
                    return;
                }
                if (BaseBehavior.this.mo11936Q() != (-this.f9604d.getTotalScrollRange())) {
                    c13017p.m48388b(C13017p.a.f46075q);
                    c13017p.m48362G0(true);
                }
                if (BaseBehavior.this.mo11936Q() != 0) {
                    if (!viewM11948j0.canScrollVertically(-1)) {
                        c13017p.m48388b(C13017p.a.f46076r);
                        c13017p.m48362G0(true);
                    } else if ((-this.f9604d.getDownNestedPreScrollRange()) != 0) {
                        c13017p.m48388b(C13017p.a.f46076r);
                        c13017p.m48362G0(true);
                    }
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior */
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
            @Override // androidx.core.view.C0582a
            /* JADX INFO: renamed from: j */
            public boolean mo2802j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f9604d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.mo2802j(view, i10, bundle);
                }
                if (BaseBehavior.this.mo11936Q() != 0) {
                    View viewM11948j0 = BaseBehavior.this.m11948j0(this.f9605e);
                    if (!viewM11948j0.canScrollVertically(-1)) {
                        this.f9604d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f9604d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.mo2621u(this.f9605e, this.f9604d, viewM11948j0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: e0 */
        public static boolean m11929e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: renamed from: h0 */
        public static View m11930h0(@NonNull AppBarLayout appBarLayout, int i10) {
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

        /* JADX INFO: renamed from: A0 */
        public final void m11931A0(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            int topInset = t8.getTopInset() + t8.getPaddingTop();
            int iMo11936Q = mo11936Q() - topInset;
            int iM11947i0 = m11947i0(t8, iMo11936Q);
            if (iM11947i0 >= 0) {
                View childAt = t8.getChildAt(iM11947i0);
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                int iM11982c = c2733d.m11982c();
                if ((iM11982c & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iM2978A = -childAt.getBottom();
                    if (iM11947i0 == 0 && C0625o0.m3059w(t8) && C0625o0.m3059w(childAt)) {
                        topInset2 -= t8.getTopInset();
                    }
                    if (m11929e0(iM11982c, 2)) {
                        iM2978A += C0625o0.m2978A(childAt);
                    } else if (m11929e0(iM11982c, 5)) {
                        int iM2978A2 = C0625o0.m2978A(childAt) + iM2978A;
                        if (iMo11936Q < iM2978A2) {
                            topInset2 = iM2978A2;
                        } else {
                            iM2978A = iM2978A2;
                        }
                    }
                    if (m11929e0(iM11982c, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) c2733d).topMargin;
                        iM2978A -= ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                    }
                    m11940Z(coordinatorLayout, t8, C11162a.m42060c(m11942b0(iMo11936Q, iM2978A, topInset2) + topInset, -t8.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: renamed from: B0 */
        public final void m11932B0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, boolean z10) {
            View viewM11930h0 = m11930h0(t8, i10);
            boolean zM11922u = false;
            if (viewM11930h0 != null) {
                int iM11982c = ((C2733d) viewM11930h0.getLayoutParams()).m11982c();
                if ((iM11982c & 1) != 0) {
                    int iM2978A = C0625o0.m2978A(viewM11930h0);
                    if (i11 <= 0 || (iM11982c & 12) == 0 ? !((iM11982c & 2) == 0 || (-i10) < (viewM11930h0.getBottom() - iM2978A) - t8.getTopInset()) : (-i10) >= (viewM11930h0.getBottom() - iM2978A) - t8.getTopInset()) {
                        zM11922u = true;
                    }
                }
            }
            if (t8.m11912k()) {
                zM11922u = t8.m11922u(m11946g0(coordinatorLayout));
            }
            boolean zM11919r = t8.m11919r(zM11922u);
            if (z10 || (zM11919r && m11964z0(coordinatorLayout, t8))) {
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

        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: Q */
        public int mo11936Q() {
            return mo11968I() + this.f9591k;
        }

        /* JADX INFO: renamed from: Y */
        public final void m11939Y(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            if (C0625o0.m3001M(coordinatorLayout)) {
                return;
            }
            C0625o0.m3040m0(coordinatorLayout, new C2729b(t8, coordinatorLayout));
        }

        /* JADX INFO: renamed from: Z */
        public final void m11940Z(CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, float f10) {
            int iAbs = Math.abs(mo11936Q() - i10);
            float fAbs = Math.abs(f10);
            m11941a0(coordinatorLayout, t8, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t8.getHeight()) + 1.0f) * 150.0f));
        }

        /* JADX INFO: renamed from: a0 */
        public final void m11941a0(CoordinatorLayout coordinatorLayout, T t8, int i10, int i11) {
            int iMo11936Q = mo11936Q();
            if (iMo11936Q == i10) {
                ValueAnimator valueAnimator = this.f9593m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f9593m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9593m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9593m = valueAnimator3;
                valueAnimator3.setInterpolator(C7137a.f27788e);
                this.f9593m.addUpdateListener(new C2728a(coordinatorLayout, t8));
            } else {
                valueAnimator2.cancel();
            }
            this.f9593m.setDuration(Math.min(i11, 600));
            this.f9593m.setIntValues(iMo11936Q, i10);
            this.f9593m.start();
        }

        /* JADX INFO: renamed from: b0 */
        public final int m11942b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        /* JADX DEBUG: Method merged with bridge method: L(Landroid/view/View;)Z */
        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean mo11933L(T t8) {
            WeakReference<View> weakReference = this.f9595o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: renamed from: d0 */
        public final boolean m11944d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view) {
            return t8.m11910i() && coordinatorLayout.getHeight() - view.getHeight() <= t8.getHeight();
        }

        /* JADX INFO: renamed from: f0 */
        public final boolean m11945f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((C2733d) appBarLayout.getChildAt(i10).getLayoutParams()).f9609a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g0 */
        public final View m11946g0(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC0634t) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i0 */
        public final int m11947i0(@NonNull T t8, int i10) {
            int childCount = t8.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t8.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                if (m11929e0(c2733d.m11982c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c2733d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: j0 */
        public final View m11948j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.C0527f) childAt.getLayoutParams()).m2632f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: O(Landroid/view/View;)I */
        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int mo11934O(@NonNull T t8) {
            return (-t8.getDownNestedScrollRange()) + t8.getTopInset();
        }

        /* JADX DEBUG: Method merged with bridge method: P(Landroid/view/View;)I */
        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int mo11935P(@NonNull T t8) {
            return t8.getTotalScrollRange();
        }

        /* JADX INFO: renamed from: m0 */
        public final int m11951m0(@NonNull T t8, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t8.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t8.getChildAt(i11);
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                Interpolator interpolatorM11983d = c2733d.m11983d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorM11983d == null) {
                        break;
                    }
                    int iM11982c = c2733d.m11982c();
                    if ((iM11982c & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c2733d).topMargin + ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                        if ((iM11982c & 2) != 0) {
                            topInset -= C0625o0.m2978A(childAt);
                        }
                    }
                    if (C0625o0.m3059w(childAt)) {
                        topInset -= t8.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorM11983d.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        /* JADX DEBUG: Method merged with bridge method: R(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V */
        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo11937R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            m11931A0(coordinatorLayout, t8);
            if (t8.m11912k()) {
                t8.m11919r(t8.m11922u(m11946g0(coordinatorLayout)));
            }
        }

        /* JADX DEBUG: Method merged with bridge method: p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // p245kc.C7540c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10) {
            boolean zMo2616p = super.mo2616p(coordinatorLayout, t8, i10);
            int pendingAction = t8.getPendingAction();
            SavedState savedState = this.f9594n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t8.getUpNestedPreScrollRange();
                        if (z10) {
                            m11940Z(coordinatorLayout, t8, i11, 0.0f);
                        } else {
                            m31183T(coordinatorLayout, t8, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            m11940Z(coordinatorLayout, t8, 0, 0.0f);
                        } else {
                            m31183T(coordinatorLayout, t8, 0);
                        }
                    }
                }
            } else if (savedState.f9596c) {
                m31183T(coordinatorLayout, t8, -t8.getTotalScrollRange());
            } else if (savedState.f9597d) {
                m31183T(coordinatorLayout, t8, 0);
            } else {
                View childAt = t8.getChildAt(savedState.f9598e);
                m31183T(coordinatorLayout, t8, (-childAt.getBottom()) + (this.f9594n.f9600g ? C0625o0.m2978A(childAt) + t8.getTopInset() : Math.round(childAt.getHeight() * this.f9594n.f9599f)));
            }
            t8.m11915n();
            this.f9594n = null;
            mo11969K(C11162a.m42060c(mo11968I(), -t8.getTotalScrollRange(), 0));
            m11932B0(coordinatorLayout, t8, mo11968I(), 0, true);
            t8.m11914m(mo11968I());
            m11939Y(coordinatorLayout, t8);
            return zMo2616p;
        }

        /* JADX DEBUG: Method merged with bridge method: q(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0527f) t8.getLayoutParams())).height != -2) {
                return super.mo2617q(coordinatorLayout, t8, i10, i11, i12, i13);
            }
            coordinatorLayout.m2566J(t8, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: u(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void mo2621u(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10, int i11, int[] iArr, int i12) {
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
                    iArr[1] = m31182S(coordinatorLayout, t10, i11, i14, i15);
                } else {
                    t10 = t8;
                }
            }
            if (t10.m11912k()) {
                t10.m11919r(t10.m11922u(view));
            }
        }

        /* JADX DEBUG: Method merged with bridge method: x(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void mo2624x(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
                iArr[1] = m31182S(coordinatorLayout2, t10, i15, -t8.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
            }
            if (i15 == 0) {
                m11939Y(coordinatorLayout2, t10);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: B(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void mo2598B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                m11961w0((SavedState) parcelable, true);
                super.mo2598B(coordinatorLayout, t8, this.f9594n.m3321a());
            } else {
                super.mo2598B(coordinatorLayout, t8, parcelable);
                this.f9594n = null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable; */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo2599C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            Parcelable parcelableMo2599C = super.mo2599C(coordinatorLayout, t8);
            SavedState savedStateM11962x0 = m11962x0(parcelableMo2599C, t8);
            return savedStateM11962x0 == null ? parcelableMo2599C : savedStateM11962x0;
        }

        /* JADX DEBUG: Method merged with bridge method: E(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t8.m11912k() || m11944d0(coordinatorLayout, t8, view));
            if (z10 && (valueAnimator = this.f9593m) != null) {
                valueAnimator.cancel();
            }
            this.f9595o = null;
            this.f9592l = i11;
            return z10;
        }

        /* JADX DEBUG: Method merged with bridge method: G(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void mo2603G(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10) {
            if (this.f9592l == 0 || i10 == 1) {
                m11931A0(coordinatorLayout, t8);
                if (t8.m11912k()) {
                    t8.m11919r(t8.m11922u(view));
                }
            }
            this.f9595o = new WeakReference<>(view);
        }

        /* JADX INFO: renamed from: w0 */
        public void m11961w0(SavedState savedState, boolean z10) {
            if (this.f9594n == null || z10) {
                this.f9594n = savedState;
            }
        }

        /* JADX INFO: renamed from: x0 */
        public SavedState m11962x0(Parcelable parcelable, @NonNull T t8) {
            int iMo11968I = mo11968I();
            int childCount = t8.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t8.getChildAt(i10);
                int bottom = childAt.getBottom() + iMo11968I;
                if (childAt.getTop() + iMo11968I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f2809b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iMo11968I == 0;
                    savedState.f9597d = z10;
                    savedState.f9596c = !z10 && (-iMo11968I) >= t8.getTotalScrollRange();
                    savedState.f9598e = i10;
                    savedState.f9600g = bottom == C0625o0.m2978A(childAt) + t8.getTopInset();
                    savedState.f9599f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: U(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
        @Override // p245kc.AbstractC7538a
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int mo11938U(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int iMo11936Q = mo11936Q();
            int i13 = 0;
            if (i11 == 0 || iMo11936Q < i11 || iMo11936Q > i12) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                this.f9591k = 0;
            } else {
                int iM42060c = C11162a.m42060c(i10, i11, i12);
                if (iMo11936Q != iM42060c) {
                    int iM11951m0 = t8.m11908g() ? m11951m0(t8, iM42060c) : iM42060c;
                    boolean zMo11969K = mo11969K(iM11951m0);
                    int i14 = iMo11936Q - iM42060c;
                    this.f9591k = iM42060c - iM11951m0;
                    if (zMo11969K) {
                        while (i13 < t8.getChildCount()) {
                            C2733d c2733d = (C2733d) t8.getChildAt(i13).getLayoutParams();
                            AbstractC2731b abstractC2731bM11981b = c2733d.m11981b();
                            if (abstractC2731bM11981b != null && (c2733d.m11982c() & 1) != 0) {
                                abstractC2731bM11981b.mo11978a(t8, t8.getChildAt(i13), mo11968I());
                            }
                            i13++;
                        }
                    }
                    if (!zMo11969K && t8.m11908g()) {
                        coordinatorLayout.m2579f(t8);
                    }
                    t8.m11914m(mo11968I());
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                    m11932B0(coordinatorLayout2, t10, iM42060c, iM42060c < iMo11936Q ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                }
            }
            m11939Y(coordinatorLayout2, t10);
            return i13;
        }

        /* JADX INFO: renamed from: z0 */
        public final boolean m11964z0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            List<View> listM2586s = coordinatorLayout.m2586s(t8);
            int size = listM2586s.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.AbstractC0524c abstractC0524cM2632f = ((CoordinatorLayout.C0527f) listM2586s.get(i10).getLayoutParams()).m2632f();
                if (abstractC0524cM2632f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC0524cM2632f).m31187O() != 0;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C2727a();

            /* JADX INFO: renamed from: c */
            public boolean f9596c;

            /* JADX INFO: renamed from: d */
            public boolean f9597d;

            /* JADX INFO: renamed from: e */
            public int f9598e;

            /* JADX INFO: renamed from: f */
            public float f9599f;

            /* JADX INFO: renamed from: g */
            public boolean f9600g;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public class C2727a implements Parcelable.ClassLoaderCreator<SavedState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                @NonNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9596c = parcel.readByte() != 0;
                this.f9597d = parcel.readByte() != 0;
                this.f9598e = parcel.readInt();
                this.f9599f = parcel.readFloat();
                this.f9600g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f9596c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9597d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9598e);
                parcel.writeFloat(this.f9599f);
                parcel.writeByte(this.f9600g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        @Override // p245kc.AbstractC7538a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.mo2604H(coordinatorLayout, view, motionEvent);
        }

        @Override // p245kc.C7540c
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ int mo11968I() {
            return super.mo11968I();
        }

        @Override // p245kc.C7540c
        /* JADX INFO: renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo11969K(int i10) {
            return super.mo11969K(i10);
        }

        @Override // p245kc.AbstractC7538a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: o */
        public /* bridge */ /* synthetic */ boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.mo2615o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.mo2616p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.mo2617q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void mo2621u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.mo2621u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo2624x(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.mo2624x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void mo2598B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2598B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable mo2599C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.mo2599C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.mo2601E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo2603G(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.mo2603G(coordinatorLayout, appBarLayout, view, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC7539b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: V */
        public static int m11970V(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0524c abstractC0524cM2632f = ((CoordinatorLayout.C0527f) appBarLayout.getLayoutParams()).m2632f();
            if (abstractC0524cM2632f instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC0524cM2632f).mo11936Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: A */
        public boolean mo2597A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout appBarLayoutMo11971L = mo11971L(coordinatorLayout.m2585r(view));
            if (appBarLayoutMo11971L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f28899d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutMo11971L.m11916o(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // p245kc.AbstractC7539b
        /* JADX INFO: renamed from: N */
        public float mo11972N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM11970V = m11970V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM11970V > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM11970V / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p245kc.AbstractC7539b
        /* JADX INFO: renamed from: P */
        public int mo11973P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo11973P(view);
        }

        /* JADX DEBUG: Method merged with bridge method: L(Ljava/util/List;)Landroid/view/View; */
        @Override // p245kc.AbstractC7539b
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo11971L(@NonNull List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: W */
        public final void m11975W(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.AbstractC0524c abstractC0524cM2632f = ((CoordinatorLayout.C0527f) view2.getLayoutParams()).m2632f();
            if (abstractC0524cM2632f instanceof BaseBehavior) {
                C0625o0.m3012X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0524cM2632f).f9591k) + m31188Q()) - m31186M(view2));
            }
        }

        /* JADX INFO: renamed from: X */
        public final void m11976X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m11912k()) {
                    appBarLayout.m11919r(appBarLayout.m11922u(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: i */
        public boolean mo2609i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: l */
        public boolean mo2612l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            m11975W(view, view2);
            m11976X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: m */
        public void mo2613m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                C0625o0.m3040m0(coordinatorLayout, null);
            }
        }

        @Override // p245kc.C7540c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.mo2616p(coordinatorLayout, view, i10);
        }

        @Override // p245kc.AbstractC7539b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: q */
        public /* bridge */ /* synthetic */ boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.mo2617q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26414e5);
            m31189S(typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26423f5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public interface InterfaceC2730a<T extends AppBarLayout> {
        /* JADX INFO: renamed from: a */
        void m11977a(T t8, int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static abstract class AbstractC2731b {
        /* JADX INFO: renamed from: a */
        public abstract void mo11978a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C2732c extends AbstractC2731b {

        /* JADX INFO: renamed from: a */
        public final Rect f9607a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f9608b = new Rect();

        /* JADX INFO: renamed from: b */
        public static void m11979b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC2731b
        /* JADX INFO: renamed from: a */
        public void mo11978a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10) {
            m11979b(this.f9607a, appBarLayout, view);
            float fAbs = this.f9607a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                C0625o0.m3054t0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fM42059b = 1.0f - C11162a.m42059b(Math.abs(fAbs / this.f9607a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f9607a.height() * 0.3f) * (1.0f - (fM42059b * fM42059b)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f9608b);
            this.f9608b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f9608b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            C0625o0.m3054t0(view, this.f9608b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11902a() {
        WeakReference<View> weakReference = this.f9580n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9580n = null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m11903b() {
        Drawable drawable = this.f9587u;
        if (drawable instanceof C6363g) {
            return Integer.valueOf(((C6363g) drawable).m27694A());
        }
        ColorStateList colorStateListM46208g = C12348c.m46208g(drawable);
        if (colorStateListM46208g != null) {
            return Integer.valueOf(colorStateListM46208g.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final View m11904c(View view) {
        int i10;
        if (this.f9580n == null && (i10 = this.f9579m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f9579m);
            }
            if (viewFindViewById != null) {
                this.f9580n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f9580n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2733d;
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2733d generateDefaultLayoutParams() {
        return new C2733d(-1, -2);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (m11921t()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f9567a);
            this.f9587u.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9587u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C2733d generateLayoutParams(AttributeSet attributeSet) {
        return new C2733d(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2733d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C2733d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2733d((ViewGroup.MarginLayoutParams) layoutParams) : new C2733d(layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public boolean m11908g() {
        return this.f9571e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0523b
    @NonNull
    public CoordinatorLayout.AbstractC0524c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f9590x = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iM2978A;
        int i10 = this.f9569c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = c2733d.f9609a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) c2733d).topMargin + ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iM2978A = C0625o0.m2978A(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iM2978A = measuredHeight - C0625o0.m2978A(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && C0625o0.m3059w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iM2978A;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f9569c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f9570d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iM2978A = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c2733d).topMargin + ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                int i12 = c2733d.f9609a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iM2978A += measuredHeight;
                if ((i12 & 2) != 0) {
                    iM2978A -= C0625o0.m2978A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iM2978A);
        this.f9570d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9579m;
    }

    public C6363g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C6363g) {
            return (C6363g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iM2978A = C0625o0.m2978A(this);
        if (iM2978A == 0) {
            int childCount = getChildCount();
            iM2978A = childCount >= 1 ? C0625o0.m2978A(getChildAt(childCount - 1)) : 0;
            if (iM2978A == 0) {
                return getHeight() / 3;
            }
        }
        return (iM2978A * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f9572f;
    }

    public Drawable getStatusBarForeground() {
        return this.f9587u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f9573g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f9568b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iM2978A = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C2733d c2733d = (C2733d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = c2733d.f9609a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iM2978A += measuredHeight + ((LinearLayout.LayoutParams) c2733d).topMargin + ((LinearLayout.LayoutParams) c2733d).bottomMargin;
                if (i11 == 0 && C0625o0.m3059w(childAt)) {
                    iM2978A -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iM2978A -= C0625o0.m2978A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iM2978A);
        this.f9568b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11909h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((C2733d) getChildAt(i10).getLayoutParams()).m11984e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m11910i() {
        return getTotalScrollRange() != 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m11911j() {
        Behavior behavior = this.f9590x;
        BaseBehavior.SavedState savedStateM11962x0 = (behavior == null || this.f9568b == -1 || this.f9572f != 0) ? null : behavior.m11962x0(AbsSavedState.f2809b, this);
        this.f9568b = -1;
        this.f9569c = -1;
        this.f9570d = -1;
        if (savedStateM11962x0 != null) {
            this.f9590x.m11961w0(savedStateM11962x0, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m11912k() {
        return this.f9578l;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11913l() {
        return getBackground() instanceof C6363g;
    }

    /* JADX INFO: renamed from: m */
    public void m11914m(int i10) {
        this.f9567a = i10;
        if (!willNotDraw()) {
            C0625o0.m3022d0(this);
        }
        List<InterfaceC2730a> list = this.f9574h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC2730a interfaceC2730a = this.f9574h.get(i11);
                if (interfaceC2730a != null) {
                    interfaceC2730a.m11977a(this, i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11915n() {
        this.f9572f = 0;
    }

    /* JADX INFO: renamed from: o */
    public void m11916o(boolean z10, boolean z11) {
        m11917p(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27759e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f9586t == null) {
            this.f9586t = new int[4];
        }
        int[] iArr = this.f9586t;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f9576j;
        int i11 = C6738b.f25890c0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f9577k) ? C6738b.f25892d0 : -C6738b.f25892d0;
        int i12 = C6738b.f25883Y;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f9577k) ? C6738b.f25882X : -C6738b.f25882X;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11902a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (C0625o0.m3059w(this) && m11923v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0625o0.m3012X(getChildAt(childCount), topInset);
            }
        }
        m11911j();
        this.f9571e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((C2733d) getChildAt(i14).getLayoutParams()).m11983d() != null) {
                this.f9571e = true;
                break;
            }
        }
        Drawable drawable = this.f9587u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f9575i) {
            return;
        }
        if (!this.f9578l && !m11909h()) {
            z11 = false;
        }
        m11918q(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && C0625o0.m3059w(this) && m11923v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C11162a.m42060c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m11911j();
    }

    /* JADX INFO: renamed from: p */
    public final void m11917p(boolean z10, boolean z11, boolean z12) {
        this.f9572f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11918q(boolean z10) {
        if (this.f9576j == z10) {
            return false;
        }
        this.f9576j = z10;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m11919r(boolean z10) {
        return m11920s(z10, !this.f9575i);
    }

    /* JADX INFO: renamed from: s */
    public boolean m11920s(boolean z10, boolean z11) {
        if (!z11 || this.f9577k == z10) {
            return false;
        }
        this.f9577k = z10;
        refreshDrawableState();
        if (!m11913l()) {
            return true;
        }
        if (this.f9581o) {
            m11924w(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f9578l) {
            return true;
        }
        m11924w(z10 ? 0.0f : this.f9589w, z10 ? this.f9589w : 0.0f);
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C6364h.m27758d(this, f10);
    }

    public void setExpanded(boolean z10) {
        m11916o(z10, C0625o0.m3006R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f9578l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f9579m = -1;
        if (view == null) {
            m11902a();
        } else {
            this.f9580n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f9579m = i10;
        m11902a();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f9575i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f9587u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f9587u = drawable != null ? drawable.mutate() : null;
            this.f9588v = m11903b();
            Drawable drawable3 = this.f9587u;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f9587u.setState(getDrawableState());
                }
                C10425a.m40116m(this.f9587u, C0625o0.m3065z(this));
                this.f9587u.setVisible(getVisibility() == 0, false);
                this.f9587u.setCallback(this);
            }
            m11925x();
            C0625o0.m3022d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C7399a.m30679b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        C7542e.m31195a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f9587u;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11921t() {
        return this.f9587u != null && getTopInset() > 0;
    }

    /* JADX INFO: renamed from: u */
    public boolean m11922u(View view) {
        View viewM11904c = m11904c(view);
        if (viewM11904c != null) {
            view = viewM11904c;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11923v() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !C0625o0.m3059w(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9587u;
    }

    /* JADX INFO: renamed from: w */
    public final void m11924w(float f10, float f11) {
        ValueAnimator valueAnimator = this.f9582p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f9582p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f9584r);
        this.f9582p.setInterpolator(this.f9585s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f9583q;
        if (animatorUpdateListener != null) {
            this.f9582p.addUpdateListener(animatorUpdateListener);
        }
        this.f9582p.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m11925x() {
        setWillNotDraw(!m11921t());
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C2733d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f9609a;

        /* JADX INFO: renamed from: b */
        public AbstractC2731b f9610b;

        /* JADX INFO: renamed from: c */
        public Interpolator f9611c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C2733d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9609a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26480m);
            this.f9609a = typedArrayObtainStyledAttributes.getInt(C6747k.f26498o, 0);
            m11985f(typedArrayObtainStyledAttributes.getInt(C6747k.f26489n, 0));
            int i10 = C6747k.f26507p;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f9611c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2731b m11980a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new C2732c();
        }

        /* JADX INFO: renamed from: b */
        public AbstractC2731b m11981b() {
            return this.f9610b;
        }

        /* JADX INFO: renamed from: c */
        public int m11982c() {
            return this.f9609a;
        }

        /* JADX INFO: renamed from: d */
        public Interpolator m11983d() {
            return this.f9611c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m11984e() {
            int i10 = this.f9609a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        /* JADX INFO: renamed from: f */
        public void m11985f(int i10) {
            this.f9610b = m11980a(i10);
        }

        /* JADX INFO: renamed from: g */
        public void m11986g(int i10) {
            this.f9609a = i10;
        }

        public C2733d(int i10, int i11) {
            super(i10, i11);
            this.f9609a = 1;
        }

        public C2733d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9609a = 1;
        }

        public C2733d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9609a = 1;
        }

        public C2733d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9609a = 1;
        }
    }
}
