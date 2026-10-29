package okhttp3.internal.http2;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0015J%\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\r2\u0006\u00102\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b8\u0010\u000fJ-\u0010;\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0011J+\u0010?\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010C\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, m31665d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lxu/f;", "sink", "", "client", "<init>", "(Lxu/f;Z)V", "", "streamId", "", "byteCount", "", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lxu/e;", Payload.SOURCE, "data", "(ZILxu/e;I)V", "flags", "buffer", "dataFrame", "(IILxu/e;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", Payload.TYPE, "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "Lxu/f;", "Z", "hpackBuffer", "Lxu/e;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Http2Writer implements Closeable, Lockable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;

    @NotNull
    private final C12924e hpackBuffer;

    @NotNull
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;

    @NotNull
    private final InterfaceC12926f sink;

    public Http2Writer(@NotNull InterfaceC12926f sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z10;
        C12924e c12924e = new C12924e();
        this.hpackBuffer = c12924e;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, c12924e, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final void applyAndAckSettings(@NotNull Settings peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
                if (peerSettings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            Unit unit = Unit.f29331a;
        }
    }

    public final void connectionPreface() {
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    Logger logger2 = logger;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.mo48106r(), new Object[0]));
                    }
                    this.sink.mo48023d0(Http2.CONNECTION_PREFACE);
                    this.sink.flush();
                    Unit unit = Unit.f29331a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void data(boolean outFinished, int streamId, @Nullable C12924e source, int byteCount) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
            Unit unit = Unit.f29331a;
        }
    }

    public final void dataFrame(int streamId, int flags, @Nullable C12924e buffer, int byteCount) {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            InterfaceC12926f interfaceC12926f = this.sink;
            Intrinsics.checkNotNull(buffer);
            interfaceC12926f.write(buffer, byteCount);
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void frameHeader(int streamId, int length, int type, int flags) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (type != 8) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                i10 = streamId;
                i11 = length;
                i12 = type;
                i13 = flags;
                logger2.fine(Http2.INSTANCE.frameLog(false, i10, i11, i12, i13));
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
        _UtilCommonKt.writeMedium(this.sink, i11);
        this.sink.writeByte(i12 & 255);
        this.sink.writeByte(i13 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i10);
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) {
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
                frameHeader(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(lastGoodStreamId);
                this.sink.writeInt(errorCode.getHttpCode());
                if (!(debugData.length == 0)) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void headers(boolean outFinished, int streamId, @NotNull List<Header> headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.writeHeaders(headerBlock);
                long size = this.hpackBuffer.getSize();
                long jMin = Math.min(this.maxFrameSize, size);
                int i10 = size == jMin ? 4 : 0;
                if (outFinished) {
                    i10 |= 1;
                }
                frameHeader(streamId, (int) jMin, 1, i10);
                this.sink.write(this.hpackBuffer, jMin);
                if (size > jMin) {
                    writeContinuationFrames(streamId, size - jMin);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void ping(boolean ack, int payload1, int payload2) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, ack ? 1 : 0);
            this.sink.writeInt(payload1);
            this.sink.writeInt(payload2);
            this.sink.flush();
            Unit unit = Unit.f29331a;
        }
    }

    public final void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.writeHeaders(requestHeaders);
                long size = this.hpackBuffer.getSize();
                int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
                long j10 = iMin;
                frameHeader(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
                this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
                this.sink.write(this.hpackBuffer, j10);
                if (size > j10) {
                    writeContinuationFrames(streamId, size - j10);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void rstStream(int streamId, @NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            frameHeader(streamId, 4, 3, 0);
            this.sink.writeInt(errorCode.getHttpCode());
            this.sink.flush();
            Unit unit = Unit.f29331a;
        }
    }

    public final void settings(@NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.isSet(i10)) {
                        this.sink.writeShort(i10);
                        this.sink.writeInt(settings.get(i10));
                    }
                }
                this.sink.flush();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void windowUpdate(int streamId, long windowSizeIncrement) {
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
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                    logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i10, 4, j10));
                } else {
                    i10 = streamId;
                    j10 = windowSizeIncrement;
                }
                frameHeader(i10, 4, 8, 0);
                this.sink.writeInt((int) j10);
                this.sink.flush();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
