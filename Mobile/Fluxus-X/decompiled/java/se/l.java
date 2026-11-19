package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends se.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f31369a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31371d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f31372a;
        public gf.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f31373c;

        public l a() throws GeneralSecurityException {
            p pVar = this.f31372a;
            if (pVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (pVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f31372a.a() && this.f31373c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f31372a.a() && this.f31373c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l(this.f31372a, this.b, b(), this.f31373c);
        }

        public final gf.a b() {
            if (this.f31372a.f() == p.c.f31394d) {
                return ye.e0.f37741a;
            }
            if (this.f31372a.f() == p.c.f31393c) {
                return ye.e0.a(this.f31373c.intValue());
            }
            if (this.f31372a.f() == p.c.b) {
                return ye.e0.b(this.f31373c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f31372a.f());
        }

        public b c(Integer num) {
            this.f31373c = num;
            return this;
        }

        public b d(gf.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(p pVar) {
            this.f31372a = pVar;
            return this;
        }

        public b() {
            this.f31372a = null;
            this.b = null;
            this.f31373c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f31371d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31370c;
    }

    public p e() {
        return this.f31369a;
    }

    public l(p pVar, gf.c cVar, gf.a aVar, Integer num) {
        this.f31369a = pVar;
        this.b = cVar;
        this.f31370c = aVar;
        this.f31371d = num;
    }
}
