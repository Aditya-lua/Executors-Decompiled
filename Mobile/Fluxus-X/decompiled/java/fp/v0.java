package fp;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import vo.Frame;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lfp/v0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$e;", "renderState", "Lls/g;", "Lvo/j0;", "workflowContext", "Lip/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lvo/d2$b;", BuildConfig.FLAVOR, "onOutput", "Lkr/l;", "transition", "Lvo/y3;", "i", "(Lvo/d2$a;Lvo/j0$e;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;", "Ljava/io/File;", "file", "Lsn/v;", "cameraProperties", "h", "(Ljava/io/File;Lvo/j0$e;Lvo/d2$a;Lip/l;Lsn/v;Lls/g;)V", "a", "Landroid/content/Context;", "b", "Lsn/a0$a;", "c", "Lun/c$a;", "d", "Lir/b;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 {

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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "GovIdLocalVideoCaptureRenderer.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16350t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ vo.j0.FinalizeLocalVideoCapture f16351u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ls.g<vo.j0> f16352v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vo.j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ls.g<vo.j0> gVar, eu.b<? super a> bVar) {
            super(1, bVar);
            this.f16351u = finalizeLocalVideoCapture;
            this.f16352v = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new a(this.f16351u, this.f16352v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f16350t;
            if (i10 == 0) {
                zt.o.b(obj);
                long minDurationMs = this.f16351u.getMinDurationMs();
                this.f16350t = 1;
                if (av.z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = this.f16352v.i();
            vo.j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = hVarI instanceof vo.j0.FinalizeLocalVideoCapture ? (vo.j0.FinalizeLocalVideoCapture) hVarI : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f21506a;
            }
            this.f16352v.p(vo.j0.FinalizeLocalVideoCapture.H(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, 511, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public v0(@NotNull Context applicationContext, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit j(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit k(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit l(ls.g gVar, d2.a aVar, Function1 function1) {
        ep.e.p(gVar, aVar, null, function1);
        return Unit.f21506a;
    }

    public static final Unit m(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit n(v0 v0Var, vo.j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, d2.a aVar, ip.l lVar, ls.g gVar, File file, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        v0Var.h(file, finalizeLocalVideoCapture, aVar, lVar, cameraProperties, gVar);
        return Unit.f21506a;
    }

    public static final Unit o() {
        return Unit.f21506a;
    }

    public static final Unit p(v0 v0Var, ls.g gVar, d2.a aVar) {
        ep.e.q(v0Var.applicationContext, gVar, aVar, true);
        return Unit.f21506a;
    }

    public final void h(File file, vo.j0.FinalizeLocalVideoCapture renderState, d2.a renderProps, ip.l videoCaptureHelper, sn.v cameraProperties, ls.g<vo.j0> workflowContext) {
        List<vo.n> listD = renderState.D();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(((vo.n) it.next()).getSide());
        }
        vo.n.d dVar = vo.n.d.FRONT;
        boolean zContains = arrayList.contains(dVar);
        vo.n.d dVar2 = vo.n.d.BACK;
        boolean zContains2 = arrayList.contains(dVar2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listD2 = p001kotlin.collections.o.d(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            dVar = vo.n.d.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            dVar = dVar2;
        }
        ep.e.s(renderState, workflowContext, renderProps, new vo.n.GovernmentIdVideo(listD2, dVar, renderState.getId().getIdClassKey(), vo.n.a.b), renderState.getId(), videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    @NotNull
    public final y3 i(@NotNull final d2.a renderProps, @NotNull final vo.j0.FinalizeLocalVideoCapture renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        IdConfig.e side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        workflowContext.m("finalize_delay", new a(renderState, workflowContext, null));
        i3 currentPart = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.e.Front;
        }
        IdConfig.e eVar = side;
        IdConfig.IdSideConfig idSideConfigG = renderState.getId().g(eVar);
        String strK = b3.K(renderProps.getStrings(), eVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String strJ = b3.J(renderProps.getStrings(), eVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        y3.b.a aVar = y3.b.a.Disabled;
        dp.e type = renderState.getId().getType();
        y3.f overlay = idSideConfigG.getOverlay();
        ir.a aVarB = this.navigationStateManager.b();
        List listK = p001kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> function1F = ep.e.f(workflowContext, false, onOutput);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return vo.i0.f(renderProps, strK, strJ, capturing, aVar, overlay, type, eVar, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0119: RETURN 
              (wrap vo.y3$b:0x0115: INVOKE 
              (r39v0 'renderProps' vo.d2$a)
              (r7v3 'strK' java.lang.String)
              (r9v3 'strJ' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r11v1 'aVar' vo.y3$b$a)
              (r13v0 'overlay' vo.y3$f)
              (r12v1 'type' dp.e)
              (r8v2 'eVar' vo.d3$e)
              (r14v0 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00bc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.o0.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00c3: CONSTRUCTOR (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.p0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00cb: CONSTRUCTOR 
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE])
             A[MD:(ls.g, vo.d2$a, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.q0.<init>(ls.g, vo.d2$a, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v1 'listK' java.util.List)
              (r40v0 'renderState' vo.j0$e)
              (r16v1 'partIndex' int)
              (wrap sn.a0$a:0x00b4: IGET (r38v0 'this' fp.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.v0.b sn.a0$a)
              (wrap un.c$a:0x00b6: IGET (r38v0 'this' fp.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.v0.c un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00d2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.r0.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1F' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (wrap zn.a:0x00b2: SGET  A[WRAPPED] zn.a.b zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00dc: CONSTRUCTOR 
              (r38v0 'this' fp.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r40v0 'renderState' vo.j0$e A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
             A[MD:(fp.v0, vo.j0$e, vo.d2$a, ip.l, ls.g):void (m), WRAPPED] call: fp.s0.<init>(fp.v0, vo.j0$e, vo.d2$a, ip.l, ls.g):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00e2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: fp.t0.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00e7: CONSTRUCTOR 
              (r38v0 'this' fp.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
             A[MD:(fp.v0, ls.g, vo.d2$a):void (m), WRAPPED] call: fp.u0.<init>(fp.v0, ls.g, vo.d2$a):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r39v0 'renderProps' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (null ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (r44v0 'transition' kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             in method: fp.v0.i(vo.d2$a, vo.j0$e, ls.g<vo.j0>, ip.l, kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit>, kr.l):vo.y3, file: classes3.dex
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
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.v0.i(vo.d2$a, vo.j0$e, ls.g, ip.l, kotlin.jvm.functions.Function1, kr.l):vo.y3");
    }
}
