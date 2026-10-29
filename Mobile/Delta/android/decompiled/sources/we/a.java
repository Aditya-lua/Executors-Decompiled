package we;

import java.security.GeneralSecurityException;
import ve.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f34188a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f34189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f34190d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f34191a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f34192c;

        public a a() throws GeneralSecurityException {
            f fVar = this.f34191a;
            if (fVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f34191a.a() && this.f34192c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f34191a.a() && this.f34192c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f34191a, this.b, b(), this.f34192c);
        }

        public final df.a b() {
            if (this.f34191a.f() == f.c.f34202e) {
                return e0.f32930a;
            }
            if (this.f34191a.f() == f.c.f34201d || this.f34191a.f() == f.c.f34200c) {
                return e0.a(this.f34192c.intValue());
            }
            if (this.f34191a.f() == f.c.b) {
                return e0.b(this.f34192c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f34191a.f());
        }

        public b c(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(Integer num) {
            this.f34192c = num;
            return this;
        }

        public b e(f fVar) {
            this.f34191a = fVar;
            return this;
        }

        public b() {
            this.f34191a = null;
            this.b = null;
            this.f34192c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f34190d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f34189c;
    }

    public f e() {
        return this.f34188a;
    }

    public a(f fVar, df.c cVar, df.a aVar, Integer num) {
        this.f34188a = fVar;
        this.b = cVar;
        this.f34189c = aVar;
        this.f34190d = num;
    }
}
