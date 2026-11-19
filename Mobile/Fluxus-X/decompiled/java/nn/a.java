package nn;

import androidx.p000lifecycle.l0;
import com.github.luben.zstd.BuildConfig;
import dv.m0;
import dv.p0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lln/q;", "workflow", "Lav/p0;", "scope", "Ldv/p0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", BuildConfig.FLAVOR, "Lln/t;", "interceptors", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "onOutput", "a", "(Lln/q;Lav/p0;Ldv/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: nn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0501a<RenderingT> implements dv.h<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f25819a;

        /* JADX INFO: renamed from: nn.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0502a implements dv.i<ln.g<? extends RenderingT>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f25820a;

            /* JADX INFO: renamed from: nn.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @gu.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", l = {137}, m = "emit")
            public static final class C0503a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f25821t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f25822u;

                public C0503a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f25821t = obj;
                    this.f25822u |= Integer.MIN_VALUE;
                    return C0502a.this.emit(null, this);
                }
            }

            public C0502a(dv.i iVar) {
                this.f25820a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            @Nullable
            public Object emit(Object obj, @NotNull eu.b bVar) {
                C0503a c0503a;
                if (bVar instanceof C0503a) {
                    c0503a = (C0503a) bVar;
                    int i10 = c0503a.f25822u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0503a.f25822u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0503a = new C0503a(bVar);
                    }
                } else {
                    c0503a = new C0503a(bVar);
                }
                Object obj2 = c0503a.f25821t;
                Object objE = fu.c.e();
                int i11 = c0503a.f25822u;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    dv.i iVar = this.f25820a;
                    Object objA = ((ln.g) obj).a();
                    c0503a.f25822u = 1;
                    if (iVar.emit(objA, c0503a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj2);
                }
                return Unit.f21506a;
            }
        }

        public C0501a(dv.h hVar) {
            this.f25819a = hVar;
        }

        @Override // dv.h
        @Nullable
        public Object collect(@NotNull dv.i iVar, @NotNull eu.b bVar) {
            Object objCollect = this.f25819a.collect(new C0502a(iVar), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lln/g;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lln/g;)V"}, k = 3, mv = {1, 6, 0})
    @gu.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class b<RenderingT> extends gu.m implements Function2<ln.g<? extends RenderingT>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25824t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25825u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l0 f25826v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f25826v = l0Var;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            b bVar2 = new b(this.f25826v, bVar);
            bVar2.f25825u = obj;
            return bVar2;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            fu.c.e();
            if (this.f25824t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.g gVar = (ln.g) this.f25825u;
            l0 l0Var = this.f25826v;
            if (l0Var != null) {
                l0Var.i("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new o(gVar.getSnapshot()));
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ln.g<? extends RenderingT> gVar, @Nullable eu.b<? super Unit> bVar) {
            return ((b) create(gVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> p0<RenderingT> a(@NotNull ln.q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull av.p0 scope, @NotNull p0<? extends PropsT> props, @Nullable l0 l0Var, @NotNull List<? extends ln.t> interceptors, @NotNull Function2<? super OutputT, ? super eu.b<? super Unit>, ? extends Object> onOutput) {
        o oVar;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        p0 p0VarA = ln.f.a(workflow, scope, props, (l0Var == null || (oVar = (o) l0Var.b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : oVar.getSnapshot(), interceptors, onOutput);
        return dv.j.M(new C0501a(dv.j.E(p0VarA, new b(l0Var, null))), scope, m0.INSTANCE.a(), ((ln.g) p0VarA.getValue()).a());
    }
}
