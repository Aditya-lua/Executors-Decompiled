package mg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f24190c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24191a;
    public int b;

    public a() {
        this.b = 0;
        this.f24191a = f24190c;
    }

    public static int[] k(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        f(this.b + 1);
        if (z10) {
            int[] iArr = this.f24191a;
            int i10 = this.b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.b++;
    }

    public void b(a aVar) {
        int i10 = aVar.b;
        f(this.b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.b;
        f(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f24191a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.b = i12;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f24191a.clone(), this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && Arrays.equals(this.f24191a, aVar.f24191a);
    }

    public final void f(int i10) {
        if (i10 > this.f24191a.length * 32) {
            int[] iArrK = k((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f24191a;
            System.arraycopy(iArr, 0, iArrK, 0, iArr.length);
            this.f24191a = iArrK;
        }
    }

    public boolean h(int i10) {
        return ((1 << (i10 & 31)) & this.f24191a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.f24191a);
    }

    public int i() {
        return this.b;
    }

    public int j() {
        return (this.b + 7) / 8;
    }

    public void n(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void o(a aVar) {
        if (this.b != aVar.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24191a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f24191a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int[] iArr, int i10) {
        this.f24191a = iArr;
        this.b = i10;
    }
}
