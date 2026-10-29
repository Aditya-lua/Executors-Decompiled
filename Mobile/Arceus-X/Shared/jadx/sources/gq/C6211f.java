package gq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
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
import p498vq.C12247a;
import p498vq.C12249c;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p584yp.EnumC13272a;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: gq.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lgq/f;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lgq/g;", "viewController", "<init>", "(Lgq/g;)V", "rendering", "Lan/y;", "viewEnvironment", "", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lan/y;)V", "Lvq/a;", "systemUiController", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lvq/a;)V", "Lgq/g;", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6211f implements InterfaceC0382k<SelfieWorkflow.AbstractC3928c.g> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6212g viewController;

    /* JADX INFO: renamed from: gq.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lgq/f$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.g> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<SelfieWorkflow.AbstractC3928c.g> f23631a;

        /* JADX INFO: renamed from: gq.f$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14172a extends C7744k implements Function2<SelfieWorkflow.AbstractC3928c.g, ViewEnvironment, Unit> {
            public C14172a(Object obj) {
                super(2, obj, C6211f.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m27341d(SelfieWorkflow.AbstractC3928c.g p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((C6211f) this.receiver).mo1442a(p8, p10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.AbstractC3928c.g gVar, ViewEnvironment viewEnvironment) {
                m27341d(gVar, viewEnvironment);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: gq.f$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f23632a;

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
                f23632a = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: gq.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static final View m27338d(SelfieWorkflow.AbstractC3928c.g initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            EnumC12498d enumC12498d;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC6212g.a.class, new InterfaceC6212g.a() { // from class: gq.e
                @Override // gq.InterfaceC6212g.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC6212g mo24079a(Context context2, ViewGroup viewGroup2) {
                    return C6211f.Companion.m27339e(context2, viewGroup2);
                }
            });
            int i10 = b.f23632a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1 || i10 == 2) {
                enumC12498d = EnumC12498d.DefaultSelfie;
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                enumC12498d = EnumC12498d.K0000SelfieSubmitting;
            }
            InterfaceC6212g interfaceC6212gMo24079a = ((InterfaceC6212g.a) aVarM46814c.m46815a(enumC12498d)).mo24079a(context, viewGroup);
            C0372e0.m1408a(interfaceC6212gMo24079a.getRoot(), initialRendering, initialViewEnvironment, new C14172a(new C6211f(interfaceC6212gMo24079a)));
            return interfaceC6212gMo24079a.getRoot();
        }

        /* JADX INFO: renamed from: e */
        public static final InterfaceC6212g m27339e(Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C6208c(context, viewGroup);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull SelfieWorkflow.AbstractC3928c.g initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f23631a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super SelfieWorkflow.AbstractC3928c.g> getType() {
            return this.f23631a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f23631a = new C0373f<>(C7731d0.m32002b(SelfieWorkflow.AbstractC3928c.g.class), new InterfaceC14058o() { // from class: gq.d
                @Override // p615zt.InterfaceC14058o
                /* JADX INFO: renamed from: e */
                public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return C6211f.Companion.m27338d((SelfieWorkflow.AbstractC3928c.g) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public C6211f(@NotNull InterfaceC6212g viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.mo27331a();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull SelfieWorkflow.AbstractC3928c.g rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        m27335c(rendering, C12249c.m45392a(viewEnvironment));
    }

    /* JADX INFO: renamed from: c */
    public final void m27335c(@NotNull SelfieWorkflow.AbstractC3928c.g rendering, @Nullable C12247a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.viewController.mo27332b(systemUiController, rendering.getSdkFilesManager(), rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String(), rendering.getDescription(), rendering.getPendingPageTextVerticalPosition(), rendering.getCustomLoadingAsset(), rendering.getNavBarTitle(), rendering.getNavigationState(), rendering.getStyles(), rendering.m19917g(), rendering.m19918h(), rendering.getCenterSelfieFilePath(), rendering.getUploadScanningHintText(), rendering.getRecoverableSubmitError(), rendering.m19919i());
    }
}
