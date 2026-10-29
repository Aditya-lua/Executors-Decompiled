package uo;

import android.content.Context;
import com.appsflyer.R;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import en.AlertContainerScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ym.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJM\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Luo/v;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Luo/l;", "videoCaptureHelper", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lym/k$a;Luo/l;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

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

    public v(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull uq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit k(final ym.k.a aVar, final v vVar, final GovernmentIdWorkflow.Input input, final ur.a aVar2, final GovernmentIdState.FinalizeWebRtc finalizeWebRtc, final l lVar, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(b0.c(null, new Function1() { // from class: uo.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.l(this.f32540a, input, aVar2, finalizeWebRtc, aVar, lVar, it, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit l(v vVar, GovernmentIdWorkflow.Input input, ur.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, ym.k.a aVar2, l lVar, String str, ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logVideoStopEvent$default(vVar.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (aVar.isConnected()) {
            aVar.d();
            com.withpersona.sdk2.inquiry.governmentid.n.W(finalizeWebRtc, aVar2, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), (3584 & 128) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? finalizeWebRtc.D() : finalizeWebRtc.D(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? finalizeWebRtc.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : str, (3584 & Barcode.FORMAT_PDF417) != 0 ? finalizeWebRtc.getCountryCode() : null);
        }
        return Unit.f22483a;
    }

    public static final Unit m(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22483a;
    }

    public static final Unit n(ym.k.a aVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: uo.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.o((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit o(ym.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10661a);
        return Unit.f22483a;
    }

    public static final Unit p(ym.k.a aVar, l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22483a;
    }

    public static final Unit q(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22483a;
    }

    public static final Unit r() {
        return Unit.f22483a;
    }

    public static final Unit s(v vVar, ym.k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(vVar.applicationContext, aVar, input, true);
        return Unit.f22483a;
    }

    @NotNull
    public final Object j(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final l videoCaptureHelper) {
        final ym.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar;
        final ur.a aVar2;
        final v vVar;
        IdConfig.b side;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        ur.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar2 = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: uo.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v.k(context, this, renderProps2, aVar2, renderState, videoCaptureHelper, (String) obj);
                }
            };
            vVar = this;
            aVar = context;
            renderProps2 = renderProps2;
            aVar2.f(fromStep, function1);
        } else {
            aVar = context;
            aVar2 = webRtcManager;
            vVar = this;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.b.Front;
        }
        IdConfig.b bVar = side;
        IdConfig.IdSideConfig idSideConfigG = renderState.getId().g(bVar);
        String strK = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), bVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strJ = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), bVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar3 = Screen.b.a.Disabled;
        po.b type = renderState.getId().getType();
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, strK, strJ, capturing, aVar3, idSideConfigG.getOverlay(), type, bVar, vVar.navigationStateManager.b(), (1203765760 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013a: RETURN 
              (wrap en.d:0x0137: CONSTRUCTOR 
              (wrap op.c<java.lang.Object, java.lang.Object>:0x0131: INVOKE 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x012d: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'strK' java.lang.String)
              (r10v3 'strJ' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r5v2 'aVar3' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay:0x00a2: INVOKE (r3v6 'idSideConfigG' com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.IdConfig.IdSideConfig.g():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay A[MD:():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay (m), WRAPPED])
              (r13v1 'type' po.b)
              (r8v0 'bVar' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (wrap com.withpersona.sdk2.inquiry.shared.navigation.NavigationState:0x00a8: INVOKE (wrap uq.a:0x00a6: IGET (r0v2 'vVar' uo.v) A[WRAPPED] uo.v.d uq.a) VIRTUAL call: uq.a.b():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState A[MD:():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState (m), WRAPPED])
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00ca: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.n.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00d2: CONSTRUCTOR 
              (r2v5 'aVar' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(ym.k$a):void (m), WRAPPED] call: uo.o.<init>(ym.k$a):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00d9: CONSTRUCTOR 
              (r2v5 'aVar' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(ym.k$a, uo.l):void (m), WRAPPED] call: uo.p.<init>(ym.k$a, uo.l):void type: CONSTRUCTOR)
              false
              (wrap java.util.List:0x00ae: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED])
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc)
              (wrap int:0x00b2: INVOKE (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.FinalizeWebRtc.C():int A[MD:():int (m), WRAPPED])
              (wrap com.withpersona.sdk2.camera.e$a:0x00bd: IGET (r0v2 'vVar' uo.v) A[WRAPPED] uo.v.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00c1: IGET (r0v2 'vVar' uo.v) A[WRAPPED] uo.v.c hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.q.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>:0x00b7: INVOKE 
              (r2v5 'aVar' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a)
              false
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.n.z(ym.k$a, boolean):kotlin.jvm.functions.Function1 A[MD:(ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, boolean):kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> (m), WRAPPED])
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (wrap mn.a:0x00bb: SGET  A[WRAPPED] mn.a.a mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.r.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00ec: CONSTRUCTOR 
              (r0v2 'vVar' uo.v A[DONT_INLINE])
              (r2v5 'aVar' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(uo.v, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: uo.s.<init>(uo.v, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r4v1 'aVar2' ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (null wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             STATIC call: com.withpersona.sdk2.inquiry.permissions.g.c(java.lang.Object):op.c A[MD:(java.lang.Object):op.c<java.lang.Object, java.lang.Object> (m), WRAPPED])
              (null java.util.List)
              (2 int)
              (null kotlin.jvm.internal.DefaultConstructorMarker)
             A[MD:(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] call: en.d.<init>(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
             in method: uo.v.j(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, uo.l):java.lang.Object, file: classes3.dex
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.v.j(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, ym.k$a, uo.l):java.lang.Object");
    }
}
