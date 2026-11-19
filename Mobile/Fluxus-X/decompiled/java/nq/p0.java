package nq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import mq.q5;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.b1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lnq/p0;", "Lnn/b0;", "Lmq/q5$d$a;", "Lsn/t;", "cameraPreview", "Ltt/a;", "Lsn/b1;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lto/e;", "featureFlagManager", "<init>", "(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;)V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lmq/q5$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "b", "Lsn/t;", "c", "Ltt/a;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "e", "Lto/e;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements nn.b0<q5.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nn.f<q5.d.a> f26558a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sn.t cameraPreview;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tt.a<b1> selfieDirectionFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function2<q5.d.a, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, k0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(q5.d.a p8, ViewEnvironment p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((k0) this.receiver).a(p8, p10);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(q5.d.a aVar, ViewEnvironment viewEnvironment) {
            d(aVar, viewEnvironment);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26562a;

        static {
            int[] iArr = new int[mq.c.values().length];
            try {
                iArr[mq.c.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq.c.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq.c.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26562a = iArr;
        }
    }

    public p0(@NotNull final sn.t cameraPreview, @NotNull final tt.a<b1> selfieDirectionFeed, @NotNull final TrackingEventsLogger trackingEventsLogger, @NotNull final to.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.f26558a = new nn.f<>(p001kotlin.jvm.internal.d0.b(q5.d.a.class), new pu.o() { // from class: nq.n0
            @Override // pu.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return p0.d(cameraPreview, selfieDirectionFeed, trackingEventsLogger, featureFlagManager, (q5.d.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.featureFlagManager = featureFlagManager;
    }

    public static final View d(sn.t tVar, tt.a aVar, TrackingEventsLogger trackingEventsLogger, to.e eVar, q5.d.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        ko.d dVar;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        ko.a.C0404a c0404aC = ko.a.f21493a.c(r0.a.class, new r0.a() { // from class: nq.o0
            @Override // nq.r0.a
            public final r0 a(Context context2, ViewGroup viewGroup2) {
                return p0.e(context2, viewGroup2);
            }
        });
        int i10 = b.f26562a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            dVar = ko.d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            dVar = ko.d.K0000SelfieCapture;
        }
        r0 r0VarA = ((r0.a) c0404aC.a(dVar)).a(context, viewGroup);
        jr.c.b(initialViewEnvironment, context, l2.b.c(context, mq.u.f24097a));
        View root = r0VarA.getRoot();
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        nn.f0.a(root, initialRendering, initialViewEnvironment, new a(new k0(context, r0VarA, tVar, (b1) obj, trackingEventsLogger, eVar.a(to.a0.f32602a))));
        return r0VarA.getRoot();
    }

    public static final r0 e(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q(context, viewGroup);
    }

    @Override // nn.b0
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull q5.d.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f26558a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // nn.b0
    @NotNull
    public xu.c<? super q5.d.a> getType() {
        return this.f26558a.getType();
    }
}
