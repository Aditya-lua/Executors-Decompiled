package be;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: be.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1305a implements InterfaceC1371w {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f5340a;

    public C1305a(ByteBuffer byteBuffer) {
        this.f5340a = byteBuffer.slice();
    }

    @Override // be.InterfaceC1371w
    /* JADX INFO: renamed from: a */
    public final void mo7100a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f5340a) {
            int i11 = (int) j10;
            this.f5340a.position(i11);
            this.f5340a.limit(i11 + i10);
            byteBufferSlice = this.f5340a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // be.InterfaceC1371w
    public final long zza() {
        return this.f5340a.capacity();
    }
}
