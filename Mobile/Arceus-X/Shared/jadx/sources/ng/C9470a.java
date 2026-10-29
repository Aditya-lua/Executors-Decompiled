package ng;

import java.util.Arrays;

/* JADX INFO: renamed from: ng.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9470a implements Cloneable {

    /* JADX INFO: renamed from: c */
    public static final int[] f34036c = new int[0];

    /* JADX INFO: renamed from: a */
    public int[] f34037a;

    /* JADX INFO: renamed from: b */
    public int f34038b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9470a() {
        this.f34038b = 0;
        this.f34037a = f34036c;
    }

    /* JADX INFO: renamed from: k */
    public static int[] m37304k(int i10) {
        return new int[(i10 + 31) / 32];
    }

    /* JADX INFO: renamed from: a */
    public void m37305a(boolean z10) {
        m37309f(this.f34038b + 1);
        if (z10) {
            int[] iArr = this.f34037a;
            int i10 = this.f34038b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f34038b++;
    }

    /* JADX INFO: renamed from: b */
    public void m37306b(C9470a c9470a) {
        int i10 = c9470a.f34038b;
        m37309f(this.f34038b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            m37305a(c9470a.m37310h(i11));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37307c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f34038b;
        m37309f(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f34037a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f34038b = i12;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C9470a clone() {
        return new C9470a((int[]) this.f34037a.clone(), this.f34038b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9470a)) {
            return false;
        }
        C9470a c9470a = (C9470a) obj;
        return this.f34038b == c9470a.f34038b && Arrays.equals(this.f34037a, c9470a.f34037a);
    }

    /* JADX INFO: renamed from: f */
    public final void m37309f(int i10) {
        if (i10 > this.f34037a.length * 32) {
            int[] iArrM37304k = m37304k((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f34037a;
            System.arraycopy(iArr, 0, iArrM37304k, 0, iArr.length);
            this.f34037a = iArrM37304k;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m37310h(int i10) {
        return ((1 << (i10 & 31)) & this.f34037a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f34038b * 31) + Arrays.hashCode(this.f34037a);
    }

    /* JADX INFO: renamed from: i */
    public int m37311i() {
        return this.f34038b;
    }

    /* JADX INFO: renamed from: j */
    public int m37312j() {
        return (this.f34038b + 7) / 8;
    }

    /* JADX INFO: renamed from: n */
    public void m37313n(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (m37310h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m37314o(C9470a c9470a) {
        if (this.f34038b != c9470a.f34038b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f34037a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ c9470a.f34037a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f34038b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f34038b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m37310h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public C9470a(int[] iArr, int i10) {
        this.f34037a = iArr;
        this.f34038b = i10;
    }
}
