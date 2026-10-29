package p323o6;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p560xu.C12924e;
import p560xu.C12953s0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: o6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Ljava/nio/ByteBuffer;", "Lxu/r0;", "a", "(Ljava/nio/ByteBuffer;)Lxu/r0;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9697e {

    /* JADX INFO: renamed from: o6.e$a */
    @Metadata(m31664d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"o6/e$a", "Lxu/r0;", "", "close", "()V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Lxu/s0;", "timeout", "()Lxu/s0;", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "a", "Ljava/nio/ByteBuffer;", "buffer", "", "b", "I", "len", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC12951r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final ByteBuffer buffer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int len;

        public a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.buffer = byteBufferSlice;
            this.len = byteBufferSlice.capacity();
        }

        @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p560xu.InterfaceC12951r0
        public long read(C12924e sink, long byteCount) {
            if (this.buffer.position() == this.len) {
                return -1L;
            }
            this.buffer.limit(C7764d.m32081f((int) (((long) this.buffer.position()) + byteCount), this.len));
            return sink.write(this.buffer);
        }

        @Override // p560xu.InterfaceC12951r0
        /* JADX INFO: renamed from: timeout */
        public C12953s0 getF45811a() {
            return C12953s0.NONE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC12951r0 m38316a(@NotNull ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
