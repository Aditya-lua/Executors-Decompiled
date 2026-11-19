package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends se.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f31320a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.c f31321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gf.a f31322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f31323e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f31324a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public gf.c f31325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f31326d;

        public f a() throws GeneralSecurityException {
            k kVar = this.f31324a;
            if (kVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.b == null || this.f31325c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (kVar.c() != this.b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f31324a.e() != this.f31325c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f31324a.a() && this.f31326d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f31324a.a() && this.f31326d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new f(this.f31324a, this.b, this.f31325c, b(), this.f31326d);
        }

        public final gf.a b() {
            if (this.f31324a.h() == k.d.f31364d) {
                return ye.e0.f37741a;
            }
            if (this.f31324a.h() == k.d.f31363c) {
                return ye.e0.a(this.f31326d.intValue());
            }
            if (this.f31324a.h() == k.d.b) {
                return ye.e0.b(this.f31326d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f31324a.h());
        }

        public b c(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(gf.c cVar) {
            this.f31325c = cVar;
            return this;
        }

        public b e(Integer num) {
            this.f31326d = num;
            return this;
        }

        public b f(k kVar) {
            this.f31324a = kVar;
            return this;
        }

        public b() {
            this.f31324a = null;
            this.b = null;
            this.f31325c = null;
            this.f31326d = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f31323e;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.c d() {
        return this.f31321c;
    }

    public gf.a e() {
        return this.f31322d;
    }

    public k f() {
        return this.f31320a;
    }

    public f(k kVar, gf.c cVar, gf.c cVar2, gf.a aVar, Integer num) {
        this.f31320a = kVar;
        this.b = cVar;
        this.f31321c = cVar2;
        this.f31322d = aVar;
        this.f31323e = num;
    }
}
