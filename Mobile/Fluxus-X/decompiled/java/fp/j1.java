package fp;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lfp/j1;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$f;", "renderState", "Lls/g;", "Lvo/j0;", "workflowContext", "Lip/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lvo/d2$b;", BuildConfig.FLAVOR, "onOutput", "Lkr/l;", "transition", "Lvo/y3;", "m", "(Lvo/d2$a;Lvo/j0$f;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;", "u", "a", "Landroid/content/Context;", "b", "Lsn/a0$a;", "c", "Lun/c$a;", "d", "Lir/b;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sn.a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    public j1(@NotNull Context applicationContext, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit n(j1 j1Var, d2.a aVar, ks.a aVar2, vo.j0.f fVar, ls.g gVar, ip.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, aVar.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar2.isConnected()) {
            aVar2.e();
            ep.e.s(fVar, gVar, aVar, null, fVar.getId(), lVar, fVar.getCameraProperties(), false, fVar.C(), 0, it, null, 2560, null);
        }
        return Unit.f21506a;
    }

    public static final Unit o(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit q(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit r(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit s() {
        return Unit.f21506a;
    }

    public static final Unit t(j1 j1Var, ls.g gVar, d2.a aVar) {
        ep.e.q(j1Var.applicationContext, gVar, aVar, true);
        return Unit.f21506a;
    }

    public static final Unit v(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit w(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit x(j1 j1Var, d2.a aVar, ks.a aVar2, vo.j0.f fVar, ls.g gVar, ip.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, aVar.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar2.isConnected()) {
            aVar2.e();
            ep.e.s(fVar, gVar, aVar, null, fVar.getId(), lVar, fVar.getCameraProperties(), false, fVar.C(), 0, it, null, 2560, null);
        }
        return Unit.f21506a;
    }

    public static final Unit y(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit z(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    @NotNull
    public final y3 m(@NotNull d2.a renderProps, @NotNull final vo.j0.f renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        final j1 j1Var;
        final ks.a aVar;
        IdConfig.e side;
        final d2.a renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: fp.x0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.n(this.f16361a, renderProps2, aVar, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            };
            j1Var = this;
            renderProps2 = renderProps2;
            aVar.g(fromStep, function1);
        } else {
            j1Var = this;
            aVar = webRtcManager;
        }
        i3 currentPart = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.e.Front;
        }
        IdConfig.IdSideConfig idSideConfigG = renderState.getId().g(side);
        String strK = b3.K(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strJ = b3.J(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        y3.b.a aVar2 = y3.b.a.Disabled;
        dp.e type = renderState.getId().getType();
        y3.f overlay = idSideConfigG.getOverlay();
        ir.a aVarB = j1Var.navigationStateManager.b();
        List listK = p001kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1F = ep.e.f(workflowContext, false, onOutput);
        zn.a aVar3 = zn.a.Stream;
        return vo.i0.f(renderProps2, strK, strJ, capturing, aVar2, overlay, type, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011b: RETURN 
              (wrap vo.y3$b:0x0117: INVOKE 
              (r1v1 'renderProps2' vo.d2$a)
              (r9v1 'strK' java.lang.String)
              (r10v3 'strJ' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r12v1 'aVar2' vo.y3$b$a)
              (r4v3 'overlay' vo.y3$f)
              (r13v1 'type' dp.e)
              (r2v4 'side' vo.d3$e)
              (r14v1 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.a1.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00d4: CONSTRUCTOR (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.b1.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00db: CONSTRUCTOR 
              (r42v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r1v1 'renderProps2' vo.d2$a A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE])
             A[MD:(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.c1.<init>(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v2 'listK' java.util.List)
              (r41v0 'renderState' vo.j0$f)
              (r16v0 'partIndex' int)
              (wrap sn.a0$a:0x00c1: IGET (r0v7 'j1Var' fp.j1) A[WRAPPED] fp.j1.b sn.a0$a)
              (wrap un.c$a:0x00c5: IGET (r0v7 'j1Var' fp.j1) A[WRAPPED] fp.j1.c un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.d1.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1F' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (r22v0 'aVar3' zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.e1.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00ea: CONSTRUCTOR 
              (r0v7 'j1Var' fp.j1 A[DONT_INLINE])
              (r42v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r1v1 'renderProps2' vo.d2$a A[DONT_INLINE])
             A[MD:(fp.j1, ls.g, vo.d2$a):void (m), WRAPPED] call: fp.f1.<init>(fp.j1, ls.g, vo.d2$a):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (r3v1 'aVar' ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (r45v0 'transition' kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             in method: fp.j1.m(vo.d2$a, vo.j0$f, ls.g<vo.j0>, ip.l, kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit>, kr.l):vo.y3, file: classes3.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: vo.d0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:315)
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
        throw new UnsupportedOperationException("Method not decompiled: fp.j1.m(vo.d2$a, vo.j0$f, ls.g, ip.l, kotlin.jvm.functions.Function1, kr.l):vo.y3");
    }

    @NotNull
    public final y3 u(@NotNull final d2.a renderProps, @NotNull final vo.j0.f renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        j1 j1Var;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            j1Var = this;
            webRtcManager.g(renderProps.getFromStep(), new Function1() { // from class: fp.g1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.x(this.f16253a, renderProps, webRtcManager, renderState, workflowContext, videoCaptureHelper, (String) obj);
                }
            });
        } else {
            j1Var = this;
        }
        ir.b.d(j1Var.navigationStateManager, false, false, false, false, 12, null);
        or.b customPendingPage = renderProps.getCustomPendingPage();
        return customPendingPage != null ? new y3.g(or.d.a(customPendingPage), j1Var.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: fp.h1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.y(onOutput);
            }
        }, new Function0() { // from class: fp.i1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.z(onOutput);
            }
        }, renderProps.getStrings().getPendingPageNavBarTitle(), false, transition, 64, null) : new y3.k(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), j1Var.navigationStateManager.b(), new Function0() { // from class: fp.y0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.v(onOutput);
            }
        }, new Function0() { // from class: fp.z0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.w(onOutput);
            }
        }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), transition, Barcode.FORMAT_QR_CODE, null);
    }
}
