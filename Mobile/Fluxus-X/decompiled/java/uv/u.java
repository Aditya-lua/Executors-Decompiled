package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import ew.l0;
import ew.m0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0003\u000e\u000b'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J/\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0017J/\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0017J/\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0017J/\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\u0017J/\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u0017J/\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.¨\u00060"}, d2 = {"Luv/u;", "Ljava/io/Closeable;", "Lew/g;", Payload.SOURCE, BuildConfig.FLAVOR, "client", "<init>", "(Lew/g;Z)V", "Luv/u$c;", "handler", BuildConfig.FLAVOR, "c", "(Luv/u$c;)V", "requireSettings", "b", "(ZLuv/u$c;)Z", "close", "()V", BuildConfig.FLAVOR, "length", "flags", "streamId", "g", "(Luv/u$c;III)V", "padding", BuildConfig.FLAVOR, "Luv/d;", "f", "(IIII)Ljava/util/List;", "d", "m", "k", "(Luv/u$c;I)V", "o", "p", "n", "h", "e", "r", "a", "Lew/g;", "Z", "Luv/u$b;", "Luv/u$b;", "continuation", "Luv/e$a;", "Luv/e$a;", "hpackReader", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Logger f34068f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.g source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b continuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a hpackReader;

    /* JADX INFO: renamed from: uv.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luv/u$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger a() {
            return u.f34068f;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b$\u0010\u001a¨\u0006'"}, d2 = {"Luv/u$b;", "Lew/l0;", "Lew/g;", Payload.SOURCE, "<init>", "(Lew/g;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", "b", "a", "Lew/g;", BuildConfig.FLAVOR, "I", "getLength", "()I", "e", "(I)V", "length", "c", "getFlags", "flags", "d", "getStreamId", "g", "streamId", "left", "f", "getPadding", "padding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.g source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int flags;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int streamId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int padding;

        public b(@NotNull ew.g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void b() throws IOException {
            int i10 = this.streamId;
            int iA = nv.n.A(this.source);
            this.left = iA;
            this.length = iA;
            int iB = nv.n.b(this.source.readByte(), 255);
            this.flags = nv.n.b(this.source.readByte(), 255);
            Companion companion = u.INSTANCE;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(f.f33998a.c(true, this.streamId, this.length, iB, this.flags));
            }
            int i11 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void c(int i10) {
            this.flags = i10;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void d(int i10) {
            this.left = i10;
        }

        public final void e(int i10) {
            this.length = i10;
        }

        public final void f(int i10) {
            this.padding = i10;
        }

        @Override // ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 != 0) {
                    long jF3 = this.source.f3(sink, Math.min(byteCount, i10));
                    if (jF3 == -1) {
                        return -1L;
                    }
                    this.left -= (int) jF3;
                    return jF3;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final void g(int i10) {
            this.streamId = i10;
        }

        @Override // ew.l0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return this.source.getTimeout();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064À\u0006\u0003"}, d2 = {"Luv/u$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inFinished", BuildConfig.FLAVOR, "streamId", "Lew/g;", Payload.SOURCE, "length", BuildConfig.FLAVOR, "k", "(ZILew/g;I)V", "associatedStreamId", BuildConfig.FLAVOR, "Luv/d;", "headerBlock", "a", "(ZIILjava/util/List;)V", "Luv/b;", "errorCode", "d", "(ILuv/b;)V", "clearPrevious", "Luv/z;", "settings", "i", "(ZLuv/z;)V", "h", "()V", "ack", "payload1", "payload2", "l", "(ZII)V", "lastGoodStreamId", "Lew/h;", "debugData", "j", "(ILuv/b;Lew/h;)V", BuildConfig.FLAVOR, "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "f", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<d> headerBlock);

        void b(int streamId, long windowSizeIncrement);

        void d(int streamId, @NotNull uv.b errorCode);

        void f(int streamId, int promisedStreamId, @NotNull List<d> requestHeaders);

        void h();

        void i(boolean clearPrevious, @NotNull z settings);

        void j(int lastGoodStreamId, @NotNull uv.b errorCode, @NotNull ew.h debugData);

        void k(boolean inFinished, int streamId, @NotNull ew.g source, int length);

        void l(boolean ack, int payload1, int payload2);

        void m(int streamId, int streamDependency, int weight, boolean exclusive);
    }

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f34068f = logger;
    }

    public u(@NotNull ew.g source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z10;
        b bVar = new b(source);
        this.continuation = bVar;
        this.hpackReader = new e.a(bVar, Barcode.FORMAT_AZTEC, 0, 4, null);
    }

    public final boolean b(boolean requireSettings, @NotNull c handler) throws Exception {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.source.w1(9L);
            int iA = nv.n.A(this.source);
            if (iA > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iA);
            }
            int iB = nv.n.b(this.source.readByte(), 255);
            int iB2 = nv.n.b(this.source.readByte(), 255);
            int i10 = this.source.readInt() & Integer.MAX_VALUE;
            if (iB != 8) {
                Logger logger = f34068f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.f33998a.c(true, i10, iA, iB, iB2));
                }
            }
            if (requireSettings && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + f.f33998a.b(iB));
            }
            switch (iB) {
                case 0:
                    d(handler, iA, iB2, i10);
                    return true;
                case 1:
                    g(handler, iA, iB2, i10);
                    return true;
                case 2:
                    m(handler, iA, iB2, i10);
                    return true;
                case 3:
                    o(handler, iA, iB2, i10);
                    return true;
                case 4:
                    p(handler, iA, iB2, i10);
                    return true;
                case 5:
                    n(handler, iA, iB2, i10);
                    return true;
                case 6:
                    h(handler, iA, iB2, i10);
                    return true;
                case 7:
                    e(handler, iA, iB2, i10);
                    return true;
                case 8:
                    r(handler, iA, iB2, i10);
                    return true;
                default:
                    this.source.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(@NotNull c handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ew.g gVar = this.source;
        ew.h hVar = f.CONNECTION_PREFACE;
        ew.h hVarM1 = gVar.M1(hVar.I());
        Logger logger = f34068f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(nv.q.j("<< CONNECTION " + hVarM1.r(), new Object[0]));
        }
        if (Intrinsics.c(hVar, hVarM1)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarM1.P());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final void d(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (flags & 8) != 0 ? nv.n.b(this.source.readByte(), 255) : 0;
        handler.k(z10, streamId, this.source, INSTANCE.b(length, flags, iB));
        this.source.skip(iB);
    }

    public final void e(c handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = length - 8;
        uv.b bVarA = uv.b.INSTANCE.a(i11);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        ew.h hVarM1 = ew.h.f14806e;
        if (i12 > 0) {
            hVarM1 = this.source.M1(i12);
        }
        handler.j(i10, bVarA, hVarM1);
    }

    public final List<d> f(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.d(length);
        b bVar = this.continuation;
        bVar.e(bVar.getLeft());
        this.continuation.f(padding);
        this.continuation.c(flags);
        this.continuation.g(streamId);
        this.hpackReader.k();
        return this.hpackReader.e();
    }

    public final void g(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        int iB = (flags & 8) != 0 ? nv.n.b(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            k(handler, streamId);
            length -= 5;
        }
        handler.a(z10, streamId, -1, f(INSTANCE.b(length, flags, iB), iB, flags, streamId));
    }

    public final void h(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.l((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    public final void k(c handler, int streamId) {
        int i10 = this.source.readInt();
        handler.m(streamId, i10 & Integer.MAX_VALUE, nv.n.b(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    public final void m(c handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            k(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    public final void n(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (flags & 8) != 0 ? nv.n.b(this.source.readByte(), 255) : 0;
        handler.f(streamId, this.source.readInt() & Integer.MAX_VALUE, f(INSTANCE.b(length - 4, flags, iB), iB, flags, streamId));
    }

    public final void o(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        uv.b bVarA = uv.b.INSTANCE.a(i10);
        if (bVarA != null) {
            handler.d(streamId, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    public final void p(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.h();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        z zVar = new z();
        p001kotlin.ranges.a aVarP = p001kotlin.ranges.d.p(p001kotlin.ranges.d.q(0, length), 6);
        int first = aVarP.getFirst();
        int last = aVarP.getLast();
        int step = aVarP.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iC = nv.n.c(this.source.readShort(), 65535);
                int i10 = this.source.readInt();
                if (iC != 2) {
                    if (iC != 4) {
                        if (iC == 5 && (i10 < 16384 || i10 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i10);
                        }
                    } else if (i10 < 0) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                zVar.h(iC, i10);
                if (first != last) {
                    first += step;
                }
            }
        }
        handler.i(false, zVar);
    }

    public final void r(c handler, int length, int flags, int streamId) throws Exception {
        int i10;
        try {
            if (length != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
            }
            try {
                long jD = nv.n.d(this.source.readInt(), 2147483647L);
                if (jD == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f34068f;
                if (logger.isLoggable(Level.FINE)) {
                    i10 = streamId;
                    logger.fine(f.f33998a.d(true, streamId, length, jD));
                } else {
                    i10 = streamId;
                }
                handler.b(i10, jD);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f34068f.fine(f.f33998a.c(true, streamId, length, 8, flags));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
