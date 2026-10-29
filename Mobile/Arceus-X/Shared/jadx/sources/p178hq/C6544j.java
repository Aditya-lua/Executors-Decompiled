package p178hq;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.selfie.C3964o;
import com.withpersona.sdk2.inquiry.selfie.C3965p;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import hn.C6434c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import p152go.C6152a;
import p152go.C6159e;
import p229jt.C7348o;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p475uq.C11930a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hq.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m31665d2 = {"Lhq/j;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lgo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lgo/e;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6544j {

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
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: hq.j$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", m39664f = "LocalVideoCaptureRenderer.kt", m39665l = {41}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24867t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f24868u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.AbstractC3927b, Object>.a f24869v;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a aVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f24868u = finalizeLocalVideoCapture;
            this.f24869v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m28380r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objM48901c instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objM48901c : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(SelfieState.FinalizeLocalVideoCapture.m19347A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f24868u, this.f24869v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24867t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long minDurationMs = this.f24868u.getMinDurationMs();
                this.f24867t = 1;
                if (C7946z0.m32938b(minDurationMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f24869v.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: hq.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C6544j.a.m28380r((AbstractC13225r.c) obj2);
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

    public C6544j(@NotNull Context applicationContext, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull C6159e featureFlagManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m28370i(AbstractC13218k.a aVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.EnumC3902a.MANUAL));
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: hq.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6544j.m28371j(arrayList, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m28371j(List list, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objM48901c instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objM48901c : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f29331a;
        }
        action.m48903e(SelfieState.FinalizeLocalVideoCapture.m19347A(finalizeLocalVideoCapture, CollectionsKt.m31725w0(((SelfieState) action.m48901c()).mo19297w(), list), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m28372k(AbstractC13218k.a aVar, final SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: hq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6544j.m28373l(finalizeLocalVideoCapture, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m28373l(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = objM48901c instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objM48901c : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            action.m48903e(C3965p.m20164D(action, ((SelfieState) action.m48901c()).mo19297w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), C3965p.m20179k(action, false)));
            return Unit.f29331a;
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m28374m(AbstractC13218k.a aVar) {
        C3965p.m20192x(aVar, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m28375n(AbstractC13218k.a aVar) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: hq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6544j.m28376o((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m28376o(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m28377p(C6544j c6544j, AbstractC13218k.a aVar, SelfieWorkflow.Input input) {
        C3965p.m20194z(c6544j.applicationContext, aVar, input, true);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final SelfieWorkflow.AbstractC3928c m28378q(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.mo48835b("finalize_delay", new a(renderState, context, null));
        return C3964o.m20154m(renderProps, context, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.AbstractC3928c.c.b.C14141c(new Function1() { // from class: hq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6544j.m28370i(context, (File) obj);
            }
        }, new Function0() { // from class: hq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6544j.m28372k(context, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE : SelfieWorkflow.AbstractC3928c.c.EnumC14142c.FINALIZING, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: hq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6544j.m28374m(context);
            }
        }, new Function0() { // from class: hq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6544j.m28375n(context);
            }
        }, C3965p.m20181m(context, false), new Function0() { // from class: hq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6544j.m28377p(this.f24857a, context, renderProps);
            }
        }, EnumC8598a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
