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
import java.lang.ref.WeakReference;
import p125fb.C5508d;
import p125fb.C5560s0;
import p462u9.C11822m;

/* JADX INFO: renamed from: ga.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC6066i implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC6069l {

    /* JADX INFO: renamed from: a */
    public final C6060c f23353a;

    /* JADX INFO: renamed from: b */
    public final C5508d f23354b;

    /* JADX INFO: renamed from: c */
    public WeakReference f23355c;

    /* JADX INFO: renamed from: d */
    public boolean f23356d = false;

    public ViewOnAttachStateChangeListenerC6066i(C6060c c6060c, int i10) {
        this.f23353a = c6060c;
        this.f23354b = new C5508d(i10, null);
    }

    /* JADX INFO: renamed from: b */
    public static ViewOnAttachStateChangeListenerC6066i m26914b(C6060c c6060c, int i10) {
        return new ViewOnAttachStateChangeListenerC6066i(c6060c, i10);
    }

    @Override // ga.InterfaceC6069l
    /* JADX INFO: renamed from: a */
    public final void mo26915a(Activity activity) {
        View decorView;
        try {
            decorView = activity.findViewById(R.id.content);
        } catch (IllegalStateException unused) {
            decorView = null;
        }
        if (decorView == null && (decorView = activity.getWindow().getDecorView()) == null) {
            C5560s0.m25223d("PopupManager", "Failed to bind to: ".concat(String.valueOf(activity)));
        } else {
            C5560s0.m25222c("PopupManager", "Binding to: ".concat(String.valueOf(activity)));
            m26919f(decorView);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m26916c() {
        return this.f23354b.m25170a();
    }

    /* JADX INFO: renamed from: d */
    public final IBinder m26917d() {
        return this.f23354b.f21277a;
    }

    /* JADX INFO: renamed from: e */
    public final C5508d m26918e() {
        return this.f23354b;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: f */
    public final void m26919f(View view) {
        C6060c c6060c = this.f23353a;
        c6060c.m26905j();
        WeakReference weakReference = this.f23355c;
        if (weakReference != null) {
            View decorView = (View) weakReference.get();
            Context context = c6060c.getContext();
            if (decorView == null && (context instanceof Activity)) {
                decorView = ((Activity) context).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (C11822m.m44195b()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f23355c = null;
        Context context2 = c6060c.getContext();
        if (view == null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            try {
                view = activity.findViewById(R.id.content);
            } catch (IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            C5560s0.m25223d("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            C5560s0.m25225f("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        m26921h(view);
        this.f23355c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m26920g() {
        boolean z10;
        C5508d c5508d = this.f23354b;
        IBinder iBinder = c5508d.f21277a;
        if (iBinder != null) {
            this.f23353a.m26904i(iBinder, c5508d.m25170a());
            z10 = false;
        } else {
            z10 = true;
        }
        this.f23356d = z10;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: h */
    public final void m26921h(View view) {
        Display display;
        int displayId = -1;
        if (C11822m.m44196c() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        C5508d c5508d = this.f23354b;
        c5508d.f21279c = displayId;
        c5508d.f21277a = windowToken;
        int i10 = iArr[0];
        c5508d.f21280d = i10;
        int i11 = iArr[1];
        c5508d.f21281e = i11;
        c5508d.f21282f = i10 + width;
        c5508d.f21283g = i11 + height;
        if (this.f23356d) {
            m26920g();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.f23355c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m26921h(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m26921h(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f23353a.m26905j();
        view.removeOnAttachStateChangeListener(this);
    }
}
