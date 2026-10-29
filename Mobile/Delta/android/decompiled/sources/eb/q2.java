package eb;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15360a;
    public final char[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f15365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15366h;

    /* JADX WARN: Illegal instructions before constructor call */
    public q2(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            n0.d(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            n0.d(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final char a(int i10) {
        return this.b[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public final q2 b() {
        int i10;
        boolean z10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char[] cArr = this.b;
            if (i12 >= cArr.length) {
                return this;
            }
            if (b0.a(cArr[i12])) {
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
                n0.f(!z10, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.b.length];
                while (true) {
                    char[] cArr3 = this.b;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c11 = cArr3[i11];
                    if (b0.a(c11)) {
                        c11 ^= 32;
                    }
                    cArr2[i11] = (char) c11;
                    i11++;
                }
                q2 q2Var = new q2(this.f15360a.concat(".upperCase()"), cArr2);
                if (!this.f15366h || q2Var.f15366h) {
                    return q2Var;
                }
                byte[] bArr = q2Var.f15365g;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i14 = i10 | 32;
                    byte[] bArr2 = q2Var.f15365g;
                    byte b = bArr2[i10];
                    byte b10 = bArr2[i14];
                    if (b == -1) {
                        bArrCopyOf[i10] = b10;
                    } else {
                        char c12 = (char) i10;
                        char c13 = (char) i14;
                        if (b10 != -1) {
                            throw new IllegalStateException(p0.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                        }
                        bArrCopyOf[i14] = b;
                    }
                }
                return new q2(q2Var.f15360a.concat(".ignoreCase()"), q2Var.b, bArrCopyOf, true);
            }
            i12++;
        }
    }

    public final boolean c(char c10) {
        byte[] bArr = this.f15365g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            if (this.f15366h == q2Var.f15366h && Arrays.equals(this.b, q2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.f15366h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f15360a;
    }

    public q2(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f15360a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            int iB = w2.b(length, RoundingMode.UNNECESSARY);
            this.f15362d = iB;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f15363e = i10;
            this.f15364f = iB >> iNumberOfTrailingZeros;
            this.f15361c = length - 1;
            this.f15365g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f15364f; i11++) {
                zArr[w2.a(i11 * 8, this.f15362d, RoundingMode.CEILING)] = true;
            }
            this.f15366h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
