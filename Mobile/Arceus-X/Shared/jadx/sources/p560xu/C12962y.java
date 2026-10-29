package p560xu;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lxu/y;", "Lxu/j;", "", "readWrite", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(ZLjava/nio/channels/FileChannel;)V", "", "h", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "g", "(J[BII)I", "", "f", "()V", "e", "Ljava/nio/channels/FileChannel;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12962y extends AbstractC12934j {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12962y(boolean z10, @NotNull FileChannel fileChannel) {
        super(z10);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // p560xu.AbstractC12934j
    /* JADX INFO: renamed from: f */
    public synchronized void mo48147f() {
        this.fileChannel.close();
    }

    @Override // p560xu.AbstractC12934j
    /* JADX INFO: renamed from: g */
    public synchronized int mo48148g(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(fileOffset);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, arrayOffset, byteCount);
        int i10 = 0;
        while (i10 < byteCount) {
            int i11 = this.fileChannel.read(byteBufferWrap);
            if (i11 == -1) {
                if (i10 != 0) {
                    break;
                }
                return -1;
            }
            i10 += i11;
        }
        return i10;
    }

    @Override // p560xu.AbstractC12934j
    /* JADX INFO: renamed from: h */
    public synchronized long mo48149h() {
        return this.fileChannel.size();
    }
}
