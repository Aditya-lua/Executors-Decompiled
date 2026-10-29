package re;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: re.h0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10831h0 extends AbstractC10825e0 {
    public C10831h0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // re.AbstractC10825e0
    /* JADX INFO: renamed from: b */
    public int[] mo41206b(int[] iArr, int i10) {
        if (iArr.length != mo41209e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        C10819b0.m41200e(iArr2, C10819b0.m41197b(this.f38543a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // re.AbstractC10825e0
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ byte[] mo41207c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.mo41207c(bArr, byteBuffer);
    }

    @Override // re.AbstractC10825e0
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo41208d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.mo41208d(byteBuffer, bArr, bArr2);
    }

    @Override // re.AbstractC10825e0
    /* JADX INFO: renamed from: e */
    public int mo41209e() {
        return 24;
    }
}
