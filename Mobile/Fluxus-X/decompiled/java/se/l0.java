package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final re.m<re.a> f31374a = ye.o.e(d(), re.a.class, cf.f0.c.SYMMETRIC, cf.n0.f0());
    public static final ye.w.a<u0> b = new ye.w.a() { // from class: se.j0
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return l0.e((u0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.h0<t0, re.a> f31375c = ye.h0.b(new ye.h0.b() { // from class: se.k0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return l0.c((t0) lVar);
        }
    }, t0.class, re.a.class);

    public static re.a c(t0 t0Var) {
        String strD = t0Var.d().d();
        return te.j0.c(i0.d(t0Var.d().c(), re.u.a(strD).b(strD)), t0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static t0 e(u0 u0Var, Integer num) {
        return t0.b(u0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        z0.h();
        ye.w.f().b(b, u0.class);
        ye.a0.c().d(f31375c);
        ye.l.d().g(f31374a, z10);
    }
}
