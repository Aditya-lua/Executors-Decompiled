package com.withpersona.sdk2.camera;

import android.content.Context;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.InterfaceC0952e0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5678d0;
import p132fn.C5686h0;
import p132fn.InterfaceC5683g;
import p132fn.InterfaceC5707s;
import p229jt.C7347n;
import p229jt.C7348o;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000202058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u00106R\u0014\u0010:\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00109R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010;¨\u0006="}, m31665d2 = {"Lcom/withpersona/sdk2/camera/e;", "Lfn/g;", "Landroid/content/Context;", "context", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lfn/s;", "cameraXBinder", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)V", "", "h", "()V", "destroy", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "a", "Landroid/content/Context;", "b", "Lln/a;", "Lqq/c;", "d", "Lcom/withpersona/sdk2/camera/b;", "Landroidx/camera/view/PreviewView;", "n", "()Landroidx/camera/view/PreviewView;", "Lfn/s;", "g", "Z", "isBound", "recordingStarted", "Lnu/c0;", "Lcom/withpersona/sdk2/camera/d;", "Lnu/c0;", "_previewState", "Lnu/p0;", "()Lnu/p0;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3405e implements InterfaceC5683g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final PreviewView previewView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5707s cameraXBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isBound;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public volatile boolean recordingStarted;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public InterfaceC9566c0<InterfaceC3404d> _previewState;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$a */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/e$a;", "", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lfn/s;", "cameraXBinder", "", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e;", "a", "(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3405e mo16229a(@NotNull C3402b cameraPreview, @NotNull PreviewView previewView, @NotNull InterfaceC5707s cameraXBinder, boolean isAudioRequired);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/withpersona/sdk2/camera/e$b", "Landroidx/lifecycle/e0;", "Landroidx/camera/view/PreviewView$e;", "value", "", "b", "(Landroidx/camera/view/PreviewView$e;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0952e0<PreviewView.EnumC0503e> {
        public b() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(PreviewView.EnumC0503e value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value == PreviewView.EnumC0503e.STREAMING) {
                C3405e.this._previewState.setValue(new InterfaceC3404d.Ready(true));
                C3405e.this.mo16220d().getPreviewStreamState().mo4862n(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"com/withpersona/sdk2/camera/e$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            C3405e.this.cameraStatsManager.mo33444d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            C3405e.this.cameraStatsManager.mo33443c();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraXController", m39664f = "CameraXController.kt", m39665l = {113}, m39666m = "stopVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f12946t;

        /* JADX INFO: renamed from: v */
        public int f12948v;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12946t = obj;
            this.f12948v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo16225i = C3405e.this.mo16225i(this);
            return objMo16225i == C10047c.m38805e() ? objMo16225i : C7347n.m30459a(objMo16225i);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.e$e */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraXController", m39664f = "CameraXController.kt", m39665l = {97}, m39666m = "takePicture-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f12949t;

        /* JADX INFO: renamed from: v */
        public int f12951v;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12949t = obj;
            this.f12951v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo16227k = C3405e.this.mo16227k(this);
            return objMo16227k == C10047c.m38805e() ? objMo16227k : C7347n.m30459a(objMo16227k);
        }
    }

    public C3405e(@NotNull Context context, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C10700c sdkFilesManager, @NotNull C3402b cameraPreview, @NotNull PreviewView previewView, @NotNull InterfaceC5707s cameraXBinder, boolean z10) {
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
        this._previewState = C9596r0.m37859a(InterfaceC3404d.c.f12931a);
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: a */
    public CameraProperties mo16217a() {
        return this.cameraPreview.m16200e();
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC9592p0<InterfaceC3404d> mo16218b() {
        return this._previewState;
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: c */
    public void mo16219c(boolean enable) {
        this.cameraPreview.m16198c(enable);
    }

    @Override // p132fn.InterfaceC5683g
    public void destroy() {
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: e */
    public void mo16221e() {
        this.cameraPreview.m16199d(mo16220d());
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: f */
    public void mo16222f(boolean enableAnalyzer) {
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingStarted;
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: h */
    public void mo16224h() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(InterfaceC3404d.d.f12932a);
        this.isBound = true;
        this.cameraXBinder.mo17506a();
        mo16220d().getPreviewStreamState().m4858j(new b());
        if (mo16220d().isAttachedToWindow()) {
            this.cameraStatsManager.mo33444d();
        }
        mo16220d().addOnAttachStateChangeListener(new c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo16225i(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f12948v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f12948v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f12946t;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f12948v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C7347n) obj).getValue();
        }
        C7348o.m30470b(obj);
        if (!this.recordingStarted) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C5686h0()));
        }
        this.recordingStarted = false;
        C3402b c3402b = this.cameraPreview;
        dVar.f12948v = 1;
        Object objM16204l = c3402b.m16204l(dVar);
        return objM16204l == objM38805e ? objM38805e : objM16204l;
    }

    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo16226j(@NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        if (this.recordingStarted) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C10340b.m39658a(false));
        }
        try {
            boolean zM16203k = this.cameraPreview.m16203k(this.context, this.isAudioRequired);
            if (zM16203k) {
                this.recordingStarted = true;
            }
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C10340b.m39658a(zM16203k));
        } catch (C5678d0 e10) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo16227k(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        e eVar;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f12951v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f12951v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object obj = eVar.f12949t;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f12951v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C7347n) obj).getValue();
        }
        C7348o.m30470b(obj);
        C3402b c3402b = this.cameraPreview;
        C10700c c10700c = this.sdkFilesManager;
        eVar.f12951v = 1;
        Object objM16205m = c3402b.m16205m(c10700c, eVar);
        return objM16205m == objM38805e ? objM38805e : objM16205m;
    }

    /* JADX DEBUG: Method merged with bridge method: d()Landroid/view/View; */
    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
    public PreviewView getPreviewView() {
        return this.previewView;
    }
}
