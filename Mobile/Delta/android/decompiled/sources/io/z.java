package io;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/z;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Ldn/x;Lcom/withpersona/sdk2/camera/b;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Ldn/x;", "c", "Lcom/withpersona/sdk2/camera/b;", "Leo/e;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements ym.a0<Screen.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym.f<Screen.b> f21298a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dn.x governmentIdFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<Screen.b, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, u.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(Screen.b p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((u) this.receiver).b(p8, p10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Screen.b bVar, ViewEnvironment viewEnvironment) {
            d(bVar, viewEnvironment);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"io/z$b", "Lio/w$a;", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lio/w;", "b", "(Ldn/x;Lcom/withpersona/sdk2/camera/b;Leo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lio/w;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements w.a {
        @Override // io.w.a
        public w b(dn.x governmentIdFeed, com.withpersona.sdk2.camera.b cameraPreview, eo.e featureFlagManager, Screen.b initialRendering, Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
            Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
            Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(context, "context");
            return new m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, container);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21302a;

        static {
            int[] iArr = new int[go.d.values().length];
            try {
                iArr[go.d.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[go.d.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21302a = iArr;
        }
    }

    public z(@NotNull final dn.x governmentIdFeed, @NotNull final com.withpersona.sdk2.camera.b cameraPreview, @NotNull final eo.e featureFlagManager, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f21298a = new ym.f<>(d0.b(Screen.b.class), new xt.o() { // from class: io.y
            @Override // xt.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return z.c(governmentIdFeed, cameraPreview, featureFlagManager, trackingEventsLogger, (Screen.b) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final View c(dn.x xVar, com.withpersona.sdk2.camera.b bVar, eo.e eVar, TrackingEventsLogger trackingEventsLogger, Screen.b initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        un.d dVar;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        un.a.C0599a c0599aC = un.a.f33136a.c(w.a.class, new b());
        int i10 = c.f21302a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = un.d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            dVar = un.d.K0000GovIdCapture;
        }
        w wVarB = ((w.a) c0599aC.a(dVar)).b(xVar, bVar, eVar, initialRendering, context, viewGroup);
        View root = wVarB.getRoot();
        Context context2 = wVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        e0.a(root, initialRendering, initialViewEnvironment, new a(new u(context2, wVarB, wVarB.getCameraController(), xVar, trackingEventsLogger)));
        return wVarB.getRoot();
    }

    @Override // ym.a0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull Screen.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f21298a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // ym.a0
    @NotNull
    public fu.c<? super Screen.b> getType() {
        return this.f21298a.getType();
    }
}
