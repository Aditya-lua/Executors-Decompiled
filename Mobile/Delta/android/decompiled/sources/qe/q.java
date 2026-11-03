package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends qe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f29768a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f29769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f29770d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f29771a;
        public ef.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f29772c;

        public q a() throws GeneralSecurityException {
            u uVar = this.f29771a;
            if (uVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (uVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f29771a.a() && this.f29772c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29771a.a() && this.f29772c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new q(this.f29771a, this.b, b(), this.f29772c);
        }

        public final ef.a b() {
            if (this.f29771a.f() == u.c.f29798d) {
                return we.e0.f34384a;
            }
            if (this.f29771a.f() == u.c.f29797c) {
                return we.e0.a(this.f29772c.intValue());
            }
            if (this.f29771a.f() == u.c.b) {
                return we.e0.b(this.f29772c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f29771a.f());
        }

        public b c(Integer num) {
            this.f29772c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(u uVar) {
            this.f29771a = uVar;
            return this;
        }

        public b() {
            this.f29771a = null;
            this.b = null;
            this.f29772c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29770d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29769c;
    }

    public u e() {
        return this.f29768a;
    }

    public q(u uVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f29768a = uVar;
        this.b = cVar;
        this.f29769c = aVar;
        this.f29770d = num;
    }
}
