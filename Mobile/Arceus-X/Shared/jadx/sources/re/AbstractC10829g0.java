package re;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import p465ue.C11844b;

/* JADX INFO: renamed from: re.g0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10829g0 {

    /* JADX INFO: renamed from: c */
    public static final C11844b.b f38545c = C11844b.b.f41601a;

    /* JADX INFO: renamed from: a */
    public final AbstractC10825e0 f38546a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10825e0 f38547b;

    public AbstractC10829g0(byte[] bArr) throws GeneralSecurityException {
        if (!f38545c.mo44243a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f38546a = mo41229e(bArr, 1);
        this.f38547b = mo41229e(bArr, 0);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m41230d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo41227a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            C10837k0.m41257f(m41231c(bArr), m41230d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(iPosition);
            return this.f38546a.mo41207c(bArr, byteBuffer);
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo41228b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f38546a.mo41208d(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrM41252a = C10837k0.m41252a(m41231c(bArr), m41230d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM41252a);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m41231c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f38547b.m41225a(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC10825e0 mo41229e(byte[] bArr, int i10);
}
