package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000fJ%\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J%\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J-\u0010;\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010\u000bJ+\u0010?\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u000205H\u0002¢\u0006\u0004\bA\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010E\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010DR\u0016\u0010G\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u0016\u0010H\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010CR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\b3\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Luv/w;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "Lew/f;", "sink", BuildConfig.FLAVOR, "client", "<init>", "(Lew/f;Z)V", BuildConfig.FLAVOR, "b", "()V", "Luv/z;", "peerSettings", "a", "(Luv/z;)V", BuildConfig.FLAVOR, "streamId", "promisedStreamId", BuildConfig.FLAVOR, "Luv/d;", "requestHeaders", "m", "(IILjava/util/List;)V", "flush", "Luv/b;", "errorCode", "n", "(ILuv/b;)V", "h", "()I", "outFinished", "Lew/e;", Payload.SOURCE, "byteCount", "c", "(ZILew/e;I)V", "flags", "buffer", "d", "(IILew/e;I)V", "settings", "o", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", BuildConfig.FLAVOR, "debugData", "f", "(ILuv/b;[B)V", BuildConfig.FLAVOR, "windowSizeIncrement", "p", "(IJ)V", "length", Payload.TYPE, "e", "(IIII)V", "close", "headerBlock", "g", "(ZILjava/util/List;)V", "r", "Lew/f;", "Z", "Lew/e;", "hpackBuffer", "I", "maxFrameSize", "closed", "Luv/e$b;", "Luv/e$b;", "getHpackWriter", "()Luv/e$b;", "hpackWriter", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f34102h = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.f sink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.e hpackBuffer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int maxFrameSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.b hpackWriter;

    public w(@NotNull ew.f sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z10;
        ew.e eVar = new ew.e();
        this.hpackBuffer = eVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new e.b(0, false, eVar, 3, null);
    }

    public final void a(@NotNull z peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.maxFrameSize = peerSettings.e(this.maxFrameSize);
                if (peerSettings.b() != -1) {
                    this.hpackWriter.e(peerSettings.b());
                }
                e(0, 0, 4, 1);
                this.sink.flush();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    Logger logger = f34102h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(nv.q.j(">> CONNECTION " + f.CONNECTION_PREFACE.r(), new Object[0]));
                    }
                    this.sink.z1(f.CONNECTION_PREFACE);
                    this.sink.flush();
                    Unit unit = Unit.f21506a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean outFinished, int streamId, @Nullable ew.e source, int byteCount) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            d(streamId, outFinished ? 1 : 0, source, byteCount);
            Unit unit = Unit.f21506a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            Unit unit = Unit.f21506a;
        }
    }

    public final void d(int streamId, int flags, @Nullable ew.e buffer, int byteCount) {
        e(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            ew.f fVar = this.sink;
            Intrinsics.checkNotNull(buffer);
            fVar.R2(buffer, byteCount);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void e(int streamId, int length, int type, int flags) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (type != 8) {
            Logger logger = f34102h;
            if (logger.isLoggable(Level.FINE)) {
                i10 = streamId;
                i11 = length;
                i12 = type;
                i13 = flags;
                logger.fine(f.f33998a.c(false, i10, i11, i12, i13));
            } else {
                i10 = streamId;
                i11 = length;
                i12 = type;
                i13 = flags;
            }
        } else {
            i10 = streamId;
            i11 = length;
            i12 = type;
            i13 = flags;
        }
        if (i11 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
        nv.n.H(this.sink, i11);
        this.sink.writeByte(i12 & 255);
        this.sink.writeByte(i13 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i10);
    }

    public final void f(int lastGoodStreamId, @NotNull b errorCode, @NotNull byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.getHttpCode() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                e(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(lastGoodStreamId);
                this.sink.writeInt(errorCode.getHttpCode());
                if (!(debugData.length == 0)) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
            Unit unit = Unit.f21506a;
        }
    }

    public final void g(boolean outFinished, int streamId, @NotNull List<d> headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.g(headerBlock);
                long size = this.hpackBuffer.getSize();
                long jMin = Math.min(this.maxFrameSize, size);
                int i10 = size == jMin ? 4 : 0;
                if (outFinished) {
                    i10 |= 1;
                }
                e(streamId, (int) jMin, 1, i10);
                this.sink.R2(this.hpackBuffer, jMin);
                if (size > jMin) {
                    r(streamId, size - jMin);
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void k(boolean ack, int payload1, int payload2) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            e(0, 8, 6, ack ? 1 : 0);
            this.sink.writeInt(payload1);
            this.sink.writeInt(payload2);
            this.sink.flush();
            Unit unit = Unit.f21506a;
        }
    }

    public final void m(int streamId, int promisedStreamId, @NotNull List<d> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.g(requestHeaders);
                long size = this.hpackBuffer.getSize();
                int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
                long j10 = iMin;
                e(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
                this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
                this.sink.R2(this.hpackBuffer, j10);
                if (size > j10) {
                    r(streamId, size - j10);
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(int streamId, @NotNull b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(streamId, 4, 3, 0);
            this.sink.writeInt(errorCode.getHttpCode());
            this.sink.flush();
            Unit unit = Unit.f21506a;
        }
    }

    public final void o(@NotNull z settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                e(0, settings.i() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.f(i10)) {
                        this.sink.writeShort(i10);
                        this.sink.writeInt(settings.a(i10));
                    }
                }
                this.sink.flush();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p(int streamId, long windowSizeIncrement) {
        int i10;
        long j10;
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
                }
                Logger logger = f34102h;
                if (logger.isLoggable(Level.FINE)) {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                    logger.fine(f.f33998a.d(false, i10, 4, j10));
                } else {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                }
                e(i10, 4, 8, 0);
                this.sink.writeInt((int) j10);
                this.sink.flush();
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            e(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.R2(this.hpackBuffer, jMin);
        }
    }
}
