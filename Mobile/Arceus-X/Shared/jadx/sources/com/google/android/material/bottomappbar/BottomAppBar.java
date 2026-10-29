package com.google.android.material.bottomappbar;

import ad.C0146r;
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
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import androidx.customview.view.AbsSavedState;
import cd.C1627h;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.mlkit.common.MlKitException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import lc.C8125b;
import p168hd.C6363g;
import p168hd.C6364h;
import p194ic.C6737a;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6746j;
import p216jc.C7137a;
import p368q2.C10425a;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0523b {

    /* JADX INFO: renamed from: s0 */
    public static final int f9650s0 = C6746j.f26123o;

    /* JADX INFO: renamed from: t0 */
    public static final int f9651t0 = C6738b.f25864F;

    /* JADX INFO: renamed from: u0 */
    public static final int f9652u0 = C6738b.f25874P;

    /* JADX INFO: renamed from: T */
    public Integer f9653T;

    /* JADX INFO: renamed from: U */
    public final C6363g f9654U;

    /* JADX INFO: renamed from: V */
    public Animator f9655V;

    /* JADX INFO: renamed from: W */
    public Animator f9656W;

    /* JADX INFO: renamed from: a0 */
    public int f9657a0;

    /* JADX INFO: renamed from: b0 */
    public int f9658b0;

    /* JADX INFO: renamed from: c0 */
    public int f9659c0;

    /* JADX INFO: renamed from: d0 */
    public final int f9660d0;

    /* JADX INFO: renamed from: e0 */
    public int f9661e0;

    /* JADX INFO: renamed from: f0 */
    public int f9662f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f9663g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f9664h0;

    /* JADX INFO: renamed from: i0 */
    public int f9665i0;

    /* JADX INFO: renamed from: j0 */
    public ArrayList<InterfaceC2748g> f9666j0;

    /* JADX INFO: renamed from: k0 */
    public int f9667k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f9668l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f9669m0;

    /* JADX INFO: renamed from: n0 */
    public Behavior f9670n0;

    /* JADX INFO: renamed from: o0 */
    public int f9671o0;

    /* JADX INFO: renamed from: p0 */
    public int f9672p0;

    /* JADX INFO: renamed from: q0 */
    public int f9673q0;

    /* JADX INFO: renamed from: r0 */
    @NonNull
    public AnimatorListenerAdapter f9674r0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2741a();

        /* JADX INFO: renamed from: c */
        public int f9680c;

        /* JADX INFO: renamed from: d */
        public boolean f9681d;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public class C2741a implements Parcelable.ClassLoaderCreator<SavedState> {
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
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9680c);
            parcel.writeInt(this.f9681d ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9680c = parcel.readInt();
            this.f9681d = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C2742a extends AnimatorListenerAdapter {
        public C2742a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m12065v0();
            BottomAppBar.this.f9655V = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m12066w0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C2743b extends FloatingActionButton.AbstractC2812b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9683a;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        public class a extends FloatingActionButton.AbstractC2812b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC2812b
            /* JADX INFO: renamed from: b */
            public void mo12079b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m12065v0();
            }
        }

        public C2743b(int i10) {
            this.f9683a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC2812b
        /* JADX INFO: renamed from: a */
        public void mo12078a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m12049A0(this.f9683a));
            floatingActionButton.m12759s(new a());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C2744c extends AnimatorListenerAdapter {
        public C2744c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m12065v0();
            BottomAppBar.this.f9668l0 = false;
            BottomAppBar.this.f9656W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m12066w0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C2745d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f9687a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ActionMenuView f9688b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f9689c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f9690d;

        public C2745d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9688b = actionMenuView;
            this.f9689c = i10;
            this.f9690d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9687a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9687a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f9667k0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m12053F0(bottomAppBar.f9667k0);
            BottomAppBar.this.m12059L0(this.f9688b, this.f9689c, this.f9690d, z10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class RunnableC2746e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionMenuView f9692a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f9693b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f9694c;

        public RunnableC2746e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9692a = actionMenuView;
            this.f9693b = i10;
            this.f9694c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f9692a;
            actionMenuView.setTranslationX(BottomAppBar.this.m12069z0(actionMenuView, this.f9693b, this.f9694c));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C2747f extends AnimatorListenerAdapter {
        public C2747f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f9674r0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonM12067x0 = BottomAppBar.this.m12067x0();
            if (floatingActionButtonM12067x0 != null) {
                floatingActionButtonM12067x0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public interface InterfaceC2748g {
        /* JADX INFO: renamed from: a */
        void m12080a(BottomAppBar bottomAppBar);

        /* JADX INFO: renamed from: b */
        void m12081b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: renamed from: E0 */
    private Drawable m12026E0(Drawable drawable) {
        if (drawable == null || this.f9653T == null) {
            return drawable;
        }
        Drawable drawableM40121r = C10425a.m40121r(drawable.mutate());
        C10425a.m40117n(drawableM40121r, this.f9653T.intValue());
        return drawableM40121r;
    }

    /* JADX INFO: renamed from: M0 */
    public static void m12027M0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.C0527f c0527f = (CoordinatorLayout.C0527f) view.getLayoutParams();
        c0527f.f2249d = 17;
        int i10 = bottomAppBar.f9659c0;
        if (i10 == 1) {
            c0527f.f2249d = 17 | 48;
        }
        if (i10 == 0) {
            c0527f.f2249d |= 80;
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
        return this.f9671o0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C1627h.m8223f(getContext(), f9651t0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m12049A0(this.f9657a0);
    }

    private float getFabTranslationY() {
        if (this.f9659c0 == 1) {
            return -getTopEdgeTreatment().m33327c();
        }
        View viewM12068y0 = m12068y0();
        return viewM12068y0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewM12068y0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f9673q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f9672p0;
    }

    @NonNull
    private C8125b getTopEdgeTreatment() {
        return (C8125b) this.f9654U.m27698E().m27777p();
    }

    /* JADX INFO: renamed from: A0 */
    public final float m12049A0(int i10) {
        boolean zM453h = C0146r.m453h(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewM12068y0 = m12068y0();
        return ((getMeasuredWidth() / 2) - ((zM453h ? this.f9673q0 : this.f9672p0) + ((this.f9661e0 == -1 || viewM12068y0 == null) ? this.f9660d0 : (viewM12068y0.getMeasuredWidth() / 2) + this.f9661e0))) * (zM453h ? -1 : 1);
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m12050B0() {
        FloatingActionButton floatingActionButtonM12067x0 = m12067x0();
        return floatingActionButtonM12067x0 != null && floatingActionButtonM12067x0.m12756p();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m12051C0(int i10, boolean z10) {
        if (!C0625o0.m3006R(this)) {
            this.f9668l0 = false;
            m12053F0(this.f9667k0);
            return;
        }
        Animator animator = this.f9656W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m12050B0()) {
            i10 = 0;
            z10 = false;
        }
        m12064u0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9656W = animatorSet;
        animatorSet.addListener(new C2744c());
        this.f9656W.start();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12052D0(int i10) {
        if (this.f9657a0 == i10 || !C0625o0.m3006R(this)) {
            return;
        }
        Animator animator = this.f9655V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f9658b0 == 1) {
            m12063t0(i10, arrayList);
        } else {
            m12062s0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(C1627h.m8224g(getContext(), f9652u0, C7137a.f27784a));
        this.f9655V = animatorSet;
        animatorSet.addListener(new C2742a());
        this.f9655V.start();
    }

    /* JADX INFO: renamed from: F0 */
    public void m12053F0(int i10) {
        if (i10 != 0) {
            this.f9667k0 = 0;
            getMenu().clear();
            mo1935y(i10);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m12054G0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f9656W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m12050B0()) {
            m12058K0(actionMenuView, this.f9657a0, this.f9669m0);
        } else {
            m12058K0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m12055H0() {
        getTopEdgeTreatment().m33337q(getFabTranslationX());
        this.f9654U.m27720b0((this.f9669m0 && m12050B0() && this.f9659c0 == 1) ? 1.0f : 0.0f);
        View viewM12068y0 = m12068y0();
        if (viewM12068y0 != null) {
            viewM12068y0.setTranslationY(getFabTranslationY());
            viewM12068y0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m12056I0(int i10, int i11) {
        this.f9667k0 = i11;
        this.f9668l0 = true;
        m12051C0(i10, this.f9669m0);
        m12052D0(i10);
        this.f9657a0 = i10;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m12057J0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().m33331i()) {
            return false;
        }
        getTopEdgeTreatment().m33336p(f10);
        this.f9654U.invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m12058K0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        m12059L0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m12059L0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        RunnableC2746e runnableC2746e = new RunnableC2746e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(runnableC2746e);
        } else {
            runnableC2746e.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f9654U.m27702I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m33327c();
    }

    public int getFabAlignmentMode() {
        return this.f9657a0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f9661e0;
    }

    public int getFabAnchorMode() {
        return this.f9659c0;
    }

    public int getFabAnimationMode() {
        return this.f9658b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m33329f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m33330h();
    }

    public boolean getHideOnScroll() {
        return this.f9664h0;
    }

    public int getMenuAlignmentMode() {
        return this.f9662f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27760f(this, this.f9654U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m12061r0();
            m12055H0();
            final View viewM12068y0 = m12068y0();
            if (viewM12068y0 != null && C0625o0.m3006R(viewM12068y0)) {
                viewM12068y0.post(new Runnable() { // from class: lc.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewM12068y0.requestLayout();
                    }
                });
            }
        }
        m12054G0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        this.f9657a0 = savedState.f9680c;
        this.f9669m0 = savedState.f9681d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9680c = this.f9657a0;
        savedState.f9681d = this.f9669m0;
        return savedState;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m12060q0(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.m12745e(this.f9674r0);
        floatingActionButton.m12746f(new C2747f());
        floatingActionButton.m12747g(null);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12061r0() {
        Animator animator = this.f9656W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f9655V;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m12062s0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonM12067x0 = m12067x0();
        if (floatingActionButtonM12067x0 == null || floatingActionButtonM12067x0.m12755o()) {
            return;
        }
        m12066w0();
        floatingActionButtonM12067x0.m12753m(new C2743b(i10));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C10425a.m40118o(this.f9654U, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m33332j(f10);
            this.f9654U.invalidateSelf();
            m12055H0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f9654U.m27718Z(f10);
        getBehavior().m11997M(this, this.f9654U.m27697D() - this.f9654U.m27696C());
    }

    public void setFabAlignmentMode(int i10) {
        m12056I0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f9661e0 != i10) {
            this.f9661e0 = i10;
            m12055H0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f9659c0 = i10;
        m12055H0();
        View viewM12068y0 = m12068y0();
        if (viewM12068y0 != null) {
            m12027M0(this, viewM12068y0);
            viewM12068y0.requestLayout();
            this.f9654U.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f9658b0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().m33328e()) {
            getTopEdgeTreatment().m33333k(f10);
            this.f9654U.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m33334n(f10);
            this.f9654U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m33335o(f10);
            this.f9654U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f9664h0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f9662f0 != i10) {
            this.f9662f0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m12058K0(actionMenuView, this.f9657a0, m12050B0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m12026E0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f9653T = Integer.valueOf(i10);
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

    /* JADX INFO: renamed from: t0 */
    public final void m12063t0(int i10, @NonNull List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m12067x0(), "translationX", m12049A0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12064u0(int i10, boolean z10, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - m12069z0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new C2745d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12065v0() {
        ArrayList<InterfaceC2748g> arrayList;
        int i10 = this.f9665i0 - 1;
        this.f9665i0 = i10;
        if (i10 != 0 || (arrayList = this.f9666j0) == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            InterfaceC2748g interfaceC2748g = arrayList.get(i11);
            i11++;
            interfaceC2748g.m12080a(this);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m12066w0() {
        ArrayList<InterfaceC2748g> arrayList;
        int i10 = this.f9665i0;
        this.f9665i0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f9666j0) == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            InterfaceC2748g interfaceC2748g = arrayList.get(i11);
            i11++;
            interfaceC2748g.m12081b(this);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final FloatingActionButton m12067x0() {
        View viewM12068y0 = m12068y0();
        if (viewM12068y0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewM12068y0;
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public final View m12068y0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m2586s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public int m12069z0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f9662f0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zM453h = C0146r.m453h(this);
        int measuredWidth = zM453h ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0480g) && (((Toolbar.C0480g) childAt.getLayoutParams()).f27268a & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = zM453h ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zM453h ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zM453h ? this.f9672p0 : -this.f9673q0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C6740d.f25980m);
            if (!zM453h) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c; */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0523b
    @NonNull
    public Behavior getBehavior() {
        if (this.f9670n0 == null) {
            this.f9670n0 = new Behavior();
        }
        return this.f9670n0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: m */
        @NonNull
        public final Rect f9675m;

        /* JADX INFO: renamed from: n */
        public WeakReference<BottomAppBar> f9676n;

        /* JADX INFO: renamed from: o */
        public int f9677o;

        /* JADX INFO: renamed from: p */
        public final View.OnLayoutChangeListener f9678p;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC2740a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC2740a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f9676n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m12750j(Behavior.this.f9675m);
                    int iHeight = Behavior.this.f9675m.height();
                    bottomAppBar.m12057J0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m27779r().mo27683a(new RectF(Behavior.this.f9675m)));
                    height = iHeight;
                }
                CoordinatorLayout.C0527f c0527f = (CoordinatorLayout.C0527f) view.getLayoutParams();
                if (Behavior.this.f9677o == 0) {
                    if (bottomAppBar.f9659c0 == 1) {
                        ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C6740d.f25943N) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) c0527f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0527f).rightMargin = bottomAppBar.getRightInset();
                    if (C0146r.m453h(view)) {
                        ((ViewGroup.MarginLayoutParams) c0527f).leftMargin += bottomAppBar.f9660d0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0527f).rightMargin += bottomAppBar.f9660d0;
                    }
                }
                bottomAppBar.m12055H0();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
            this.f9678p = new ViewOnLayoutChangeListenerC2740a();
            this.f9675m = new Rect();
        }

        /* JADX DEBUG: Method merged with bridge method: p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i10) {
            this.f9676n = new WeakReference<>(bottomAppBar);
            View viewM12068y0 = bottomAppBar.m12068y0();
            if (viewM12068y0 != null && !C0625o0.m3006R(viewM12068y0)) {
                BottomAppBar.m12027M0(bottomAppBar, viewM12068y0);
                this.f9677o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0527f) viewM12068y0.getLayoutParams())).bottomMargin;
                if (viewM12068y0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewM12068y0;
                    if (bottomAppBar.f9659c0 == 0 && bottomAppBar.f9663g0) {
                        C0625o0.m3056u0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C6737a.f25856b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C6737a.f25855a);
                    }
                    bottomAppBar.m12060q0(floatingActionButton);
                }
                viewM12068y0.addOnLayoutChangeListener(this.f9678p);
                bottomAppBar.m12055H0();
            }
            coordinatorLayout.m2565I(bottomAppBar, i10);
            return super.mo2616p(coordinatorLayout, bottomAppBar, i10);
        }

        /* JADX DEBUG: Method merged with bridge method: E(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.mo2601E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9678p = new ViewOnLayoutChangeListenerC2740a();
            this.f9675m = new Rect();
        }
    }
}
