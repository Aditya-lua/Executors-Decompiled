package af;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements ve.k0<oe.a0, oe.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f422a = new i0();
    public static final ve.h0<ve.p, oe.a0> b = ve.h0.b(new ve.h0.b() { // from class: af.h0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return bf.p.b((ve.p) lVar);
        }
    }, ve.p.class, oe.a0.class);

    public static class a implements oe.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ve.j0<oe.a0> f423a;
        public final ve.s.a b;

        public a(ve.j0<oe.a0> j0Var) {
            this.f423a = j0Var;
            if (j0Var.h()) {
                this.b = ve.y.b().a().a(ve.u.a(j0Var), "public_key_verify", "verify");
            } else {
                this.b = ve.u.f33020a;
            }
        }

        @Override // oe.a0
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.b.b();
                throw new GeneralSecurityException("signature too short");
            }
            for (ve.j0.c<oe.a0> cVar : this.f423a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.b.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (ve.j0.c<oe.a0> cVar2 : this.f423a.g()) {
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
        ve.a0.c().e(f422a);
        ve.a0.c().d(b);
    }

    @Override // ve.k0
    public Class<oe.a0> a() {
        return oe.a0.class;
    }

    @Override // ve.k0
    public Class<oe.a0> c() {
        return oe.a0.class;
    }

    @Override // ve.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oe.a0 b(ve.j0<oe.a0> j0Var) {
        return new a(j0Var);
    }
}
