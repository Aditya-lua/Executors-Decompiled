package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<m0, re.a> f31327a = ye.h0.b(new ye.h0.b() { // from class: se.f0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return h0.c((m0) lVar);
        }
    }, m0.class, re.a.class);
    public static final re.m<re.a> b = ye.o.e(d(), re.a.class, cf.f0.c.REMOTE, cf.l0.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.w.a<n0> f31328c = new ye.w.a() { // from class: se.g0
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return h0.e((n0) xVar, num);
        }
    };

    public static re.a c(m0 m0Var) {
        return te.j0.c(re.u.a(m0Var.d().c()).b(m0Var.d().c()), m0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static m0 e(n0 n0Var, Integer num) {
        return m0.b(n0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        s0.g();
        ye.a0.c().d(f31327a);
        ye.w.f().b(f31328c, n0.class);
        ye.l.d().g(b, z10);
    }
}
