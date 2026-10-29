package p100eb;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: eb.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4993q2 {

    /* JADX INFO: renamed from: a */
    public final String f19768a;

    /* JADX INFO: renamed from: b */
    public final char[] f19769b;

    /* JADX INFO: renamed from: c */
    public final int f19770c;

    /* JADX INFO: renamed from: d */
    public final int f19771d;

    /* JADX INFO: renamed from: e */
    public final int f19772e;

    /* JADX INFO: renamed from: f */
    public final int f19773f;

    /* JADX INFO: renamed from: g */
    public final byte[] f19774g;

    /* JADX INFO: renamed from: h */
    public final boolean f19775h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C4993q2(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            C4973n0.m23680d(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            C4973n0.m23680d(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: a */
    public final char m23694a(int i10) {
        return this.f19769b[i10];
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x003e */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX INFO: renamed from: b */
    public final C4993q2 m23695b() {
        int i10;
        boolean z10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char[] cArr = this.f19769b;
            if (i12 >= cArr.length) {
                return this;
            }
            if (C4901b0.m23551a(cArr[i12])) {
                int i13 = 0;
                while (true) {
                    if (i13 >= cArr.length) {
                        z10 = false;
                        break;
                    }
                    char c10 = cArr[i13];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
                C4973n0.m23682f(!z10, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f19769b.length];
                while (true) {
                    char[] cArr3 = this.f19769b;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c11 = cArr3[i11];
                    if (C4901b0.m23551a(c11)) {
                        c11 ^= 32;
                    }
                    cArr2[i11] = (char) c11;
                    i11++;
                }
                C4993q2 c4993q2 = new C4993q2(this.f19768a.concat(".upperCase()"), cArr2);
                if (!this.f19775h || c4993q2.f19775h) {
                    return c4993q2;
                }
                byte[] bArr = c4993q2.f19774g;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i14 = i10 | 32;
                    byte[] bArr2 = c4993q2.f19774g;
                    byte b = bArr2[i10];
                    byte b10 = bArr2[i14];
                    if (b == -1) {
                        bArrCopyOf[i10] = b10;
                    } else {
                        char c12 = (char) i10;
                        char c13 = (char) i14;
                        if (b10 != -1) {
                            throw new IllegalStateException(C4985p0.m23687a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                        }
                        bArrCopyOf[i14] = b;
                    }
                }
                return new C4993q2(c4993q2.f19768a.concat(".ignoreCase()"), c4993q2.f19769b, bArrCopyOf, true);
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23696c(char c10) {
        byte[] bArr = this.f19774g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4993q2) {
            C4993q2 c4993q2 = (C4993q2) obj;
            if (this.f19775h == c4993q2.f19775h && Arrays.equals(this.f19769b, c4993q2.f19769b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19769b) + (true != this.f19775h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f19768a;
    }

    public C4993q2(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f19768a = str;
        cArr.getClass();
        this.f19769b = cArr;
        try {
            int length = cArr.length;
            int iM23715b = C5029w2.m23715b(length, RoundingMode.UNNECESSARY);
            this.f19771d = iM23715b;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM23715b);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f19772e = i10;
            this.f19773f = iM23715b >> iNumberOfTrailingZeros;
            this.f19770c = length - 1;
            this.f19774g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f19773f; i11++) {
                zArr[C5029w2.m23714a(i11 * 8, this.f19771d, RoundingMode.CEILING)] = true;
            }
            this.f19775h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
