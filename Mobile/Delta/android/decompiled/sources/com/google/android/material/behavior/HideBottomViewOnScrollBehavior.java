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
import bd.h;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f7521j = hc.b.F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7522k = hc.b.I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7523l = hc.b.P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7524a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f7527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f7531i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7531i = null;
        }
    }

    public interface b {
        void a(@NonNull View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7524a = new LinkedHashSet<>();
        this.f7528f = 0;
        this.f7529g = 2;
        this.f7530h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void J(@NonNull V v5, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f7531i = v5.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public boolean K() {
        return this.f7529g == 1;
    }

    public boolean L() {
        return this.f7529g == 2;
    }

    public void M(@NonNull V v5, int i10) {
        this.f7530h = i10;
        if (this.f7529g == 1) {
            v5.setTranslationY(this.f7528f + i10);
        }
    }

    public void N(@NonNull V v5) {
        O(v5, true);
    }

    public void O(@NonNull V v5, boolean z10) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7531i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        R(v5, 1);
        int i10 = this.f7528f + this.f7530h;
        if (z10) {
            J(v5, i10, this.f7525c, this.f7527e);
        } else {
            v5.setTranslationY(i10);
        }
    }

    public void P(@NonNull V v5) {
        Q(v5, true);
    }

    public void Q(@NonNull V v5, boolean z10) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7531i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        R(v5, 2);
        if (z10) {
            J(v5, 0, this.b, this.f7526d);
        } else {
            v5.setTranslationY(0);
        }
    }

    public final void R(@NonNull V v5, int i10) {
        this.f7529g = i10;
        Iterator<b> it = this.f7524a.iterator();
        while (it.hasNext()) {
            it.next().a(v5, this.f7529g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        this.f7528f = v5.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v5.getLayoutParams()).bottomMargin;
        this.b = h.f(v5.getContext(), f7521j, 225);
        this.f7525c = h.f(v5.getContext(), f7522k, 175);
        Context context = v5.getContext();
        int i11 = f7523l;
        this.f7526d = h.g(context, i11, ic.a.f20473d);
        this.f7527e = h.g(v5.getContext(), i11, ic.a.f20472c);
        return super.p(coordinatorLayout, v5, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            N(v5);
        } else if (i11 < 0) {
            P(v5);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7524a = new LinkedHashSet<>();
        this.f7528f = 0;
        this.f7529g = 2;
        this.f7530h = 0;
    }
}
