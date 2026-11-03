package xe;

import java.security.GeneralSecurityException;
import we.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f35705a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f35706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f35707d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f35708a;
        public ef.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f35709c;

        public i a() throws GeneralSecurityException {
            o oVar = this.f35708a;
            if (oVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (oVar.e() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f35708a.a() && this.f35709c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f35708a.a() && this.f35709c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f35708a, this.b, b(), this.f35709c);
        }

        public final ef.a b() {
            if (this.f35708a.g() == o.d.f35728e) {
                return e0.f34384a;
            }
            if (this.f35708a.g() == o.d.f35727d || this.f35708a.g() == o.d.f35726c) {
                return e0.a(this.f35709c.intValue());
            }
            if (this.f35708a.g() == o.d.b) {
                return e0.b(this.f35709c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f35708a.g());
        }

        public b c(Integer num) {
            this.f35709c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(o oVar) {
            this.f35708a = oVar;
            return this;
        }

        public b() {
            this.f35708a = null;
            this.b = null;
            this.f35709c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f35707d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f35706c;
    }

    public o e() {
        return this.f35705a;
    }

    public i(o oVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f35705a = oVar;
        this.b = cVar;
        this.f35706c = aVar;
        this.f35707d = num;
    }
}
