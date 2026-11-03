package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends qe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f29689a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.c f29690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ef.a f29691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f29692e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f29693a;
        public ef.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ef.c f29694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f29695d;

        public f a() throws GeneralSecurityException {
            k kVar = this.f29693a;
            if (kVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.b == null || this.f29694c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (kVar.c() != this.b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f29693a.e() != this.f29694c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f29693a.a() && this.f29695d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29693a.a() && this.f29695d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new f(this.f29693a, this.b, this.f29694c, b(), this.f29695d);
        }

        public final ef.a b() {
            if (this.f29693a.h() == k.d.f29733d) {
                return we.e0.f34384a;
            }
            if (this.f29693a.h() == k.d.f29732c) {
                return we.e0.a(this.f29695d.intValue());
            }
            if (this.f29693a.h() == k.d.b) {
                return we.e0.b(this.f29695d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f29693a.h());
        }

        public b c(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(ef.c cVar) {
            this.f29694c = cVar;
            return this;
        }

        public b e(Integer num) {
            this.f29695d = num;
            return this;
        }

        public b f(k kVar) {
            this.f29693a = kVar;
            return this;
        }

        public b() {
            this.f29693a = null;
            this.b = null;
            this.f29694c = null;
            this.f29695d = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29692e;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.c d() {
        return this.f29690c;
    }

    public ef.a e() {
        return this.f29691d;
    }

    public k f() {
        return this.f29689a;
    }

    public f(k kVar, ef.c cVar, ef.c cVar2, ef.a aVar, Integer num) {
        this.f29689a = kVar;
        this.b = cVar;
        this.f29690c = cVar2;
        this.f29691d = aVar;
        this.f29692e = num;
    }
}
