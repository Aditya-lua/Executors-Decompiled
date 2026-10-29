package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import bd.h;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.mlkit.common.MlKitException;
import hc.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f7548s0 = j.f18944o;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f7549t0 = hc.b.F;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f7550u0 = hc.b.P;
    public Integer T;
    public final gd.g U;
    public Animator V;
    public Animator W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f7551a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f7552b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f7553c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f7554d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f7555e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f7556f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f7557g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f7558h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f7559i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ArrayList<g> f7560j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f7561k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f7562l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f7563m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Behavior f7564n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f7565o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f7566p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f7567q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public AnimatorListenerAdapter f7568r0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7575d;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7574c);
            parcel.writeInt(this.f7575d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7574c = parcel.readInt();
            this.f7575d = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.v0();
            BottomAppBar.this.V = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.w0();
        }
    }

    public class b extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7577a;

        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.v0();
            }
        }

        public b(int i10) {
            this.f7577a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.A0(this.f7577a));
            floatingActionButton.s(new a());
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.v0();
            BottomAppBar.this.f7562l0 = false;
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.w0();
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7580a;
        public final /* synthetic */ ActionMenuView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f7582d;

        public d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.b = actionMenuView;
            this.f7581c = i10;
            this.f7582d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7580a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7580a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f7561k0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.F0(bottomAppBar.f7561k0);
            BottomAppBar.this.L0(this.b, this.f7581c, this.f7582d, z10);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f7584a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f7585c;

        public e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f7584a = actionMenuView;
            this.b = i10;
            this.f7585c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f7584a;
            actionMenuView.setTranslationX(BottomAppBar.this.z0(actionMenuView, this.b, this.f7585c));
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f7568r0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonX0 = BottomAppBar.this.x0();
            if (floatingActionButtonX0 != null) {
                floatingActionButtonX0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private Drawable E0(Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable drawableR = q2.a.r(drawable.mutate());
        q2.a.n(drawableR, this.T.intValue());
        return drawableR;
    }

    public static void M0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f1730d = 17;
        int i10 = bottomAppBar.f7553c0;
        if (i10 == 1) {
            fVar.f1730d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f1730d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f7565o0;
    }

    private int getFabAlignmentAnimationDuration() {
        return h.f(getContext(), f7549t0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return A0(this.f7551a0);
    }

    private float getFabTranslationY() {
        if (this.f7553c0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        View viewY0 = y0();
        return viewY0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewY0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f7567q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f7566p0;
    }

    @NonNull
    private kc.b getTopEdgeTreatment() {
        return (kc.b) this.U.E().p();
    }

    public final float A0(int i10) {
        boolean zH = r.h(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewY0 = y0();
        return ((getMeasuredWidth() / 2) - ((zH ? this.f7567q0 : this.f7566p0) + ((this.f7555e0 == -1 || viewY0 == null) ? this.f7554d0 : (viewY0.getMeasuredWidth() / 2) + this.f7555e0))) * (zH ? -1 : 1);
    }

    public final boolean B0() {
        FloatingActionButton floatingActionButtonX0 = x0();
        return floatingActionButtonX0 != null && floatingActionButtonX0.p();
    }

    public final void C0(int i10, boolean z10) {
        if (!o0.R(this)) {
            this.f7562l0 = false;
            F0(this.f7561k0);
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!B0()) {
            i10 = 0;
            z10 = false;
        }
        u0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.W = animatorSet;
        animatorSet.addListener(new c());
        this.W.start();
    }

    public final void D0(int i10) {
        if (this.f7551a0 == i10 || !o0.R(this)) {
            return;
        }
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f7552b0 == 1) {
            t0(i10, arrayList);
        } else {
            s0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(h.g(getContext(), f7550u0, ic.a.f20471a));
        this.V = animatorSet;
        animatorSet.addListener(new a());
        this.V.start();
    }

    public void F0(int i10) {
        if (i10 != 0) {
            this.f7561k0 = 0;
            getMenu().clear();
            y(i10);
        }
    }

    public final void G0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B0()) {
            K0(actionMenuView, this.f7551a0, this.f7563m0);
        } else {
            K0(actionMenuView, 0, false);
        }
    }

    public final void H0() {
        getTopEdgeTreatment().q(getFabTranslationX());
        this.U.b0((this.f7563m0 && B0() && this.f7553c0 == 1) ? 1.0f : 0.0f);
        View viewY0 = y0();
        if (viewY0 != null) {
            viewY0.setTranslationY(getFabTranslationY());
            viewY0.setTranslationX(getFabTranslationX());
        }
    }

    public void I0(int i10, int i11) {
        this.f7561k0 = i11;
        this.f7562l0 = true;
        C0(i10, this.f7563m0);
        D0(i10);
        this.f7551a0 = i10;
    }

    public boolean J0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().i()) {
            return false;
        }
        getTopEdgeTreatment().p(f10);
        this.U.invalidateSelf();
        return true;
    }

    public final void K0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        L0(actionMenuView, i10, z10, false);
    }

    public final void L0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.U.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f7551a0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f7555e0;
    }

    public int getFabAnchorMode() {
        return this.f7553c0;
    }

    public int getFabAnimationMode() {
        return this.f7552b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.f7558h0;
    }

    public int getMenuAlignmentMode() {
        return this.f7556f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gd.h.f(this, this.U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            r0();
            H0();
            final View viewY0 = y0();
            if (viewY0 != null && o0.R(viewY0)) {
                viewY0.post(new Runnable() { // from class: kc.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewY0.requestLayout();
                    }
                });
            }
        }
        G0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f7551a0 = savedState.f7574c;
        this.f7563m0 = savedState.f7575d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7574c = this.f7551a0;
        savedState.f7575d = this.f7563m0;
        return savedState;
    }

    public final void q0(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f7568r0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    public final void r0() {
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void s0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonX0 = x0();
        if (floatingActionButtonX0 == null || floatingActionButtonX0.o()) {
            return;
        }
        w0();
        floatingActionButtonX0.m(new b(i10));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        q2.a.o(this.U, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().j(f10);
            this.U.invalidateSelf();
            H0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.U.Z(f10);
        getBehavior().M(this, this.U.D() - this.U.C());
    }

    public void setFabAlignmentMode(int i10) {
        I0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f7555e0 != i10) {
            this.f7555e0 = i10;
            H0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f7553c0 = i10;
        H0();
        View viewY0 = y0();
        if (viewY0 != null) {
            M0(this, viewY0);
            viewY0.requestLayout();
            this.U.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f7552b0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().k(f10);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().n(f10);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().o(f10);
            this.U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f7558h0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f7556f0 != i10) {
            this.f7556f0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                K0(actionMenuView, this.f7551a0, B0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(E0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t0(int i10, @NonNull List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(x0(), "translationX", A0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    public final void u0(int i10, boolean z10, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - z0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void v0() {
        ArrayList<g> arrayList;
        int i10 = this.f7559i0 - 1;
        this.f7559i0 = i10;
        if (i10 != 0 || (arrayList = this.f7560j0) == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            g gVar = arrayList.get(i11);
            i11++;
            gVar.a(this);
        }
    }

    public final void w0() {
        ArrayList<g> arrayList;
        int i10 = this.f7559i0;
        this.f7559i0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f7560j0) == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            g gVar = arrayList.get(i11);
            i11++;
            gVar.b(this);
        }
    }

    public final FloatingActionButton x0() {
        View viewY0 = y0();
        if (viewY0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewY0;
        }
        return null;
    }

    public final View y0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public int z0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f7556f0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zH = r.h(this);
        int measuredWidth = zH ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f20874a & 8388615) == 8388611) {
                measuredWidth = zH ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zH ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zH ? this.f7566p0 : -this.f7567q0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(hc.d.f18834m);
            if (!zH) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.f7564n0 == null) {
            this.f7564n0 = new Behavior();
        }
        return this.f7564n0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        public final Rect f7569m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference<BottomAppBar> f7570n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7571o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final View.OnLayoutChangeListener f7572p;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f7570n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f7569m);
                    int iHeight = Behavior.this.f7569m.height();
                    bottomAppBar.J0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f7569m)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f7571o == 0) {
                    if (bottomAppBar.f7553c0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(hc.d.N) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (r.h(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f7554d0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f7554d0;
                    }
                }
                bottomAppBar.H0();
            }
        }

        public Behavior() {
            this.f7572p = new a();
            this.f7569m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i10) {
            this.f7570n = new WeakReference<>(bottomAppBar);
            View viewY0 = bottomAppBar.y0();
            if (viewY0 != null && !o0.R(viewY0)) {
                BottomAppBar.M0(bottomAppBar, viewY0);
                this.f7571o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewY0.getLayoutParams())).bottomMargin;
                if (viewY0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewY0;
                    if (bottomAppBar.f7553c0 == 0 && bottomAppBar.f7557g0) {
                        o0.u0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(hc.a.b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(hc.a.f18765a);
                    }
                    bottomAppBar.q0(floatingActionButton);
                }
                viewY0.addOnLayoutChangeListener(this.f7572p);
                bottomAppBar.H0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7572p = new a();
            this.f7569m = new Rect();
        }
    }
}
