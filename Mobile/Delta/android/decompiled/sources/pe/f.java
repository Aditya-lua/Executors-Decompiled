package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f28441a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.c f28442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.a f28443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f28444e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f28445a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public df.c f28446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f28447d;

        public f a() throws GeneralSecurityException {
            k kVar = this.f28445a;
            if (kVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.b == null || this.f28446c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (kVar.c() != this.b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f28445a.e() != this.f28446c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f28445a.a() && this.f28447d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f28445a.a() && this.f28447d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new f(this.f28445a, this.b, this.f28446c, b(), this.f28447d);
        }

        public final df.a b() {
            if (this.f28445a.h() == k.d.f28485d) {
                return ve.e0.f32930a;
            }
            if (this.f28445a.h() == k.d.f28484c) {
                return ve.e0.a(this.f28447d.intValue());
            }
            if (this.f28445a.h() == k.d.b) {
                return ve.e0.b(this.f28447d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f28445a.h());
        }

        public b c(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(df.c cVar) {
            this.f28446c = cVar;
            return this;
        }

        public b e(Integer num) {
            this.f28447d = num;
            return this;
        }

        public b f(k kVar) {
            this.f28445a = kVar;
            return this;
        }

        public b() {
            this.f28445a = null;
            this.b = null;
            this.f28446c = null;
            this.f28447d = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f28444e;
    }

    public df.c c() {
        return this.b;
    }

    public df.c d() {
        return this.f28442c;
    }

    public df.a e() {
        return this.f28443d;
    }

    public k f() {
        return this.f28441a;
    }

    public f(k kVar, df.c cVar, df.c cVar2, df.a aVar, Integer num) {
        this.f28441a = kVar;
        this.b = cVar;
        this.f28442c = cVar2;
        this.f28443d = aVar;
        this.f28444e = num;
    }
}
