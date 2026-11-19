package wg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35767a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f35769d;

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f35767a = i10;
        this.b = i11;
        int i12 = (i10 + 31) / 32;
        this.f35768c = i12;
        this.f35769d = new int[i12 * i11];
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.b * (this.f35767a + 1));
        for (int i10 = 0; i10 < this.b; i10++) {
            for (int i11 = 0; i11 < this.f35767a; i11++) {
                sb2.append(c(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f35767a, this.b, this.f35768c, (int[]) this.f35769d.clone());
    }

    public boolean c(int i10, int i11) {
        return ((this.f35769d[(i11 * this.f35768c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public void e(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.b || i14 > this.f35767a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f35768c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f35769d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35767a == bVar.f35767a && this.b == bVar.b && this.f35768c == bVar.f35768c && Arrays.equals(this.f35769d, bVar.f35769d);
    }

    public String f(String str, String str2) {
        return a(str, str2, "\n");
    }

    public int hashCode() {
        int i10 = this.f35767a;
        return (((((((i10 * 31) + i10) * 31) + this.b) * 31) + this.f35768c) * 31) + Arrays.hashCode(this.f35769d);
    }

    public String toString() {
        return f("X ", "  ");
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f35767a = i10;
        this.b = i11;
        this.f35768c = i12;
        this.f35769d = iArr;
    }
}
