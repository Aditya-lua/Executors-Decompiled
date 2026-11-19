package re;

import cf.j0;
import cf.k0;
import cf.p0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ye.l0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f30684a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ye.r f30685c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30686a;

        static {
            int[] iArr = new int[cf.g0.values().length];
            f30686a = iArr;
            try {
                iArr[cf.g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30686a[cf.g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30686a[cf.g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f30687a = new ArrayList();
        public GeneralSecurityException b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ye.r f30688c = ye.r.b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30689d = false;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f30690a;
            public n b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final l f30691c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final x f30692d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public C0599b f30693e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public b f30694f;

            public /* synthetic */ a(x xVar, a aVar) {
                this(xVar);
            }

            public a i() {
                b bVar = this.f30694f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f30690a = true;
                return this;
            }

            public a j() {
                this.f30693e = C0599b.e();
                return this;
            }

            public a(x xVar) {
                this.b = n.b;
                this.f30693e = null;
                this.f30694f = null;
                this.f30691c = null;
                this.f30692d = xVar;
            }
        }

        /* JADX INFO: renamed from: re.p$b$b, reason: collision with other inner class name */
        public static class C0599b {
            public static final C0599b b = new C0599b();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f30695a = 0;

            public static C0599b e() {
                return b;
            }

            public final int d() {
                return this.f30695a;
            }
        }

        public static void d(List<a> list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f30693e == C0599b.b && list.get(i10 + 1).f30693e != C0599b.b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        public static int f(a aVar, Set<Integer> set) throws GeneralSecurityException {
            if (aVar.f30693e != null) {
                return aVar.f30693e == C0599b.b ? g(set) : aVar.f30693e.d();
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public static int g(Set<Integer> set) {
            int iF = 0;
            while (true) {
                if (iF != 0 && !set.contains(Integer.valueOf(iF))) {
                    return iF;
                }
                iF = s0.f();
            }
        }

        public b b(a aVar) {
            if (aVar.f30694f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if (aVar.f30690a) {
                e();
            }
            aVar.f30694f = this;
            this.f30687a.add(aVar);
            return this;
        }

        public p c() throws GeneralSecurityException {
            c cVar;
            j0.c cVarF;
            if (this.b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.b);
            }
            if (this.f30689d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f30689d = true;
            j0.b bVarI0 = j0.i0();
            ArrayList arrayList = new ArrayList(this.f30687a.size());
            d(this.f30687a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f30687a) {
                if (aVar2.b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iF = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iF))) {
                    throw new GeneralSecurityException("Id " + iF + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iF));
                if (aVar2.f30691c != null) {
                    cVar = new c(aVar2.f30691c, aVar2.b, iF, aVar2.f30690a, null);
                    cVarF = p.f(aVar2.f30691c, aVar2.b, iF);
                } else {
                    l lVarC = ye.w.f().c(aVar2.f30692d, aVar2.f30692d.a() ? Integer.valueOf(iF) : null);
                    cVar = new c(lVarC, aVar2.b, iF, aVar2.f30690a, null);
                    cVarF = p.f(lVarC, aVar2.b, iF);
                }
                bVarI0.D(cVarF);
                if (aVar2.f30690a) {
                    if (numValueOf != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    numValueOf = Integer.valueOf(iF);
                    if (aVar2.b != n.b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (numValueOf == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            bVarI0.F(numValueOf.intValue());
            j0 j0VarBuild = bVarI0.build();
            p.d(j0VarBuild);
            return new p(j0VarBuild, arrayList, this.f30688c, aVar);
        }

        public final void e() {
            Iterator<a> it = this.f30687a.iterator();
            while (it.hasNext()) {
                it.next().f30690a = false;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f30696a;
        public final n b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f30698d;

        public /* synthetic */ c(l lVar, n nVar, int i10, boolean z10, a aVar) {
            this(lVar, nVar, i10, z10);
        }

        public l a() {
            return this.f30696a;
        }

        public c(l lVar, n nVar, int i10, boolean z10) {
            this.f30696a = lVar;
            this.b = nVar;
            this.f30697c = i10;
            this.f30698d = z10;
        }
    }

    public /* synthetic */ p(j0 j0Var, List list, ye.r rVar, a aVar) {
        this(j0Var, list, rVar);
    }

    public static j0.c A(int i10, cf.g0 g0Var, l0 l0Var) {
        return j0.c.j0().D(cf.f0.h0().F(l0Var.f()).G(l0Var.g()).D(l0Var.d())).J(g0Var).G(i10).H(l0Var.e()).build();
    }

    public static l0 B(j0.c cVar) {
        return l0.b(cVar.e0().f0(), cVar.e0().g0(), cVar.e0().e0(), cVar.g0(), cVar.g0() == p0.RAW ? null : Integer.valueOf(cVar.f0()));
    }

    public static void c(cf.a0 a0Var) throws GeneralSecurityException {
        if (a0Var == null || a0Var.e0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void d(j0 j0Var) throws GeneralSecurityException {
        if (j0Var == null || j0Var.f0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void e(j0 j0Var) throws GeneralSecurityException {
        for (j0.c cVar : j0Var.g0()) {
            if (cVar.e0().e0() == cf.f0.c.UNKNOWN_KEYMATERIAL || cVar.e0().e0() == cf.f0.c.SYMMETRIC || cVar.e0().e0() == cf.f0.c.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", cVar.e0().e0().name(), cVar.e0().f0()));
            }
        }
    }

    public static j0.c f(l lVar, n nVar, int i10) throws GeneralSecurityException {
        l0 l0Var = (l0) ye.d0.c().n(lVar, l0.class, j.a());
        Integer numC = l0Var.c();
        if (numC == null || numC.intValue() == i10) {
            return A(i10, x(nVar), l0Var);
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    public static j0 g(cf.a0 a0Var, re.a aVar, byte[] bArr) throws GeneralSecurityException {
        try {
            j0 j0VarK0 = j0.k0(aVar.b(a0Var.e0().v(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            d(j0VarK0);
            return j0VarK0;
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static cf.a0 h(j0 j0Var, re.a aVar, byte[] bArr) {
        return cf.a0.f0().F(com.google.crypto.tink.shaded.protobuf.h.e(aVar.a(j0Var.n(), bArr))).G(i0.b(j0Var)).build();
    }

    public static final p i(j0 j0Var) throws GeneralSecurityException {
        d(j0Var);
        return new p(j0Var, m(j0Var));
    }

    public static b.a j(x xVar) {
        return new b.a(xVar, null);
    }

    public static final p k(o oVar) {
        return l(oVar.d());
    }

    public static final p l(x xVar) {
        return s().b(j(xVar).j().i()).c();
    }

    public static List<c> m(j0 j0Var) {
        ArrayList arrayList = new ArrayList(j0Var.f0());
        for (j0.c cVar : j0Var.g0()) {
            int iF0 = cVar.f0();
            try {
                arrayList.add(new c(z(cVar), t(cVar.h0()), iF0, iF0 == j0Var.h0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static b s() {
        return new b();
    }

    public static n t(cf.g0 g0Var) throws GeneralSecurityException {
        int i10 = a.f30686a[g0Var.ordinal()];
        if (i10 == 1) {
            return n.b;
        }
        if (i10 == 2) {
            return n.f30680c;
        }
        if (i10 == 3) {
            return n.f30681d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Deprecated
    public static final p u(r rVar) throws GeneralSecurityException {
        try {
            return v(rVar.read().n());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final p v(byte[] bArr) throws GeneralSecurityException {
        try {
            j0 j0VarK0 = j0.k0(bArr, com.google.crypto.tink.shaded.protobuf.p.b());
            e(j0VarK0);
            return i(j0VarK0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final p w(r rVar, re.a aVar, byte[] bArr) throws GeneralSecurityException {
        cf.a0 a0VarA = rVar.a();
        c(a0VarA);
        return i(g(a0VarA, aVar, bArr));
    }

    public static cf.g0 x(n nVar) {
        if (n.b.equals(nVar)) {
            return cf.g0.ENABLED;
        }
        if (n.f30680c.equals(nVar)) {
            return cf.g0.DISABLED;
        }
        if (n.f30681d.equals(nVar)) {
            return cf.g0.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static l z(j0.c cVar) {
        return ye.d0.c().g(B(cVar), j.a());
    }

    @Deprecated
    public void C(s sVar, re.a aVar, byte[] bArr) {
        sVar.b(h(this.f30684a, aVar, bArr));
    }

    public j0 n() {
        return this.f30684a;
    }

    @Deprecated
    public k0 o() {
        return i0.b(this.f30684a);
    }

    @Deprecated
    public <P> P p(Class<P> cls) {
        return (P) q(c0.a(), cls);
    }

    public <P> P q(e eVar, Class<P> cls) throws GeneralSecurityException {
        if (!(eVar instanceof ye.j)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        ye.j jVar = (ye.j) eVar;
        Class<?> clsA = jVar.a(cls);
        if (clsA != null) {
            return (P) r(jVar, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <B, P> P r(ye.j jVar, Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        i0.e(this.f30684a);
        ye.j0.b bVarI = ye.j0.i(cls2);
        bVarI.e(this.f30685c);
        for (int i10 = 0; i10 < y(); i10++) {
            j0.c cVarE0 = this.f30684a.e0(i10);
            if (cVarE0.h0().equals(cf.g0.ENABLED)) {
                c cVar = this.b.get(i10);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + cVarE0.e0().f0() + " failed, unable to get primitive");
                }
                l lVarA = cVar.a();
                try {
                    Object objB = jVar.b(lVarA, cls2);
                    if (cVarE0.f0() == this.f30684a.h0()) {
                        bVarI.c(objB, lVarA, cVarE0);
                    } else {
                        bVarI.b(objB, lVarA, cVarE0);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2 + " for key of type " + cVarE0.e0().f0() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return (P) jVar.c(bVarI.d(), cls);
    }

    public String toString() {
        return o().toString();
    }

    public int y() {
        return this.b.size();
    }

    public p(j0 j0Var, List<c> list) {
        this.f30684a = j0Var;
        this.b = list;
        this.f30685c = ye.r.b;
    }

    public p(j0 j0Var, List<c> list, ye.r rVar) {
        this.f30684a = j0Var;
        this.b = list;
        this.f30685c = rVar;
    }
}
