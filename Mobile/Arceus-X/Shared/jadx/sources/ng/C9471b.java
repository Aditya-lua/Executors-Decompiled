package ng;

import java.util.Arrays;

/* JADX INFO: renamed from: ng.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9471b implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int f34039a;

    /* JADX INFO: renamed from: b */
    public int f34040b;

    /* JADX INFO: renamed from: c */
    public int f34041c;

    /* JADX INFO: renamed from: d */
    public int[] f34042d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9471b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f34039a = i10;
        this.f34040b = i11;
        int i12 = (i10 + 31) / 32;
        this.f34041c = i12;
        this.f34042d = new int[i12 * i11];
    }

    /* JADX INFO: renamed from: a */
    public final String m37315a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f34040b * (this.f34039a + 1));
        for (int i10 = 0; i10 < this.f34040b; i10++) {
            for (int i11 = 0; i11 < this.f34039a; i11++) {
                sb2.append(m37317c(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9471b clone() {
        return new C9471b(this.f34039a, this.f34040b, this.f34041c, (int[]) this.f34042d.clone());
    }

    /* JADX INFO: renamed from: c */
    public boolean m37317c(int i10, int i11) {
        return ((this.f34042d[(i11 * this.f34041c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: e */
    public void m37318e(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f34040b || i14 > this.f34039a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f34041c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f34042d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9471b)) {
            return false;
        }
        C9471b c9471b = (C9471b) obj;
        return this.f34039a == c9471b.f34039a && this.f34040b == c9471b.f34040b && this.f34041c == c9471b.f34041c && Arrays.equals(this.f34042d, c9471b.f34042d);
    }

    /* JADX INFO: renamed from: f */
    public String m37319f(String str, String str2) {
        return m37315a(str, str2, "\n");
    }

    public int hashCode() {
        int i10 = this.f34039a;
        return (((((((i10 * 31) + i10) * 31) + this.f34040b) * 31) + this.f34041c) * 31) + Arrays.hashCode(this.f34042d);
    }

    public String toString() {
        return m37319f("X ", "  ");
    }

    public C9471b(int i10, int i11, int i12, int[] iArr) {
        this.f34039a = i10;
        this.f34040b = i11;
        this.f34041c = i12;
        this.f34042d = iArr;
    }
}
