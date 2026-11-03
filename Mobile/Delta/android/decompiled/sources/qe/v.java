package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends qe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f29814a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f29815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f29816d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f29817a;
        public ef.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f29818c;

        public v a() throws GeneralSecurityException {
            z zVar = this.f29817a;
            if (zVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zVar.c() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f29817a.a() && this.f29818c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29817a.a() && this.f29818c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new v(this.f29817a, this.b, b(), this.f29818c);
        }

        public final ef.a b() {
            if (this.f29817a.d() == z.c.f29825d) {
                return we.e0.f34384a;
            }
            if (this.f29817a.d() == z.c.f29824c) {
                return we.e0.a(this.f29818c.intValue());
            }
            if (this.f29817a.d() == z.c.b) {
                return we.e0.b(this.f29818c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f29817a.d());
        }

        public b c(Integer num) {
            this.f29818c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(z zVar) {
            this.f29817a = zVar;
            return this;
        }

        public b() {
            this.f29817a = null;
            this.b = null;
            this.f29818c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29816d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29815c;
    }

    public z e() {
        return this.f29814a;
    }

    public v(z zVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f29814a = zVar;
        this.b = cVar;
        this.f29815c = aVar;
        this.f29816d = num;
    }
}
