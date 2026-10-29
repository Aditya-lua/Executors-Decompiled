package p016an;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: an.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m31665d2 = {"Lan/i;", "", "OuterT", "InnerT", "Lan/a0;", "Lhu/c;", Payload.TYPE, "Lkotlin/Function2;", "Lan/y;", "Lkotlin/Pair;", "map", "Lan/f0;", "viewStarter", "Lkotlin/Function4;", "Landroid/view/View;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "doShowRendering", "<init>", "(Lhu/c;Lkotlin/jvm/functions/Function2;Lan/f0;Lzt/o;)V", "Lkotlin/Function1;", "(Lhu/c;Lkotlin/jvm/functions/Function1;Lan/f0;Lzt/o;)V", "initialRendering", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lan/f0;", "d", "Lzt/o;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0379i<OuterT, InnerT> implements InterfaceC0364a0<OuterT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6567c<OuterT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<OuterT, ViewEnvironment, Pair<InnerT, ViewEnvironment>> map;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC0374f0 viewStarter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14058o<View, Function2<? super InnerT, ? super ViewEnvironment, Unit>, OuterT, ViewEnvironment, Unit> doShowRendering;

    /* JADX INFO: renamed from: an.i$a */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00028\u0001`\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, m31665d2 = {"", "OuterT", "InnerT", "Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/Function2;", "Lan/y;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lan/y;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements InterfaceC14058o<View, Function2<? super InnerT, ? super ViewEnvironment, ? extends Unit>, OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<OuterT, InnerT> f929i;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super OuterT, ? extends InnerT> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super OuterT, ? extends InnerT> function1) {
            super(4);
            this.f929i = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m1436a(@NotNull View noName_0, @NotNull Function2<? super InnerT, ? super ViewEnvironment, Unit> innerShowRendering, @NotNull OuterT outerRendering, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
            Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            innerShowRendering.invoke(this.f929i.invoke(outerRendering), viewEnvironment);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14058o
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Unit mo1397e(View view, Object obj, Object obj2, ViewEnvironment viewEnvironment) {
            m1436a(view, (Function2) obj, obj2, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: an.i$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31665d2 = {"", "OuterT", "InnerT", "outer", "Lan/y;", "viewEnvironment", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;Lan/y;)Lkotlin/Pair;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function2<OuterT, ViewEnvironment, Pair<? extends InnerT, ? extends ViewEnvironment>> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<OuterT, InnerT> f930i;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super OuterT, ? extends InnerT> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super OuterT, ? extends InnerT> function1) {
            super(2);
            this.f930i = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<InnerT, ViewEnvironment> invoke(@NotNull OuterT outer, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(outer, "outer");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            return new Pair<>(this.f930i.invoke(outer), viewEnvironment);
        }
    }

    /* JADX INFO: renamed from: an.i$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31665d2 = {"", "OuterT", "InnerT", "rendering", "Lan/y;", "env", "", "a", "(Ljava/lang/Object;Lan/y;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class c extends AbstractC7746m implements Function2<OuterT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C0379i<OuterT, InnerT> f931i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ View f932j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Function2<InnerT, ViewEnvironment, Unit> f933k;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super InnerT, ? super an.y, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C0379i<OuterT, InnerT> c0379i, View view, Function2<? super InnerT, ? super ViewEnvironment, Unit> function2) {
            super(2);
            this.f931i = c0379i;
            this.f932j = view;
            this.f933k = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m1438a(@NotNull OuterT rendering, @NotNull ViewEnvironment env) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Intrinsics.checkNotNullParameter(env, "env");
            this.f931i.doShowRendering.mo1397e(this.f932j, this.f933k, rendering, env);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
            m1438a(obj, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super OuterT, ? super an.y, ? extends kotlin.Pair<? extends InnerT, an.y>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: zt.o<? super android.view.View, ? super kotlin.jvm.functions.Function2<? super InnerT, ? super an.y, kotlin.Unit>, ? super OuterT, ? super an.y, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0379i(@NotNull InterfaceC6567c<OuterT> type, @NotNull Function2<? super OuterT, ? super ViewEnvironment, ? extends Pair<? extends InnerT, ViewEnvironment>> map, @Nullable InterfaceC0374f0 interfaceC0374f0, @NotNull InterfaceC14058o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
        this.type = type;
        this.map = map;
        this.viewStarter = interfaceC0374f0;
        this.doShowRendering = doShowRendering;
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo1379a(@NotNull OuterT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        Pair<InnerT, ViewEnvironment> pairInvoke = this.map.invoke(initialRendering, initialViewEnvironment);
        InnerT innertM31671a = pairInvoke.m31671a();
        ViewEnvironment viewEnvironmentM31672b = pairInvoke.m31672b();
        View viewM1400c = C0370d0.m1400c((InterfaceC0368c0) viewEnvironmentM31672b.m1462a(InterfaceC0368c0.INSTANCE), innertM31671a, viewEnvironmentM31672b, contextForNewView, container, this.viewStarter);
        Function2 function2M1411d = C0372e0.m1411d(viewM1400c);
        Intrinsics.checkNotNull(function2M1411d);
        C0372e0.m1408a(viewM1400c, initialRendering, viewEnvironmentM31672b, new c(this, viewM1400c, function2M1411d));
        return viewM1400c;
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<OuterT> getType() {
        return this.type;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
      (r1v0 hu.c)
      (r2v0 kotlin.jvm.functions.Function1)
      (wrap an.f0:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null an.f0) : (r3v0 an.f0))
      (wrap zt.o:?: TERNARY null = ((wrap int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap zt.o:0x000b: CONSTRUCTOR (r2v0 kotlin.jvm.functions.Function1) A[MD:(kotlin.jvm.functions.Function1<? super OuterT, ? extends InnerT>):void (m), WRAPPED] (LINE:6) call: an.i.a.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR) : (r4v0 zt.o))
     A[MD:(hu.c<OuterT>, kotlin.jvm.functions.Function1<? super OuterT, ? extends InnerT>, an.f0, zt.o<? super android.view.View, ? super kotlin.jvm.functions.Function2<? super InnerT, ? super an.y, kotlin.Unit>, ? super OuterT, ? super an.y, kotlin.Unit>):void (m)] (LINE:7) call: an.i.<init>(hu.c, kotlin.jvm.functions.Function1, an.f0, zt.o):void type: THIS */
    public /* synthetic */ C0379i(InterfaceC6567c interfaceC6567c, Function1 function1, InterfaceC0374f0 interfaceC0374f0, InterfaceC14058o interfaceC14058o, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6567c, function1, (i10 & 4) != 0 ? null : interfaceC0374f0, (i10 & 8) != 0 ? new a(function1) : interfaceC14058o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0379i(@NotNull InterfaceC6567c<OuterT> type, @NotNull Function1<? super OuterT, ? extends InnerT> map, @Nullable InterfaceC0374f0 interfaceC0374f0, @NotNull InterfaceC14058o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        this(type, new b(map), interfaceC0374f0, doShowRendering);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
    }
}
