package com.withpersona.sdk2.camera;

import android.content.Context;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.p000lifecycle.e0;
import fn.d0;
import fn.h0;
import fn.s;
import java.io.File;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import nu.p0;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000202058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u00106R\u0014\u0010:\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00109R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010;¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/camera/e;", "Lfn/g;", "Landroid/content/Context;", "context", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lfn/s;", "cameraXBinder", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)V", "", "h", "()V", "destroy", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "a", "Landroid/content/Context;", "b", "Lln/a;", "Lqq/c;", "d", "Lcom/withpersona/sdk2/camera/b;", "Landroidx/camera/view/PreviewView;", "n", "()Landroidx/camera/view/PreviewView;", "Lfn/s;", "g", "Z", "isBound", "recordingStarted", "Lnu/c0;", "Lcom/withpersona/sdk2/camera/d;", "Lnu/c0;", "_previewState", "Lnu/p0;", "()Lnu/p0;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements fn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PreviewView previewView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s cameraXBinder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isBound;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public volatile boolean recordingStarted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c0<com.withpersona.sdk2.camera.d> _previewState;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/camera/e$a;", "", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lfn/s;", "cameraXBinder", "", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e;", "a", "(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        e a(@NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull PreviewView previewView, @NotNull s cameraXBinder, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/e$b", "Landroidx/lifecycle/e0;", "Landroidx/camera/view/PreviewView$e;", "value", "", "b", "(Landroidx/camera/view/PreviewView$e;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements e0<PreviewView.e> {
        public b() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PreviewView.e value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value == PreviewView.e.STREAMING) {
                e.this._previewState.setValue(new com.withpersona.sdk2.camera.d.Ready(true));
                e.this.d().getPreviewStreamState().n(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/withpersona/sdk2/camera/e$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            e.this.cameraStatsManager.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            e.this.cameraStatsManager.c();
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {113}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9955t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9957v;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9955t = obj;
            this.f9957v |= Integer.MIN_VALUE;
            Object objI = e.this.i(this);
            return objI == ot.c.e() ? objI : n.a(objI);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$e, reason: collision with other inner class name */
    @pt.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {97}, m = "takePicture-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0163e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9958t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9960v;

        public C0163e(nt.b<? super C0163e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9958t = obj;
            this.f9960v |= Integer.MIN_VALUE;
            Object objK = e.this.k(this);
            return objK == ot.c.e() ? objK : n.a(objK);
        }
    }

    public e(@NotNull Context context, @NotNull ln.a cameraStatsManager, @NotNull qq.c sdkFilesManager, @NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull PreviewView previewView, @NotNull s cameraXBinder, boolean z10) {
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
        this._previewState = r0.a(com.withpersona.sdk2.camera.d.c.f9941a);
    }

    @Override // fn.g
    @NotNull
    public CameraProperties a() {
        return this.cameraPreview.e();
    }

    @Override // fn.g
    @NotNull
    public p0<com.withpersona.sdk2.camera.d> b() {
        return this._previewState;
    }

    @Override // fn.g
    public void c(boolean enable) {
        this.cameraPreview.c(enable);
    }

    @Override // fn.g
    public void destroy() {
    }

    @Override // fn.g
    public void e() {
        this.cameraPreview.d(d());
    }

    @Override // fn.g
    public void f(boolean enableAnalyzer) {
    }

    @Override // fn.g
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingStarted;
    }

    @Override // fn.g
    public void h() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(com.withpersona.sdk2.camera.d.C0162d.f9942a);
        this.isBound = true;
        this.cameraXBinder.a();
        d().getPreviewStreamState().j(new b());
        if (d().isAttachedToWindow()) {
            this.cameraStatsManager.d();
        }
        d().addOnAttachStateChangeListener(new c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.g
    @Nullable
    public Object i(@NotNull nt.b<? super n<? extends File>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f9957v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f9957v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f9955t;
        Object objE = ot.c.e();
        int i11 = dVar.f9957v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ((n) obj).getValue();
        }
        o.b(obj);
        if (!this.recordingStarted) {
            n.Companion companion = n.INSTANCE;
            return n.b(o.a(new h0()));
        }
        this.recordingStarted = false;
        com.withpersona.sdk2.camera.b bVar2 = this.cameraPreview;
        dVar.f9957v = 1;
        Object objL = bVar2.l(dVar);
        return objL == objE ? objE : objL;
    }

    @Override // fn.g
    @Nullable
    public Object j(@NotNull nt.b<? super n<Boolean>> bVar) {
        if (this.recordingStarted) {
            n.Companion companion = n.INSTANCE;
            return n.b(pt.b.a(false));
        }
        try {
            boolean zK = this.cameraPreview.k(this.context, this.isAudioRequired);
            if (zK) {
                this.recordingStarted = true;
            }
            n.Companion companion2 = n.INSTANCE;
            return n.b(pt.b.a(zK));
        } catch (d0 e10) {
            n.Companion companion3 = n.INSTANCE;
            return n.b(o.a(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.g
    @Nullable
    public Object k(@NotNull nt.b<? super n<? extends File>> bVar) {
        C0163e c0163e;
        if (bVar instanceof C0163e) {
            c0163e = (C0163e) bVar;
            int i10 = c0163e.f9960v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0163e.f9960v = i10 - Integer.MIN_VALUE;
            } else {
                c0163e = new C0163e(bVar);
            }
        } else {
            c0163e = new C0163e(bVar);
        }
        Object obj = c0163e.f9958t;
        Object objE = ot.c.e();
        int i11 = c0163e.f9960v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ((n) obj).getValue();
        }
        o.b(obj);
        com.withpersona.sdk2.camera.b bVar2 = this.cameraPreview;
        qq.c cVar = this.sdkFilesManager;
        c0163e.f9960v = 1;
        Object objM = bVar2.m(cVar, c0163e);
        return objM == objE ? objE : objM;
    }

    @Override // fn.g
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
    public PreviewView getPreviewView() {
        return this.previewView;
    }
}
