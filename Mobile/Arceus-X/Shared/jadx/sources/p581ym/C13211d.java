package p581ym;

import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14058o;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ym.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B;\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJq\u0010\u001a\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\u00162$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m31665d2 = {"Lym/d;", "P", "S", "O", "Lym/a;", "Lym/h;", "Lym/r;", "baseRenderContext", "Lym/t$b;", "interceptor", "<init>", "(Lym/a;Lym/t$b;)V", "value", "", "f", "(Lym/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lym/q;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "c", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lym/a;", "d", "Lym/t$b;", "()Lym/h;", "actionSink", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13211d<P, S, O> implements InterfaceC13205a<P, S, O>, InterfaceC13215h<AbstractC13225r<? super P, S, ? extends O>> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13205a<P, S, O> baseRenderContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13227t.b<P, S, O> interceptor;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT, ChildRenderingT, ChildPropsT] */
    /* JADX INFO: renamed from: ym.d$a */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m31665d2 = {"ChildPropsT", "ChildOutputT", "ChildRenderingT", "P", "S", "O", "Lym/q;", "iChild", "iProps", "", "iKey", "Lkotlin/Function1;", "Lym/r;", "iHandler", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a<ChildOutputT, ChildPropsT, ChildRenderingT> extends AbstractC7746m implements InterfaceC14058o<InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, Function1<? super ChildOutputT, ? extends AbstractC13225r<? super P, S, ? extends O>>, ChildRenderingT> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C13211d<P, S, O> f46499i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13211d<P, S, O> c13211d) {
            super(4);
            this.f46499i = c13211d;
        }

        /* JADX DEBUG: Method merged with bridge method: e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14058o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChildRenderingT mo1397e(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> iChild, ChildPropsT childpropst, @NotNull String iKey, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super P, S, ? extends O>> iHandler) {
            Intrinsics.checkNotNullParameter(iChild, "iChild");
            Intrinsics.checkNotNullParameter(iKey, "iKey");
            Intrinsics.checkNotNullParameter(iHandler, "iHandler");
            return (ChildRenderingT) this.f46499i.baseRenderContext.mo48836c(iChild, childpropst, iKey, iHandler);
        }
    }

    /* JADX INFO: renamed from: ym.d$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, m31665d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lnt/b;", "", "", "iSideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function2<String, Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C13211d<P, S, O> f46500i;

        /* JADX INFO: renamed from: ym.d$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"P", "S", "O", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
        @InterfaceC10344f(m39663c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", m39664f = "WorkflowInterceptor.kt", m39665l = {306}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f46501t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Function1<InterfaceC9557b<? super Unit>, Object> f46502u;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f46502u = function1;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f46502u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f46501t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    Function1<InterfaceC9557b<? super Unit>, Object> function1 = this.f46502u;
                    this.f46501t = 1;
                    if (function1.invoke(this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13211d<P, S, O> c13211d) {
            super(2);
            this.f46500i = c13211d;
        }

        /* JADX INFO: renamed from: a */
        public final void m48858a(@NotNull String iKey, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> iSideEffect) {
            Intrinsics.checkNotNullParameter(iKey, "iKey");
            Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
            this.f46500i.baseRenderContext.mo48835b(iKey, new a(iSideEffect, null));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1) {
            m48858a(str, function1);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: ym.d$c */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\u008a@"}, m31665d2 = {"<anonymous>", "", "P", "S", "O"}, m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", m39664f = "WorkflowInterceptor.kt", m39665l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46503t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f46504u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13211d<P, S, O> f46505v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, C13211d<P, S, O> c13211d, InterfaceC9557b<? super c> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f46504u = function2;
            this.f46505v = c13211d;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f46504u, this.f46505v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46503t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> function2 = this.f46504u;
                InterfaceC7906p0 interfaceC7906p0M32885a = C7910q0.m32885a(getContext());
                this.f46503t = 1;
                if (function2.invoke(interfaceC7906p0M32885a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ym.d$d */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"P", "S", "O", "Lym/r;", "interceptedAction", "", "a", "(Lym/r;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class d extends AbstractC7746m implements Function1<AbstractC13225r<? super P, S, ? extends O>, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C13211d<P, S, O> f46506i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C13211d<P, S, O> c13211d) {
            super(1);
            this.f46506i = c13211d;
        }

        /* JADX INFO: renamed from: a */
        public final void m48860a(@NotNull AbstractC13225r<? super P, S, ? extends O> interceptedAction) {
            Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
            this.f46506i.baseRenderContext.mo48837d().mo17905a(interceptedAction);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m48860a((AbstractC13225r) obj);
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.a<? extends P, S, ? super O> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13211d(@NotNull InterfaceC13205a<? extends P, S, ? super O> baseRenderContext, @NotNull InterfaceC13227t.b<P, S, O> interceptor) {
        Intrinsics.checkNotNullParameter(baseRenderContext, "baseRenderContext");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.baseRenderContext = baseRenderContext;
        this.interceptor = interceptor;
    }

    @Override // p581ym.InterfaceC13205a
    /* JADX INFO: renamed from: b */
    public void mo48835b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        this.interceptor.mo48920c(key, new c(sideEffect, this, null), new b(this));
    }

    @Override // p581ym.InterfaceC13205a
    /* JADX INFO: renamed from: c */
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT mo48836c(@NotNull InterfaceC13224q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super P, S, ? extends O>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return (ChildRenderingT) this.interceptor.mo48918a(child, props, key, handler, new a(this));
    }

    @Override // p581ym.InterfaceC13205a
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC13215h<AbstractC13225r<? super P, S, ? extends O>> mo48837d() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p581ym.InterfaceC13215h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo17905a(@NotNull AbstractC13225r<? super P, S, ? extends O> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.interceptor.mo48919b(value, new d(this));
    }
}
