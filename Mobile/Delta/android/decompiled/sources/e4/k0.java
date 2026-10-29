package e4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.t0;
import k4.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements androidx.p000lifecycle.j, d5.i, c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c f15139a;
    public final b1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f15140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1.c f15141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.p000lifecycle.u f15142e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d5.h f15143f = null;

    public k0(@NonNull androidx.fragment.app.c cVar, @NonNull b1 b1Var, @NonNull Runnable runnable) {
        this.f15139a = cVar;
        this.b = b1Var;
        this.f15140c = runnable;
    }

    @Override // d5.i
    @NonNull
    public d5.f A() {
        c();
        return this.f15143f.getSavedStateRegistry();
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public a1.c X() {
        Application application;
        a1.c cVarX = this.f15139a.X();
        if (!cVarX.equals(this.f15139a.Y)) {
            this.f15141d = cVarX;
            return cVarX;
        }
        if (this.f15141d == null) {
            Context applicationContext = this.f15139a.I1().getApplicationContext();
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
            androidx.fragment.app.c cVar = this.f15139a;
            this.f15141d = new t0(application, cVar, cVar.t());
        }
        return this.f15141d;
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public CreationExtras Z() {
        Application application;
        Context applicationContext = this.f15139a.I1().getApplicationContext();
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
        k4.b bVar = new k4.b();
        if (application != null) {
            bVar.c(a1.a.f2752h, application);
        }
        bVar.c(androidx.p000lifecycle.o0.f2834a, this.f15139a);
        bVar.c(androidx.p000lifecycle.o0.b, this);
        if (this.f15139a.t() != null) {
            bVar.c(androidx.p000lifecycle.o0.f2835c, this.f15139a.t());
        }
        return bVar;
    }

    @Override // androidx.p000lifecycle.s
    @NonNull
    public androidx.p000lifecycle.l a() {
        c();
        return this.f15142e;
    }

    public void b(@NonNull androidx.lifecycle.l.a aVar) {
        this.f15142e.j(aVar);
    }

    public void c() {
        if (this.f15142e == null) {
            this.f15142e = new androidx.p000lifecycle.u(this);
            d5.h hVarA = d5.h.a(this);
            this.f15143f = hVarA;
            hVarA.c();
            this.f15140c.run();
        }
    }

    public boolean d() {
        return this.f15142e != null;
    }

    public void e(Bundle bundle) {
        this.f15143f.d(bundle);
    }

    public void f(@NonNull Bundle bundle) {
        this.f15143f.e(bundle);
    }

    public void g(@NonNull androidx.lifecycle.l.b bVar) {
        this.f15142e.o(bVar);
    }

    @Override // androidx.p000lifecycle.c1
    @NonNull
    public b1 w() {
        c();
        return this.b;
    }
}
