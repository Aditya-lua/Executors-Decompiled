package yu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu.m0;
import xu.n0;
import xu.p0;
import xu.q0;
import xu.r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lyu/h;", "Lxu/q0;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "", "cancel", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/net/Socket;", "b", "()Ljava/net/Socket;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "closeBits", "Lxu/r0;", "c", "Lxu/r0;", "getSource", "()Lxu/r0;", Payload.SOURCE, "Lxu/p0;", "d", "Lxu/p0;", "getSink", "()Lxu/p0;", "sink", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger closeBits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 sink;

    /* JADX INFO: renamed from: yu.h$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lyu/h$a;", "Lxu/p0;", "<init>", "(Lyu/h;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "close", "Lyu/n;", "a", "()Lyu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "kotlin.jvm.PlatformType", "Ljava/io/OutputStream;", "outputStream", "b", "Lyu/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class sink implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public sink() {
            this.outputStream = h.this.getSocket().getOutputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // xu.p0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // xu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.enter();
            try {
                try {
                    int iA = u.a(hVar.closeBits, 1);
                    if (iA == 0) {
                        nVar.exit();
                        return;
                    }
                    if (iA != 3) {
                        if (!hVar.getSocket().isClosed() && !hVar.getSocket().isOutputShutdown()) {
                            this.outputStream.flush();
                            try {
                                hVar.getSocket().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.outputStream.close();
                            }
                        }
                        nVar.exit();
                        return;
                    }
                    hVar.getSocket().close();
                    Unit unit = Unit.f22483a;
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!nVar.exit()) {
                        throw e10;
                    }
                    throw nVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                nVar.exit();
                throw th2;
            }
            nVar.exit();
            throw th2;
        }

        @Override // xu.p0, java.io.Flushable
        public void flush() throws IOException {
            n nVar = this.timeout;
            nVar.enter();
            try {
                try {
                    this.outputStream.flush();
                    Unit unit = Unit.f22483a;
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!nVar.exit()) {
                        throw e10;
                    }
                    throw nVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                nVar.exit();
                throw th2;
            }
        }

        @NotNull
        public String toString() {
            return "sink(" + h.this.getSocket() + ')';
        }

        @Override // xu.p0
        public void write(@NotNull xu.e source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            xu.b.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                this.timeout.throwIfReached();
                m0 m0Var = source.head;
                Intrinsics.checkNotNull(m0Var);
                int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
                n nVar = this.timeout;
                nVar.enter();
                try {
                    try {
                        this.outputStream.write(m0Var.data, m0Var.pos, iMin);
                        Unit unit = Unit.f22483a;
                        if (nVar.exit()) {
                            throw nVar.access$newTimeoutException(null);
                        }
                        m0Var.pos += iMin;
                        long j10 = iMin;
                        byteCount -= j10;
                        source.U(source.getSize() - j10);
                        if (m0Var.pos == m0Var.limit) {
                            source.head = m0Var.b();
                            n0.b(m0Var);
                        }
                    } catch (IOException e10) {
                        if (!nVar.exit()) {
                            throw e10;
                        }
                        throw nVar.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    nVar.exit();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: yu.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyu/h$b;", "Lxu/r0;", "<init>", "(Lyu/h;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "", "close", "()V", "Lyu/n;", "a", "()Lyu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "kotlin.jvm.PlatformType", "Ljava/io/InputStream;", "inputStream", "b", "Lyu/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class source implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final InputStream inputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public source() {
            this.inputStream = h.this.getSocket().getInputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // xu.r0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // xu.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.enter();
            try {
                try {
                    int iA = u.a(hVar.closeBits, 2);
                    if (iA == 0) {
                        nVar.exit();
                        return;
                    }
                    if (iA == 3) {
                        hVar.getSocket().close();
                    } else if (hVar.getSocket().isClosed() || hVar.getSocket().isInputShutdown()) {
                        nVar.exit();
                        return;
                    } else {
                        try {
                            hVar.getSocket().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.inputStream.close();
                        }
                    }
                    Unit unit = Unit.f22483a;
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                } catch (Throwable th2) {
                    nVar.exit();
                    throw th2;
                }
            } catch (IOException e10) {
                if (!nVar.exit()) {
                    throw e10;
                }
                throw nVar.access$newTimeoutException(e10);
            }
        }

        @Override // xu.r0
        public long read(@NotNull xu.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            this.timeout.throwIfReached();
            m0 m0VarZ = sink.Z(1);
            int iMin = (int) Math.min(byteCount, 8192 - m0VarZ.limit);
            try {
                n nVar = this.timeout;
                nVar.enter();
                try {
                    try {
                        int i10 = this.inputStream.read(m0VarZ.data, m0VarZ.limit, iMin);
                        if (nVar.exit()) {
                            throw nVar.access$newTimeoutException(null);
                        }
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
                    } catch (IOException e10) {
                        if (nVar.exit()) {
                            throw nVar.access$newTimeoutException(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    nVar.exit();
                    throw th2;
                }
            } catch (AssertionError e11) {
                if (v.b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        @NotNull
        public String toString() {
            return "source(" + h.this.getSocket() + ')';
        }
    }

    public h(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
        this.closeBits = new AtomicInteger();
        this.source = new source();
        this.sink = new sink();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // xu.q0
    public void cancel() throws IOException {
        this.socket.close();
    }

    @Override // xu.q0
    @NotNull
    public p0 getSink() {
        return this.sink;
    }

    @Override // xu.q0
    @NotNull
    public r0 getSource() {
        return this.source;
    }

    @NotNull
    public String toString() {
        String string = this.socket.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
