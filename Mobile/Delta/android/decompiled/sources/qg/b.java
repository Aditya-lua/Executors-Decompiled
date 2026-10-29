package qg;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f29364a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29365c;

    public b(int i10, int i11) {
        this.f29364a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.b = i10;
        this.f29365c = i11;
    }

    public void a(byte b) {
        for (byte[] bArr : this.f29364a) {
            Arrays.fill(bArr, b);
        }
    }

    public byte b(int i10, int i11) {
        return this.f29364a[i11][i10];
    }

    public byte[][] c() {
        return this.f29364a;
    }

    public int d() {
        return this.f29365c;
    }

    public int e() {
        return this.b;
    }

    public void f(int i10, int i11, int i12) {
        this.f29364a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f29364a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.b * 2 * this.f29365c) + 2);
        for (int i10 = 0; i10 < this.f29365c; i10++) {
            byte[] bArr = this.f29364a[i10];
            for (int i11 = 0; i11 < this.b; i11++) {
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
