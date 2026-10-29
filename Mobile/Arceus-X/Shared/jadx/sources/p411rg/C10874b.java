package p411rg;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: rg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10874b {

    /* JADX INFO: renamed from: a */
    public final byte[][] f38601a;

    /* JADX INFO: renamed from: b */
    public final int f38602b;

    /* JADX INFO: renamed from: c */
    public final int f38603c;

    public C10874b(int i10, int i11) {
        this.f38601a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f38602b = i10;
        this.f38603c = i11;
    }

    /* JADX INFO: renamed from: a */
    public void m41328a(byte b) {
        for (byte[] bArr : this.f38601a) {
            Arrays.fill(bArr, b);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte m41329b(int i10, int i11) {
        return this.f38601a[i11][i10];
    }

    /* JADX INFO: renamed from: c */
    public byte[][] m41330c() {
        return this.f38601a;
    }

    /* JADX INFO: renamed from: d */
    public int m41331d() {
        return this.f38603c;
    }

    /* JADX INFO: renamed from: e */
    public int m41332e() {
        return this.f38602b;
    }

    /* JADX INFO: renamed from: f */
    public void m41333f(int i10, int i11, int i12) {
        this.f38601a[i11][i10] = (byte) i12;
    }

    /* JADX INFO: renamed from: g */
    public void m41334g(int i10, int i11, boolean z10) {
        this.f38601a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f38602b * 2 * this.f38603c) + 2);
        for (int i10 = 0; i10 < this.f38603c; i10++) {
            byte[] bArr = this.f38601a[i10];
            for (int i11 = 0; i11 < this.f38602b; i11++) {
                byte b = bArr[i11];
                if (b == 0) {
                    sb2.append(" 0");
                } else if (b != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
