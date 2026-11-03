package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pe.m<pe.a> f29743a = we.o.e(d(), pe.a.class, af.f0.c.SYMMETRIC, af.n0.f0());
    public static final we.w.a<u0> b = new we.w.a() { // from class: qe.j0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return l0.e((u0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.h0<t0, pe.a> f29744c = we.h0.b(new we.h0.b() { // from class: qe.k0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return l0.c((t0) lVar);
        }
    }, t0.class, pe.a.class);

    public static pe.a c(t0 t0Var) {
        String strD = t0Var.d().d();
        return re.j0.c(i0.d(t0Var.d().c(), pe.u.a(strD).b(strD)), t0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static t0 e(u0 u0Var, Integer num) {
        return t0.b(u0Var, num);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        z0.h();
        we.w.f().b(b, u0.class);
        we.a0.c().d(f29744c);
        we.l.d().g(f29743a, z10);
    }
}
