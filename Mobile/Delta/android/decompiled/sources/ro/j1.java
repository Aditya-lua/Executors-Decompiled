package ro;

import android.content.Context;
import com.appsflyer.R;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lro/j1;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Luo/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "u", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    public j1(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull uq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit n(j1 j1Var, GovernmentIdWorkflow.Input input, ur.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, vr.f fVar, uo.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (aVar.isConnected()) {
            aVar.d();
            qo.e.s(finalizeWebRtc, fVar, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.D(), 0, it, null, 2560, null);
        }
        return Unit.f22483a;
    }

    public static final Unit o(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22483a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit q(vr.f fVar, GovernmentIdWorkflow.Input input, uo.l lVar, Function1 function1) {
        qo.e.p(fVar, input, lVar, function1);
        return Unit.f22483a;
    }

    public static final Unit r(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22483a;
    }

    public static final Unit s() {
        return Unit.f22483a;
    }

    public static final Unit t(j1 j1Var, vr.f fVar, GovernmentIdWorkflow.Input input) {
        qo.e.q(j1Var.applicationContext, fVar, input, true);
        return Unit.f22483a;
    }

    public static final Unit v(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit w(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit x(j1 j1Var, GovernmentIdWorkflow.Input input, ur.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, vr.f fVar, uo.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (aVar.isConnected()) {
            aVar.d();
            qo.e.s(finalizeWebRtc, fVar, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.D(), 0, it, null, 2560, null);
        }
        return Unit.f22483a;
    }

    public static final Unit y(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit z(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    @NotNull
    public final Screen m(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        final j1 j1Var;
        final ur.a aVar;
        IdConfig.b side;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: ro.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.n(this.f30073a, renderProps2, aVar, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            };
            j1Var = this;
            renderProps2 = renderProps2;
            aVar.f(fromStep, function1);
        } else {
            j1Var = this;
            aVar = webRtcManager;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.b.Front;
        }
        IdConfig.IdSideConfig idSideConfigG = renderState.getId().g(side);
        String strK = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strJ = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar2 = Screen.b.a.Disabled;
        po.b type = renderState.getId().getType();
        Screen.Overlay overlay = idSideConfigG.getOverlay();
        NavigationState navigationStateB = j1Var.navigationStateManager.b();
        List listK = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1F = qo.e.f(workflowContext, false, onOutput);
        mn.a aVar3 = mn.a.Stream;
        return com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, strK, strJ, capturing, aVar2, overlay, type, side, navigationStateB, (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011b: RETURN 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x0117: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'strK' java.lang.String)
              (r10v3 'strJ' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r12v1 'aVar2' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r4v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r13v1 'type' po.b)
              (r2v4 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r14v1 'navigationStateB' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.a1.<init>():void type: CONSTRUCTOR))
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
              (r14v2 'listK' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc)
              (r16v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00c1: IGET (r0v7 'j1Var' ro.j1) A[WRAPPED] ro.j1.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00c5: IGET (r0v7 'j1Var' ro.j1) A[WRAPPED] ro.j1.c hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.d1.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1F' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (r22v0 'aVar3' mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ro.e1.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00ea: CONSTRUCTOR 
              (r0v7 'j1Var' ro.j1 A[DONT_INLINE])
              (r42v0 'workflowContext' vr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(ro.j1, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: ro.f1.<init>(ro.j1, vr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r3v1 'aVar' ur.a))
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
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.j1.m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, vr.f, uo.l, kotlin.jvm.functions.Function1, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen u(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final vr.f<GovernmentIdState> workflowContext, @NotNull final uo.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull wq.l transition) {
        j1 j1Var;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            j1Var = this;
            webRtcManager.f(renderProps.getFromStep(), new Function1() { // from class: ro.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.x(this.f29965a, renderProps, webRtcManager, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            });
        } else {
            j1Var = this;
        }
        uq.a.d(j1Var.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        return customPendingPage != null ? new Screen.f(ar.b.a(customPendingPage), j1Var.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: ro.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.y(onOutput);
            }
        }, new Function0() { // from class: ro.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.z(onOutput);
            }
        }, renderProps.getStrings().getPendingPageNavBarTitle(), false, transition, 64, null) : new Screen.j(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), j1Var.navigationStateManager.b(), new Function0() { // from class: ro.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.v(onOutput);
            }
        }, new Function0() { // from class: ro.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.w(onOutput);
            }
        }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), transition, Barcode.FORMAT_QR_CODE, null);
    }
}
