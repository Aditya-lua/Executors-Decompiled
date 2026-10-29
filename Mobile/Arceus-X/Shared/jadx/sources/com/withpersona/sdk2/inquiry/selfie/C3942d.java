package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq.C1137a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.C3407g;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.C3942d;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hn.C6434c;
import hn.C6441f0;
import hn.C6447i0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import hn.InterfaceC6442g;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.InterfaceC0364a0;
import p016an.ViewEnvironment;
import p061ct.InterfaceC4364a;
import p132fn.AbstractC5685h;
import p132fn.C5688i0;
import p132fn.C5698n0;
import p132fn.InterfaceC5683g;
import p132fn.InterfaceC5707s;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/d;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lct/a;", "Lfn/n0;", "selfieDirectionFeed", "Lhn/i0;", "cameraChoiceHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lcom/withpersona/sdk2/camera/b;", "c", "Lct/a;", "Lhn/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3942d implements InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.c> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0373f<SelfieWorkflow.AbstractC3928c.c> f16512a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4364a<C5698n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C6447i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function2<SelfieWorkflow.AbstractC3928c.c, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, C3941c.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m19982d(SelfieWorkflow.AbstractC3928c.c p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((C3941c) this.receiver).mo1442a(p8, p10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.AbstractC3928c.c cVar, ViewEnvironment viewEnvironment) {
            m19982d(cVar, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.d$b */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/d$b", "Lfn/s;", "", "a", "()V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC5707s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1137a f16517a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4364a<C5698n0> f16518b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3402b f16519c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c f16520d;

        public b(C1137a c1137a, InterfaceC4364a<C5698n0> interfaceC4364a, C3402b c3402b, SelfieWorkflow.AbstractC3928c.c cVar) {
            this.f16517a = c1137a;
            this.f16518b = interfaceC4364a;
            this.f16519c = c3402b;
            this.f16520d = cVar;
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m19984c(SelfieWorkflow.AbstractC3928c.c cVar, AbstractC5685h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.m19845i().invoke(it);
            return Unit.f29331a;
        }

        @Override // p132fn.InterfaceC5707s
        /* JADX INFO: renamed from: a */
        public void mo17506a() {
            PreviewView previewviewSelfieCamera = this.f16517a.f4679k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            C3402b.a aVar = C3402b.a.FRONT;
            C5698n0 c5698n0 = this.f16518b.get();
            C3402b c3402b = this.f16519c;
            final SelfieWorkflow.AbstractC3928c.c cVar = this.f16520d;
            C3402b.m16195g(c3402b, previewviewSelfieCamera, aVar, c5698n0, true, false, new Function1() { // from class: yp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3942d.b.m19984c(cVar, (AbstractC5685h) obj);
                }
            }, 16, null);
        }
    }

    public C3942d(@NotNull final C3402b cameraPreview, @NotNull final InterfaceC4364a<C5698n0> selfieDirectionFeed, @NotNull C6447i0 cameraChoiceHelper, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f16512a = new C0373f<>(C7731d0.m32002b(SelfieWorkflow.AbstractC3928c.c.class), new InterfaceC14058o() { // from class: yp.l
            @Override // p615zt.InterfaceC14058o
            /* JADX INFO: renamed from: e */
            public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                return C3942d.m19980c(selfieDirectionFeed, cameraPreview, trackingEventsLogger, (SelfieWorkflow.AbstractC3928c.c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: c */
    public static final View m19980c(InterfaceC4364a interfaceC4364a, C3402b c3402b, TrackingEventsLogger trackingEventsLogger, SelfieWorkflow.AbstractC3928c.c initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) throws CameraAccessException {
        Context context2;
        InterfaceC5683g interfaceC5683gMo16229a;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        C1137a c1137aM6462c = C1137a.m6462c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != EnumC8598a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesM28079b = C6441f0.m28079b(applicationContext, EnumC6455m0.FRONT);
            if (cameraChoicesM28079b == null) {
                initialRendering.m19845i().invoke(new C5688i0());
                Camera2PreviewView camera2Preview = c1137aM6462c.f4671c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                interfaceC5683gMo16229a = new C3407g(camera2Preview);
            } else {
                C6434c.a aVarM19838b = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = c1137aM6462c.f4671c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                Object obj = interfaceC4364a.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                interfaceC5683gMo16229a = aVarM19838b.mo28063a(cameraChoicesM28079b, camera2Preview2, (InterfaceC6442g) obj, EnumC8598a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            C3405e.a aVarM19839c = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = c1137aM6462c.f4679k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            interfaceC5683gMo16229a = aVarM19839c.mo16229a(c3402b, previewviewSelfieCamera, new b(c1137aM6462c, interfaceC4364a, c3402b, initialRendering), initialRendering.getIsAudioRequired());
        }
        ConstraintLayout constraintLayoutM6464b = c1137aM6462c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6464b, "getRoot(...)");
        Intrinsics.checkNotNull(c1137aM6462c);
        Object obj2 = interfaceC4364a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        C0372e0.m1408a(constraintLayoutM6464b, initialRendering, initialViewEnvironment, new a(new C3941c(c1137aM6462c, interfaceC5683gMo16229a, (C5698n0) obj2, trackingEventsLogger)));
        ConstraintLayout constraintLayoutM6464b2 = c1137aM6462c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6464b2, "let(...)");
        return constraintLayoutM6464b2;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View mo1379a(@NotNull SelfieWorkflow.AbstractC3928c.c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f16512a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<? super SelfieWorkflow.AbstractC3928c.c> getType() {
        return this.f16512a.getType();
    }
}
