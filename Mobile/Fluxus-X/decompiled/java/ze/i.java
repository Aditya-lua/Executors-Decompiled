package ze;

import java.security.GeneralSecurityException;
import ye.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39256a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f39257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f39258d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f39259a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f39260c;

        public i a() throws GeneralSecurityException {
            o oVar = this.f39259a;
            if (oVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (oVar.e() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f39259a.a() && this.f39260c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f39259a.a() && this.f39260c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f39259a, this.b, b(), this.f39260c);
        }

        public final gf.a b() {
            if (this.f39259a.g() == o.d.f39279e) {
                return e0.f37741a;
            }
            if (this.f39259a.g() == o.d.f39278d || this.f39259a.g() == o.d.f39277c) {
                return e0.a(this.f39260c.intValue());
            }
            if (this.f39259a.g() == o.d.b) {
                return e0.b(this.f39260c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f39259a.g());
        }

        public b c(Integer num) {
            this.f39260c = num;
            return this;
        }

        public b d(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(o oVar) {
            this.f39259a = oVar;
            return this;
        }

        public b() {
            this.f39259a = null;
            this.b = null;
            this.f39260c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f39258d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f39257c;
    }

    public o e() {
        return this.f39256a;
    }

    public i(o oVar, gf.c cVar, gf.a aVar, Integer num) {
        this.f39256a = oVar;
        this.b = cVar;
        this.f39257c = aVar;
        this.f39258d = num;
    }
}
