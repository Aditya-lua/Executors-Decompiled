package p611zp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.InterfaceC0364a0;
import p016an.ViewEnvironment;
import p061ct.InterfaceC4364a;
import p132fn.C5698n0;
import p152go.C6153a0;
import p152go.C6159e;
import p229jt.C7345l;
import p261l2.C7975b;
import p498vq.C12249c;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p584yp.C13370o;
import p584yp.EnumC13272a;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: zp.p0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m31665d2 = {"Lzp/p0;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lct/a;", "Lfn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lgo/e;", "featureFlagManager", "<init>", "(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lcom/withpersona/sdk2/camera/b;", "c", "Lct/a;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "e", "Lgo/e;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14021p0 implements InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0373f<SelfieWorkflow.AbstractC3928c.a> f49006a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4364a<C5698n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: zp.p0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function2<SelfieWorkflow.AbstractC3928c.a, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, C14011k0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m50635d(SelfieWorkflow.AbstractC3928c.a p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((C14011k0) this.receiver).mo1442a(p8, p10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.AbstractC3928c.a aVar, ViewEnvironment viewEnvironment) {
            m50635d(aVar, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: zp.p0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49011a;

        static {
            int[] iArr = new int[EnumC13272a.values().length];
            try {
                iArr[EnumC13272a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13272a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13272a.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49011a = iArr;
        }
    }

    public C14021p0(@NotNull final C3402b cameraPreview, @NotNull final InterfaceC4364a<C5698n0> selfieDirectionFeed, @NotNull final TrackingEventsLogger trackingEventsLogger, @NotNull final C6159e featureFlagManager) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.f49006a = new C0373f<>(C7731d0.m32002b(SelfieWorkflow.AbstractC3928c.a.class), new InterfaceC14058o() { // from class: zp.n0
            @Override // p615zt.InterfaceC14058o
            /* JADX INFO: renamed from: e */
            public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                return C14021p0.m50632d(cameraPreview, selfieDirectionFeed, trackingEventsLogger, featureFlagManager, (SelfieWorkflow.AbstractC3928c.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX INFO: renamed from: d */
    public static final View m50632d(C3402b c3402b, InterfaceC4364a interfaceC4364a, TrackingEventsLogger trackingEventsLogger, C6159e c6159e, SelfieWorkflow.AbstractC3928c.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        EnumC12498d enumC12498d;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC14025r0.a.class, new InterfaceC14025r0.a() { // from class: zp.o0
            @Override // p611zp.InterfaceC14025r0.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC14025r0 mo24078a(Context context2, ViewGroup viewGroup2) {
                return C14021p0.m50633e(context2, viewGroup2);
            }
        });
        int i10 = b.f49011a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            enumC12498d = EnumC12498d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000SelfieCapture;
        }
        InterfaceC14025r0 interfaceC14025r0Mo24078a = ((InterfaceC14025r0.a) aVarM46814c.m46815a(enumC12498d)).mo24078a(context, viewGroup);
        C12249c.m45393b(initialViewEnvironment, context, C7975b.m33005c(context, C13370o.f46839a));
        View root = interfaceC14025r0Mo24078a.getRoot();
        Object obj = interfaceC4364a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C0372e0.m1408a(root, initialRendering, initialViewEnvironment, new a(new C14011k0(context, interfaceC14025r0Mo24078a, c3402b, (C5698n0) obj, trackingEventsLogger, c6159e.m27145a(C6153a0.f23514a))));
        return interfaceC14025r0Mo24078a.getRoot();
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC14025r0 m50633e(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C14022q(context, viewGroup);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public View mo1379a(@NotNull SelfieWorkflow.AbstractC3928c.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f49006a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<? super SelfieWorkflow.AbstractC3928c.a> getType() {
        return this.f49006a.getType();
    }
}
