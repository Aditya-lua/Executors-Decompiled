package pe;

import af.C0204a0;
import af.C0218f0;
import af.C0226j0;
import af.C0228k0;
import af.EnumC0220g0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p515we.AbstractC12375j;
import p515we.C12364d0;
import p515we.C12376j0;
import p515we.C12380l0;
import p515we.C12391r;
import p515we.C12394s0;
import p515we.C12398w;

/* JADX INFO: renamed from: pe.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10235p {

    /* JADX INFO: renamed from: a */
    public final C0226j0 f36839a;

    /* JADX INFO: renamed from: b */
    public final List<c> f36840b;

    /* JADX INFO: renamed from: c */
    public final C12391r f36841c;

    /* JADX INFO: renamed from: pe.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36842a;

        static {
            int[] iArr = new int[EnumC0220g0.values().length];
            f36842a = iArr;
            try {
                iArr[EnumC0220g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36842a[EnumC0220g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36842a[EnumC0220g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: pe.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<a> f36843a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public GeneralSecurityException f36844b = null;

        /* JADX INFO: renamed from: c */
        public C12391r f36845c = C12391r.f44342b;

        /* JADX INFO: renamed from: d */
        public boolean f36846d = false;

        /* JADX INFO: renamed from: pe.p$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public boolean f36847a;

            /* JADX INFO: renamed from: b */
            public C10233n f36848b;

            /* JADX INFO: renamed from: c */
            public final AbstractC10231l f36849c;

            /* JADX INFO: renamed from: d */
            public final AbstractC10243x f36850d;

            /* JADX INFO: renamed from: e */
            public C14230b f36851e;

            /* JADX INFO: renamed from: f */
            public b f36852f;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 pe.x) A[MD:(pe.x):void (m)] (LINE:1) call: pe.p.b.a.<init>(pe.x):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ a(AbstractC10243x abstractC10243x, a aVar) {
                this(abstractC10243x);
            }

            /* JADX INFO: renamed from: i */
            public a m39387i() {
                b bVar = this.f36852f;
                if (bVar != null) {
                    bVar.m39378e();
                }
                this.f36847a = true;
                return this;
            }

            /* JADX INFO: renamed from: j */
            public a m39388j() {
                this.f36851e = C14230b.m39392e();
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public a(AbstractC10243x abstractC10243x) {
                this.f36848b = C10233n.f36833b;
                this.f36851e = null;
                this.f36852f = null;
                this.f36849c = null;
                this.f36850d = abstractC10243x;
            }
        }

        /* JADX INFO: renamed from: pe.p$b$b, reason: collision with other inner class name */
        public static class C14230b {

            /* JADX INFO: renamed from: b */
            public static final C14230b f36853b = new C14230b();

            /* JADX INFO: renamed from: a */
            public final int f36854a = 0;

            /* JADX INFO: renamed from: e */
            public static C14230b m39392e() {
                return f36853b;
            }

            /* JADX INFO: renamed from: d */
            public final int m39393d() {
                return this.f36854a;
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m39373d(List<a> list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f36851e == C14230b.f36853b && list.get(i10 + 1).f36851e != C14230b.f36853b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static int m39374f(a aVar, Set<Integer> set) throws GeneralSecurityException {
            if (aVar.f36851e != null) {
                return aVar.f36851e == C14230b.f36853b ? m39375g(set) : aVar.f36851e.m39393d();
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        /* JADX INFO: renamed from: g */
        public static int m39375g(Set<Integer> set) {
            int iM46453f = 0;
            while (true) {
                if (iM46453f != 0 && !set.contains(Integer.valueOf(iM46453f))) {
                    return iM46453f;
                }
                iM46453f = C12394s0.m46453f();
            }
        }

        /* JADX INFO: renamed from: b */
        public b m39376b(a aVar) {
            if (aVar.f36852f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if (aVar.f36847a) {
                m39378e();
            }
            aVar.f36852f = this;
            this.f36843a.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C10235p m39377c() throws GeneralSecurityException {
            c cVar;
            C0226j0.c cVarM39350f;
            if (this.f36844b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.f36844b);
            }
            if (this.f36846d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f36846d = true;
            C0226j0.b bVarM797i0 = C0226j0.m797i0();
            ArrayList arrayList = new ArrayList(this.f36843a.size());
            m39373d(this.f36843a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f36843a) {
                if (aVar2.f36848b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iM39374f = m39374f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iM39374f))) {
                    throw new GeneralSecurityException("Id " + iM39374f + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iM39374f));
                if (aVar2.f36849c != null) {
                    cVar = new c(aVar2.f36849c, aVar2.f36848b, iM39374f, aVar2.f36847a, null);
                    cVarM39350f = C10235p.m39350f(aVar2.f36849c, aVar2.f36848b, iM39374f);
                } else {
                    AbstractC10231l abstractC10231lM46471c = C12398w.m46468f().m46471c(aVar2.f36850d, aVar2.f36850d.mo7230a() ? Integer.valueOf(iM39374f) : null);
                    cVar = new c(abstractC10231lM46471c, aVar2.f36848b, iM39374f, aVar2.f36847a, null);
                    cVarM39350f = C10235p.m39350f(abstractC10231lM46471c, aVar2.f36848b, iM39374f);
                }
                bVarM797i0.m807C(cVarM39350f);
                if (aVar2.f36847a) {
                    if (numValueOf != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    numValueOf = Integer.valueOf(iM39374f);
                    if (aVar2.f36848b != C10233n.f36833b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (numValueOf == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            bVarM797i0.m808D(numValueOf.intValue());
            C0226j0 c0226j0Build = bVarM797i0.build();
            C10235p.m39348d(c0226j0Build);
            return new C10235p(c0226j0Build, arrayList, this.f36845c, aVar);
        }

        /* JADX INFO: renamed from: e */
        public final void m39378e() {
            Iterator<a> it = this.f36843a.iterator();
            while (it.hasNext()) {
                it.next().f36847a = false;
            }
        }
    }

    /* JADX INFO: renamed from: pe.p$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final AbstractC10231l f36855a;

        /* JADX INFO: renamed from: b */
        public final C10233n f36856b;

        /* JADX INFO: renamed from: c */
        public final int f36857c;

        /* JADX INFO: renamed from: d */
        public final boolean f36858d;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 pe.l), (r2v0 pe.n), (r3v0 int), (r4v0 boolean) A[MD:(pe.l, pe.n, int, boolean):void (m)] (LINE:1) call: pe.p.c.<init>(pe.l, pe.n, int, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(AbstractC10231l abstractC10231l, C10233n c10233n, int i10, boolean z10, a aVar) {
            this(abstractC10231l, c10233n, i10, z10);
        }

        /* JADX INFO: renamed from: a */
        public AbstractC10231l m39394a() {
            return this.f36855a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(AbstractC10231l abstractC10231l, C10233n c10233n, int i10, boolean z10) {
            this.f36855a = abstractC10231l;
            this.f36856b = c10233n;
            this.f36857c = i10;
            this.f36858d = z10;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 af.j0), (r2v0 java.util.List), (r3v0 we.r) A[MD:(af.j0, java.util.List<pe.p$c>, we.r):void (m)] (LINE:1) call: pe.p.<init>(af.j0, java.util.List, we.r):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C10235p(C0226j0 c0226j0, List list, C12391r c12391r, a aVar) {
        this(c0226j0, list, c12391r);
    }

    /* JADX INFO: renamed from: A */
    public static C0226j0.c m39343A(int i10, EnumC0220g0 enumC0220g0, C12380l0 c12380l0) {
        return C0226j0.c.m814j0().m824C(C0218f0.m720h0().m728D(c12380l0.m46396f()).m729E(c12380l0.m46397g()).m727C(c12380l0.m46394d())).m828J(enumC0220g0).m826E(i10).m827G(c12380l0.m46395e()).build();
    }

    /* JADX INFO: renamed from: B */
    public static C12380l0 m39344B(C0226j0.c cVar) {
        return C12380l0.m46391b(cVar.m816e0().m722f0(), cVar.m816e0().m723g0(), cVar.m816e0().m721e0(), cVar.m818g0(), cVar.m818g0() == EnumC0238p0.RAW ? null : Integer.valueOf(cVar.m817f0()));
    }

    /* JADX INFO: renamed from: c */
    public static void m39347c(C0204a0 c0204a0) throws GeneralSecurityException {
        if (c0204a0 == null || c0204a0.m586e0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m39348d(C0226j0 c0226j0) throws GeneralSecurityException {
        if (c0226j0 == null || c0226j0.m803f0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m39349e(C0226j0 c0226j0) throws GeneralSecurityException {
        for (C0226j0.c cVar : c0226j0.m804g0()) {
            if (cVar.m816e0().m721e0() == C0218f0.c.UNKNOWN_KEYMATERIAL || cVar.m816e0().m721e0() == C0218f0.c.SYMMETRIC || cVar.m816e0().m721e0() == C0218f0.c.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", cVar.m816e0().m721e0().name(), cVar.m816e0().m722f0()));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0226j0.c m39350f(AbstractC10231l abstractC10231l, C10233n c10233n, int i10) throws GeneralSecurityException {
        C12380l0 c12380l0 = (C12380l0) C12364d0.m46238c().m46249n(abstractC10231l, C12380l0.class, C10229j.m39322a());
        Integer numM46393c = c12380l0.m46393c();
        if (numM46393c == null || numM46393c.intValue() == i10) {
            return m39343A(i10, m39363x(c10233n), c12380l0);
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    /* JADX INFO: renamed from: g */
    public static C0226j0 m39351g(C0204a0 c0204a0, InterfaceC10211a interfaceC10211a, byte[] bArr) throws GeneralSecurityException {
        try {
            C0226j0 c0226j0M799k0 = C0226j0.m799k0(interfaceC10211a.mo22646b(c0204a0.m586e0().m13569x(), bArr), C2944p.m14035b());
            m39348d(c0226j0M799k0);
            return c0226j0M799k0;
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: renamed from: h */
    public static C0204a0 m39352h(C0226j0 c0226j0, InterfaceC10211a interfaceC10211a, byte[] bArr) {
        return C0204a0.m583f0().m590D(AbstractC2920h.m13555e(interfaceC10211a.mo22645a(c0226j0.m13375n(), bArr))).m591E(C10228i0.m39318b(c0226j0)).build();
    }

    /* JADX INFO: renamed from: i */
    public static final C10235p m39353i(C0226j0 c0226j0) throws GeneralSecurityException {
        m39348d(c0226j0);
        return new C10235p(c0226j0, m39357m(c0226j0));
    }

    /* JADX INFO: renamed from: j */
    public static b.a m39354j(AbstractC10243x abstractC10243x) {
        return new b.a(abstractC10243x, null);
    }

    /* JADX INFO: renamed from: k */
    public static final C10235p m39355k(C10234o c10234o) {
        return m39356l(c10234o.m39342d());
    }

    /* JADX INFO: renamed from: l */
    public static final C10235p m39356l(AbstractC10243x abstractC10243x) {
        return m39358s().m39376b(m39354j(abstractC10243x).m39388j().m39387i()).m39377c();
    }

    /* JADX INFO: renamed from: m */
    public static List<c> m39357m(C0226j0 c0226j0) {
        ArrayList arrayList = new ArrayList(c0226j0.m803f0());
        for (C0226j0.c cVar : c0226j0.m804g0()) {
            int iM817f0 = cVar.m817f0();
            try {
                arrayList.add(new c(m39364z(cVar), m39359t(cVar.m819h0()), iM817f0, iM817f0 == c0226j0.m805h0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static b m39358s() {
        return new b();
    }

    /* JADX INFO: renamed from: t */
    public static C10233n m39359t(EnumC0220g0 enumC0220g0) throws GeneralSecurityException {
        int i10 = a.f36842a[enumC0220g0.ordinal()];
        if (i10 == 1) {
            return C10233n.f36833b;
        }
        if (i10 == 2) {
            return C10233n.f36834c;
        }
        if (i10 == 3) {
            return C10233n.f36835d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static final C10235p m39360u(InterfaceC10237r interfaceC10237r) throws GeneralSecurityException {
        try {
            return m39361v(interfaceC10237r.read().m13375n());
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public static final C10235p m39361v(byte[] bArr) throws GeneralSecurityException {
        try {
            C0226j0 c0226j0M799k0 = C0226j0.m799k0(bArr, C2944p.m14035b());
            m39349e(c0226j0M799k0);
            return m39353i(c0226j0M799k0);
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public static final C10235p m39362w(InterfaceC10237r interfaceC10237r, InterfaceC10211a interfaceC10211a, byte[] bArr) throws GeneralSecurityException {
        C0204a0 c0204a0Mo39297a = interfaceC10237r.mo39297a();
        m39347c(c0204a0Mo39297a);
        return m39353i(m39351g(c0204a0Mo39297a, interfaceC10211a, bArr));
    }

    /* JADX INFO: renamed from: x */
    public static EnumC0220g0 m39363x(C10233n c10233n) {
        if (C10233n.f36833b.equals(c10233n)) {
            return EnumC0220g0.ENABLED;
        }
        if (C10233n.f36834c.equals(c10233n)) {
            return EnumC0220g0.DISABLED;
        }
        if (C10233n.f36835d.equals(c10233n)) {
            return EnumC0220g0.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    /* JADX INFO: renamed from: z */
    public static AbstractC10231l m39364z(C0226j0.c cVar) {
        return C12364d0.m46238c().m46242g(m39344B(cVar), C10229j.m39322a());
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    public void m39365C(InterfaceC10238s interfaceC10238s, InterfaceC10211a interfaceC10211a, byte[] bArr) {
        interfaceC10238s.mo39305b(m39352h(this.f36839a, interfaceC10211a, bArr));
    }

    /* JADX INFO: renamed from: n */
    public C0226j0 m39366n() {
        return this.f36839a;
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public C0228k0 m39367o() {
        return C10228i0.m39318b(this.f36839a);
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public <P> P m39368p(Class<P> cls) {
        return (P) m39369q(C10216c0.m39306a(), cls);
    }

    /* JADX INFO: renamed from: q */
    public <P> P m39369q(AbstractC10219e abstractC10219e, Class<P> cls) throws GeneralSecurityException {
        if (!(abstractC10219e instanceof AbstractC12375j)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        AbstractC12375j abstractC12375j = (AbstractC12375j) abstractC10219e;
        Class<?> clsMo46355a = abstractC12375j.mo46355a(cls);
        if (clsMo46355a != null) {
            return (P) m39370r(abstractC12375j, cls, clsMo46355a);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: we.j0$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final <B, P> P m39370r(AbstractC12375j abstractC12375j, Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        C10228i0.m39321e(this.f36839a);
        C12376j0.b bVarM46359i = C12376j0.m46359i(cls2);
        bVarM46359i.m46372e(this.f36841c);
        for (int i10 = 0; i10 < m39371y(); i10++) {
            C0226j0.c cVarM802e0 = this.f36839a.m802e0(i10);
            if (cVarM802e0.m819h0().equals(EnumC0220g0.ENABLED)) {
                c cVar = this.f36840b.get(i10);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + cVarM802e0.m816e0().m722f0() + " failed, unable to get primitive");
                }
                AbstractC10231l abstractC10231lM39394a = cVar.m39394a();
                try {
                    Object objMo46356b = abstractC12375j.mo46356b(abstractC10231lM39394a, cls2);
                    if (cVarM802e0.m817f0() == this.f36839a.m805h0()) {
                        bVarM46359i.m46370c(objMo46356b, abstractC10231lM39394a, cVarM802e0);
                    } else {
                        bVarM46359i.m46369b(objMo46356b, abstractC10231lM39394a, cVarM802e0);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2 + " for key of type " + cVarM802e0.m816e0().m722f0() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return (P) abstractC12375j.mo46357c(bVarM46359i.m46371d(), cls);
    }

    public String toString() {
        return m39367o().toString();
    }

    /* JADX INFO: renamed from: y */
    public int m39371y() {
        return this.f36840b.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10235p(C0226j0 c0226j0, List<c> list) {
        this.f36839a = c0226j0;
        this.f36840b = list;
        this.f36841c = C12391r.f44342b;
    }

    public C10235p(C0226j0 c0226j0, List<c> list, C12391r c12391r) {
        this.f36839a = c0226j0;
        this.f36840b = list;
        this.f36841c = c12391r;
    }
}
