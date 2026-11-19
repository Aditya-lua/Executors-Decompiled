package af;

import cf.h0;
import cf.p0;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import re.d0;
import re.x;
import ye.f0;
import ye.g0;
import ye.l0;
import ye.m0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f413a;
    public static final g0<ze.f, m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0<m0> f414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<ze.a, l0> f415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<l0> f416e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417a;

        static {
            int[] iArr = new int[p0.values().length];
            f417a = iArr;
            try {
                iArr[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417a[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f417a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f413a = aVarH;
        b = g0.a(new g0.b() { // from class: af.a
            @Override // ye.g0.b
            public final ye.p0 a(x xVar) {
                return e.k((ze.f) xVar);
            }
        }, ze.f.class, m0.class);
        f414c = f0.a(new f0.b() { // from class: af.b
            @Override // ye.f0.b
            public final x a(ye.p0 p0Var) {
                return e.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f415d = ye.n.a(new ye.n.b() { // from class: af.c
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, d0 d0Var) {
                return e.j((ze.a) lVar, d0Var);
            }
        }, ze.a.class, l0.class);
        f416e = ye.m.a(new ye.m.b() { // from class: af.d
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, d0 d0Var) {
                return e.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static cf.c e(ze.f fVar) {
        return cf.c.d0().D(fVar.c()).build();
    }

    public static ze.a f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            cf.a aVarG0 = cf.a.g0(l0Var.g(), p.b());
            if (aVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return ze.a.b().e(ze.f.b().b(aVarG0.c0().size()).c(aVarG0.d0().c0()).d(m(l0Var.e())).a()).c(gf.c.a(aVarG0.c0().v(), d0.b(d0Var))).d(l0Var.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static ze.f g(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                cf.b bVarF0 = cf.b.f0(m0Var.d().g0(), p.b());
                return ze.f.b().b(bVarF0.c0()).c(bVarF0.d0().c0()).d(m(m0Var.d().e0())).a();
            } catch (b0 e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(ye.d0.c());
    }

    public static void i(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f414c);
        d0Var.k(f415d);
        d0Var.j(f416e);
    }

    public static l0 j(ze.a aVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.AesCmacKey", cf.a.f0().F(e(aVar.e())).D(com.google.crypto.tink.shaded.protobuf.h.e(aVar.c().d(d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, l(aVar.e().f()), aVar.a());
    }

    public static m0 k(ze.f fVar) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.AesCmacKey").G(cf.b.e0().F(e(fVar)).D(fVar.d()).build().b()).D(l(fVar.f())).build());
    }

    public static p0 l(ze.f.c cVar) throws GeneralSecurityException {
        if (ze.f.c.b.equals(cVar)) {
            return p0.TINK;
        }
        if (ze.f.c.f39250c.equals(cVar)) {
            return p0.CRUNCHY;
        }
        if (ze.f.c.f39252e.equals(cVar)) {
            return p0.RAW;
        }
        if (ze.f.c.f39251d.equals(cVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static ze.f.c m(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f417a[p0Var.ordinal()];
        if (i10 == 1) {
            return ze.f.c.b;
        }
        if (i10 == 2) {
            return ze.f.c.f39250c;
        }
        if (i10 == 3) {
            return ze.f.c.f39251d;
        }
        if (i10 == 4) {
            return ze.f.c.f39252e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
