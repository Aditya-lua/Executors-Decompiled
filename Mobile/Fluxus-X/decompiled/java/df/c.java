package df;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.a f12262a;
    public final ECPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f12263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f12264d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public df.a f12265a;
        public ECPoint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f12266c;

        public c a() throws GeneralSecurityException {
            df.a aVar = this.f12265a;
            if (aVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            ye.g.b(eCPoint, aVar.c().a().getCurve());
            if (this.f12265a.a() && this.f12266c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f12265a.a() && this.f12266c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new c(this.f12265a, this.b, b(), this.f12266c);
        }

        public final gf.a b() {
            if (this.f12265a.f() == df.a.f.f12258e) {
                return ye.e0.f37741a;
            }
            if (this.f12265a.f() == df.a.f.f12257d || this.f12265a.f() == df.a.f.f12256c) {
                return ye.e0.a(this.f12266c.intValue());
            }
            if (this.f12265a.f() == df.a.f.b) {
                return ye.e0.b(this.f12266c.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f12265a.f());
        }

        public b c(Integer num) {
            this.f12266c = num;
            return this;
        }

        public b d(df.a aVar) {
            this.f12265a = aVar;
            return this;
        }

        public b e(ECPoint eCPoint) {
            this.b = eCPoint;
            return this;
        }

        public b() {
            this.f12265a = null;
            this.b = null;
            this.f12266c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f12264d;
    }

    @Override // df.c1
    public gf.a b() {
        return this.f12263c;
    }

    public df.a d() {
        return this.f12262a;
    }

    public ECPoint e() {
        return this.b;
    }

    public c(df.a aVar, ECPoint eCPoint, gf.a aVar2, Integer num) {
        this.f12262a = aVar;
        this.b = eCPoint;
        this.f12263c = aVar2;
        this.f12264d = num;
    }
}
