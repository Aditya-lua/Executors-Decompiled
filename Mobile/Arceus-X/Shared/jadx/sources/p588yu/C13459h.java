package p588yu;

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
import p560xu.C12918b;
import p560xu.C12924e;
import p560xu.C12941m0;
import p560xu.C12943n0;
import p560xu.InterfaceC12947p0;
import p560xu.InterfaceC12949q0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: yu.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lyu/h;", "Lxu/q0;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "", "cancel", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/net/Socket;", "b", "()Ljava/net/Socket;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "closeBits", "Lxu/r0;", "c", "Lxu/r0;", "getSource", "()Lxu/r0;", Payload.SOURCE, "Lxu/p0;", "d", "Lxu/p0;", "getSink", "()Lxu/p0;", "sink", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13459h implements InterfaceC12949q0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger closeBits;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12951r0 source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12947p0 sink;

    /* JADX INFO: renamed from: yu.h$a, reason: from toString */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Lyu/h$a;", "Lxu/p0;", "<init>", "(Lyu/h;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "close", "Lyu/n;", "a", "()Lyu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "kotlin.jvm.PlatformType", "Ljava/io/OutputStream;", "outputStream", "b", "Lyu/n;", "timeout", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class sink implements InterfaceC12947p0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C13465n timeout;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public sink() {
            this.outputStream = C13459h.this.getSocket().getOutputStream();
            this.timeout = new C13465n(C13459h.this.getSocket());
        }

        /* JADX DEBUG: Method merged with bridge method: timeout()Lxu/s0; */
        @Override // p560xu.InterfaceC12947p0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public C13465n getTimeout() {
            return this.timeout;
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C13465n c13465n = this.timeout;
            C13459h c13459h = C13459h.this;
            c13465n.enter();
            try {
                try {
                    int iM49156a = C13472u.m49156a(c13459h.closeBits, 1);
                    if (iM49156a == 0) {
                        c13465n.exit();
                        return;
                    }
                    if (iM49156a != 3) {
                        if (!c13459h.getSocket().isClosed() && !c13459h.getSocket().isOutputShutdown()) {
                            this.outputStream.flush();
                            try {
                                c13459h.getSocket().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.outputStream.close();
                            }
                        }
                        c13465n.exit();
                        return;
                    }
                    c13459h.getSocket().close();
                    Unit unit = Unit.f29331a;
                    if (c13465n.exit()) {
                        throw c13465n.access$newTimeoutException(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!c13465n.exit()) {
                        throw e10;
                    }
                    throw c13465n.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                c13465n.exit();
                throw th2;
            }
            c13465n.exit();
            throw th2;
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Flushable
        public void flush() throws IOException {
            C13465n c13465n = this.timeout;
            c13465n.enter();
            try {
                try {
                    this.outputStream.flush();
                    Unit unit = Unit.f29331a;
                    if (c13465n.exit()) {
                        throw c13465n.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!c13465n.exit()) {
                        throw e10;
                    }
                    throw c13465n.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                c13465n.exit();
                throw th2;
            }
        }

        @NotNull
        public String toString() {
            return "sink(" + C13459h.this.getSocket() + ')';
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
                C13465n c13465n = this.timeout;
                c13465n.enter();
                try {
                    try {
                        this.outputStream.write(c12941m0.data, c12941m0.pos, iMin);
                        Unit unit = Unit.f29331a;
                        if (c13465n.exit()) {
                            throw c13465n.access$newTimeoutException(null);
                        }
                        c12941m0.pos += iMin;
                        long j10 = iMin;
                        byteCount -= j10;
                        source.m48010U(source.getSize() - j10);
                        if (c12941m0.pos == c12941m0.limit) {
                            source.head = c12941m0.m48171b();
                            C12943n0.m48178b(c12941m0);
                        }
                    } catch (IOException e10) {
                        if (!c13465n.exit()) {
                            throw e10;
                        }
                        throw c13465n.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    c13465n.exit();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: yu.h$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lyu/h$b;", "Lxu/r0;", "<init>", "(Lyu/h;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "", "close", "()V", "Lyu/n;", "a", "()Lyu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "kotlin.jvm.PlatformType", "Ljava/io/InputStream;", "inputStream", "b", "Lyu/n;", "timeout", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class source implements InterfaceC12951r0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final InputStream inputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C13465n timeout;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public source() {
            this.inputStream = C13459h.this.getSocket().getInputStream();
            this.timeout = new C13465n(C13459h.this.getSocket());
        }

        /* JADX DEBUG: Method merged with bridge method: timeout()Lxu/s0; */
        @Override // p560xu.InterfaceC12951r0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public C13465n getTimeout() {
            return this.timeout;
        }

        @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C13465n c13465n = this.timeout;
            C13459h c13459h = C13459h.this;
            c13465n.enter();
            try {
                try {
                    int iM49156a = C13472u.m49156a(c13459h.closeBits, 2);
                    if (iM49156a == 0) {
                        c13465n.exit();
                        return;
                    }
                    if (iM49156a == 3) {
                        c13459h.getSocket().close();
                    } else if (c13459h.getSocket().isClosed() || c13459h.getSocket().isInputShutdown()) {
                        c13465n.exit();
                        return;
                    } else {
                        try {
                            c13459h.getSocket().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.inputStream.close();
                        }
                    }
                    Unit unit = Unit.f29331a;
                    if (c13465n.exit()) {
                        throw c13465n.access$newTimeoutException(null);
                    }
                } catch (Throwable th2) {
                    c13465n.exit();
                    throw th2;
                }
            } catch (IOException e10) {
                if (!c13465n.exit()) {
                    throw e10;
                }
                throw c13465n.access$newTimeoutException(e10);
            }
        }

        @Override // p560xu.InterfaceC12951r0
        public long read(@NotNull C12924e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            this.timeout.throwIfReached();
            C12941m0 c12941m0M48015Z = sink.m48015Z(1);
            int iMin = (int) Math.min(byteCount, 8192 - c12941m0M48015Z.limit);
            try {
                C13465n c13465n = this.timeout;
                c13465n.enter();
                try {
                    try {
                        int i10 = this.inputStream.read(c12941m0M48015Z.data, c12941m0M48015Z.limit, iMin);
                        if (c13465n.exit()) {
                            throw c13465n.access$newTimeoutException(null);
                        }
                        if (i10 != -1) {
                            c12941m0M48015Z.limit += i10;
                            long j10 = i10;
                            sink.m48010U(sink.getSize() + j10);
                            return j10;
                        }
                        if (c12941m0M48015Z.pos != c12941m0M48015Z.limit) {
                            return -1L;
                        }
                        sink.head = c12941m0M48015Z.m48171b();
                        C12943n0.m48178b(c12941m0M48015Z);
                        return -1L;
                    } catch (IOException e10) {
                        if (c13465n.exit()) {
                            throw c13465n.access$newTimeoutException(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    c13465n.exit();
                    throw th2;
                }
            } catch (AssertionError e11) {
                if (C13473v.m49158b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        @NotNull
        public String toString() {
            return "source(" + C13459h.this.getSocket() + ')';
        }
    }

    public C13459h(@NotNull Socket socket) {
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

    @Override // p560xu.InterfaceC12949q0
    public void cancel() throws IOException {
        this.socket.close();
    }

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    public InterfaceC12947p0 getSink() {
        return this.sink;
    }

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    public InterfaceC12951r0 getSource() {
        return this.source;
    }

    @NotNull
    public String toString() {
        String string = this.socket.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
