package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v0<T> implements g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f2379a;
    public final n1<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<?> f2381d;

    public v0(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        this.b = n1Var;
        this.f2380c = pVar.e(r0Var);
        this.f2381d = pVar;
        this.f2379a = r0Var;
    }

    private <UT, UB> int j(n1<UT, UB> n1Var, T t8) {
        return n1Var.i(n1Var.g(t8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends t.b<ET>> void k(n1<UT, UB> n1Var, p<ET> pVar, T t8, f1 f1Var, o oVar) throws Throwable {
        n1<UT, UB> n1Var2;
        UB ubF = n1Var.f(t8);
        Object objD = pVar.d(t8);
        while (f1Var.A() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                p<ET> pVar2 = pVar;
                f1 f1Var2 = f1Var;
                o oVar2 = oVar;
                try {
                    if (!m(f1Var2, oVar2, pVar2, objD, n1Var2, ubF)) {
                        n1Var2.o(t8, ubF);
                        return;
                    }
                    f1Var = f1Var2;
                    oVar = oVar2;
                    pVar = pVar2;
                    n1Var = n1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    n1Var2.o(t8, ubF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                n1Var2 = n1Var;
            }
        }
        n1Var.o(t8, ubF);
    }

    public static <T> v0<T> l(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        return new v0<>(n1Var, pVar, r0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t8, T t10) {
        i1.G(this.b, t8, t10);
        if (this.f2380c) {
            i1.E(this.f2381d, t8, t10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void b(T t8) {
        this.b.j(t8);
        this.f2381d.f(t8);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(T t8) {
        return this.f2381d.c(t8).p();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int d(T t8) {
        int iJ = j(this.b, t8);
        return this.f2380c ? iJ + this.f2381d.c(t8).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T e() {
        r0 r0Var = this.f2379a;
        return r0Var instanceof x ? (T) ((x) r0Var).O() : (T) r0Var.e().d();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int f(T t8) {
        int iHashCode = this.b.g(t8).hashCode();
        return this.f2380c ? (iHashCode * 53) + this.f2381d.c(t8).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean g(T t8, T t10) {
        if (!this.b.g(t8).equals(this.b.g(t10))) {
            return false;
        }
        if (this.f2380c) {
            return this.f2381d.c(t8).equals(this.f2381d.c(t10));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t8, f1 f1Var, o oVar) throws Throwable {
        k(this.b, this.f2381d, t8, f1Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t8, t1 t1Var) {
        Iterator itT = this.f2381d.c(t8).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            t.b bVar = (t.b) entry.getKey();
            if (bVar.k() != s1.c.MESSAGE || bVar.f() || bVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof c0.b) {
                t1Var.b(bVar.getNumber(), ((c0.b) entry).a().e());
            } else {
                t1Var.b(bVar.getNumber(), entry.getValue());
            }
        }
        n(this.b, t8, t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends t.b<ET>> boolean m(f1 f1Var, o oVar, p<ET> pVar, t<ET> tVar, n1<UT, UB> n1Var, UB ub) throws a0 {
        int iA = f1Var.a();
        int iH = 0;
        if (iA != s1.f2283a) {
            if (s1.b(iA) != 2) {
                return f1Var.D();
            }
            Object objB = pVar.b(oVar, this.f2379a, s1.a(iA));
            if (objB == null) {
                return n1Var.m(ub, f1Var, 0);
            }
            pVar.h(f1Var, objB, oVar, tVar);
            return true;
        }
        Object objB2 = null;
        g gVarO = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int iA2 = f1Var.a();
            if (iA2 == s1.f2284c) {
                iH = f1Var.h();
                objB2 = pVar.b(oVar, this.f2379a, iH);
            } else if (iA2 == s1.f2285d) {
                if (objB2 != null) {
                    pVar.h(f1Var, objB2, oVar, tVar);
                } else {
                    gVarO = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != s1.b) {
            throw a0.b();
        }
        if (gVarO != null) {
            if (objB2 != null) {
                pVar.i(gVarO, objB2, oVar, tVar);
            } else {
                n1Var.d(ub, iH, gVarO);
            }
        }
        return true;
    }

    public final <UT, UB> void n(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.s(n1Var.g(t8), t1Var);
    }
}
