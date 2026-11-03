package ro;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import go.OverlayAssets;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lro/q;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lro/k;", "viewController", "<init>", "(Lro/k;)V", "rendering", "Lym/y;", "viewEnvironment", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lym/y;)V", "b", "Lro/k;", "c", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements ym.k<Screen.h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final k viewController;

    /* JADX INFO: renamed from: ro.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lro/q$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<Screen.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ym.f<Screen.h> f30867a;

        /* JADX INFO: renamed from: ro.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0540a extends kotlin.jvm.internal.k implements Function2<Screen.h, ViewEnvironment, Unit> {
            public C0540a(Object obj) {
                super(2, obj, q.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(Screen.h p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((q) this.receiver).b(p8, p10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Screen.h hVar, ViewEnvironment viewEnvironment) {
                d(hVar, viewEnvironment);
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: ro.q$a$b */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ro/q$a$b", "Lro/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lro/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lro/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements k.a {
            @Override // ro.k.a
            public k a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new j(context, container);
            }
        }

        /* JADX INFO: renamed from: ro.q$a$c */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30868a;

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
                f30868a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(Screen.h initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            un.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            un.a.C0599a c0599aC = un.a.f33136a.c(k.a.class, new b());
            int i10 = c.f30868a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = un.d.DefaultGovIdReview;
            } else {
                if (i10 != 2) {
                    throw new gt.l();
                }
                dVar = un.d.K0000GovIdReview;
            }
            k kVarA = ((k.a) c0599aC.a(dVar)).a(context, viewGroup);
            e0.a(kVarA.getRoot(), initialRendering, initialViewEnvironment, new C0540a(new q(kVarA)));
            return kVarA.getRoot();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.h initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f30867a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super Screen.h> getType() {
            return this.f30867a.getType();
        }

        public Companion() {
            this.f30867a = new ym.f<>(d0.b(Screen.h.class), new xt.o() { // from class: ro.p
                @Override // xt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return q.Companion.c((Screen.h) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public q(@NotNull k viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    public static final Unit g(Screen.h hVar) {
        hVar.c().invoke();
        return Unit.f22938a;
    }

    public static final Unit h(Screen.h hVar) {
        hVar.u().invoke();
        return Unit.f22938a;
    }

    public static final Unit i(Screen.h hVar) {
        hVar.g().invoke();
        return Unit.f22938a;
    }

    public static final Unit j(Screen.h hVar) {
        hVar.s().invoke();
        return Unit.f22938a;
    }

    @Override // ym.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.h rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        k kVar = this.viewController;
        s imageLoader = rendering.getImageLoader();
        String imagePath = rendering.getImagePath();
        String message = rendering.getMessage();
        String disclaimer = rendering.getDisclaimer();
        String acceptText = rendering.getAcceptText();
        String retryText = rendering.getRetryText();
        String confirmCaptureTitle = rendering.getConfirmCaptureTitle();
        Screen.Overlay overlay = rendering.getOverlay();
        Context context = this.viewController.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayAssets overlayAssetsB = com.withpersona.sdk2.inquiry.governmentid.o.b(context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        kVar.b(viewEnvironment, imageLoader, imagePath, message, disclaimer, acceptText, retryText, confirmCaptureTitle, overlay, overlayAssetsB, assetConfig != null ? com.withpersona.sdk2.inquiry.governmentid.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, rendering.getNavigationState(), rendering.getIsEnabled(), rendering.getIsAutoClassifying(), rendering.getStyles(), rendering.getError(), rendering.getReviewCaptureButtonsAxis(), rendering.getNavBarTitle(), new Function0() { // from class: ro.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.g(rendering);
            }
        }, new Function0() { // from class: ro.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.h(rendering);
            }
        }, new Function0() { // from class: ro.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.i(rendering);
            }
        }, new Function0() { // from class: ro.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.j(rendering);
            }
        });
    }
}
