package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.n0;
import dn.s;
import fn.CameraChoices;
import fn.f0;
import fn.i0;
import fn.m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/d;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lat/a;", "Ldn/n0;", "selfieDirectionFeed", "Lfn/i0;", "cameraChoiceHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lcom/withpersona/sdk2/camera/b;Lat/a;Lfn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lcom/withpersona/sdk2/camera/b;", "c", "Lat/a;", "Lfn/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements a0<SelfieWorkflow.c.C0238c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym.f<SelfieWorkflow.c.C0238c> f12959a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final at.a<n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<SelfieWorkflow.c.C0238c, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, c.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(SelfieWorkflow.c.C0238c p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((c) this.receiver).b(p8, p10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.c.C0238c c0238c, ViewEnvironment viewEnvironment) {
            d(c0238c, viewEnvironment);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/d$b", "Ldn/s;", "", "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yp.a f12963a;
        public final /* synthetic */ at.a<n0> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.withpersona.sdk2.camera.b f12964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c f12965d;

        public b(yp.a aVar, at.a<n0> aVar2, com.withpersona.sdk2.camera.b bVar, SelfieWorkflow.c.C0238c c0238c) {
            this.f12963a = aVar;
            this.b = aVar2;
            this.f12964c = bVar;
            this.f12965d = c0238c;
        }

        public static final Unit c(SelfieWorkflow.c.C0238c c0238c, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c0238c.i().invoke(it);
            return Unit.f22938a;
        }

        @Override // dn.s
        public void a() {
            PreviewView previewviewSelfieCamera = this.f12963a.f36943k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            com.withpersona.sdk2.camera.b.a aVar = com.withpersona.sdk2.camera.b.a.FRONT;
            n0 n0Var = this.b.get();
            com.withpersona.sdk2.camera.b bVar = this.f12964c;
            final SelfieWorkflow.c.C0238c c0238c = this.f12965d;
            com.withpersona.sdk2.camera.b.g(bVar, previewviewSelfieCamera, aVar, n0Var, true, false, new Function1() { // from class: wp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.selfie.d.b.c(c0238c, (dn.h) obj);
                }
            }, 16, null);
        }
    }

    public d(@NotNull final com.withpersona.sdk2.camera.b cameraPreview, @NotNull final at.a<n0> selfieDirectionFeed, @NotNull i0 cameraChoiceHelper, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f12959a = new ym.f<>(d0.b(SelfieWorkflow.c.C0238c.class), new xt.o() { // from class: wp.l
            @Override // xt.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return com.withpersona.sdk2.inquiry.selfie.d.c(selfieDirectionFeed, cameraPreview, trackingEventsLogger, (SelfieWorkflow.c.C0238c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final View c(at.a aVar, com.withpersona.sdk2.camera.b bVar, TrackingEventsLogger trackingEventsLogger, SelfieWorkflow.c.C0238c initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) throws CameraAccessException {
        Context context2;
        dn.g gVarA;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        yp.a aVarC = yp.a.c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != kn.a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesB = f0.b(applicationContext, m0.FRONT);
            if (cameraChoicesB == null) {
                initialRendering.i().invoke(new dn.i0());
                Camera2PreviewView camera2Preview = aVarC.f36935c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                gVarA = new com.withpersona.sdk2.camera.g(camera2Preview);
            } else {
                fn.c.a aVarB = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = aVarC.f36935c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                Object obj = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                gVarA = aVarB.a(cameraChoicesB, camera2Preview2, (fn.g) obj, kn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            com.withpersona.sdk2.camera.e.a aVarC2 = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = aVarC.f36943k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            gVarA = aVarC2.a(bVar, previewviewSelfieCamera, new b(aVarC, aVar, bVar, initialRendering), initialRendering.getIsAudioRequired());
        }
        ConstraintLayout constraintLayoutB = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        Intrinsics.checkNotNull(aVarC);
        Object obj2 = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        e0.a(constraintLayoutB, initialRendering, initialViewEnvironment, new a(new c(aVarC, gVarA, (n0) obj2, trackingEventsLogger)));
        ConstraintLayout constraintLayoutB2 = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB2, "let(...)");
        return constraintLayoutB2;
    }

    @Override // ym.a0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull SelfieWorkflow.c.C0238c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f12959a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // ym.a0
    @NotNull
    public fu.c<? super SelfieWorkflow.c.C0238c> getType() {
        return this.f12959a.getType();
    }
}
