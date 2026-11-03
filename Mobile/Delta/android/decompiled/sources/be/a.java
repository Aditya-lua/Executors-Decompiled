package be;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3985a;

    public a(ByteBuffer byteBuffer) {
        this.f3985a = byteBuffer.slice();
    }

    @Override // be.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f3985a) {
            int i11 = (int) j10;
            this.f3985a.position(i11);
            this.f3985a.limit(i11 + i10);
            byteBufferSlice = this.f3985a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // be.w
    public final long zza() {
        return this.f3985a.capacity();
    }
}
