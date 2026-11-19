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
import dd.h;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f7439j = jc.b.F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7440k = jc.b.I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7441l = jc.b.P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7442a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f7444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f7445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f7449i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7449i = null;
        }
    }

    public interface b {
        void a(@NonNull View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7442a = new LinkedHashSet<>();
        this.f7446f = 0;
        this.f7447g = 2;
        this.f7448h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, @NonNull View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void J(@NonNull V v8, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f7449i = v8.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public boolean K() {
        return this.f7447g == 1;
    }

    public boolean L() {
        return this.f7447g == 2;
    }

    public void M(@NonNull V v8, int i10) {
        this.f7448h = i10;
        if (this.f7447g == 1) {
            v8.setTranslationY(this.f7446f + i10);
        }
    }

    public void N(@NonNull V v8) {
        O(v8, true);
    }

    public void O(@NonNull V v8, boolean z10) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7449i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        R(v8, 1);
        int i10 = this.f7446f + this.f7448h;
        if (z10) {
            J(v8, i10, this.f7443c, this.f7445e);
        } else {
            v8.setTranslationY(i10);
        }
    }

    public void P(@NonNull V v8) {
        Q(v8, true);
    }

    public void Q(@NonNull V v8, boolean z10) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7449i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        R(v8, 2);
        if (z10) {
            J(v8, 0, this.b, this.f7444d);
        } else {
            v8.setTranslationY(0);
        }
    }

    public final void R(@NonNull V v8, int i10) {
        this.f7447g = i10;
        Iterator<b> it = this.f7442a.iterator();
        while (it.hasNext()) {
            it.next().a(v8, this.f7447g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        this.f7446f = v8.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v8.getLayoutParams()).bottomMargin;
        this.b = h.f(v8.getContext(), f7439j, 225);
        this.f7443c = h.f(v8.getContext(), f7440k, 175);
        Context context = v8.getContext();
        int i11 = f7441l;
        this.f7444d = h.g(context, i11, kc.a.f21327d);
        this.f7445e = h.g(v8.getContext(), i11, kc.a.f21326c);
        return super.p(coordinatorLayout, v8, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i11 > 0) {
            N(v8);
        } else if (i11 < 0) {
            P(v8);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7442a = new LinkedHashSet<>();
        this.f7446f = 0;
        this.f7447g = 2;
        this.f7448h = 0;
    }
}
