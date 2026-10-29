package re;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p076df.C4583e;

/* JADX INFO: renamed from: re.e0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10825e0 {

    /* JADX INFO: renamed from: a */
    public int[] f38543a;

    /* JADX INFO: renamed from: b */
    public final int f38544b;

    public AbstractC10825e0(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f38543a = C10819b0.m41203h(bArr);
        this.f38544b = i10;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m41225a(byte[] bArr, int i10) {
        int[] iArrMo41206b = mo41206b(C10819b0.m41203h(bArr), i10);
        int[] iArr = (int[]) iArrMo41206b.clone();
        C10819b0.m41201f(iArr);
        for (int i11 = 0; i11 < iArrMo41206b.length; i11++) {
            iArrMo41206b[i11] = iArrMo41206b[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo41206b, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: b */
    public abstract int[] mo41206b(int[] iArr, int i10);

    /* JADX INFO: renamed from: c */
    public byte[] mo41207c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        m41226f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: d */
    public void mo41208d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        m41226f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo41209e();

    /* JADX INFO: renamed from: f */
    public final void m41226f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != mo41209e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo41209e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferM41225a = m41225a(bArr, this.f38544b + i12);
            if (i12 == i10) {
                C4583e.m22663c(byteBuffer, byteBuffer2, byteBufferM41225a, iRemaining % 64);
            } else {
                C4583e.m22663c(byteBuffer, byteBuffer2, byteBufferM41225a, 64);
            }
        }
    }
}
