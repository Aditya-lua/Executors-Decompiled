package vq;

import android.content.Context;
import av.p0;
import av.z0;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import gu.m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ln.b0;
import ln.r;
import mq.i1;
import mq.j6;
import mq.q5;
import mq.y0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.a0;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lvq/j;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lto/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lto/e;)V", "Lmq/q5$b;", "renderProps", "Lmq/y0$f;", "renderState", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lln/k;", "Lmq/y0;", "Lmq/q5$c;", "context", "Lmq/q5$d;", "q", "(Lmq/q5$b;Lmq/y0$f;Lln/k$a;)Lmq/q5$d;", "a", "Landroid/content/Context;", "b", "Lsn/a0$a;", "c", "Lun/c$a;", "d", "Lir/b;", "e", "Lto/e;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35359t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ y0.FinalizeLocalVideoCapture f35360u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<q5.Input, y0, q5.c, Object>.a f35361v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a aVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f35360u = finalizeLocalVideoCapture;
            this.f35361v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(r.c cVar) {
            Object objC = cVar.c();
            y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof y0.FinalizeLocalVideoCapture ? (y0.FinalizeLocalVideoCapture) objC : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f21506a;
            }
            cVar.e(y0.FinalizeLocalVideoCapture.z(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f35360u, this.f35361v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35359t;
            if (i10 == 0) {
                o.b(obj);
                long minDurationMs = this.f35360u.getMinDurationMs();
                this.f35359t = 1;
                if (z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f35361v.d().a(b0.c(null, new Function1() { // from class: vq.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.a.p((r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    public j(@NotNull Context applicationContext, @NotNull a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull to.e featureFlagManager) {
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

    public static final Unit i(ln.k.a aVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new mq.b0.SelfieVideo(absolutePath, mq.b0.a.MANUAL));
        aVar.d().a(b0.c(null, new Function1() { // from class: vq.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.j(arrayList, (r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit j(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = objC instanceof y0.FinalizeLocalVideoCapture ? (y0.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f21506a;
        }
        action.e(y0.FinalizeLocalVideoCapture.z(finalizeLocalVideoCapture, CollectionsKt.w0(((y0) action.c()).w(), list), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f21506a;
    }

    public static final Unit k(ln.k.a aVar, final y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        aVar.d().a(b0.c(null, new Function1() { // from class: vq.g
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.l(finalizeLocalVideoCapture, (r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit l(y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = objC instanceof y0.FinalizeLocalVideoCapture ? (y0.FinalizeLocalVideoCapture) objC : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            action.e(j6.D(action, ((y0) action.c()).w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), j6.k(action, false)));
            return Unit.f21506a;
        }
        return Unit.f21506a;
    }

    public static final Unit m(ln.k.a aVar) {
        j6.x(aVar, null);
        return Unit.f21506a;
    }

    public static final Unit n(ln.k.a aVar) {
        aVar.d().a(b0.c(null, new Function1() { // from class: vq.f
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.o((r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit o(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit p(j jVar, ln.k.a aVar, q5.Input input) {
        j6.z(jVar.applicationContext, aVar, input, true);
        return Unit.f21506a;
    }

    @NotNull
    public final q5.d q(@NotNull final q5.Input renderProps, @NotNull final y0.FinalizeLocalVideoCapture renderState, @NotNull final ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.b("finalize_delay", new a(renderState, context, null));
        return i1.m(renderProps, context, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new q5.d.c.b.C0471c(new Function1() { // from class: vq.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.i(context, (File) obj);
            }
        }, new Function0() { // from class: vq.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.k(context, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? q5.d.c.EnumC0473c.COMPLETE : q5.d.c.EnumC0473c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: vq.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.m(context);
            }
        }, new Function0() { // from class: vq.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.n(context);
            }
        }, j6.m(context, false), new Function0() { // from class: vq.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.p(this.f35351a, context, renderProps);
            }
        }, zn.a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
