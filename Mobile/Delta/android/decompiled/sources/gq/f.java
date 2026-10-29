package gq;

import an.ViewEnvironment;
import an.a0;
import an.e0;
import an.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import jt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgq/f;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lgq/g;", "viewController", "<init>", "(Lgq/g;)V", "rendering", "Lan/y;", "viewEnvironment", "", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lan/y;)V", "Lvq/a;", "systemUiController", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lvq/a;)V", "Lgq/g;", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements k<SelfieWorkflow.c.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g viewController;

    /* JADX INFO: renamed from: gq.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgq/f$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<SelfieWorkflow.c.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ an.f<SelfieWorkflow.c.g> f18372a;

        /* JADX INFO: renamed from: gq.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0331a extends kotlin.jvm.internal.k implements Function2<SelfieWorkflow.c.g, ViewEnvironment, Unit> {
            public C0331a(Object obj) {
                super(2, obj, f.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(SelfieWorkflow.c.g p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((f) this.receiver).a(p8, p10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.c.g gVar, ViewEnvironment viewEnvironment) {
                d(gVar, viewEnvironment);
                return Unit.f22483a;
            }
        }

        /* JADX INFO: renamed from: gq.f$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18373a;

            static {
                int[] iArr = new int[yp.a.values().length];
                try {
                    iArr[yp.a.V0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yp.a.V1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yp.a.K0000.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f18373a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View d(SelfieWorkflow.c.g initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            wn.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            wn.a.C0631a c0631aC = wn.a.f34452a.c(g.a.class, new g.a() { // from class: gq.e
                @Override // gq.g.a
                public final g a(Context context2, ViewGroup viewGroup2) {
                    return f.Companion.e(context2, viewGroup2);
                }
            });
            int i10 = b.f18373a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1 || i10 == 2) {
                dVar = wn.d.DefaultSelfie;
            } else {
                if (i10 != 3) {
                    throw new l();
                }
                dVar = wn.d.K0000SelfieSubmitting;
            }
            g gVarA = ((g.a) c0631aC.a(dVar)).a(context, viewGroup);
            e0.a(gVarA.getRoot(), initialRendering, initialViewEnvironment, new C0331a(new f(gVarA)));
            return gVarA.getRoot();
        }

        public static final g e(Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context, viewGroup);
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.g initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f18372a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super SelfieWorkflow.c.g> getType() {
            return this.f18372a.getType();
        }

        public Companion() {
            this.f18372a = new an.f<>(d0.b(SelfieWorkflow.c.g.class), new o() { // from class: gq.d
                @Override // zt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return f.Companion.d((SelfieWorkflow.c.g) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public f(@NotNull g viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    @Override // an.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull SelfieWorkflow.c.g rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        c(rendering, vq.c.a(viewEnvironment));
    }

    public final void c(@NotNull SelfieWorkflow.c.g rendering, @Nullable vq.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.viewController.b(systemUiController, rendering.getSdkFilesManager(), rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String(), rendering.getDescription(), rendering.getPendingPageTextVerticalPosition(), rendering.getCustomLoadingAsset(), rendering.getNavBarTitle(), rendering.getNavigationState(), rendering.getStyles(), rendering.g(), rendering.h(), rendering.getCenterSelfieFilePath(), rendering.getUploadScanningHintText(), rendering.getRecoverableSubmitError(), rendering.i());
    }
}
