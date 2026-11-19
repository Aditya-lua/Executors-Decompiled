package df;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class g0 implements ye.k0<re.z, re.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f12285a = new g0();
    public static final ye.h0<ye.p, re.z> b = ye.h0.b(new ye.h0.b() { // from class: df.f0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ef.o.b((ye.p) lVar);
        }
    }, ye.p.class, re.z.class);

    public static class a implements re.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ye.j0<re.z> f12286a;
        public final ye.s.a b;

        public a(ye.j0<re.z> j0Var) {
            this.f12286a = j0Var;
            if (j0Var.h()) {
                this.b = ye.y.b().a().a(ye.u.a(j0Var), "public_key_sign", "sign");
            } else {
                this.b = ye.u.f37831a;
            }
        }

        @Override // re.z
        public byte[] a(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f12286a.d().b().a(bArr);
                this.b.a(this.f12286a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }
    }

    public static void d() {
        ye.a0.c().e(f12285a);
        ye.a0.c().d(b);
    }

    @Override // ye.k0
    public Class<re.z> a() {
        return re.z.class;
    }

    @Override // ye.k0
    public Class<re.z> b() {
        return re.z.class;
    }

    @Override // ye.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public re.z c(ye.j0<re.z> j0Var) {
        return new a(j0Var);
    }
}
