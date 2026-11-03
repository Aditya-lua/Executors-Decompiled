package bf;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements we.k0<pe.a0, pe.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f4094a = new i0();
    public static final we.h0<we.p, pe.a0> b = we.h0.b(new we.h0.b() { // from class: bf.h0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return cf.p.b((we.p) lVar);
        }
    }, we.p.class, pe.a0.class);

    public static class a implements pe.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final we.j0<pe.a0> f4095a;
        public final we.s.a b;

        public a(we.j0<pe.a0> j0Var) {
            this.f4095a = j0Var;
            if (j0Var.h()) {
                this.b = we.y.b().a().a(we.u.a(j0Var), "public_key_verify", "verify");
            } else {
                this.b = we.u.f34474a;
            }
        }

        @Override // pe.a0
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.b.b();
                throw new GeneralSecurityException("signature too short");
            }
            for (we.j0.c<pe.a0> cVar : this.f4095a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.b.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (we.j0.c<pe.a0> cVar2 : this.f4095a.g()) {
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
        we.a0.c().e(f4094a);
        we.a0.c().d(b);
    }

    @Override // we.k0
    public Class<pe.a0> a() {
        return pe.a0.class;
    }

    @Override // we.k0
    public Class<pe.a0> c() {
        return pe.a0.class;
    }

    @Override // we.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public pe.a0 b(we.j0<pe.a0> j0Var) {
        return new a(j0Var);
    }
}
