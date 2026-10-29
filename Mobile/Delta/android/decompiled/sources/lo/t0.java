package lo;

import android.R;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
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
import en.AlertContainerScreen;
import en.AlertScreen;
import hn.CameraChoices;
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
import ku.z0;
import oo.GovernmentIdHintWorker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$Jg\u0010-\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J[\u00101\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b1\u00102J[\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002032&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b4\u00105J[\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002062&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Llo/t0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Loo/a$b;", "governmentIdHintWorkerFactory", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lur/a;", "webRtcManager", "", "G0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Luo/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "T", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "Lym/h;", "sink", "n0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Y", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "d", "Loo/a$b;", "e", "Ltr/b$a;", "f", "Lcom/withpersona/sdk2/camera/e$a;", "g", "Lhn/c$a;", "h", "Luq/a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final tr.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$1", f = "CaptureRenderer.kt", l = {454}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23448t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f23449u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ym.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f23450v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f23449u = holographicTorchDelay;
            this.f23450v = aVar;
        }

        public static final Unit r(ym.r.c cVar) {
            Object objC = cVar.c();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = objC instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) objC : null;
            if (holographicTorchDelay == null) {
                return Unit.f22483a;
            }
            cVar.e(GovernmentIdState.HolographicTorchDelay.J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f23449u, this.f23450v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23448t;
            if (i10 == 0) {
                jt.o.b(obj);
                kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                long jP = kotlin.time.b.p(this.f23449u.getTorchDurationMs(), ju.b.MILLISECONDS);
                this.f23448t = 1;
                if (z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            this.f23450v.d().a(ym.b0.c(null, new Function1() { // from class: lo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return t0.a.r((ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2", f = "CaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23451t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f23453v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f23454w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ym.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f23455x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ uo.l f23456y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, uo.l lVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f23453v = input;
            this.f23454w = holographicTorchDelay;
            this.f23455x = aVar;
            this.f23456y = lVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return t0.this.new b(this.f23453v, this.f23454w, this.f23455x, this.f23456y, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23451t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            t0 t0Var = t0.this;
            GovernmentIdWorkflow.Input input = this.f23453v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f23454w;
            t0Var.T(input, holographicTorchDelay, this.f23455x, holographicTorchDelay.getCaptureConfig(), this.f23456y, this.f23454w.getCameraProperties(), this.f23454w.getCapturedImage());
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public t0(@NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull tr.b.a webRtcWorkerFactory, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull uq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit A0(ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.f22483a;
    }

    public static final Unit B0(GovernmentIdState.WaitForAutocapture waitForAutocapture, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22483a;
    }

    public static final ym.r C0(final Hint hint) {
        return ym.b0.c(null, new Function1() { // from class: lo.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.D0(hint, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit D0(Hint hint, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f22483a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f22483a;
    }

    public static final ym.r E0(final GovernmentIdState.WaitForAutocapture waitForAutocapture, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ym.b0.c(null, new Function1() { // from class: lo.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.F0(waitForAutocapture, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit F0(GovernmentIdState.WaitForAutocapture waitForAutocapture, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22483a;
    }

    public static final ym.r H0(final t0 t0Var, final ur.a aVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final ym.k.a aVar2, final tr.b.AbstractC0578b it) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices cameraChoicesB = hn.f0.b(t0Var.applicationContext, hn.m0.FRONT);
        if (it instanceof tr.b.AbstractC0578b.C0579b) {
            return ym.b0.c(null, new Function1() { // from class: lo.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.I0(aVar, t0Var, cameraChoicesB, it, waitForAutocapture, input, aVar2, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof tr.b.AbstractC0578b.Error) {
            return ym.b0.c(null, new Function1() { // from class: lo.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.O0(aVar2, aVar, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit I0(final ur.a aVar, final t0 t0Var, CameraChoices cameraChoices, tr.b.AbstractC0578b abstractC0578b, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final ym.k.a aVar2, ym.r.c action) {
        int i10;
        int i11;
        hn.h0 primaryChoice;
        hn.h0 primaryChoice2;
        hn.h0 primaryChoice3;
        Size size;
        hn.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == uo.x.Connecting) {
            return Unit.f22483a;
        }
        if (waitForAutocapture2 != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, uo.x.Connecting, null, null, false, false, null, null, null, 32639, null));
        }
        if (aVar != null) {
            aVar.h(t0Var.webRtcWorkerFactory.getService());
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
            tr.b.AbstractC0578b.C0579b c0579b = (tr.b.AbstractC0578b.C0579b) abstractC0578b;
            aVar.e(c0579b.getResult().getUsername(), c0579b.getResult().getCredential(), c0579b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: lo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.J0(this.f23393a, input, waitForAutocapture);
                }
            }, new Function0() { // from class: lo.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.K0(aVar2, aVar);
                }
            }, new Function0() { // from class: lo.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.M0(this.f23400a, input);
                }
            }, new Function1() { // from class: lo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.N0(this.f23404a, (String) obj);
                }
            });
        }
        return Unit.f22483a;
    }

    public static final Unit J0(t0 t0Var, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f22483a;
    }

    public static final Unit K0(ym.k.a aVar, final ur.a aVar2) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.L0(aVar2, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit L0(ur.a aVar, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.a();
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22483a;
    }

    public static final Unit M0(t0 t0Var, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f22483a;
    }

    public static final Unit N0(t0 t0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(t0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f22483a;
    }

    public static final Unit O0(ym.k.a aVar, final ur.a aVar2, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == uo.x.Connecting) {
            return Unit.f22483a;
        }
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.P0(aVar2, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit P0(ur.a aVar, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (aVar != null) {
            aVar.a();
        }
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22483a;
    }

    public static final Unit U(GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, CaptureConfig captureConfig, CameraProperties cameraProperties, int i10, GovernmentId.GovernmentIdImage governmentIdImage, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != governmentIdState.getClass()) {
            return Unit.f22483a;
        }
        action.e(new GovernmentIdState.HolographicTorchDelay(sideIdPart, governmentIdState.E(), governmentIdState.D(), governmentIdState.getPartIndex(), governmentIdState.getBackState(), governmentIdState.getCountryCode(), captureConfig, cameraProperties, i10, governmentIdImage, false, Barcode.FORMAT_UPC_E, null));
        return Unit.f22483a;
    }

    public static final Unit V(ym.k.a aVar, final uo.l lVar) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.W(lVar, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit W(uo.l lVar, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? uo.x.Connected : uo.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final Unit X(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        IdPart currentPart = governmentIdState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.f22483a;
        }
        action.e(new GovernmentIdState.ReviewCapturedImage(sideIdPart, ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, ((GovernmentIdState) action.c()).D(), ((GovernmentIdState) action.c()).getPartIndex(), waitForAutocapture, cameraProperties, null, false, ((GovernmentIdState) action.c()).getCountryCode(), 768, null));
        return Unit.f22483a;
    }

    public static final ym.r Z(final Hint hint) {
        return ym.b0.c(null, new Function1() { // from class: lo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.a0(hint, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit a0(Hint hint, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture = objC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objC : null;
        if (countdownToCapture == null) {
            return Unit.f22483a;
        }
        action.e(GovernmentIdState.CountdownToCapture.J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f22483a;
    }

    public static final Unit b0(ym.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit c0(ym.k.a aVar, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    public static final Unit d0(GovernmentIdState.CountdownToCapture countdownToCapture, t0 t0Var, GovernmentIdWorkflow.Input input, ym.k.a aVar, uo.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listD3 = countdownToCapture.getIdForReview().d3();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listD3, 10));
        Iterator<T> it = listD3.iterator();
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
        return Unit.f22483a;
    }

    public static final Unit e0(final ym.k.a aVar, final GovernmentIdState.CountdownToCapture countdownToCapture, final GovernmentIdWorkflow.Input input, final uo.l lVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.f0(countdownToCapture, input, error, aVar, lVar, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit f0(GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, Throwable th2, final ym.k.a aVar, final uo.l lVar, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = objC instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objC : null;
        if (countdownToCapture2 == null) {
            return Unit.f22483a;
        }
        action.e(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.E(), countdownToCapture.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O((GovernmentIdWorkflow.Input) action.b(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.D(), countdownToCapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), uo.x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), th2, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: lo.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.g0(aVar, lVar);
            }
        }, 11264, null));
        return Unit.f22483a;
    }

    public static final Unit g0(ym.k.a aVar, final uo.l lVar) {
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.h0(lVar, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit h0(uo.l lVar, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? uo.x.Connected : uo.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final Unit i0(t0 t0Var, ym.k.a aVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22483a;
    }

    public static final Unit k0(ym.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit l0(ym.k.a aVar, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    public static final Unit m0(t0 t0Var, ym.k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, true);
        return Unit.f22483a;
    }

    public static final Unit o0(ym.k.a aVar, AlertScreen.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.p0((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit p0(ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.e(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.f22483a;
    }

    public static final Unit q0(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, t0 t0Var, GovernmentIdWorkflow.Input input, ym.k.a aVar, uo.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        t0Var.T(input, waitForAutocapture, aVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.n.e0(waitForAutocapture.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig), GovernmentId.a.b, null, null, 32, null));
        return Unit.f22483a;
    }

    public static final Unit r0(ym.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit s0(ym.k.a aVar, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    public static final Unit t0(ym.k.a aVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.u0(error, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit u0(Throwable th2, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture == null) {
            return Unit.f22483a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, th2, false, false, null, null, null, 32247, null));
        return Unit.f22483a;
    }

    public static final Unit v0(t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, ym.k.a aVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        aVar.d().a(ym.b0.c(null, new Function1() { // from class: lo.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.w0(waitForAutocapture, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit w0(GovernmentIdState.WaitForAutocapture waitForAutocapture, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f22483a;
    }

    public static final Unit x0(t0 t0Var, ym.k.a aVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22483a;
    }

    public static final ym.r y0(final t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final CaptureConfig captureConfig, jt.n nVar) {
        Object value = nVar.getValue();
        Throwable thE = jt.n.e(value);
        if (thE == null) {
            final GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            return ym.b0.c(null, new Function1() { // from class: lo.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.z0(this.f23457a, waitForAutocapture, captureConfig, governmentIdImage, (ym.r.c) obj);
                }
            }, 1, null);
        }
        String message = thE.getMessage();
        return (message == null || !StringsKt.a0(message, "ENOSPC", false, 2, null)) ? ym.b0.c(null, new Function1() { // from class: lo.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.B0(waitForAutocapture, (ym.r.c) obj);
            }
        }, 1, null) : ym.b0.c(null, new Function1() { // from class: lo.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.A0((ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit z0(t0 t0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        Object objC = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objC : null;
        if (waitForAutocapture2 == null) {
            return Unit.f22483a;
        }
        action.e(new GovernmentIdState.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, waitForAutocapture2.D(), waitForAutocapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.f22483a;
    }

    public final void G0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final ur.a webRtcManager) {
        ym.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), kotlin.jvm.internal.d0.k(tr.b.class), "", new Function1() { // from class: lo.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.H0(this.f23405a, webRtcManager, renderState, renderProps, context, (tr.b.AbstractC0578b) obj);
            }
        });
    }

    public final void T(GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState, final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final CaptureConfig captureConfig, final uo.l videoCaptureHelper, final CameraProperties cameraProperties, final GovernmentId.GovernmentIdImage capturedId) {
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
            context.d().a(ym.b0.c(null, new Function1() { // from class: lo.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.U(renderState, sideIdPart2, captureConfig, cameraProperties, i10, capturedId, (ym.r.c) obj);
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
            final GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart.getSide()), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), uo.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: lo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t0.V(context, videoCaptureHelper);
                }
            }, 11776, null);
            context.d().a(ym.b0.c(null, new Function1() { // from class: lo.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.X(renderState, captureConfig, capturedId, waitForAutocapture, cameraProperties, (ym.r.c) obj);
                }
            }, 1, null));
        }
    }

    @NotNull
    public final Object Y(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final uo.l videoCaptureHelper, @NotNull final ym.h<? super GovernmentIdWorkflow.a> sink) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        ym.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: lo.h0
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
        po.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(renderState.getCaptureConfig());
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        mn.a aVarE = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: lo.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.b0(sink);
            }
        }, new Function0() { // from class: lo.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.c0(context, videoCaptureHelper);
            }
        }, true, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: lo.o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.d0(renderState, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : new Function1() { // from class: lo.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.e0(context, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
            }
        }, function1A, (2097152 & 1203765760) != 0 ? mn.a.None : aVarE, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : null, new Function0() { // from class: lo.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.i0(this.f23425a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (536870912 & 1203765760) != 0 ? null : strR, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? wq.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object j0(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final uo.l videoCaptureHelper, @NotNull final ym.h<? super GovernmentIdWorkflow.a> sink) {
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
        po.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState navigationStateB = t0Var.navigationStateManager.b();
        List listK = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        mn.a aVarE = videoCaptureHelper.e(renderProps2);
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: lo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.k0(sink);
            }
        }, new Function0() { // from class: lo.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.l0(context, videoCaptureHelper);
            }
        }, false, listK, renderState, partIndex, t0Var.cameraXControllerFactory, t0Var.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : null, function1A, (2097152 & 1203765760) != 0 ? mn.a.None : aVarE, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : null, new Function0() { // from class: lo.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.m0(this.f23468a, context, renderProps2);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps2.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : null, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : renderState.getHolographicTorchEnabled(), (3 & 2) != 0 ? wq.l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    public final Object n0(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final uo.l videoCaptureHelper, @NotNull final ym.h<? super GovernmentIdWorkflow.a> sink) {
        uo.l lVar;
        op.c<Object, Object> cVarC;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        ym.w.l(context, this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), kotlin.jvm.internal.d0.k(GovernmentIdAnalyzeWorker.class), "", new Function1() { // from class: lo.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.y0(this.f23433a, renderState, captureConfig, (jt.n) obj);
            }
        });
        ym.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: lo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.C0((Hint) obj);
            }
        });
        mn.a aVarE = videoCaptureHelper.e(renderProps);
        mn.a aVar = mn.a.Stream;
        boolean z11 = aVarE == aVar && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z11) {
            ym.w.l(context, ym.o.Companion.b(ym.o.INSTANCE, kotlin.ranges.d.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), kotlin.jvm.internal.d0.l(ym.o.class, KTypeProjection.INSTANCE.a(kotlin.jvm.internal.d0.k(Unit.class))), idSideConfigD.getSideKey(), new Function1() { // from class: lo.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.E0(renderState, (Unit) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapG = kotlin.collections.j0.g(jt.s.a(AlertScreen.a.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string = this.applicationContext.getString(vp.g.f33399n);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(mapG, string, null, false, new Function1() { // from class: lo.d
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
        po.b bVarA = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState navigationStateB = this.navigationStateManager.b();
        List<AutoCaptureRule> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 function1A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        mn.a aVarE2 = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        mo.i iVarL = com.withpersona.sdk2.inquiry.governmentid.n.L(renderProps, renderState.getCurrentPart().getSide());
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.b bVarF = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, strP, manualCapture, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: lo.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t0.q0(renderState, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: lo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.r0(sink);
            }
        }, new Function0() { // from class: lo.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.s0(context, videoCaptureHelper);
            }
        }, false, listA, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
            }
        } : new Function1() { // from class: lo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.t0(context, (Throwable) obj);
            }
        }, function1A, (2097152 & 1203765760) != 0 ? mn.a.None : aVarE2, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.l.l();
            }
        } : new Function0() { // from class: lo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.v0(this.f23398a, renderState, context);
            }
        }, new Function0() { // from class: lo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.x0(this.f23401a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : strR, (1073741824 & 1203765760) != 0 ? null : iVarL, (1203765760 & Integer.MIN_VALUE) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? wq.l.SLIDE_IN : null);
        if (renderState.getCheckCameraPermissions()) {
            cVarC = com.withpersona.sdk2.inquiry.governmentid.n.j0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                lVar = videoCaptureHelper;
                if (lVar.c(renderProps) && jq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    cVarC = com.withpersona.sdk2.inquiry.governmentid.n.f0(bVarF, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                }
            } else {
                lVar = videoCaptureHelper;
            }
            if (lVar.e(renderProps) == aVar && renderState.getWebRtcState() == uo.x.Disconnected) {
                G0(renderProps, renderState, context, lVar.getWebRtcManager());
                cVarC = com.withpersona.sdk2.inquiry.permissions.g.c(bVarF);
            } else {
                cVarC = com.withpersona.sdk2.inquiry.permissions.g.c(bVarF);
            }
        }
        return new AlertContainerScreen(cVarC, arrayList);
    }
}
