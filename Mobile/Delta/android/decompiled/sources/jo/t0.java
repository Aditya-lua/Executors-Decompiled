package jo;

import android.R;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
import cn.AlertContainerScreen;
import cn.AlertScreen;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import fn.CameraChoices;
import iu.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import mo.GovernmentIdHintWorker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$Jg\u0010-\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J[\u00101\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b1\u00102J[\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002032&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b4\u00105J[\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002062&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Ljo/t0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Lmo/a$b;", "governmentIdHintWorkerFactory", "Lrr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Lmo/a$b;Lrr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lsr/a;", "webRtcManager", "", "G0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;Lsr/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lso/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "T", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lso/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "Lwm/h;", "sink", "n0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Y", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "d", "Lmo/a$b;", "e", "Lrr/b$a;", "f", "Lcom/withpersona/sdk2/camera/e$a;", "g", "Lfn/c$a;", "h", "Lsq/a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rr.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$1", f = "CaptureRenderer.kt", l = {454}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22101t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f22102u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f22103v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f22102u = holographicTorchDelay;
            this.f22103v = aVar;
        }

        public static final Unit n(wm.r.c cVar) {
            Object objC = cVar.c();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = objC instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) objC : null;
            if (holographicTorchDelay == null) {
                return Unit.f22938a;
            }
            cVar.e(GovernmentIdState.HolographicTorchDelay.J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f22938a;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f22102u, this.f22103v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22101t;
            if (i10 == 0) {
                gt.o.b(obj);
                kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                long jP = kotlin.time.b.p(this.f22102u.getTorchDurationMs(), hu.b.MILLISECONDS);
                this.f22101t = 1;
                if (z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            this.f22103v.d().a(wm.b0.c(null, new Function1() { // from class: jo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return t0.a.n((wm.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2", f = "CaptureRenderer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22104t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f22106v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f22107w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ wm.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f22108x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ so.l f22109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, so.l lVar, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f22106v = input;
            this.f22107w = holographicTorchDelay;
            this.f22108x = aVar;
            this.f22109y = lVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return t0.this.new b(this.f22106v, this.f22107w, this.f22108x, this.f22109y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f22104t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            t0 t0Var = t0.this;
            GovernmentIdWorkflow.Input input = this.f22106v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f22107w;
            t0Var.T(input, holographicTorchDelay, this.f22108x, holographicTorchDelay.getCaptureConfig(), this.f22109y, this.f22107w.getCameraProperties(), this.f22107w.getCapturedImage());
            return Unit.f22938a;
        }
    }

    public t0(@NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull rr.b.a webRtcWorkerFactory, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull fn.c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit A0(wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.f22938a;
    }

    public static final Unit B0(GovernmentIdState.WaitForAutocapture waitForAutocapture, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22938a;
    }

    public static final wm.r C0(final Hint hint) {
        return wm.b0.c(null, new Function1() { // from class: jo.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.D0(hint, (wm.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit D0(Hint hint, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f22938a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f22938a;
    }

    public static final wm.r E0(final GovernmentIdState.WaitForAutocapture waitForAutocapture, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return wm.b0.c(null, new Function1() { // from class: jo.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.F0(waitForAutocapture, (wm.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit F0(GovernmentIdState.WaitForAutocapture waitForAutocapture, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22938a;
    }

    public static final wm.r H0(final t0 t0Var, final sr.a aVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final wm.k.a aVar2, final rr.b.AbstractC0541b it) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices cameraChoicesB = fn.f0.b(t0Var.applicationContext, fn.m0.FRONT);
        if (it instanceof rr.b.AbstractC0541b.C0542b) {
            return wm.b0.c(null, new Function1() { // from class: jo.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.I0(aVar, t0Var, cameraChoicesB, it, waitForAutocapture, input, aVar2, (wm.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof rr.b.AbstractC0541b.Error) {
            return wm.b0.c(null, new Function1() { // from class: jo.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.O0(aVar2, aVar, (wm.r.c) obj);
                }
            }, 1, null);
        }
        throw new gt.l();
    }

    public static final Unit I0(final sr.a aVar, final t0 t0Var, CameraChoices cameraChoices, rr.b.AbstractC0541b abstractC0541b, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final wm.k.a aVar2, wm.r.c action) {
        int i10;
        int i11;
        fn.h0 primaryChoice;
        fn.h0 primaryChoice2;
        fn.h0 primaryChoice3;
        Size size;
        fn.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == so.x.Connecting) {
            return Unit.f22938a;
        }
        if (waitForAutocapture2 != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, so.x.Connecting, null, null, false, false, null, null, null, 32639, null));
        }
        if (aVar != null) {
            aVar.c(t0Var.webRtcWorkerFactory.getService());
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
            rr.b.AbstractC0541b.C0542b c0542b = (rr.b.AbstractC0541b.C0542b) abstractC0541b;
            aVar.f(c0542b.getResult().getUsername(), c0542b.getResult().getCredential(), c0542b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: jo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.J0(this.f22046a, input, waitForAutocapture);
                }
            }, new Function0() { // from class: jo.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.K0(aVar2, aVar);
                }
            }, new Function0() { // from class: jo.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.M0(this.f22053a, input);
                }
            }, new Function1() { // from class: jo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.N0(this.f22057a, (String) obj);
                }
            });
        }
        return Unit.f22938a;
    }

    public static final Unit J0(t0 t0Var, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f22938a;
    }

    public static final Unit K0(wm.k.a aVar, final sr.a aVar2) {
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.L0(aVar2, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit L0(sr.a aVar, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.a();
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22938a;
    }

    public static final Unit M0(t0 t0Var, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f22938a;
    }

    public static final Unit N0(t0 t0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(t0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f22938a;
    }

    public static final Unit O0(wm.k.a aVar, final sr.a aVar2, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == so.x.Connecting) {
            return Unit.f22938a;
        }
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.P0(aVar2, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit P0(sr.a aVar, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (aVar != null) {
            aVar.a();
        }
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22938a;
    }

    public static final Unit U(GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, CaptureConfig captureConfig, CameraProperties cameraProperties, int i10, GovernmentId.GovernmentIdImage governmentIdImage, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != governmentIdState.getClass()) {
            return Unit.f22938a;
        }
        action.e(new GovernmentIdState.HolographicTorchDelay(sideIdPart, governmentIdState.E(), governmentIdState.D(), governmentIdState.getPartIndex(), governmentIdState.getBackState(), governmentIdState.getCountryCode(), captureConfig, cameraProperties, i10, governmentIdImage, false, Barcode.FORMAT_UPC_E, null));
        return Unit.f22938a;
    }

    public static final Unit V(wm.k.a aVar, final so.l lVar) {
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.W(lVar, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit W(so.l lVar, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.Connected : so.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22938a;
    }

    public static final Unit X(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        IdPart currentPart = governmentIdState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.f22938a;
        }
        action.e(new GovernmentIdState.ReviewCapturedImage(sideIdPart, ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, ((GovernmentIdState) action.c()).D(), ((GovernmentIdState) action.c()).getPartIndex(), waitForAutocapture, cameraProperties, null, false, ((GovernmentIdState) action.c()).getCountryCode(), 768, null));
        return Unit.f22938a;
    }

    public static final wm.r Z(final Hint hint) {
        return wm.b0.c(null, new Function1() { // from class: jo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.a0(hint, (wm.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit a0(Hint hint, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture = objC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objC : null;
        if (countdownToCapture == null) {
            return Unit.f22938a;
        }
        action.e(GovernmentIdState.CountdownToCapture.J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f22938a;
    }

    public static final Unit b0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit c0(wm.k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22938a;
    }

    public static final Unit d0(GovernmentIdState.CountdownToCapture countdownToCapture, t0 t0Var, GovernmentIdWorkflow.Input input, wm.k.a aVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listF3 = countdownToCapture.getIdForReview().f3();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listF3, 10));
        Iterator<T> it = listF3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listW0 = CollectionsKt.w0(arrayList, absolutePaths);
        CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
        GovernmentId.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listW0;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        t0Var.T(input, countdownToCapture, aVar, captureConfig, lVar, cameraProperties, GovernmentId.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f22938a;
    }

    public static final Unit e0(final wm.k.a aVar, final GovernmentIdState.CountdownToCapture countdownToCapture, final GovernmentIdWorkflow.Input input, final so.l lVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.f0(countdownToCapture, input, error, aVar, lVar, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit f0(GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, Throwable th2, final wm.k.a aVar, final so.l lVar, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = objC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objC : null;
        if (countdownToCapture2 == null) {
            return Unit.f22938a;
        }
        action.e(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.E(), countdownToCapture.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O((GovernmentIdWorkflow.Input) action.b(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.D(), countdownToCapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), so.x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), th2, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: jo.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.g0(aVar, lVar);
            }
        }, 11264, null));
        return Unit.f22938a;
    }

    public static final Unit g0(wm.k.a aVar, final so.l lVar) {
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.h0(lVar, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit h0(so.l lVar, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.Connected : so.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22938a;
    }

    public static final Unit i0(t0 t0Var, wm.k.a aVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22938a;
    }

    public static final Unit k0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit l0(wm.k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22938a;
    }

    public static final Unit m0(t0 t0Var, wm.k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, true);
        return Unit.f22938a;
    }

    public static final Unit o0(wm.k.a aVar, AlertScreen.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.p0((wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit p0(wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.e(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.f22938a;
    }

    public static final Unit q0(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, t0 t0Var, GovernmentIdWorkflow.Input input, wm.k.a aVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        t0Var.T(input, waitForAutocapture, aVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.n.e0(waitForAutocapture.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig), GovernmentId.a.b, null, null, 32, null));
        return Unit.f22938a;
    }

    public static final Unit r0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit s0(wm.k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22938a;
    }

    public static final Unit t0(wm.k.a aVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.u0(error, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit u0(Throwable th2, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f22938a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, th2, false, false, null, null, null, 32247, null));
        return Unit.f22938a;
    }

    public static final Unit v0(t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, wm.k.a aVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        aVar.d().a(wm.b0.c(null, new Function1() { // from class: jo.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.w0(waitForAutocapture, (wm.r.c) obj);
            }
        }, 1, null));
        return Unit.f22938a;
    }

    public static final Unit w0(GovernmentIdState.WaitForAutocapture waitForAutocapture, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f22938a;
    }

    public static final Unit x0(t0 t0Var, wm.k.a aVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22938a;
    }

    public static final wm.r y0(final t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final CaptureConfig captureConfig, gt.n nVar) {
        Object value = nVar.getValue();
        Throwable thE = gt.n.e(value);
        if (thE == null) {
            final GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            return wm.b0.c(null, new Function1() { // from class: jo.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.z0(this.f22110a, waitForAutocapture, captureConfig, governmentIdImage, (wm.r.c) obj);
                }
            }, 1, null);
        }
        String message = thE.getMessage();
        return (message == null || !StringsKt.a0(message, "ENOSPC", false, 2, null)) ? wm.b0.c(null, new Function1() { // from class: jo.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.B0(waitForAutocapture, (wm.r.c) obj);
            }
        }, 1, null) : wm.b0.c(null, new Function1() { // from class: jo.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.A0((wm.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit z0(t0 t0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, wm.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 == null) {
            return Unit.f22938a;
        }
        action.e(new GovernmentIdState.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, waitForAutocapture2.D(), waitForAutocapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.f22938a;
    }

    public final void G0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final sr.a webRtcManager) {
        wm.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), kotlin.jvm.internal.d0.k(rr.b.class), "", new Function1() { // from class: jo.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.H0(this.f22058a, webRtcManager, renderState, renderProps, context, (rr.b.AbstractC0541b) obj);
            }
        });
    }

    public final void T(GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState, final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final CaptureConfig captureConfig, final so.l videoCaptureHelper, final CameraProperties cameraProperties, final GovernmentId.GovernmentIdImage capturedId) {
        boolean z10 = false;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod govIdCaptureMethodB = com.withpersona.sdk2.inquiry.governmentid.j.b(capturedId.getCaptureMethod());
            IdConfig.b bVarQ = com.withpersona.sdk2.inquiry.governmentid.n.Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethodB, bVarQ != null ? com.withpersona.sdk2.inquiry.governmentid.n.d0(bVarQ) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int iIntValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        IdConfig idConfigC = com.withpersona.sdk2.inquiry.governmentid.c.c(captureConfig);
        if (videoCaptureHelper.c(renderProps) && iIntValue > 0 && renderState.E().isEmpty() && sideIdPart != null) {
            z10 = true;
        }
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            final int i10 = iIntValue;
            final IdPart.SideIdPart sideIdPart2 = sideIdPart;
            context.d().a(wm.b0.c(null, new Function1() { // from class: jo.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.U(renderState, sideIdPart2, captureConfig, cameraProperties, i10, capturedId, (wm.r.c) obj);
                }
            }, 1, null));
            return;
        }
        boolean zC = videoCaptureHelper.c(renderProps);
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigC != null && (zC || shouldSkipReviewScreen)) {
            com.withpersona.sdk2.inquiry.governmentid.n.W(renderState, context, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, (3584 & 128) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? renderState.D() : null, (3584 & Barcode.FORMAT_UPC_A) != 0 ? renderState.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? renderState.getCountryCode() : null);
        } else {
            if (sideIdPart == null) {
                return;
            }
            final GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart.getSide()), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), so.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: jo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.V(context, videoCaptureHelper);
                }
            }, 11776, null);
            context.d().a(wm.b0.c(null, new Function1() { // from class: jo.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.X(renderState, captureConfig, capturedId, waitForAutocapture, cameraProperties, (wm.r.c) obj);
                }
            }, 1, null));
        }
    }

    @NotNull
    public final Object Y(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        wm.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: jo.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.Z((Hint) obj);
            }
        });
        String strK = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String strJ = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a aVar = Screen.b.a.Disabled;
        Screen.Overlay overlay = idSideConfigD.getOverlay();
        no.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(renderState.getCaptureConfig());
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a aVarE = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: jo.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.b0(sink);
            }
        }, new Function0() { // from class: jo.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.c0(context, videoCaptureHelper);
            }
        }, true, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: jo.o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.d0(renderState, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, (524288 & 1203765760) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : new Function1() { // from class: jo.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.e0(context, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
            }
        }, function1A, (2097152 & 1203765760) != 0 ? kn.a.None : aVarE, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : null, new Function0() { // from class: jo.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.i0(this.f22078a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (536870912 & 1203765760) != 0 ? null : strR, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? uq.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object j0(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        final t0 t0Var;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
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
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        String strK = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String strJ = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar = Screen.b.a.Disabled;
        Screen.Overlay overlay = idSideConfigD.getOverlay();
        no.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState navigationStateB = t0Var.navigationStateManager.b();
        List listK = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a aVarE = videoCaptureHelper.e(renderProps2);
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: jo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.k0(sink);
            }
        }, new Function0() { // from class: jo.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.l0(context, videoCaptureHelper);
            }
        }, false, listK, renderState, partIndex, t0Var.cameraXControllerFactory, t0Var.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : null, function1A, (2097152 & 1203765760) != 0 ? kn.a.None : aVarE, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : null, new Function0() { // from class: jo.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.m0(this.f22121a, context, renderProps2);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps2.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : null, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : renderState.getHolographicTorchEnabled(), (3 & 2) != 0 ? uq.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object n0(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        so.l lVar;
        mp.c<Object, Object> cVarC;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        wm.w.l(context, this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), kotlin.jvm.internal.d0.k(GovernmentIdAnalyzeWorker.class), "", new Function1() { // from class: jo.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.y0(this.f22086a, renderState, captureConfig, (gt.n) obj);
            }
        });
        wm.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: jo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.C0((Hint) obj);
            }
        });
        kn.a aVarE = videoCaptureHelper.e(renderProps);
        kn.a aVar = kn.a.Stream;
        boolean z11 = aVarE == aVar && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z11) {
            wm.w.l(context, wm.o.Companion.b(wm.o.INSTANCE, kotlin.ranges.d.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), kotlin.jvm.internal.d0.l(wm.o.class, KTypeProjection.INSTANCE.a(kotlin.jvm.internal.d0.k(Unit.class))), idSideConfigD.getSideKey(), new Function1() { // from class: jo.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.E0(renderState, (Unit) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapG = kotlin.collections.j0.g(gt.s.a(AlertScreen.a.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string = this.applicationContext.getString(tp.g.f32535n);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(mapG, string, null, false, new Function1() { // from class: jo.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.o0(context, (AlertScreen.b) obj);
                }
            }, 12, null));
        }
        String strK = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strJ = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strP = com.withpersona.sdk2.inquiry.governmentid.n.P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode(), z10);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = idSideConfigD.getOverlay();
        no.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a aVarE2 = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        ko.i iVarL = com.withpersona.sdk2.inquiry.governmentid.n.L(renderProps, renderState.getCurrentPart().getSide());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.b bVarF = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, strP, manualCapture, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: jo.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.q0(renderState, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: jo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.r0(sink);
            }
        }, new Function0() { // from class: jo.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.s0(context, videoCaptureHelper);
            }
        }, false, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : new Function1() { // from class: jo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.t0(context, (Throwable) obj);
            }
        }, function1A, (2097152 & 1203765760) != 0 ? kn.a.None : aVarE2, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : new Function0() { // from class: jo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.v0(this.f22051a, renderState, context);
            }
        }, new Function0() { // from class: jo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.x0(this.f22054a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : strR, (1073741824 & 1203765760) != 0 ? null : iVarL, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? uq.l.SLIDE_IN : null);
        if (renderState.getCheckCameraPermissions()) {
            cVarC = com.withpersona.sdk2.inquiry.governmentid.n.j0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                lVar = videoCaptureHelper;
                if (lVar.c(renderProps) && hq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    cVarC = com.withpersona.sdk2.inquiry.governmentid.n.f0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                }
            } else {
                lVar = videoCaptureHelper;
            }
            if (lVar.e(renderProps) == aVar && renderState.getWebRtcState() == so.x.Disconnected) {
                G0(renderProps, renderState, context, lVar.getWebRtcManager());
                cVarC = com.withpersona.sdk2.inquiry.permissions.g.c(bVarF);
            } else {
                cVarC = com.withpersona.sdk2.inquiry.permissions.g.c(bVarF);
            }
        }
        return new AlertContainerScreen(cVarC, arrayList);
    }
}
