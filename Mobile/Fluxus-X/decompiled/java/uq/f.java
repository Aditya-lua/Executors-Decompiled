package uq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import mq.q5;
import nn.ViewEnvironment;
import nn.b0;
import nn.f0;
import nn.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import pu.o;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Luq/f;", "Lnn/k;", "Lmq/q5$d$g;", "Luq/g;", "viewController", "<init>", "(Luq/g;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "c", "(Lmq/q5$d$g;Lnn/z;)V", "Ljr/a;", "systemUiController", "b", "(Lmq/q5$d$g;Ljr/a;)V", "Luq/g;", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements k<q5.d.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g viewController;

    /* JADX INFO: renamed from: uq.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Luq/f$a;", "Lnn/b0;", "Lmq/q5$d$g;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lmq/q5$d$g;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<q5.d.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<q5.d.g> f33841a;

        /* JADX INFO: renamed from: uq.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0691a extends p001kotlin.jvm.internal.k implements Function2<q5.d.g, ViewEnvironment, Unit> {
            public C0691a(Object obj) {
                super(2, obj, f.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(q5.d.g p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((f) this.receiver).a(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(q5.d.g gVar, ViewEnvironment viewEnvironment) {
                d(gVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: uq.f$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33842a;

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
                f33842a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View d(q5.d.g initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            ko.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            ko.a.C0404a c0404aC = ko.a.f21493a.c(g.a.class, new g.a() { // from class: uq.e
                @Override // uq.g.a
                public final g a(Context context2, ViewGroup viewGroup2) {
                    return f.Companion.e(context2, viewGroup2);
                }
            });
            int i10 = b.f33842a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1 || i10 == 2) {
                dVar = ko.d.DefaultSelfie;
            } else {
                if (i10 != 3) {
                    throw new l();
                }
                dVar = ko.d.K0000SelfieSubmitting;
            }
            g gVarA = ((g.a) c0404aC.a(dVar)).a(context, viewGroup);
            f0.a(gVarA.getRoot(), initialRendering, initialViewEnvironment, new C0691a(new f(gVarA)));
            return gVarA.getRoot();
        }

        public static final g e(Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context, viewGroup);
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull q5.d.g initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f33841a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super q5.d.g> getType() {
            return this.f33841a.getType();
        }

        public Companion() {
            this.f33841a = new nn.f<>(d0.b(q5.d.g.class), new o() { // from class: uq.d
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return f.Companion.d((q5.d.g) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public f(@NotNull g viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    public final void b(@NotNull q5.d.g rendering, @Nullable jr.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.viewController.b(systemUiController, rendering.getSdkFilesManager(), rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String(), rendering.getDescription(), rendering.getPendingPageTextVerticalPosition(), rendering.getCustomLoadingAsset(), rendering.getNavBarTitle(), rendering.getNavigationState(), rendering.getStyles(), rendering.g(), rendering.h(), rendering.getCenterSelfieFilePath(), rendering.getUploadScanningHintText(), rendering.getRecoverableSubmitError(), rendering.i());
    }

    @Override // nn.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull q5.d.g rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        b(rendering, jr.c.a(viewEnvironment));
    }
}
