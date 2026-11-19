package mq;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import un.CameraChoices;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lmq/p;", "Lnn/b0;", "Lmq/q5$d$c;", "Lsn/t;", "cameraPreview", "Ltt/a;", "Lsn/b1;", "selfieDirectionFeed", "Lun/i0;", "cameraChoiceHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lsn/t;Ltt/a;Lun/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lmq/q5$d$c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lsn/t;", "c", "Ltt/a;", "Lun/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements nn.b0<q5.d.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nn.f<q5.d.c> f23762a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sn.t cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tt.a<sn.b1> selfieDirectionFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function2<q5.d.c, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, n.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(q5.d.c p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((n) this.receiver).a(p8, p10);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(q5.d.c cVar, ViewEnvironment viewEnvironment) {
            d(cVar, viewEnvironment);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"mq/p$b", "Lsn/z;", BuildConfig.FLAVOR, "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements sn.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ oq.a f23766a;
        public final /* synthetic */ tt.a<sn.b1> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sn.t f23767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q5.d.c f23768d;

        public b(oq.a aVar, tt.a<sn.b1> aVar2, sn.t tVar, q5.d.c cVar) {
            this.f23766a = aVar;
            this.b = aVar2;
            this.f23767c = tVar;
            this.f23768d = cVar;
        }

        public static final Unit c(q5.d.c cVar, sn.k it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.i().invoke(it);
            return Unit.f21506a;
        }

        @Override // sn.z
        public void a() {
            PreviewView previewviewSelfieCamera = this.f23766a.f28335k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            sn.t.a aVar = sn.t.a.FRONT;
            sn.b1 b1Var = this.b.get();
            sn.t tVar = this.f23767c;
            final q5.d.c cVar = this.f23768d;
            sn.t.g(tVar, previewviewSelfieCamera, aVar, b1Var, true, false, new Function1() { // from class: mq.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.b.c(cVar, (sn.k) obj);
                }
            }, 16, null);
        }
    }

    public p(@NotNull final sn.t cameraPreview, @NotNull final tt.a<sn.b1> selfieDirectionFeed, @NotNull un.i0 cameraChoiceHelper, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f23762a = new nn.f<>(p001kotlin.jvm.internal.d0.b(q5.d.c.class), new pu.o() { // from class: mq.o
            @Override // pu.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.c(selfieDirectionFeed, cameraPreview, trackingEventsLogger, (q5.d.c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final View c(tt.a aVar, sn.t tVar, TrackingEventsLogger trackingEventsLogger, q5.d.c initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) throws CameraAccessException {
        Context context2;
        sn.i iVarA;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        oq.a aVarC = oq.a.c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != zn.a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesB = un.f0.b(applicationContext, un.m0.FRONT);
            if (cameraChoicesB == null) {
                initialRendering.i().invoke(new sn.v0());
                Camera2PreviewView camera2Preview = aVarC.f28327c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                iVarA = new sn.u0(camera2Preview);
            } else {
                un.c.a aVarB = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = aVarC.f28327c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                Object obj = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                iVarA = aVarB.a(cameraChoicesB, camera2Preview2, (un.g) obj, zn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            sn.a0.a aVarC2 = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = aVarC.f28335k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            iVarA = aVarC2.a(tVar, previewviewSelfieCamera, new b(aVarC, aVar, tVar, initialRendering), initialRendering.getIsAudioRequired());
        }
        ConstraintLayout constraintLayoutB = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        Intrinsics.checkNotNull(aVarC);
        Object obj2 = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        nn.f0.a(constraintLayoutB, initialRendering, initialViewEnvironment, new a(new n(aVarC, iVarA, (sn.b1) obj2, trackingEventsLogger)));
        ConstraintLayout constraintLayoutB2 = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB2, "let(...)");
        return constraintLayoutB2;
    }

    @Override // nn.b0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull q5.d.c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f23762a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // nn.b0
    @NotNull
    public xu.c<? super q5.d.c> getType() {
        return this.f23762a.getType();
    }
}
