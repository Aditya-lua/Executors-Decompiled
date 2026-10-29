package to;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.C3536a;
import com.withpersona.sdk2.inquiry.governmentid.C3571o;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import hu.InterfaceC6567c;
import io.EnumC6852d;
import io.OverlayAssets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p229jt.C7345l;
import p239k6.InterfaceC7479s;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: to.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m31665d2 = {"Lto/q;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lto/k;", "viewController", "<init>", "(Lto/k;)V", "rendering", "Lan/y;", "viewEnvironment", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lan/y;)V", "b", "Lto/k;", "c", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11731q implements InterfaceC0382k<Screen.C3533h> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11725k viewController;

    /* JADX INFO: renamed from: to.q$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lto/q$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<Screen.C3533h> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<Screen.C3533h> f41388a;

        /* JADX INFO: renamed from: to.q$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14264a extends C7744k implements Function2<Screen.C3533h, ViewEnvironment, Unit> {
            public C14264a(Object obj) {
                super(2, obj, C11731q.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m43944d(Screen.C3533h p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((C11731q) this.receiver).mo1442a(p8, p10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Screen.C3533h c3533h, ViewEnvironment viewEnvironment) {
                m43944d(c3533h, viewEnvironment);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: to.q$a$b */
        @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"to/q$a$b", "Lto/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lto/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lto/k;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC11725k.a {
            @Override // to.InterfaceC11725k.a
            /* JADX INFO: renamed from: a */
            public InterfaceC11725k mo17792a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new C11724j(context, container);
            }
        }

        /* JADX INFO: renamed from: to.q$a$c */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f41389a;

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
                f41389a = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: to.q.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final View m43942c(Screen.C3533h initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            EnumC12498d enumC12498d;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC11725k.a.class, new b());
            int i10 = c.f41389a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                enumC12498d = EnumC12498d.DefaultGovIdReview;
            } else {
                if (i10 != 2) {
                    throw new C7345l();
                }
                enumC12498d = EnumC12498d.K0000GovIdReview;
            }
            InterfaceC11725k interfaceC11725kMo17792a = ((InterfaceC11725k.a) aVarM46814c.m46815a(enumC12498d)).mo17792a(context, viewGroup);
            C0372e0.m1408a(interfaceC11725kMo17792a.getRoot(), initialRendering, initialViewEnvironment, new C14264a(new C11731q(interfaceC11725kMo17792a)));
            return interfaceC11725kMo17792a.getRoot();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull Screen.C3533h initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f41388a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super Screen.C3533h> getType() {
            return this.f41388a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f41388a = new C0373f<>(C7731d0.m32002b(Screen.C3533h.class), new InterfaceC14058o() { // from class: to.p
                @Override // p615zt.InterfaceC14058o
                /* JADX INFO: renamed from: e */
                public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return C11731q.Companion.m43942c((Screen.C3533h) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public C11731q(@NotNull InterfaceC11725k viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.mo43926a();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m43936g(Screen.C3533h c3533h) {
        c3533h.m17446c().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m43937h(Screen.C3533h c3533h) {
        c3533h.m17464u().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m43938i(Screen.C3533h c3533h) {
        c3533h.m17450g().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m43939j(Screen.C3533h c3533h) {
        c3533h.m17462s().invoke();
        return Unit.f29331a;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3533h rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        InterfaceC11725k interfaceC11725k = this.viewController;
        InterfaceC7479s imageLoader = rendering.getImageLoader();
        String imagePath = rendering.getImagePath();
        String message = rendering.getMessage();
        String disclaimer = rendering.getDisclaimer();
        String acceptText = rendering.getAcceptText();
        String retryText = rendering.getRetryText();
        String confirmCaptureTitle = rendering.getConfirmCaptureTitle();
        Screen.Overlay overlay = rendering.getOverlay();
        Context context = this.viewController.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayAssets overlayAssetsM17730b = C3571o.m17730b(context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        interfaceC11725k.mo43927b(viewEnvironment, imageLoader, imagePath, message, disclaimer, acceptText, retryText, confirmCaptureTitle, overlay, overlayAssetsM17730b, assetConfig != null ? C3536a.m17498a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, rendering.getNavigationState(), rendering.getIsEnabled(), rendering.getIsAutoClassifying(), rendering.getStyles(), rendering.getError(), rendering.getReviewCaptureButtonsAxis(), rendering.getNavBarTitle(), new Function0() { // from class: to.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11731q.m43936g(rendering);
            }
        }, new Function0() { // from class: to.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11731q.m43937h(rendering);
            }
        }, new Function0() { // from class: to.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11731q.m43938i(rendering);
            }
        }, new Function0() { // from class: to.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11731q.m43939j(rendering);
            }
        });
    }
}
