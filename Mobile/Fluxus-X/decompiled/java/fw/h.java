package fw;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.g0;
import ew.h0;
import ew.j0;
import ew.k0;
import ew.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfw/h;", "Lew/k0;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", BuildConfig.FLAVOR, "cancel", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Ljava/net/Socket;", "d", "()Ljava/net/Socket;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "closeBits", "Lew/l0;", "c", "Lew/l0;", "()Lew/l0;", Payload.SOURCE, "Lew/j0;", "Lew/j0;", "()Lew/j0;", "sink", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger closeBits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 sink;

    /* JADX INFO: renamed from: fw.h$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfw/h$a;", "Lew/j0;", "<init>", "(Lfw/h;)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "close", "Lfw/n;", "a", "()Lfw/n;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "kotlin.jvm.PlatformType", "Ljava/io/OutputStream;", "outputStream", "b", "Lfw/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class sink implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public sink() {
            this.outputStream = h.this.getSocket().getOutputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // ew.j0
        public void R2(@NotNull ew.e source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            ew.b.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                this.timeout.f();
                g0 g0Var = source.head;
                Intrinsics.checkNotNull(g0Var);
                int iMin = (int) Math.min(byteCount, g0Var.limit - g0Var.pos);
                n nVar = this.timeout;
                nVar.s();
                try {
                    try {
                        this.outputStream.write(g0Var.data, g0Var.pos, iMin);
                        Unit unit = Unit.f21506a;
                        if (nVar.t()) {
                            throw nVar.p(null);
                        }
                        g0Var.pos += iMin;
                        long j10 = iMin;
                        byteCount -= j10;
                        source.c0(source.getSize() - j10);
                        if (g0Var.pos == g0Var.limit) {
                            source.head = g0Var.b();
                            h0.b(g0Var);
                        }
                    } catch (IOException e10) {
                        if (!nVar.t()) {
                            throw e10;
                        }
                        throw nVar.p(e10);
                    }
                } catch (Throwable th2) {
                    nVar.t();
                    throw th2;
                }
            }
        }

        @Override // ew.j0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.s();
            try {
                try {
                    int iA = u.a(hVar.closeBits, 1);
                    if (iA == 0) {
                        nVar.t();
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
                        nVar.t();
                        return;
                    }
                    hVar.getSocket().close();
                    Unit unit = Unit.f21506a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!nVar.t()) {
                        throw e10;
                    }
                    throw nVar.p(e10);
                }
            } catch (Throwable th2) {
                nVar.t();
                throw th2;
            }
            nVar.t();
            throw th2;
        }

        @Override // ew.j0, java.io.Flushable
        public void flush() throws IOException {
            n nVar = this.timeout;
            nVar.s();
            try {
                try {
                    this.outputStream.flush();
                    Unit unit = Unit.f21506a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                } catch (IOException e10) {
                    if (!nVar.t()) {
                        throw e10;
                    }
                    throw nVar.p(e10);
                }
            } catch (Throwable th2) {
                nVar.t();
                throw th2;
            }
        }

        @NotNull
        public String toString() {
            return "sink(" + h.this.getSocket() + ')';
        }
    }

    /* JADX INFO: renamed from: fw.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lfw/h$b;", "Lew/l0;", "<init>", "(Lfw/h;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", "Lfw/n;", "a", "()Lfw/n;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "kotlin.jvm.PlatformType", "Ljava/io/InputStream;", "inputStream", "b", "Lfw/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class source implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final InputStream inputStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public source() {
            this.inputStream = h.this.getSocket().getInputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // ew.l0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.s();
            try {
                try {
                    int iA = u.a(hVar.closeBits, 2);
                    if (iA == 0) {
                        nVar.t();
                        return;
                    }
                    if (iA == 3) {
                        hVar.getSocket().close();
                    } else if (hVar.getSocket().isClosed() || hVar.getSocket().isInputShutdown()) {
                        nVar.t();
                        return;
                    } else {
                        try {
                            hVar.getSocket().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.inputStream.close();
                        }
                    }
                    Unit unit = Unit.f21506a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                } catch (Throwable th2) {
                    nVar.t();
                    throw th2;
                }
            } catch (IOException e10) {
                if (!nVar.t()) {
                    throw e10;
                }
                throw nVar.p(e10);
            }
        }

        @Override // ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            this.timeout.f();
            g0 g0VarF0 = sink.f0(1);
            int iMin = (int) Math.min(byteCount, 8192 - g0VarF0.limit);
            try {
                n nVar = this.timeout;
                nVar.s();
                try {
                    try {
                        int i10 = this.inputStream.read(g0VarF0.data, g0VarF0.limit, iMin);
                        if (nVar.t()) {
                            throw nVar.p(null);
                        }
                        if (i10 != -1) {
                            g0VarF0.limit += i10;
                            long j10 = i10;
                            sink.c0(sink.getSize() + j10);
                            return j10;
                        }
                        if (g0VarF0.pos != g0VarF0.limit) {
                            return -1L;
                        }
                        sink.head = g0VarF0.b();
                        h0.b(g0VarF0);
                        return -1L;
                    } catch (IOException e10) {
                        if (nVar.t()) {
                            throw nVar.p(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    nVar.t();
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

    @Override // ew.k0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public l0 getSource() {
        return this.source;
    }

    @Override // ew.k0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public j0 getSink() {
        return this.sink;
    }

    @Override // ew.k0
    public void cancel() throws IOException {
        this.socket.close();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @NotNull
    public String toString() {
        String string = this.socket.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
