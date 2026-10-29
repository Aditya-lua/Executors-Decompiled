package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p515we.C12366e0;

/* JADX INFO: renamed from: bf.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1421t0 extends AbstractC1387c1 {

    /* JADX INFO: renamed from: a */
    public final C1417r0 f5583a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f5584b;

    /* JADX INFO: renamed from: c */
    public final C5109a f5585c;

    /* JADX INFO: renamed from: d */
    public final Integer f5586d;

    /* JADX INFO: renamed from: bf.t0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1417r0 f5587a;

        /* JADX INFO: renamed from: b */
        public BigInteger f5588b;

        /* JADX INFO: renamed from: c */
        public Integer f5589c;

        /* JADX INFO: renamed from: a */
        public C1421t0 m7380a() throws GeneralSecurityException {
            if (this.f5587a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.f5588b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iM7349d = this.f5587a.m7349d();
            if (iBitLength != iM7349d) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iM7349d);
            }
            if (this.f5587a.mo7230a() && this.f5589c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f5587a.mo7230a() && this.f5589c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1421t0(this.f5587a, this.f5588b, m7381b(), this.f5589c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m7381b() {
            if (this.f5587a.m7353h() == C1417r0.d.f5567e) {
                return C12366e0.f44235a;
            }
            if (this.f5587a.m7353h() == C1417r0.d.f5566d || this.f5587a.m7353h() == C1417r0.d.f5565c) {
                return C12366e0.m46287a(this.f5589c.intValue());
            }
            if (this.f5587a.m7353h() == C1417r0.d.f5564b) {
                return C12366e0.m46288b(this.f5589c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + this.f5587a.m7353h());
        }

        /* JADX INFO: renamed from: c */
        public b m7382c(Integer num) {
            this.f5589c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7383d(BigInteger bigInteger) {
            this.f5588b = bigInteger;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7384e(C1417r0 c1417r0) {
            this.f5587a = c1417r0;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5587a = null;
            this.f5588b = null;
            this.f5589c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static b m7377c() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f5586d;
    }

    @Override // bf.AbstractC1387c1
    /* JADX INFO: renamed from: b */
    public C5109a mo7253b() {
        return this.f5585c;
    }

    /* JADX INFO: renamed from: d */
    public BigInteger m7378d() {
        return this.f5584b;
    }

    /* JADX INFO: renamed from: e */
    public C1417r0 m7379e() {
        return this.f5583a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1421t0(C1417r0 c1417r0, BigInteger bigInteger, C5109a c5109a, Integer num) {
        this.f5583a = c1417r0;
        this.f5584b = bigInteger;
        this.f5585c = c5109a;
        this.f5586d = num;
    }
}
