package ip;

import android.content.Context;
import av.p0;
import av.z0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import fq.y1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln.b0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import rn.AlertContainerScreen;
import sn.a0;
import vo.Frame;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i0;
import vo.i3;
import vo.j0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lip/j;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)V", "Lvo/d2$a;", "renderProps", "Lvo/j0$e;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lln/k;", "Lvo/j0;", "Lvo/d2$b;", "context", "Lip/l;", "videoCaptureHelper", "i", "(Lvo/d2$a;Lvo/j0$e;Lln/k$a;Lip/l;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lsn/a0$a;", "c", "Lun/c$a;", "d", "Lir/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19657t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j0.FinalizeLocalVideoCapture f19658u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<d2.a, j0, d2.b, Object>.a f19659v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a aVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f19658u = finalizeLocalVideoCapture;
            this.f19659v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ln.r.c cVar) {
            Object objC = cVar.c();
            j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof j0.FinalizeLocalVideoCapture ? (j0.FinalizeLocalVideoCapture) objC : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f21506a;
            }
            cVar.e(j0.FinalizeLocalVideoCapture.H(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, 511, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f19658u, this.f19659v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f19657t;
            if (i10 == 0) {
                zt.o.b(obj);
                long minDurationMs = this.f19658u.getMinDurationMs();
                this.f19657t = 1;
                if (z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f19659v.d().a(b0.c(null, new Function1() { // from class: ip.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.a.p((ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    public j(@NotNull Context applicationContext, @NotNull a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit j(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit k(ln.k.a aVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: ip.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.l((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit l(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit m(ln.k.a aVar) {
        b3.S(aVar, null);
        return Unit.f21506a;
    }

    public static final Unit n(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit o(j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ln.k.a aVar, d2.a aVar2, l lVar, File file, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<vo.n> listD = finalizeLocalVideoCapture.D();
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
        b3.W(finalizeLocalVideoCapture, aVar, aVar2, new vo.n.GovernmentIdVideo(listD2, dVar, finalizeLocalVideoCapture.getId().getIdClassKey(), vo.n.a.b), finalizeLocalVideoCapture.getId(), lVar, cameraProperties, (3584 & Barcode.FORMAT_ITF) != 0, (3584 & Barcode.FORMAT_QR_CODE) != 0 ? finalizeLocalVideoCapture.C() : null, (3584 & Barcode.FORMAT_UPC_A) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (3584 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3584 & Barcode.FORMAT_PDF417) != 0 ? finalizeLocalVideoCapture.getCountryCode() : null);
        return Unit.f21506a;
    }

    public static final Unit p() {
        return Unit.f21506a;
    }

    public static final Unit q(j jVar, ln.k.a aVar, d2.a aVar2) {
        b3.U(jVar.applicationContext, aVar, aVar2, true);
        return Unit.f21506a;
    }

    @NotNull
    public final Object i(@NotNull final d2.a renderProps, @NotNull final j0.FinalizeLocalVideoCapture renderState, @NotNull final ln.k<? super d2.a, j0, ? extends d2.b, ? extends Object>.a context, @NotNull final l videoCaptureHelper) {
        IdConfig.e side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        context.b("finalize_delay", new a(renderState, context, null));
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
        Function1<Throwable, Unit> function1Z = b3.z(context, false);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return new AlertContainerScreen(y1.c(i0.f(renderProps, strK, strJ, capturing, aVar, overlay, type, eVar, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0127: RETURN 
              (wrap rn.d:0x0124: CONSTRUCTOR 
              (wrap cq.c<java.lang.Object, java.lang.Object>:0x011e: INVOKE 
              (wrap vo.y3$b:0x011a: INVOKE 
              (r41v0 'renderProps' vo.d2$a)
              (r7v1 'strK' java.lang.String)
              (r9v3 'strJ' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r5v1 'aVar' vo.y3$b$a)
              (r4v12 'overlay' vo.y3$f)
              (r12v1 'type' dp.e)
              (r8v0 'eVar' vo.d3$e)
              (r13v1 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00b4: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.a.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00bd: CONSTRUCTOR (r43v0 'context' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE]) A[MD:(ln.k$a):void (m), WRAPPED] call: ip.b.<init>(ln.k$a):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00c5: CONSTRUCTOR (r43v0 'context' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE]) A[MD:(ln.k$a):void (m), WRAPPED] call: ip.c.<init>(ln.k$a):void type: CONSTRUCTOR)
              false
              (r14v0 'listK' java.util.List)
              (r42v0 'renderState' vo.j0$e)
              (r16v0 'partIndex' int)
              (wrap sn.a0$a:0x00a5: IGET (r40v0 'this' ip.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ip.j.b sn.a0$a)
              (wrap un.c$a:0x00a9: IGET (r40v0 'this' ip.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] ip.j.c un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.d.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1Z' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (wrap zn.a:0x00a3: SGET  A[WRAPPED] zn.a.b zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00d3: CONSTRUCTOR 
              (r42v0 'renderState' vo.j0$e A[DONT_INLINE])
              (r43v0 'context' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(vo.j0$e, ln.k$a, vo.d2$a, ip.l):void (m), WRAPPED] call: ip.e.<init>(vo.j0$e, ln.k$a, vo.d2$a, ip.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00d8: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: ip.f.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00dd: CONSTRUCTOR 
              (r40v0 'this' ip.j A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r43v0 'context' ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' vo.d2$a A[DONT_INLINE])
             A[MD:(ip.j, ln.k$a, vo.d2$a):void (m), WRAPPED] call: ip.g.<init>(ip.j, ln.k$a, vo.d2$a):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r41v0 'renderProps' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (null ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (null kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             STATIC call: fq.y1.c(java.lang.Object):cq.c A[MD:(java.lang.Object):cq.c<java.lang.Object, java.lang.Object> (m), WRAPPED])
              (null java.util.List)
              (2 int)
              (null kotlin.jvm.internal.DefaultConstructorMarker)
             A[MD:(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] call: rn.d.<init>(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
             in method: ip.j.i(vo.d2$a, vo.j0$e, ln.k<? super vo.d2$a, vo.j0, ? extends vo.d2$b, ? extends java.lang.Object>$a, ip.l):java.lang.Object, file: classes3.dex
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
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.j.i(vo.d2$a, vo.j0$e, ln.k$a, ip.l):java.lang.Object");
    }
}
