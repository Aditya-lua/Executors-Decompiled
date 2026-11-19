package de;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f12183a;

    public a(ByteBuffer byteBuffer) {
        this.f12183a = byteBuffer.slice();
    }

    @Override // de.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f12183a) {
            int i11 = (int) j10;
            this.f12183a.position(i11);
            this.f12183a.limit(i11 + i10);
            byteBufferSlice = this.f12183a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // de.w
    public final long zza() {
        return this.f12183a.capacity();
    }
}
