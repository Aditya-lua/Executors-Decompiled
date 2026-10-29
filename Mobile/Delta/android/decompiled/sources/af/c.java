package af;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.a f392a;
    public final ECPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f394d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public af.a f395a;
        public ECPoint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f396c;

        public c a() throws GeneralSecurityException {
            af.a aVar = this.f395a;
            if (aVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            ve.g.b(eCPoint, aVar.c().a().getCurve());
            if (this.f395a.a() && this.f396c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f395a.a() && this.f396c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new c(this.f395a, this.b, b(), this.f396c);
        }

        public final df.a b() {
            if (this.f395a.f() == af.a.f.f388e) {
                return ve.e0.f32930a;
            }
            if (this.f395a.f() == af.a.f.f387d || this.f395a.f() == af.a.f.f386c) {
                return ve.e0.a(this.f396c.intValue());
            }
            if (this.f395a.f() == af.a.f.b) {
                return ve.e0.b(this.f396c.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f395a.f());
        }

        public b c(Integer num) {
            this.f396c = num;
            return this;
        }

        public b d(af.a aVar) {
            this.f395a = aVar;
            return this;
        }

        public b e(ECPoint eCPoint) {
            this.b = eCPoint;
            return this;
        }

        public b() {
            this.f395a = null;
            this.b = null;
            this.f396c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f394d;
    }

    @Override // af.c1
    public df.a b() {
        return this.f393c;
    }

    public af.a d() {
        return this.f392a;
    }

    public ECPoint e() {
        return this.b;
    }

    public c(af.a aVar, ECPoint eCPoint, df.a aVar2, Integer num) {
        this.f392a = aVar;
        this.b = eCPoint;
        this.f393c = aVar2;
        this.f394d = num;
    }
}
