package we;

import java.security.GeneralSecurityException;
import ve.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f34206a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f34207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f34208d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f34209a;
        public df.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f34210c;

        public i a() throws GeneralSecurityException {
            o oVar = this.f34209a;
            if (oVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (oVar.e() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f34209a.a() && this.f34210c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f34209a.a() && this.f34210c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f34209a, this.b, b(), this.f34210c);
        }

        public final df.a b() {
            if (this.f34209a.g() == o.d.f34229e) {
                return e0.f32930a;
            }
            if (this.f34209a.g() == o.d.f34228d || this.f34209a.g() == o.d.f34227c) {
                return e0.a(this.f34210c.intValue());
            }
            if (this.f34209a.g() == o.d.b) {
                return e0.b(this.f34210c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f34209a.g());
        }

        public b c(Integer num) {
            this.f34210c = num;
            return this;
        }

        public b d(df.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(o oVar) {
            this.f34209a = oVar;
            return this;
        }

        public b() {
            this.f34209a = null;
            this.b = null;
            this.f34210c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f34208d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f34207c;
    }

    public o e() {
        return this.f34206a;
    }

    public i(o oVar, df.c cVar, df.a aVar, Integer num) {
        this.f34206a = oVar;
        this.b = cVar;
        this.f34207c = aVar;
        this.f34208d = num;
    }
}
