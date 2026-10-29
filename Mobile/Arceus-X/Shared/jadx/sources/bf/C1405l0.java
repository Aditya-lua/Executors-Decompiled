package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p515we.C12366e0;

/* JADX INFO: renamed from: bf.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1405l0 extends AbstractC1387c1 {

    /* JADX INFO: renamed from: a */
    public final C1401j0 f5522a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f5523b;

    /* JADX INFO: renamed from: c */
    public final C5109a f5524c;

    /* JADX INFO: renamed from: d */
    public final Integer f5525d;

    /* JADX INFO: renamed from: bf.l0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1401j0 f5526a;

        /* JADX INFO: renamed from: b */
        public BigInteger f5527b;

        /* JADX INFO: renamed from: c */
        public Integer f5528c;

        /* JADX INFO: renamed from: a */
        public C1405l0 m7327a() throws GeneralSecurityException {
            if (this.f5526a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.f5527b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iM7300d = this.f5526a.m7300d();
            if (iBitLength != iM7300d) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iM7300d);
            }
            if (this.f5526a.mo7230a() && this.f5528c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f5526a.mo7230a() && this.f5528c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1405l0(this.f5526a, this.f5527b, m7328b(), this.f5528c);
        }

        /* JADX INFO: renamed from: b */
        public final C5109a m7328b() {
            if (this.f5526a.m7302f() == C1401j0.d.f5506e) {
                return C12366e0.f44235a;
            }
            if (this.f5526a.m7302f() == C1401j0.d.f5505d || this.f5526a.m7302f() == C1401j0.d.f5504c) {
                return C12366e0.m46287a(this.f5528c.intValue());
            }
            if (this.f5526a.m7302f() == C1401j0.d.f5503b) {
                return C12366e0.m46288b(this.f5528c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f5526a.m7302f());
        }

        /* JADX INFO: renamed from: c */
        public b m7329c(Integer num) {
            this.f5528c = num;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7330d(BigInteger bigInteger) {
            this.f5527b = bigInteger;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7331e(C1401j0 c1401j0) {
            this.f5526a = c1401j0;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5526a = null;
            this.f5527b = null;
            this.f5528c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static b m7324c() {
        return new b();
    }

    @Override // pe.AbstractC10231l
    /* JADX INFO: renamed from: a */
    public Integer mo7250a() {
        return this.f5525d;
    }

    @Override // bf.AbstractC1387c1
    /* JADX INFO: renamed from: b */
    public C5109a mo7253b() {
        return this.f5524c;
    }

    /* JADX INFO: renamed from: d */
    public BigInteger m7325d() {
        return this.f5523b;
    }

    /* JADX INFO: renamed from: e */
    public C1401j0 m7326e() {
        return this.f5522a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1405l0(C1401j0 c1401j0, BigInteger bigInteger, C5109a c5109a, Integer num) {
        this.f5522a = c1401j0;
        this.f5523b = bigInteger;
        this.f5524c = c5109a;
        this.f5525d = num;
    }
}
