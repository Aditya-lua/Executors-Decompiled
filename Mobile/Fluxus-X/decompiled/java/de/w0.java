package de;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f12239a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12240c;

    public w0(FileChannel fileChannel, long j10, long j11) {
        this.f12239a = fileChannel;
        this.b = j10;
        this.f12240c = j11;
    }

    @Override // de.w
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f12239a.map(FileChannel.MapMode.READ_ONLY, this.b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // de.w
    public final long zza() {
        return this.f12240c;
    }
}
