package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1662a;
    public ViewTreeObserver b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f1663c;

    public b0(View view, Runnable runnable) {
        this.f1662a = view;
        this.b = view.getViewTreeObserver();
        this.f1663c = runnable;
    }

    public static b0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        b0 b0Var = new b0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b0Var);
        view.addOnAttachStateChangeListener(b0Var);
        return b0Var;
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.f1662a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1662a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1663c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
