package bf;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class g0 implements we.k0<pe.z, pe.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f4087a = new g0();
    public static final we.h0<we.p, pe.z> b = we.h0.b(new we.h0.b() { // from class: bf.f0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return cf.o.b((we.p) lVar);
        }
    }, we.p.class, pe.z.class);

    public static class a implements pe.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final we.j0<pe.z> f4088a;
        public final we.s.a b;

        public a(we.j0<pe.z> j0Var) {
            this.f4088a = j0Var;
            if (j0Var.h()) {
                this.b = we.y.b().a().a(we.u.a(j0Var), "public_key_sign", "sign");
            } else {
                this.b = we.u.f34474a;
            }
        }

        @Override // pe.z
        public byte[] a(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f4088a.d().b().a(bArr);
                this.b.a(this.f4088a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }
    }

    public static void d() {
        we.a0.c().e(f4087a);
        we.a0.c().d(b);
    }

    @Override // we.k0
    public Class<pe.z> a() {
        return pe.z.class;
    }

    @Override // we.k0
    public Class<pe.z> c() {
        return pe.z.class;
    }

    @Override // we.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public pe.z b(we.j0<pe.z> j0Var) {
        return new a(j0Var);
    }
}
