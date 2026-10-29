package p473uo;

import android.content.Context;
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
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p109en.AlertContainerScreen;
import p361po.EnumC10302b;
import p475uq.C11930a;
import p476ur.InterfaceC11932a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;

/* JADX INFO: renamed from: uo.v */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJM\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m31665d2 = {"Luo/v;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Luo/l;", "videoCaptureHelper", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lym/k$a;Luo/l;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11915v {

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

    public C11915v(@NotNull Context applicationContext, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    /* JADX INFO: renamed from: k */
    public static final Unit m44509k(final AbstractC13218k.a aVar, final C11915v c11915v, final GovernmentIdWorkflow.Input input, final InterfaceC11932a interfaceC11932a, final GovernmentIdState.FinalizeWebRtc finalizeWebRtc, final C11905l c11905l, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: uo.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11915v.m44510l(this.f42282a, input, interfaceC11932a, finalizeWebRtc, aVar, c11905l, it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m44510l(C11915v c11915v, GovernmentIdWorkflow.Input input, InterfaceC11932a interfaceC11932a, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, AbstractC13218k.a aVar, C11905l c11905l, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logVideoStopEvent$default(c11915v.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        if (interfaceC11932a.isConnected()) {
            interfaceC11932a.m44538d();
            C3555n.m17617W(finalizeWebRtc, aVar, input, null, finalizeWebRtc.getId(), c11905l, finalizeWebRtc.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? finalizeWebRtc.mo16955D() : finalizeWebRtc.mo16955D(), (3584 & 512) != 0 ? finalizeWebRtc.getPartIndex() : 0, (3584 & 1024) != 0 ? null : str, (3584 & 2048) != 0 ? finalizeWebRtc.getCountryCode() : null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m44511m(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m44512n(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: uo.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11915v.m44513o((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m44513o(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m44514p(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m44515q(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m44516r() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m44517s(C11915v c11915v, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input) {
        C3555n.m17615U(c11915v.applicationContext, aVar, input, true);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Object m44518j(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper) {
        final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar;
        final InterfaceC11932a interfaceC11932a;
        final C11915v c11915v;
        IdConfig.EnumC3514b side;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            interfaceC11932a = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: uo.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11915v.m44509k(context, this, renderProps2, interfaceC11932a, renderState, videoCaptureHelper, (String) obj);
                }
            };
            c11915v = this;
            aVar = context;
            renderProps2 = renderProps2;
            interfaceC11932a.m44540f(fromStep, function1);
        } else {
            aVar = context;
            interfaceC11932a = webRtcManager;
            c11915v = this;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.EnumC3514b.Front;
        }
        IdConfig.EnumC3514b enumC3514b = side;
        IdConfig.IdSideConfig idSideConfigM17273g = renderState.getId().m17273g(enumC3514b);
        String strM17605K = C3555n.m17605K(renderProps2.getStrings(), enumC3514b, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps2.getStrings(), enumC3514b, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.C3527b.a aVar2 = Screen.C3527b.a.Disabled;
        EnumC10302b type = renderState.getId().getType();
        return new AlertContainerScreen(C3858g.m19165c(C3551l.m17572f(renderProps2, strM17605K, strM17604J, capturing, aVar2, idSideConfigM17273g.getOverlay(), type, enumC3514b, c11915v.navigationStateManager.m44528b(), (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013a: RETURN 
              (wrap en.d:0x0137: CONSTRUCTOR 
              (wrap op.c<java.lang.Object, java.lang.Object>:0x0131: INVOKE 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x012d: INVOKE 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'strM17605K' java.lang.String)
              (r10v3 'strM17604J' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r5v2 'aVar2' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay:0x00a2: INVOKE (r3v6 'idSideConfigM17273g' com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.IdConfig.IdSideConfig.g():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay A[MD:():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay (m), WRAPPED])
              (r13v1 'type' po.b)
              (r8v0 'enumC3514b' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (wrap com.withpersona.sdk2.inquiry.shared.navigation.NavigationState:0x00a8: INVOKE (wrap uq.a:0x00a6: IGET (r0v2 'c11915v' uo.v) A[WRAPPED] uo.v.d uq.a) VIRTUAL call: uq.a.b():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState A[MD:():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState (m), WRAPPED])
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00ca: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.n.<init>():void type: CONSTRUCTOR))
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
              (wrap com.withpersona.sdk2.camera.e$a:0x00bd: IGET (r0v2 'c11915v' uo.v) A[WRAPPED] uo.v.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00c1: IGET (r0v2 'c11915v' uo.v) A[WRAPPED] uo.v.c hn.c$a)
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
              (r0v2 'c11915v' uo.v A[DONT_INLINE])
              (r2v5 'aVar' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(uo.v, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: uo.s.<init>(uo.v, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (r4v1 'interfaceC11932a' ur.a))
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
            this = this;
            r1 = r41
            r0 = r43
            r6 = r44
            java.lang.String r2 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "renderState"
            r15 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            ur.a r32 = r6.getWebRtcManager()
            if (r32 == 0) goto L3e
            java.lang.String r7 = r1.getFromStep()
            uo.m r0 = new uo.m
            r2 = r40
            r3 = r1
            r5 = r15
            r4 = r32
            r1 = r43
            r0.<init>()
            r39 = r3
            r3 = r0
            r0 = r2
            r2 = r1
            r1 = r39
            r4.m44540f(r7, r3)
            goto L43
        L3e:
            r2 = r0
            r4 = r32
            r0 = r40
        L43:
            com.withpersona.sdk2.inquiry.governmentid.IdPart r3 = r42.getCurrentPart()
            boolean r5 = r3 instanceof com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart
            if (r5 == 0) goto L4e
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r3 = (com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart) r3
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 == 0) goto L5a
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r3 = r3.getSide()
            if (r3 != 0) goto L58
            goto L5a
        L58:
            r8 = r3
            goto L5d
        L5a:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r3 = com.withpersona.sdk2.inquiry.governmentid.IdConfig.EnumC3514b.Front
            goto L58
        L5d:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r3 = r42.getId()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r3 = r3.m17273g(r8)
            en.d r5 = new en.d
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r9 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r10 = r42.getId()
            java.lang.String r10 = r10.getIdClassKey()
            java.lang.String r11 = r42.getCountryCode()
            java.lang.String r9 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r9, r8, r10, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r11 = r42.getId()
            java.lang.String r11 = r11.getIdClassKey()
            java.lang.String r12 = r42.getCountryCode()
            java.lang.String r10 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r10, r8, r11, r12)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r11 = r1.getStrings()
            java.lang.String r11 = r11.getCapturing()
            r12 = r5
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r5 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r13 = r42.getId()
            po.b r13 = r13.getType()
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r3 = r3.getOverlay()
            uq.a r14 = r0.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r14 = r14.m44528b()
            r15 = r9
            r9 = r14
            java.util.List r14 = kotlin.collections.C7699p.m31892k()
            int r16 = r42.getPartIndex()
            r7 = 0
            kotlin.jvm.functions.Function1 r21 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17659z(r2, r7)
            mn.a r22 = mn.EnumC8598a.Stream
            com.withpersona.sdk2.camera.e$a r7 = r0.cameraXControllerFactory
            r18 = r3
            hn.c$a r3 = r0.camera2ControllerFactory
            r19 = r18
            r18 = r3
            r3 = r10
            uo.n r10 = new uo.n
            r10.<init>()
            r32 = r4
            r4 = r11
            uo.o r11 = new uo.o
            r11.<init>()
            r20 = r12
            uo.p r12 = new uo.p
            r12.<init>()
            r6 = r20
            uo.q r20 = new uo.q
            r20.<init>()
            uo.r r27 = new uo.r
            r27.<init>()
            r23 = r3
            uo.s r3 = new uo.s
            r3.<init>()
            r36 = 3
            r37 = 0
            r17 = r7
            r7 = r13
            r2 = 0
            r13 = 0
            r24 = r6
            r6 = r19
            r19 = 0
            r28 = r3
            r3 = r23
            r23 = 0
            r25 = r24
            r24 = 1
            r26 = r25
            r25 = 0
            r29 = r26
            r26 = 0
            r30 = r29
            r29 = 0
            r31 = r30
            r30 = 0
            r33 = r31
            r31 = 0
            r34 = r33
            r33 = 0
            r35 = r34
            r34 = 0
            r38 = r35
            r35 = 1661206528(0x63040000, float:2.4349702E21)
            r2 = r15
            r0 = r38
            r15 = r42
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            op.c r1 = com.withpersona.sdk2.inquiry.permissions.C3858g.m19165c(r1)
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p473uo.C11915v.m44518j(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, ym.k$a, uo.l):java.lang.Object");
    }
}
