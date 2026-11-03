package qe;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class e implements we.k0<pe.a, pe.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f29682a = new e();
    public static final we.h0<we.p, pe.a> b = we.h0.b(new we.h0.b() { // from class: qe.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return re.j0.d((we.p) lVar);
        }
    }, we.p.class, pe.a.class);

    public static class b implements pe.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final we.j0<pe.a> f29683a;
        public final we.s.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final we.s.a f29684c;

        @Override // pe.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f29683a.d().b().a(bArr, bArr2);
                this.b.a(this.f29683a.d().c(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        @Override // pe.a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                for (we.j0.c<pe.a> cVar : this.f29683a.e(Arrays.copyOf(bArr, 5))) {
                    try {
                        byte[] bArrB = cVar.b().b(bArr, bArr2);
                        this.f29684c.a(cVar.c(), bArr.length);
                        return bArrB;
                    } catch (GeneralSecurityException unused) {
                    }
                }
            }
            for (we.j0.c<pe.a> cVar2 : this.f29683a.g()) {
                try {
                    byte[] bArrB2 = cVar2.b().b(bArr, bArr2);
                    this.f29684c.a(cVar2.c(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f29684c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(we.j0<pe.a> j0Var) {
            this.f29683a = j0Var;
            if (!j0Var.h()) {
                we.s.a aVar = we.u.f34474a;
                this.b = aVar;
                this.f29684c = aVar;
            } else {
                we.s sVarA = we.y.b().a();
                we.t tVarA = we.u.a(j0Var);
                this.b = sVarA.a(tVarA, "aead", "encrypt");
                this.f29684c = sVarA.a(tVarA, "aead", "decrypt");
            }
        }
    }

    public static void d() {
        we.a0.c().e(f29682a);
        we.a0.c().d(b);
    }

    @Override // we.k0
    public Class<pe.a> a() {
        return pe.a.class;
    }

    @Override // we.k0
    public Class<pe.a> c() {
        return pe.a.class;
    }

    @Override // we.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public pe.a b(we.j0<pe.a> j0Var) {
        return new b(j0Var);
    }
}
