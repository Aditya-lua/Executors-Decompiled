package wo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import nn.ViewEnvironment;
import nn.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lwo/c0;", "Lnn/k;", "Lvo/y3$a;", "Lwo/d0;", "viewController", "<init>", "(Lwo/d0;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "b", "(Lvo/y3$a;Lnn/z;)V", "Lwo/d0;", "c", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements nn.k<y3.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d0 viewController;

    /* JADX INFO: renamed from: wo.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwo/c0$a;", "Lnn/b0;", "Lvo/y3$a;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lvo/y3$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<y3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<y3.a> f35928a;

        /* JADX INFO: renamed from: wo.c0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0742a extends p001kotlin.jvm.internal.k implements Function2<y3.a, ViewEnvironment, Unit> {
            public C0742a(Object obj) {
                super(2, obj, c0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(y3.a p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((c0) this.receiver).a(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(y3.a aVar, ViewEnvironment viewEnvironment) {
                d(aVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: wo.c0$a$b */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"wo/c0$a$b", "Lwo/d0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lwo/d0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lwo/d0;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements d0.a {
            @Override // wo.d0.a
            public d0 a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new z(context, container);
            }
        }

        /* JADX INFO: renamed from: wo.c0$a$c */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f35929a;

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
                f35929a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(y3.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            ko.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            ko.a.C0404a c0404aC = ko.a.f21493a.c(d0.a.class, new b());
            int i10 = c.f35929a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = ko.d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new zt.l();
                }
                dVar = ko.d.K0000SelectCountryAndIdClass;
            }
            d0 d0VarA = ((d0.a) c0404aC.a(dVar)).a(context, viewGroup);
            f0.a(d0VarA.getRoot(), initialRendering, initialViewEnvironment, new C0742a(new c0(d0VarA)));
            return d0VarA.getRoot();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull y3.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f35928a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super y3.a> getType() {
            return this.f35928a.getType();
        }

        public Companion() {
            this.f35928a = new nn.f<>(p001kotlin.jvm.internal.d0.b(y3.a.class), new pu.o() { // from class: wo.b0
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return c0.Companion.c((y3.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public c0(@NotNull d0 viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    @Override // nn.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull y3.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.viewController.b(viewEnvironment, rendering);
    }
}
