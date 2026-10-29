package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0645y0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f2499a;

    /* JADX INFO: renamed from: androidx.core.view.y0$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0647z0 f2500a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2501b;

        public a(InterfaceC0647z0 interfaceC0647z0, View view) {
            this.f2500a = interfaceC0647z0;
            this.f2501b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2500a.mo2027a(this.f2501b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2500a.mo2028b(this.f2501b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2500a.mo2029c(this.f2501b);
        }
    }

    public C0645y0(View view) {
        this.f2499a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: b */
    public C0645y0 m3225b(float f10) {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m3226c() {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m3227d() {
        View view = this.f2499a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public C0645y0 m3228e(long j10) {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0645y0 m3229f(Interpolator interpolator) {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0645y0 m3230g(InterfaceC0647z0 interfaceC0647z0) {
        View view = this.f2499a.get();
        if (view != null) {
            m3231h(view, interfaceC0647z0);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m3231h(View view, InterfaceC0647z0 interfaceC0647z0) {
        if (interfaceC0647z0 != null) {
            view.animate().setListener(new a(interfaceC0647z0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: i */
    public C0645y0 m3232i(long j10) {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0645y0 m3233j(final InterfaceC0587b1 interfaceC0587b1) {
        final View view = this.f2499a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0587b1 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.x0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC0587b1.mo2817a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m3234k() {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: l */
    public C0645y0 m3235l(float f10) {
        View view = this.f2499a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
