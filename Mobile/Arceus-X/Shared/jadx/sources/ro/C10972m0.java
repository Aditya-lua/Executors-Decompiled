package ro;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3540c;
import com.withpersona.sdk2.inquiry.governmentid.C3549j;
import com.withpersona.sdk2.inquiry.governmentid.C3551l;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
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
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hn.C6434c;
import hn.C6441f0;
import hn.C6445h0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import io.InterfaceC6840a;
import io.InterfaceC6848c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import mn.EnumC8598a;
import mo.InterfaceC8607i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.C7946z0;
import p315nt.InterfaceC9557b;
import p339oo.GovernmentIdHintWorker;
import p344ot.C10047c;
import p361po.EnumC10302b;
import p389qo.C10643e;
import p419rp.EnumC11028j1;
import p473uo.C11905l;
import p473uo.EnumC11917x;
import p475uq.C11930a;
import p476ur.InterfaceC11932a;
import p499vr.C12255f;
import p499vr.TimerWorker;
import p526wq.EnumC12529l;
import p581ym.InterfaceC13215h;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import tr.C11742b;

/* JADX INFO: renamed from: ro.m0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J_\u0010,\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020+2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-JG\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020.2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b/\u00100J7\u00103\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JM\u0010;\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, m31665d2 = {"Lro/m0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Loo/a$b;", "governmentIdHintWorkerFactory", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;)V", "context", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lym/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "sink", "Lkotlin/Function1;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Q", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "E", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "M", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lur/a;", "webRtcManager", "c0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "C", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "c", "Loo/a$b;", "d", "Ltr/b$a;", "e", "Lcom/withpersona/sdk2/camera/e$a;", "f", "Lhn/c$a;", "g", "Luq/a;", "h", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "i", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10972m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C11742b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C3405e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C6434c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C3875e.a permissionRequestWorker;

    /* JADX INFO: renamed from: ro.m0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38827a;

        static {
            int[] iArr = new int[EnumC11028j1.values().length];
            try {
                iArr[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11028j1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11028j1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38827a = iArr;
        }
    }

    /* JADX INFO: renamed from: ro.m0$b */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$1", m39664f = "GovIdCaptureRenderer.kt", m39665l = {505}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f38828t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f38829u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C12255f<GovernmentIdState> f38830v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, C12255f<GovernmentIdState> c12255f, InterfaceC9557b<? super b> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f38829u = holographicTorchDelay;
            this.f38830v = c12255f;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f38829u, this.f38830v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f38828t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7800a.Companion companion = C7800a.INSTANCE;
                long jM32371p = C7801b.m32371p(this.f38829u.getTorchDurationMs(), EnumC7361b.MILLISECONDS);
                this.f38828t = 1;
                if (C7946z0.m32939c(jM32371p, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = this.f38830v.m45411i();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = workflowStateM45411i instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) workflowStateM45411i : null;
            if (holographicTorchDelay == null) {
                return Unit.f29331a;
            }
            this.f38830v.m45417p(GovernmentIdState.HolographicTorchDelay.m17005J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ro.m0$c */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2", m39664f = "GovIdCaptureRenderer.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f38831t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdWorkflow.Input f38833v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f38834w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C12255f<GovernmentIdState> f38835x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C11905l f38836y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, C12255f<GovernmentIdState> c12255f, C11905l c11905l, InterfaceC9557b<? super c> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f38833v = input;
            this.f38834w = holographicTorchDelay;
            this.f38835x = c12255f;
            this.f38836y = c11905l;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C10972m0.this.new c(this.f38833v, this.f38834w, this.f38835x, this.f38836y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f38831t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10972m0 c10972m0 = C10972m0.this;
            GovernmentIdWorkflow.Input input = this.f38833v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f38834w;
            c10972m0.m41646C(input, holographicTorchDelay, this.f38835x, holographicTorchDelay.getCaptureConfig(), this.f38836y, this.f38834w.getCameraProperties(), this.f38834w.getCapturedImage());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C10972m0(@NotNull Context applicationContext, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull C11742b.a webRtcWorkerFactory, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C3875e.a permissionRequestWorker) {
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

    /* JADX INFO: renamed from: D */
    public static final Unit m41593D(C12255f c12255f, C11905l c11905l) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m41594F(C12255f c12255f, Hint hint) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.CountdownToCapture countdownToCapture = workflowStateM45411i instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) workflowStateM45411i : null;
        if (countdownToCapture == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(GovernmentIdState.CountdownToCapture.m16986J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m41595G(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m41596H(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m41597I(GovernmentIdState.CountdownToCapture countdownToCapture, C10972m0 c10972m0, GovernmentIdWorkflow.Input input, C12255f c12255f, C11905l c11905l, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listMo16936d3 = countdownToCapture.getIdForReview().mo16936d3();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16936d3, 10));
        Iterator<T> it = listMo16936d3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listW0 = CollectionsKt.m31725w0(arrayList, absolutePaths);
        CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
        GovernmentId.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listW0;
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        c10972m0.m41646C(input, countdownToCapture, c12255f, captureConfig, c11905l, cameraProperties, GovernmentId.GovernmentIdImage.m16939f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m41598J(final C12255f c12255f, GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, final C11905l c11905l, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = workflowStateM45411i instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) workflowStateM45411i : null;
        if (countdownToCapture2 == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.mo16956E(), countdownToCapture.getCaptureConfig(), C3555n.m17609O(input, countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.mo16955D(), countdownToCapture2.getPartIndex(), C10643e.m40734e(c12255f, false), EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), error, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: ro.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10972m0.m41599K(c12255f, c11905l);
            }
        }, 11264, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m41599K(C12255f c12255f, C11905l c11905l) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m41600L(C10972m0 c10972m0, C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        C10643e.m40746q(c10972m0.applicationContext, c12255f, input, c11905l.m44496c(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m41601N(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m41602O(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m41603P(C10972m0 c10972m0, C12255f c12255f, GovernmentIdWorkflow.Input input) {
        C10643e.m40746q(c10972m0.applicationContext, c12255f, input, true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m41604R(C10972m0 c10972m0, GovernmentIdState.WaitForAutocapture waitForAutocapture, C12255f c12255f) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(c10972m0.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, C3555n.m17628d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m41605S(C10972m0 c10972m0, C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        C10643e.m40746q(c10972m0.applicationContext, c12255f, input, c11905l.m44496c(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m41606T(C12255f c12255f, GovernmentIdWorkflow.Input input, Function1 function1, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f38827a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) c12255f.m45411i();
            if (workflowState != null && (workflowState instanceof InterfaceC6848c)) {
                c12255f.m45417p(((InterfaceC6848c) workflowState).mo17063r(false));
            }
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            C10643e.m40745p(c12255f, input, null, function1);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m41607U(C12255f c12255f, GovernmentIdWorkflow.Input input, Function1 function1, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f38827a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) c12255f.m45411i();
            if (workflowState != null && (workflowState instanceof InterfaceC6840a)) {
                c12255f.m45417p(((InterfaceC6840a) workflowState).mo17062q(false));
            }
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            C10643e.m40745p(c12255f, input, null, function1);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m41608V(C10972m0 c10972m0, GovernmentIdState.WaitForAutocapture waitForAutocapture, C12255f c12255f, CaptureConfig captureConfig, InterfaceC13215h interfaceC13215h, C7347n c7347n) {
        List<GovernmentId> listM31892k;
        Object value = c7347n.getValue();
        Throwable thM30463e = C7347n.m30463e(value);
        if (thM30463e == null) {
            GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(c10972m0.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, C3555n.m17628d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            WorkflowState workflowStateM45411i = c12255f.m45411i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
            if (waitForAutocapture2 != null) {
                IdPart.SideIdPart currentPart = waitForAutocapture.getCurrentPart();
                GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
                if (governmentIdState == null || (listM31892k = governmentIdState.mo16956E()) == null) {
                    listM31892k = C7699p.m31892k();
                }
                c12255f.m45417p(new GovernmentIdState.CountdownToCapture(currentPart, listM31892k, captureConfig, governmentIdImage, waitForAutocapture2.mo16955D(), waitForAutocapture2.getPartIndex(), C10643e.m40734e(c12255f, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
            }
        } else {
            String message = thM30463e.getMessage();
            if (message != null && StringsKt.m32152a0(message, "ENOSPC", false, 2, null)) {
                interfaceC13215h.mo17905a(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            } else if (waitForAutocapture.getManualCapture() == Screen.C3527b.a.Hidden) {
                c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m41609W(C12255f c12255f, Hint hint) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m41610X(GovernmentIdState.WaitForAutocapture waitForAutocapture, C12255f c12255f, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (waitForAutocapture.getManualCapture() == Screen.C3527b.a.Hidden) {
            c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m41611Y(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, C10972m0 c10972m0, GovernmentIdWorkflow.Input input, C12255f c12255f, C11905l c11905l, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        c10972m0.m41646C(input, waitForAutocapture, c12255f, waitForAutocapture.getCaptureConfig(), c11905l, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, C3555n.m17630e0(waitForAutocapture.getCurrentPart().getSide()), C3540c.m17508b(captureConfig), GovernmentId.EnumC3485a.f13532b, null, null, 32, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m41612Z(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m41614a0(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m41616b0(C12255f c12255f, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, error, false, false, null, null, null, 32247, null));
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public static final Unit m41619d0(final C10972m0 c10972m0, final C12255f c12255f, final InterfaceC11932a interfaceC11932a, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, C11742b.b it) throws CameraAccessException {
        int i10;
        C6445h0 primaryChoice;
        C6445h0 primaryChoice2;
        C6445h0 primaryChoice3;
        Size size;
        C6445h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(it, "it");
        CameraChoices cameraChoicesM28079b = C6441f0.m28079b(c10972m0.applicationContext, EnumC6455m0.FRONT);
        if (it instanceof C11742b.b.C14265b) {
            Object objM45411i = c12255f.m45411i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM45411i : null;
            if (waitForAutocapture2 != 0 && waitForAutocapture2.getWebRtcState() == EnumC11917x.Connecting) {
                return Unit.f29331a;
            }
            if (waitForAutocapture2 != 0) {
                c12255f.m45417p(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture2, null, null, null, null, null, 0, null, EnumC11917x.Connecting, null, null, false, false, null, null, null, 32639, null));
            }
            if (interfaceC11932a != null) {
                interfaceC11932a.m44542h(c10972m0.webRtcWorkerFactory.getAndroidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String());
            }
            if (interfaceC11932a != null) {
                interfaceC11932a.m44543i(c10972m0.applicationContext);
            }
            int height = 0;
            int width = (cameraChoicesM28079b == null || (primaryChoice4 = cameraChoicesM28079b.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
            if (cameraChoicesM28079b != null && (primaryChoice3 = cameraChoicesM28079b.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                height = size.getHeight();
            }
            if ((cameraChoicesM28079b == null || (primaryChoice2 = cameraChoicesM28079b.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoicesM28079b == null || (primaryChoice = cameraChoicesM28079b.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                i10 = width;
            } else {
                i10 = height;
                height = width;
            }
            if (interfaceC11932a != null) {
                C11742b.b.C14265b c14265b = (C11742b.b.C14265b) it;
                interfaceC11932a.m44539e(c14265b.getResult().getUsername(), c14265b.getResult().getCredential(), c14265b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i10, height, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: ro.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10972m0.m41621e0(this.f38733a, input, waitForAutocapture);
                    }
                }, new Function0() { // from class: ro.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10972m0.m41623f0(interfaceC11932a, c12255f);
                    }
                }, new Function0() { // from class: ro.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10972m0.m41625g0(this.f38745a, input);
                    }
                }, new Function1() { // from class: ro.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C10972m0.m41627h0(this.f38755a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof C11742b.b.Error)) {
                throw new C7345l();
            }
            WorkflowState workflowStateM45411i = c12255f.m45411i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture3 = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
            if (waitForAutocapture3 == null || waitForAutocapture3.getWebRtcState() == EnumC11917x.Connecting) {
                return Unit.f29331a;
            }
            if (interfaceC11932a != null) {
                interfaceC11932a.m44535a();
            }
            GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
            c12255f.m45417p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m41621e0(C10972m0 c10972m0, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(c10972m0.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.m17059U().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m41623f0(InterfaceC11932a interfaceC11932a, C12255f c12255f) {
        interfaceC11932a.m44535a();
        GovernmentIdState governmentIdState = (GovernmentIdState) c12255f.m45411i();
        c12255f.m45417p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m41625g0(C10972m0 c10972m0, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(c10972m0.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m41627h0(C10972m0 c10972m0, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(c10972m0.trackingEventsLogger, step, false, 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C */
    public final void m41646C(GovernmentIdWorkflow.Input renderProps, GovernmentIdState renderState, final C12255f<GovernmentIdState> workflowContext, CaptureConfig captureConfig, final C11905l videoCaptureHelper, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage capturedId) {
        List<GovernmentId> listM31892k;
        List<IdPart> listM31892k2;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod govIdCaptureMethodM17562b = C3549j.m17562b(capturedId.getCaptureMethod());
            IdConfig.EnumC3514b enumC3514bM17611Q = C3555n.m17611Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethodM17562b, enumC3514bM17611Q != null ? C3555n.m17628d0(enumC3514bM17611Q) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int iIntValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        IdConfig idConfigM17509c = C3540c.m17509c(captureConfig);
        boolean z10 = videoCaptureHelper.m44496c(renderProps) && iIntValue > 0 && renderState.mo16956E().isEmpty() && sideIdPart != null;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            workflowContext.m45417p(new GovernmentIdState.HolographicTorchDelay(sideIdPart, renderState.mo16956E(), renderState.mo16955D(), renderState.getPartIndex(), renderState.getBackState(), renderState.getCountryCode(), captureConfig, cameraProperties, iIntValue, capturedId, false, 1024, null));
            return;
        }
        IdPart.SideIdPart sideIdPart2 = sideIdPart;
        boolean z11 = videoCaptureHelper.m44496c(renderProps) && !renderProps.getAutoClassificationConfig().getIsEnabled();
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigM17509c != null && (z11 || shouldSkipReviewScreen)) {
            C10643e.m40748s(renderState, workflowContext, renderProps, capturedId, idConfigM17509c, videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
            return;
        }
        if (sideIdPart2 == null) {
            return;
        }
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart2, renderState.mo16956E(), captureConfig, C3555n.m17609O(renderProps, sideIdPart2.getSide()), renderState.mo16955D(), renderState.getPartIndex(), renderState.getBackState(), EnumC11917x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: ro.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10972m0.m41593D(workflowContext, videoCaptureHelper);
            }
        }, 11776, null);
        IdPart currentPart2 = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart3 = currentPart2 instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart2 : null;
        if (sideIdPart3 == null) {
            return;
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) workflowContext.m45411i();
        if (governmentIdState == null || (listM31892k = governmentIdState.mo16956E()) == null) {
            listM31892k = C7699p.m31892k();
        }
        List<GovernmentId> list = listM31892k;
        GovernmentIdState governmentIdState2 = (GovernmentIdState) workflowContext.m45411i();
        if (governmentIdState2 == null || (listM31892k2 = governmentIdState2.mo16955D()) == null) {
            listM31892k2 = C7699p.m31892k();
        }
        List<IdPart> list2 = listM31892k2;
        GovernmentIdState governmentIdState3 = (GovernmentIdState) workflowContext.m45411i();
        int partIndex = governmentIdState3 != null ? governmentIdState3.getPartIndex() : 0;
        GovernmentIdState governmentIdState4 = (GovernmentIdState) workflowContext.m45411i();
        workflowContext.m45417p(new GovernmentIdState.ReviewCapturedImage(sideIdPart3, list, captureConfig, capturedId, list2, partIndex, waitForAutocapture, cameraProperties, null, false, governmentIdState4 != null ? governmentIdState4.getCountryCode() : null, 768, null));
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Screen m41647E(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final InterfaceC13215h<? super GovernmentIdWorkflow.AbstractC3503a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        workflowContext.m45415n(this.governmentIdHintWorkerFactory.mo38708a(renderState.getCurrentPart().getSide()), new Function1() { // from class: ro.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10972m0.m41594F(workflowContext, (Hint) obj);
            }
        });
        String strM17605K = C3555n.m17605K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), C3540c.m17508b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), C3540c.m17508b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(renderState.getCaptureConfig());
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        List<AutoCaptureRule> listM16167a = idSideConfigM17510d.getAutoCaptureConfig().getRuleSet().m16167a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1M40736g = C10643e.m40736g(workflowContext, false, onOutput, 1, null);
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        String strM17612R = C3555n.m17612R(renderProps.getStrings(), renderState.getHint());
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return C3551l.m17572f(renderProps, strM17605K, strM17604J, capturing, aVar, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014a: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x0146: INVOKE 
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r8v5 'strM17605K' java.lang.String)
              (r9v6 'strM17604J' java.lang.String)
              (r10v5 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r6v9 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v1 'enumC10302bM17507a' po.b)
              (r11v4 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r6v11 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:0x00f9: CONSTRUCTOR (r43v0 'sink' ym.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a> A[DONT_INLINE]) A[MD:(ym.h):void (m), WRAPPED] call: ro.g0.<init>(ym.h):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x0100: CONSTRUCTOR 
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.h0.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              true
              (r13v3 'listM16167a' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
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
              (r21v0 'function1M40736g' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'enumC8598aM44498e' mn.a))
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
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 'strM17612R' java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r32v0 'webRtcManager' ur.a))
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
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
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
            this = this;
            r2 = r38
            r1 = r39
            r15 = r40
            r4 = r41
            r5 = r42
            r0 = r43
            r3 = r44
            java.lang.String r6 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "renderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r6)
            java.lang.String r6 = "workflowContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r6 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            java.lang.String r6 = "onOutput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "transition"
            r7 = r45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r6 = r15.getCaptureConfig()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r8 = r15.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r8 = r8.getSide()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r6 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17510d(r6, r8)
            oo.a$b r8 = r2.governmentIdHintWorkerFactory
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r9 = r15.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r9 = r9.getSide()
            oo.a r8 = r8.mo38708a(r9)
            ro.f0 r9 = new ro.f0
            r9.<init>()
            r4.m45415n(r8, r9)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r8 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r9 = r15.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r9 = r9.getSide()
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r10 = r15.getCaptureConfig()
            java.lang.String r10 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17508b(r10)
            java.lang.String r11 = r15.getCountryCode()
            java.lang.String r8 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r8, r9, r10, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r9 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r10 = r15.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r10 = r10.getSide()
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r11 = r15.getCaptureConfig()
            java.lang.String r11 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17508b(r11)
            java.lang.String r12 = r15.getCountryCode()
            java.lang.String r9 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r9, r10, r11, r12)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r1.getStrings()
            java.lang.String r10 = r10.getCapturing()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r11 = r15.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r11 = r11.getSide()
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r12 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            r13 = r6
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r6 = r13.getOverlay()
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r14 = r15.getCaptureConfig()
            po.b r14 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17507a(r14)
            r16 = r6
            uq.a r6 = r2.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r6 = r6.m44528b()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$AutoCaptureConfig r13 = r13.getAutoCaptureConfig()
            com.withpersona.sdk2.camera.AutoCaptureRuleSet r13 = r13.getRuleSet()
            java.util.List r13 = r13.m16167a()
            r17 = r9
            r9 = r6
            r6 = r16
            int r16 = r15.getPartIndex()
            int r18 = r1.getImageCaptureCount()
            r19 = r6
            r6 = 1
            int r29 = r18 + (-1)
            r7 = 0
            r18 = r8
            r8 = 0
            kotlin.jvm.functions.Function1 r21 = p389qo.C10643e.m40736g(r4, r7, r3, r6, r8)
            mn.a r22 = r5.m44498e(r1)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r6 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint r7 = r15.getHint()
            java.lang.String r30 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17612R(r6, r7)
            ur.a r32 = r5.getWebRtcManager()
            com.withpersona.sdk2.camera.e$a r6 = r2.cameraXControllerFactory
            hn.c$a r7 = r2.camera2ControllerFactory
            r8 = r11
            ro.g0 r11 = new ro.g0
            r11.<init>()
            r20 = r12
            ro.h0 r12 = new ro.h0
            r12.<init>()
            ro.i0 r0 = new ro.i0
            r3 = r1
            r1 = r15
            r0.<init>()
            r1 = r3
            r3 = r17
            r17 = r6
            r6 = r19
            r19 = r0
            r0 = r2
            ro.j0 r2 = new ro.j0
            r2.<init>()
            r43 = r2
            ro.k0 r2 = new ro.k0
            r2.<init>()
            r36 = 1
            r37 = 0
            r4 = r10
            r10 = 0
            r28 = r2
            r2 = r18
            r18 = r7
            r7 = r14
            r14 = r13
            r13 = 1
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r31 = 0
            r33 = 0
            r35 = 1203765760(0x47c00200, float:98308.0)
            r34 = r45
            r5 = r20
            r20 = r43
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C10972m0.m41647E(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, vr.f, uo.l, ym.h, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final Screen m41648M(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput) {
        final C10972m0 c10972m0;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        workflowContext.m45414m("holographic_torch_delay", new b(renderState, workflowContext, null));
        if (renderState.getHolographicTorchEnabled()) {
            c10972m0 = this;
        } else {
            c cVar = new c(renderProps2, renderState, workflowContext, videoCaptureHelper, null);
            c10972m0 = this;
            renderProps2 = renderProps2;
            workflowContext.m45414m("holographic_torch_complete", cVar);
        }
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, renderState.getCurrentPart().getSide());
        String strM17508b = C3540c.m17508b(captureConfig);
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        String strM17605K = C3555n.m17605K(renderProps2.getStrings(), side, strM17508b, renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps2.getStrings(), side, strM17508b, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(captureConfig);
        NavigationState navigationStateM44528b = c10972m0.navigationStateManager.m44528b();
        List listM31892k = C7699p.m31892k();
        int partIndex = renderState.getPartIndex();
        Function1 function1M40736g = C10643e.m40736g(workflowContext, false, onOutput, 1, null);
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps2);
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return C3551l.m17572f(renderProps2, strM17605K, strM17604J, capturing, aVar, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0100: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x00fc: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'strM17605K' java.lang.String)
              (r6v1 'strM17604J' java.lang.String)
              (r11v3 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r3v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r2v2 'enumC10302bM17507a' po.b)
              (r9v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r13v1 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
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
              (r14v0 'listM31892k' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay)
              (r16v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00b0: IGET (r0v8 'c10972m0' ro.m0) A[WRAPPED] ro.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00b2: IGET (r0v8 'c10972m0' ro.m0) A[WRAPPED] ro.m0.f hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (r21v0 'function1M40736g' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'enumC8598aM44498e' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap kotlin.jvm.functions.Function0:0x00c7: CONSTRUCTOR 
              (r0v8 'c10972m0' ro.m0 A[DONT_INLINE])
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: ro.e0.<init>(ro.m0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r32v0 'webRtcManager' ur.a))
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
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
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
            this = this;
            r1 = r40
            r15 = r41
            r4 = r42
            r5 = r43
            r7 = r44
            java.lang.String r0 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "renderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "workflowContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onOutput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            ro.m0$b r0 = new ro.m0$b
            r8 = 0
            r0.<init>(r15, r4, r8)
            java.lang.String r2 = "holographic_torch_delay"
            r4.m45414m(r2, r0)
            boolean r0 = r15.getHolographicTorchEnabled()
            if (r0 != 0) goto L4a
            ro.m0$c r0 = new ro.m0$c
            r6 = 0
            r2 = r1
            r3 = r15
            r1 = r39
            r0.<init>(r2, r3, r4, r5, r6)
            r38 = r2
            r2 = r0
            r0 = r1
            r1 = r38
            java.lang.String r3 = "holographic_torch_complete"
            r4.m45414m(r3, r2)
            goto L4c
        L4a:
            r0 = r39
        L4c:
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r2 = r41.getCaptureConfig()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r3 = r41.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r3 = r3.getSide()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r3 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17510d(r2, r3)
            java.lang.String r6 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17508b(r2)
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r9 = r41.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r9 = r9.getSide()
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r1.getStrings()
            java.lang.String r11 = r41.getCountryCode()
            java.lang.String r10 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r10, r9, r6, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r11 = r1.getStrings()
            java.lang.String r12 = r41.getCountryCode()
            java.lang.String r6 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r11, r9, r6, r12)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r11 = r1.getStrings()
            java.lang.String r11 = r11.getCapturing()
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r12 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r3 = r3.getOverlay()
            po.b r2 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17507a(r2)
            uq.a r13 = r0.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r13 = r13.m44528b()
            java.util.List r14 = kotlin.collections.C7699p.m31892k()
            int r16 = r41.getPartIndex()
            r15 = 0
            r17 = r2
            r2 = 1
            kotlin.jvm.functions.Function1 r21 = p389qo.C10643e.m40736g(r4, r15, r7, r2, r8)
            mn.a r22 = r5.m44498e(r1)
            ur.a r32 = r5.getWebRtcManager()
            com.withpersona.sdk2.camera.e$a r2 = r0.cameraXControllerFactory
            hn.c$a r8 = r0.camera2ControllerFactory
            boolean r33 = r41.getHolographicTorchEnabled()
            r15 = r11
            ro.l r11 = new ro.l
            r11.<init>()
            r18 = r12
            ro.w r12 = new ro.w
            r12.<init>()
            ro.e0 r5 = new ro.e0
            r5.<init>()
            r36 = 2
            r37 = 0
            r7 = r17
            r17 = r2
            r2 = r10
            r10 = 0
            r28 = r5
            r5 = r18
            r18 = r8
            r8 = r9
            r9 = r13
            r13 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r34 = 0
            r35 = 1741423104(0x67cc0200, float:1.9267993E24)
            r4 = r6
            r6 = r3
            r3 = r4
            r4 = r15
            r15 = r41
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C10972m0.m41648M(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay, vr.f, uo.l, kotlin.jvm.functions.Function1):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final Screen m41649Q(@NotNull Context context, @NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final InterfaceC13215h<? super GovernmentIdWorkflow.AbstractC3503a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, renderState.getCurrentPart().getSide());
        String strM17508b = C3540c.m17508b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        workflowContext.m45415n(this.governmentIdAnalyzeWorkerFactory.mo17543a(renderState.getCurrentPart().getSide(), strM17508b), new Function1() { // from class: ro.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10972m0.m41608V(this.f38810a, renderState, workflowContext, captureConfig, sink, (C7347n) obj);
            }
        });
        workflowContext.m45415n(this.governmentIdHintWorkerFactory.mo38708a(renderState.getCurrentPart().getSide()), new Function1() { // from class: ro.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10972m0.m41609W(workflowContext, (Hint) obj);
            }
        });
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        EnumC8598a enumC8598a = EnumC8598a.Stream;
        boolean z11 = enumC8598aM44498e == enumC8598a && !videoCaptureHelper.m44497d();
        if (idSideConfigM17510d.getManualCaptureConfig().getIsEnabled() && !z11) {
            workflowContext.m45415n(new TimerWorker(C7764d.m32079d(idSideConfigM17510d.getManualCaptureConfig().getDelayMs(), 0L)), new Function1() { // from class: ro.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10972m0.m41610X(renderState, workflowContext, (Unit) obj);
                }
            });
        }
        String strM17605K = C3555n.m17605K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode());
        String strM17610P = C3555n.m17610P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode(), z10);
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        Screen.C3527b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(captureConfig);
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        List<AutoCaptureRule> listM16167a = idSideConfigM17510d.getAutoCaptureConfig().getRuleSet().m16167a();
        int partIndex = renderState.getPartIndex();
        Function1 function1M40736g = C10643e.m40736g(workflowContext, false, onOutput, 1, null);
        EnumC8598a enumC8598aM44498e2 = videoCaptureHelper.m44498e(renderProps);
        String strM17612R = C3555n.m17612R(renderProps.getStrings(), renderState.getHint());
        InterfaceC8607i interfaceC8607iM17606L = C3555n.m17606L(renderProps, renderState.getCurrentPart().getSide());
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.C3527b c3527bM17572f = C3551l.m17572f(renderProps, strM17605K, strM17604J, strM17610P, manualCapture, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b4: INVOKE (r4v3 'c3527bM17572f' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'strM17605K' java.lang.String)
              (r11v1 'strM17604J' java.lang.String)
              (r12v1 'strM17610P' java.lang.String)
              (r12v2 'manualCapture' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r13v2 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v4 'enumC10302bM17507a' po.b)
              (r13v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r22v0 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x0160: CONSTRUCTOR 
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
              (r17v4 'listM16167a' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture)
              (r23v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x0151: IGET (r45v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x0153: IGET (r45v0 'this' ro.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.m0.f hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x0172: CONSTRUCTOR (r49v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE]) A[MD:(vr.f):void (m), WRAPPED] call: ro.s.<init>(vr.f):void type: CONSTRUCTOR))
              (r28v0 'function1M40736g' kotlin.jvm.functions.Function1)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r29v0 'enumC8598aM44498e2' mn.a))
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
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 'strM17612R' java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (r38v0 'interfaceC8607iM17606L' mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r39v0 'webRtcManager' ur.a))
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
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
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
            this = this;
            r1 = r45
            r7 = r46
            r8 = r47
            r2 = r48
            r3 = r49
            r6 = r50
            r5 = r51
            r9 = r52
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "renderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "workflowContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onOutput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "transition"
            r10 = r53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.withpersona.sdk2.inquiry.governmentid.CaptureConfig r4 = r2.getCaptureConfig()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r0 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r0 = r0.getSide()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r11 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17510d(r4, r0)
            java.lang.String r12 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17508b(r4)
            boolean r13 = r4 instanceof com.withpersona.sdk2.inquiry.governmentid.CaptureConfig.AutoClassifyConfig
            com.withpersona.sdk2.inquiry.governmentid.f$a r0 = r1.governmentIdAnalyzeWorkerFactory
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r14 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r14 = r14.getSide()
            com.withpersona.sdk2.inquiry.governmentid.f r14 = r0.mo17543a(r14, r12)
            ro.l0 r0 = new ro.l0
            r0.<init>()
            r15 = r5
            r3.m45415n(r14, r0)
            oo.a$b r0 = r1.governmentIdHintWorkerFactory
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r5 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r5 = r5.getSide()
            oo.a r0 = r0.mo38708a(r5)
            ro.n r5 = new ro.n
            r5.<init>()
            r3.m45415n(r0, r5)
            mn.a r0 = r6.m44498e(r8)
            mn.a r14 = mn.EnumC8598a.Stream
            if (r0 != r14) goto L8d
            boolean r0 = r6.m44497d()
            if (r0 != 0) goto L8d
            r0 = 1
            goto L8e
        L8d:
            r0 = 0
        L8e:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$ManualCaptureConfig r17 = r11.getManualCaptureConfig()
            boolean r17 = r17.getIsEnabled()
            if (r17 == 0) goto Lb8
            if (r0 != 0) goto Lb8
            vr.d r0 = new vr.d
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$ManualCaptureConfig r17 = r11.getManualCaptureConfig()
            long r5 = r17.getDelayMs()
            r17 = r11
            r10 = 0
            long r5 = kotlin.ranges.C7764d.m32079d(r5, r10)
            r0.<init>(r5)
            ro.o r5 = new ro.o
            r5.<init>()
            r3.m45415n(r0, r5)
            goto Lba
        Lb8:
            r17 = r11
        Lba:
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r0 = r8.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r5 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r5 = r5.getSide()
            java.lang.String r6 = r2.getCountryCode()
            java.lang.String r10 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r0, r5, r12, r6)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r0 = r8.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r5 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r5 = r5.getSide()
            java.lang.String r6 = r2.getCountryCode()
            java.lang.String r11 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r0, r5, r12, r6)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r0 = r8.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r5 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r5 = r5.getSide()
            java.lang.String r6 = r2.getCountryCode()
            java.lang.String r12 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17610P(r0, r5, r12, r6, r13)
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r0 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r13 = r0.getSide()
            r19 = r10
            r10 = r11
            r11 = r12
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r12 = r2.getManualCapture()
            r20 = r13
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r13 = r17.getOverlay()
            r21 = r14
            po.b r14 = com.withpersona.sdk2.inquiry.governmentid.C3540c.m17507a(r4)
            uq.a r0 = r1.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r22 = r0.m44528b()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$AutoCaptureConfig r0 = r17.getAutoCaptureConfig()
            com.withpersona.sdk2.camera.AutoCaptureRuleSet r0 = r0.getRuleSet()
            java.util.List r17 = r0.m16167a()
            int r23 = r2.getPartIndex()
            r0 = 0
            r5 = 0
            r6 = 1
            kotlin.jvm.functions.Function1 r28 = p389qo.C10643e.m40736g(r3, r5, r9, r6, r0)
            r6 = r50
            mn.a r29 = r6.m44498e(r8)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r0 = r8.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint r5 = r2.getHint()
            java.lang.String r37 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17612R(r0, r5)
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r0 = r2.getCurrentPart()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r0 = r0.getSide()
            mo.i r38 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17606L(r8, r0)
            ur.a r39 = r6.getWebRtcManager()
            com.withpersona.sdk2.camera.e$a r0 = r1.cameraXControllerFactory
            hn.c$a r5 = r1.camera2ControllerFactory
            r24 = r0
            ro.p r0 = new ro.p
            r25 = r5
            r5 = r3
            r3 = r1
            r1 = r2
            r2 = r4
            r4 = r8
            r0.<init>()
            r2 = r1
            r1 = r3
            r3 = r5
            ro.q r4 = new ro.q
            r4.<init>()
            ro.r r5 = new ro.r
            r5.<init>()
            ro.s r15 = new ro.s
            r15.<init>()
            r16 = r0
            ro.t r0 = new ro.t
            r0.<init>()
            r34 = r0
            ro.u r0 = new ro.u
            r0.<init>()
            r43 = 1
            r44 = 0
            r27 = r15
            r15 = r20
            r20 = 0
            r26 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = 0
            r40 = 0
            r42 = 331612160(0x13c40000, float:4.9477356E-27)
            r18 = r22
            r22 = r2
            r2 = r21
            r21 = r17
            r17 = r16
            r16 = r18
            r41 = r53
            r35 = r0
            r18 = r4
            r0 = r9
            r9 = r19
            r19 = r5
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r4 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r5 = r22
            boolean r9 = r5.getCheckCameraPermissions()
            java.lang.String r10 = ""
            java.lang.String r11 = "getString(...)"
            if (r9 == 0) goto L22e
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$a r2 = r1.permissionRequestWorker
            com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props r12 = new com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props
            rp.i0 r13 = p419rp.EnumC11024i0.Camera
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r5 = r8.getStrings()
            java.lang.String r5 = r5.getCameraPermissionsTitle()
            if (r5 != 0) goto L1d6
            r15 = r10
            goto L1d7
        L1d6:
            r15 = r5
        L1d7:
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r5 = r8.getStrings()
            java.lang.String r5 = r5.getCameraPermissionsPrompt()
            if (r5 != 0) goto L1ea
            int r5 = p497vp.C12244g.f43261q
            java.lang.String r5 = r7.getString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)
        L1ea:
            r16 = r5
            int r5 = p497vp.C12244g.f43260p
            java.lang.String r6 = p226jq.C7259g.m30268b(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r5 = r7.getString(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r6 = r8.getStrings()
            java.lang.String r18 = r6.getCameraPermissionsAllowButtonText()
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r6 = r8.getStrings()
            java.lang.String r19 = r6.getCameraPermissionsCancelButtonText()
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle r23 = r8.getStyles()
            r24 = 898(0x382, float:1.258E-42)
            r25 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e r2 = r2.mo19201a(r12)
            ro.v r5 = new ro.v
            r5.<init>()
            r3.m45415n(r2, r5)
            return r4
        L22e:
            boolean r9 = r5.getCheckAudioPermissions()
            if (r9 == 0) goto L2b6
            boolean r9 = r6.m44496c(r8)
            if (r9 == 0) goto L2b6
            android.content.Context r9 = r1.applicationContext
            boolean r9 = p226jq.C7259g.m30272f(r9)
            if (r9 == 0) goto L2b6
            com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig r9 = r8.getVideoCaptureConfig()
            boolean r9 = r9.getRecordAudio()
            if (r9 == 0) goto L2b6
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$a r2 = r1.permissionRequestWorker
            com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props r12 = new com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props
            rp.i0 r13 = p419rp.EnumC11024i0.RecordAudio
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r5 = r8.getStrings()
            java.lang.String r5 = r5.getMicrophonePermissionsTitle()
            if (r5 != 0) goto L25e
            r15 = r10
            goto L25f
        L25e:
            r15 = r5
        L25f:
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r5 = r8.getStrings()
            java.lang.String r5 = r5.getMicrophonePermissionsPrompt()
            if (r5 != 0) goto L272
            int r5 = p497vp.C12244g.f43234S
            java.lang.String r5 = r7.getString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)
        L272:
            r16 = r5
            int r5 = p497vp.C12244g.f43233R
            java.lang.String r6 = p226jq.C7259g.m30268b(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r5 = r7.getString(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r6 = r8.getStrings()
            java.lang.String r18 = r6.getMicrophonePermissionsAllowButtonText()
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r6 = r8.getStrings()
            java.lang.String r19 = r6.getMicrophonePermissionsCancelButtonText()
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle r23 = r8.getStyles()
            r24 = 898(0x382, float:1.258E-42)
            r25 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e r2 = r2.mo19201a(r12)
            ro.m r5 = new ro.m
            r5.<init>()
            r3.m45415n(r2, r5)
            return r4
        L2b6:
            mn.a r0 = r6.m44498e(r8)
            if (r0 != r2) goto L2cb
            uo.x r0 = r5.getWebRtcState()
            uo.x r2 = p473uo.EnumC11917x.Disconnected
            if (r0 != r2) goto L2cb
            ur.a r0 = r6.getWebRtcManager()
            r1.m41650c0(r8, r5, r3, r0)
        L2cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C10972m0.m41649Q(android.content.Context, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, vr.f, uo.l, ym.h, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41650c0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final C12255f<GovernmentIdState> workflowContext, final InterfaceC11932a webRtcManager) {
        workflowContext.m45415n(this.webRtcWorkerFactory.m43961a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: ro.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10972m0.m41619d0(this.f38908a, workflowContext, webRtcManager, renderState, renderProps, (C11742b.b) obj);
            }
        });
    }
}
