package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2196a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2198d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2199a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f2199a = iArr;
            try {
                iArr[s1.b.f2293j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2199a[s1.b.f2297n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2199a[s1.b.f2286c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2199a[s1.b.f2299p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2199a[s1.b.f2292i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2199a[s1.b.f2291h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2199a[s1.b.f2287d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2199a[s1.b.f2290g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2199a[s1.b.f2288e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2199a[s1.b.f2296m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2199a[s1.b.f2300q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2199a[s1.b.f2301r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2199a[s1.b.f2302s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2199a[s1.b.f2303t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2199a[s1.b.f2294k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2199a[s1.b.f2298o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2199a[s1.b.f2289f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public i(h hVar) {
        h hVar2 = (h) z.b(hVar, "input");
        this.f2196a = hVar2;
        hVar2.f2176d = this;
    }

    public static i Q(h hVar) {
        i iVar = hVar.f2176d;
        return iVar != null ? iVar : new i(hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int A() {
        int i10 = this.f2198d;
        if (i10 != 0) {
            this.b = i10;
            this.f2198d = 0;
        } else {
            this.b = this.f2196a.C();
        }
        int i11 = this.b;
        if (i11 == 0 || i11 == this.f2197c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void B(List<String> list) throws a0.a {
        W(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void C(List<Float> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof v)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f2196a.D();
                Z(iD);
                int iE = this.f2196a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f2196a.t()));
                } while (this.f2196a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Float.valueOf(this.f2196a.t()));
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC = this.f2196a.C();
                }
            } while (iC == this.b);
            this.f2198d = iC;
            return;
        }
        v vVar = (v) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f2196a.D();
            Z(iD2);
            int iE2 = this.f2196a.e() + iD2;
            do {
                vVar.b(this.f2196a.t());
            } while (this.f2196a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            vVar.b(this.f2196a.t());
            if (this.f2196a.f()) {
                return;
            } else {
                iC2 = this.f2196a.C();
            }
        } while (iC2 == this.b);
        this.f2198d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f2196a.f() || (i10 = this.b) == this.f2197c) {
            return false;
        }
        return this.f2196a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int E() throws a0.a {
        Y(5);
        return this.f2196a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void F(List<g> list) throws a0.a {
        int iC;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        do {
            list.add(o());
            if (this.f2196a.f()) {
                return;
            } else {
                iC = this.f2196a.C();
            }
        } while (iC == this.b);
        this.f2198d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void G(List<Double> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof l)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f2196a.p()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f2196a.D();
            a0(iD);
            int iE = this.f2196a.e() + iD;
            do {
                list.add(Double.valueOf(this.f2196a.p()));
            } while (this.f2196a.e() < iE);
            return;
        }
        l lVar = (l) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                lVar.b(this.f2196a.p());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f2196a.D();
        a0(iD2);
        int iE2 = this.f2196a.e() + iD2;
        do {
            lVar.b(this.f2196a.p());
        } while (this.f2196a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long H() throws a0.a {
        Y(0);
        return this.f2196a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String I() throws a0.a {
        Y(2);
        return this.f2196a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void J(T t8, g1<T> g1Var, o oVar) throws a0 {
        Y(2);
        S(t8, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void K(List<T> list, g1<T> g1Var, o oVar) throws a0.a {
        int iC;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        int i10 = this.b;
        do {
            list.add(V(g1Var, oVar));
            if (this.f2196a.f() || this.f2198d != 0) {
                return;
            } else {
                iC = this.f2196a.C();
            }
        } while (iC == i10);
        this.f2198d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T L(Class<T> cls, o oVar) throws a0.a {
        Y(2);
        return (T) V(c1.a().c(cls), oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> T M(Class<T> cls, o oVar) throws a0.a {
        Y(3);
        return (T) U(c1.a().c(cls), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <K, V> void N(Map<K, V> map, k0.a<K, V> aVar, o oVar) throws a0.a {
        Y(2);
        int iM = this.f2196a.m(this.f2196a.D());
        Object objT = aVar.b;
        Object objT2 = aVar.f2238d;
        while (true) {
            try {
                int iA = A();
                if (iA == Integer.MAX_VALUE || this.f2196a.f()) {
                    break;
                }
                if (iA == 1) {
                    objT = T(aVar.f2236a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!D()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    } catch (a0.a unused) {
                        if (!D()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objT2 = T(aVar.f2237c, aVar.f2238d.getClass(), oVar);
                }
            } catch (Throwable th2) {
                this.f2196a.l(iM);
                throw th2;
            }
        }
        map.put(objT, objT2);
        this.f2196a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void O(T t8, g1<T> g1Var, o oVar) throws a0.a {
        Y(3);
        R(t8, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> void P(List<T> list, g1<T> g1Var, o oVar) throws a0.a {
        int iC;
        if (s1.b(this.b) != 3) {
            throw a0.e();
        }
        int i10 = this.b;
        do {
            list.add(U(g1Var, oVar));
            if (this.f2196a.f() || this.f2198d != 0) {
                return;
            } else {
                iC = this.f2196a.C();
            }
        } while (iC == i10);
        this.f2198d = iC;
    }

    public final <T> void R(T t8, g1<T> g1Var, o oVar) {
        int i10 = this.f2197c;
        this.f2197c = s1.c(s1.a(this.b), 4);
        try {
            g1Var.h(t8, this, oVar);
            if (this.b != this.f2197c) {
                throw a0.h();
            }
            this.f2197c = i10;
        } catch (Throwable th2) {
            this.f2197c = i10;
            throw th2;
        }
    }

    public final <T> void S(T t8, g1<T> g1Var, o oVar) throws a0 {
        int iD = this.f2196a.D();
        h hVar = this.f2196a;
        if (hVar.f2174a >= hVar.b) {
            throw a0.i();
        }
        int iM = hVar.m(iD);
        this.f2196a.f2174a++;
        g1Var.h(t8, this, oVar);
        this.f2196a.a(0);
        h hVar2 = this.f2196a;
        hVar2.f2174a--;
        hVar2.l(iM);
    }

    public final Object T(s1.b bVar, Class<?> cls, o oVar) {
        switch (a.f2199a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return L(cls, oVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final <T> T U(g1<T> g1Var, o oVar) {
        T tE = g1Var.e();
        R(tE, g1Var, oVar);
        g1Var.b(tE);
        return tE;
    }

    public final <T> T V(g1<T> g1Var, o oVar) throws a0 {
        T tE = g1Var.e();
        S(tE, g1Var, oVar);
        g1Var.b(tE);
        return tE;
    }

    public void W(List<String> list, boolean z10) throws a0.a {
        int iC;
        int iC2;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC = this.f2196a.C();
                }
            } while (iC == this.b);
            this.f2198d = iC;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.f2(o());
            if (this.f2196a.f()) {
                return;
            } else {
                iC2 = this.f2196a.C();
            }
        } while (iC2 == this.b);
        this.f2198d = iC2;
    }

    public final void X(int i10) throws a0 {
        if (this.f2196a.e() != i10) {
            throw a0.m();
        }
    }

    public final void Y(int i10) throws a0.a {
        if (s1.b(this.b) != i10) {
            throw a0.e();
        }
    }

    public final void Z(int i10) throws a0 {
        if ((i10 & 3) != 0) {
            throw a0.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int a() {
        return this.b;
    }

    public final void a0(int i10) throws a0 {
        if ((i10 & 7) != 0) {
            throw a0.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long b() throws a0.a {
        Y(1);
        return this.f2196a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void c(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f2196a.D();
                Z(iD);
                int iE = this.f2196a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f2196a.w()));
                } while (this.f2196a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2196a.w()));
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC = this.f2196a.C();
                }
            } while (iC == this.b);
            this.f2198d = iC;
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f2196a.D();
            Z(iD2);
            int iE2 = this.f2196a.e() + iD2;
            do {
                yVar.d(this.f2196a.w());
            } while (this.f2196a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            yVar.d(this.f2196a.w());
            if (this.f2196a.f()) {
                return;
            } else {
                iC2 = this.f2196a.C();
            }
        } while (iC2 == this.b);
        this.f2198d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void d(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2196a.z()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Long.valueOf(this.f2196a.z()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                i0Var.e(this.f2196a.z());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            i0Var.e(this.f2196a.z());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean e() throws a0.a {
        Y(0);
        return this.f2196a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long f() throws a0.a {
        Y(1);
        return this.f2196a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void g(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2196a.E()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Long.valueOf(this.f2196a.E()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                i0Var.e(this.f2196a.E());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            i0Var.e(this.f2196a.E());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int h() throws a0.a {
        Y(0);
        return this.f2196a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void i(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2196a.v()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Long.valueOf(this.f2196a.v()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                i0Var.e(this.f2196a.v());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            i0Var.e(this.f2196a.v());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void j(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2196a.q()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Integer.valueOf(this.f2196a.q()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                yVar.d(this.f2196a.q());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            yVar.d(this.f2196a.q());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int k() throws a0.a {
        Y(0);
        return this.f2196a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int l() throws a0.a {
        Y(0);
        return this.f2196a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void m(List<Boolean> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof e)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2196a.n()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Boolean.valueOf(this.f2196a.n()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        e eVar = (e) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                eVar.b(this.f2196a.n());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            eVar.b(this.f2196a.n());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void n(List<String> list) throws a0.a {
        W(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public g o() throws a0.a {
        Y(2);
        return this.f2196a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int p() throws a0.a {
        Y(0);
        return this.f2196a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void q(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2196a.s()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f2196a.D();
            a0(iD);
            int iE = this.f2196a.e() + iD;
            do {
                list.add(Long.valueOf(this.f2196a.s()));
            } while (this.f2196a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                i0Var.e(this.f2196a.s());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f2196a.D();
        a0(iD2);
        int iE2 = this.f2196a.e() + iD2;
        do {
            i0Var.e(this.f2196a.s());
        } while (this.f2196a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void r(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2196a.y()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Integer.valueOf(this.f2196a.y()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                yVar.d(this.f2196a.y());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            yVar.d(this.f2196a.y());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public double readDouble() throws a0.a {
        Y(1);
        return this.f2196a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public float readFloat() throws a0.a {
        Y(5);
        return this.f2196a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long s() throws a0.a {
        Y(0);
        return this.f2196a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void t(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2196a.D()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Integer.valueOf(this.f2196a.D()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                yVar.d(this.f2196a.D());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            yVar.d(this.f2196a.D());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int u() throws a0.a {
        Y(5);
        return this.f2196a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void v(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2196a.x()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f2196a.D();
            a0(iD);
            int iE = this.f2196a.e() + iD;
            do {
                list.add(Long.valueOf(this.f2196a.x()));
            } while (this.f2196a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 1) {
            do {
                i0Var.e(this.f2196a.x());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f2196a.D();
        a0(iD2);
        int iE2 = this.f2196a.e() + iD2;
        do {
            i0Var.e(this.f2196a.x());
        } while (this.f2196a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void w(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2196a.u()));
                    if (this.f2196a.f()) {
                        return;
                    } else {
                        iC = this.f2196a.C();
                    }
                } while (iC == this.b);
                this.f2198d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f2196a.e() + this.f2196a.D();
            do {
                list.add(Integer.valueOf(this.f2196a.u()));
            } while (this.f2196a.e() < iE);
            X(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 0) {
            do {
                yVar.d(this.f2196a.u());
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC2 = this.f2196a.C();
                }
            } while (iC2 == this.b);
            this.f2198d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f2196a.e() + this.f2196a.D();
        do {
            yVar.d(this.f2196a.u());
        } while (this.f2196a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void x(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.b);
            if (iB == 2) {
                int iD = this.f2196a.D();
                Z(iD);
                int iE = this.f2196a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f2196a.r()));
                } while (this.f2196a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2196a.r()));
                if (this.f2196a.f()) {
                    return;
                } else {
                    iC = this.f2196a.C();
                }
            } while (iC == this.b);
            this.f2198d = iC;
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.b);
        if (iB2 == 2) {
            int iD2 = this.f2196a.D();
            Z(iD2);
            int iE2 = this.f2196a.e() + iD2;
            do {
                yVar.d(this.f2196a.r());
            } while (this.f2196a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            yVar.d(this.f2196a.r());
            if (this.f2196a.f()) {
                return;
            } else {
                iC2 = this.f2196a.C();
            }
        } while (iC2 == this.b);
        this.f2198d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long y() throws a0.a {
        Y(0);
        return this.f2196a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String z() throws a0.a {
        Y(2);
        return this.f2196a.A();
    }
}
