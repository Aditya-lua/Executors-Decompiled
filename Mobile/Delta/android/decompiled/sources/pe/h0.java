package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<m0, oe.a> f28448a = ve.h0.b(new ve.h0.b() { // from class: pe.f0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return h0.c((m0) lVar);
        }
    }, m0.class, oe.a.class);
    public static final oe.m<oe.a> b = ve.o.e(d(), oe.a.class, ze.f0.c.REMOTE, ze.l0.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.w.a<n0> f28449c = new ve.w.a() { // from class: pe.g0
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return h0.e((n0) xVar, num);
        }
    };

    public static oe.a c(m0 m0Var) {
        return qe.j0.c(oe.u.a(m0Var.d().c()).b(m0Var.d().c()), m0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static m0 e(n0 n0Var, Integer num) {
        return m0.b(n0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        s0.g();
        ve.a0.c().d(f28448a);
        ve.w.f().b(f28449c, n0.class);
        ve.l.d().g(b, z10);
    }
}
