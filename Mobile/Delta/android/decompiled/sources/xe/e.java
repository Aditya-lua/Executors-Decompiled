package xe;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import oe.d0;
import oe.x;
import ve.f0;
import ve.g0;
import ve.l0;
import ve.m0;
import ve.s0;
import ze.h0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f35163a;
    public static final g0<we.f, m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0<m0> f35164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<we.a, l0> f35165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<l0> f35166e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35167a;

        static {
            int[] iArr = new int[p0.values().length];
            f35167a = iArr;
            try {
                iArr[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35167a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35167a[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35167a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f35163a = aVarH;
        b = g0.a(new g0.b() { // from class: xe.a
            @Override // ve.g0.b
            public final ve.p0 a(x xVar) {
                return e.k((we.f) xVar);
            }
        }, we.f.class, m0.class);
        f35164c = f0.a(new f0.b() { // from class: xe.b
            @Override // ve.f0.b
            public final x a(ve.p0 p0Var) {
                return e.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f35165d = ve.n.a(new ve.n.b() { // from class: xe.c
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, d0 d0Var) {
                return e.j((we.a) lVar, d0Var);
            }
        }, we.a.class, l0.class);
        f35166e = ve.m.a(new ve.m.b() { // from class: xe.d
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, d0 d0Var) {
                return e.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static ze.c e(we.f fVar) {
        return ze.c.d0().C(fVar.c()).build();
    }

    public static we.a f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            ze.a aVarG0 = ze.a.g0(l0Var.g(), p.b());
            if (aVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return we.a.b().e(we.f.b().b(aVarG0.c0().size()).c(aVarG0.d0().c0()).d(m(l0Var.e())).a()).c(df.c.a(aVarG0.c0().x(), d0.b(d0Var))).d(l0Var.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static we.f g(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                ze.b bVarF0 = ze.b.f0(m0Var.d().g0(), p.b());
                return we.f.b().b(bVarF0.c0()).c(bVarF0.d0().c0()).d(m(m0Var.d().e0())).a();
            } catch (b0 e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(ve.d0.c());
    }

    public static void i(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f35164c);
        d0Var.k(f35165d);
        d0Var.j(f35166e);
    }

    public static l0 j(we.a aVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.AesCmacKey", ze.a.f0().D(e(aVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(aVar.c().d(d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, l(aVar.e().f()), aVar.a());
    }

    public static m0 k(we.f fVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.AesCmacKey").E(ze.b.e0().D(e(fVar)).C(fVar.d()).build().b()).C(l(fVar.f())).build());
    }

    public static p0 l(we.f.c cVar) throws GeneralSecurityException {
        if (we.f.c.b.equals(cVar)) {
            return p0.TINK;
        }
        if (we.f.c.f34200c.equals(cVar)) {
            return p0.CRUNCHY;
        }
        if (we.f.c.f34202e.equals(cVar)) {
            return p0.RAW;
        }
        if (we.f.c.f34201d.equals(cVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static we.f.c m(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f35167a[p0Var.ordinal()];
        if (i10 == 1) {
            return we.f.c.b;
        }
        if (i10 == 2) {
            return we.f.c.f34200c;
        }
        if (i10 == 3) {
            return we.f.c.f34201d;
        }
        if (i10 == 4) {
            return we.f.c.f34202e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
