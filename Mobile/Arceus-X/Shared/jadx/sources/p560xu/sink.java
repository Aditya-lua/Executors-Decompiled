package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.g0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lxu/g0;", "Lxu/p0;", "Ljava/io/OutputStream;", "out", "Lxu/s0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lxu/s0;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "close", "()Lxu/s0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lxu/s0;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class sink implements InterfaceC12947p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OutputStream out;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12953s0 timeout;

    public sink(@NotNull OutputStream out, @NotNull C12953s0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public C12953s0 getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C12918b.m47948b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.throwIfReached();
            C12941m0 c12941m0 = source.head;
            Intrinsics.checkNotNull(c12941m0);
            int iMin = (int) Math.min(byteCount, c12941m0.limit - c12941m0.pos);
            this.out.write(c12941m0.data, c12941m0.pos, iMin);
            c12941m0.pos += iMin;
            long j10 = iMin;
            byteCount -= j10;
            source.m48010U(source.getSize() - j10);
            if (c12941m0.pos == c12941m0.limit) {
                source.head = c12941m0.m48171b();
                C12943n0.m48178b(c12941m0);
            }
        }
    }
}
