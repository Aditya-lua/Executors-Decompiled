package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: androidx.core.view.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0586b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final View f2358a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f2359b;

    /* JADX INFO: renamed from: c */
    private final Runnable f2360c;

    public ViewTreeObserverOnPreDrawListenerC0586b0(View view, Runnable runnable) {
        this.f2358a = view;
        this.f2359b = view.getViewTreeObserver();
        this.f2360c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0586b0 m2815a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0586b0 viewTreeObserverOnPreDrawListenerC0586b0 = new ViewTreeObserverOnPreDrawListenerC0586b0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0586b0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0586b0);
        return viewTreeObserverOnPreDrawListenerC0586b0;
    }

    /* JADX INFO: renamed from: b */
    public void m2816b() {
        if (this.f2359b.isAlive()) {
            this.f2359b.removeOnPreDrawListener(this);
        } else {
            this.f2358a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2358a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2816b();
        this.f2360c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2359b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2816b();
    }
}
