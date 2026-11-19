package fb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class j3 extends i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f15755e;

    public j3(byte[] bArr) {
        bArr.getClass();
        this.f15755e = bArr;
    }

    @Override // fb.m3
    public byte b(int i10) {
        return this.f15755e[i10];
    }

    @Override // fb.m3
    public byte c(int i10) {
        return this.f15755e[i10];
    }

    @Override // fb.m3
    public int d() {
        return this.f15755e.length;
    }

    @Override // fb.m3
    public void e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15755e, 0, bArr, 0, i12);
    }

    @Override // fb.m3
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
        byte[] bArr = this.f15755e;
        byte[] bArr2 = j3Var.f15755e;
        int iQ = q() + iD;
        int iQ2 = q();
        int iQ3 = j3Var.q();
        while (iQ2 < iQ) {
            if (bArr[iQ2] != bArr2[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    @Override // fb.m3
    public final int f(int i10, int i11, int i12) {
        int iQ = q();
        Charset charset = s3.f15860a;
        for (int i13 = iQ; i13 < iQ + i12; i13++) {
            i10 = (i10 * 31) + this.f15755e[i13];
        }
        return i10;
    }

    @Override // fb.m3
    public final m3 g(int i10, int i11) {
        int iJ = m3.j(i10, i11, d());
        return iJ == 0 ? m3.b : new g3(this.f15755e, q() + i10, iJ);
    }

    @Override // fb.m3
    public final InputStream h() {
        return new ByteArrayInputStream(this.f15755e, q(), d());
    }

    @Override // fb.m3
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f15755e, q(), d()).asReadOnlyBuffer();
    }

    public int q() {
        return 0;
    }
}
