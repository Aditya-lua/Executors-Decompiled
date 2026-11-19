package ha;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import gb.t0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18136a;
    public final gb.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f18137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18138d = false;

    public i(c cVar, int i10) {
        this.f18136a = cVar;
        this.b = new gb.d(i10, null);
    }

    public static i b(c cVar, int i10) {
        return new i(cVar, i10);
    }

    @Override // ha.l
    public final void a(Activity activity) {
        View decorView;
        try {
            decorView = activity.findViewById(R.id.content);
        } catch (IllegalStateException unused) {
            decorView = null;
        }
        if (decorView == null && (decorView = activity.getWindow().getDecorView()) == null) {
            t0.d("PopupManager", "Failed to bind to: ".concat(String.valueOf(activity)));
        } else {
            t0.c("PopupManager", "Binding to: ".concat(String.valueOf(activity)));
            f(decorView);
        }
    }

    public final Bundle c() {
        return this.b.a();
    }

    public final IBinder d() {
        return this.b.f17606a;
    }

    public final gb.d e() {
        return this.b;
    }

    @TargetApi(16)
    public final void f(View view) {
        c cVar = this.f18136a;
        cVar.j();
        WeakReference weakReference = this.f18137c;
        if (weakReference != null) {
            View decorView = (View) weakReference.get();
            Context context = cVar.getContext();
            if (decorView == null && (context instanceof Activity)) {
                decorView = ((Activity) context).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (v9.m.b()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f18137c = null;
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
            t0.d("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            t0.f("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        h(view);
        this.f18137c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void g() {
        boolean z10;
        gb.d dVar = this.b;
        IBinder iBinder = dVar.f17606a;
        if (iBinder != null) {
            this.f18136a.i(iBinder, dVar.a());
            z10 = false;
        } else {
            z10 = true;
        }
        this.f18138d = z10;
    }

    @TargetApi(17)
    public final void h(View view) {
        Display display;
        int displayId = -1;
        if (v9.m.c() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        gb.d dVar = this.b;
        dVar.f17607c = displayId;
        dVar.f17606a = windowToken;
        int i10 = iArr[0];
        dVar.f17608d = i10;
        int i11 = iArr[1];
        dVar.f17609e = i11;
        dVar.f17610f = i10 + width;
        dVar.f17611g = i11 + height;
        if (this.f18138d) {
            g();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.f18137c;
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
        this.f18136a.j();
        view.removeOnAttachStateChangeListener(this);
    }
}
