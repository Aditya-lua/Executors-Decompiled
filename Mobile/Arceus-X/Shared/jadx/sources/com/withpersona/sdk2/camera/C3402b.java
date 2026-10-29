package com.withpersona.sdk2.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.camera.view.PreviewView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.camera.C3402b;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7728c;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p064d1.C4406k;
import p114f0.C5229h;
import p115f1.C5235a0;
import p115f1.C5282p;
import p115f1.C5284p1;
import p115f1.C5289r0;
import p115f1.C5306x;
import p132fn.AbstractC5685h;
import p132fn.C5686h0;
import p132fn.C5688i0;
import p132fn.C5705r;
import p132fn.C5711u;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p140g0.C5898j0;
import p140g0.C5910m0;
import p140g0.C5942u0;
import p140g0.C5945v;
import p140g0.C5956x2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5937t;
import p203j.AbstractC6991a;
import p203j.ActivityC6992b;
import p226jq.C7259g;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7931v1;
import p261l2.C7975b;
import p315nt.C9560e;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p391qq.C10700c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00102\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/b;", "", "Lqq/c;", "sdkFilesManager", "<init>", "(Lqq/c;)V", "Landroidx/camera/view/PreviewView;", "previewView", "Lcom/withpersona/sdk2/camera/b$a;", "cameraDirection", "Lg0/u0$a;", "imageAnalyzer", "", "useCameraCapture", "useVideoCapture", "Lkotlin/Function1;", "Lfn/h;", "", "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/b$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V", "enable", "c", "(Z)V", "d", "(Landroidx/camera/view/PreviewView;)V", "Ljt/n;", "Ljava/io/File;", "m", "(Lqq/c;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "isAudioRequired", "k", "(Landroid/content/Context;Z)Z", "l", "(Lnt/b;)Ljava/lang/Object;", "Lg0/l;", "camera", "Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "(Lg0/l;)Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "Lqq/c;", "Lfn/r;", "b", "Lfn/r;", "currentCameraSession", "e", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3402b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C5705r currentCameraSession;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        FRONT,
        BACK,
        EXTERNAL;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f12911e = C10708b.m40805a(m16206a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/withpersona/sdk2/camera/b$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0954f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExecutorService f12912a;

        public b(ExecutorService executorService) {
            this.f12912a = executorService;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f12912a.shutdown();
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s interfaceC0980s) {
            super.onResume(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s interfaceC0980s) {
            super.onStart(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$c */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraPreview", m39664f = "CameraPreview.kt", m39665l = {227}, m39666m = "stopVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f12913t;

        /* JADX INFO: renamed from: u */
        public Object f12914u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f12915v;

        /* JADX INFO: renamed from: x */
        public int f12917x;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12915v = obj;
            this.f12917x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM16204l = C3402b.this.m16204l(this);
            return objM16204l == C10047c.m38805e() ? objM16204l : C7347n.m30459a(objM16204l);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraPreview", m39664f = "CameraPreview.kt", m39665l = {189}, m39666m = "takePicture-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f12918t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12919u;

        /* JADX INFO: renamed from: w */
        public int f12921w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12919u = obj;
            this.f12921w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM16205m = C3402b.this.m16205m(null, this);
            return objM16205m == C10047c.m38805e() ? objM16205m : C7347n.m30459a(objM16205m);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$e */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"com/withpersona/sdk2/camera/b$e", "Lg0/f1$g;", "Lg0/f1$i;", "outputFileResults", "", "d", "(Lg0/f1$i;)V", "Lg0/h1;", "exception", "e", "(Lg0/h1;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e implements C5883f1.g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9557b<C7347n<? extends File>> f12922a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f12923b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super jt.n<? extends java.io.File>> */
        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b, File file) {
            this.f12922a = interfaceC9557b;
            this.f12923b = file;
        }

        @Override // p140g0.C5883f1.g
        /* JADX INFO: renamed from: d */
        public void mo16207d(C5883f1.i outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            InterfaceC9557b<C7347n<? extends File>> interfaceC9557b = this.f12922a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC9557b.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(this.f12923b))));
        }

        @Override // p140g0.C5883f1.g
        /* JADX INFO: renamed from: e */
        public void mo16208e(C5891h1 exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC9557b<C7347n<? extends File>> interfaceC9557b = this.f12922a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC9557b.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(exception)))));
        }
    }

    public C3402b(@NotNull C10700c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.sdkFilesManager = sdkFilesManager;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m16195g(C3402b c3402b, PreviewView previewView, a aVar, C5942u0.a aVar2, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        c3402b.m16201f(previewView, aVar, aVar2, z10, z11, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final void m16196h(final PreviewView previewView, final boolean z10, final C5942u0.a aVar, final boolean z11, final C5945v c5945v, final C3402b c3402b, final Function1 function1) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AbstractC6991a abstractC6991aM29453t1 = C5711u.m25884b(context).m29453t1();
            if (abstractC6991aM29453t1 != null) {
                abstractC6991aM29453t1.mo29429k();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            C4406k.Companion aVar2 = C4406k.INSTANCE;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final InterfaceFutureC9440x<C4406k> interfaceFutureC9440xM22147c = aVar2.m22147c(context2);
            interfaceFutureC9440xM22147c.mo37173a(new Runnable() { // from class: fn.p
                @Override // java.lang.Runnable
                public final void run() {
                    C3402b.m16197i(interfaceFutureC9440xM22147c, rotation, z10, aVar, executorServiceNewSingleThreadExecutor, z11, previewView, c5945v, c3402b, function1);
                }
            }, C7975b.m33011i(previewView.getContext()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final void m16197i(InterfaceFutureC9440x interfaceFutureC9440x, int i10, boolean z10, C5942u0.a aVar, ExecutorService executorService, boolean z11, PreviewView previewView, C5945v c5945v, C3402b c3402b, Function1 function1) {
        C5883f1 c5883f1M26400f;
        C4406k c4406k = (C4406k) interfaceFutureC9440x.get();
        C5864a2 c5864a2M26298f = new C5864a2.a().mo24412c(i10).m26298f();
        Intrinsics.checkNotNullExpressionValue(c5864a2M26298f, "build(...)");
        C5956x2.a aVar2 = new C5956x2.a();
        aVar2.m26744b(c5864a2M26298f);
        C5289r0 c5289r0M24527c = null;
        if (z10) {
            c5883f1M26400f = new C5883f1.b().m26402i(1).mo24412c(i10).m26400f();
            aVar2.m26744b(c5883f1M26400f);
        } else {
            c5883f1M26400f = null;
        }
        if (aVar != null) {
            C5942u0 c5942u0M26605f = new C5942u0.c().m26608j(0).mo24413d(new Size(2000, 2000)).mo24412c(i10).m26605f();
            Intrinsics.checkNotNullExpressionValue(c5942u0M26605f, "build(...)");
            c5942u0M26605f.m26601t0(executorService, aVar);
            aVar2.m26744b(c5942u0M26605f);
        }
        if (z11) {
            C5289r0.i iVarM24529e = new C5289r0.i().m24529e(executorService);
            C5306x c5306x = C5306x.f20631c;
            c5289r0M24527c = iVarM24529e.m24530f(C5235a0.m24231d(c5306x, C5282p.m24345b(c5306x))).m24527c();
            aVar2.m26744b(C5284p1.m24366m1(c5289r0M24527c));
        }
        c4406k.m22142h();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ActivityC6992b activityC6992bM25884b = C5711u.m25884b(context);
            C5956x2 c5956x2M26745c = aVar2.m26745c();
            Intrinsics.checkNotNullExpressionValue(c5956x2M26745c, "build(...)");
            InterfaceC5905l interfaceC5905lM22138c = c4406k.m22138c(activityC6992bM25884b, c5945v, c5956x2M26745c);
            c3402b.currentCameraSession = new C5705r(interfaceC5905lM22138c, c5883f1M26400f, c5289r0M24527c, c3402b.m16202j(interfaceC5905lM22138c));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C7259g.m30275i(context2).mo4656a().mo4935a(new b(executorService));
            c5864a2M26298f.m26293q0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new C5688i0());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16198c(boolean enable) {
        InterfaceC5905l interfaceC5905lM25846a;
        C5705r c5705r = this.currentCameraSession;
        if (c5705r == null || (interfaceC5905lM25846a = c5705r.getCamera()) == null) {
            return;
        }
        interfaceC5905lM25846a.mo22073c().mo26524c(enable);
    }

    /* JADX INFO: renamed from: d */
    public final void m16199d(@NotNull PreviewView previewView) {
        InterfaceC5905l interfaceC5905lM25846a;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        C5705r c5705r = this.currentCameraSession;
        if (c5705r == null || (interfaceC5905lM25846a = c5705r.getCamera()) == null) {
            return;
        }
        interfaceC5905lM25846a.mo22073c().mo26527o(new C5910m0.a(new C5898j0(previewView.getDisplay(), interfaceC5905lM25846a.mo22074d(), previewView.getWidth(), previewView.getHeight()).m26636b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).m26534b());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final CameraProperties m16200e() {
        CameraProperties cameraPropertiesM25847b;
        C5705r c5705r = this.currentCameraSession;
        return (c5705r == null || (cameraPropertiesM25847b = c5705r.getCameraProperties()) == null) ? new CameraProperties(null, null, null, 0, 0, 31, null) : cameraPropertiesM25847b;
    }

    /* JADX INFO: renamed from: f */
    public final void m16201f(@NotNull final PreviewView previewView, @NotNull a cameraDirection, @Nullable final C5942u0.a imageAnalyzer, final boolean useCameraCapture, final boolean useVideoCapture, @NotNull final Function1<? super AbstractC5685h, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final C5945v c5945vM26633a = new C5945v.a().m26634b(cameraDirection == a.FRONT ? 0 : 1).m26633a();
        Intrinsics.checkNotNullExpressionValue(c5945vM26633a, "build(...)");
        previewView.post(new Runnable() { // from class: fn.o
            @Override // java.lang.Runnable
            public final void run() {
                C3402b.m16196h(previewView, useCameraCapture, imageAnalyzer, useVideoCapture, c5945vM26633a, this, onCameraError);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final CameraProperties m16202j(InterfaceC5905l camera) {
        CameraProperties.EnumC3397b enumC3397b;
        try {
            InterfaceC5937t interfaceC5937tMo22074d = camera.mo22074d();
            Intrinsics.checkNotNullExpressionValue(interfaceC5937tMo22074d, "getCameraInfo(...)");
            C5229h c5229hM24208a = C5229h.m24208a(interfaceC5937tMo22074d);
            Intrinsics.checkNotNullExpressionValue(c5229hM24208a, "from(...)");
            String strM24210c = c5229hM24208a.m24210c();
            Intrinsics.checkNotNullExpressionValue(strM24210c, "getCameraId(...)");
            Rect rect = (Rect) c5229hM24208a.m24209b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) c5229hM24208a.m24209b(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                enumC3397b = CameraProperties.EnumC3397b.Environment;
            } else {
                enumC3397b = (num != null && num.intValue() == 0) ? CameraProperties.EnumC3397b.User : CameraProperties.EnumC3397b.Unknown;
            }
            CameraProperties.EnumC3397b enumC3397b2 = enumC3397b;
            Range[] rangeArr = (Range[]) c5229hM24208a.m24209b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator itM31999a = C7728c.m31999a(rangeArr);
                while (itM31999a.hasNext()) {
                    Integer num2 = (Integer) ((Range) itM31999a.next()).getUpper();
                    if (num2.intValue() > iIntValue) {
                        Intrinsics.checkNotNull(num2);
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new CameraProperties(strM24210c, enumC3397b2, size, iIntValue, 0, 16, null);
        } catch (IllegalArgumentException unused) {
            return new CameraProperties(null, null, null, 0, 0, 31, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16203k(@NotNull Context context, boolean isAudioRequired) {
        C5289r0 c5289r0M25850e;
        Intrinsics.checkNotNullParameter(context, "context");
        C5705r c5705r = this.currentCameraSession;
        if (c5705r == null || c5705r.getCurrentRecordingHelper() != null || (c5289r0M25850e = c5705r.getRecorder()) == null) {
            return false;
        }
        c5705r.m25851f(C3408h.INSTANCE.m16237a(c5289r0M25850e, context, this.sdkFilesManager, isAudioRequired));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m16204l(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        c cVar;
        C5705r c5705r;
        Object value;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f12917x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f12917x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object obj = cVar.f12915v;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f12917x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C5705r c5705r2 = this.currentCameraSession;
            if (c5705r2 == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C5686h0()));
            }
            C3408h c3408hM25848c = c5705r2.getCurrentRecordingHelper();
            if (c3408hM25848c == null) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C5686h0()));
            }
            cVar.f12913t = c5705r2;
            cVar.f12914u = C10350l.m39676a(c3408hM25848c);
            cVar.f12917x = 1;
            Object objM16236e = c3408hM25848c.m16236e(cVar);
            if (objM16236e == objM38805e) {
                return objM38805e;
            }
            c5705r = c5705r2;
            value = objM16236e;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5705r = (C5705r) cVar.f12913t;
            C7348o.m30470b(obj);
            value = ((C7347n) obj).getValue();
        }
        c5705r.m25851f(null);
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m16205m(@NotNull C10700c c10700c, @NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f12921w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f12921w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objM37701a = dVar.f12919u;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f12921w;
        if (i11 == 0) {
            C7348o.m30470b(objM37701a);
            dVar.f12918t = c10700c;
            dVar.f12921w = 1;
            C9560e c9560e = new C9560e(C10046b.m38803c(dVar));
            C5705r c5705r = this.currentCameraSession;
            C5883f1 c5883f1M25849d = c5705r != null ? c5705r.getImageCapture() : null;
            if (c5883f1M25849d == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                c9560e.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(new C5688i0())))));
            } else {
                File fileM40782e = c10700c.m40782e("jpg");
                C5883f1.h hVarM26437a = new C5883f1.h.a(fileM40782e).m26437a();
                Intrinsics.checkNotNullExpressionValue(hVarM26437a, "build(...)");
                c5883f1M25849d.m26381T0(hVarM26437a, C7931v1.m32924a(C7864g1.m32645c().getImmediate()), new e(c9560e, fileM40782e));
            }
            objM37701a = c9560e.m37701a();
            if (objM37701a == C10047c.m38805e()) {
                C10346h.m39673c(dVar);
            }
            if (objM37701a == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM37701a);
        }
        return ((C7347n) objM37701a).getValue();
    }
}
