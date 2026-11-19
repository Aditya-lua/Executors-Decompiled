package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends se.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f31445a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31447d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f31448a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f31449c;

        public v a() throws GeneralSecurityException {
            z zVar = this.f31448a;
            if (zVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zVar.c() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f31448a.a() && this.f31449c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f31448a.a() && this.f31449c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new v(this.f31448a, this.b, b(), this.f31449c);
        }

        public final gf.a b() {
            if (this.f31448a.d() == z.c.f31456d) {
                return ye.e0.f37741a;
            }
            if (this.f31448a.d() == z.c.f31455c) {
                return ye.e0.a(this.f31449c.intValue());
            }
            if (this.f31448a.d() == z.c.b) {
                return ye.e0.b(this.f31449c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f31448a.d());
        }

        public b c(Integer num) {
            this.f31449c = num;
            return this;
        }

        public b d(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(z zVar) {
            this.f31448a = zVar;
            return this;
        }

        public b() {
            this.f31448a = null;
            this.b = null;
            this.f31449c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f31447d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31446c;
    }

    public z e() {
        return this.f31445a;
    }

    public v(z zVar, gf.c cVar, gf.a aVar, Integer num) {
        this.f31445a = zVar;
        this.b = cVar;
        this.f31446c = aVar;
        this.f31447d = num;
    }
}
