package sn;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.camera.view.PreviewView;
import av.v1;
import com.github.luben.zstd.BuildConfig;
import f1.p1;
import g0.a2;
import g0.x2;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00102\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lsn/t;", BuildConfig.FLAVOR, "Ler/c;", "sdkFilesManager", "<init>", "(Ler/c;)V", "Landroidx/camera/view/PreviewView;", "previewView", "Lsn/t$a;", "cameraDirection", "Lg0/u0$a;", "imageAnalyzer", BuildConfig.FLAVOR, "useCameraCapture", "useVideoCapture", "Lkotlin/Function1;", "Lsn/k;", BuildConfig.FLAVOR, "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lsn/t$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V", "enable", "c", "(Z)V", "d", "(Landroidx/camera/view/PreviewView;)V", "Lzt/n;", "Ljava/io/File;", "m", "(Ler/c;Leu/b;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "isAudioRequired", "k", "(Landroid/content/Context;Z)Z", "l", "(Leu/b;)Ljava/lang/Object;", "Lg0/l;", "camera", "Lsn/v;", "j", "(Lg0/l;)Lsn/v;", "a", "Ler/c;", "Lsn/x;", "b", "Lsn/x;", "currentCameraSession", "e", "()Lsn/v;", "cameraProperties", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public x currentCameraSession;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsn/t$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        FRONT,
        BACK,
        EXTERNAL;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ hu.a f31708e = hu.b.a(a());
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sn/t$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onDestroy", "(Landroidx/lifecycle/s;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f31709a;

        public b(ExecutorService executorService) {
            this.f31709a = executorService;
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f31709a.shutdown();
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(androidx.p000lifecycle.s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(androidx.p000lifecycle.s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {227}, m = "stopVideo-IoAF18A")
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31710t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31711u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31712v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31714x;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31712v = obj;
            this.f31714x |= Integer.MIN_VALUE;
            Object objL = t.this.l(this);
            return objL == fu.c.e() ? objL : zt.n.a(objL);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {189}, m = "takePicture-gIAlu-s")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31715t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31716u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31718w;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31716u = obj;
            this.f31718w |= Integer.MIN_VALUE;
            Object objM = t.this.m(null, this);
            return objM == fu.c.e() ? objM : zt.n.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"sn/t$e", "Lg0/f1$g;", "Lg0/f1$i;", "outputFileResults", BuildConfig.FLAVOR, "d", "(Lg0/f1$i;)V", "Lg0/h1;", "exception", "e", "(Lg0/h1;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements g0.f1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eu.b<zt.n<? extends File>> f31719a;
        public final /* synthetic */ File b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(eu.b<? super zt.n<? extends File>> bVar, File file) {
            this.f31719a = bVar;
            this.b = file;
        }

        @Override // g0.f1.g
        public void d(g0.f1.i outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            eu.b<zt.n<? extends File>> bVar = this.f31719a;
            zt.n.Companion companion = zt.n.INSTANCE;
            bVar.resumeWith(zt.n.b(zt.n.a(zt.n.b(this.b))));
        }

        @Override // g0.f1.g
        public void e(g0.h1 exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            eu.b<zt.n<? extends File>> bVar = this.f31719a;
            zt.n.Companion companion = zt.n.INSTANCE;
            bVar.resumeWith(zt.n.b(zt.n.a(zt.n.b(zt.o.a(exception)))));
        }
    }

    public t(@NotNull er.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.sdkFilesManager = sdkFilesManager;
    }

    public static /* synthetic */ void g(t tVar, PreviewView previewView, a aVar, g0.u0.a aVar2, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        tVar.f(previewView, aVar, aVar2, z10, z11, function1);
    }

    public static final void h(final PreviewView previewView, final boolean z10, final g0.u0.a aVar, final boolean z11, final g0.v vVar, final t tVar, final Function1 function1) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.a aVarT1 = d0.b(context).t1();
            if (aVarT1 != null) {
                aVarT1.k();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            d1.k.Companion aVar2 = d1.k.INSTANCE;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final pe.x<d1.k> xVarC = aVar2.c(context2);
            xVarC.a(new Runnable() { // from class: sn.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.i(xVarC, rotation, z10, aVar, executorServiceNewSingleThreadExecutor, z11, previewView, vVar, tVar, function1);
                }
            }, l2.b.i(previewView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(pe.x xVar, int i10, boolean z10, g0.u0.a aVar, ExecutorService executorService, boolean z11, PreviewView previewView, g0.v vVar, t tVar, Function1 function1) {
        g0.f1 f1VarF;
        d1.k kVar = (d1.k) xVar.get();
        a2 a2VarF = new a2.a().c(i10).f();
        Intrinsics.checkNotNullExpressionValue(a2VarF, "build(...)");
        x2.a aVar2 = new x2.a();
        aVar2.b(a2VarF);
        f1.r0 r0VarC = null;
        if (z10) {
            f1VarF = new g0.f1.b().i(1).c(i10).f();
            aVar2.b(f1VarF);
        } else {
            f1VarF = null;
        }
        if (aVar != null) {
            g0.u0 u0VarF = new g0.u0.c().j(0).d(new Size(2000, 2000)).c(i10).f();
            Intrinsics.checkNotNullExpressionValue(u0VarF, "build(...)");
            u0VarF.t0(executorService, aVar);
            aVar2.b(u0VarF);
        }
        if (z11) {
            f1.r0.i iVarE = new f1.r0.i().e(executorService);
            f1.x xVar2 = f1.x.f15124c;
            r0VarC = iVarE.f(f1.a0.d(xVar2, f1.p.b(xVar2))).c();
            aVar2.b(p1.m1(r0VarC));
        }
        kVar.h();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.b bVarB = d0.b(context);
            x2 x2VarC = aVar2.c();
            Intrinsics.checkNotNullExpressionValue(x2VarC, "build(...)");
            g0.l lVarC = kVar.c(bVarB, vVar, x2VarC);
            tVar.currentCameraSession = new x(lVarC, f1VarF, r0VarC, tVar.j(lVarC));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            xq.g.i(context2).a().a(new b(executorService));
            a2VarF.q0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new v0());
        }
    }

    public final void c(boolean enable) {
        g0.l lVarA;
        x xVar = this.currentCameraSession;
        if (xVar == null || (lVarA = xVar.getCamera()) == null) {
            return;
        }
        lVarA.c().a(enable);
    }

    public final void d(@NotNull PreviewView previewView) {
        g0.l lVarA;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        x xVar = this.currentCameraSession;
        if (xVar == null || (lVarA = xVar.getCamera()) == null) {
            return;
        }
        lVarA.c().o(new g0.m0.a(new g0.j0(previewView.getDisplay(), lVarA.d(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    @NotNull
    public final v e() {
        v vVarB;
        x xVar = this.currentCameraSession;
        return (xVar == null || (vVarB = xVar.getCameraProperties()) == null) ? new v(null, null, null, 0, 0, 31, null) : vVarB;
    }

    public final void f(@NotNull final PreviewView previewView, @NotNull a cameraDirection, @Nullable final g0.u0.a imageAnalyzer, final boolean useCameraCapture, final boolean useVideoCapture, @NotNull final Function1<? super k, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final g0.v vVarA = new g0.v.a().b(cameraDirection == a.FRONT ? 0 : 1).a();
        Intrinsics.checkNotNullExpressionValue(vVarA, "build(...)");
        previewView.post(new Runnable() { // from class: sn.r
            @Override // java.lang.Runnable
            public final void run() {
                t.h(previewView, useCameraCapture, imageAnalyzer, useVideoCapture, vVarA, this, onCameraError);
            }
        });
    }

    public final v j(g0.l camera) {
        v.b bVar;
        try {
            g0.t tVarD = camera.d();
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
                bVar = v.b.Environment;
            } else {
                bVar = (num != null && num.intValue() == 0) ? v.b.User : v.b.Unknown;
            }
            v.b bVar2 = bVar;
            Range[] rangeArr = (Range[]) hVarA.b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator itA = p001kotlin.jvm.internal.c.a(rangeArr);
                while (itA.hasNext()) {
                    Integer num2 = (Integer) ((Range) itA.next()).getUpper();
                    if (num2.intValue() > iIntValue) {
                        Intrinsics.checkNotNull(num2);
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new v(strC, bVar2, size, iIntValue, 0, 16, null);
        } catch (IllegalArgumentException unused) {
            return new v(null, null, null, 0, 0, 31, null);
        }
    }

    public final boolean k(@NotNull Context context, boolean isAudioRequired) {
        f1.r0 r0VarE;
        Intrinsics.checkNotNullParameter(context, "context");
        x xVar = this.currentCameraSession;
        if (xVar == null || xVar.getCurrentRecordingHelper() != null || (r0VarE = xVar.getRecorder()) == null) {
            return false;
        }
        xVar.f(y0.INSTANCE.a(r0VarE, context, this.sdkFilesManager, isAudioRequired));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object l(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        c cVar;
        x xVar;
        Object value;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f31714x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f31714x = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f31712v;
        Object objE = fu.c.e();
        int i11 = cVar.f31714x;
        if (i11 == 0) {
            zt.o.b(obj);
            x xVar2 = this.currentCameraSession;
            if (xVar2 == null) {
                zt.n.Companion companion = zt.n.INSTANCE;
                return zt.n.b(zt.o.a(new t0()));
            }
            y0 y0VarC = xVar2.getCurrentRecordingHelper();
            if (y0VarC == null) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                return zt.n.b(zt.o.a(new t0()));
            }
            cVar.f31710t = xVar2;
            cVar.f31711u = gu.l.a(y0VarC);
            cVar.f31714x = 1;
            Object objE2 = y0VarC.e(cVar);
            if (objE2 == objE) {
                return objE;
            }
            xVar = xVar2;
            value = objE2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) cVar.f31710t;
            zt.o.b(obj);
            value = ((zt.n) obj).getValue();
        }
        xVar.f(null);
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull er.c cVar, @NotNull eu.b<? super zt.n<? extends File>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f31718w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f31718w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objA = dVar.f31716u;
        Object objE = fu.c.e();
        int i11 = dVar.f31718w;
        if (i11 == 0) {
            zt.o.b(objA);
            dVar.f31715t = cVar;
            dVar.f31718w = 1;
            eu.e eVar = new eu.e(fu.b.c(dVar));
            x xVar = this.currentCameraSession;
            g0.f1 f1VarD = xVar != null ? xVar.getImageCapture() : null;
            if (f1VarD == null) {
                zt.n.Companion companion = zt.n.INSTANCE;
                eVar.resumeWith(zt.n.b(zt.n.a(zt.n.b(zt.o.a(new v0())))));
            } else {
                File fileE = cVar.e("jpg");
                g0.f1.h hVarA = new g0.f1.h.a(fileE).a();
                Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
                f1VarD.T0(hVarA, v1.a(av.g1.c().getImmediate()), new e(eVar, fileE));
            }
            objA = eVar.a();
            if (objA == fu.c.e()) {
                gu.h.c(dVar);
            }
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objA);
        }
        return ((zt.n) objA).getValue();
    }
}
