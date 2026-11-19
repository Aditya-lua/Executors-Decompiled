package xo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import nn.ViewEnvironment;
import nn.b0;
import nn.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import sn.h0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lxo/z;", "Lnn/b0;", "Lvo/y3$b;", "Lsn/h0;", "governmentIdFeed", "Lsn/t;", "cameraPreview", "Lto/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lvo/y3$b;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lsn/h0;", "c", "Lsn/t;", "Lto/e;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements b0<y3.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nn.f<y3.b> f36936a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 governmentIdFeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.t cameraPreview;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function2<y3.b, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, u.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(y3.b p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((u) this.receiver).a(p8, p10);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(y3.b bVar, ViewEnvironment viewEnvironment) {
            d(bVar, viewEnvironment);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"xo/z$b", "Lxo/w$a;", "Lsn/h0;", "governmentIdFeed", "Lsn/t;", "cameraPreview", "Lto/e;", "featureFlagManager", "Lvo/y3$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lxo/w;", "b", "(Lsn/h0;Lsn/t;Lto/e;Lvo/y3$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lxo/w;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements w.a {
        @Override // xo.w.a
        public w b(h0 governmentIdFeed, sn.t cameraPreview, to.e featureFlagManager, y3.b initialRendering, Context context, ViewGroup container) {
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
        public static final /* synthetic */ int[] f36940a;

        static {
            int[] iArr = new int[vo.i.values().length];
            try {
                iArr[vo.i.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vo.i.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36940a = iArr;
        }
    }

    public z(@NotNull final h0 governmentIdFeed, @NotNull final sn.t cameraPreview, @NotNull final to.e featureFlagManager, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f36936a = new nn.f<>(d0.b(y3.b.class), new pu.o() { // from class: xo.y
            @Override // pu.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return z.c(governmentIdFeed, cameraPreview, featureFlagManager, trackingEventsLogger, (y3.b) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final View c(h0 h0Var, sn.t tVar, to.e eVar, TrackingEventsLogger trackingEventsLogger, y3.b initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        ko.d dVar;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        ko.a.C0404a c0404aC = ko.a.f21493a.c(w.a.class, new b());
        int i10 = c.f36940a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = ko.d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            dVar = ko.d.K0000GovIdCapture;
        }
        w wVarB = ((w.a) c0404aC.a(dVar)).b(h0Var, tVar, eVar, initialRendering, context, viewGroup);
        View root = wVarB.getRoot();
        Context context2 = wVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f0.a(root, initialRendering, initialViewEnvironment, new a(new u(context2, wVarB, wVarB.getCameraController(), h0Var, trackingEventsLogger)));
        return wVarB.getRoot();
    }

    @Override // nn.b0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull y3.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f36936a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // nn.b0
    @NotNull
    public xu.c<? super y3.b> getType() {
        return this.f36936a.getType();
    }
}
