package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<m0, pe.a> f29696a = we.h0.b(new we.h0.b() { // from class: qe.f0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return h0.c((m0) lVar);
        }
    }, m0.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(d(), pe.a.class, af.f0.c.REMOTE, af.l0.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.w.a<n0> f29697c = new we.w.a() { // from class: qe.g0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return h0.e((n0) xVar, num);
        }
    };

    public static pe.a c(m0 m0Var) {
        return re.j0.c(pe.u.a(m0Var.d().c()).b(m0Var.d().c()), m0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static m0 e(n0 n0Var, Integer num) {
        return m0.b(n0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        s0.g();
        we.a0.c().d(f29696a);
        we.w.f().b(f29697c, n0.class);
        we.l.d().g(b, z10);
    }
}
