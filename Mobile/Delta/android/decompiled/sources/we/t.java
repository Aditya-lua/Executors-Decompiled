package we;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import ve.a0;
import ve.h0;
import ve.j0;
import ve.k0;

/* JADX INFO: loaded from: classes2.dex */
public class t implements k0<oe.w, oe.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f34234a = new t();
    public static final h0<ve.p, oe.w> b = h0.b(new h0.b() { // from class: we.s
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return xe.n.c((ve.p) lVar);
        }
    }, ve.p.class, oe.w.class);

    public static class b implements oe.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0<oe.w> f34235a;
        public final ve.s.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ve.s.a f34236c;

        @Override // oe.w
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f34236c.b();
                throw new GeneralSecurityException("tag too short");
            }
            for (j0.c<oe.w> cVar : this.f34235a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.f34236c.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (j0.c<oe.w> cVar2 : this.f34235a.g()) {
                try {
                    cVar2.b().a(bArr, bArr2);
                    this.f34236c.a(cVar2.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f34236c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // oe.w
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrB = this.f34235a.d().b().b(bArr);
                this.b.a(this.f34235a.d().c(), bArr.length);
                return bArrB;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        public b(j0<oe.w> j0Var) {
            this.f34235a = j0Var;
            if (!j0Var.h()) {
                ve.s.a aVar = ve.u.f33020a;
                this.b = aVar;
                this.f34236c = aVar;
            } else {
                ve.s sVarA = ve.y.b().a();
                ve.t tVarA = ve.u.a(j0Var);
                this.b = sVarA.a(tVarA, "mac", "compute");
                this.f34236c = sVarA.a(tVarA, "mac", "verify");
            }
        }
    }

    public static void d() {
        a0.c().e(f34234a);
        a0.c().d(b);
    }

    @Override // ve.k0
    public Class<oe.w> a() {
        return oe.w.class;
    }

    @Override // ve.k0
    public Class<oe.w> c() {
        return oe.w.class;
    }

    @Override // ve.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oe.w b(j0<oe.w> j0Var) {
        return new b(j0Var);
    }
}
