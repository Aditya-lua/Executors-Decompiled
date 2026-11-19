package f4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import l4.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
public class x0 implements androidx.p000lifecycle.j, e5.i, androidx.p000lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15613a;
    public final androidx.p000lifecycle.b1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f15614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.a1.c f15615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.p000lifecycle.u f15616e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e5.h f15617f = null;

    public x0(@NonNull q qVar, @NonNull androidx.p000lifecycle.b1 b1Var, @NonNull Runnable runnable) {
        this.f15613a = qVar;
        this.b = b1Var;
        this.f15614c = runnable;
    }

    @Override // e5.i
    @NonNull
    public e5.f A() {
        c();
        return this.f15617f.getSavedStateRegistry();
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public androidx.lifecycle.a1.c W() {
        Application application;
        androidx.lifecycle.a1.c cVarW = this.f15613a.W();
        if (!cVarW.equals(this.f15613a.Y)) {
            this.f15615d = cVarW;
            return cVarW;
        }
        if (this.f15615d == null) {
            Context applicationContext = this.f15613a.I1().getApplicationContext();
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
            q qVar = this.f15613a;
            this.f15615d = new androidx.p000lifecycle.t0(application, qVar, qVar.t());
        }
        return this.f15615d;
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public CreationExtras Y() {
        Application application;
        Context applicationContext = this.f15613a.I1().getApplicationContext();
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
        l4.b bVar = new l4.b();
        if (application != null) {
            bVar.c(androidx.lifecycle.a1.a.f2299h, application);
        }
        bVar.c(androidx.p000lifecycle.o0.f2381a, this.f15613a);
        bVar.c(androidx.p000lifecycle.o0.b, this);
        if (this.f15613a.t() != null) {
            bVar.c(androidx.p000lifecycle.o0.f2382c, this.f15613a.t());
        }
        return bVar;
    }

    @Override // androidx.p000lifecycle.s
    @NonNull
    public androidx.p000lifecycle.l a() {
        c();
        return this.f15616e;
    }

    public void b(@NonNull androidx.lifecycle.l.a aVar) {
        this.f15616e.j(aVar);
    }

    public void c() {
        if (this.f15616e == null) {
            this.f15616e = new androidx.p000lifecycle.u(this);
            e5.h hVarA = e5.h.a(this);
            this.f15617f = hVarA;
            hVarA.c();
            this.f15614c.run();
        }
    }

    public boolean d() {
        return this.f15616e != null;
    }

    public void e(Bundle bundle) {
        this.f15617f.d(bundle);
    }

    public void f(@NonNull Bundle bundle) {
        this.f15617f.e(bundle);
    }

    public void g(@NonNull androidx.lifecycle.l.b bVar) {
        this.f15616e.o(bVar);
    }

    @Override // androidx.p000lifecycle.c1
    @NonNull
    public androidx.p000lifecycle.b1 w() {
        c();
        return this.b;
    }
}
