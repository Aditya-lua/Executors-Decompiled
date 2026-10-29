package in;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AudioConfiguration;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: in.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u0000 32\u00020\u0001:\u0003\u001c\u0015\u001aBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0016\u0010,\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R(\u00102\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101¨\u00064"}, m31665d2 = {"Lin/b;", "", "Lfn/c;", "audioConfiguration", "Lkotlin/Function1;", "Landroid/media/MediaFormat;", "", "onAudioOutputFormatChanged", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Landroid/media/MediaCodec$BufferInfo;", "onAudioDataReceived", "Lkotlin/Function0;", "onComplete", "<init>", "(Lfn/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "h", "()V", "g", "e", "f", "b", "bufferInfo", "", "timeoutUs", "", "c", "(Landroid/media/MediaCodec$BufferInfo;J)Z", "a", "Lfn/c;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "d", "Lkotlin/jvm/functions/Function0;", "Landroid/media/AudioRecord;", "Landroid/media/AudioRecord;", "audioRecord", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "audioCodec", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "thread", "Z", "stopRequested", "", "value", "i", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "j", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6834b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AudioConfiguration audioConfiguration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<MediaFormat, Unit> onAudioOutputFormatChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<ByteBuffer, MediaCodec.BufferInfo, Unit> onAudioDataReceived;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onComplete;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SuppressLint({"MissingPermission"})
    @NotNull
    public final AudioRecord audioRecord;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MediaCodec audioCodec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Thread thread;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile boolean stopRequested;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public volatile Throwable error;

    /* JADX INFO: renamed from: in.b$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lin/b$b;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "code", "<init>", "(I)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends RuntimeException {
        public b(int i10) {
            super("Read audio failed with error code " + i10 + ".");
        }
    }

    /* JADX INFO: renamed from: in.b$c */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lin/b$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String message, @NotNull Exception e10) {
            super(message, e10);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super java.nio.ByteBuffer, ? super android.media.MediaCodec$BufferInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super android.media.MediaFormat, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6834b(@NotNull AudioConfiguration audioConfiguration, @NotNull Function1<? super MediaFormat, Unit> onAudioOutputFormatChanged, @NotNull Function2<? super ByteBuffer, ? super MediaCodec.BufferInfo, Unit> onAudioDataReceived, @NotNull Function0<Unit> onComplete) throws Exception {
        Intrinsics.checkNotNullParameter(audioConfiguration, "audioConfiguration");
        Intrinsics.checkNotNullParameter(onAudioOutputFormatChanged, "onAudioOutputFormatChanged");
        Intrinsics.checkNotNullParameter(onAudioDataReceived, "onAudioDataReceived");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.audioConfiguration = audioConfiguration;
        this.onAudioOutputFormatChanged = onAudioOutputFormatChanged;
        this.onAudioDataReceived = onAudioDataReceived;
        this.onComplete = onComplete;
        AudioRecord audioRecord = new AudioRecord(1, audioConfiguration.getSampleRateInHz(), audioConfiguration.getChannelConfig(), audioConfiguration.getAudioFormat(), audioConfiguration.getMinBufferSizeInBytes() * 2);
        if (audioRecord.getState() != 1) {
            audioRecord.release();
            throw new IllegalStateException("AudioRecord failed to initialize.");
        }
        this.audioRecord = audioRecord;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", audioConfiguration.getSampleRateInHz(), 1);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("bitrate", 96000);
            Intrinsics.checkNotNullExpressionValue(mediaFormatCreateAudioFormat, "apply(...)");
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "also(...)");
            this.audioCodec = mediaCodecCreateEncoderByType;
            this.thread = new Thread(new Runnable() { // from class: in.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26812a.m29236b();
                }
            }, "ImageReaderAudioRecorder");
        } catch (Exception e10) {
            this.audioRecord.release();
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                mediaCodecCreateEncoderByType.release();
                C7347n.m30460b(Unit.f29331a);
                throw e10;
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                C7347n.m30460b(C7348o.m30469a(th2));
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m29236b() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int minBufferSizeInBytes = this.audioConfiguration.getMinBufferSizeInBytes();
        boolean z10 = false;
        int i10 = 0;
        long bytesPerFrame = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                try {
                    long j10 = 10000;
                    if (z10) {
                        i10++;
                        if (i10 <= 100) {
                            break;
                        } else {
                            break;
                        }
                    }
                    boolean z11 = this.stopRequested;
                    int iDequeueInputBuffer = this.audioCodec.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = this.audioCodec.getInputBuffer(iDequeueInputBuffer);
                        if (inputBuffer == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        inputBuffer.clear();
                        int i11 = z11 ? 0 : this.audioRecord.read(inputBuffer, Math.min(inputBuffer.remaining(), minBufferSizeInBytes));
                        long sampleRateInHz = (1000000 * bytesPerFrame) / ((long) this.audioConfiguration.getSampleRateInHz());
                        if (i11 < 0 || z11) {
                            int i12 = i11;
                            this.audioCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, sampleRateInHz, 4);
                            if (!z11) {
                                this.error = new b(i12);
                            }
                            z10 = true;
                        } else {
                            bytesPerFrame += (long) (i11 / this.audioConfiguration.getBytesPerFrame());
                            this.audioCodec.queueInputBuffer(iDequeueInputBuffer, 0, i11, sampleRateInHz, 0);
                        }
                    }
                    if (!z10) {
                        j10 = 0;
                    }
                    if (m29237c(bufferInfo, j10)) {
                        break;
                    }
                } catch (InterruptedException unused) {
                    m29240f();
                    this.onComplete.invoke();
                    return;
                } catch (Exception e10) {
                    this.error = new c("Unexpected error in encode loop.", e10);
                    m29240f();
                    this.onComplete.invoke();
                    return;
                }
            } catch (Throwable th2) {
                m29240f();
                this.onComplete.invoke();
                throw th2;
            }
        }
        m29240f();
        this.onComplete.invoke();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29237c(MediaCodec.BufferInfo bufferInfo, long timeoutUs) {
        while (true) {
            int iDequeueOutputBuffer = this.audioCodec.dequeueOutputBuffer(bufferInfo, timeoutUs);
            if (iDequeueOutputBuffer == -1) {
                return false;
            }
            if (iDequeueOutputBuffer == -2) {
                Function1<MediaFormat, Unit> function1 = this.onAudioOutputFormatChanged;
                MediaFormat outputFormat = this.audioCodec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                function1.invoke(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                continue;
            } else {
                boolean z10 = (bufferInfo.flags & 2) == 0;
                if (bufferInfo.size > 0 && z10) {
                    ByteBuffer outputBuffer = this.audioCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    this.onAudioDataReceived.invoke(outputBuffer, bufferInfo);
                }
                this.audioCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return true;
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: e */
    public final void m29239e() {
        this.thread.interrupt();
        m29240f();
    }

    /* JADX INFO: renamed from: f */
    public final void m29240f() {
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            this.audioRecord.stop();
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th2));
        }
        try {
            this.audioRecord.release();
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th3));
        }
        try {
            this.audioCodec.stop();
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th4) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th4));
        }
        try {
            this.audioCodec.release();
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th5) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th5));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m29241g() {
        this.stopRequested = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m29242h() {
        this.audioCodec.start();
        this.audioRecord.startRecording();
        this.thread.start();
    }
}
