package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.k0;
import ew.l0;
import ew.m0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import vv.WindowCounter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0004=840B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\u001eH\u0000¢\u0006\u0004\b-\u0010\"J\u0015\u00100\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001eH\u0000¢\u0006\u0004\b2\u0010\"J\u000f\u00103\u001a\u00020\u001eH\u0000¢\u0006\u0004\b3\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R*\u0010G\u001a\u00020.2\u0006\u0010B\u001a\u00020.8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u00101R*\u0010J\u001a\u00020.2\u0006\u0010B\u001a\u00020.8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010C\u001a\u0004\bH\u0010E\"\u0004\bI\u00101R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010LR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u001e\u0010&\u001a\u00060PR\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010SR\u001e\u0010X\u001a\u00060TR\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010U\u001a\u0004\bV\u0010WR\u001e\u0010]\u001a\u00060YR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u0010\\R\u001e\u0010_\u001a\u00060YR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010Z\u001a\u0004\b^\u0010\\R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\b`\u0010b\"\u0004\bc\u0010$R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bd\u0010f\"\u0004\bg\u0010hR\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bi\u0010\u0015R\u0011\u0010l\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bk\u0010\u0015R\u0011\u0010n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bm\u0010\u0015¨\u0006o"}, d2 = {"Luv/v;", BuildConfig.FLAVOR, "Lew/k0;", BuildConfig.FLAVOR, "id", "Luv/o;", "connection", BuildConfig.FLAVOR, "outFinished", "inFinished", "Lmv/y;", "headers", "<init>", "(ILuv/o;ZZLmv/y;)V", "Luv/b;", "errorCode", "Ljava/io/IOException;", "errorException", "h", "(Luv/b;Ljava/io/IOException;)Z", "j", "()Z", "callerIsIdle", "D", "(Z)Lmv/y;", "Lew/m0;", "y", "()Lew/m0;", "F", "rstStatusCode", BuildConfig.FLAVOR, "g", "(Luv/b;Ljava/io/IOException;)V", "cancel", "()V", "i", "(Luv/b;)V", "Lew/g;", Payload.SOURCE, "length", "z", "(Lew/g;I)V", "A", "(Lmv/y;Z)V", "B", "e", BuildConfig.FLAVOR, "delta", "d", "(J)V", "f", "E", "a", "I", "n", "()I", "b", "Luv/o;", "k", "()Luv/o;", "Lvv/a;", "c", "Lvv/a;", "o", "()Lvv/a;", "readBytes", "value", "J", "t", "()J", "C", "writeBytesTotal", "s", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Luv/v$c;", "Luv/v$c;", "r", "()Luv/v$c;", "Luv/v$b;", "Luv/v$b;", "q", "()Luv/v$b;", "sink", "Luv/v$d;", "Luv/v$d;", "p", "()Luv/v$d;", "readTimeout", "u", "writeTimeout", "l", "Luv/b;", "()Luv/b;", "setErrorCode$okhttp", "m", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "w", "isOpen", "v", "isLocallyInitiated", "x", "isSourceComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WindowCounter readBytes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayDeque<mv.y> headersQueue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean hasResponseHeaders;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c source;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b sink;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d readTimeout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d writeTimeout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public uv.b errorCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IOException errorException;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b%\u0010\u0015¨\u0006'"}, d2 = {"Luv/v$b;", "Lew/j0;", BuildConfig.FLAVOR, "finished", "<init>", "(Luv/v;Z)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "Lew/m0;", "t", "()Lew/m0;", "close", "outFinishedOnLastFrame", "a", "(Z)V", "Z", "c", "()Z", "setFinished", "b", "Lew/e;", "sendBuffer", "Lmv/y;", "Lmv/y;", "getTrailers", "()Lmv/y;", "setTrailers", "(Lmv/y;)V", "trailers", "d", "setClosed", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ew.e sendBuffer = new ew.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public mv.y trailers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public b(boolean z10) {
            this.finished = z10;
        }

        @Override // ew.j0
        public void R2(@NotNull ew.e source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            v vVar = v.this;
            if (!nv.q.b || !Thread.holdsLock(vVar)) {
                this.sendBuffer.R2(source, byteCount);
                while (this.sendBuffer.getSize() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
        }

        public final void a(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z10;
            v vVar = v.this;
            synchronized (vVar) {
                try {
                    vVar.getWriteTimeout().s();
                    while (vVar.getWriteBytesTotal() >= vVar.getWriteBytesMaximum() && !this.finished && !this.closed && vVar.l() == null) {
                        try {
                            vVar.E();
                        } catch (Throwable th2) {
                            vVar.getWriteTimeout().A();
                            throw th2;
                        }
                    }
                    vVar.getWriteTimeout().A();
                    vVar.f();
                    jMin = Math.min(vVar.getWriteBytesMaximum() - vVar.getWriteBytesTotal(), this.sendBuffer.getSize());
                    vVar.C(vVar.getWriteBytesTotal() + jMin);
                    z10 = outFinishedOnLastFrame && jMin == this.sendBuffer.getSize();
                    Unit unit = Unit.f21506a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            v.this.getWriteTimeout().s();
            try {
                v.this.getConnection().X0(v.this.getId(), z10, this.sendBuffer, jMin);
            } finally {
                v.this.getWriteTimeout().A();
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            v vVar = v.this;
            if (nv.q.b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            v vVar2 = v.this;
            synchronized (vVar2) {
                if (this.closed) {
                    return;
                }
                boolean z10 = vVar2.l() == null;
                Unit unit = Unit.f21506a;
                if (!v.this.b().finished) {
                    boolean z11 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(false);
                        }
                        o connection = v.this.getConnection();
                        int id2 = v.this.getId();
                        mv.y yVar = this.trailers;
                        Intrinsics.checkNotNull(yVar);
                        connection.Y0(id2, z10, nv.q.r(yVar));
                    } else if (z11) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        v.this.getConnection().X0(v.this.getId(), true, null, 0L);
                    }
                }
                v vVar3 = v.this;
                synchronized (vVar3) {
                    this.closed = true;
                    Intrinsics.d(vVar3, "null cannot be cast to non-null type java.lang.Object");
                    vVar3.notifyAll();
                    Unit unit2 = Unit.f21506a;
                }
                v.this.getConnection().flush();
                v.this.e();
            }
        }

        @Override // ew.j0, java.io.Flushable
        public void flush() throws IOException {
            v vVar = v.this;
            if (nv.q.b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            v vVar2 = v.this;
            synchronized (vVar2) {
                vVar2.f();
                Unit unit = Unit.f21506a;
            }
            while (this.sendBuffer.getSize() > 0) {
                a(false);
                v.this.getConnection().flush();
            }
        }

        @Override // ew.j0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return v.this.getWriteTimeout();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b!\u0010$R$\u0010-\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010/\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e\"\u0004\b.\u0010 ¨\u00060"}, d2 = {"Luv/v$c;", "Lew/l0;", BuildConfig.FLAVOR, "maxByteCount", BuildConfig.FLAVOR, "finished", "<init>", "(Luv/v;JZ)V", "Lew/e;", "sink", "byteCount", "f3", "(Lew/e;J)J", "Lew/g;", Payload.SOURCE, BuildConfig.FLAVOR, "d", "(Lew/g;J)V", "Lew/m0;", "t", "()Lew/m0;", "close", "()V", "read", "g", "(J)V", "a", "J", "b", "Z", "()Z", "e", "(Z)V", "c", "Lew/e;", "getReceiveBuffer", "()Lew/e;", "receiveBuffer", "readBuffer", "Lmv/y;", "Lmv/y;", "getTrailers", "()Lmv/y;", "f", "(Lmv/y;)V", "trailers", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long maxByteCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.e receiveBuffer = new ew.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.e readBuffer = new ew.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public mv.y trailers;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public c(long j10, boolean z10) {
            this.maxByteCount = j10;
            this.finished = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ew.e getReadBuffer() {
            return this.readBuffer;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            v vVar = v.this;
            synchronized (vVar) {
                this.closed = true;
                size = this.readBuffer.getSize();
                this.readBuffer.a();
                Intrinsics.d(vVar, "null cannot be cast to non-null type java.lang.Object");
                vVar.notifyAll();
                Unit unit = Unit.f21506a;
            }
            if (size > 0) {
                g(size);
            }
            v.this.e();
        }

        public final void d(@NotNull ew.g source, long byteCount) throws EOFException {
            boolean z10;
            boolean z11;
            Intrinsics.checkNotNullParameter(source, "source");
            v vVar = v.this;
            if (nv.q.b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (v.this) {
                    z10 = this.finished;
                    z11 = this.readBuffer.getSize() + j10 > this.maxByteCount;
                    Unit unit = Unit.f21506a;
                }
                if (z11) {
                    source.skip(j10);
                    v.this.i(uv.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j10);
                    return;
                }
                long jF3 = source.f3(this.receiveBuffer, j10);
                if (jF3 == -1) {
                    throw new EOFException();
                }
                j10 -= jF3;
                v vVar2 = v.this;
                synchronized (vVar2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.a();
                        } else {
                            boolean z12 = this.readBuffer.getSize() == 0;
                            this.readBuffer.h3(this.receiveBuffer);
                            if (z12) {
                                Intrinsics.d(vVar2, "null cannot be cast to non-null type java.lang.Object");
                                vVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            g(byteCount);
            v.this.getConnection().getFlowControlListener().a(v.this.getId(), v.this.getReadBytes(), this.readBuffer.getSize());
        }

        public final void e(boolean z10) {
            this.finished = z10;
        }

        public final void f(@Nullable mv.y yVar) {
            this.trailers = yVar;
        }

        @Override // ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z10;
            long jF3;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j10 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                v vVar = v.this;
                synchronized (vVar) {
                    boolean zJ = vVar.j();
                    if (zJ) {
                        vVar.getReadTimeout().s();
                    }
                    try {
                        if (vVar.l() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = vVar.getErrorException();
                            if (errorException == null) {
                                uv.b bVarL = vVar.l();
                                Intrinsics.checkNotNull(bVarL);
                                errorException = new a0(bVarL);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.readBuffer.getSize() > j10) {
                            ew.e eVar = this.readBuffer;
                            jF3 = eVar.f3(sink, Math.min(byteCount, eVar.getSize()));
                            WindowCounter.c(vVar.getReadBytes(), jF3, 0L, 2, null);
                            long jA = vVar.getReadBytes().a();
                            if (errorException == null && jA >= vVar.getConnection().getOkHttpSettings().c() / 2) {
                                vVar.getConnection().g1(vVar.getId(), jA);
                                WindowCounter.c(vVar.getReadBytes(), 0L, jA, 1, null);
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                vVar.E();
                                z10 = true;
                            }
                            jF3 = -1;
                        }
                        if (zJ) {
                            vVar.getReadTimeout().A();
                        }
                        Unit unit = Unit.f21506a;
                    } catch (Throwable th2) {
                        if (zJ) {
                            vVar.getReadTimeout().A();
                        }
                        throw th2;
                    }
                    throw th;
                }
                v.this.getConnection().getFlowControlListener().a(v.this.getId(), v.this.getReadBytes(), this.readBuffer.getSize());
                if (!z10) {
                    if (jF3 != -1) {
                        return jF3;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j10 = 0;
            }
        }

        public final void g(long read) {
            v vVar = v.this;
            if (!nv.q.b || !Thread.holdsLock(vVar)) {
                v.this.getConnection().W0(read);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
        }

        @Override // ew.l0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return v.this.getReadTimeout();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Luv/v$d;", "Lew/c;", "<init>", "(Luv/v;)V", BuildConfig.FLAVOR, "z", "()V", "Ljava/io/IOException;", "cause", "v", "(Ljava/io/IOException;)Ljava/io/IOException;", "A", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d extends ew.c {
        public d() {
        }

        public final void A() throws IOException {
            if (t()) {
                throw v(null);
            }
        }

        @Override // ew.c
        @NotNull
        public IOException v(@Nullable IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // ew.c
        public void z() {
            v.this.i(uv.b.CANCEL);
            v.this.getConnection().Q0();
        }
    }

    public v(int i10, @NotNull o connection, boolean z10, boolean z11, @Nullable mv.y yVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.readBytes = new WindowCounter(i10);
        this.writeBytesMaximum = connection.getPeerSettings().c();
        ArrayDeque<mv.y> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(connection.getOkHttpSettings().c(), z11);
        this.sink = new b(z10);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (yVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (v()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(yVar);
        }
    }

    public final void A(@NotNull mv.y headers, boolean inFinished) {
        boolean zW;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (nv.q.b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && headers.a(":status") == null && headers.a(":method") == null) {
                    a().f(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    a().e(true);
                }
                zW = w();
                Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zW) {
            return;
        }
        this.connection.O0(this.id);
    }

    public final void B(@NotNull uv.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (l() == null) {
                    this.errorCode = errorCode;
                    Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(long j10) {
        this.writeBytesTotal = j10;
    }

    @NotNull
    public final mv.y D(boolean callerIsIdle) {
        mv.y yVar;
        synchronized (this) {
            while (this.headersQueue.isEmpty() && l() == null) {
                try {
                    boolean z10 = callerIsIdle || j();
                    if (z10) {
                        this.readTimeout.s();
                    }
                    try {
                        E();
                        if (z10) {
                            this.readTimeout.A();
                        }
                    } catch (Throwable th2) {
                        if (z10) {
                            this.readTimeout.A();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.headersQueue.isEmpty()) {
                IOException iOException = this.errorException;
                if (iOException != null) {
                    throw iOException;
                }
                uv.b bVarL = l();
                Intrinsics.checkNotNull(bVarL);
                throw new a0(bVarL);
            }
            mv.y yVarRemoveFirst = this.headersQueue.removeFirst();
            Intrinsics.checkNotNullExpressionValue(yVarRemoveFirst, "removeFirst(...)");
            yVar = yVarRemoveFirst;
        }
        return yVar;
    }

    public final void E() throws InterruptedIOException {
        try {
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @NotNull
    public final m0 F() {
        return this.writeTimeout;
    }

    @Override // ew.k0
    public void cancel() {
        i(uv.b.CANCEL);
    }

    public final void d(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void e() {
        boolean z10;
        boolean zW;
        if (nv.q.b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !a().getFinished() && a().getClosed() && (b().getFinished() || b().getClosed());
                zW = w();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            g(uv.b.CANCEL, null);
        } else {
            if (zW) {
                return;
            }
            this.connection.O0(this.id);
        }
    }

    public final void f() throws IOException {
        if (b().getClosed()) {
            throw new IOException("stream closed");
        }
        if (b().getFinished()) {
            throw new IOException("stream finished");
        }
        if (l() != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            uv.b bVarL = l();
            Intrinsics.checkNotNull(bVarL);
            throw new a0(bVarL);
        }
    }

    public final void g(@NotNull uv.b rstStatusCode, @Nullable IOException errorException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (h(rstStatusCode, errorException)) {
            this.connection.a1(this.id, rstStatusCode);
        }
    }

    public final boolean h(uv.b errorCode, IOException errorException) {
        if (nv.q.b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (l() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (a().getFinished() && b().getFinished()) {
                return false;
            }
            Unit unit = Unit.f21506a;
            this.connection.O0(this.id);
            return true;
        }
    }

    public final void i(@NotNull uv.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (h(errorCode, null)) {
            this.connection.e1(this.id, errorCode);
        }
    }

    public final boolean j() {
        return !this.connection.getClient() || b().getClosed() || b().getFinished();
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final o getConnection() {
        return this.connection;
    }

    @Nullable
    public final uv.b l() {
        uv.b bVar;
        synchronized (this) {
            bVar = this.errorCode;
        }
        return bVar;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    @Override // ew.k0
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter and merged with bridge method [inline-methods] */
    public b getSink() {
        return this.sink;
    }

    @Override // ew.k0
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter and merged with bridge method [inline-methods] */
    public c getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String() {
        return this.source;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean v() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final boolean w() {
        synchronized (this) {
            try {
                if (l() != null) {
                    return false;
                }
                if (a().getFinished() || a().getClosed()) {
                    if ((b().getFinished() || b().getClosed()) && this.hasResponseHeaders) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x() {
        boolean z10;
        synchronized (this) {
            z10 = a().getFinished() && a().getReadBuffer().c2();
        }
        return z10;
    }

    @NotNull
    public final m0 y() {
        return this.readTimeout;
    }

    public final void z(@NotNull ew.g source, int length) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!nv.q.b || !Thread.holdsLock(this)) {
            a().d(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
