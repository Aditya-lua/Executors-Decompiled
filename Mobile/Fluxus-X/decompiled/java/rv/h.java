package rv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.k0;
import ew.l0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000261B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0017J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u0017J?\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00112\b\b\u0002\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u000100¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u000e¢\u0006\u0004\b3\u0010\u0017J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u000200H\u0002¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010AR$\u0010F\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010ER$\u0010H\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010C\u001a\u0004\bG\u0010ER\u0014\u0010L\u001a\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010E¨\u0006O"}, d2 = {"Lrv/h;", BuildConfig.FLAVOR, "Lrv/m;", "call", "Lmv/s;", "eventListener", "Lrv/i;", "finder", "Lsv/d;", "codec", "<init>", "(Lrv/m;Lmv/s;Lrv/i;Lsv/d;)V", "Lmv/f0;", "request", BuildConfig.FLAVOR, "x", "(Lmv/f0;)V", BuildConfig.FLAVOR, "duplex", "Lew/j0;", "e", "(Lmv/f0;Z)Lew/j0;", "h", "()V", "g", "u", "expectContinue", "Lmv/h0$a;", "s", "(Z)Lmv/h0$a;", "Lmv/h0;", Payload.RESPONSE, "t", "(Lmv/h0;)V", "Lmv/i0;", "r", "(Lmv/h0;)Lmv/i0;", "Lew/k0;", "w", "()Lew/k0;", "p", "d", "f", BuildConfig.FLAVOR, "bytesRead", "isSocket", "responseDone", "requestDone", "Ljava/io/IOException;", "b", "(JZZZLjava/io/IOException;)Ljava/io/IOException;", "q", "v", "(Ljava/io/IOException;)V", "a", "Lrv/m;", "i", "()Lrv/m;", "Lmv/s;", "k", "()Lmv/s;", "c", "Lrv/i;", "l", "()Lrv/i;", "Lsv/d;", "value", "Z", "o", "()Z", "isDuplex", "m", "hasFailure", "Lrv/n;", "j", "()Lrv/n;", "connection", "n", "isCoalescedConnection", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mv.s eventListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i finder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sv.d codec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isDuplex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hasFailure;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006\""}, d2 = {"Lrv/h$a;", "Lew/m;", "Lew/j0;", "delegate", BuildConfig.FLAVOR, "contentLength", BuildConfig.FLAVOR, "isSocket", "<init>", "(Lrv/h;Lew/j0;JZ)V", "Ljava/io/IOException;", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lew/e;", Payload.SOURCE, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "close", "b", "J", "c", "Z", "d", "completed", "bytesReceived", "f", "invokeStartEvent", "g", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class a extends ew.m {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long contentLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isSocket;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean completed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long bytesReceived;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean invokeStartEvent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ h f30991h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull h hVar, j0 delegate, long j10, boolean z10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f30991h = hVar;
            this.contentLength = j10;
            this.isSocket = z10;
            this.invokeStartEvent = z10;
        }

        private final IOException a(IOException e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            return h.c(this.f30991h, this.bytesReceived, this.isSocket, false, true, e10, 4, null);
        }

        @Override // ew.m, ew.j0
        public void R2(@NotNull ew.e source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived + byteCount > j10) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
            }
            try {
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f30991h.getEventListener().requestBodyStart(this.f30991h.getCall());
                }
                super.R2(source, byteCount);
                this.bytesReceived += byteCount;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                Intrinsics.checkNotNull(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // ew.m, ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                Intrinsics.checkNotNull(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // ew.m, ew.j0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                Intrinsics.checkNotNull(iOExceptionA);
                throw iOExceptionA;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lrv/h$b;", "Lew/n;", "Lew/l0;", "delegate", BuildConfig.FLAVOR, "contentLength", BuildConfig.FLAVOR, "isSocket", "<init>", "(Lrv/h;Lew/l0;JZ)V", "Lew/e;", "sink", "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", "Ljava/io/IOException;", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "c", "Z", "d", "bytesReceived", "invokeStartEvent", "f", "completed", "g", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b extends ew.n {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long contentLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isSocket;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long bytesReceived;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean invokeStartEvent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean completed;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ h f30997h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull h hVar, l0 delegate, long j10, boolean z10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f30997h = hVar;
            this.contentLength = j10;
            this.isSocket = z10;
            this.invokeStartEvent = true;
            if (j10 == 0) {
                b(null);
            }
        }

        @Nullable
        public final IOException b(@Nullable IOException e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            if (e10 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f30997h.getEventListener().responseBodyStart(this.f30997h.getCall());
            }
            return h.c(this.f30997h, this.bytesReceived, this.isSocket, true, false, e10, 8, null);
        }

        @Override // ew.n, ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                IOException iOExceptionB = b(e10);
                Intrinsics.checkNotNull(iOExceptionB);
                throw iOExceptionB;
            }
        }

        @Override // ew.n, ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long jF3 = getDelegate().f3(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f30997h.getEventListener().responseBodyStart(this.f30997h.getCall());
                }
                if (jF3 == -1) {
                    b(null);
                    return -1L;
                }
                long j10 = this.bytesReceived + jF3;
                long j11 = this.contentLength;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j10);
                }
                this.bytesReceived = j10;
                if (this.f30997h.codec.c()) {
                    b(null);
                }
                return jF3;
            } catch (IOException e10) {
                IOException iOExceptionB = b(e10);
                Intrinsics.checkNotNull(iOExceptionB);
                throw iOExceptionB;
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u000b\u001a\u00060\u0005R\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0011\u001a\u00060\fR\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"rv/h$c", "Lew/k0;", BuildConfig.FLAVOR, "cancel", "()V", "Lrv/h$a;", "Lrv/h;", "a", "Lrv/h$a;", "c", "()Lrv/h$a;", "sink", "Lrv/h$b;", "b", "Lrv/h$b;", "d", "()Lrv/h$b;", Payload.SOURCE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final a sink;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final b source;

        public c() {
            this.sink = new a(h.this, h.this.codec.h().getSink(), -1L, true);
            this.source = new b(h.this, h.this.codec.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String(), -1L, true);
        }

        @Override // ew.k0
        /* JADX INFO: renamed from: c, reason: from getter */
        public a getSink() {
            return this.sink;
        }

        @Override // ew.k0
        public void cancel() {
            h.this.d();
        }

        @Override // ew.k0
        /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
        public b getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String() {
            return this.source;
        }
    }

    public h(@NotNull m call, @NotNull mv.s eventListener, @NotNull i finder, @NotNull sv.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
    }

    public static /* synthetic */ IOException c(h hVar, long j10, boolean z10, boolean z11, boolean z12, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return hVar.b(j10, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, iOException);
    }

    @Nullable
    public final IOException b(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, @Nullable IOException e10) {
        if (e10 != null) {
            v(e10);
        }
        if (requestDone) {
            if (e10 != null) {
                this.eventListener.requestFailed(this.call, e10);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e10 != null) {
                this.eventListener.responseFailed(this.call, e10);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return this.call.y(this, requestDone && !isSocket, responseDone && !isSocket, responseDone && isSocket, requestDone && isSocket, e10);
    }

    public final void d() {
        this.codec.cancel();
    }

    @NotNull
    public final j0 e(@NotNull f0 request, boolean duplex) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = duplex;
        g0 body = request.getBody();
        Intrinsics.checkNotNull(body);
        long jA = body.a();
        this.eventListener.requestBodyStart(this.call);
        return new a(this, this.codec.j(request, jA), jA, false);
    }

    public final void f() {
        this.codec.cancel();
        this.call.y(this, true, true, true, true, null);
    }

    public final void g() {
        try {
            this.codec.b();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            v(e10);
            throw e10;
        }
    }

    public final void h() {
        try {
            this.codec.g();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            v(e10);
            throw e10;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final m getCall() {
        return this.call;
    }

    @NotNull
    public final n j() {
        sv.d.a carrier = this.codec.getCarrier();
        n nVar = carrier instanceof n ? (n) carrier : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final mv.s getEventListener() {
        return this.eventListener;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final i getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean n() {
        return !Intrinsics.c(this.finder.getRoutePlanner().getAddress().getUrl().getHost(), this.codec.getCarrier().getRoute().getAddress().getUrl().getHost());
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void p() {
        this.codec.getCarrier().d();
    }

    public final void q() {
        m.z(this.call, this, true, false, false, false, null, 28, null);
    }

    @NotNull
    public final i0 r(@NotNull h0 response) {
        h hVar;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strN = h0.n(response, "Content-Type", null, 2, null);
            long jF = this.codec.f(response);
            hVar = this;
            try {
                return new sv.h(strN, jF, ew.v.c(new b(hVar, this.codec.d(response), jF, false)));
            } catch (IOException e10) {
                e = e10;
                IOException iOException = e;
                hVar.eventListener.responseFailed(hVar.call, iOException);
                v(iOException);
                throw iOException;
            }
        } catch (IOException e11) {
            e = e11;
            hVar = this;
        }
    }

    @Nullable
    public final h0.a s(boolean expectContinue) {
        try {
            h0.a aVarE = this.codec.e(expectContinue);
            if (aVarE == null) {
                return aVarE;
            }
            aVarE.k(this);
            return aVarE;
        } catch (IOException e10) {
            this.eventListener.responseFailed(this.call, e10);
            v(e10);
            throw e10;
        }
    }

    public final void t(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void u() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final void v(IOException e10) {
        this.hasFailure = true;
        this.codec.getCarrier().g(this.call, e10);
    }

    @NotNull
    public final k0 w() throws SocketException {
        this.call.M();
        sv.d.a carrier = this.codec.getCarrier();
        Intrinsics.d(carrier, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        ((n) carrier).C();
        return new c();
    }

    public final void x(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.a(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            v(e10);
            throw e10;
        }
    }
}
