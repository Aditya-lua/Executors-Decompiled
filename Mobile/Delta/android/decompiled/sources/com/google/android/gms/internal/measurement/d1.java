package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f6410a;
    public u4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh f6412d;

    public d1() {
        t3 t3Var = new t3();
        this.f6410a = t3Var;
        this.b = t3Var.b.c();
        this.f6411c = new c();
        this.f6412d = new hh();
        t3Var.f6802d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.c0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f6397a.g();
            }
        });
        t3Var.f6802d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new y8(this.f6368a.f6411c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f6410a.f6802d.a(str, callable);
    }

    public final boolean b(b bVar) throws d2 {
        try {
            c cVar = this.f6411c;
            cVar.b(bVar);
            this.f6410a.f6801c.e("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f6412d.b(this.b.c(), cVar);
            return c() || d();
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final boolean c() {
        c cVar = this.f6411c;
        return !cVar.c().equals(cVar.a());
    }

    public final boolean d() {
        return !this.f6411c.f().isEmpty();
    }

    public final c e() {
        return this.f6411c;
    }

    public final void f(y7 y7Var) throws d2 {
        k kVar;
        try {
            t3 t3Var = this.f6410a;
            this.b = t3Var.b.c();
            if (t3Var.a(this.b, (c8[]) y7Var.F().toArray(new c8[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (v7 v7Var : y7Var.G().F()) {
                List listG = v7Var.G();
                String strF = v7Var.F();
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    q qVarA = t3Var.a(this.b, (c8) it.next());
                    if (!(qVarA instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    u4 u4Var = this.b;
                    if (u4Var.d(strF)) {
                        q qVarH = u4Var.h(strF);
                        if (!(qVarH instanceof k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strF)));
                        }
                        kVar = (k) qVarH;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strF)));
                    }
                    kVar.h(this.b, Collections.singletonList(qVarA));
                }
            }
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final /* synthetic */ k g() {
        return new dh(this.f6412d);
    }
}
