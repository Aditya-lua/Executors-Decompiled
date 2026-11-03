package ho;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lho/b0;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lho/c0;", "viewController", "<init>", "(Lho/c0;)V", "rendering", "Lym/y;", "viewEnvironment", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lym/y;)V", "b", "Lho/c0;", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements ym.k<Screen.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c0 viewController;

    /* JADX INFO: renamed from: ho.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lho/b0$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements ym.a0<Screen.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ym.f<Screen.a> f19550a;

        /* JADX INFO: renamed from: ho.b0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0346a extends kotlin.jvm.internal.k implements Function2<Screen.a, ViewEnvironment, Unit> {
            public C0346a(Object obj) {
                super(2, obj, b0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(Screen.a p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((b0) this.receiver).b(p8, p10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Screen.a aVar, ViewEnvironment viewEnvironment) {
                d(aVar, viewEnvironment);
                return Unit.f22938a;
            }
        }

        /* JADX INFO: renamed from: ho.b0$a$b */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ho/b0$a$b", "Lho/c0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lho/c0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lho/c0;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements c0.a {
            @Override // ho.c0.a
            public c0 a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new y(context, container);
            }
        }

        /* JADX INFO: renamed from: ho.b0$a$c */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19551a;

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
                f19551a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(Screen.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            un.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            un.a.C0599a c0599aC = un.a.f33136a.c(c0.a.class, new b());
            int i10 = c.f19551a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = un.d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new gt.l();
                }
                dVar = un.d.K0000SelectCountryAndIdClass;
            }
            c0 c0VarA = ((c0.a) c0599aC.a(dVar)).a(context, viewGroup);
            e0.a(c0VarA.getRoot(), initialRendering, initialViewEnvironment, new C0346a(new b0(c0VarA)));
            return c0VarA.getRoot();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f19550a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super Screen.a> getType() {
            return this.f19550a.getType();
        }

        public Companion() {
            this.f19550a = new ym.f<>(d0.b(Screen.a.class), new xt.o() { // from class: ho.a0
                @Override // xt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return b0.Companion.c((Screen.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public b0(@NotNull c0 viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    @Override // ym.k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull Screen.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.viewController.b(viewEnvironment, rendering);
    }
}
