package pe;

import af.j0;
import af.k0;
import af.p0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import we.l0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f28681a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we.r f28682c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28683a;

        static {
            int[] iArr = new int[af.g0.values().length];
            f28683a = iArr;
            try {
                iArr[af.g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28683a[af.g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28683a[af.g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f28684a = new ArrayList();
        public GeneralSecurityException b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public we.r f28685c = we.r.b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28686d = false;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f28687a;
            public n b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final l f28688c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final x f28689d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public C0502b f28690e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public b f28691f;

            public /* synthetic */ a(x xVar, a aVar) {
                this(xVar);
            }

            public a i() {
                b bVar = this.f28691f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f28687a = true;
                return this;
            }

            public a j() {
                this.f28690e = C0502b.e();
                return this;
            }

            public a(x xVar) {
                this.b = n.b;
                this.f28690e = null;
                this.f28691f = null;
                this.f28688c = null;
                this.f28689d = xVar;
            }
        }

        /* JADX INFO: renamed from: pe.p$b$b, reason: collision with other inner class name */
        public static class C0502b {
            public static final C0502b b = new C0502b();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28692a = 0;

            public static C0502b e() {
                return b;
            }

            public final int d() {
                return this.f28692a;
            }
        }

        public static void d(List<a> list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f28690e == C0502b.b && list.get(i10 + 1).f28690e != C0502b.b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        public static int f(a aVar, Set<Integer> set) throws GeneralSecurityException {
            if (aVar.f28690e != null) {
                return aVar.f28690e == C0502b.b ? g(set) : aVar.f28690e.d();
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
            if (aVar.f28691f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if (aVar.f28687a) {
                e();
            }
            aVar.f28691f = this;
            this.f28684a.add(aVar);
            return this;
        }

        public p c() throws GeneralSecurityException {
            c cVar;
            j0.c cVarF;
            if (this.b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.b);
            }
            if (this.f28686d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f28686d = true;
            j0.b bVarI0 = j0.i0();
            ArrayList arrayList = new ArrayList(this.f28684a.size());
            d(this.f28684a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f28684a) {
                if (aVar2.b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iF = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iF))) {
                    throw new GeneralSecurityException("Id " + iF + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iF));
                if (aVar2.f28688c != null) {
                    cVar = new c(aVar2.f28688c, aVar2.b, iF, aVar2.f28687a, null);
                    cVarF = p.f(aVar2.f28688c, aVar2.b, iF);
                } else {
                    l lVarC = we.w.f().c(aVar2.f28689d, aVar2.f28689d.a() ? Integer.valueOf(iF) : null);
                    cVar = new c(lVarC, aVar2.b, iF, aVar2.f28687a, null);
                    cVarF = p.f(lVarC, aVar2.b, iF);
                }
                bVarI0.C(cVarF);
                if (aVar2.f28687a) {
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
            bVarI0.D(numValueOf.intValue());
            j0 j0VarBuild = bVarI0.build();
            p.d(j0VarBuild);
            return new p(j0VarBuild, arrayList, this.f28685c, aVar);
        }

        public final void e() {
            Iterator<a> it = this.f28684a.iterator();
            while (it.hasNext()) {
                it.next().f28687a = false;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f28693a;
        public final n b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f28694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f28695d;

        public /* synthetic */ c(l lVar, n nVar, int i10, boolean z10, a aVar) {
            this(lVar, nVar, i10, z10);
        }

        public l a() {
            return this.f28693a;
        }

        public c(l lVar, n nVar, int i10, boolean z10) {
            this.f28693a = lVar;
            this.b = nVar;
            this.f28694c = i10;
            this.f28695d = z10;
        }
    }

    public /* synthetic */ p(j0 j0Var, List list, we.r rVar, a aVar) {
        this(j0Var, list, rVar);
    }

    public static j0.c A(int i10, af.g0 g0Var, l0 l0Var) {
        return j0.c.j0().C(af.f0.h0().D(l0Var.f()).E(l0Var.g()).C(l0Var.d())).J(g0Var).E(i10).G(l0Var.e()).build();
    }

    public static l0 B(j0.c cVar) {
        return l0.b(cVar.e0().f0(), cVar.e0().g0(), cVar.e0().e0(), cVar.g0(), cVar.g0() == p0.RAW ? null : Integer.valueOf(cVar.f0()));
    }

    public static void c(af.a0 a0Var) throws GeneralSecurityException {
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
            if (cVar.e0().e0() == af.f0.c.UNKNOWN_KEYMATERIAL || cVar.e0().e0() == af.f0.c.SYMMETRIC || cVar.e0().e0() == af.f0.c.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", cVar.e0().e0().name(), cVar.e0().f0()));
            }
        }
    }

    public static j0.c f(l lVar, n nVar, int i10) throws GeneralSecurityException {
        l0 l0Var = (l0) we.d0.c().n(lVar, l0.class, j.a());
        Integer numC = l0Var.c();
        if (numC == null || numC.intValue() == i10) {
            return A(i10, x(nVar), l0Var);
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    public static j0 g(af.a0 a0Var, pe.a aVar, byte[] bArr) throws GeneralSecurityException {
        try {
            j0 j0VarK0 = j0.k0(aVar.b(a0Var.e0().x(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            d(j0VarK0);
            return j0VarK0;
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static af.a0 h(j0 j0Var, pe.a aVar, byte[] bArr) {
        return af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(aVar.a(j0Var.n(), bArr))).E(i0.b(j0Var)).build();
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

    public static n t(af.g0 g0Var) throws GeneralSecurityException {
        int i10 = a.f28683a[g0Var.ordinal()];
        if (i10 == 1) {
            return n.b;
        }
        if (i10 == 2) {
            return n.f28677c;
        }
        if (i10 == 3) {
            return n.f28678d;
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
    public static final p w(r rVar, pe.a aVar, byte[] bArr) throws GeneralSecurityException {
        af.a0 a0VarA = rVar.a();
        c(a0VarA);
        return i(g(a0VarA, aVar, bArr));
    }

    public static af.g0 x(n nVar) {
        if (n.b.equals(nVar)) {
            return af.g0.ENABLED;
        }
        if (n.f28677c.equals(nVar)) {
            return af.g0.DISABLED;
        }
        if (n.f28678d.equals(nVar)) {
            return af.g0.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static l z(j0.c cVar) {
        return we.d0.c().g(B(cVar), j.a());
    }

    @Deprecated
    public void C(s sVar, pe.a aVar, byte[] bArr) {
        sVar.b(h(this.f28681a, aVar, bArr));
    }

    public j0 n() {
        return this.f28681a;
    }

    @Deprecated
    public k0 o() {
        return i0.b(this.f28681a);
    }

    @Deprecated
    public <P> P p(Class<P> cls) {
        return (P) q(c0.a(), cls);
    }

    public <P> P q(e eVar, Class<P> cls) throws GeneralSecurityException {
        if (!(eVar instanceof we.j)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        we.j jVar = (we.j) eVar;
        Class<?> clsA = jVar.a(cls);
        if (clsA != null) {
            return (P) r(jVar, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <B, P> P r(we.j jVar, Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        i0.e(this.f28681a);
        we.j0.b bVarI = we.j0.i(cls2);
        bVarI.e(this.f28682c);
        for (int i10 = 0; i10 < y(); i10++) {
            j0.c cVarE0 = this.f28681a.e0(i10);
            if (cVarE0.h0().equals(af.g0.ENABLED)) {
                c cVar = this.b.get(i10);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + cVarE0.e0().f0() + " failed, unable to get primitive");
                }
                l lVarA = cVar.a();
                try {
                    Object objB = jVar.b(lVarA, cls2);
                    if (cVarE0.f0() == this.f28681a.h0()) {
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
        this.f28681a = j0Var;
        this.b = list;
        this.f28682c = we.r.b;
    }

    public p(j0 j0Var, List<c> list, we.r rVar) {
        this.f28681a = j0Var;
        this.b = list;
        this.f28682c = rVar;
    }
}
