package ze;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import ye.a0;
import ye.h0;
import ye.j0;
import ye.k0;

/* JADX INFO: loaded from: classes2.dex */
public class t implements k0<re.w, re.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f39284a = new t();
    public static final h0<ye.p, re.w> b = h0.b(new h0.b() { // from class: ze.s
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return af.n.c((ye.p) lVar);
        }
    }, ye.p.class, re.w.class);

    public static class b implements re.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0<re.w> f39285a;
        public final ye.s.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ye.s.a f39286c;

        @Override // re.w
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f39286c.b();
                throw new GeneralSecurityException("tag too short");
            }
            for (j0.c<re.w> cVar : this.f39285a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.f39286c.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (j0.c<re.w> cVar2 : this.f39285a.g()) {
                try {
                    cVar2.b().a(bArr, bArr2);
                    this.f39286c.a(cVar2.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f39286c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // re.w
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrB = this.f39285a.d().b().b(bArr);
                this.b.a(this.f39285a.d().c(), bArr.length);
                return bArrB;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        public b(j0<re.w> j0Var) {
            this.f39285a = j0Var;
            if (!j0Var.h()) {
                ye.s.a aVar = ye.u.f37831a;
                this.b = aVar;
                this.f39286c = aVar;
            } else {
                ye.s sVarA = ye.y.b().a();
                ye.t tVarA = ye.u.a(j0Var);
                this.b = sVarA.a(tVarA, "mac", "compute");
                this.f39286c = sVarA.a(tVarA, "mac", "verify");
            }
        }
    }

    public static void d() {
        a0.c().e(f39284a);
        a0.c().d(b);
    }

    @Override // ye.k0
    public Class<re.w> a() {
        return re.w.class;
    }

    @Override // ye.k0
    public Class<re.w> b() {
        return re.w.class;
    }

    @Override // ye.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public re.w c(j0<re.w> j0Var) {
        return new b(j0Var);
    }
}
