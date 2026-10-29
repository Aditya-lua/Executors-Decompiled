package ro;

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
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hn.CameraChoices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oo.GovernmentIdHintWorker;
import org.jetbrains.annotations.NotNull;
import vr.TimerWorker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J_\u0010,\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020+2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-JG\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020.2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b/\u00100J7\u00103\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JM\u0010;\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lro/m0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Loo/a$b;", "governmentIdHintWorkerFactory", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;)V", "context", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lym/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "sink", "Lkotlin/Function1;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Q", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "E", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "M", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lur/a;", "webRtcManager", "c0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "C", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "c", "Loo/a$b;", "d", "Ltr/b$a;", "e", "Lcom/withpersona/sdk2/camera/e$a;", "f", "Lhn/c$a;", "g", "Luq/a;", "h", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "i", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tr.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30012a;

        static {
            int[] iArr = new int[rp.j1.values().length];
            try {
                iArr[rp.j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rp.j1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rp.j1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30012a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$1", f = "GovIdCaptureRenderer.kt", l = {505}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30013t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f30014u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vr.f<GovernmentIdState> f30015v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, vr.f<GovernmentIdState> fVar, nt.b<? super b> bVar) {
            super(1, bVar);
            this.f30014u = holographicTorchDelay;
            this.f30015v = fVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new b(this.f30014u, this.f30015v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30013t;
            if (i10 == 0) {
                jt.o.b(obj);
                kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                long jP = kotlin.time.b.p(this.f30014u.getTorchDurationMs(), ju.b.MILLISECONDS);
                this.f30013t = 1;
                if (ku.z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = this.f30015v.i();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = workflowStateI instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) workflowStateI : null;
            if (holographicTorchDelay == null) {
                return Unit.f22483a;
            }
            this.f30015v.p(GovernmentIdState.HolographicTorchDelay.J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2", f = "GovIdCaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30016t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f30018v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f30019w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ vr.f<GovernmentIdState> f30020x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ uo.l f30021y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, vr.f<GovernmentIdState> fVar, uo.l lVar, nt.b<? super c> bVar) {
            super(1, bVar);
            this.f30018v = input;
            this.f30019w = holographicTorchDelay;
            this.f30020x = fVar;
            this.f30021y = lVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return m0.this.new c(this.f30018v, this.f30019w, this.f30020x, this.f30021y, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f30016t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            m0 m0Var = m0.this;
            GovernmentIdWorkflow.Input input = this.f30018v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f30019w;
            m0Var.C(input, holographicTorchDelay, this.f30020x, holographicTorchDelay.getCaptureConfig(), this.f30021y, this.f30019w.getCameraProperties(), this.f30019w.getCapturedImage());
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public m0(@NotNull Context applicationContext, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull tr.b.a webRtcWorkerFactory, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull uq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorker, "permissionRequestWorker");
        this.applicationContext = applicationContext;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker;
    }

    public static final Unit D(vr.f fVar, uo.l lVar) {
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? uo.x.Connected : uo.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final Unit F(vr.f fVar, Hint hint) {
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.CountdownToCapture countdownToCapture = workflowStateI instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) workflowStateI : null;
        if (countdownToCapture == null) {
            return Unit.f22483a;
        }
        fVar.p(GovernmentIdState.CountdownToCapture.J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f22483a;
    }

    public static final Unit G(ym.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit H(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit I(GovernmentIdState.CountdownToCapture countdownToCapture, m0 m0Var, GovernmentIdWorkflow.Input input, vr.f fVar, uo.l lVar, List absolutePaths, CameraProperties cameraProperties) {
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
        m0Var.C(input, countdownToCapture, fVar, captureConfig, lVar, cameraProperties, GovernmentId.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f22483a;
    }

    public static final Unit J(final vr.f fVar, GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, final uo.l lVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = workflowStateI instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) workflowStateI : null;
        if (countdownToCapture2 == null) {
            return Unit.f22483a;
        }
        fVar.p(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.E(), countdownToCapture.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O(input, countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.D(), countdownToCapture2.getPartIndex(), qo.e.e(fVar, false), uo.x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), error, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: ro.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m0.K(fVar, lVar);
            }
        }, 11264, null));
        return Unit.f22483a;
    }

    public static final Unit K(vr.f fVar, uo.l lVar) {
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? uo.x.Connected : uo.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22483a;
    }

    public static final Unit L(m0 m0Var, vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        qo.e.q(m0Var.applicationContext, fVar, input, lVar.c(input));
        return Unit.f22483a;
    }

    public static final Unit N(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit O(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit P(m0 m0Var, vr.f fVar, GovernmentIdWorkflow.Input input) {
        qo.e.q(m0Var.applicationContext, fVar, input, true);
        return Unit.f22483a;
    }

    public static final Unit R(m0 m0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, vr.f fVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f22483a;
    }

    public static final Unit S(m0 m0Var, vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar) {
        qo.e.q(m0Var.applicationContext, fVar, input, lVar.c(input));
        return Unit.f22483a;
    }

    public static final Unit T(vr.f fVar, GovernmentIdWorkflow.Input input, Function1 function1, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f30012a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) fVar.i();
            if (workflowState != null && (workflowState instanceof io.c)) {
                fVar.p(((io.c) workflowState).r(false));
            }
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            qo.e.p(fVar, input, null, function1);
        }
        return Unit.f22483a;
    }

    public static final Unit U(vr.f fVar, GovernmentIdWorkflow.Input input, Function1 function1, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f30012a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) fVar.i();
            if (workflowState != null && (workflowState instanceof io.a)) {
                fVar.p(((io.a) workflowState).q(false));
            }
        } else {
            if (i10 != 3) {
                throw new jt.l();
            }
            qo.e.p(fVar, input, null, function1);
        }
        return Unit.f22483a;
    }

    public static final Unit V(m0 m0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, vr.f fVar, CaptureConfig captureConfig, ym.h hVar, jt.n nVar) {
        List<GovernmentId> listK;
        Object value = nVar.getValue();
        Throwable thE = jt.n.e(value);
        if (thE == null) {
            GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            WorkflowState workflowStateI = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
            if (waitForAutocapture2 != null) {
                IdPart.SideIdPart currentPart = waitForAutocapture.getCurrentPart();
                GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
                if (governmentIdState == null || (listK = governmentIdState.E()) == null) {
                    listK = kotlin.collections.p.k();
                }
                fVar.p(new GovernmentIdState.CountdownToCapture(currentPart, listK, captureConfig, governmentIdImage, waitForAutocapture2.D(), waitForAutocapture2.getPartIndex(), qo.e.e(fVar, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
            }
        } else {
            String message = thE.getMessage();
            if (message != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
                hVar.a(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            } else if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
                fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit W(vr.f fVar, Hint hint) {
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture == null) {
            return Unit.f22483a;
        }
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f22483a;
    }

    public static final Unit X(GovernmentIdState.WaitForAutocapture waitForAutocapture, vr.f fVar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.Hidden) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22483a;
    }

    public static final Unit Y(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, m0 m0Var, GovernmentIdWorkflow.Input input, vr.f fVar, uo.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        m0Var.C(input, waitForAutocapture, fVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.n.e0(waitForAutocapture.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig), GovernmentId.a.b, null, null, 32, null));
        return Unit.f22483a;
    }

    public static final Unit Z(ym.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit a0(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit b0(vr.f fVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState workflowStateI = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture == null) {
            return Unit.f22483a;
        }
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.Enabled, null, 0, null, null, null, error, false, false, null, null, null, 32247, null));
        return Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit d0(final m0 m0Var, final vr.f fVar, final ur.a aVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, tr.b.AbstractC0578b it) throws CameraAccessException {
        int i10;
        hn.h0 primaryChoice;
        hn.h0 primaryChoice2;
        hn.h0 primaryChoice3;
        Size size;
        hn.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(it, "it");
        CameraChoices cameraChoicesB = hn.f0.b(m0Var.applicationContext, hn.m0.FRONT);
        if (it instanceof tr.b.AbstractC0578b.C0579b) {
            Object objI = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objI : null;
            if (waitForAutocapture2 != 0 && waitForAutocapture2.getWebRtcState() == uo.x.Connecting) {
                return Unit.f22483a;
            }
            if (waitForAutocapture2 != 0) {
                fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, uo.x.Connecting, null, null, false, false, null, null, null, 32639, null));
            }
            if (aVar != null) {
                aVar.h(m0Var.webRtcWorkerFactory.getService());
            }
            if (aVar != null) {
                aVar.i(m0Var.applicationContext);
            }
            int height = 0;
            int width = (cameraChoicesB == null || (primaryChoice4 = cameraChoicesB.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
            if (cameraChoicesB != null && (primaryChoice3 = cameraChoicesB.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                height = size.getHeight();
            }
            if ((cameraChoicesB == null || (primaryChoice2 = cameraChoicesB.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoicesB == null || (primaryChoice = cameraChoicesB.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                i10 = width;
            } else {
                i10 = height;
                height = width;
            }
            if (aVar != null) {
                tr.b.AbstractC0578b.C0579b c0579b = (tr.b.AbstractC0578b.C0579b) it;
                aVar.e(c0579b.getResult().getUsername(), c0579b.getResult().getCredential(), c0579b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i10, height, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: ro.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.e0(this.f29937a, input, waitForAutocapture);
                    }
                }, new Function0() { // from class: ro.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.f0(aVar, fVar);
                    }
                }, new Function0() { // from class: ro.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.g0(this.f29946a, input);
                    }
                }, new Function1() { // from class: ro.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m0.h0(this.f29953a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof tr.b.AbstractC0578b.Error)) {
                throw new jt.l();
            }
            WorkflowState workflowStateI = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture3 = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
            if (waitForAutocapture3 == null || waitForAutocapture3.getWebRtcState() == uo.x.Connecting) {
                return Unit.f22483a;
            }
            if (aVar != null) {
                aVar.a();
            }
            GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
            fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        }
        return Unit.f22483a;
    }

    public static final Unit e0(m0 m0Var, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(m0Var.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f22483a;
    }

    public static final Unit f0(ur.a aVar, vr.f fVar) {
        aVar.a();
        GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
        fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        return Unit.f22483a;
    }

    public static final Unit g0(m0 m0Var, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(m0Var.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f22483a;
    }

    public static final Unit h0(m0 m0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(m0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f22483a;
    }

    public final void C(GovernmentIdWorkflow.Input renderProps, GovernmentIdState renderState, final vr.f<GovernmentIdState> workflowContext, CaptureConfig captureConfig, final uo.l videoCaptureHelper, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage capturedId) {
        List<GovernmentId> listK;
        List<IdPart> listK2;
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
        boolean z10 = videoCaptureHelper.c(renderProps) && iIntValue > 0 && renderState.E().isEmpty() && sideIdPart != null;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            workflowContext.p(new GovernmentIdState.HolographicTorchDelay(sideIdPart, renderState.E(), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), renderState.getCountryCode(), captureConfig, cameraProperties, iIntValue, capturedId, false, Barcode.FORMAT_UPC_E, null));
            return;
        }
        IdPart.SideIdPart sideIdPart2 = sideIdPart;
        boolean z11 = videoCaptureHelper.c(renderProps) && !renderProps.getAutoClassificationConfig().getIsEnabled();
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigC != null && (z11 || shouldSkipReviewScreen)) {
            qo.e.s(renderState, workflowContext, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
            return;
        }
        if (sideIdPart2 == null) {
            return;
        }
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart2, renderState.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart2.getSide()), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), uo.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: ro.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m0.D(workflowContext, videoCaptureHelper);
            }
        }, 11776, null);
        IdPart currentPart2 = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart3 = currentPart2 instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart2 : null;
        if (sideIdPart3 == null) {
            return;
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) workflowContext.i();
        if (governmentIdState == null || (listK = governmentIdState.E()) == null) {
            listK = kotlin.collections.p.k();
        }
        List<GovernmentId> list = listK;
        GovernmentIdState governmentIdState2 = (GovernmentIdState) workflowContext.i();
        if (governmentIdState2 == null || (listK2 = governmentIdState2.D()) == null) {
            listK2 = kotlin.collections.p.k();
        }
        List<IdPart> list2 = listK2;
        GovernmentIdState governmentIdState3 = (GovernmentIdState) workflowContext.i();
        int partIndex = governmentIdState3 != null ? governmentIdState3.getPartIndex() : 0;
        GovernmentIdState governmentIdState4 = (GovernmentIdState) workflowContext.i();
        workflowContext.p(new GovernmentIdState.ReviewCapturedImage(sideIdPart3, list, captureConfig, capturedId, list2, partIndex, waitForAutocapture, cameraProperties, null, false, governmentIdState4 != null ? governmentIdState4.getCountryCode() : null, 768, null));
    }

    @NotNull
    public final Screen E(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final ym.h<? super GovernmentIdWorkflow.a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: ro.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.F(workflowContext, (Hint) obj);
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
        Function1 function1G = qo.e.g(workflowContext, false, onOutput, 1, null);
        mn.a aVarE = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014a: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x0146: INVOKE 
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r8v5 'strK' java.lang.String)
              (r9v6 'strJ' java.lang.String)
              (r10v5 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r6v9 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v1 'bVarA' po.b)
              (r11v4 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r6v11 'navigationStateB' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:0x00f9: CONSTRUCTOR (r43v0 'sink' ym.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a> A[DONT_INLINE]) A[MD:(ym.h):void (m), WRAPPED] call: ro.g0.<init>(ym.h):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x0100: CONSTRUCTOR 
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.h0.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              true
              (r13v3 'listA' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture)
              (r16v1 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00f2: IGET (r38v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00f4: IGET (r38v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.f hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x0107: CONSTRUCTOR 
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture A[DONT_INLINE])
              (r38v0 'this' ro.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, vr.f, uo.l):void (m), WRAPPED] call: ro.i0.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, vr.f, uo.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x0116: CONSTRUCTOR 
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void (m), WRAPPED] call: ro.j0.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void type: CONSTRUCTOR))
              (r21v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'aVarE' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap kotlin.jvm.functions.Function0:0x011d: CONSTRUCTOR 
              (r38v0 'this' ro.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void (m), WRAPPED] call: ro.k0.<init>(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (r29v0 'imageCaptureCount' int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 'strR' java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r32v0 'webRtcManager' ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (r45v0 'transition' wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             in method: ro.m0.E(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, uo.l, ym.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.m0.E(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, vr.f, uo.l, ym.h, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen M(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput) {
        final m0 m0Var;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        workflowContext.m("holographic_torch_delay", new b(renderState, workflowContext, null));
        if (renderState.getHolographicTorchEnabled()) {
            m0Var = this;
        } else {
            c cVar = new c(renderProps2, renderState, workflowContext, videoCaptureHelper, null);
            m0Var = this;
            renderProps2 = renderProps2;
            workflowContext.m("holographic_torch_complete", cVar);
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
        NavigationState navigationStateB = m0Var.navigationStateManager.b();
        List listK = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 function1G = qo.e.g(workflowContext, false, onOutput, 1, null);
        mn.a aVarE = videoCaptureHelper.e(renderProps2);
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, strK, strJ, capturing, aVar, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0100: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x00fc: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'strK' java.lang.String)
              (r6v1 'strJ' java.lang.String)
              (r11v3 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r3v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r2v2 'bVarA' po.b)
              (r9v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r13v1 'navigationStateB' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:0x00bb: CONSTRUCTOR 
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.l.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00c2: CONSTRUCTOR 
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.w.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v0 'listK' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay)
              (r16v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00b0: IGET (r0v8 'm0Var' ro.m0) A[WRAPPED] ro.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00b2: IGET (r0v8 'm0Var' ro.m0) A[WRAPPED] ro.m0.f hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (r21v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'aVarE' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap kotlin.jvm.functions.Function0:0x00c7: CONSTRUCTOR 
              (r0v8 'm0Var' ro.m0 A[DONT_INLINE])
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: ro.e0.<init>(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r32v0 'webRtcManager' ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (wrap boolean:0x00b4: INVOKE (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.HolographicTorchDelay.O():boolean A[MD:():boolean (m), WRAPPED]))
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (null wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             in method: ro.m0.M(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay, vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, uo.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.m0.M(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay, vr.f, uo.l, kotlin.jvm.functions.Function1):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen Q(@NotNull Context context, @NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final ym.h<? super GovernmentIdWorkflow.a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        workflowContext.n(this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), new Function1() { // from class: ro.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.V(this.f29998a, renderState, workflowContext, captureConfig, sink, (jt.n) obj);
            }
        });
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: ro.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.W(workflowContext, (Hint) obj);
            }
        });
        mn.a aVarE = videoCaptureHelper.e(renderProps);
        mn.a aVar = mn.a.Stream;
        boolean z11 = aVarE == aVar && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z11) {
            workflowContext.n(new TimerWorker(kotlin.ranges.d.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L)), new Function1() { // from class: ro.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m0.X(renderState, workflowContext, (Unit) obj);
                }
            });
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
        Function1 function1G = qo.e.g(workflowContext, false, onOutput, 1, null);
        mn.a aVarE2 = videoCaptureHelper.e(renderProps);
        String strR = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        mo.i iVarL = com.withpersona.sdk2.inquiry.governmentid.n.L(renderProps, renderState.getCurrentPart().getSide());
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.b bVarF = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, strK, strJ, strP, manualCapture, overlay, bVarA, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b4: INVOKE (r4v3 'bVarF' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'strK' java.lang.String)
              (r11v1 'strJ' java.lang.String)
              (r12v1 'strP' java.lang.String)
              (r12v2 'manualCapture' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r13v2 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v4 'bVarA' po.b)
              (r13v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r22v0 'navigationStateB' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x0160: CONSTRUCTOR 
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture A[DONT_INLINE])
              (r4v0 'captureConfig' com.withpersona.sdk2.inquiry.governmentid.CaptureConfig A[DONT_INLINE])
              (r45v0 'this' ro.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, com.withpersona.sdk2.inquiry.governmentid.CaptureConfig, ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, vr.f, uo.l):void (m), WRAPPED] call: ro.p.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, com.withpersona.sdk2.inquiry.governmentid.CaptureConfig, ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, vr.f, uo.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x0168: CONSTRUCTOR (r51v0 'sink' ym.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a> A[DONT_INLINE]) A[MD:(ym.h):void (m), WRAPPED] call: ro.q.<init>(ym.h):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x016d: CONSTRUCTOR 
              (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r52v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.r.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r17v4 'listA' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture)
              (r23v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x0151: IGET (r45v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x0153: IGET (r45v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.f hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x0172: CONSTRUCTOR (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE]) A[MD:(vr.f):void (m), WRAPPED] call: ro.s.<init>(vr.f):void type: CONSTRUCTOR))
              (r28v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r29v0 'aVarE2' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0179: CONSTRUCTOR 
              (r45v0 'this' ro.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture A[DONT_INLINE])
              (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
             A[MD:(ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, vr.f):void (m), WRAPPED] call: ro.t.<init>(ro.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, vr.f):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x0180: CONSTRUCTOR 
              (r45v0 'this' ro.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void (m), WRAPPED] call: ro.u.<init>(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 'strR' java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (r38v0 'iVarL' mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r39v0 'webRtcManager' ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (r53v0 'transition' wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[DECLARE_VAR, MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m)] in method: ro.m0.Q(android.content.Context, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, uo.l, ym.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.m0.Q(android.content.Context, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, vr.f, uo.l, ym.h, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    public final void c0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final vr.f<GovernmentIdState> workflowContext, final ur.a webRtcManager) {
        workflowContext.n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: ro.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.d0(this.f30078a, workflowContext, webRtcManager, renderState, renderProps, (tr.b.AbstractC0578b) obj);
            }
        });
    }
}
