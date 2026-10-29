package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oe.m<oe.a> f28495a = ve.o.e(d(), oe.a.class, ze.f0.c.SYMMETRIC, ze.n0.f0());
    public static final ve.w.a<u0> b = new ve.w.a() { // from class: pe.j0
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return l0.e((u0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.h0<t0, oe.a> f28496c = ve.h0.b(new ve.h0.b() { // from class: pe.k0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return l0.c((t0) lVar);
        }
    }, t0.class, oe.a.class);

    public static oe.a c(t0 t0Var) {
        String strD = t0Var.d().d();
        return qe.j0.c(i0.d(t0Var.d().c(), oe.u.a(strD).b(strD)), t0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static t0 e(u0 u0Var, Integer num) {
        return t0.b(u0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        z0.h();
        ve.w.f().b(b, u0.class);
        ve.a0.c().d(f28496c);
        ve.l.d().g(f28495a, z10);
    }
}
