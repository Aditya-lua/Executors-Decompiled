package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f28520a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28522d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f28523a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f28524c;

        public q a() throws GeneralSecurityException {
            u uVar = this.f28523a;
            if (uVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (uVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f28523a.a() && this.f28524c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f28523a.a() && this.f28524c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new q(this.f28523a, this.b, b(), this.f28524c);
        }

        public final df.a b() {
            if (this.f28523a.f() == u.c.f28550d) {
                return ve.e0.f32930a;
            }
            if (this.f28523a.f() == u.c.f28549c) {
                return ve.e0.a(this.f28524c.intValue());
            }
            if (this.f28523a.f() == u.c.b) {
                return ve.e0.b(this.f28524c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f28523a.f());
        }

        public b c(Integer num) {
            this.f28524c = num;
            return this;
        }

        public b d(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(u uVar) {
            this.f28523a = uVar;
            return this;
        }

        public b() {
            this.f28523a = null;
            this.b = null;
            this.f28524c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f28522d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28521c;
    }

    public u e() {
        return this.f28520a;
    }

    public q(u uVar, df.c cVar, df.a aVar, Integer num) {
        this.f28520a = uVar;
        this.b = cVar;
        this.f28521c = aVar;
        this.f28522d = num;
    }
}
