package se;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class e implements ye.k0<re.a, re.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f31313a = new e();
    public static final ye.h0<ye.p, re.a> b = ye.h0.b(new ye.h0.b() { // from class: se.d
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return te.j0.d((ye.p) lVar);
        }
    }, ye.p.class, re.a.class);

    public static class b implements re.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ye.j0<re.a> f31314a;
        public final ye.s.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ye.s.a f31315c;

        @Override // re.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f31314a.d().b().a(bArr, bArr2);
                this.b.a(this.f31314a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        @Override // re.a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                for (ye.j0.c<re.a> cVar : this.f31314a.e(Arrays.copyOf(bArr, 5))) {
                    try {
                        byte[] bArrB = cVar.b().b(bArr, bArr2);
                        this.f31315c.a(cVar.c(), bArr.length);
                        return bArrB;
                    } catch (GeneralSecurityException unused) {
                    }
                }
            }
            for (ye.j0.c<re.a> cVar2 : this.f31314a.g()) {
                try {
                    byte[] bArrB2 = cVar2.b().b(bArr, bArr2);
                    this.f31315c.a(cVar2.c(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f31315c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(ye.j0<re.a> j0Var) {
            this.f31314a = j0Var;
            if (!j0Var.h()) {
                ye.s.a aVar = ye.u.f37831a;
                this.b = aVar;
                this.f31315c = aVar;
            } else {
                ye.s sVarA = ye.y.b().a();
                ye.t tVarA = ye.u.a(j0Var);
                this.b = sVarA.a(tVarA, "aead", "encrypt");
                this.f31315c = sVarA.a(tVarA, "aead", "decrypt");
            }
        }
    }

    public static void d() {
        ye.a0.c().e(f31313a);
        ye.a0.c().d(b);
    }

    @Override // ye.k0
    public Class<re.a> a() {
        return re.a.class;
    }

    @Override // ye.k0
    public Class<re.a> b() {
        return re.a.class;
    }

    @Override // ye.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public re.a c(ye.j0<re.a> j0Var) {
        return new b(j0Var);
    }
}
