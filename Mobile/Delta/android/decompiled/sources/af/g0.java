package af;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class g0 implements ve.k0<oe.z, oe.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f415a = new g0();
    public static final ve.h0<ve.p, oe.z> b = ve.h0.b(new ve.h0.b() { // from class: af.f0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return bf.o.b((ve.p) lVar);
        }
    }, ve.p.class, oe.z.class);

    public static class a implements oe.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ve.j0<oe.z> f416a;
        public final ve.s.a b;

        public a(ve.j0<oe.z> j0Var) {
            this.f416a = j0Var;
            if (j0Var.h()) {
                this.b = ve.y.b().a().a(ve.u.a(j0Var), "public_key_sign", "sign");
            } else {
                this.b = ve.u.f33020a;
            }
        }

        @Override // oe.z
        public byte[] a(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f416a.d().b().a(bArr);
                this.b.a(this.f416a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }
    }

    public static void d() {
        ve.a0.c().e(f415a);
        ve.a0.c().d(b);
    }

    @Override // ve.k0
    public Class<oe.z> a() {
        return oe.z.class;
    }

    @Override // ve.k0
    public Class<oe.z> c() {
        return oe.z.class;
    }

    @Override // ve.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oe.z b(ve.j0<oe.z> j0Var) {
        return new a(j0Var);
    }
}
