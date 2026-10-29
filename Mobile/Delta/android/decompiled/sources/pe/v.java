package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f28566a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28568d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f28569a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f28570c;

        public v a() throws GeneralSecurityException {
            z zVar = this.f28569a;
            if (zVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zVar.c() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f28569a.a() && this.f28570c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f28569a.a() && this.f28570c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new v(this.f28569a, this.b, b(), this.f28570c);
        }

        public final df.a b() {
            if (this.f28569a.d() == z.c.f28577d) {
                return ve.e0.f32930a;
            }
            if (this.f28569a.d() == z.c.f28576c) {
                return ve.e0.a(this.f28570c.intValue());
            }
            if (this.f28569a.d() == z.c.b) {
                return ve.e0.b(this.f28570c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f28569a.d());
        }

        public b c(Integer num) {
            this.f28570c = num;
            return this;
        }

        public b d(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(z zVar) {
            this.f28569a = zVar;
            return this;
        }

        public b() {
            this.f28569a = null;
            this.b = null;
            this.f28570c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f28568d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28567c;
    }

    public z e() {
        return this.f28566a;
    }

    public v(z zVar, df.c cVar, df.a aVar, Integer num) {
        this.f28566a = zVar;
        this.b = cVar;
        this.f28567c = aVar;
        this.f28568d = num;
    }
}
