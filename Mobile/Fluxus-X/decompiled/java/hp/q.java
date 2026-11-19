package hp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import l6.s;
import nn.ViewEnvironment;
import nn.b0;
import nn.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import vo.OverlayAssets;
import vo.g3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lhp/q;", "Lnn/k;", "Lvo/y3$i;", "Lhp/k;", "viewController", "<init>", "(Lhp/k;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "f", "(Lvo/y3$i;Lnn/z;)V", "b", "Lhp/k;", "c", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements nn.k<y3.i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final k viewController;

    /* JADX INFO: renamed from: hp.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhp/q$a;", "Lnn/b0;", "Lvo/y3$i;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lvo/y3$i;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<y3.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<y3.i> f18479a;

        /* JADX INFO: renamed from: hp.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0352a extends p001kotlin.jvm.internal.k implements Function2<y3.i, ViewEnvironment, Unit> {
            public C0352a(Object obj) {
                super(2, obj, q.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(y3.i p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((q) this.receiver).a(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(y3.i iVar, ViewEnvironment viewEnvironment) {
                d(iVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: hp.q$a$b */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"hp/q$a$b", "Lhp/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lhp/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lhp/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements k.a {
            @Override // hp.k.a
            public k a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new j(context, container);
            }
        }

        /* JADX INFO: renamed from: hp.q$a$c */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18480a;

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
                f18480a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(y3.i initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            ko.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            ko.a.C0404a c0404aC = ko.a.f21493a.c(k.a.class, new b());
            int i10 = c.f18480a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = ko.d.DefaultGovIdReview;
            } else {
                if (i10 != 2) {
                    throw new zt.l();
                }
                dVar = ko.d.K0000GovIdReview;
            }
            k kVarA = ((k.a) c0404aC.a(dVar)).a(context, viewGroup);
            f0.a(kVarA.getRoot(), initialRendering, initialViewEnvironment, new C0352a(new q(kVarA)));
            return kVarA.getRoot();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.i initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f18479a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.i> getType() {
            return this.f18479a.getType();
        }

        public Companion() {
            this.f18479a = new nn.f<>(d0.b(y3.i.class), new pu.o() { // from class: hp.p
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return q.Companion.c((y3.i) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public q(@NotNull k viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    public static final Unit g(y3.i iVar) {
        iVar.c().invoke();
        return Unit.f21506a;
    }

    public static final Unit h(y3.i iVar) {
        iVar.u().invoke();
        return Unit.f21506a;
    }

    public static final Unit i(y3.i iVar) {
        iVar.g().invoke();
        return Unit.f21506a;
    }

    public static final Unit j(y3.i iVar) {
        iVar.s().invoke();
        return Unit.f21506a;
    }

    @Override // nn.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.i rendering, @NotNull ViewEnvironment viewEnvironment) {
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
        y3.f overlay = rendering.getOverlay();
        Context context = this.viewController.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayAssets overlayAssetsB = g3.b(context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        kVar.b(viewEnvironment, imageLoader, imagePath, message, disclaimer, acceptText, retryText, confirmCaptureTitle, overlay, overlayAssetsB, assetConfig != null ? vo.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, rendering.getNavigationState(), rendering.getIsEnabled(), rendering.getIsAutoClassifying(), rendering.getStyles(), rendering.getError(), rendering.getReviewCaptureButtonsAxis(), rendering.getNavBarTitle(), new Function0() { // from class: hp.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.g(rendering);
            }
        }, new Function0() { // from class: hp.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.h(rendering);
            }
        }, new Function0() { // from class: hp.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.i(rendering);
            }
        }, new Function0() { // from class: hp.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.j(rendering);
            }
        });
    }
}
