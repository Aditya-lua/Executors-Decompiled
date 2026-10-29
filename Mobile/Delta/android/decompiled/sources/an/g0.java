package an;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\n\u0010B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00028\u00008 X¡\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00028\u0000`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lan/g0;", "", "RenderingT", "<init>", "()V", "c", "()Ljava/lang/Object;", "getShowing$annotations", "showing", "Lan/y;", "a", "()Lan/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "b", "()Lkotlin/jvm/functions/Function2;", "showRendering", "Lan/g0$a;", "Lan/g0$b;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class g0<RenderingT> {

    /* JADX INFO: renamed from: an.g0$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B;\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lan/g0$b;", "", "RenderingT", "Lan/g0;", "showing", "Lan/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "<init>", "(Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lan/y;", "()Lan/y;", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Started<RenderingT> extends g0<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RenderingT showing;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ViewEnvironment environment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function2<RenderingT, ViewEnvironment, Unit> showRendering;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Started(@NotNull RenderingT showing, @NotNull ViewEnvironment environment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering) {
            super(null);
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
        }

        @Override // an.g0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // an.g0
        @NotNull
        public Function2<RenderingT, ViewEnvironment, Unit> b() {
            return this.showRendering;
        }

        @Override // an.g0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public RenderingT c() {
            return this.showing;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return Intrinsics.c(c(), started.c()) && Intrinsics.c(getEnvironment(), started.getEnvironment()) && Intrinsics.c(b(), started.b());
        }

        public int hashCode() {
            return (((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode();
        }

        @NotNull
        public String toString() {
            return "Started(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + ')';
        }
    }

    public /* synthetic */ g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract ViewEnvironment getEnvironment();

    @NotNull
    public abstract Function2<RenderingT, ViewEnvironment, Unit> b();

    @NotNull
    public abstract RenderingT c();

    /* JADX INFO: renamed from: an.g0$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BQ\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lan/g0$a;", "", "RenderingT", "Lan/g0;", "showing", "Lan/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "Lkotlin/Function1;", "Landroid/view/View;", "starter", "<init>", "(Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "d", "(Ljava/lang/Object;Lan/y;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lan/g0$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "Lan/y;", "()Lan/y;", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class New<RenderingT> extends g0<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RenderingT showing;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ViewEnvironment environment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function2<RenderingT, ViewEnvironment, Unit> showRendering;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function1<View, Unit> starter;

        /* JADX INFO: renamed from: an.g0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\n\b\u0001\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
        public static final class C0010a extends kotlin.jvm.internal.m implements Function1<View, Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final C0010a f709i = new C0010a();

            public C0010a() {
                super(1);
            }

            public final void a(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                g0<?> g0VarD = h0.d(view);
                Object objC = g0VarD == null ? null : g0VarD.c();
                Object obj = objC != null ? objC : null;
                Intrinsics.checkNotNull(obj);
                ViewEnvironment viewEnvironmentC = e0.c(view);
                Intrinsics.checkNotNull(viewEnvironmentC);
                e0.g(view, obj, viewEnvironmentC);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                a(view);
                return Unit.f22483a;
            }
        }

        public /* synthetic */ New(Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, function2, (i10 & 8) != 0 ? C0010a.f709i : function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ New e(New r8, Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = r8.c();
            }
            if ((i10 & 2) != 0) {
                viewEnvironment = r8.getEnvironment();
            }
            if ((i10 & 4) != 0) {
                function2 = r8.b();
            }
            if ((i10 & 8) != 0) {
                function1 = r8.starter;
            }
            return r8.d(obj, viewEnvironment, function2, function1);
        }

        @Override // an.g0
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // an.g0
        @NotNull
        public Function2<RenderingT, ViewEnvironment, Unit> b() {
            return this.showRendering;
        }

        @NotNull
        public final New<RenderingT> d(@NotNull RenderingT showing, @NotNull ViewEnvironment environment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering, @NotNull Function1<? super View, Unit> starter) {
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            Intrinsics.checkNotNullParameter(starter, "starter");
            return new New<>(showing, environment, showRendering, starter);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r8 = (New) other;
            return Intrinsics.c(c(), r8.c()) && Intrinsics.c(getEnvironment(), r8.getEnvironment()) && Intrinsics.c(b(), r8.b()) && Intrinsics.c(this.starter, r8.starter);
        }

        @Override // an.g0
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public RenderingT c() {
            return this.showing;
        }

        @NotNull
        public final Function1<View, Unit> g() {
            return this.starter;
        }

        public int hashCode() {
            return (((((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode()) * 31) + this.starter.hashCode();
        }

        @NotNull
        public String toString() {
            return "New(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + ", starter=" + this.starter + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public New(@NotNull RenderingT showing, @NotNull ViewEnvironment environment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering, @NotNull Function1<? super View, Unit> starter) {
            super(null);
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            Intrinsics.checkNotNullParameter(starter, "starter");
            this.showing = showing;
            this.environment = environment;
            this.showRendering = showRendering;
            this.starter = starter;
        }
    }

    public g0() {
    }
}
