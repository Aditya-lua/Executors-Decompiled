package p093e4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0973o0;
import androidx.p616lifecycle.C0983t0;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import p068d5.C4442f;
import p068d5.C4444h;
import p068d5.InterfaceC4445i;
import p237k4.C7445b;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: e4.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C4820k0 implements InterfaceC0962j, InterfaceC4445i, InterfaceC0947c1 {

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacksC0929c f19484a;

    /* JADX INFO: renamed from: b */
    public final C0944b1 f19485b;

    /* JADX INFO: renamed from: c */
    public final Runnable f19486c;

    /* JADX INFO: renamed from: d */
    public C0941a1.c f19487d;

    /* JADX INFO: renamed from: e */
    public C0984u f19488e = null;

    /* JADX INFO: renamed from: f */
    public C4444h f19489f = null;

    public C4820k0(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull C0944b1 c0944b1, @NonNull Runnable runnable) {
        this.f19484a = componentCallbacksC0929c;
        this.f19485b = c0944b1;
        this.f19486c = runnable;
    }

    @Override // p068d5.InterfaceC4445i
    @NonNull
    /* JADX INFO: renamed from: A */
    public C4442f mo4583A() {
        m23342c();
        return this.f19489f.getSavedStateRegistry();
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NonNull
    /* JADX INFO: renamed from: X */
    public C0941a1.c mo4647X() {
        Application application;
        C0941a1.c cVarMo4647X = this.f19484a.mo4647X();
        if (!cVarMo4647X.equals(this.f19484a.f3432Y)) {
            this.f19487d = cVarMo4647X;
            return cVarMo4647X;
        }
        if (this.f19487d == null) {
            Context applicationContext = this.f19484a.m4609I1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            ComponentCallbacksC0929c componentCallbacksC0929c = this.f19484a;
            this.f19487d = new C0983t0(application, componentCallbacksC0929c, componentCallbacksC0929c.m4704t());
        }
        return this.f19487d;
    }

    @Override // androidx.p616lifecycle.InterfaceC0962j
    @NonNull
    /* JADX INFO: renamed from: Z */
    public CreationExtras mo4653Z() {
        Application application;
        Context applicationContext = this.f19484a.m4609I1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C7445b c7445b = new C7445b();
        if (application != null) {
            c7445b.m30960c(C0941a1.a.f3611h, application);
        }
        c7445b.m30960c(C0973o0.f3714a, this.f19484a);
        c7445b.m30960c(C0973o0.f3715b, this);
        if (this.f19484a.m4704t() != null) {
            c7445b.m30960c(C0973o0.f3716c, this.f19484a.m4704t());
        }
        return c7445b;
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        m23342c();
        return this.f19488e;
    }

    /* JADX INFO: renamed from: b */
    public void m23341b(@NonNull AbstractC0966l.a aVar) {
        this.f19488e.m4986j(aVar);
    }

    /* JADX INFO: renamed from: c */
    public void m23342c() {
        if (this.f19488e == null) {
            this.f19488e = new C0984u(this);
            C4444h c4444hM22357a = C4444h.m22357a(this);
            this.f19489f = c4444hM22357a;
            c4444hM22357a.m22359c();
            this.f19486c.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m23343d() {
        return this.f19488e != null;
    }

    /* JADX INFO: renamed from: e */
    public void m23344e(Bundle bundle) {
        this.f19489f.m22360d(bundle);
    }

    /* JADX INFO: renamed from: f */
    public void m23345f(@NonNull Bundle bundle) {
        this.f19489f.m22361e(bundle);
    }

    /* JADX INFO: renamed from: g */
    public void m23346g(@NonNull AbstractC0966l.b bVar) {
        this.f19488e.m4991o(bVar);
    }

    @Override // androidx.p616lifecycle.InterfaceC0947c1
    @NonNull
    /* JADX INFO: renamed from: w */
    public C0944b1 mo4712w() {
        m23342c();
        return this.f19485b;
    }
}
