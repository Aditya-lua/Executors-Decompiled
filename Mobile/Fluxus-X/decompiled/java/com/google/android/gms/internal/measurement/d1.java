package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3 f6472a;
    public y4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lh f6474d;

    public d1() {
        x3 x3Var = new x3();
        this.f6472a = x3Var;
        this.b = x3Var.b.c();
        this.f6473c = new c();
        this.f6474d = new lh();
        x3Var.f6923d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.c0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f6459a.g();
            }
        });
        x3Var.f6923d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new c9(this.f6365a.f6473c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f6472a.f6923d.a(str, callable);
    }

    public final boolean b(b bVar) throws d2 {
        try {
            c cVar = this.f6473c;
            cVar.b(bVar);
            this.f6472a.f6922c.e("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f6474d.b(this.b.c(), cVar);
            return c() || d();
        } catch (Throwable th2) {
            throw new d2(th2);
        }
    }

    public final boolean c() {
        c cVar = this.f6473c;
        return !cVar.c().equals(cVar.a());
    }

    public final boolean d() {
        return !this.f6473c.f().isEmpty();
    }

    public final c e() {
        return this.f6473c;
    }

    public final void f(c8 c8Var) throws d2 {
        k kVar;
        try {
            x3 x3Var = this.f6472a;
            this.b = x3Var.b.c();
            if (x3Var.a(this.b, (g8[]) c8Var.F().toArray(new g8[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (z7 z7Var : c8Var.G().F()) {
                List listG = z7Var.G();
                String strF = z7Var.F();
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    q qVarA = x3Var.a(this.b, (g8) it.next());
                    if (!(qVarA instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    y4 y4Var = this.b;
                    if (y4Var.d(strF)) {
                        q qVarH = y4Var.h(strF);
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
        return new hh(this.f6474d);
    }
}
