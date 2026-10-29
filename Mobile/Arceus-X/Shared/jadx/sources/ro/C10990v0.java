package ro;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3551l;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hn.C6434c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7946z0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p361po.EnumC10302b;
import p389qo.C10643e;
import p473uo.C11905l;
import p475uq.C11930a;
import p499vr.C12255f;
import p526wq.EnumC12529l;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ro.v0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m31665d2 = {"Lro/v0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "h", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lvr/f;)V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10990v0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3405e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C6434c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: ro.v0$a */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", m39664f = "GovIdLocalVideoCaptureRenderer.kt", m39665l = {54}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f38888t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdState.FinalizeLocalVideoCapture f38889u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C12255f<GovernmentIdState> f38890v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, C12255f<GovernmentIdState> c12255f, InterfaceC9557b<? super a> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f38889u = finalizeLocalVideoCapture;
            this.f38890v = c12255f;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f38889u, this.f38890v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f38888t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long minDurationMs = this.f38889u.getMinDurationMs();
                this.f38888t = 1;
                if (C7946z0.m32938b(minDurationMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = this.f38890v.m45411i();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateM45411i instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) workflowStateM45411i : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f29331a;
            }
            this.f38890v.m45417p(GovernmentIdState.FinalizeLocalVideoCapture.m16994J(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, FrameMetricsAggregator.EVERY_DURATION, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C10990v0(@NotNull Context applicationContext, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m41663j(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m41664k(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m41665l(C12255f c12255f, GovernmentIdWorkflow.Input input, Function1 function1) {
        C10643e.m40745p(c12255f, input, null, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41666m(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m41667n(C10990v0 c10990v0, GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, GovernmentIdWorkflow.Input input, C11905l c11905l, C12255f c12255f, File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        c10990v0.m41670h(file, finalizeLocalVideoCapture, input, c11905l, cameraProperties, c12255f);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m41668o() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41669p(C10990v0 c10990v0, C12255f c12255f, GovernmentIdWorkflow.Input input) {
        C10643e.m40746q(c10990v0.applicationContext, c12255f, input, true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public final void m41670h(File file, GovernmentIdState.FinalizeLocalVideoCapture renderState, GovernmentIdWorkflow.Input renderProps, C11905l videoCaptureHelper, CameraProperties cameraProperties, C12255f<GovernmentIdState> workflowContext) {
        List<GovernmentId> listMo16956E = renderState.mo16956E();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16956E, 10));
        Iterator<T> it = listMo16956E.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.EnumC3486b enumC3486b = GovernmentId.EnumC3486b.FRONT;
        boolean zContains = arrayList.contains(enumC3486b);
        GovernmentId.EnumC3486b enumC3486b2 = GovernmentId.EnumC3486b.BACK;
        boolean zContains2 = arrayList.contains(enumC3486b2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listM31878d = C7697o.m31878d(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            enumC3486b = GovernmentId.EnumC3486b.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            enumC3486b = enumC3486b2;
        }
        C10643e.m40748s(renderState, workflowContext, renderProps, new GovernmentId.GovernmentIdVideo(listM31878d, enumC3486b, renderState.getId().getIdClassKey(), GovernmentId.EnumC3485a.f13532b), renderState.getId(), videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Screen m41671i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeLocalVideoCapture renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        IdConfig.EnumC3514b side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        workflowContext.m45414m("finalize_delay", new a(renderState, workflowContext, null));
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.EnumC3514b.Front;
        }
        IdConfig.EnumC3514b enumC3514b = side;
        IdConfig.IdSideConfig idSideConfigM17273g = renderState.getId().m17273g(enumC3514b);
        String strM17605K = C3555n.m17605K(renderProps.getStrings(), enumC3514b, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps.getStrings(), enumC3514b, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        EnumC10302b type = renderState.getId().getType();
        Screen.Overlay overlay = idSideConfigM17273g.getOverlay();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        List listM31892k = C7699p.m31892k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1M40735f = C10643e.m40735f(workflowContext, false, onOutput);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return C3551l.m17572f(renderProps, strM17605K, strM17604J, capturing, aVar, overlay, type, enumC3514b, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0119: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x0115: INVOKE 
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r7v3 'strM17605K' java.lang.String)
              (r9v3 'strM17604J' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r11v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r13v0 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r12v1 'type' po.b)
              (r8v2 'enumC3514b' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r14v0 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00bc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.o0.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00c3: CONSTRUCTOR 
              (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.p0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00cb: CONSTRUCTOR 
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.q0.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v1 'listM31892k' java.util.List)
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture)
              (r16v1 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00b4: IGET (r38v0 'this' ro.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.v0.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00b6: IGET (r38v0 'this' ro.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ro.v0.c hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00d2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.r0.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1M40735f' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (wrap mn.a:0x00b2: SGET  A[WRAPPED] mn.a.b mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00dc: CONSTRUCTOR 
              (r38v0 'this' ro.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
             A[MD:(ro.v0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, vr.f):void (m), WRAPPED] call: ro.s0.<init>(ro.v0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, vr.f):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.t0.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00e7: CONSTRUCTOR 
              (r38v0 'this' ro.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(ro.v0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: ro.u0.<init>(ro.v0, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (null ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (r44v0 'transition' wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             in method: ro.v0.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, uo.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
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
            r1 = r38
            r3 = r39
            r15 = r40
            r5 = r41
            r0 = r43
            java.lang.String r2 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "renderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "workflowContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "videoCaptureHelper"
            r4 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "onOutput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "transition"
            r6 = r44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            ro.v0$a r2 = new ro.v0$a
            r7 = 0
            r2.<init>(r15, r5, r7)
            java.lang.String r8 = "finalize_delay"
            r5.m45414m(r8, r2)
            com.withpersona.sdk2.inquiry.governmentid.IdPart r2 = r15.getCurrentPart()
            boolean r8 = r2 instanceof com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart
            if (r8 == 0) goto L42
            r7 = r2
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r7 = (com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart) r7
        L42:
            if (r7 == 0) goto L4d
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r2 = r7.getSide()
            if (r2 != 0) goto L4b
            goto L4d
        L4b:
            r8 = r2
            goto L50
        L4d:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r2 = com.withpersona.sdk2.inquiry.governmentid.IdConfig.EnumC3514b.Front
            goto L4b
        L50:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r2 = r15.getId()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r2 = r2.m17273g(r8)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r7 = r3.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r9 = r15.getId()
            java.lang.String r9 = r9.getIdClassKey()
            java.lang.String r10 = r15.getCountryCode()
            java.lang.String r7 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r7, r8, r9, r10)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r9 = r3.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r10 = r15.getId()
            java.lang.String r10 = r10.getIdClassKey()
            java.lang.String r11 = r15.getCountryCode()
            java.lang.String r9 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r9, r8, r10, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r3.getStrings()
            java.lang.String r10 = r10.getCapturing()
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r11 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r12 = r15.getId()
            po.b r12 = r12.getType()
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r13 = r2.getOverlay()
            uq.a r2 = r1.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r14 = r2.m44528b()
            r16 = r9
            r9 = r14
            java.util.List r14 = kotlin.collections.C7699p.m31892k()
            r17 = r16
            int r16 = r15.getPartIndex()
            r2 = 0
            kotlin.jvm.functions.Function1 r21 = p389qo.C10643e.m40735f(r5, r2, r0)
            boolean r25 = r15.getIsDelayComplete()
            mn.a r22 = mn.EnumC8598a.Upload
            com.withpersona.sdk2.camera.e$a r2 = r1.cameraXControllerFactory
            hn.c$a r6 = r1.camera2ControllerFactory
            r18 = r10
            ro.o0 r10 = new ro.o0
            r10.<init>()
            r19 = r11
            ro.p0 r11 = new ro.p0
            r11.<init>()
            r20 = r7
            r7 = r12
            ro.q0 r12 = new ro.q0
            r12.<init>()
            r23 = r20
            ro.r0 r20 = new ro.r0
            r20.<init>()
            ro.s0 r26 = new ro.s0
            r0 = r15
            r15 = r2
            r2 = r0
            r0 = r26
            r0.<init>()
            r0 = r1
            ro.t0 r27 = new ro.t0
            r27.<init>()
            ro.u0 r1 = new ro.u0
            r1.<init>()
            r36 = 1
            r37 = 0
            r4 = r18
            r18 = r6
            r6 = r13
            r13 = 0
            r5 = r19
            r19 = 0
            r2 = r23
            r23 = 0
            r24 = 1
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 1610874880(0x60040000, float:3.804641E19)
            r34 = r44
            r28 = r1
            r1 = r3
            r3 = r17
            r17 = r15
            r15 = r40
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C10990v0.m41671i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, vr.f, uo.l, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }
}
