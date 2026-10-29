package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f1927a;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z0 f1928a;
        public final /* synthetic */ View b;

        public a(z0 z0Var, View view) {
            this.f1928a = z0Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1928a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1928a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1928a.c(this.b);
        }
    }

    public y0(View view) {
        this.f1927a = new WeakReference<>(view);
    }

    public y0 b(float f10) {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1927a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public y0 e(long j10) {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public y0 f(Interpolator interpolator) {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y0 g(z0 z0Var) {
        View view = this.f1927a.get();
        if (view != null) {
            h(view, z0Var);
        }
        return this;
    }

    public final void h(View view, z0 z0Var) {
        if (z0Var != null) {
            view.animate().setListener(new a(z0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y0 i(long j10) {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public y0 j(final b1 b1Var) {
        final View view = this.f1927a.get();
        if (view != null) {
            view.animate().setUpdateListener(b1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.x0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    b1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y0 l(float f10) {
        View view = this.f1927a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
