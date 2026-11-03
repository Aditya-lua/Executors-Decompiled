package xe;

import java.security.GeneralSecurityException;
import we.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35687a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f35688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f35689d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f35690a;
        public ef.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f35691c;

        public a a() throws GeneralSecurityException {
            f fVar = this.f35690a;
            if (fVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f35690a.a() && this.f35691c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f35690a.a() && this.f35691c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f35690a, this.b, b(), this.f35691c);
        }

        public final ef.a b() {
            if (this.f35690a.f() == f.c.f35701e) {
                return e0.f34384a;
            }
            if (this.f35690a.f() == f.c.f35700d || this.f35690a.f() == f.c.f35699c) {
                return e0.a(this.f35691c.intValue());
            }
            if (this.f35690a.f() == f.c.b) {
                return e0.b(this.f35691c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f35690a.f());
        }

        public b c(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(Integer num) {
            this.f35691c = num;
            return this;
        }

        public b e(f fVar) {
            this.f35690a = fVar;
            return this;
        }

        public b() {
            this.f35690a = null;
            this.b = null;
            this.f35691c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f35689d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f35688c;
    }

    public f e() {
        return this.f35687a;
    }

    public a(f fVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f35687a = fVar;
        this.b = cVar;
        this.f35688c = aVar;
        this.f35689d = num;
    }
}
