package pe;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class e implements ve.k0<oe.a, oe.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f28434a = new e();
    public static final ve.h0<ve.p, oe.a> b = ve.h0.b(new ve.h0.b() { // from class: pe.d
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return qe.j0.d((ve.p) lVar);
        }
    }, ve.p.class, oe.a.class);

    public static class b implements oe.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ve.j0<oe.a> f28435a;
        public final ve.s.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ve.s.a f28436c;

        @Override // oe.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f28435a.d().b().a(bArr, bArr2);
                this.b.a(this.f28435a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        @Override // oe.a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                for (ve.j0.c<oe.a> cVar : this.f28435a.e(Arrays.copyOf(bArr, 5))) {
                    try {
                        byte[] bArrB = cVar.b().b(bArr, bArr2);
                        this.f28436c.a(cVar.c(), bArr.length);
                        return bArrB;
                    } catch (GeneralSecurityException unused) {
                    }
                }
            }
            for (ve.j0.c<oe.a> cVar2 : this.f28435a.g()) {
                try {
                    byte[] bArrB2 = cVar2.b().b(bArr, bArr2);
                    this.f28436c.a(cVar2.c(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f28436c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(ve.j0<oe.a> j0Var) {
            this.f28435a = j0Var;
            if (!j0Var.h()) {
                ve.s.a aVar = ve.u.f33020a;
                this.b = aVar;
                this.f28436c = aVar;
            } else {
                ve.s sVarA = ve.y.b().a();
                ve.t tVarA = ve.u.a(j0Var);
                this.b = sVarA.a(tVarA, "aead", "encrypt");
                this.f28436c = sVarA.a(tVarA, "aead", "decrypt");
            }
        }
    }

    public static void d() {
        ve.a0.c().e(f28434a);
        ve.a0.c().d(b);
    }

    @Override // ve.k0
    public Class<oe.a> a() {
        return oe.a.class;
    }

    @Override // ve.k0
    public Class<oe.a> c() {
        return oe.a.class;
    }

    @Override // ve.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oe.a b(ve.j0<oe.a> j0Var) {
        return new b(j0Var);
    }
}
