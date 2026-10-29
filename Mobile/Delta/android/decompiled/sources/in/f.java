package in;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.mlkit.vision.barcode.common.Barcode;
import fn.AudioConfiguration;
import fn.w0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001A\u0018\u0000 \u001e2\u00020\u0001:\u000515463B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J'\u0010$\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010B¨\u0006D"}, d2 = {"Lin/f;", "", "", "width", "height", "fps", "orientationHint", "", "recordAudio", "Lqq/c;", "sdkFilesManager", "<init>", "(IIIIZLqq/c;)V", "Ljt/n;", "", "o", "()Ljava/lang/Object;", "Lin/f$e;", "s", "()Lin/f$e;", "i", "()V", "Landroid/media/Image;", "image", "l", "(Landroid/media/Image;)V", "Landroid/media/MediaFormat;", "format", "k", "(Landroid/media/MediaFormat;)V", "j", "track", "Ljava/nio/ByteBuffer;", "data", "Landroid/media/MediaCodec$BufferInfo;", "info", "u", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "deleteOutput", "Ljava/io/File;", "n", "(Z)Ljava/io/File;", "Landroid/media/MediaCodec;", "activeCodec", "inputIndex", "m", "(Landroid/media/MediaCodec;I)V", "t", "(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "a", "I", "b", "c", "d", "e", "Z", "f", "Lqq/c;", "g", "Ljava/lang/Object;", "lock", "Lin/f$d;", "h", "Lin/f$d;", "currentRecordingSession", "in/f$f", "Lin/f$f;", "codecCallback", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int fps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int orientationHint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean recordAudio;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d currentRecordingSession;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C0367f codecCallback;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lin/f$b;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String message, @NotNull Exception e10) {
            super(message, e10);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, d2 = {"Lin/f$c;", "", "", "track", "", "data", "", "presentationTimeUs", "flags", "<init>", "(I[BJI)V", "a", "I", "d", "()I", "b", "[B", "()[B", "c", "J", "()J", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int track;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final byte[] data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long presentationTimeUs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int flags;

        public c(int i10, @NotNull byte[] data, long j10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.track = i10;
            this.data = data;
            this.presentationTimeUs = j10;
            this.flags = i11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTrack() {
            return this.track;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lin/f$e;", "", "Ljava/io/File;", "file", "", "videoError", "audioError", "<init>", "(Ljava/io/File;Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "a", "Ljava/io/File;", "b", "()Ljava/io/File;", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final File file;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Throwable videoError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Throwable audioError;

        public e(@Nullable File file, @Nullable Throwable th2, @Nullable Throwable th3) {
            this.file = file;
            this.videoError = th2;
            this.audioError = th3;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getAudioError() {
            return this.audioError;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Throwable getVideoError() {
            return this.videoError;
        }
    }

    /* JADX INFO: renamed from: in.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"in/f$f", "Landroid/media/MediaCodec$Callback;", "Landroid/media/MediaCodec;", "codec", "Landroid/media/MediaCodec$CodecException;", "e", "", "onError", "(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V", "mediaCodec", "", "index", "onInputBufferAvailable", "(Landroid/media/MediaCodec;I)V", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "onOutputBufferAvailable", "(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V", "Landroid/media/MediaFormat;", "format", "onOutputFormatChanged", "(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0367f extends MediaCodec.Callback {
        public C0367f() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec codec, MediaCodec.CodecException e10) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            Intrinsics.checkNotNullParameter(e10, "e");
            Object obj = f.this.lock;
            f fVar = f.this;
            synchronized (obj) {
                d dVar = fVar.currentRecordingSession;
                if (dVar == null) {
                    return;
                }
                if (dVar.getVideoCodec() != codec) {
                    return;
                }
                dVar.t("MediaCodec errored.", e10);
                Unit unit = Unit.f22483a;
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int index) {
            Intrinsics.checkNotNullParameter(mediaCodec, "mediaCodec");
            Object obj = f.this.lock;
            f fVar = f.this;
            synchronized (obj) {
                try {
                    d dVar = fVar.currentRecordingSession;
                    if (dVar == null) {
                        return;
                    }
                    if (mediaCodec == dVar.getVideoCodec() && !dVar.getEndOfStreamQueued()) {
                        if (dVar.getStopCalled()) {
                            fVar.m(mediaCodec, index);
                        } else {
                            dVar.i().addLast(Integer.valueOf(index));
                        }
                        Unit unit = Unit.f22483a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec codec, int index, MediaCodec.BufferInfo bufferInfo) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
            Object obj = f.this.lock;
            f fVar = f.this;
            synchronized (obj) {
                try {
                    d dVar = fVar.currentRecordingSession;
                    if (dVar == null) {
                        return;
                    }
                    MediaCodec videoCodec = dVar.getVideoCodec();
                    if (videoCodec != codec) {
                        return;
                    }
                    try {
                        boolean z10 = (bufferInfo.flags & 2) == 0;
                        if (bufferInfo.size > 0 && z10) {
                            ByteBuffer outputBuffer = videoCodec.getOutputBuffer(index);
                            if (outputBuffer == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            fVar.u(dVar.getVideoTrack(), outputBuffer, bufferInfo);
                        }
                        videoCodec.releaseOutputBuffer(index, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            dVar.getEndOfStreamLatch().countDown();
                        }
                    } catch (Exception e10) {
                        dVar.t("onOutputBufferAvailable", e10);
                    }
                    Unit unit = Unit.f22483a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            Intrinsics.checkNotNullParameter(format, "format");
            Object obj = f.this.lock;
            f fVar = f.this;
            synchronized (obj) {
                try {
                    d dVar = fVar.currentRecordingSession;
                    if (dVar == null) {
                        return;
                    }
                    if (dVar.getVideoCodec() != codec) {
                        return;
                    }
                    try {
                        if (dVar.getVideoTrack() != -1) {
                            throw new IllegalStateException("Video encoder output format changed more than once.");
                        }
                        dVar.B(dVar.getMuxer().addTrack(format));
                        fVar.j();
                        Unit unit = Unit.f22483a;
                    } catch (Exception e10) {
                        dVar.t("Error setting up video track", e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, @NotNull qq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.width = i10;
        this.height = i11;
        this.fps = i12;
        this.orientationHint = i13;
        this.recordAudio = z10;
        this.sdkFilesManager = sdkFilesManager;
        this.lock = new Object();
        this.codecCallback = new C0367f();
    }

    public static final Unit p(f fVar, MediaFormat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.k(it);
        return Unit.f22483a;
    }

    public static final Unit q(f fVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        fVar.t(byteBuffer, bufferInfo);
        return Unit.f22483a;
    }

    public static final Unit r(f fVar, CountDownLatch countDownLatch) {
        synchronized (fVar.lock) {
            countDownLatch.countDown();
        }
        return Unit.f22483a;
    }

    public final void i() {
        synchronized (this.lock) {
            n(true);
            Unit unit = Unit.f22483a;
        }
    }

    public final void j() {
        synchronized (this.lock) {
            try {
                d dVar = this.currentRecordingSession;
                if (dVar == null) {
                    return;
                }
                MediaMuxer muxer = dVar.getMuxer();
                if (!dVar.getMuxerStarted() && dVar.getVideoTrack() != -1 && (dVar.getAudioEncoder() == null || dVar.getAudioTrack() != -1)) {
                    muxer.start();
                    dVar.z(true);
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    for (c cVar : dVar.p()) {
                        bufferInfo.set(0, cVar.getData().length, cVar.getPresentationTimeUs(), cVar.getFlags());
                        muxer.writeSampleData(cVar.getTrack(), ByteBuffer.wrap(cVar.getData()), bufferInfo);
                        if (cVar.getTrack() == dVar.getVideoTrack()) {
                            dVar.x(true);
                        }
                    }
                    dVar.p().clear();
                    Unit unit = Unit.f22483a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(MediaFormat format) {
        synchronized (this.lock) {
            try {
                d dVar = this.currentRecordingSession;
                if (dVar != null) {
                    MediaMuxer muxer = dVar.getMuxer();
                    try {
                        if (dVar.getAudioTrack() != -1) {
                            throw new IllegalStateException("Audio encoder output format changed more than once.");
                        }
                        dVar.u(muxer.addTrack(format));
                        j();
                    } catch (Exception e10) {
                        dVar.t("Error setting up audio track.", e10);
                    }
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        synchronized (this.lock) {
            d dVar = this.currentRecordingSession;
            if (dVar == null) {
                return;
            }
            MediaCodec videoCodec = dVar.getVideoCodec();
            if (!dVar.g() && !dVar.getEndOfStreamQueued()) {
                if (image.getFormat() == 35 && image.getWidth() == this.width && image.getHeight() == this.height) {
                    Integer numP = dVar.i().p();
                    if (numP == null) {
                        return;
                    }
                    int iIntValue = numP.intValue();
                    try {
                        Image inputImage = videoCodec.getInputImage(iIntValue);
                        if (inputImage == null) {
                            videoCodec.queueInputBuffer(iIntValue, 0, 0, 0L, 0);
                            return;
                        }
                        g.f20583a.d(image, inputImage);
                        Long lValueOf = Long.valueOf(image.getTimestamp());
                        if (lValueOf.longValue() <= 0) {
                            lValueOf = null;
                        }
                        long jLongValue = lValueOf != null ? lValueOf.longValue() : System.nanoTime();
                        if (dVar.getFirstTimestampNs() == Long.MIN_VALUE) {
                            dVar.w(jLongValue);
                        }
                        dVar.y(kotlin.ranges.d.d(kotlin.ranges.d.d((jLongValue - dVar.getFirstTimestampNs()) / ((long) 1000), 0L), dVar.getLastPresentationTimeUs() + 1));
                        videoCodec.queueInputBuffer(iIntValue, 0, ((this.width * this.height) * 3) / 2, dVar.getLastPresentationTimeUs(), 0);
                        Unit unit = Unit.f22483a;
                    } catch (Exception e10) {
                        dVar.t("Error processing image", e10);
                    }
                }
            }
        }
    }

    public final void m(MediaCodec activeCodec, int inputIndex) {
        synchronized (this.lock) {
            d dVar = this.currentRecordingSession;
            if (dVar == null) {
                return;
            }
            try {
                activeCodec.queueInputBuffer(inputIndex, 0, 0, kotlin.ranges.d.d(dVar.getLastPresentationTimeUs() + 1, 0L), 4);
                dVar.v(true);
            } catch (Exception e10) {
                dVar.t("Failed to queue end-of-stream input buffer.", e10);
            }
            Unit unit = Unit.f22483a;
        }
    }

    public final File n(boolean deleteOutput) {
        Object objB;
        synchronized (this.lock) {
            try {
                d dVar = this.currentRecordingSession;
                File file = null;
                if (dVar == null) {
                    return null;
                }
                this.currentRecordingSession = null;
                File outputFile = dVar.getOutputFile();
                MediaCodec videoCodec = dVar.getVideoCodec();
                MediaMuxer muxer = dVar.getMuxer();
                try {
                    n.Companion companion = n.INSTANCE;
                    videoCodec.stop();
                    n.b(Unit.f22483a);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    n.b(o.a(th2));
                }
                try {
                    videoCodec.release();
                    n.b(Unit.f22483a);
                } catch (Throwable th3) {
                    n.Companion companion3 = n.INSTANCE;
                    n.b(o.a(th3));
                }
                try {
                    muxer.stop();
                    objB = n.b(Unit.f22483a);
                } catch (Throwable th4) {
                    n.Companion companion4 = n.INSTANCE;
                    objB = n.b(o.a(th4));
                }
                boolean zH = n.h(objB);
                try {
                    muxer.release();
                    n.b(Unit.f22483a);
                } catch (Throwable th5) {
                    n.Companion companion5 = n.INSTANCE;
                    n.b(o.a(th5));
                }
                dVar.getCodecThread().quitSafely();
                in.b audioEncoder = dVar.getAudioEncoder();
                if (audioEncoder != null) {
                    audioEncoder.e();
                }
                while (dVar.getEndOfStreamLatch().getCount() > 0) {
                    dVar.getEndOfStreamLatch().countDown();
                }
                if (deleteOutput || !zH) {
                    outputFile.delete();
                } else {
                    file = outputFile;
                }
                return file;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, android.media.MediaMuxer] */
    @NotNull
    public final Object o() {
        in.b bVar;
        boolean z10;
        Unit unit;
        in.b bVar2;
        synchronized (this.lock) {
            if (this.currentRecordingSession != null) {
                n.Companion companion = n.INSTANCE;
                return n.b(Unit.f22483a);
            }
            if (this.width % 2 == 0 && this.height % 2 == 0) {
                File fileE = this.sdkFilesManager.e("mp4");
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
                Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "createEncoderByType(...)");
                HandlerThread handlerThread = new HandlerThread("ImageReaderVideoRecorder");
                handlerThread.start();
                AudioConfiguration audioConfigurationA = fn.d.a();
                final CountDownLatch countDownLatch = new CountDownLatch(2);
                if (!this.recordAudio || audioConfigurationA == null) {
                    countDownLatch.countDown();
                    bVar = null;
                } else {
                    try {
                        bVar2 = new in.b(audioConfigurationA, new Function1() { // from class: in.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f.p(this.f20549a, (MediaFormat) obj);
                            }
                        }, new Function2() { // from class: in.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f.q(this.f20550a, (ByteBuffer) obj, (MediaCodec.BufferInfo) obj2);
                            }
                        }, new Function0() { // from class: in.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return f.r(this.f20551a, countDownLatch);
                            }
                        });
                    } catch (Exception unused) {
                        countDownLatch.countDown();
                        bVar2 = null;
                    }
                    bVar = bVar2;
                }
                c0 c0Var = new c0();
                try {
                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.width, this.height);
                    mediaFormatCreateVideoFormat.setInteger("color-format", 2135033992);
                    mediaFormatCreateVideoFormat.setInteger("bitrate", w0.a(this.width, this.height));
                    mediaFormatCreateVideoFormat.setInteger("frame-rate", this.fps);
                    mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                    Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "apply(...)");
                    mediaCodecCreateEncoderByType.setCallback(this.codecCallback, new Handler(handlerThread.getLooper()));
                    mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    ?? mediaMuxer = new MediaMuxer(fileE.getAbsolutePath(), 0);
                    mediaMuxer.setOrientationHint(this.orientationHint);
                    c0Var.f22552a = mediaMuxer;
                    mediaCodecCreateEncoderByType.start();
                    if (bVar != null) {
                        bVar.h();
                    }
                    try {
                        z10 = true;
                        try {
                            this.currentRecordingSession = new d(fileE, mediaCodecCreateEncoderByType, bVar, (MediaMuxer) c0Var.f22552a, handlerThread, countDownLatch, null, false, false, null, 0L, 0L, 0, 0, false, null, false, 131008, null);
                            n.Companion companion2 = n.INSTANCE;
                            return n.b(Unit.f22483a);
                        } catch (Exception e10) {
                            e = e10;
                            Exception exc = e;
                            n(z10);
                            if (bVar != null) {
                                bVar.e();
                            }
                            try {
                                n.Companion companion3 = n.INSTANCE;
                                mediaCodecCreateEncoderByType.release();
                                n.b(Unit.f22483a);
                            } catch (Throwable th2) {
                                n.Companion companion4 = n.INSTANCE;
                                n.b(o.a(th2));
                            }
                            handlerThread.quitSafely();
                            fileE.delete();
                            try {
                                MediaMuxer mediaMuxer2 = (MediaMuxer) c0Var.f22552a;
                                if (mediaMuxer2 != null) {
                                    mediaMuxer2.release();
                                    unit = Unit.f22483a;
                                } else {
                                    unit = null;
                                }
                                n.b(unit);
                                throw exc;
                            } catch (Throwable th3) {
                                n.Companion companion5 = n.INSTANCE;
                                n.b(o.a(th3));
                                throw exc;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    z10 = true;
                }
            }
            n.Companion companion6 = n.INSTANCE;
            return n.b(o.a(new RuntimeException("YUV video dimensions must be even, but were " + this.width + "x" + this.height + ".")));
        }
    }

    @Nullable
    public final e s() throws InterruptedException {
        Integer numP;
        synchronized (this.lock) {
            try {
                d dVar = this.currentRecordingSession;
                if (dVar == null) {
                    return null;
                }
                MediaCodec videoCodec = dVar.getVideoCodec();
                CountDownLatch endOfStreamLatch = dVar.getEndOfStreamLatch();
                boolean z10 = true;
                dVar.A(true);
                in.b audioEncoder = dVar.getAudioEncoder();
                if (audioEncoder != null) {
                    audioEncoder.g();
                }
                if (!dVar.g() && !dVar.getEndOfStreamQueued() && (numP = dVar.i().p()) != null) {
                    m(videoCodec, numP.intValue());
                }
                Unit unit = Unit.f22483a;
                endOfStreamLatch.await(2000L, TimeUnit.MILLISECONDS);
                synchronized (this.lock) {
                    try {
                        d dVar2 = this.currentRecordingSession;
                        if (dVar2 == null) {
                            return null;
                        }
                        Throwable error = dVar2.getError();
                        in.b audioEncoder2 = dVar2.getAudioEncoder();
                        Throwable error2 = audioEncoder2 != null ? audioEncoder2.getError() : null;
                        if (dVar2.getHasEncodedFrame() && dVar2.getMuxerStarted() && !dVar2.g()) {
                            z10 = false;
                        }
                        return new e(n(z10), error, error2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void t(ByteBuffer data, MediaCodec.BufferInfo info) {
        synchronized (this.lock) {
            d dVar = this.currentRecordingSession;
            if (dVar == null) {
                return;
            }
            try {
                u(dVar.getAudioTrack(), data, info);
            } catch (Exception e10) {
                dVar.t("Error writing audio data to track", e10);
            }
            Unit unit = Unit.f22483a;
        }
    }

    public final void u(int track, ByteBuffer data, MediaCodec.BufferInfo info) {
        synchronized (this.lock) {
            d dVar = this.currentRecordingSession;
            if (dVar == null) {
                return;
            }
            MediaMuxer muxer = dVar.getMuxer();
            if (track < 0) {
                return;
            }
            if (dVar.getMuxerStarted()) {
                muxer.writeSampleData(track, data, info);
                if (track == dVar.getVideoTrack()) {
                    dVar.x(true);
                }
                return;
            }
            int iO = dVar.o();
            int i10 = info.size;
            if (iO + i10 > 3145728) {
                dVar.t("muxer failed to start before sample buffer saturated", new RuntimeException());
                return;
            }
            byte[] bArr = new byte[i10];
            data.get(bArr);
            dVar.p().add(new c(track, bArr, info.presentationTimeUs, info.flags));
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b<\b\u0002\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J!\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\n\u0010&\u001a\u00060$j\u0002`%¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b2\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b5\u0010=R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010C\u001a\u0004\b&\u0010E\"\u0004\bH\u0010GR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\b;\u0010K\"\u0004\bL\u0010MR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bB\u0010P\"\u0004\bQ\u0010RR\"\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010O\u001a\u0004\bN\u0010P\"\u0004\bS\u0010RR\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010U\u001a\u0004\b.\u0010W\"\u0004\bZ\u0010YR\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010C\u001a\u0004\bT\u0010E\"\u0004\b\\\u0010GR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010_R\"\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010C\u001a\u0004\bI\u0010E\"\u0004\b`\u0010GR\u0011\u0010a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b>\u0010ER\u0011\u0010b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b[\u0010W¨\u0006c"}, d2 = {"Lin/f$d;", "", "Ljava/io/File;", "outputFile", "Landroid/media/MediaCodec;", "videoCodec", "Lin/b;", "audioEncoder", "Landroid/media/MediaMuxer;", "muxer", "Landroid/os/HandlerThread;", "codecThread", "Ljava/util/concurrent/CountDownLatch;", "endOfStreamLatch", "Lkotlin/collections/i;", "", "freeInputBuffers", "", "stopCalled", "endOfStreamQueued", "", "error", "", "firstTimestampNs", "lastPresentationTimeUs", "videoTrack", "audioTrack", "muxerStarted", "", "Lin/f$c;", "pendingSamples", "hasEncodedFrame", "<init>", "(Ljava/io/File;Landroid/media/MediaCodec;Lin/b;Landroid/media/MediaMuxer;Landroid/os/HandlerThread;Ljava/util/concurrent/CountDownLatch;Lkotlin/collections/i;ZZLjava/lang/Throwable;JJIIZLjava/util/List;Z)V", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "t", "(Ljava/lang/String;Ljava/lang/Exception;)V", "a", "Ljava/io/File;", "n", "()Ljava/io/File;", "b", "Landroid/media/MediaCodec;", "r", "()Landroid/media/MediaCodec;", "c", "Lin/b;", "()Lin/b;", "d", "Landroid/media/MediaMuxer;", "l", "()Landroid/media/MediaMuxer;", "Landroid/os/HandlerThread;", "()Landroid/os/HandlerThread;", "f", "Ljava/util/concurrent/CountDownLatch;", "()Ljava/util/concurrent/CountDownLatch;", "g", "Lkotlin/collections/i;", "i", "()Lkotlin/collections/i;", "h", "Z", "q", "()Z", "A", "(Z)V", "v", "j", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "k", "J", "()J", "w", "(J)V", "y", "m", "I", "s", "()I", "B", "(I)V", "u", "o", "z", "p", "Ljava/util/List;", "()Ljava/util/List;", "x", "failed", "pendingSampleBytes", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final File outputFile;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final MediaCodec videoCodec;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final in.b audioEncoder;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MediaMuxer muxer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final HandlerThread codecThread;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CountDownLatch endOfStreamLatch;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final i<Integer> freeInputBuffers;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public boolean stopCalled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public boolean endOfStreamQueued;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Throwable error;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public long firstTimestampNs;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public long lastPresentationTimeUs;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public int videoTrack;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public int audioTrack;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public boolean muxerStarted;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<c> pendingSamples;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public boolean hasEncodedFrame;

        public d(@NotNull File outputFile, @NotNull MediaCodec videoCodec, @Nullable in.b bVar, @NotNull MediaMuxer muxer, @NotNull HandlerThread codecThread, @NotNull CountDownLatch endOfStreamLatch, @NotNull i<Integer> freeInputBuffers, boolean z10, boolean z11, @Nullable Throwable th2, long j10, long j11, int i10, int i11, boolean z12, @NotNull List<c> pendingSamples, boolean z13) {
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            Intrinsics.checkNotNullParameter(videoCodec, "videoCodec");
            Intrinsics.checkNotNullParameter(muxer, "muxer");
            Intrinsics.checkNotNullParameter(codecThread, "codecThread");
            Intrinsics.checkNotNullParameter(endOfStreamLatch, "endOfStreamLatch");
            Intrinsics.checkNotNullParameter(freeInputBuffers, "freeInputBuffers");
            Intrinsics.checkNotNullParameter(pendingSamples, "pendingSamples");
            this.outputFile = outputFile;
            this.videoCodec = videoCodec;
            this.audioEncoder = bVar;
            this.muxer = muxer;
            this.codecThread = codecThread;
            this.endOfStreamLatch = endOfStreamLatch;
            this.freeInputBuffers = freeInputBuffers;
            this.stopCalled = z10;
            this.endOfStreamQueued = z11;
            this.error = th2;
            this.firstTimestampNs = j10;
            this.lastPresentationTimeUs = j11;
            this.videoTrack = i10;
            this.audioTrack = i11;
            this.muxerStarted = z12;
            this.pendingSamples = pendingSamples;
            this.hasEncodedFrame = z13;
        }

        public final void A(boolean z10) {
            this.stopCalled = z10;
        }

        public final void B(int i10) {
            this.videoTrack = i10;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final in.b getAudioEncoder() {
            return this.audioEncoder;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getAudioTrack() {
            return this.audioTrack;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final HandlerThread getCodecThread() {
            return this.codecThread;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CountDownLatch getEndOfStreamLatch() {
            return this.endOfStreamLatch;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getEndOfStreamQueued() {
            return this.endOfStreamQueued;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final boolean g() {
            return this.error != null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getFirstTimestampNs() {
            return this.firstTimestampNs;
        }

        @NotNull
        public final i<Integer> i() {
            return this.freeInputBuffers;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getHasEncodedFrame() {
            return this.hasEncodedFrame;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getLastPresentationTimeUs() {
            return this.lastPresentationTimeUs;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final MediaMuxer getMuxer() {
            return this.muxer;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getMuxerStarted() {
            return this.muxerStarted;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final File getOutputFile() {
            return this.outputFile;
        }

        public final int o() {
            Iterator<T> it = this.pendingSamples.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((c) it.next()).getData().length;
            }
            return length;
        }

        @NotNull
        public final List<c> p() {
            return this.pendingSamples;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getStopCalled() {
            return this.stopCalled;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final MediaCodec getVideoCodec() {
            return this.videoCodec;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final int getVideoTrack() {
            return this.videoTrack;
        }

        public final void t(@NotNull String message, @NotNull Exception e10) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(e10, "e");
            this.error = new b(message, e10);
            in.b bVar = this.audioEncoder;
            if (bVar != null) {
                bVar.g();
            }
        }

        public final void u(int i10) {
            this.audioTrack = i10;
        }

        public final void v(boolean z10) {
            this.endOfStreamQueued = z10;
        }

        public final void w(long j10) {
            this.firstTimestampNs = j10;
        }

        public final void x(boolean z10) {
            this.hasEncodedFrame = z10;
        }

        public final void y(long j10) {
            this.lastPresentationTimeUs = j10;
        }

        public final void z(boolean z10) {
            this.muxerStarted = z10;
        }

        public /* synthetic */ d(File file, MediaCodec mediaCodec, in.b bVar, MediaMuxer mediaMuxer, HandlerThread handlerThread, CountDownLatch countDownLatch, i iVar, boolean z10, boolean z11, Throwable th2, long j10, long j11, int i10, int i11, boolean z12, List list, boolean z13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, mediaCodec, bVar, mediaMuxer, handlerThread, countDownLatch, (i12 & 64) != 0 ? new i() : iVar, (i12 & 128) != 0 ? false : z10, (i12 & Barcode.FORMAT_QR_CODE) != 0 ? false : z11, (i12 & Barcode.FORMAT_UPC_A) != 0 ? null : th2, (i12 & Barcode.FORMAT_UPC_E) != 0 ? Long.MIN_VALUE : j10, (i12 & Barcode.FORMAT_PDF417) != 0 ? Long.MIN_VALUE : j11, (i12 & Barcode.FORMAT_AZTEC) != 0 ? -1 : i10, (i12 & 8192) != 0 ? -1 : i11, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (32768 & i12) != 0 ? new ArrayList() : list, (i12 & 65536) != 0 ? false : z13);
        }
    }
}
