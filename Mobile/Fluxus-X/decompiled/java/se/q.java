package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends se.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f31399a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31401d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f31402a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f31403c;

        public q a() throws GeneralSecurityException {
            u uVar = this.f31402a;
            if (uVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (uVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f31402a.a() && this.f31403c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f31402a.a() && this.f31403c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new q(this.f31402a, this.b, b(), this.f31403c);
        }

        public final gf.a b() {
            if (this.f31402a.f() == u.c.f31429d) {
                return ye.e0.f37741a;
            }
            if (this.f31402a.f() == u.c.f31428c) {
                return ye.e0.a(this.f31403c.intValue());
            }
            if (this.f31402a.f() == u.c.b) {
                return ye.e0.b(this.f31403c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f31402a.f());
        }

        public b c(Integer num) {
            this.f31403c = num;
            return this;
        }

        public b d(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(u uVar) {
            this.f31402a = uVar;
            return this;
        }

        public b() {
            this.f31402a = null;
            this.b = null;
            this.f31403c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f31401d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31400c;
    }

    public u e() {
        return this.f31399a;
    }

    public q(u uVar, gf.c cVar, gf.a aVar, Integer num) {
        this.f31399a = uVar;
        this.b = cVar;
        this.f31400c = aVar;
        this.f31401d = num;
    }
}
