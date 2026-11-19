package ze;

import java.security.GeneralSecurityException;
import ye.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f39238a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f39239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f39240d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f39241a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f39242c;

        public a a() throws GeneralSecurityException {
            f fVar = this.f39241a;
            if (fVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f39241a.a() && this.f39242c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f39241a.a() && this.f39242c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f39241a, this.b, b(), this.f39242c);
        }

        public final gf.a b() {
            if (this.f39241a.f() == f.c.f39252e) {
                return e0.f37741a;
            }
            if (this.f39241a.f() == f.c.f39251d || this.f39241a.f() == f.c.f39250c) {
                return e0.a(this.f39242c.intValue());
            }
            if (this.f39241a.f() == f.c.b) {
                return e0.b(this.f39242c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f39241a.f());
        }

        public b c(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(Integer num) {
            this.f39242c = num;
            return this;
        }

        public b e(f fVar) {
            this.f39241a = fVar;
            return this;
        }

        public b() {
            this.f39241a = null;
            this.b = null;
            this.f39242c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f39240d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f39239c;
    }

    public f e() {
        return this.f39238a;
    }

    public a(f fVar, gf.c cVar, gf.a aVar, Integer num) {
        this.f39238a = fVar;
        this.b = cVar;
        this.f39239c = aVar;
        this.f39240d = num;
    }
}
