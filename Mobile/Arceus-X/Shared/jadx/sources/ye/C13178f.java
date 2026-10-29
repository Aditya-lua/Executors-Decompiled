package ye;

import java.util.Arrays;

/* JADX INFO: renamed from: ye.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C13178f {
    /* JADX INFO: renamed from: a */
    public static byte[] m48789a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m48790b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
