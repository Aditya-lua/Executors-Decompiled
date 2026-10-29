package p473uo;

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
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p109en.AlertContainerScreen;
import p229jt.C7348o;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p361po.EnumC10302b;
import p475uq.C11930a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: uo.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Luo/j;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Luo/l;", "videoCaptureHelper", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Luo/l;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11903j {

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

    /* JADX INFO: renamed from: uo.j$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", m39664f = "LocalVideoCaptureRenderer.kt", m39665l = {45}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f42262t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdState.FinalizeLocalVideoCapture f42263u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.AbstractC3503a, Object>.a f42264v;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f42263u = finalizeLocalVideoCapture;
            this.f42264v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m44490r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objM48901c instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) objM48901c : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(GovernmentIdState.FinalizeLocalVideoCapture.m16994J(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, FrameMetricsAggregator.EVERY_DURATION, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f42263u, this.f42264v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f42262t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long minDurationMs = this.f42263u.getMinDurationMs();
                this.f42262t = 1;
                if (C7946z0.m32938b(minDurationMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f42264v.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: uo.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C11903j.a.m44490r((AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11903j(@NotNull Context applicationContext, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m44480j(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m44481k(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: uo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11903j.m44482l((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m44482l(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m44483m(AbstractC13218k.a aVar) {
        C3555n.m17613S(aVar, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m44484n(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m44485o(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input, C11905l c11905l, File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<GovernmentId> listMo16956E = finalizeLocalVideoCapture.mo16956E();
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
        C3555n.m17617W(finalizeLocalVideoCapture, aVar, input, new GovernmentId.GovernmentIdVideo(listM31878d, enumC3486b, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.EnumC3485a.f13532b), finalizeLocalVideoCapture.getId(), c11905l, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? finalizeLocalVideoCapture.mo16955D() : null, (3584 & 512) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? finalizeLocalVideoCapture.getCountryCode() : null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m44486p() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m44487q(C11903j c11903j, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input) {
        C3555n.m17615U(c11903j.applicationContext, aVar, input, true);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Object m44488i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeLocalVideoCapture renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper) {
        IdConfig.EnumC3514b side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        context.mo48835b("finalize_delay", new a(renderState, context, null));
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
        Function1<Throwable, Unit> function1M17659z = C3555n.m17659z(context, false);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        return new AlertContainerScreen(C3858g.m19165c(C3551l.m17572f(renderProps, strM17605K, strM17604J, capturing, aVar, overlay, type, enumC3514b, navigationStateM44528b, (1203765760 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0127: RETURN 
              (wrap en.d:0x0124: CONSTRUCTOR 
              (wrap op.c<java.lang.Object, java.lang.Object>:0x011e: INVOKE 
              (wrap com.withpersona.sdk2.inquiry.governmentid.Screen$b:0x011a: INVOKE 
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r7v1 'strM17605K' java.lang.String)
              (r9v3 'strM17604J' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r5v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r4v12 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r12v1 'type' po.b)
              (r8v0 'enumC3514b' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r13v1 'navigationStateM44528b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1203765760 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.n.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00b4: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.a.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00bd: CONSTRUCTOR 
              (r43v0 'context' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(ym.k$a):void (m), WRAPPED] call: uo.b.<init>(ym.k$a):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00c5: CONSTRUCTOR 
              (r43v0 'context' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(ym.k$a):void (m), WRAPPED] call: uo.c.<init>(ym.k$a):void type: CONSTRUCTOR)
              false
              (r14v0 'listM31892k' java.util.List)
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture)
              (r16v0 'partIndex' int)
              (wrap com.withpersona.sdk2.camera.e$a:0x00a5: IGET (r40v0 'this' uo.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] uo.j.b com.withpersona.sdk2.camera.e$a)
              (wrap hn.c$a:0x00a9: IGET (r40v0 'this' uo.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] uo.j.c hn.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.p.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.d.<init>():void type: CONSTRUCTOR))
              (r21v0 'function1M17659z' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap mn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] mn.a.c mn.a) : (wrap mn.a:0x00a3: SGET  A[WRAPPED] mn.a.b mn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.q.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x00d3: CONSTRUCTOR 
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture A[DONT_INLINE])
              (r43v0 'context' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' uo.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void (m), WRAPPED] call: uo.e.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, uo.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.r.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x00d8: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: uo.f.<init>():void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x00dd: CONSTRUCTOR 
              (r40v0 'this' uo.j A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r43v0 'context' ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(uo.j, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: uo.g.<init>(uo.j, ym.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap mo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1203765760 int) A[WRAPPED]) != (0 int)) ? (null mo.i) : (null mo.i))
              (wrap ur.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1203765760 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null ur.a) : (null ur.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap wq.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] wq.l.a wq.l) : (null wq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, mo.i, ur.a, boolean, wq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED])
             STATIC call: com.withpersona.sdk2.inquiry.permissions.g.c(java.lang.Object):op.c A[MD:(java.lang.Object):op.c<java.lang.Object, java.lang.Object> (m), WRAPPED])
              (null java.util.List)
              (2 int)
              (null kotlin.jvm.internal.DefaultConstructorMarker)
             A[MD:(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] call: en.d.<init>(java.lang.Object, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
             in method: uo.j.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, uo.l):java.lang.Object, file: classes3.dex
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
            r0 = r40
            r1 = r41
            r15 = r42
            r2 = r43
            r3 = r44
            java.lang.String r4 = "renderProps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "renderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r4)
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "videoCaptureHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            uo.j$a r4 = new uo.j$a
            r5 = 0
            r4.<init>(r15, r2, r5)
            java.lang.String r6 = "finalize_delay"
            r2.mo48835b(r6, r4)
            com.withpersona.sdk2.inquiry.governmentid.IdPart r4 = r15.getCurrentPart()
            boolean r6 = r4 instanceof com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart
            if (r6 == 0) goto L34
            com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart r4 = (com.withpersona.sdk2.inquiry.governmentid.IdPart.SideIdPart) r4
            goto L35
        L34:
            r4 = r5
        L35:
            if (r4 == 0) goto L40
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r4 = r4.getSide()
            if (r4 != 0) goto L3e
            goto L40
        L3e:
            r8 = r4
            goto L43
        L40:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$b r4 = com.withpersona.sdk2.inquiry.governmentid.IdConfig.EnumC3514b.Front
            goto L3e
        L43:
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r4 = r15.getId()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig r4 = r4.m17273g(r8)
            en.d r6 = new en.d
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r7 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r9 = r15.getId()
            java.lang.String r9 = r9.getIdClassKey()
            java.lang.String r10 = r15.getCountryCode()
            java.lang.String r7 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17605K(r7, r8, r9, r10)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r9 = r1.getStrings()
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r10 = r15.getId()
            java.lang.String r10 = r10.getIdClassKey()
            java.lang.String r11 = r15.getCountryCode()
            java.lang.String r9 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17604J(r9, r8, r10, r11)
            com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input$Strings r10 = r1.getStrings()
            java.lang.String r10 = r10.getCapturing()
            r11 = r5
            com.withpersona.sdk2.inquiry.governmentid.Screen$b$a r5 = com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b.a.Disabled
            com.withpersona.sdk2.inquiry.governmentid.IdConfig r12 = r15.getId()
            po.b r12 = r12.getType()
            com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay r4 = r4.getOverlay()
            uq.a r13 = r0.navigationStateManager
            com.withpersona.sdk2.inquiry.shared.navigation.NavigationState r13 = r13.m44528b()
            java.util.List r14 = kotlin.collections.C7699p.m31892k()
            int r16 = r15.getPartIndex()
            r11 = 0
            kotlin.jvm.functions.Function1 r21 = com.withpersona.sdk2.inquiry.governmentid.C3555n.m17659z(r2, r11)
            boolean r25 = r15.getIsDelayComplete()
            mn.a r22 = mn.EnumC8598a.Upload
            com.withpersona.sdk2.camera.e$a r11 = r0.cameraXControllerFactory
            r18 = r4
            hn.c$a r4 = r0.camera2ControllerFactory
            r19 = r6
            r6 = r18
            r18 = r4
            r4 = r10
            uo.a r10 = new uo.a
            r10.<init>()
            r17 = r11
            r20 = 0
            uo.b r11 = new uo.b
            r11.<init>()
            r23 = r7
            r7 = r12
            uo.c r12 = new uo.c
            r12.<init>()
            r24 = r20
            uo.d r20 = new uo.d
            r20.<init>()
            r26 = r4
            uo.e r4 = new uo.e
            r4.<init>()
            uo.f r27 = new uo.f
            r27.<init>()
            uo.g r3 = new uo.g
            r3.<init>()
            r36 = 3
            r37 = 0
            r28 = r3
            r3 = r9
            r9 = r13
            r13 = 0
            r2 = r19
            r19 = 0
            r29 = r2
            r2 = r23
            r23 = 0
            r30 = r24
            r24 = 1
            r31 = r29
            r29 = 0
            r32 = r30
            r30 = 0
            r33 = r31
            r31 = 0
            r34 = r32
            r32 = 0
            r35 = r33
            r33 = 0
            r38 = r34
            r34 = 0
            r39 = r35
            r35 = 1610874880(0x60040000, float:3.804641E19)
            r0 = r26
            r26 = r4
            r4 = r0
            r0 = r39
            com.withpersona.sdk2.inquiry.governmentid.Screen$b r1 = com.withpersona.sdk2.inquiry.governmentid.C3551l.m17573g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            op.c r1 = com.withpersona.sdk2.inquiry.permissions.C3858g.m19165c(r1)
            r2 = 2
            r11 = 0
            r0.<init>(r1, r11, r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p473uo.C11903j.m44488i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, ym.k$a, uo.l):java.lang.Object");
    }
}
