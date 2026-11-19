package yo;

import android.R;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
import av.z0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import cp.GovernmentIdHintWorker;
import fq.n1;
import fq.y1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.reflect.KTypeProjection;
import p001kotlin.text.StringsKt;
import rn.AlertContainerScreen;
import rn.AlertScreen;
import un.CameraChoices;
import vo.Frame;
import vo.GovernmentIdAnalyzeWorker;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$Jg\u0010-\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J[\u00101\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b1\u00102J[\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002032&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b4\u00105J[\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002062&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lyo/t0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lfq/n1;", "permissionRequestWorkflow", "Lvo/o$a;", "governmentIdAnalyzeWorkerFactory", "Lcp/a$b;", "governmentIdHintWorkerFactory", "Ljs/b$a;", "webRtcWorkerFactory", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lfq/n1;Lvo/o$a;Lcp/a$b;Ljs/b$a;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$n;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/j0;", "Lvo/d2$b;", "context", "Lks/a;", "webRtcManager", BuildConfig.FLAVOR, "G0", "(Lvo/d2$a;Lvo/j0$n;Lln/k$a;Lks/a;)V", "Lvo/f;", "captureConfig", "Lip/l;", "videoCaptureHelper", "Lsn/v;", "cameraProperties", "Lvo/n$b;", "capturedId", "T", "(Lvo/d2$a;Lvo/j0;Lln/k$a;Lvo/f;Lip/l;Lsn/v;Lvo/n$b;)V", "Lln/h;", "sink", "n0", "(Lvo/d2$a;Lvo/j0$n;Lln/k$a;Lip/l;Lln/h;)Ljava/lang/Object;", "Lvo/j0$d;", "Y", "(Lvo/d2$a;Lvo/j0$d;Lln/k$a;Lip/l;Lln/h;)Ljava/lang/Object;", "Lvo/j0$g;", "j0", "(Lvo/d2$a;Lvo/j0$g;Lln/k$a;Lip/l;Lln/h;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lfq/n1;", "c", "Lvo/o$a;", "d", "Lcp/a$b;", "e", "Ljs/b$a;", "f", "Lsn/a0$a;", "g", "Lun/c$a;", "h", "Lir/b;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final js.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$1", f = "CaptureRenderer.kt", l = {454}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38045t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ vo.j0.HolographicTorchDelay f38046u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<d2.a, vo.j0, d2.b, Object>.a f38047v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vo.j0.HolographicTorchDelay holographicTorchDelay, ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a aVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f38046u = holographicTorchDelay;
            this.f38047v = aVar;
        }

        public static final Unit p(ln.r.c cVar) {
            Object objC = cVar.c();
            vo.j0.HolographicTorchDelay holographicTorchDelay = objC instanceof vo.j0.HolographicTorchDelay ? (vo.j0.HolographicTorchDelay) objC : null;
            if (holographicTorchDelay == null) {
                return Unit.f21506a;
            }
            cVar.e(vo.j0.HolographicTorchDelay.H(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f38046u, this.f38047v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f38045t;
            if (i10 == 0) {
                zt.o.b(obj);
                p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                long jP = p001kotlin.time.b.p(this.f38046u.getTorchDurationMs(), zu.b.MILLISECONDS);
                this.f38045t = 1;
                if (z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f38047v.d().a(ln.b0.c(null, new Function1() { // from class: yo.s0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return t0.a.p((ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2", f = "CaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38048t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d2.a f38050v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ vo.j0.HolographicTorchDelay f38051w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ln.k<d2.a, vo.j0, d2.b, Object>.a f38052x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ip.l f38053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d2.a aVar, vo.j0.HolographicTorchDelay holographicTorchDelay, ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a aVar2, ip.l lVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f38050v = aVar;
            this.f38051w = holographicTorchDelay;
            this.f38052x = aVar2;
            this.f38053y = lVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return t0.this.new b(this.f38050v, this.f38051w, this.f38052x, this.f38053y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f38048t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            t0 t0Var = t0.this;
            d2.a aVar = this.f38050v;
            vo.j0.HolographicTorchDelay holographicTorchDelay = this.f38051w;
            t0Var.T(aVar, holographicTorchDelay, this.f38052x, holographicTorchDelay.getCaptureConfig(), this.f38053y, this.f38051w.getCameraProperties(), this.f38051w.getCapturedImage());
            return Unit.f21506a;
        }
    }

    public t0(@NotNull Context applicationContext, @NotNull n1 permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull js.b.a webRtcWorkerFactory, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit A0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new d2.b.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.f21506a;
    }

    public static final Unit B0(vo.j0.WaitForAutocapture waitForAutocapture, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == y3.b.a.Hidden) {
            action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f21506a;
    }

    public static final ln.r C0(final cp.d dVar) {
        return ln.b0.c(null, new Function1() { // from class: yo.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.D0(dVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit D0(cp.d dVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f21506a;
        }
        action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, dVar, null, 24575, null));
        return Unit.f21506a;
    }

    public static final ln.r E0(final vo.j0.WaitForAutocapture waitForAutocapture, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.b0.c(null, new Function1() { // from class: yo.o
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.F0(waitForAutocapture, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit F0(vo.j0.WaitForAutocapture waitForAutocapture, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == y3.b.a.Hidden) {
            action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f21506a;
    }

    public static final ln.r H0(final t0 t0Var, final ks.a aVar, final vo.j0.WaitForAutocapture waitForAutocapture, final d2.a aVar2, final ln.k.a aVar3, final js.b.AbstractC0389b it) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices cameraChoicesB = un.f0.b(t0Var.applicationContext, un.m0.FRONT);
        if (it instanceof js.b.AbstractC0389b.C0390b) {
            return ln.b0.c(null, new Function1() { // from class: yo.a0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.I0(aVar, t0Var, cameraChoicesB, it, waitForAutocapture, aVar2, aVar3, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof js.b.AbstractC0389b.Error) {
            return ln.b0.c(null, new Function1() { // from class: yo.b0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.O0(aVar3, aVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit I0(final ks.a aVar, final t0 t0Var, CameraChoices cameraChoices, js.b.AbstractC0389b abstractC0389b, final vo.j0.WaitForAutocapture waitForAutocapture, final d2.a aVar2, final ln.k.a aVar3, ln.r.c action) {
        int i10;
        int i11;
        un.h0 primaryChoice;
        un.h0 primaryChoice2;
        un.h0 primaryChoice3;
        Size size;
        un.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture2 = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == ip.x.Connecting) {
            return Unit.f21506a;
        }
        if (waitForAutocapture2 != null) {
            action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, ip.x.Connecting, null, null, false, false, null, null, null, 32639, null));
        }
        if (aVar != null) {
            aVar.b(t0Var.webRtcWorkerFactory.getService());
        }
        if (aVar != null) {
            aVar.i(t0Var.applicationContext);
        }
        int height = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            height = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i10 = height;
            i11 = width;
        } else {
            i11 = height;
            i10 = width;
        }
        if (aVar != null) {
            js.b.AbstractC0389b.C0390b c0390b = (js.b.AbstractC0389b.C0390b) abstractC0389b;
            aVar.f(c0390b.getResult().getUsername(), c0390b.getResult().getCredential(), c0390b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i11, i10, aVar2.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: yo.f0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.J0(this.f37990a, aVar2, waitForAutocapture);
                }
            }, new Function0() { // from class: yo.g0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.K0(aVar3, aVar);
                }
            }, new Function0() { // from class: yo.i0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.M0(this.f37997a, aVar2);
                }
            }, new Function1() { // from class: yo.j0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.N0(this.f38001a, (String) obj);
                }
            });
        }
        return Unit.f21506a;
    }

    public static final Unit J0(t0 t0Var, d2.a aVar, vo.j0.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(t0Var.trackingEventsLogger, aVar.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f21506a;
    }

    public static final Unit K0(ln.k.a aVar, final ks.a aVar2) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.L0(aVar2, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit L0(ks.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.a();
        action.e(new vo.j0.RestartStep(null, null, null, null, 0, ((vo.j0) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f21506a;
    }

    public static final Unit M0(t0 t0Var, d2.a aVar) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(t0Var.trackingEventsLogger, aVar.getFromStep(), null, false, 6, null);
        return Unit.f21506a;
    }

    public static final Unit N0(t0 t0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(t0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f21506a;
    }

    public static final Unit O0(ln.k.a aVar, final ks.a aVar2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == ip.x.Connecting) {
            return Unit.f21506a;
        }
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.e0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.P0(aVar2, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit P0(ks.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (aVar != null) {
            aVar.a();
        }
        action.e(new vo.j0.RestartStep(null, null, null, null, 0, ((vo.j0) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f21506a;
    }

    public static final Unit U(vo.j0 j0Var, i3.SideIdPart sideIdPart, vo.f fVar, sn.v vVar, int i10, vo.n.GovernmentIdImage governmentIdImage, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != j0Var.getClass()) {
            return Unit.f21506a;
        }
        action.e(new vo.j0.HolographicTorchDelay(sideIdPart, j0Var.D(), j0Var.C(), j0Var.getPartIndex(), j0Var.getBackState(), j0Var.getCountryCode(), fVar, vVar, i10, governmentIdImage, false, Barcode.FORMAT_UPC_E, null));
        return Unit.f21506a;
    }

    public static final Unit V(ln.k.a aVar, final ip.l lVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.c0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.W(lVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit W(ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit X(vo.j0 j0Var, vo.f fVar, vo.n.GovernmentIdImage governmentIdImage, vo.j0.WaitForAutocapture waitForAutocapture, sn.v vVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        i3 currentPart = j0Var.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.f21506a;
        }
        action.e(new vo.j0.ReviewCapturedImage(sideIdPart, ((vo.j0) action.c()).D(), fVar, governmentIdImage, ((vo.j0) action.c()).C(), ((vo.j0) action.c()).getPartIndex(), waitForAutocapture, vVar, null, false, ((vo.j0) action.c()).getCountryCode(), 768, null));
        return Unit.f21506a;
    }

    public static final ln.r Z(final cp.d dVar) {
        return ln.b0.c(null, new Function1() { // from class: yo.p
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.a0(dVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit a0(cp.d dVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.CountdownToCapture countdownToCapture = objC instanceof vo.j0.CountdownToCapture ? (vo.j0.CountdownToCapture) objC : null;
        if (countdownToCapture == null) {
            return Unit.f21506a;
        }
        action.e(vo.j0.CountdownToCapture.H(countdownToCapture, null, null, null, null, null, 0, null, null, dVar, 255, null));
        return Unit.f21506a;
    }

    public static final Unit b0(ln.h hVar) {
        hVar.a(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit c0(ln.k.a aVar, ip.l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    public static final Unit d0(vo.j0.CountdownToCapture countdownToCapture, t0 t0Var, d2.a aVar, ln.k.a aVar2, ip.l lVar, List absolutePaths, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listJ3 = countdownToCapture.getIdForReview().j3();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listJ3, 10));
        Iterator<T> it = listJ3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listW0 = CollectionsKt.w0(arrayList, absolutePaths);
        vo.f captureConfig = countdownToCapture.getCaptureConfig();
        vo.n.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listW0;
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        t0Var.T(aVar, countdownToCapture, aVar2, captureConfig, lVar, cameraProperties, vo.n.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f21506a;
    }

    public static final Unit e0(final ln.k.a aVar, final vo.j0.CountdownToCapture countdownToCapture, final d2.a aVar2, final ip.l lVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.f0(countdownToCapture, aVar2, error, aVar, lVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit f0(vo.j0.CountdownToCapture countdownToCapture, d2.a aVar, Throwable th2, final ln.k.a aVar2, final ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.CountdownToCapture countdownToCapture2 = objC instanceof vo.j0.CountdownToCapture ? (vo.j0.CountdownToCapture) objC : null;
        if (countdownToCapture2 == null) {
            return Unit.f21506a;
        }
        action.e(new vo.j0.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.D(), countdownToCapture.getCaptureConfig(), b3.O((d2.a) action.b(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.C(), countdownToCapture2.getPartIndex(), b3.x(action, false), ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), th2, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: yo.d0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.g0(aVar2, lVar);
            }
        }, 11264, null));
        return Unit.f21506a;
    }

    public static final Unit g0(ln.k.a aVar, final ip.l lVar) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.k0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.h0(lVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit h0(ip.l lVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit i0(t0 t0Var, ln.k.a aVar, d2.a aVar2, ip.l lVar) {
        b3.U(t0Var.applicationContext, aVar, aVar2, lVar.c(aVar2));
        return Unit.f21506a;
    }

    public static final Unit k0(ln.h hVar) {
        hVar.a(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit l0(ln.k.a aVar, ip.l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    public static final Unit m0(t0 t0Var, ln.k.a aVar, d2.a aVar2) {
        b3.U(t0Var.applicationContext, aVar, aVar2, true);
        return Unit.f21506a;
    }

    public static final Unit o0(ln.k.a aVar, AlertScreen.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.m
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.p0((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit p0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        vo.j0 j0Var = (vo.j0) action.c();
        if (j0Var instanceof vo.j0.WaitForAutocapture) {
            action.e(vo.j0.WaitForAutocapture.L((vo.j0.WaitForAutocapture) j0Var, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.f21506a;
    }

    public static final Unit q0(vo.j0.WaitForAutocapture waitForAutocapture, vo.f fVar, t0 t0Var, d2.a aVar, ln.k.a aVar2, ip.l lVar, List absolutePaths, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        t0Var.T(aVar, waitForAutocapture, aVar2, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new vo.n.GovernmentIdImage(arrayList, b3.e0(waitForAutocapture.getCurrentPart().getSide()), vo.g.b(fVar), vo.n.a.b, null, null, 32, null));
        return Unit.f21506a;
    }

    public static final Unit r0(ln.h hVar) {
        hVar.a(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit s0(ln.k.a aVar, ip.l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    public static final Unit t0(ln.k.a aVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.q
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.u0(error, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit u0(Throwable th2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f21506a;
        }
        action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, th2, false, false, null, null, null, 32247, null));
        return Unit.f21506a;
    }

    public static final Unit v0(t0 t0Var, final vo.j0.WaitForAutocapture waitForAutocapture, ln.k.a aVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, b3.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: yo.z
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.w0(waitForAutocapture, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit w0(vo.j0.WaitForAutocapture waitForAutocapture, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f21506a;
    }

    public static final Unit x0(t0 t0Var, ln.k.a aVar, d2.a aVar2, ip.l lVar) {
        b3.U(t0Var.applicationContext, aVar, aVar2, lVar.c(aVar2));
        return Unit.f21506a;
    }

    public static final ln.r y0(final t0 t0Var, final vo.j0.WaitForAutocapture waitForAutocapture, final vo.f fVar, zt.n nVar) {
        Object value = nVar.getValue();
        Throwable thE = zt.n.e(value);
        if (thE == null) {
            final vo.n.GovernmentIdImage governmentIdImage = (vo.n.GovernmentIdImage) value;
            return ln.b0.c(null, new Function1() { // from class: yo.u
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.z0(this.f38054a, waitForAutocapture, fVar, governmentIdImage, (ln.r.c) obj);
                }
            }, 1, null);
        }
        String message = thE.getMessage();
        return (message == null || !StringsKt.a0(message, "ENOSPC", false, 2, null)) ? ln.b0.c(null, new Function1() { // from class: yo.x
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.B0(waitForAutocapture, (ln.r.c) obj);
            }
        }, 1, null) : ln.b0.c(null, new Function1() { // from class: yo.v
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.A0((ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit z0(t0 t0Var, vo.j0.WaitForAutocapture waitForAutocapture, vo.f fVar, vo.n.GovernmentIdImage governmentIdImage, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, b3.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        Object objC = action.c();
        vo.j0.WaitForAutocapture waitForAutocapture2 = objC instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 == null) {
            return Unit.f21506a;
        }
        action.e(new vo.j0.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((vo.j0) action.c()).D(), fVar, governmentIdImage, waitForAutocapture2.C(), waitForAutocapture2.getPartIndex(), b3.x(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.f21506a;
    }

    public final void G0(final d2.a renderProps, final vo.j0.WaitForAutocapture renderState, final ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a context, final ks.a webRtcManager) {
        ln.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), p001kotlin.jvm.internal.d0.k(js.b.class), BuildConfig.FLAVOR, new Function1() { // from class: yo.k
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.H0(this.f38002a, webRtcManager, renderState, renderProps, context, (js.b.AbstractC0389b) obj);
            }
        });
    }

    public final void T(d2.a renderProps, final vo.j0 renderState, final ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a context, final vo.f captureConfig, final ip.l videoCaptureHelper, final sn.v cameraProperties, final vo.n.GovernmentIdImage capturedId) {
        boolean z10 = false;
        if (!(renderState instanceof vo.j0.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod govIdCaptureMethodB = vo.x.b(capturedId.getCaptureMethod());
            IdConfig.e eVarQ = b3.Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethodB, eVarQ != null ? b3.d0(eVarQ) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int iIntValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        i3 currentPart = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        IdConfig idConfigC = vo.g.c(captureConfig);
        if (videoCaptureHelper.c(renderProps) && iIntValue > 0 && renderState.D().isEmpty() && sideIdPart != null) {
            z10 = true;
        }
        if (!(renderState instanceof vo.j0.HolographicTorchDelay) && z10) {
            final int i10 = iIntValue;
            final i3.SideIdPart sideIdPart2 = sideIdPart;
            context.d().a(ln.b0.c(null, new Function1() { // from class: yo.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.U(renderState, sideIdPart2, captureConfig, cameraProperties, i10, capturedId, (ln.r.c) obj);
                }
            }, 1, null));
            return;
        }
        boolean zC = videoCaptureHelper.c(renderProps);
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigC != null && (zC || shouldSkipReviewScreen)) {
            b3.W(renderState, context, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? renderState.C() : null, (3584 & Barcode.FORMAT_UPC_A) != 0 ? renderState.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? renderState.getCountryCode() : null);
        } else {
            if (sideIdPart == null) {
                return;
            }
            final vo.j0.WaitForAutocapture waitForAutocapture = new vo.j0.WaitForAutocapture(sideIdPart, renderState.D(), captureConfig, b3.O(renderProps, sideIdPart.getSide()), renderState.C(), renderState.getPartIndex(), renderState.getBackState(), ip.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: yo.s
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.V(context, videoCaptureHelper);
                }
            }, 11776, null);
            context.d().a(ln.b0.c(null, new Function1() { // from class: yo.t
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.X(renderState, captureConfig, capturedId, waitForAutocapture, cameraProperties, (ln.r.c) obj);
                }
            }, 1, null));
        }
    }

    @NotNull
    public final Object Y(@NotNull final d2.a renderProps, @NotNull final vo.j0.CountdownToCapture renderState, @NotNull final ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper, @NotNull final ln.h<? super d2.b> sink) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        ln.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), p001kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), BuildConfig.FLAVOR, new Function1() { // from class: yo.h0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.Z((cp.d) obj);
            }
        });
        String strK = b3.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), vo.g.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String strJ = b3.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), vo.g.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.e side = renderState.getCurrentPart().getSide();
        y3.b.a aVar = y3.b.a.Disabled;
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(renderState.getCaptureConfig());
        ir.a aVarB = this.navigationStateManager.b();
        List<sn.e> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1A = b3.A(context, false, 1, null);
        zn.a aVarE = videoCaptureHelper.e(renderProps);
        String strR = b3.R(renderProps.getStrings(), renderState.getHint());
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(y1.c(vo.i0.f(renderProps, strK, strJ, capturing, aVar, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: vo.d0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.h((List) obj, (sn.v) obj2);
            }
        } : null, new Function0() { // from class: yo.m0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.b0(sink);
            }
        }, new Function0() { // from class: yo.n0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.c0(context, videoCaptureHelper);
            }
        }, true, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1610874880) != 0 ? new Function2() { // from class: vo.e0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.i((List) obj, (sn.v) obj2);
            }
        } : new Function2() { // from class: yo.o0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.d0(renderState, this, renderProps, context, videoCaptureHelper, (List) obj, (sn.v) obj2);
            }
        }, (524288 & 1610874880) != 0 ? new Function1() { // from class: vo.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i0.j((Throwable) obj);
            }
        } : new Function1() { // from class: yo.p0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.e0(context, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
            }
        }, function1A, (2097152 & 1610874880) != 0 ? zn.a.None : aVarE, (4194304 & 1610874880) != 0, (8388608 & 1610874880) != 0 ? false : false, (16777216 & 1610874880) != 0 ? false : false, (33554432 & 1610874880) != 0 ? new Function2() { // from class: vo.g0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.k((File) obj, (sn.v) obj2);
            }
        } : null, (67108864 & 1610874880) != 0 ? new Function0() { // from class: vo.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.l();
            }
        } : null, new Function0() { // from class: yo.q0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.i0(this.f38022a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1610874880) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (536870912 & 1610874880) != 0 ? null : strR, (1073741824 & 1610874880) != 0 ? null : null, (1610874880 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? kr.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object j0(@NotNull d2.a renderProps, @NotNull vo.j0.HolographicTorchDelay renderState, @NotNull final ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper, @NotNull final ln.h<? super d2.b> sink) {
        final t0 t0Var;
        final d2.a renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        context.b("holographic_torch_delay", new a(renderState, context, null));
        if (renderState.getHolographicTorchEnabled()) {
            t0Var = this;
        } else {
            b bVar = new b(renderProps2, renderState, context, videoCaptureHelper, null);
            t0Var = this;
            renderProps2 = renderProps2;
            context.b("holographic_torch_complete", bVar);
        }
        vo.f captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = vo.g.b(captureConfig);
        IdConfig.e side = renderState.getCurrentPart().getSide();
        String strK = b3.K(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String strJ = b3.J(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        y3.b.a aVar = y3.b.a.Disabled;
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(captureConfig);
        ir.a aVarB = t0Var.navigationStateManager.b();
        List listK = p001kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = b3.A(context, false, 1, null);
        zn.a aVarE = videoCaptureHelper.e(renderProps2);
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(y1.c(vo.i0.f(renderProps2, strK, strJ, capturing, aVar, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: vo.d0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.h((List) obj, (sn.v) obj2);
            }
        } : null, new Function0() { // from class: yo.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.k0(sink);
            }
        }, new Function0() { // from class: yo.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.l0(context, videoCaptureHelper);
            }
        }, false, listK, renderState, partIndex, t0Var.cameraXControllerFactory, t0Var.camera2ControllerFactory, (262144 & 1610874880) != 0 ? new Function2() { // from class: vo.e0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.i((List) obj, (sn.v) obj2);
            }
        } : null, (524288 & 1610874880) != 0 ? new Function1() { // from class: vo.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i0.j((Throwable) obj);
            }
        } : null, function1A, (2097152 & 1610874880) != 0 ? zn.a.None : aVarE, (4194304 & 1610874880) != 0, (8388608 & 1610874880) != 0 ? false : false, (16777216 & 1610874880) != 0 ? false : false, (33554432 & 1610874880) != 0 ? new Function2() { // from class: vo.g0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.k((File) obj, (sn.v) obj2);
            }
        } : null, (67108864 & 1610874880) != 0 ? new Function0() { // from class: vo.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.l();
            }
        } : null, new Function0() { // from class: yo.w
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.m0(this.f38065a, context, renderProps2);
            }
        }, (268435456 & 1610874880) != 0 ? renderProps2.getImageCaptureCount() : 0, (536870912 & 1610874880) != 0 ? null : null, (1073741824 & 1610874880) != 0 ? null : null, (1610874880 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : renderState.getHolographicTorchEnabled(), (3 & 2) != 0 ? kr.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object n0(@NotNull final d2.a renderProps, @NotNull final vo.j0.WaitForAutocapture renderState, @NotNull final ln.k<? super d2.a, vo.j0, ? extends d2.b, ? extends Object>.a context, @NotNull final ip.l videoCaptureHelper, @NotNull final ln.h<? super d2.b> sink) {
        ip.l lVar;
        cq.c<Object, Object> cVarC;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final vo.f captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = vo.g.b(captureConfig);
        boolean z10 = captureConfig instanceof vo.f.AutoClassifyConfig;
        ln.w.l(context, this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), p001kotlin.jvm.internal.d0.k(GovernmentIdAnalyzeWorker.class), BuildConfig.FLAVOR, new Function1() { // from class: yo.r0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.y0(this.f38030a, renderState, captureConfig, (zt.n) obj);
            }
        });
        ln.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), p001kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), BuildConfig.FLAVOR, new Function1() { // from class: yo.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.C0((cp.d) obj);
            }
        });
        zn.a aVarE = videoCaptureHelper.e(renderProps);
        zn.a aVar = zn.a.Stream;
        boolean z11 = aVarE == aVar && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z11) {
            ln.w.l(context, ln.o.Companion.b(ln.o.INSTANCE, p001kotlin.ranges.d.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.k(Unit.class))), idSideConfigD.getSideKey(), new Function1() { // from class: yo.c
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.E0(renderState, (Unit) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapG = p001kotlin.collections.j0.g(zt.s.a(AlertScreen.a.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string = this.applicationContext.getString(jq.g.f20884n);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(mapG, string, null, false, new Function1() { // from class: yo.d
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.o0(context, (AlertScreen.b) obj);
                }
            }, 12, null));
        }
        String strK = b3.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strJ = b3.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strP = b3.P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode(), z10);
        IdConfig.e side = renderState.getCurrentPart().getSide();
        y3.b.a manualCapture = renderState.getManualCapture();
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(captureConfig);
        ir.a aVarB = this.navigationStateManager.b();
        List<sn.e> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = b3.A(context, false, 1, null);
        zn.a aVarE2 = videoCaptureHelper.e(renderProps);
        String strR = b3.R(renderProps.getStrings(), renderState.getHint());
        zo.i iVarL = b3.L(renderProps, renderState.getCurrentPart().getSide());
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        y3.b bVarF = vo.i0.f(renderProps, strK, strJ, strP, manualCapture, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: vo.d0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.h((List) obj, (sn.v) obj2);
            }
        } : new Function2() { // from class: yo.e
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.q0(renderState, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (sn.v) obj2);
            }
        }, new Function0() { // from class: yo.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.r0(sink);
            }
        }, new Function0() { // from class: yo.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.s0(context, videoCaptureHelper);
            }
        }, false, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1610874880) != 0 ? new Function2() { // from class: vo.e0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.i((List) obj, (sn.v) obj2);
            }
        } : null, (524288 & 1610874880) != 0 ? new Function1() { // from class: vo.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i0.j((Throwable) obj);
            }
        } : new Function1() { // from class: yo.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.t0(context, (Throwable) obj);
            }
        }, function1A, (2097152 & 1610874880) != 0 ? zn.a.None : aVarE2, (4194304 & 1610874880) != 0, (8388608 & 1610874880) != 0 ? false : false, (16777216 & 1610874880) != 0 ? false : false, (33554432 & 1610874880) != 0 ? new Function2() { // from class: vo.g0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.k((File) obj, (sn.v) obj2);
            }
        } : null, (67108864 & 1610874880) != 0 ? new Function0() { // from class: vo.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.l();
            }
        } : new Function0() { // from class: yo.i
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.v0(this.f37995a, renderState, context);
            }
        }, new Function0() { // from class: yo.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.x0(this.f37998a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1610874880) != 0 ? renderProps.getImageCaptureCount() : 0, (536870912 & 1610874880) != 0 ? null : strR, (1073741824 & 1610874880) != 0 ? null : iVarL, (1610874880 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? kr.l.SLIDE_IN : null);
        if (renderState.getCheckCameraPermissions()) {
            cVarC = b3.j0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                lVar = videoCaptureHelper;
                if (lVar.c(renderProps) && xq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    cVarC = b3.f0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                }
            } else {
                lVar = videoCaptureHelper;
            }
            if (lVar.e(renderProps) == aVar && renderState.getWebRtcState() == ip.x.Disconnected) {
                G0(renderProps, renderState, context, lVar.getWebRtcManager());
                cVarC = y1.c(bVarF);
            } else {
                cVarC = y1.c(bVarF);
            }
        }
        return new AlertContainerScreen(cVarC, arrayList);
    }
}
