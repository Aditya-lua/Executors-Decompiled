package p251ko;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import hu.InterfaceC6567c;
import io.EnumC6852d;
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
import p132fn.C5717x;
import p152go.C6159e;
import p229jt.C7345l;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: ko.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m31665d2 = {"Lko/z;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lfn/x;", "c", "Lcom/withpersona/sdk2/camera/b;", "Lgo/e;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7667z implements InterfaceC0364a0<Screen.C3527b> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0373f<Screen.C3527b> f29323a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C5717x governmentIdFeed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3402b cameraPreview;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: ko.z$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function2<Screen.C3527b, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, C7662u.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m31662d(Screen.C3527b p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((C7662u) this.receiver).mo1442a(p8, p10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Screen.C3527b c3527b, ViewEnvironment viewEnvironment) {
            m31662d(c3527b, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: ko.z$b */
    @Metadata(m31664d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"ko/z$b", "Lko/w$a;", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lko/w;", "b", "(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lko/w;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC7664w.a {
        @Override // p251ko.InterfaceC7664w.a
        /* JADX INFO: renamed from: b */
        public InterfaceC7664w mo31656b(C5717x governmentIdFeed, C3402b cameraPreview, C6159e featureFlagManager, Screen.C3527b initialRendering, Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
            Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
            Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7654m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, container);
        }
    }

    /* JADX INFO: renamed from: ko.z$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29328a;

        static {
            int[] iArr = new int[EnumC6852d.values().length];
            try {
                iArr[EnumC6852d.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6852d.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29328a = iArr;
        }
    }

    public C7667z(@NotNull final C5717x governmentIdFeed, @NotNull final C3402b cameraPreview, @NotNull final C6159e featureFlagManager, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f29323a = new C0373f<>(C7731d0.m32002b(Screen.C3527b.class), new InterfaceC14058o() { // from class: ko.y
            @Override // p615zt.InterfaceC14058o
            /* JADX INFO: renamed from: e */
            public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                return C7667z.m31660c(governmentIdFeed, cameraPreview, featureFlagManager, trackingEventsLogger, (Screen.C3527b) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: c */
    public static final View m31660c(C5717x c5717x, C3402b c3402b, C6159e c6159e, TrackingEventsLogger trackingEventsLogger, Screen.C3527b initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        EnumC12498d enumC12498d;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC7664w.a.class, new b());
        int i10 = c.f29328a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            enumC12498d = EnumC12498d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000GovIdCapture;
        }
        InterfaceC7664w interfaceC7664wMo31656b = ((InterfaceC7664w.a) aVarM46814c.m46815a(enumC12498d)).mo31656b(c5717x, c3402b, c6159e, initialRendering, context, viewGroup);
        View root = interfaceC7664wMo31656b.getRoot();
        Context context2 = interfaceC7664wMo31656b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C0372e0.m1408a(root, initialRendering, initialViewEnvironment, new a(new C7662u(context2, interfaceC7664wMo31656b, interfaceC7664wMo31656b.getCameraController(), c5717x, trackingEventsLogger)));
        return interfaceC7664wMo31656b.getRoot();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View mo1379a(@NotNull Screen.C3527b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f29323a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<? super Screen.C3527b> getType() {
        return this.f29323a.getType();
    }
}
