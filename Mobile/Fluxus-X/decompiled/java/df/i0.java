package df;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements ye.k0<re.a0, re.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f12292a = new i0();
    public static final ye.h0<ye.p, re.a0> b = ye.h0.b(new ye.h0.b() { // from class: df.h0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ef.p.b((ye.p) lVar);
        }
    }, ye.p.class, re.a0.class);

    public static class a implements re.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ye.j0<re.a0> f12293a;
        public final ye.s.a b;

        public a(ye.j0<re.a0> j0Var) {
            this.f12293a = j0Var;
            if (j0Var.h()) {
                this.b = ye.y.b().a().a(ye.u.a(j0Var), "public_key_verify", "verify");
            } else {
                this.b = ye.u.f37831a;
            }
        }

        @Override // re.a0
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.b.b();
                throw new GeneralSecurityException("signature too short");
            }
            for (ye.j0.c<re.a0> cVar : this.f12293a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.b.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (ye.j0.c<re.a0> cVar2 : this.f12293a.g()) {
                try {
                    cVar2.b().a(bArr, bArr2);
                    this.b.a(cVar2.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.b.b();
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public static void d() {
        ye.a0.c().e(f12292a);
        ye.a0.c().d(b);
    }

    @Override // ye.k0
    public Class<re.a0> a() {
        return re.a0.class;
    }

    @Override // ye.k0
    public Class<re.a0> b() {
        return re.a0.class;
    }

    @Override // ye.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public re.a0 c(ye.j0<re.a0> j0Var) {
        return new a(j0Var);
    }
}
