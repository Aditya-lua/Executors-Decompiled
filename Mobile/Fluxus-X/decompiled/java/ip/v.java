package ip;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fq.y1;
import java.util.List;
import ln.b0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import rn.AlertContainerScreen;
import sn.a0;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i0;
import vo.i3;
import vo.j0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJM\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lip/v;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$f;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/j0;", "Lvo/d2$b;", "context", "Lip/l;", "videoCaptureHelper", "j", "(Lvo/d2$a;Lvo/j0$f;Lln/k$a;Lip/l;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lsn/a0$a;", "c", "Lun/c$a;", "d", "Lir/b;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    public v(@NotNull Context applicationContext, @NotNull a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit k(final ln.k.a aVar, final v vVar, final d2.a aVar2, final ks.a aVar3, final j0.f fVar, final l lVar, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(b0.c(null, new Function1() { // from class: ip.t
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.l(this.f19673a, aVar2, aVar3, fVar, aVar, lVar, it, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit l(v vVar, d2.a aVar, ks.a aVar2, j0.f fVar, ln.k.a aVar3, l lVar, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logVideoStopEvent$default(vVar.trackingEventsLogger, aVar.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar2.isConnected()) {
            aVar2.e();
            b3.W(fVar, aVar3, aVar, null, fVar.getId(), lVar, fVar.getCameraProperties(), (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? fVar.C() : fVar.C(), (3584 & Barcode.FORMAT_UPC_A) != 0 ? fVar.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : str, (3584 & Barcode.FORMAT_PDF417) != 0 ? fVar.getCountryCode() : null);
        }
        return Unit.f21506a;
    }

    public static final Unit m(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit n(ln.k.a aVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: ip.u
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.o((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit o(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit p(ln.k.a aVar, l lVar) {
        b3.S(aVar, lVar);
        return Unit.f21506a;
    }

    public static final Unit q(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit r() {
        return Unit.f21506a;
    }

    public static final Unit s(v vVar, ln.k.a aVar, d2.a aVar2) {
        b3.U(vVar.applicationContext, aVar, aVar2, true);
        return Unit.f21506a;
    }

    @NotNull
    public final Object j(@NotNull d2.a renderProps, @NotNull final j0.f renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final l videoCaptureHelper) {
        final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a aVar;
        final ks.a aVar2;
        final v vVar;
        IdConfig.e side;
        final d2.a renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar2 = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: ip.m
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v.k(context, this, renderProps2, aVar2, renderState, videoCaptureHelper, (String) obj);
                }
            };
            vVar = this;
            aVar = context;
            renderProps2 = renderProps2;
            aVar2.g(fromStep, function1);
        } else {
            aVar = context;
            aVar2 = webRtcManager;
            vVar = this;
        }
        i3 currentPart = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.e.Front;
        }
        IdConfig.e eVar = side;
        IdConfig.IdSideConfig idSideConfigG = renderState.getId().g(eVar);
        String strK = b3.K(renderProps2.getStrings(), eVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strJ = b3.J(renderProps2.getStrings(), eVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        y3.b.a aVar3 = y3.b.a.Disabled;
        dp.e type = renderState.getId().getType();
        return new AlertContainerScreen(y1.c(i0.f(renderProps2, strK, strJ, capturing, aVar3, idSideConfigG.getOverlay(), type, eVar, vVar.navigationStateManager.b(), (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013a: RETURN 
              (wrap rn.d:0x0137: CONSTRUCTOR 
              (wrap cq.c<java.lang.Object, java.lang.Object>:0x0131: INVOKE 
              (wrap vo.y3$b:0x012d: INVOKE 
              (r1v1 'renderProps2' vo.d2$a)
              (r9v1 'strK' java.lang.String)
              (r10v3 'strJ' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r5v2 'aVar3' vo.y3$b$a)
              (wrap vo.y3$f:0x00a2: INVOKE (r3v6 'idSideConfigG' vo.d3$c) VIRTUAL call: vo.d3.c.g():vo.y3$f A[MD:():vo.y3$f (m), WRAPPED])
              (r13v1 'type' dp.e)
              (r8v0 'eVar' vo.d3$e)
              (wrap ir.a:0x00a8: INVOKE (wrap ir.b:0x00a6: IGET (r0v2 'vVar' ip.v) A[WRAPPED] ip.v.d ir.b) VIRTUAL call: ir.b.b():ir.a A[MD:():ir.a (m), WRAPPED])
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00ca: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.n.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00d2: CONSTRUCTOR (r2v5 'aVar' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE]) A[MD:(ln.k$a):void (m), WRAPPED] call: ip.o.<init>(ln.k$a):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00d9: CONSTRUCTOR 
              (r2v5 'aVar' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(ln.k$a, ip.l):void (m), WRAPPED] call: ip.p.<init>(ln.k$a, ip.l):void type: CONSTRUCTOR)
              false
              (wrap java.util.List:0x00ae: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED])
              (r42v0 'renderState' vo.j0$f)
              (wrap int:0x00b2: INVOKE (r42v0 'renderState' vo.j0$f) VIRTUAL call: vo.j0.f.B():int A[MD:():int (m), WRAPPED])
              (wrap sn.a0$a:0x00bd: IGET (r0v2 'vVar' ip.v) A[WRAPPED] ip.v.b sn.a0$a)
              (wrap un.c$a:0x00c1: IGET (r0v2 'vVar' ip.v) A[WRAPPED] ip.v.c un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.q.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>:0x00b7: INVOKE (r2v5 'aVar' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a), false STATIC call: vo.b3.z(ln.k$a, boolean):kotlin.jvm.functions.Function1 A[MD:(ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a, boolean):kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> (m), WRAPPED])
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (wrap zn.a:0x00bb: SGET  A[WRAPPED] zn.a.a zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.r.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00ec: CONSTRUCTOR 
              (r0v2 'vVar' ip.v A[DONT_INLINE])
              (r2v5 'aVar' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r1v1 'renderProps2' vo.d2$a A[DONT_INLINE])
             A[MD:(ip.v, ln.k$a, vo.d2$a):void (m), WRAPPED] call: ip.s.<init>(ip.v, ln.k$a, vo.d2$a):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (r4v1 'aVar2' ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (null kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             STATIC call: fq.y1.c(java.lang.Object):cq.c A[MD:(java.lang.Object):cq.c<java.lang.Object, java.lang.Object> (m), WRAPPED])
              (null java.util.List)
              (2 int)
              (null kotlin.jvm.internal.DefaultConstructorMarker)
             A[MD:(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] call: rn.d.<init>(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
             in method: ip.v.j(vo.d2$a, vo.j0$f, ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a, ip.l):java.lang.Object, file: classes3.dex
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
        throw new UnsupportedOperationException("Method not decompiled: ip.v.j(vo.d2$a, vo.j0$f, ln.k$a, ip.l):java.lang.Object");
    }
}
