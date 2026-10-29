package ga;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import fb.s0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17960a;
    public final fb.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f17961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17962d = false;

    public i(c cVar, int i10) {
        this.f17960a = cVar;
        this.b = new fb.d(i10, null);
    }

    public static i b(c cVar, int i10) {
        return new i(cVar, i10);
    }

    @Override // ga.l
    public final void a(Activity activity) {
        View decorView;
        try {
            decorView = activity.findViewById(R.id.content);
        } catch (IllegalStateException unused) {
            decorView = null;
        }
        if (decorView == null && (decorView = activity.getWindow().getDecorView()) == null) {
            s0.d("PopupManager", "Failed to bind to: ".concat(String.valueOf(activity)));
        } else {
            s0.c("PopupManager", "Binding to: ".concat(String.valueOf(activity)));
            f(decorView);
        }
    }

    public final Bundle c() {
        return this.b.a();
    }

    public final IBinder d() {
        return this.b.f16517a;
    }

    public final fb.d e() {
        return this.b;
    }

    @TargetApi(16)
    public final void f(View view) {
        c cVar = this.f17960a;
        cVar.j();
        WeakReference weakReference = this.f17961c;
        if (weakReference != null) {
            View decorView = (View) weakReference.get();
            Context context = cVar.getContext();
            if (decorView == null && (context instanceof Activity)) {
                decorView = ((Activity) context).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (u9.m.b()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f17961c = null;
        Context context2 = cVar.getContext();
        if (view == null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            try {
                view = activity.findViewById(R.id.content);
            } catch (IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            s0.d("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            s0.f("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        h(view);
        this.f17961c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void g() {
        boolean z10;
        fb.d dVar = this.b;
        IBinder iBinder = dVar.f16517a;
        if (iBinder != null) {
            this.f17960a.i(iBinder, dVar.a());
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17962d = z10;
    }

    @TargetApi(17)
    public final void h(View view) {
        Display display;
        int displayId = -1;
        if (u9.m.c() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        fb.d dVar = this.b;
        dVar.f16518c = displayId;
        dVar.f16517a = windowToken;
        int i10 = iArr[0];
        dVar.f16519d = i10;
        int i11 = iArr[1];
        dVar.f16520e = i11;
        dVar.f16521f = i10 + width;
        dVar.f16522g = i11 + height;
        if (this.f17962d) {
            g();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.f17961c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        h(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17960a.j();
        view.removeOnAttachStateChangeListener(this);
    }
}
