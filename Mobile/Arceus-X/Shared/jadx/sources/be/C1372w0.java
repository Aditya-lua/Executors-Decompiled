package be;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: renamed from: be.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1372w0 implements InterfaceC1371w {

    /* JADX INFO: renamed from: a */
    public final FileChannel f5413a;

    /* JADX INFO: renamed from: b */
    public final long f5414b;

    /* JADX INFO: renamed from: c */
    public final long f5415c;

    public C1372w0(FileChannel fileChannel, long j10, long j11) {
        this.f5413a = fileChannel;
        this.f5414b = j10;
        this.f5415c = j11;
    }

    @Override // be.InterfaceC1371w
    /* JADX INFO: renamed from: a */
    public final void mo7100a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f5413a.map(FileChannel.MapMode.READ_ONLY, this.f5414b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // be.InterfaceC1371w
    public final long zza() {
        return this.f5415c;
    }
}
