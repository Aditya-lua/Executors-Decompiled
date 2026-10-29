package com.withpersona.sdk2.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.camera.view.PreviewView;
import androidx.p000lifecycle.s;
import d1.k;
import f1.a0;
import f1.p;
import f1.p1;
import f1.r0;
import fn.h0;
import fn.i0;
import fn.r;
import fn.u;
import g0.a2;
import g0.f1;
import g0.h1;
import g0.j0;
import g0.l;
import g0.m0;
import g0.t;
import g0.u0;
import g0.v;
import g0.x2;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.v1;
import me.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00102\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/camera/b;", "", "Lqq/c;", "sdkFilesManager", "<init>", "(Lqq/c;)V", "Landroidx/camera/view/PreviewView;", "previewView", "Lcom/withpersona/sdk2/camera/b$a;", "cameraDirection", "Lg0/u0$a;", "imageAnalyzer", "", "useCameraCapture", "useVideoCapture", "Lkotlin/Function1;", "Lfn/h;", "", "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/b$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V", "enable", "c", "(Z)V", "d", "(Landroidx/camera/view/PreviewView;)V", "Ljt/n;", "Ljava/io/File;", "m", "(Lqq/c;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "isAudioRequired", "k", "(Landroid/content/Context;Z)Z", "l", "(Lnt/b;)Ljava/lang/Object;", "Lg0/l;", "camera", "Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "(Lg0/l;)Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "Lqq/c;", "Lfn/r;", "b", "Lfn/r;", "currentCameraSession", "e", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public r currentCameraSession;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        FRONT,
        BACK,
        EXTERNAL;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f9924e = qt.b.a(a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/b$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0161b implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f9925a;

        public C0161b(ExecutorService executorService) {
            this.f9925a = executorService;
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f9925a.shutdown();
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s sVar) {
            super.onStop(sVar);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {227}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9926t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9927u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9928v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9930x;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9928v = obj;
            this.f9930x |= Integer.MIN_VALUE;
            Object objL = b.this.l(this);
            return objL == ot.c.e() ? objL : n.a(objL);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {189}, m = "takePicture-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9931t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9932u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9934w;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9932u = obj;
            this.f9934w |= Integer.MIN_VALUE;
            Object objM = b.this.m(null, this);
            return objM == ot.c.e() ? objM : n.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/withpersona/sdk2/camera/b$e", "Lg0/f1$g;", "Lg0/f1$i;", "outputFileResults", "", "d", "(Lg0/f1$i;)V", "Lg0/h1;", "exception", "e", "(Lg0/h1;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements f1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nt.b<n<? extends File>> f9935a;
        public final /* synthetic */ File b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(nt.b<? super n<? extends File>> bVar, File file) {
            this.f9935a = bVar;
            this.b = file;
        }

        @Override // g0.f1.g
        public void d(f1.i outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            nt.b<n<? extends File>> bVar = this.f9935a;
            n.Companion companion = n.INSTANCE;
            bVar.resumeWith(n.b(n.a(n.b(this.b))));
        }

        @Override // g0.f1.g
        public void e(h1 exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            nt.b<n<? extends File>> bVar = this.f9935a;
            n.Companion companion = n.INSTANCE;
            bVar.resumeWith(n.b(n.a(n.b(o.a(exception)))));
        }
    }

    public b(@NotNull qq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.sdkFilesManager = sdkFilesManager;
    }

    public static /* synthetic */ void g(b bVar, PreviewView previewView, a aVar, u0.a aVar2, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        bVar.f(previewView, aVar, aVar2, z10, z11, function1);
    }

    public static final void h(final PreviewView previewView, final boolean z10, final u0.a aVar, final boolean z11, final v vVar, final b bVar, final Function1 function1) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.a aVarT1 = u.b(context).t1();
            if (aVarT1 != null) {
                aVarT1.k();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            k.Companion aVar2 = k.INSTANCE;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final x<k> xVarC = aVar2.c(context2);
            xVarC.a(new Runnable() { // from class: fn.p
                @Override // java.lang.Runnable
                public final void run() {
                    com.withpersona.sdk2.camera.b.i(xVarC, rotation, z10, aVar, executorServiceNewSingleThreadExecutor, z11, previewView, vVar, bVar, function1);
                }
            }, l2.b.i(previewView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(x xVar, int i10, boolean z10, u0.a aVar, ExecutorService executorService, boolean z11, PreviewView previewView, v vVar, b bVar, Function1 function1) {
        f1 f1VarF;
        k kVar = (k) xVar.get();
        a2 a2VarF = new a2.a().c(i10).f();
        Intrinsics.checkNotNullExpressionValue(a2VarF, "build(...)");
        x2.a aVar2 = new x2.a();
        aVar2.b(a2VarF);
        r0 r0VarC = null;
        if (z10) {
            f1VarF = new f1.b().i(1).c(i10).f();
            aVar2.b(f1VarF);
        } else {
            f1VarF = null;
        }
        if (aVar != null) {
            u0 u0VarF = new u0.c().j(0).d(new Size(2000, 2000)).c(i10).f();
            Intrinsics.checkNotNullExpressionValue(u0VarF, "build(...)");
            u0VarF.t0(executorService, aVar);
            aVar2.b(u0VarF);
        }
        if (z11) {
            r0.i iVarE = new r0.i().e(executorService);
            f1.x xVar2 = f1.x.f16051c;
            r0VarC = iVarE.f(a0.d(xVar2, p.b(xVar2))).c();
            aVar2.b(p1.m1(r0VarC));
        }
        kVar.h();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.b bVarB = u.b(context);
            x2 x2VarC = aVar2.c();
            Intrinsics.checkNotNullExpressionValue(x2VarC, "build(...)");
            l lVarC = kVar.c(bVarB, vVar, x2VarC);
            bVar.currentCameraSession = new r(lVarC, f1VarF, r0VarC, bVar.j(lVarC));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            jq.g.i(context2).a().a(new C0161b(executorService));
            a2VarF.q0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new i0());
        }
    }

    public final void c(boolean enable) {
        l lVarA;
        r rVar = this.currentCameraSession;
        if (rVar == null || (lVarA = rVar.getCamera()) == null) {
            return;
        }
        lVarA.c().c(enable);
    }

    public final void d(@NotNull PreviewView previewView) {
        l lVarA;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        r rVar = this.currentCameraSession;
        if (rVar == null || (lVarA = rVar.getCamera()) == null) {
            return;
        }
        lVarA.c().o(new m0.a(new j0(previewView.getDisplay(), lVarA.d(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    @NotNull
    public final CameraProperties e() {
        CameraProperties cameraPropertiesB;
        r rVar = this.currentCameraSession;
        return (rVar == null || (cameraPropertiesB = rVar.getCameraProperties()) == null) ? new CameraProperties(null, null, null, 0, 0, 31, null) : cameraPropertiesB;
    }

    public final void f(@NotNull final PreviewView previewView, @NotNull a cameraDirection, @Nullable final u0.a imageAnalyzer, final boolean useCameraCapture, final boolean useVideoCapture, @NotNull final Function1<? super fn.h, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final v vVarA = new v.a().b(cameraDirection == a.FRONT ? 0 : 1).a();
        Intrinsics.checkNotNullExpressionValue(vVarA, "build(...)");
        previewView.post(new Runnable() { // from class: fn.o
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.camera.b.h(previewView, useCameraCapture, imageAnalyzer, useVideoCapture, vVarA, this, onCameraError);
            }
        });
    }

    public final CameraProperties j(l camera) {
        CameraProperties.b bVar;
        try {
            t tVarD = camera.d();
            Intrinsics.checkNotNullExpressionValue(tVarD, "getCameraInfo(...)");
            f0.h hVarA = f0.h.a(tVarD);
            Intrinsics.checkNotNullExpressionValue(hVarA, "from(...)");
            String strC = hVarA.c();
            Intrinsics.checkNotNullExpressionValue(strC, "getCameraId(...)");
            Rect rect = (Rect) hVarA.b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) hVarA.b(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                bVar = CameraProperties.b.Environment;
            } else {
                bVar = (num != null && num.intValue() == 0) ? CameraProperties.b.User : CameraProperties.b.Unknown;
            }
            CameraProperties.b bVar2 = bVar;
            Range[] rangeArr = (Range[]) hVarA.b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator itA = kotlin.jvm.internal.c.a(rangeArr);
                while (itA.hasNext()) {
                    Integer num2 = (Integer) ((Range) itA.next()).getUpper();
                    if (num2.intValue() > iIntValue) {
                        Intrinsics.checkNotNull(num2);
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new CameraProperties(strC, bVar2, size, iIntValue, 0, 16, null);
        } catch (IllegalArgumentException unused) {
            return new CameraProperties(null, null, null, 0, 0, 31, null);
        }
    }

    public final boolean k(@NotNull Context context, boolean isAudioRequired) {
        r0 r0VarE;
        Intrinsics.checkNotNullParameter(context, "context");
        r rVar = this.currentCameraSession;
        if (rVar == null || rVar.getCurrentRecordingHelper() != null || (r0VarE = rVar.getRecorder()) == null) {
            return false;
        }
        rVar.f(h.INSTANCE.a(r0VarE, context, this.sdkFilesManager, isAudioRequired));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object l(@NotNull nt.b<? super n<? extends File>> bVar) {
        c cVar;
        r rVar;
        Object value;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f9930x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f9930x = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f9928v;
        Object objE = ot.c.e();
        int i11 = cVar.f9930x;
        if (i11 == 0) {
            o.b(obj);
            r rVar2 = this.currentCameraSession;
            if (rVar2 == null) {
                n.Companion companion = n.INSTANCE;
                return n.b(o.a(new h0()));
            }
            h hVarC = rVar2.getCurrentRecordingHelper();
            if (hVarC == null) {
                n.Companion companion2 = n.INSTANCE;
                return n.b(o.a(new h0()));
            }
            cVar.f9926t = rVar2;
            cVar.f9927u = pt.l.a(hVarC);
            cVar.f9930x = 1;
            Object objE2 = hVarC.e(cVar);
            if (objE2 == objE) {
                return objE;
            }
            rVar = rVar2;
            value = objE2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) cVar.f9926t;
            o.b(obj);
            value = ((n) obj).getValue();
        }
        rVar.f(null);
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull qq.c cVar, @NotNull nt.b<? super n<? extends File>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f9934w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f9934w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objA = dVar.f9932u;
        Object objE = ot.c.e();
        int i11 = dVar.f9934w;
        if (i11 == 0) {
            o.b(objA);
            dVar.f9931t = cVar;
            dVar.f9934w = 1;
            nt.e eVar = new nt.e(ot.b.c(dVar));
            r rVar = this.currentCameraSession;
            f1 f1VarD = rVar != null ? rVar.getImageCapture() : null;
            if (f1VarD == null) {
                n.Companion companion = n.INSTANCE;
                eVar.resumeWith(n.b(n.a(n.b(o.a(new i0())))));
            } else {
                File fileE = cVar.e("jpg");
                f1.h hVarA = new f1.h.a(fileE).a();
                Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
                f1VarD.T0(hVarA, v1.a(g1.c().getImmediate()), new e(eVar, fileE));
            }
            objA = eVar.a();
            if (objA == ot.c.e()) {
                pt.h.c(dVar);
            }
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objA);
        }
        return ((n) objA).getValue();
    }
}
