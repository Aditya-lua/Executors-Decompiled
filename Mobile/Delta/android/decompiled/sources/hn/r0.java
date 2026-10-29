package hn;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import fn.AudioConfiguration;
import fn.w0;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u0011\u0010>\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b5\u0010=¨\u0006?"}, d2 = {"Lhn/r0;", "", "Landroid/content/Context;", "context", "Lhn/h0;", "cameraChoice", "", "fps", "orientationHint", "", "recordAudio", "<init>", "(Landroid/content/Context;Lhn/h0;IIZ)V", "", "p", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "q", "h", "m", "()V", "isInitialPrepare", "n", "(Z)V", "l", "j", "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "k", "()Landroid/media/MediaRecorder;", "a", "Landroid/content/Context;", "b", "Lhn/h0;", "c", "I", "d", "e", "Z", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getOnSurfaceChanged", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "onSurfaceChanged", "Landroid/view/Surface;", "g", "Landroid/view/Surface;", "_surface", "Ljava/io/File;", "currentFile", "i", "Landroid/media/MediaRecorder;", "mediaRecorder", "isPrepared", "isDestroyed", "Luu/a;", "Luu/a;", "mutex", "()Landroid/view/Surface;", "surface", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f19454n = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int fps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int orientationHint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean recordAudio;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onSurfaceChanged;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Surface _surface;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public File currentFile;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MediaRecorder mediaRecorder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isPrepared;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isDestroyed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper", f = "MediaRecorderWrapper.kt", l = {212}, m = "destroy")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19466t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f19467u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f19468v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f19470x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19468v = obj;
            this.f19470x |= Integer.MIN_VALUE;
            return r0.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", f = "MediaRecorderWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19471t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return r0.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ot.c.e();
            if (this.f19471t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            try {
                r0.this.mediaRecorder.start();
            } catch (IllegalStateException unused) {
                r0.this.mediaRecorder.reset();
                r0.this.l(false);
                r0.this.mediaRecorder.start();
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Ljava/io/File;", "<anonymous>", "(Lku/p0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", f = "MediaRecorderWrapper.kt", l = {212}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<ku.p0, nt.b<? super File>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19473t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f19474u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19475v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19476w;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return r0.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            uu.a aVar;
            r0 r0Var;
            File file;
            Object objE = ot.c.e();
            int i10 = this.f19476w;
            if (i10 == 0) {
                jt.o.b(obj);
                aVar = r0.this.mutex;
                r0 r0Var2 = r0.this;
                this.f19473t = aVar;
                this.f19474u = r0Var2;
                this.f19475v = 0;
                this.f19476w = 1;
                if (aVar.f(null, this) == objE) {
                    return objE;
                }
                r0Var = r0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (r0) this.f19474u;
                aVar = (uu.a) this.f19473t;
                jt.o.b(obj);
            }
            try {
                if (r0Var.isDestroyed) {
                    aVar.e(null);
                    return null;
                }
                try {
                    r0Var.mediaRecorder.stop();
                    file = r0Var.currentFile;
                } catch (RuntimeException unused) {
                    r0Var.currentFile.delete();
                    file = null;
                }
                r0Var.mediaRecorder.release();
                if (r0Var.isDestroyed) {
                    aVar.e(null);
                    return file;
                }
                r0Var.mediaRecorder = r0Var.k();
                r0Var.l(false);
                aVar.e(null);
                return file;
            } catch (Throwable th2) {
                aVar.e(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super File> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public r0(@NotNull Context context, @NotNull h0 cameraChoice, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i10;
        this.orientationHint = i11;
        this.recordAudio = z10;
        this._surface = f19454n ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = j();
        this.mediaRecorder = k();
        this.mutex = uu.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h(@NotNull nt.b<? super Unit> bVar) {
        b bVar2;
        uu.a aVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f19470x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f19470x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f19468v;
        Object objE = ot.c.e();
        int i11 = bVar2.f19470x;
        if (i11 == 0) {
            jt.o.b(obj);
            if (this.isDestroyed) {
                return Unit.f22483a;
            }
            uu.a aVar2 = this.mutex;
            bVar2.f19466t = aVar2;
            bVar2.f19467u = 0;
            bVar2.f19470x = 1;
            if (aVar2.f(null, bVar2) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) bVar2.f19466t;
            jt.o.b(obj);
        }
        try {
            if (this.isDestroyed) {
                Unit unit = Unit.f22483a;
                aVar.e(null);
                return unit;
            }
            this.isDestroyed = true;
            Unit unit2 = Unit.f22483a;
            aVar.e(null);
            try {
                i().release();
            } catch (RuntimeException unused) {
            }
            try {
                this.mediaRecorder.stop();
            } catch (RuntimeException unused2) {
            } finally {
                this.currentFile.delete();
            }
            return Unit.f22483a;
        } catch (Throwable th2) {
            aVar.e(null);
            throw th2;
        }
    }

    @NotNull
    public final Surface i() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface2, "getSurface(...)");
        return surface2;
    }

    public final File j() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    public final MediaRecorder k() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        q0.a();
        return p0.a(this.context);
    }

    public final void l(boolean isInitialPrepare) throws IOException {
        if (!isInitialPrepare) {
            this.currentFile = j();
        }
        n(isInitialPrepare);
    }

    public final void m() {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        l(true);
    }

    public final void n(boolean isInitialPrepare) throws IOException {
        Function0<Unit> function0;
        this.mediaRecorder.setVideoSource(2);
        if (this.recordAudio) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(w0.a(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight()));
        if (this.recordAudio) {
            AudioConfiguration audioConfigurationA = fn.d.a();
            if (audioConfigurationA != null) {
                this.mediaRecorder.setAudioSamplingRate(audioConfigurationA.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z10 = f19454n;
        if (z10) {
            this.mediaRecorder.setInputSurface(i());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z10 || isInitialPrepare || (function0 = this.onSurfaceChanged) == null) {
            return;
        }
        function0.invoke();
    }

    public final void o(@Nullable Function0<Unit> function0) {
        this.onSurfaceChanged = function0;
    }

    @Nullable
    public final Object p(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(g1.a(), new c(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    @Nullable
    public final Object q(@NotNull nt.b<? super File> bVar) {
        return ku.i.g(g1.a(), new d(null), bVar);
    }
}
