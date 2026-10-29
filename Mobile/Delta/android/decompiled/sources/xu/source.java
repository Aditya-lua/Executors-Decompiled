package xu;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.v, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxu/v;", "Lxu/r0;", "Ljava/io/InputStream;", "input", "Lxu/s0;", "timeout", "<init>", "(Ljava/io/InputStream;Lxu/s0;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "", "close", "()V", "()Lxu/s0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "Lxu/s0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class source implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputStream input;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s0 timeout;

    public source(@NotNull InputStream input, @NotNull s0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // xu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // xu.r0
    public long read(@NotNull e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.throwIfReached();
            m0 m0VarZ = sink.Z(1);
            int i10 = this.input.read(m0VarZ.data, m0VarZ.limit, (int) Math.min(byteCount, 8192 - m0VarZ.limit));
            if (i10 != -1) {
                m0VarZ.limit += i10;
                long j10 = i10;
                sink.U(sink.getSize() + j10);
                return j10;
            }
            if (m0VarZ.pos != m0VarZ.limit) {
                return -1L;
            }
            sink.head = m0VarZ.b();
            n0.b(m0VarZ);
            return -1L;
        } catch (AssertionError e10) {
            if (yu.v.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // xu.r0
    @NotNull
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public s0 getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "source(" + this.input + ')';
    }
}
