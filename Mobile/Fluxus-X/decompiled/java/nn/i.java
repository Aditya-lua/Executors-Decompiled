package nn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lnn/i;", BuildConfig.FLAVOR, "OuterT", "InnerT", "Lnn/b0;", "Lxu/c;", Payload.TYPE, "Lkotlin/Function2;", "Lnn/z;", "Lkotlin/Pair;", "map", "Lnn/g0;", "viewStarter", "Lkotlin/Function4;", "Landroid/view/View;", BuildConfig.FLAVOR, "Lcom/squareup/workflow1/ui/ViewShowRendering;", "doShowRendering", "<init>", "(Lxu/c;Lkotlin/jvm/functions/Function2;Lnn/g0;Lpu/o;)V", "Lkotlin/Function1;", "(Lxu/c;Lkotlin/jvm/functions/Function1;Lnn/g0;Lpu/o;)V", "initialRendering", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lnn/g0;", "d", "Lpu/o;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class i<OuterT, InnerT> implements b0<OuterT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xu.c<OuterT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<OuterT, ViewEnvironment, Pair<InnerT, ViewEnvironment>> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final g0 viewStarter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pu.o<View, Function2<? super InnerT, ? super ViewEnvironment, Unit>, OuterT, ViewEnvironment, Unit> doShowRendering;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00028\u0001`\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {BuildConfig.FLAVOR, "OuterT", "InnerT", "Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/Function2;", "Lnn/z;", BuildConfig.FLAVOR, "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnn/z;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements pu.o<View, Function2<? super InnerT, ? super ViewEnvironment, ? extends Unit>, OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<OuterT, InnerT> f25863i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super OuterT, ? extends InnerT> function1) {
            super(4);
            this.f25863i = function1;
        }

        public final void a(@NotNull View noName_0, @NotNull Function2<? super InnerT, ? super ViewEnvironment, Unit> innerShowRendering, @NotNull OuterT outerRendering, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
            Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            innerShowRendering.invoke(this.f25863i.invoke(outerRendering), viewEnvironment);
        }

        @Override // pu.o
        public /* bridge */ /* synthetic */ Unit e(View view, Object obj, Object obj2, ViewEnvironment viewEnvironment) {
            a(view, (Function2) obj, obj2, viewEnvironment);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {BuildConfig.FLAVOR, "OuterT", "InnerT", "outer", "Lnn/z;", "viewEnvironment", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;Lnn/z;)Lkotlin/Pair;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends p001kotlin.jvm.internal.m implements Function2<OuterT, ViewEnvironment, Pair<? extends InnerT, ? extends ViewEnvironment>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<OuterT, InnerT> f25864i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super OuterT, ? extends InnerT> function1) {
            super(2);
            this.f25864i = function1;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<InnerT, ViewEnvironment> invoke(@NotNull OuterT outer, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(outer, "outer");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            return new Pair<>(this.f25864i.invoke(outer), viewEnvironment);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {BuildConfig.FLAVOR, "OuterT", "InnerT", "rendering", "Lnn/z;", "env", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Lnn/z;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function2<OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ i<OuterT, InnerT> f25865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View f25866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<InnerT, ViewEnvironment, Unit> f25867k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i<OuterT, InnerT> iVar, View view, Function2<? super InnerT, ? super ViewEnvironment, Unit> function2) {
            super(2);
            this.f25865i = iVar;
            this.f25866j = view;
            this.f25867k = function2;
        }

        public final void a(@NotNull OuterT rendering, @NotNull ViewEnvironment env) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Intrinsics.checkNotNullParameter(env, "env");
            this.f25865i.doShowRendering.e(this.f25866j, this.f25867k, rendering, env);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull xu.c<OuterT> type, @NotNull Function2<? super OuterT, ? super ViewEnvironment, ? extends Pair<? extends InnerT, ViewEnvironment>> map, @Nullable g0 g0Var, @NotNull pu.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
        this.type = type;
        this.map = map;
        this.viewStarter = g0Var;
        this.doShowRendering = doShowRendering;
    }

    @Override // nn.b0
    @NotNull
    public View a(@NotNull OuterT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        Pair<InnerT, ViewEnvironment> pairInvoke = this.map.invoke(initialRendering, initialViewEnvironment);
        InnerT innertA = pairInvoke.a();
        ViewEnvironment viewEnvironmentB = pairInvoke.b();
        View viewC = e0.c((d0) viewEnvironmentB.a(d0.INSTANCE), innertA, viewEnvironmentB, contextForNewView, container, this.viewStarter);
        Function2 function2D = f0.d(viewC);
        Intrinsics.checkNotNull(function2D);
        f0.a(viewC, initialRendering, viewEnvironmentB, new c(this, viewC, function2D));
        return viewC;
    }

    @Override // nn.b0
    @NotNull
    public xu.c<OuterT> getType() {
        return this.type;
    }

    public /* synthetic */ i(xu.c cVar, Function1 function1, g0 g0Var, pu.o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, function1, (i10 & 4) != 0 ? null : g0Var, (i10 & 8) != 0 ? new a(function1) : oVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull xu.c<OuterT> type, @NotNull Function1<? super OuterT, ? extends InnerT> map, @Nullable g0 g0Var, @NotNull pu.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        this(type, new b(map), g0Var, doShowRendering);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
    }
}
