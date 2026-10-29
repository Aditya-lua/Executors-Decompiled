package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28490a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28492d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f28493a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f28494c;

        public l a() throws GeneralSecurityException {
            p pVar = this.f28493a;
            if (pVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (pVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f28493a.a() && this.f28494c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f28493a.a() && this.f28494c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l(this.f28493a, this.b, b(), this.f28494c);
        }

        public final df.a b() {
            if (this.f28493a.f() == p.c.f28515d) {
                return ve.e0.f32930a;
            }
            if (this.f28493a.f() == p.c.f28514c) {
                return ve.e0.a(this.f28494c.intValue());
            }
            if (this.f28493a.f() == p.c.b) {
                return ve.e0.b(this.f28494c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f28493a.f());
        }

        public b c(Integer num) {
            this.f28494c = num;
            return this;
        }

        public b d(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(p pVar) {
            this.f28493a = pVar;
            return this;
        }

        public b() {
            this.f28493a = null;
            this.b = null;
            this.f28494c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f28492d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28491c;
    }

    public p e() {
        return this.f28490a;
    }

    public l(p pVar, df.c cVar, df.a aVar, Integer num) {
        this.f28490a = pVar;
        this.b = cVar;
        this.f28491c = aVar;
        this.f28492d = num;
    }
}
