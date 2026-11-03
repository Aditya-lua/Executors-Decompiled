package ym;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lym/i;", "", "OuterT", "InnerT", "Lym/a0;", "Lfu/c;", Payload.TYPE, "Lkotlin/Function2;", "Lym/y;", "Lkotlin/Pair;", "map", "Lym/f0;", "viewStarter", "Lkotlin/Function4;", "Landroid/view/View;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "doShowRendering", "<init>", "(Lfu/c;Lkotlin/jvm/functions/Function2;Lym/f0;Lxt/o;)V", "Lkotlin/Function1;", "(Lfu/c;Lkotlin/jvm/functions/Function1;Lym/f0;Lxt/o;)V", "initialRendering", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lym/f0;", "d", "Lxt/o;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class i<OuterT, InnerT> implements a0<OuterT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fu.c<OuterT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<OuterT, ViewEnvironment, Pair<InnerT, ViewEnvironment>> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final f0 viewStarter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xt.o<View, Function2<? super InnerT, ? super ViewEnvironment, Unit>, OuterT, ViewEnvironment, Unit> doShowRendering;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00028\u0001`\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "OuterT", "InnerT", "Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/Function2;", "Lym/y;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lym/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements xt.o<View, Function2<? super InnerT, ? super ViewEnvironment, ? extends Unit>, OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<OuterT, InnerT> f36860i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super OuterT, ? extends InnerT> function1) {
            super(4);
            this.f36860i = function1;
        }

        public final void a(@NotNull View noName_0, @NotNull Function2<? super InnerT, ? super ViewEnvironment, Unit> innerShowRendering, @NotNull OuterT outerRendering, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
            Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            innerShowRendering.invoke(this.f36860i.invoke(outerRendering), viewEnvironment);
        }

        @Override // xt.o
        public /* bridge */ /* synthetic */ Unit e(View view, Object obj, Object obj2, ViewEnvironment viewEnvironment) {
            a(view, (Function2) obj, obj2, viewEnvironment);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "outer", "Lym/y;", "viewEnvironment", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;Lym/y;)Lkotlin/Pair;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function2<OuterT, ViewEnvironment, Pair<? extends InnerT, ? extends ViewEnvironment>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<OuterT, InnerT> f36861i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super OuterT, ? extends InnerT> function1) {
            super(2);
            this.f36861i = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<InnerT, ViewEnvironment> invoke(@NotNull OuterT outer, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(outer, "outer");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            return new Pair<>(this.f36861i.invoke(outer), viewEnvironment);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "rendering", "Lym/y;", "env", "", "a", "(Ljava/lang/Object;Lym/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function2<OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ i<OuterT, InnerT> f36862i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View f36863j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<InnerT, ViewEnvironment, Unit> f36864k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i<OuterT, InnerT> iVar, View view, Function2<? super InnerT, ? super ViewEnvironment, Unit> function2) {
            super(2);
            this.f36862i = iVar;
            this.f36863j = view;
            this.f36864k = function2;
        }

        public final void a(@NotNull OuterT rendering, @NotNull ViewEnvironment env) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Intrinsics.checkNotNullParameter(env, "env");
            this.f36862i.doShowRendering.e(this.f36863j, this.f36864k, rendering, env);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull fu.c<OuterT> type, @NotNull Function2<? super OuterT, ? super ViewEnvironment, ? extends Pair<? extends InnerT, ViewEnvironment>> map, @Nullable f0 f0Var, @NotNull xt.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
        this.type = type;
        this.map = map;
        this.viewStarter = f0Var;
        this.doShowRendering = doShowRendering;
    }

    @Override // ym.a0
    @NotNull
    public View a(@NotNull OuterT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        Pair<InnerT, ViewEnvironment> pairInvoke = this.map.invoke(initialRendering, initialViewEnvironment);
        InnerT innertA = pairInvoke.a();
        ViewEnvironment viewEnvironmentB = pairInvoke.b();
        View viewC = d0.c((c0) viewEnvironmentB.a(c0.INSTANCE), innertA, viewEnvironmentB, contextForNewView, container, this.viewStarter);
        Function2 function2D = e0.d(viewC);
        Intrinsics.checkNotNull(function2D);
        e0.a(viewC, initialRendering, viewEnvironmentB, new c(this, viewC, function2D));
        return viewC;
    }

    @Override // ym.a0
    @NotNull
    public fu.c<OuterT> getType() {
        return this.type;
    }

    public /* synthetic */ i(fu.c cVar, Function1 function1, f0 f0Var, xt.o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, function1, (i10 & 4) != 0 ? null : f0Var, (i10 & 8) != 0 ? new a(function1) : oVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull fu.c<OuterT> type, @NotNull Function1<? super OuterT, ? extends InnerT> map, @Nullable f0 f0Var, @NotNull xt.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        this(type, new b(map), f0Var, doShowRendering);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
    }
}
