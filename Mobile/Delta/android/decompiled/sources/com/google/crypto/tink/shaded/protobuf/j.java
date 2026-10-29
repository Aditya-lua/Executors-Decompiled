package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8470a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8472d = 0;

    public j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f8470a = iVar2;
        iVar2.f8448d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f8448d;
        return jVar != null ? jVar : new j(iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int A() {
        int i10 = this.f8472d;
        if (i10 != 0) {
            this.b = i10;
            this.f8472d = 0;
        } else {
            this.b = this.f8470a.C();
        }
        int i11 = this.b;
        if (i11 == 0 || i11 == this.f8471c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void B(List<String> list) throws b0.a {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void C(List<Float> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof w)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f8470a.D();
                Y(iD);
                int iE = this.f8470a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f8470a.t()));
                } while (this.f8470a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw b0.e();
            }
            do {
                list.add(Float.valueOf(this.f8470a.t()));
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC = this.f8470a.C();
                }
            } while (iC == this.b);
            this.f8472d = iC;
            return;
        }
        w wVar = (w) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f8470a.D();
            Y(iD2);
            int iE2 = this.f8470a.e() + iD2;
            do {
                wVar.d(this.f8470a.t());
            } while (this.f8470a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw b0.e();
        }
        do {
            wVar.d(this.f8470a.t());
            if (this.f8470a.f()) {
                return;
            } else {
                iC2 = this.f8470a.C();
            }
        } while (iC2 == this.b);
        this.f8472d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f8470a.f() || (i10 = this.b) == this.f8471c) {
            return false;
        }
        return this.f8470a.F(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int E() throws b0.a {
        X(5);
        return this.f8470a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void F(List<h> list) throws b0.a {
        int iC;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        do {
            list.add(o());
            if (this.f8470a.f()) {
                return;
            } else {
                iC = this.f8470a.C();
            }
        } while (iC == this.b);
        this.f8472d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void G(List<Double> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof m)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f8470a.p()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iD = this.f8470a.D();
            Z(iD);
            int iE = this.f8470a.e() + iD;
            do {
                list.add(Double.valueOf(this.f8470a.p()));
            } while (this.f8470a.e() < iE);
            return;
        }
        m mVar = (m) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                mVar.d(this.f8470a.p());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iD2 = this.f8470a.D();
        Z(iD2);
        int iE2 = this.f8470a.e() + iD2;
        do {
            mVar.d(this.f8470a.p());
        } while (this.f8470a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long H() throws b0.a {
        X(0);
        return this.f8470a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String I() throws b0.a {
        X(2);
        return this.f8470a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void J(T t8, g1<T> g1Var, p pVar) throws b0.a {
        X(3);
        R(t8, g1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> T K(Class<T> cls, p pVar) throws b0.a {
        X(3);
        return (T) T(c1.a().c(cls), pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <K, V> void L(Map<K, V> map, l0.a<K, V> aVar, p pVar) throws b0.a {
        X(2);
        this.f8470a.m(this.f8470a.D());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void M(T t8, g1<T> g1Var, p pVar) throws b0 {
        X(2);
        S(t8, g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void N(List<T> list, g1<T> g1Var, p pVar) throws b0.a {
        int iC;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        int i10 = this.b;
        do {
            list.add(U(g1Var, pVar));
            if (this.f8470a.f() || this.f8472d != 0) {
                return;
            } else {
                iC = this.f8470a.C();
            }
        } while (iC == i10);
        this.f8472d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> T O(Class<T> cls, p pVar) throws b0.a {
        X(2);
        return (T) U(c1.a().c(cls), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> void P(List<T> list, g1<T> g1Var, p pVar) throws b0.a {
        int iC;
        if (s1.b(this.b) != 3) {
            throw b0.e();
        }
        int i10 = this.b;
        do {
            list.add(T(g1Var, pVar));
            if (this.f8470a.f() || this.f8472d != 0) {
                return;
            } else {
                iC = this.f8470a.C();
            }
        } while (iC == i10);
        this.f8472d = iC;
    }

    public final <T> void R(T t8, g1<T> g1Var, p pVar) {
        int i10 = this.f8471c;
        this.f8471c = s1.c(s1.a(this.b), 4);
        try {
            g1Var.i(t8, this, pVar);
            if (this.b != this.f8471c) {
                throw b0.h();
            }
            this.f8471c = i10;
        } catch (Throwable th2) {
            this.f8471c = i10;
            throw th2;
        }
    }

    public final <T> void S(T t8, g1<T> g1Var, p pVar) throws b0 {
        int iD = this.f8470a.D();
        i iVar = this.f8470a;
        if (iVar.f8446a >= iVar.b) {
            throw b0.i();
        }
        int iM = iVar.m(iD);
        this.f8470a.f8446a++;
        g1Var.i(t8, this, pVar);
        this.f8470a.a(0);
        i iVar2 = this.f8470a;
        iVar2.f8446a--;
        iVar2.l(iM);
    }

    public final <T> T T(g1<T> g1Var, p pVar) {
        T tE = g1Var.e();
        R(tE, g1Var, pVar);
        g1Var.b(tE);
        return tE;
    }

    public final <T> T U(g1<T> g1Var, p pVar) throws b0 {
        T tE = g1Var.e();
        S(tE, g1Var, pVar);
        g1Var.b(tE);
        return tE;
    }

    public void V(List<String> list, boolean z10) throws b0.a {
        int iC;
        int iC2;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        if (!(list instanceof f0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC = this.f8470a.C();
                }
            } while (iC == this.b);
            this.f8472d = iC;
            return;
        }
        f0 f0Var = (f0) list;
        do {
            f0Var.P2(o());
            if (this.f8470a.f()) {
                return;
            } else {
                iC2 = this.f8470a.C();
            }
        } while (iC2 == this.b);
        this.f8472d = iC2;
    }

    public final void W(int i10) throws b0 {
        if (this.f8470a.e() != i10) {
            throw b0.m();
        }
    }

    public final void X(int i10) throws b0.a {
        if (s1.b(this.b) != i10) {
            throw b0.e();
        }
    }

    public final void Y(int i10) throws b0 {
        if ((i10 & 3) != 0) {
            throw b0.h();
        }
    }

    public final void Z(int i10) throws b0 {
        if ((i10 & 7) != 0) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int a() {
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long b() throws b0.a {
        X(1);
        return this.f8470a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f8470a.D();
                Y(iD);
                int iE = this.f8470a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f8470a.w()));
                } while (this.f8470a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f8470a.w()));
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC = this.f8470a.C();
                }
            } while (iC == this.b);
            this.f8472d = iC;
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f8470a.D();
            Y(iD2);
            int iE2 = this.f8470a.e() + iD2;
            do {
                zVar.d(this.f8470a.w());
            } while (this.f8470a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw b0.e();
        }
        do {
            zVar.d(this.f8470a.w());
            if (this.f8470a.f()) {
                return;
            } else {
                iC2 = this.f8470a.C();
            }
        } while (iC2 == this.b);
        this.f8472d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void d(List<Long> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof j0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8470a.z()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Long.valueOf(this.f8470a.z()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        j0 j0Var = (j0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                j0Var.e(this.f8470a.z());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            j0Var.e(this.f8470a.z());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean e() throws b0.a {
        X(0);
        return this.f8470a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long f() throws b0.a {
        X(1);
        return this.f8470a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void g(List<Long> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof j0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8470a.E()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Long.valueOf(this.f8470a.E()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        j0 j0Var = (j0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                j0Var.e(this.f8470a.E());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            j0Var.e(this.f8470a.E());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int h() throws b0.a {
        X(0);
        return this.f8470a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void i(List<Long> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof j0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f8470a.v()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Long.valueOf(this.f8470a.v()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        j0 j0Var = (j0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                j0Var.e(this.f8470a.v());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            j0Var.e(this.f8470a.v());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void j(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8470a.q()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Integer.valueOf(this.f8470a.q()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                zVar.d(this.f8470a.q());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            zVar.d(this.f8470a.q());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int k() throws b0.a {
        X(0);
        return this.f8470a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int l() throws b0.a {
        X(0);
        return this.f8470a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void m(List<Boolean> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof f)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f8470a.n()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Boolean.valueOf(this.f8470a.n()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        f fVar = (f) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                fVar.e(this.f8470a.n());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            fVar.e(this.f8470a.n());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void n(List<String> list) throws b0.a {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public h o() throws b0.a {
        X(2);
        return this.f8470a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int p() throws b0.a {
        X(0);
        return this.f8470a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void q(List<Long> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof j0)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f8470a.s()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iD = this.f8470a.D();
            Z(iD);
            int iE = this.f8470a.e() + iD;
            do {
                list.add(Long.valueOf(this.f8470a.s()));
            } while (this.f8470a.e() < iE);
            return;
        }
        j0 j0Var = (j0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                j0Var.e(this.f8470a.s());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iD2 = this.f8470a.D();
        Z(iD2);
        int iE2 = this.f8470a.e() + iD2;
        do {
            j0Var.e(this.f8470a.s());
        } while (this.f8470a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void r(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8470a.y()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Integer.valueOf(this.f8470a.y()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                zVar.d(this.f8470a.y());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            zVar.d(this.f8470a.y());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public double readDouble() throws b0.a {
        X(1);
        return this.f8470a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public float readFloat() throws b0.a {
        X(5);
        return this.f8470a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long s() throws b0.a {
        X(0);
        return this.f8470a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void t(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8470a.D()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Integer.valueOf(this.f8470a.D()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                zVar.d(this.f8470a.D());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            zVar.d(this.f8470a.D());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int u() throws b0.a {
        X(5);
        return this.f8470a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void v(List<Long> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof j0)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f8470a.x()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iD = this.f8470a.D();
            Z(iD);
            int iE = this.f8470a.e() + iD;
            do {
                list.add(Long.valueOf(this.f8470a.x()));
            } while (this.f8470a.e() < iE);
            return;
        }
        j0 j0Var = (j0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                j0Var.e(this.f8470a.x());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iD2 = this.f8470a.D();
        Z(iD2);
        int iE2 = this.f8470a.e() + iD2;
        do {
            j0Var.e(this.f8470a.x());
        } while (this.f8470a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void w(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f8470a.u()));
                    if (this.f8470a.f()) {
                        return;
                    } else {
                        iC = this.f8470a.C();
                    }
                } while (iC == this.b);
                this.f8472d = iC;
                return;
            }
            if (iB != 2) {
                throw b0.e();
            }
            int iE = this.f8470a.e() + this.f8470a.D();
            do {
                list.add(Integer.valueOf(this.f8470a.u()));
            } while (this.f8470a.e() < iE);
            W(iE);
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                zVar.d(this.f8470a.u());
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC2 = this.f8470a.C();
                }
            } while (iC2 == this.b);
            this.f8472d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw b0.e();
        }
        int iE2 = this.f8470a.e() + this.f8470a.D();
        do {
            zVar.d(this.f8470a.u());
        } while (this.f8470a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void x(List<Integer> list) throws b0 {
        int iC;
        int iC2;
        if (!(list instanceof z)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f8470a.D();
                Y(iD);
                int iE = this.f8470a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f8470a.r()));
                } while (this.f8470a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f8470a.r()));
                if (this.f8470a.f()) {
                    return;
                } else {
                    iC = this.f8470a.C();
                }
            } while (iC == this.b);
            this.f8472d = iC;
            return;
        }
        z zVar = (z) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f8470a.D();
            Y(iD2);
            int iE2 = this.f8470a.e() + iD2;
            do {
                zVar.d(this.f8470a.r());
            } while (this.f8470a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw b0.e();
        }
        do {
            zVar.d(this.f8470a.r());
            if (this.f8470a.f()) {
                return;
            } else {
                iC2 = this.f8470a.C();
            }
        } while (iC2 == this.b);
        this.f8472d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long y() throws b0.a {
        X(0);
        return this.f8470a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String z() throws b0.a {
        X(2);
        return this.f8470a.A();
    }
}
