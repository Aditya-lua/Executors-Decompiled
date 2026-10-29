package ae;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f313a;

    public a(ByteBuffer byteBuffer) {
        this.f313a = byteBuffer.slice();
    }

    @Override // ae.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f313a) {
            int i11 = (int) j10;
            this.f313a.position(i11);
            this.f313a.limit(i11 + i10);
            byteBufferSlice = this.f313a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // ae.w
    public final long zza() {
        return this.f313a.capacity();
    }
}
