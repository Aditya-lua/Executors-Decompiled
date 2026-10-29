package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import p102ef.C5109a;
import p515we.C12366e0;
import p515we.C12369g;

/* JADX INFO: renamed from: bf.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1385c extends AbstractC1387c1 {

    /* JADX INFO: renamed from: a */
    public final C1379a f5445a;

    /* JADX INFO: renamed from: b */
    public final ECPoint f5446b;

    /* JADX INFO: renamed from: c */
    public final C5109a f5447c;

    /* JADX INFO: renamed from: d */
    public final Integer f5448d;

    /* JADX INFO: renamed from: bf.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1379a f5449a;

        /* JADX INFO: renamed from: b */
        public ECPoint f5450b;

        /* JADX INFO: renamed from: c */
        public Integer f5451c;

        /* JADX INFO: renamed from: a */
        public C1385c m7256a() throws GeneralSecurityException {
            C1379a c1379a = this.f5449a;
            if (c1379a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.f5450b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            C12369g.m46302b(eCPoint, c1379a.m7231c().m7240a().getCurve());
            if (this.f5449a.mo7230a() && this.f5451c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f5449a.mo7230a() && this.f5451c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1385c(this.f5449a, this.f5450b, m7257b(), this.f5451c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m7257b() {
            if (this.f5449a.m7234f() == C1379a.f.f5439e) {
                return C12366e0.f44235a;
            }
            if (this.f5449a.m7234f() == C1379a.f.f5438d || this.f5449a.m7234f() == C1379a.f.f5437c) {
                return C12366e0.m46287a(this.f5451c.intValue());
            }
            if (this.f5449a.m7234f() == C1379a.f.f5436b) {
                return C12366e0.m46288b(this.f5451c.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f5449a.m7234f());
        }

        /* JADX INFO: renamed from: c */
        public b m7258c(Integer num) {
            this.f5451c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7259d(C1379a c1379a) {
            this.f5449a = c1379a;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7260e(ECPoint eCPoint) {
            this.f5450b = eCPoint;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5449a = null;
            this.f5450b = null;
            this.f5451c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static b m7252c() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f5448d;
    }

    @Override // bf.AbstractC1387c1
    /* JADX INFO: renamed from: b */
    public C5109a mo7253b() {
        return this.f5447c;
    }

    /* JADX INFO: renamed from: d */
    public C1379a m7254d() {
        return this.f5445a;
    }

    /* JADX INFO: renamed from: e */
    public ECPoint m7255e() {
        return this.f5446b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1385c(C1379a c1379a, ECPoint eCPoint, C5109a c5109a, Integer num) {
        this.f5445a = c1379a;
        this.f5446b = eCPoint;
        this.f5447c = c5109a;
        this.f5448d = num;
    }
}
