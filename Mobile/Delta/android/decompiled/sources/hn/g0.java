package hn;

import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001=\u0018\u0000 (2\u00020\u0001:\u00013BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020 2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J3\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\"\u0010D\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010@\u001a\u0004\bA\u00101\"\u0004\bB\u0010CR$\u0010K\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010MR\u0016\u0010*\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010O¨\u0006P"}, d2 = {"Lhn/g0;", "", "Lhn/h0;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Lkotlin/Function0;", "", "onFrameReceived", "Lku/p0;", "coroutineScope", "<init>", "(Lhn/h0;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;Lkotlin/jvm/functions/Function0;Lku/p0;)V", "Ljt/n;", "m", "()Ljava/lang/Object;", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "k", "(IILandroid/util/Size;J)V", "f", "()V", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "g", "(Landroid/hardware/camera2/CameraDevice;Lnt/b;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "l", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "h", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Ljava/lang/Object;", "i", "()Z", "e", "a", "Lhn/h0;", "b", "Ljava/util/List;", "c", "Landroid/os/Handler;", "d", "Landroid/hardware/camera2/CameraCharacteristics;", "Lkotlin/jvm/functions/Function0;", "Lku/p0;", "hn/g0$b", "Lhn/g0$b;", "callback", "Z", "getEnableTorch", "j", "(Z)V", "enableTorch", "Landroid/hardware/camera2/params/MeteringRectangle;", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "meteringRect", "Lku/d2;", "Lku/d2;", "resetFocusJob", "Landroid/hardware/camera2/CameraCaptureSession;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Surface> targets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraCharacteristics cameraCharacteristics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onFrameReceived;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.p0 coroutineScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b callback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean enableTorch;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MeteringRectangle meteringRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 resetFocusJob;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public CameraCaptureSession session;

    /* JADX INFO: renamed from: hn.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhn/g0$a;", "", "<init>", "()V", "Lhn/h0;", "cameraChoice", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "", "onFrameReceived", "Llq/a;", "coroutineScopeFactory", "Lhn/g0;", "a", "(Lhn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Llq/a;Lnt/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: hn.g0$a$a, reason: collision with other inner class name */
        @pt.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", f = "CameraCaptureSessionWrapper.kt", l = {54}, m = "create")
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0345a extends pt.d {
            public Object A;
            public Object B;
            public Object C;
            public int D;
            public /* synthetic */ Object E;
            public int G;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f19412t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f19413u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f19414v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f19415w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f19416x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f19417y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public Object f19418z;

            public C0345a(nt.b<? super C0345a> bVar) {
                super(bVar);
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.E = obj;
                this.G |= Integer.MIN_VALUE;
                return Companion.this.a(null, null, null, null, null, null, null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Nullable
        public final Object a(@NotNull h0 h0Var, @NotNull CameraCharacteristics cameraCharacteristics, @NotNull List<? extends Surface> list, @NotNull CameraDevice cameraDevice, @Nullable Handler handler, @NotNull Function0<Unit> function0, @NotNull lq.a aVar, @NotNull nt.b<? super g0> bVar) {
            C0345a c0345a;
            g0 g0Var;
            g0 g0Var2;
            if (bVar instanceof C0345a) {
                c0345a = (C0345a) bVar;
                int i10 = c0345a.G;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0345a.G = i10 - Integer.MIN_VALUE;
                } else {
                    c0345a = new C0345a(bVar);
                }
            } else {
                c0345a = new C0345a(bVar);
            }
            Object objG = c0345a.E;
            Object objE = ot.c.e();
            int i11 = c0345a.G;
            if (i11 == 0) {
                jt.o.b(objG);
                g0 g0Var3 = new g0(h0Var, list, handler, cameraCharacteristics, function0, aVar.a(), null);
                c0345a.f19412t = pt.l.a(h0Var);
                c0345a.f19413u = pt.l.a(cameraCharacteristics);
                c0345a.f19414v = pt.l.a(list);
                c0345a.f19415w = pt.l.a(cameraDevice);
                c0345a.f19416x = pt.l.a(handler);
                c0345a.f19417y = pt.l.a(function0);
                c0345a.f19418z = pt.l.a(aVar);
                c0345a.A = g0Var3;
                c0345a.B = pt.l.a(g0Var3);
                c0345a.C = g0Var3;
                c0345a.D = 0;
                c0345a.G = 1;
                objG = g0Var3.g(cameraDevice, c0345a);
                if (objG == objE) {
                    return objE;
                }
                g0Var = g0Var3;
                g0Var2 = g0Var;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) c0345a.C;
                g0Var2 = (g0) c0345a.A;
                jt.o.b(objG);
            }
            g0Var.session = (CameraCaptureSession) objG;
            return g0Var2;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"hn/g0$b", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            super.onCaptureCompleted(session, request, result);
            g0.this.onFrameReceived.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"hn/g0$c", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nt.b<CameraCaptureSession> f19420a;
        public final /* synthetic */ CameraDevice b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(nt.b<? super CameraCaptureSession> bVar, CameraDevice cameraDevice) {
            this.f19420a = bVar;
            this.b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            RuntimeException runtimeException = new RuntimeException("Camera " + this.b.getId() + " session configuration failed");
            nt.b<CameraCaptureSession> bVar = this.f19420a;
            jt.n.Companion companion = jt.n.INSTANCE;
            bVar.resumeWith(jt.n.b(jt.o.a(runtimeException)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.f19420a.resumeWith(jt.n.b(session));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", f = "CameraCaptureSessionWrapper.kt", l = {185, 187}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19421t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f19422u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0 f19423v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", f = "CameraCaptureSessionWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19424t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g0 f19425u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f19425u = g0Var;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f19425u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f19424t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                this.f19425u.e();
                this.f19425u.m();
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, g0 g0Var, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f19422u = j10;
            this.f19423v = g0Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f19422u, this.f19423v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (ku.i.g(r7, r1, r6) == r0) goto L15;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r6.f19421t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r7)
                goto L41
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jt.o.b(r7)
                goto L2c
            L1e:
                jt.o.b(r7)
                long r4 = r6.f19422u
                r6.f19421t = r3
                java.lang.Object r7 = ku.z0.b(r4, r6)
                if (r7 != r0) goto L2c
                goto L40
            L2c:
                ku.n2 r7 = ku.g1.c()
                hn.g0$d$a r1 = new hn.g0$d$a
                hn.g0 r3 = r6.f19423v
                r4 = 0
                r1.<init>(r3, r4)
                r6.f19421t = r2
                java.lang.Object r7 = ku.i.g(r7, r1, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hn.g0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public /* synthetic */ g0(h0 h0Var, List list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0 function0, ku.p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, list, handler, cameraCharacteristics, function0, p0Var);
    }

    public final void e() {
        this.meteringRect = null;
    }

    public final void f() {
        ku.q0.f(this.coroutineScope, null, 1, null);
    }

    public final Object g(CameraDevice cameraDevice, nt.b<? super CameraCaptureSession> bVar) throws Throwable {
        nt.e eVar = new nt.e(ot.b.c(bVar));
        l(cameraDevice, this.targets, this.handler, new c(eVar, cameraDevice));
        Object objA = eVar.a();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    public final Object h(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) {
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            CaptureRequest.Builder builderCreateCaptureRequest = session.getDevice().createCaptureRequest(1);
            Iterator<T> it = surfaces.iterator();
            while (it.hasNext()) {
                builderCreateCaptureRequest.addTarget((Surface) it.next());
            }
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.g());
            if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            if (this.enableTorch) {
                builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            }
            MeteringRectangle meteringRectangle = this.meteringRect;
            if (meteringRectangle != null && i()) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            }
            return jt.n.b(builderCreateCaptureRequest.build());
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(th2));
        }
    }

    public final boolean i() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) >= 1;
    }

    public final void j(boolean z10) {
        this.enableTorch = z10;
    }

    public final void k(int x10, int y10, @NotNull Size size, long duration) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x10, y10), size, 1000);
        d2 d2Var = this.resetFocusJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.resetFocusJob = ku.k.d(this.coroutineScope, null, null, new d(duration, this, null), 3, null);
    }

    public final boolean l(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 33) {
            device.createCaptureSession(targets, stateCallback, handler);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Surface> it = targets.iterator();
        while (it.hasNext()) {
            OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
            outputConfiguration.setDynamicRangeProfile(this.cameraChoice.getAdditionalOptions().getDynamicRange());
            arrayList.add(outputConfiguration);
        }
        device.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
        return true;
    }

    @NotNull
    public final Object m() {
        CameraCaptureSession cameraCaptureSession = this.session;
        CameraCaptureSession cameraCaptureSession2 = null;
        if (cameraCaptureSession == null) {
            Intrinsics.u("session");
            cameraCaptureSession = null;
        }
        Object objH = h(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        if (!jt.n.h(objH)) {
            return jt.n.b(objH);
        }
        try {
            CaptureRequest captureRequest = (CaptureRequest) objH;
            CameraCaptureSession cameraCaptureSession3 = this.session;
            if (cameraCaptureSession3 == null) {
                Intrinsics.u("session");
            } else {
                cameraCaptureSession2 = cameraCaptureSession3;
            }
            cameraCaptureSession2.setRepeatingRequest(captureRequest, this.callback, this.handler);
            return jt.n.b(Unit.f22483a);
        } catch (Throwable th2) {
            jt.n.Companion companion = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(h0 h0Var, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0<Unit> function0, ku.p0 p0Var) {
        this.cameraChoice = h0Var;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.onFrameReceived = function0;
        this.coroutineScope = p0Var;
        this.callback = new b();
    }
}
