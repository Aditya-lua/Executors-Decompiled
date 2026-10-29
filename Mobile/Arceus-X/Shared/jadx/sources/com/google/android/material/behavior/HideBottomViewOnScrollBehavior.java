package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cd.C1627h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p194ic.C6738b;
import p216jc.C7137a;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0524c<V> {

    /* JADX INFO: renamed from: j */
    public static final int f9619j = C6738b.f25864F;

    /* JADX INFO: renamed from: k */
    public static final int f9620k = C6738b.f25867I;

    /* JADX INFO: renamed from: l */
    public static final int f9621l = C6738b.f25874P;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinkedHashSet<InterfaceC2735b> f9622a;

    /* JADX INFO: renamed from: b */
    public int f9623b;

    /* JADX INFO: renamed from: c */
    public int f9624c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f9625d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f9626e;

    /* JADX INFO: renamed from: f */
    public int f9627f;

    /* JADX INFO: renamed from: g */
    public int f9628g;

    /* JADX INFO: renamed from: h */
    public int f9629h;

    /* JADX INFO: renamed from: i */
    public ViewPropertyAnimator f9630i;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C2734a extends AnimatorListenerAdapter {
        public C2734a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f9630i = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    public interface InterfaceC2735b {
        /* JADX INFO: renamed from: a */
        void m12003a(@NonNull View view, int i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HideBottomViewOnScrollBehavior() {
        this.f9622a = new LinkedHashSet<>();
        this.f9627f = 0;
        this.f9628g = 2;
        this.f9629h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: E */
    public boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    /* JADX INFO: renamed from: J */
    public final void m11994J(@NonNull V v5, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f9630i = v5.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new C2734a());
    }

    /* JADX INFO: renamed from: K */
    public boolean m11995K() {
        return this.f9628g == 1;
    }

    /* JADX INFO: renamed from: L */
    public boolean m11996L() {
        return this.f9628g == 2;
    }

    /* JADX INFO: renamed from: M */
    public void m11997M(@NonNull V v5, int i10) {
        this.f9629h = i10;
        if (this.f9628g == 1) {
            v5.setTranslationY(this.f9627f + i10);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m11998N(@NonNull V v5) {
        m11999O(v5, true);
    }

    /* JADX INFO: renamed from: O */
    public void m11999O(@NonNull V v5, boolean z10) {
        if (m11995K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9630i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        m12002R(v5, 1);
        int i10 = this.f9627f + this.f9629h;
        if (z10) {
            m11994J(v5, i10, this.f9624c, this.f9626e);
        } else {
            v5.setTranslationY(i10);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m12000P(@NonNull V v5) {
        m12001Q(v5, true);
    }

    /* JADX INFO: renamed from: Q */
    public void m12001Q(@NonNull V v5, boolean z10) {
        if (m11996L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9630i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        m12002R(v5, 2);
        if (z10) {
            m11994J(v5, 0, this.f9623b, this.f9625d);
        } else {
            v5.setTranslationY(0);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m12002R(@NonNull V v5, int i10) {
        this.f9628g = i10;
        Iterator<InterfaceC2735b> it = this.f9622a.iterator();
        while (it.hasNext()) {
            it.next().m12003a(v5, this.f9628g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        this.f9627f = v5.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v5.getLayoutParams()).bottomMargin;
        this.f9623b = C1627h.m8223f(v5.getContext(), f9619j, 225);
        this.f9624c = C1627h.m8223f(v5.getContext(), f9620k, 175);
        Context context = v5.getContext();
        int i11 = f9621l;
        this.f9625d = C1627h.m8224g(context, i11, C7137a.f27787d);
        this.f9626e = C1627h.m8224g(v5.getContext(), i11, C7137a.f27786c);
        return super.mo2616p(coordinatorLayout, v5, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: x */
    public void mo2624x(CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            m11998N(v5);
        } else if (i11 < 0) {
            m12000P(v5);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9622a = new LinkedHashSet<>();
        this.f9627f = 0;
        this.f9628g = 2;
        this.f9629h = 0;
    }
}
