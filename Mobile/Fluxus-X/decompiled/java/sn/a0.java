package sn;

import android.content.Context;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000202058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00106R\u0014\u0010:\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u00109R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010;¨\u0006="}, d2 = {"Lsn/a0;", "Lsn/i;", "Landroid/content/Context;", "context", "Lyn/a;", "cameraStatsManager", "Ler/c;", "sdkFilesManager", "Lsn/t;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lsn/z;", "cameraXBinder", BuildConfig.FLAVOR, "isAudioRequired", "<init>", "(Landroid/content/Context;Lyn/a;Ler/c;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)V", BuildConfig.FLAVOR, "j", "()V", "destroy", "enable", "a", "(Z)V", "d", "Lzt/n;", "Ljava/io/File;", "g", "(Leu/b;)Ljava/lang/Object;", "i", "k", "enableAnalyzer", "e", "Landroid/content/Context;", "b", "Lyn/a;", "c", "Ler/c;", "Lsn/t;", "Landroidx/camera/view/PreviewView;", "n", "()Landroidx/camera/view/PreviewView;", "f", "Lsn/z;", "Z", "h", "isBound", "recordingStarted", "Ldv/c0;", "Lsn/y;", "Ldv/c0;", "_previewState", "Ldv/p0;", "()Ldv/p0;", "cameraState", "Lsn/v;", "()Lsn/v;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t cameraPreview;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PreviewView previewView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z cameraXBinder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isBound;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public volatile boolean recordingStarted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public dv.c0<y> _previewState;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lsn/a0$a;", BuildConfig.FLAVOR, "Lsn/t;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lsn/z;", "cameraXBinder", BuildConfig.FLAVOR, "isAudioRequired", "Lsn/a0;", "a", "(Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        a0 a(@NotNull t cameraPreview, @NotNull PreviewView previewView, @NotNull z cameraXBinder, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sn/a0$b", "Landroidx/lifecycle/e0;", "Landroidx/camera/view/PreviewView$e;", "value", BuildConfig.FLAVOR, "b", "(Landroidx/camera/view/PreviewView$e;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements androidx.p000lifecycle.e0<PreviewView.e> {
        public b() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PreviewView.e value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value == PreviewView.e.STREAMING) {
                a0.this._previewState.setValue(new y.Ready(true));
                a0.this.c().getPreviewStreamState().n(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"sn/a0$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", BuildConfig.FLAVOR, "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v8) {
            Intrinsics.checkNotNullParameter(v8, "v");
            a0.this.cameraStatsManager.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v8) {
            Intrinsics.checkNotNullParameter(v8, "v");
            a0.this.cameraStatsManager.c();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {113}, m = "stopVideo-IoAF18A")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f31543t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31545v;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31543t = obj;
            this.f31545v |= Integer.MIN_VALUE;
            Object objK = a0.this.k(this);
            return objK == fu.c.e() ? objK : zt.n.a(objK);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {97}, m = "takePicture-IoAF18A")
    public static final class e extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f31546t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31548v;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31546t = obj;
            this.f31548v |= Integer.MIN_VALUE;
            Object objG = a0.this.g(this);
            return objG == fu.c.e() ? objG : zt.n.a(objG);
        }
    }

    public a0(@NotNull Context context, @NotNull yn.a cameraStatsManager, @NotNull er.c sdkFilesManager, @NotNull t cameraPreview, @NotNull PreviewView previewView, @NotNull z cameraXBinder, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraXBinder, "cameraXBinder");
        this.context = context;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = cameraXBinder;
        this.isAudioRequired = z10;
        this._previewState = dv.r0.a(y.c.f31747a);
    }

    @Override // sn.i
    public void a(boolean enable) {
        this.cameraPreview.c(enable);
    }

    @Override // sn.i
    @NotNull
    public dv.p0<y> b() {
        return this._previewState;
    }

    @Override // sn.i
    public void d() {
        this.cameraPreview.d(c());
    }

    @Override // sn.i
    public void destroy() {
    }

    @Override // sn.i
    public void e(boolean enableAnalyzer) {
    }

    @Override // sn.i
    @NotNull
    public v f() {
        return this.cameraPreview.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn.i
    @Nullable
    public Object g(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f31548v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f31548v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f31546t;
        Object objE = fu.c.e();
        int i11 = eVar.f31548v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return ((zt.n) obj).getValue();
        }
        zt.o.b(obj);
        t tVar = this.cameraPreview;
        er.c cVar = this.sdkFilesManager;
        eVar.f31548v = 1;
        Object objM = tVar.m(cVar, eVar);
        return objM == objE ? objE : objM;
    }

    @Override // sn.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingStarted;
    }

    @Override // sn.i
    @Nullable
    public Object i(@NotNull eu.b<? super zt.n<Boolean>> bVar) {
        if (this.recordingStarted) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(gu.b.a(false));
        }
        try {
            boolean zK = this.cameraPreview.k(this.context, this.isAudioRequired);
            if (zK) {
                this.recordingStarted = true;
            }
            zt.n.Companion companion2 = zt.n.INSTANCE;
            return zt.n.b(gu.b.a(zK));
        } catch (p0 e10) {
            zt.n.Companion companion3 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(e10));
        }
    }

    @Override // sn.i
    public void j() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(y.d.f31748a);
        this.isBound = true;
        this.cameraXBinder.a();
        c().getPreviewStreamState().j(new b());
        if (c().isAttachedToWindow()) {
            this.cameraStatsManager.d();
        }
        c().addOnAttachStateChangeListener(new c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn.i
    @Nullable
    public Object k(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f31545v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f31545v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f31543t;
        Object objE = fu.c.e();
        int i11 = dVar.f31545v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return ((zt.n) obj).getValue();
        }
        zt.o.b(obj);
        if (!this.recordingStarted) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(new t0()));
        }
        this.recordingStarted = false;
        t tVar = this.cameraPreview;
        dVar.f31545v = 1;
        Object objL = tVar.l(dVar);
        return objL == objE ? objE : objL;
    }

    @Override // sn.i
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
    public PreviewView getPreviewView() {
        return this.previewView;
    }
}
