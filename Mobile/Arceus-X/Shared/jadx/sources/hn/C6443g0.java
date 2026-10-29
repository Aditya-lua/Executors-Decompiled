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
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p279lq.C8235a;
import p315nt.C9560e;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hn.g0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001=\u0018\u0000 (2\u00020\u0001:\u00013BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020 2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J3\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\"\u0010D\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010@\u001a\u0004\bA\u00101\"\u0004\bB\u0010CR$\u0010K\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010MR\u0016\u0010*\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010O¨\u0006P"}, m31665d2 = {"Lhn/g0;", "", "Lhn/h0;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Lkotlin/Function0;", "", "onFrameReceived", "Lku/p0;", "coroutineScope", "<init>", "(Lhn/h0;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;Lkotlin/jvm/functions/Function0;Lku/p0;)V", "Ljt/n;", "m", "()Ljava/lang/Object;", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "k", "(IILandroid/util/Size;J)V", "f", "()V", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "g", "(Landroid/hardware/camera2/CameraDevice;Lnt/b;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "l", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "h", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Ljava/lang/Object;", "i", "()Z", "e", "a", "Lhn/h0;", "b", "Ljava/util/List;", "c", "Landroid/os/Handler;", "d", "Landroid/hardware/camera2/CameraCharacteristics;", "Lkotlin/jvm/functions/Function0;", "Lku/p0;", "hn/g0$b", "Lhn/g0$b;", "callback", "Z", "getEnableTorch", "j", "(Z)V", "enableTorch", "Landroid/hardware/camera2/params/MeteringRectangle;", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "meteringRect", "Lku/d2;", "Lku/d2;", "resetFocusJob", "Landroid/hardware/camera2/CameraCaptureSession;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6443g0 {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C6445h0 cameraChoice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Surface> targets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final CameraCharacteristics cameraCharacteristics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onFrameReceived;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final b callback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean enableTorch;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public MeteringRectangle meteringRect;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 resetFocusJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public CameraCaptureSession session;

    /* JADX INFO: renamed from: hn.g0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lhn/g0$a;", "", "<init>", "()V", "Lhn/h0;", "cameraChoice", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "", "onFrameReceived", "Llq/a;", "coroutineScopeFactory", "Lhn/g0;", "a", "(Lhn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Llq/a;Lnt/b;)Ljava/lang/Object;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: hn.g0$a$a, reason: collision with other inner class name */
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", m39664f = "CameraCaptureSessionWrapper.kt", m39665l = {54}, m39666m = "create")
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14175a extends AbstractC10342d {

            /* JADX INFO: renamed from: A */
            public Object f24444A;

            /* JADX INFO: renamed from: B */
            public Object f24445B;

            /* JADX INFO: renamed from: C */
            public Object f24446C;

            /* JADX INFO: renamed from: D */
            public int f24447D;

            /* JADX INFO: renamed from: E */
            public /* synthetic */ Object f24448E;

            /* JADX INFO: renamed from: G */
            public int f24450G;

            /* JADX INFO: renamed from: t */
            public Object f24451t;

            /* JADX INFO: renamed from: u */
            public Object f24452u;

            /* JADX INFO: renamed from: v */
            public Object f24453v;

            /* JADX INFO: renamed from: w */
            public Object f24454w;

            /* JADX INFO: renamed from: x */
            public Object f24455x;

            /* JADX INFO: renamed from: y */
            public Object f24456y;

            /* JADX INFO: renamed from: z */
            public Object f24457z;

            public C14175a(InterfaceC9557b<? super C14175a> interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f24448E = obj;
                this.f24450G |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return Companion.this.m28096a(null, null, null, null, null, null, null, this);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: hn.g0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m28096a(@NotNull C6445h0 c6445h0, @NotNull CameraCharacteristics cameraCharacteristics, @NotNull List<? extends Surface> list, @NotNull CameraDevice cameraDevice, @Nullable Handler handler, @NotNull Function0<Unit> function0, @NotNull C8235a c8235a, @NotNull InterfaceC9557b<? super C6443g0> interfaceC9557b) {
            C14175a c14175a;
            C6443g0 c6443g0;
            C6443g0 c6443g1;
            if (interfaceC9557b instanceof C14175a) {
                c14175a = (C14175a) interfaceC9557b;
                int i10 = c14175a.f24450G;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c14175a.f24450G = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c14175a = new C14175a(interfaceC9557b);
                }
            } else {
                c14175a = new C14175a(interfaceC9557b);
            }
            Object objM28089g = c14175a.f24448E;
            Object objM38805e = C10047c.m38805e();
            int i11 = c14175a.f24450G;
            if (i11 == 0) {
                C7348o.m30470b(objM28089g);
                C6443g0 c6443g2 = new C6443g0(c6445h0, list, handler, cameraCharacteristics, function0, c8235a.m33597a(), null);
                c14175a.f24451t = C10350l.m39676a(c6445h0);
                c14175a.f24452u = C10350l.m39676a(cameraCharacteristics);
                c14175a.f24453v = C10350l.m39676a(list);
                c14175a.f24454w = C10350l.m39676a(cameraDevice);
                c14175a.f24455x = C10350l.m39676a(handler);
                c14175a.f24456y = C10350l.m39676a(function0);
                c14175a.f24457z = C10350l.m39676a(c8235a);
                c14175a.f24444A = c6443g2;
                c14175a.f24445B = C10350l.m39676a(c6443g2);
                c14175a.f24446C = c6443g2;
                c14175a.f24447D = 0;
                c14175a.f24450G = 1;
                objM28089g = c6443g2.m28089g(cameraDevice, c14175a);
                if (objM28089g == objM38805e) {
                    return objM38805e;
                }
                c6443g0 = c6443g2;
                c6443g1 = c6443g0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6443g0 = (C6443g0) c14175a.f24446C;
                c6443g1 = (C6443g0) c14175a.f24444A;
                C7348o.m30470b(objM28089g);
            }
            c6443g0.session = (CameraCaptureSession) objM28089g;
            return c6443g1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: hn.g0$b */
    @Metadata(m31664d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"hn/g0$b", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            super.onCaptureCompleted(session, request, result);
            C6443g0.this.onFrameReceived.invoke();
        }
    }

    /* JADX INFO: renamed from: hn.g0$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m31665d2 = {"hn/g0$c", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9557b<CameraCaptureSession> f24459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CameraDevice f24460b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super android.hardware.camera2.CameraCaptureSession> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC9557b<? super CameraCaptureSession> interfaceC9557b, CameraDevice cameraDevice) {
            this.f24459a = interfaceC9557b;
            this.f24460b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            RuntimeException runtimeException = new RuntimeException("Camera " + this.f24460b.getId() + " session configuration failed");
            InterfaceC9557b<CameraCaptureSession> interfaceC9557b = this.f24459a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(runtimeException)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.f24459a.resumeWith(C7347n.m30460b(session));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }
    }

    /* JADX INFO: renamed from: hn.g0$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", m39664f = "CameraCaptureSessionWrapper.kt", m39665l = {185, 187}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24461t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f24462u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C6443g0 f24463v;

        /* JADX INFO: renamed from: hn.g0$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", m39664f = "CameraCaptureSessionWrapper.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24464t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C6443g0 f24465u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6443g0 c6443g0, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24465u = c6443g0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f24465u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f24464t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f24465u.m28087e();
                this.f24465u.m28095m();
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, C6443g0 c6443g0, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f24462u = j10;
            this.f24463v = c6443g0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f24462u, this.f24463v, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (p256ku.C7872i.m32684g(r7, r1, r6) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24461t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f24462u;
                this.f24461t = 1;
                if (C7946z0.m32938b(j10, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
            a aVar = new a(this.f24463v, null);
            this.f24461t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 hn.h0)
      (r2v0 java.util.List)
      (r3v0 android.os.Handler)
      (r4v0 android.hardware.camera2.CameraCharacteristics)
      (r5v0 kotlin.jvm.functions.Function0)
      (r6v0 ku.p0)
     A[MD:(hn.h0, java.util.List<? extends android.view.Surface>, android.os.Handler, android.hardware.camera2.CameraCharacteristics, kotlin.jvm.functions.Function0<kotlin.Unit>, ku.p0):void (m)] (LINE:1) call: hn.g0.<init>(hn.h0, java.util.List, android.os.Handler, android.hardware.camera2.CameraCharacteristics, kotlin.jvm.functions.Function0, ku.p0):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6443g0(C6445h0 c6445h0, List list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0 function0, InterfaceC7906p0 interfaceC7906p0, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6445h0, list, handler, cameraCharacteristics, function0, interfaceC7906p0);
    }

    /* JADX INFO: renamed from: e */
    public final void m28087e() {
        this.meteringRect = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m28088f() {
        C7910q0.m32890f(this.coroutineScope, null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final Object m28089g(CameraDevice cameraDevice, InterfaceC9557b<? super CameraCaptureSession> interfaceC9557b) throws Throwable {
        C9560e c9560e = new C9560e(C10046b.m38803c(interfaceC9557b));
        m28094l(cameraDevice, this.targets, this.handler, new c(c9560e, cameraDevice));
        Object objM37701a = c9560e.m37701a();
        if (objM37701a == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM37701a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m28090h(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) {
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            CaptureRequest.Builder builderCreateCaptureRequest = session.getDevice().createCaptureRequest(1);
            Iterator<T> it = surfaces.iterator();
            while (it.hasNext()) {
                builderCreateCaptureRequest.addTarget((Surface) it.next());
            }
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.m28103g());
            if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            if (this.enableTorch) {
                builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            }
            MeteringRectangle meteringRectangle = this.meteringRect;
            if (meteringRectangle != null && m28091i()) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            }
            return C7347n.m30460b(builderCreateCaptureRequest.build());
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28091i() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) >= 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m28092j(boolean z10) {
        this.enableTorch = z10;
    }

    /* JADX INFO: renamed from: k */
    public final void m28093k(int x10, int y10, @NotNull Size size, long duration) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x10, y10), size, 1000);
        InterfaceC7850d2 interfaceC7850d2 = this.resetFocusJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.resetFocusJob = C7882k.m32780d(this.coroutineScope, null, null, new d(duration, this, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m28094l(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
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
    /* JADX INFO: renamed from: m */
    public final Object m28095m() {
        CameraCaptureSession cameraCaptureSession = this.session;
        CameraCaptureSession cameraCaptureSession2 = null;
        if (cameraCaptureSession == null) {
            Intrinsics.m31998u("session");
            cameraCaptureSession = null;
        }
        Object objM28090h = m28090h(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        if (!C7347n.m30466h(objM28090h)) {
            return C7347n.m30460b(objM28090h);
        }
        try {
            CaptureRequest captureRequest = (CaptureRequest) objM28090h;
            CameraCaptureSession cameraCaptureSession3 = this.session;
            if (cameraCaptureSession3 == null) {
                Intrinsics.m31998u("session");
            } else {
                cameraCaptureSession2 = cameraCaptureSession3;
            }
            cameraCaptureSession2.setRepeatingRequest(captureRequest, this.callback, this.handler);
            return C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.view.Surface> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6443g0(C6445h0 c6445h0, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0<Unit> function0, InterfaceC7906p0 interfaceC7906p0) {
        this.cameraChoice = c6445h0;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.onFrameReceived = function0;
        this.coroutineScope = interfaceC7906p0;
        this.callback = new b();
    }
}
