package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf.a f4064a;
    public final ECPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f4065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4066d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public bf.a f4067a;
        public ECPoint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f4068c;

        public c a() throws GeneralSecurityException {
            bf.a aVar = this.f4067a;
            if (aVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            we.g.b(eCPoint, aVar.c().a().getCurve());
            if (this.f4067a.a() && this.f4068c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f4067a.a() && this.f4068c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new c(this.f4067a, this.b, b(), this.f4068c);
        }

        public final ef.a b() {
            if (this.f4067a.f() == bf.a.f.f4060e) {
                return we.e0.f34384a;
            }
            if (this.f4067a.f() == bf.a.f.f4059d || this.f4067a.f() == bf.a.f.f4058c) {
                return we.e0.a(this.f4068c.intValue());
            }
            if (this.f4067a.f() == bf.a.f.b) {
                return we.e0.b(this.f4068c.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f4067a.f());
        }

        public b c(Integer num) {
            this.f4068c = num;
            return this;
        }

        public b d(bf.a aVar) {
            this.f4067a = aVar;
            return this;
        }

        public b e(ECPoint eCPoint) {
            this.b = eCPoint;
            return this;
        }

        public b() {
            this.f4067a = null;
            this.b = null;
            this.f4068c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f4066d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4065c;
    }

    public bf.a d() {
        return this.f4064a;
    }

    public ECPoint e() {
        return this.b;
    }

    public c(bf.a aVar, ECPoint eCPoint, ef.a aVar2, Integer num) {
        this.f4064a = aVar;
        this.b = eCPoint;
        this.f4065c = aVar2;
        this.f4066d = num;
    }
}
