package ye;

import af.h0;
import af.p0;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import pe.d0;
import pe.x;
import we.f0;
import we.g0;
import we.l0;
import we.m0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f36673a;
    public static final g0<xe.f, m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0<m0> f36674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<xe.a, l0> f36675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<l0> f36676e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36677a;

        static {
            int[] iArr = new int[p0.values().length];
            f36677a = iArr;
            try {
                iArr[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36677a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36677a[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36677a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f36673a = aVarH;
        b = g0.a(new g0.b() { // from class: ye.a
            @Override // we.g0.b
            public final we.p0 a(x xVar) {
                return e.k((xe.f) xVar);
            }
        }, xe.f.class, m0.class);
        f36674c = f0.a(new f0.b() { // from class: ye.b
            @Override // we.f0.b
            public final x a(we.p0 p0Var) {
                return e.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f36675d = we.n.a(new we.n.b() { // from class: ye.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, d0 d0Var) {
                return e.j((xe.a) lVar, d0Var);
            }
        }, xe.a.class, l0.class);
        f36676e = we.m.a(new we.m.b() { // from class: ye.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, d0 d0Var) {
                return e.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static af.c e(xe.f fVar) {
        return af.c.d0().C(fVar.c()).build();
    }

    public static xe.a f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            af.a aVarG0 = af.a.g0(l0Var.g(), p.b());
            if (aVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return xe.a.b().e(xe.f.b().b(aVarG0.c0().size()).c(aVarG0.d0().c0()).d(m(l0Var.e())).a()).c(ef.c.a(aVarG0.c0().x(), d0.b(d0Var))).d(l0Var.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static xe.f g(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                af.b bVarF0 = af.b.f0(m0Var.d().g0(), p.b());
                return xe.f.b().b(bVarF0.c0()).c(bVarF0.d0().c0()).d(m(m0Var.d().e0())).a();
            } catch (b0 e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f36674c);
        d0Var.k(f36675d);
        d0Var.j(f36676e);
    }

    public static l0 j(xe.a aVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.AesCmacKey", af.a.f0().D(e(aVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(aVar.c().d(d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, l(aVar.e().f()), aVar.a());
    }

    public static m0 k(xe.f fVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.AesCmacKey").E(af.b.e0().D(e(fVar)).C(fVar.d()).build().b()).C(l(fVar.f())).build());
    }

    public static p0 l(xe.f.c cVar) throws GeneralSecurityException {
        if (xe.f.c.b.equals(cVar)) {
            return p0.TINK;
        }
        if (xe.f.c.f35699c.equals(cVar)) {
            return p0.CRUNCHY;
        }
        if (xe.f.c.f35701e.equals(cVar)) {
            return p0.RAW;
        }
        if (xe.f.c.f35700d.equals(cVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static xe.f.c m(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f36677a[p0Var.ordinal()];
        if (i10 == 1) {
            return xe.f.c.b;
        }
        if (i10 == 2) {
            return xe.f.c.f35699c;
        }
        if (i10 == 3) {
            return xe.f.c.f35700d;
        }
        if (i10 == 4) {
            return xe.f.c.f35701e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
