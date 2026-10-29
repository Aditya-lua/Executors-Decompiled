package p100eb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: eb.j3 */
/* JADX INFO: loaded from: classes.dex */
public class C4952j3 extends AbstractC4946i3 {

    /* JADX INFO: renamed from: e */
    public final byte[] f19675e;

    public C4952j3(byte[] bArr) {
        bArr.getClass();
        this.f19675e = bArr;
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: b */
    public byte mo23598b(int i10) {
        return this.f19675e[i10];
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: c */
    public byte mo23599c(int i10) {
        return this.f19675e[i10];
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: d */
    public int mo23600d() {
        return this.f19675e.length;
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: e */
    public void mo23601e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f19675e, 0, bArr, 0, i12);
    }

    @Override // p100eb.AbstractC4970m3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4970m3) || mo23600d() != ((AbstractC4970m3) obj).mo23600d()) {
            return false;
        }
        if (mo23600d() == 0) {
            return true;
        }
        if (!(obj instanceof C4952j3)) {
            return obj.equals(this);
        }
        C4952j3 c4952j3 = (C4952j3) obj;
        int iM23674l = m23674l();
        int iM23674l2 = c4952j3.m23674l();
        if (iM23674l != 0 && iM23674l2 != 0 && iM23674l != iM23674l2) {
            return false;
        }
        int iMo23600d = mo23600d();
        if (iMo23600d > c4952j3.mo23600d()) {
            throw new IllegalArgumentException("Length too large: " + iMo23600d + mo23600d());
        }
        if (iMo23600d > c4952j3.mo23600d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iMo23600d + ", " + c4952j3.mo23600d());
        }
        byte[] bArr = this.f19675e;
        byte[] bArr2 = c4952j3.f19675e;
        int iMo23602t = mo23602t() + iMo23600d;
        int iMo23602t2 = mo23602t();
        int iMo23602t3 = c4952j3.mo23602t();
        while (iMo23602t2 < iMo23602t) {
            if (bArr[iMo23602t2] != bArr2[iMo23602t3]) {
                return false;
            }
            iMo23602t2++;
            iMo23602t3++;
        }
        return true;
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: f */
    public final int mo23645f(int i10, int i11, int i12) {
        int iMo23602t = mo23602t();
        Charset charset = C5006s3.f19801a;
        for (int i13 = iMo23602t; i13 < iMo23602t + i12; i13++) {
            i10 = (i10 * 31) + this.f19675e[i13];
        }
        return i10;
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: g */
    public final AbstractC4970m3 mo23646g(int i10, int i11) {
        int iM23672k = AbstractC4970m3.m23672k(i10, i11, mo23600d());
        return iM23672k == 0 ? AbstractC4970m3.f19698b : new C4934g3(this.f19675e, mo23602t() + i10, iM23672k);
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: h */
    public final InputStream mo23647h() {
        return new ByteArrayInputStream(this.f19675e, mo23602t(), mo23600d());
    }

    @Override // p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: i */
    public final ByteBuffer mo23648i() {
        return ByteBuffer.wrap(this.f19675e, mo23602t(), mo23600d()).asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: t */
    public int mo23602t() {
        return 0;
    }
}
