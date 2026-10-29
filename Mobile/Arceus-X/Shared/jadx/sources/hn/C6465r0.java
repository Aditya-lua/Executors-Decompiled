package hn;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AudioConfiguration;
import p132fn.C5677d;
import p132fn.C5716w0;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hn.r0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u0011\u0010>\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b5\u0010=¨\u0006?"}, m31665d2 = {"Lhn/r0;", "", "Landroid/content/Context;", "context", "Lhn/h0;", "cameraChoice", "", "fps", "orientationHint", "", "recordAudio", "<init>", "(Landroid/content/Context;Lhn/h0;IIZ)V", "", "p", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "q", "h", "m", "()V", "isInitialPrepare", "n", "(Z)V", "l", "j", "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "k", "()Landroid/media/MediaRecorder;", "a", "Landroid/content/Context;", "b", "Lhn/h0;", "c", "I", "d", "e", "Z", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getOnSurfaceChanged", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "onSurfaceChanged", "Landroid/view/Surface;", "g", "Landroid/view/Surface;", "_surface", "Ljava/io/File;", "currentFile", "i", "Landroid/media/MediaRecorder;", "mediaRecorder", "isPrepared", "isDestroyed", "Luu/a;", "Luu/a;", "mutex", "()Landroid/view/Surface;", "surface", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6465r0 {

    /* JADX INFO: renamed from: n */
    public static final boolean f24501n = true;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6445h0 cameraChoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int fps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int orientationHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean recordAudio;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onSurfaceChanged;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Surface _surface;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public File currentFile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public MediaRecorder mediaRecorder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isPrepared;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isDestroyed;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    /* JADX INFO: renamed from: hn.r0$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper", m39664f = "MediaRecorderWrapper.kt", m39665l = {212}, m39666m = "destroy")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f24514t;

        /* JADX INFO: renamed from: u */
        public int f24515u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f24516v;

        /* JADX INFO: renamed from: x */
        public int f24518x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24516v = obj;
            this.f24518x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C6465r0.this.m28124h(this);
        }
    }

    /* JADX INFO: renamed from: hn.r0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", m39664f = "MediaRecorderWrapper.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24519t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6465r0.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws IOException {
            C10047c.m38805e();
            if (this.f24519t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                C6465r0.this.mediaRecorder.start();
            } catch (IllegalStateException unused) {
                C6465r0.this.mediaRecorder.reset();
                C6465r0.this.m28128l(false);
                C6465r0.this.mediaRecorder.start();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.r0$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Ljava/io/File;", "<anonymous>", "(Lku/p0;)Ljava/io/File;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", m39664f = "MediaRecorderWrapper.kt", m39665l = {212}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super File>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f24521t;

        /* JADX INFO: renamed from: u */
        public Object f24522u;

        /* JADX INFO: renamed from: v */
        public int f24523v;

        /* JADX INFO: renamed from: w */
        public int f24524w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6465r0.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            C6465r0 c6465r0;
            File file;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24524w;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = C6465r0.this.mutex;
                C6465r0 c6465r1 = C6465r0.this;
                this.f24521t = interfaceC11970a;
                this.f24522u = c6465r1;
                this.f24523v = 0;
                this.f24524w = 1;
                if (interfaceC11970a.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                c6465r0 = c6465r1;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6465r0 = (C6465r0) this.f24522u;
                interfaceC11970a = (InterfaceC11970a) this.f24521t;
                C7348o.m30470b(obj);
            }
            try {
                if (c6465r0.isDestroyed) {
                    interfaceC11970a.mo44673e(null);
                    return null;
                }
                try {
                    c6465r0.mediaRecorder.stop();
                    file = c6465r0.currentFile;
                } catch (RuntimeException unused) {
                    c6465r0.currentFile.delete();
                    file = null;
                }
                c6465r0.mediaRecorder.release();
                if (c6465r0.isDestroyed) {
                    interfaceC11970a.mo44673e(null);
                    return file;
                }
                c6465r0.mediaRecorder = c6465r0.m28127k();
                c6465r0.m28128l(false);
                interfaceC11970a.mo44673e(null);
                return file;
            } catch (Throwable th2) {
                interfaceC11970a.mo44673e(null);
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super File> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C6465r0(@NotNull Context context, @NotNull C6445h0 cameraChoice, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i10;
        this.orientationHint = i11;
        this.recordAudio = z10;
        this._surface = f24501n ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = m28126j();
        this.mediaRecorder = m28127k();
        this.mutex = C11976g.m44697b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m28124h(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        b bVar;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f24518x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f24518x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f24516v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f24518x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (this.isDestroyed) {
                return Unit.f29331a;
            }
            InterfaceC11970a interfaceC11970a2 = this.mutex;
            bVar.f24514t = interfaceC11970a2;
            bVar.f24515u = 0;
            bVar.f24518x = 1;
            if (interfaceC11970a2.mo44674f(null, bVar) == objM38805e) {
                return objM38805e;
            }
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) bVar.f24514t;
            C7348o.m30470b(obj);
        }
        try {
            if (this.isDestroyed) {
                Unit unit = Unit.f29331a;
                interfaceC11970a.mo44673e(null);
                return unit;
            }
            this.isDestroyed = true;
            Unit unit2 = Unit.f29331a;
            interfaceC11970a.mo44673e(null);
            try {
                m28125i().release();
            } catch (RuntimeException unused) {
            }
            try {
                this.mediaRecorder.stop();
            } catch (RuntimeException unused2) {
            } finally {
                this.currentFile.delete();
            }
            return Unit.f29331a;
        } catch (Throwable th2) {
            interfaceC11970a.mo44673e(null);
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Surface m28125i() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface2, "getSurface(...)");
        return surface2;
    }

    /* JADX INFO: renamed from: j */
    public final File m28126j() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    /* JADX INFO: renamed from: k */
    public final MediaRecorder m28127k() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        C6463q0.m28116a();
        return C6461p0.m28115a(this.context);
    }

    /* JADX INFO: renamed from: l */
    public final void m28128l(boolean isInitialPrepare) throws IOException {
        if (!isInitialPrepare) {
            this.currentFile = m28126j();
        }
        m28130n(isInitialPrepare);
    }

    /* JADX INFO: renamed from: m */
    public final void m28129m() {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        m28128l(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m28130n(boolean isInitialPrepare) throws IOException {
        Function0<Unit> function0;
        this.mediaRecorder.setVideoSource(2);
        if (this.recordAudio) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(C5716w0.m25892a(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight()));
        if (this.recordAudio) {
            AudioConfiguration audioConfigurationM25784a = C5677d.m25784a();
            if (audioConfigurationM25784a != null) {
                this.mediaRecorder.setAudioSamplingRate(audioConfigurationM25784a.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z10 = f24501n;
        if (z10) {
            this.mediaRecorder.setInputSurface(m28125i());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z10 || isInitialPrepare || (function0 = this.onSurfaceChanged) == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: o */
    public final void m28131o(@Nullable Function0<Unit> function0) {
        this.onSurfaceChanged = function0;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m28132p(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(C7864g1.m32643a(), new c(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m28133q(@NotNull InterfaceC9557b<? super File> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32643a(), new d(null), interfaceC9557b);
    }
}
