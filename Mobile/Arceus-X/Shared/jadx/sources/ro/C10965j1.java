package ro;

import android.content.Context;
import ar.C1147b;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3551l;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import p361po.EnumC10302b;
import p389qo.C10643e;
import p473uo.C11905l;
import p475uq.C11930a;
import p476ur.InterfaceC11932a;
import p499vr.C12255f;
import p526wq.EnumC12529l;

/* JADX INFO: renamed from: ro.j1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m31665d2 = {"Lro/j1;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "u", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10965j1 {

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

    public C10965j1(@NotNull Context applicationContext, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    /* JADX INFO: renamed from: n */
    public static final Unit m41571n(C10965j1 c10965j1, GovernmentIdWorkflow.Input input, InterfaceC11932a interfaceC11932a, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, C12255f c12255f, C11905l c11905l, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(c10965j1.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (interfaceC11932a.isConnected()) {
            interfaceC11932a.m44538d();
            C10643e.m40748s(finalizeWebRtc, c12255f, input, null, finalizeWebRtc.getId(), c11905l, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.mo16955D(), 0, it, null, 2560, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m41572o(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41573p(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41574q(C12255f c12255f, GovernmentIdWorkflow.Input input, C11905l c11905l, Function1 function1) {
        C10643e.m40745p(c12255f, input, c11905l, function1);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m41575r(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m41576s() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m41577t(C10965j1 c10965j1, C12255f c12255f, GovernmentIdWorkflow.Input input) {
        C10643e.m40746q(c10965j1.applicationContext, c12255f, input, true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m41578v(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m41579w(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m41580x(C10965j1 c10965j1, GovernmentIdWorkflow.Input input, InterfaceC11932a interfaceC11932a, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, C12255f c12255f, C11905l c11905l, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(c10965j1.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (interfaceC11932a.isConnected()) {
            interfaceC11932a.m44538d();
            C10643e.m40748s(finalizeWebRtc, c12255f, input, null, finalizeWebRtc.getId(), c11905l, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.mo16955D(), 0, it, null, 2560, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m41581y(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m41582z(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Screen m41583m(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        final C10965j1 c10965j1;
        final InterfaceC11932a interfaceC11932a;
        IdConfig.EnumC3514b side;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            interfaceC11932a = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: ro.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10965j1.m41571n(this.f38902a, renderProps2, interfaceC11932a, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            };
            c10965j1 = this;
            renderProps2 = renderProps2;
            interfaceC11932a.m44540f(fromStep, function1);
        } else {
            c10965j1 = this;
            interfaceC11932a = webRtcManager;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.EnumC3514b.Front;
        }
        IdConfig.IdSideConfig idSideConfigM17273g = renderState.getId().m17273g(side);
        String strM17605K = C3555n.m17605K(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        EnumC10302b type = renderState.getId().getType();
        Screen.Overlay overlay = idSideConfigM17273g.getOverlay();
        NavigationState navigationStateM44528b = c10965j1.navigationStateManager.m44528b();
        List listM31892k = C7699p.m31892k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1M40735f = C10643e.m40735f(workflowContext, false, onOutput);
        EnumC8598a enumC8598a = EnumC8598a.Stream;
        return C3551l.m17572f(renderProps2, strM17605K, strM17604J, capturing, aVar, overlay, type, side, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011b: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x0117: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'strM17605K' java.lang.String)
              (r10v3 'strM17604J' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r4v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r13v1 'type' po.b)
              (r2v4 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r14v1 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.a1.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00d4: CONSTRUCTOR 
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.b1.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00db: CONSTRUCTOR 
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: ro.c1.<init>(vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v2 'listM31892k' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc)
              (r16v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00c1: IGET (r0v7 'c10965j1' ro.j1) A[WRAPPED] ro.j1.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00c5: IGET (r0v7 'c10965j1' ro.j1) A[WRAPPED] ro.j1.c hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.d1.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1M40735f' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'enumC8598a' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.e1.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00ea: CONSTRUCTOR 
              (r0v7 'c10965j1' ro.j1 A[DONT_INLINE])
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(ro.j1, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: ro.f1.<init>(ro.j1, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r3v1 'interfaceC11932a' ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (r45v0 'transition' wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             in method: ro.j1.m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, uo.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
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
            r5 = r42
            r6 = r43
            r7 = r44
            java.lang.String r0 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "renderState"
            r15 = r41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "workflowContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onOutput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "transition"
            r8 = r45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            ur.a r32 = r6.getWebRtcManager()
            if (r32 == 0) goto L49
            java.lang.String r9 = r1.getFromStep()
            ro.x0 r0 = new ro.x0
            r2 = r1
            r4 = r15
            r3 = r32
            r1 = r39
            r0.<init>()
            r38 = r2
            r2 = r0
            r0 = r1
            r1 = r38
            r3.m44540f(r9, r2)
            goto L4d
        L49:
            r0 = r39
            r3 = r32
        L4d:
            com.withpersona.sdk2.inquiry.governmentid.IdPart r2 = r41.getCurrentPart()
            boolean r4 = r2 instanceof com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart
            if (r4 == 0) goto L58
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r2 = (com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart) r2
            goto L59
        L58:
            r2 = 0
        L59:
            if (r2 == 0) goto L61
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r2 = r2.getSide()
            if (r2 != 0) goto L63
        L61:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r2 = com.withpersona.sdk2.inquiry.governmentid.IdConfig.EnumC3514b.Front
        L63:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r4 = r41.getId()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r4 = r4.m17273g(r2)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r9 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r10 = r41.getId()
            java.lang.String r10 = r10.getIdClassKey()
            java.lang.String r11 = r41.getCountryCode()
            java.lang.String r9 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r9, r2, r10, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r11 = r41.getId()
            java.lang.String r11 = r11.getIdClassKey()
            java.lang.String r12 = r41.getCountryCode()
            java.lang.String r10 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r10, r2, r11, r12)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r11 = r1.getStrings()
            java.lang.String r11 = r11.getCapturing()
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r12 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r13 = r41.getId()
            po.b r13 = r13.getType()
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r4 = r4.getOverlay()
            uq.a r14 = r0.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r14 = r14.m44528b()
            r8 = r2
            r2 = r9
            r9 = r14
            java.util.List r14 = kotlin.collections.C7699p.m31892k()
            int r16 = r41.getPartIndex()
            r15 = 0
            kotlin.jvm.functions.Function1 r21 = p389qo.C10643e.m40735f(r5, r15, r7)
            mn.a r22 = mn.EnumC8598a.Stream
            com.withpersona.sdk2.camera.e$a r15 = r0.cameraXControllerFactory
            r17 = r2
            hn.c$a r2 = r0.camera2ControllerFactory
            r32 = r3
            r3 = r10
            ro.a1 r10 = new ro.a1
            r10.<init>()
            r18 = r4
            r4 = r11
            ro.b1 r11 = new ro.b1
            r11.<init>()
            r19 = r12
            ro.c1 r12 = new ro.c1
            r12.<init>()
            ro.d1 r20 = new ro.d1
            r20.<init>()
            ro.e1 r27 = new ro.e1
            r27.<init>()
            ro.f1 r6 = new ro.f1
            r6.<init>()
            r36 = 1
            r37 = 0
            r7 = r13
            r13 = 0
            r5 = r19
            r19 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r35 = 1661206528(0x63040000, float:2.4349702E21)
            r34 = r45
            r28 = r6
            r6 = r18
            r18 = r2
            r2 = r17
            r17 = r15
            r15 = r41
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C10965j1.m41583m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, vr.f, uo.l, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final Screen m41584u(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final C12255f<GovernmentIdState> workflowContext, @NotNull final C11905l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> onOutput, @NotNull EnumC12529l transition) {
        C10965j1 c10965j1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            c10965j1 = this;
            webRtcManager.m44540f(renderProps.getFromStep(), new Function1() { // from class: ro.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10965j1.m41580x(this.f38770a, renderProps, webRtcManager, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            });
        } else {
            c10965j1 = this;
        }
        C11930a.m44527d(c10965j1.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        return customPendingPage != null ? new Screen.C3531f(C1147b.m6492a(customPendingPage), c10965j1.navigationStateManager.m44528b(), renderProps.getStyles(), new Function0() { // from class: ro.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10965j1.m41581y(onOutput);
            }
        }, new Function0() { // from class: ro.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10965j1.m41582z(onOutput);
            }
        }, renderProps.getStrings().getPendingPageNavBarTitle(), false, transition, 64, null) : new Screen.C3535j(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), c10965j1.navigationStateManager.m44528b(), new Function0() { // from class: ro.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10965j1.m41578v(onOutput);
            }
        }, new Function0() { // from class: ro.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10965j1.m41579w(onOutput);
            }
        }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), transition, 256, null);
    }
}
