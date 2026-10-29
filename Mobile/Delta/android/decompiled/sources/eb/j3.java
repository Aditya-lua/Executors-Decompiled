package eb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class j3 extends i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f15285e;

    public j3(byte[] bArr) {
        bArr.getClass();
        this.f15285e = bArr;
    }

    @Override // eb.m3
    public byte b(int i10) {
        return this.f15285e[i10];
    }

    @Override // eb.m3
    public byte c(int i10) {
        return this.f15285e[i10];
    }

    @Override // eb.m3
    public int d() {
        return this.f15285e.length;
    }

    @Override // eb.m3
    public void e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15285e, 0, bArr, 0, i12);
    }

    @Override // eb.m3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m3) || d() != ((m3) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return obj.equals(this);
        }
        j3 j3Var = (j3) obj;
        int iL = l();
        int iL2 = j3Var.l();
        if (iL != 0 && iL2 != 0 && iL != iL2) {
            return false;
        }
        int iD = d();
        if (iD > j3Var.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > j3Var.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iD + ", " + j3Var.d());
        }
        byte[] bArr = this.f15285e;
        byte[] bArr2 = j3Var.f15285e;
        int iT = t() + iD;
        int iT2 = t();
        int iT3 = j3Var.t();
        while (iT2 < iT) {
            if (bArr[iT2] != bArr2[iT3]) {
                return false;
            }
            iT2++;
            iT3++;
        }
        return true;
    }

    @Override // eb.m3
    public final int f(int i10, int i11, int i12) {
        int iT = t();
        Charset charset = s3.f15390a;
        for (int i13 = iT; i13 < iT + i12; i13++) {
            i10 = (i10 * 31) + this.f15285e[i13];
        }
        return i10;
    }

    @Override // eb.m3
    public final m3 g(int i10, int i11) {
        int iK = m3.k(i10, i11, d());
        return iK == 0 ? m3.b : new g3(this.f15285e, t() + i10, iK);
    }

    @Override // eb.m3
    public final InputStream h() {
        return new ByteArrayInputStream(this.f15285e, t(), d());
    }

    @Override // eb.m3
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f15285e, t(), d()).asReadOnlyBuffer();
    }

    public int t() {
        return 0;
    }
}
