package hq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import ku.z0;
import org.jetbrains.annotations.NotNull;
import pt.m;
import ym.b0;
import ym.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lhq/j;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lgo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lhn/c$a;", "d", "Luq/a;", "e", "Lgo/e;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

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
    public final go.e featureFlagManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {41}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19742t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f19743u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ym.k<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.b, Object>.a f19744v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f19743u = finalizeLocalVideoCapture;
            this.f19744v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(r.c cVar) {
            Object objC = cVar.c();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objC : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22483a;
            }
            cVar.e(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f19743u, this.f19744v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19742t;
            if (i10 == 0) {
                o.b(obj);
                long minDurationMs = this.f19743u.getMinDurationMs();
                this.f19742t = 1;
                if (z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f19744v.d().a(b0.c(null, new Function1() { // from class: hq.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.a.r((r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public j(@NotNull Context applicationContext, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull uq.a navigationStateManager, @NotNull go.e featureFlagManager) {
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

    public static final Unit i(ym.k.a aVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.a.MANUAL));
        aVar.d().a(b0.c(null, new Function1() { // from class: hq.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.j(arrayList, (r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit j(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f22483a;
        }
        action.e(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, CollectionsKt.w0(((SelfieState) action.c()).w(), list), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f22483a;
    }

    public static final Unit k(ym.k.a aVar, final SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        aVar.d().a(b0.c(null, new Function1() { // from class: hq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.l(finalizeLocalVideoCapture, (r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit l(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = objC instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            action.e(p.D(action, ((SelfieState) action.c()).w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), p.k(action, false)));
            return Unit.f22483a;
        }
        return Unit.f22483a;
    }

    public static final Unit m(ym.k.a aVar) {
        p.x(aVar, null);
        return Unit.f22483a;
    }

    public static final Unit n(ym.k.a aVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: hq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.o((r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit o(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit p(j jVar, ym.k.a aVar, SelfieWorkflow.Input input) {
        p.z(jVar.applicationContext, aVar, input, true);
        return Unit.f22483a;
    }

    @NotNull
    public final SelfieWorkflow.c q(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.b("finalize_delay", new a(renderState, context, null));
        return com.withpersona.sdk2.inquiry.selfie.o.m(renderProps, context, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0235c.b.C0237c(new Function1() { // from class: hq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.i(context, (File) obj);
            }
        }, new Function0() { // from class: hq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.k(context, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE : SelfieWorkflow.c.C0235c.EnumC0238c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: hq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.m(context);
            }
        }, new Function0() { // from class: hq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.n(context);
            }
        }, p.m(context, false), new Function0() { // from class: hq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.p(this.f19734a, context, renderProps);
            }
        }, mn.a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
