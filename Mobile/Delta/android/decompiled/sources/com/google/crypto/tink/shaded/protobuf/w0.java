package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w0<T> implements g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f8649a;
    public final n1<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<?> f8651d;

    public w0(n1<?, ?> n1Var, q<?> qVar, s0 s0Var) {
        this.b = n1Var;
        this.f8650c = qVar.e(s0Var);
        this.f8651d = qVar;
        this.f8649a = s0Var;
    }

    private <UT, UB> int k(n1<UT, UB> n1Var, T t8) {
        return n1Var.i(n1Var.g(t8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends u.b<ET>> void l(n1<UT, UB> n1Var, q<ET> qVar, T t8, f1 f1Var, p pVar) throws Throwable {
        n1<UT, UB> n1Var2;
        UB ubF = n1Var.f(t8);
        Object objD = qVar.d(t8);
        while (f1Var.A() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                q<ET> qVar2 = qVar;
                f1 f1Var2 = f1Var;
                p pVar2 = pVar;
                try {
                    if (!n(f1Var2, pVar2, qVar2, objD, n1Var2, ubF)) {
                        n1Var2.o(t8, ubF);
                        return;
                    }
                    f1Var = f1Var2;
                    pVar = pVar2;
                    qVar = qVar2;
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

    public static <T> w0<T> m(n1<?, ?> n1Var, q<?> qVar, s0 s0Var) {
        return new w0<>(n1Var, qVar, s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t8, T t10) {
        i1.G(this.b, t8, t10);
        if (this.f8650c) {
            i1.E(this.f8651d, t8, t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t8) {
        this.b.j(t8);
        this.f8651d.f(t8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t8) {
        return this.f8651d.c(t8).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t8) {
        int iK = k(this.b, t8);
        return this.f8650c ? iK + this.f8651d.c(t8).j() : iK;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        s0 s0Var = this.f8649a;
        return s0Var instanceof y ? (T) ((y) s0Var).P() : (T) s0Var.e().d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int f(T t8) {
        int iHashCode = this.b.g(t8).hashCode();
        return this.f8650c ? (iHashCode * 53) + this.f8651d.c(t8).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t8, T t10) {
        if (!this.b.g(t8).equals(this.b.g(t10))) {
            return false;
        }
        if (this.f8650c) {
            return this.f8651d.c(t8).equals(this.f8651d.c(t10));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t8, byte[] bArr, int i10, int i11, e.b bVar) throws b0 {
        int iJ;
        y yVar = (y) t8;
        o1 o1VarK = yVar.unknownFields;
        if (o1VarK == o1.c()) {
            o1VarK = o1.k();
            yVar.unknownFields = o1VarK;
        }
        o1 o1Var = o1VarK;
        u<y.d> uVarZ = ((y.c) t8).Z();
        y.e eVar = null;
        while (i10 < i11) {
            int iJ2 = e.J(bArr, i10, bVar);
            int i12 = bVar.f8424a;
            if (i12 == s1.f8551a) {
                int i13 = i11;
                e.b bVar2 = bVar;
                int i14 = 0;
                h hVar = null;
                while (true) {
                    if (iJ2 >= i13) {
                        iJ = iJ2;
                        break;
                    }
                    iJ = e.J(bArr, iJ2, bVar2);
                    int i15 = bVar2.f8424a;
                    int iA = s1.a(i15);
                    int iB = s1.b(i15);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                iJ2 = e.q(c1.a().c(eVar.b().getClass()), bArr, iJ, i13, bVar2);
                                uVarZ.x(eVar.b, bVar2.f8425c);
                            } else if (iB == 2) {
                                iJ2 = e.c(bArr, iJ, bVar2);
                                hVar = (h) bVar2.f8425c;
                            }
                        }
                        if (i15 == s1.b) {
                            break;
                        } else {
                            iJ2 = e.Q(i15, bArr, iJ, i13, bVar2);
                        }
                    } else if (iB == 0) {
                        iJ2 = e.J(bArr, iJ, bVar2);
                        i14 = bVar2.f8424a;
                        eVar = (y.e) this.f8651d.b(bVar2.f8426d, this.f8649a, i14);
                    } else {
                        if (i15 == s1.b) {
                            break;
                            break;
                        }
                        iJ2 = e.Q(i15, bArr, iJ, i13, bVar2);
                    }
                }
                if (hVar != null) {
                    o1Var.n(s1.c(i14, 2), hVar);
                }
                i10 = iJ;
                i11 = i13;
                bVar = bVar2;
            } else if (s1.b(i12) == 2) {
                eVar = (y.e) this.f8651d.b(bVar.f8426d, this.f8649a, s1.a(i12));
                if (eVar != null) {
                    i10 = e.q(c1.a().c(eVar.b().getClass()), bArr, iJ2, i11, bVar);
                    uVarZ.x(eVar.b, bVar.f8425c);
                } else {
                    i10 = e.H(i12, bArr, iJ2, i11, o1Var, bVar);
                }
            } else {
                i10 = e.Q(i12, bArr, iJ2, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t8, f1 f1Var, p pVar) throws Throwable {
        l(this.b, this.f8651d, t8, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t8, t1 t1Var) {
        Iterator itS = this.f8651d.c(t8).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            u.b bVar = (u.b) entry.getKey();
            if (bVar.k() != s1.c.MESSAGE || bVar.f() || bVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof d0.b) {
                t1Var.b(bVar.getNumber(), ((d0.b) entry).a().e());
            } else {
                t1Var.b(bVar.getNumber(), entry.getValue());
            }
        }
        o(this.b, t8, t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends u.b<ET>> boolean n(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, n1<UT, UB> n1Var, UB ub) throws b0 {
        int iA = f1Var.a();
        int iH = 0;
        if (iA != s1.f8551a) {
            if (s1.b(iA) != 2) {
                return f1Var.D();
            }
            Object objB = qVar.b(pVar, this.f8649a, s1.a(iA));
            if (objB == null) {
                return n1Var.m(ub, f1Var, 0);
            }
            qVar.h(f1Var, objB, pVar, uVar);
            return true;
        }
        Object objB2 = null;
        h hVarO = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int iA2 = f1Var.a();
            if (iA2 == s1.f8552c) {
                iH = f1Var.h();
                objB2 = qVar.b(pVar, this.f8649a, iH);
            } else if (iA2 == s1.f8553d) {
                if (objB2 != null) {
                    qVar.h(f1Var, objB2, pVar, uVar);
                } else {
                    hVarO = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != s1.b) {
            throw b0.b();
        }
        if (hVarO != null) {
            if (objB2 != null) {
                qVar.i(hVarO, objB2, pVar, uVar);
            } else {
                n1Var.d(ub, iH, hVarO);
            }
        }
        return true;
    }

    public final <UT, UB> void o(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.s(n1Var.g(t8), t1Var);
    }
}
