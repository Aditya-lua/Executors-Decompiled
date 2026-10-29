package an;

import androidx.p000lifecycle.l0;
import com.squareup.workflow1.ui.PickledTreesnapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.m0;
import nu.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lym/q;", "workflow", "Lku/p0;", "scope", "Lnu/p0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "", "Lym/t;", "interceptors", "Lkotlin/Function2;", "Lnt/b;", "", "", "onOutput", "a", "(Lym/q;Lku/p0;Lnu/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lnu/p0;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: an.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0006a<RenderingT> implements nu.h<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f679a;

        /* JADX INFO: renamed from: an.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0007a implements nu.i<ym.g<? extends RenderingT>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.i f680a;

            /* JADX INFO: renamed from: an.a$a$a$a, reason: collision with other inner class name */
            @pt.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", l = {137}, m = "emit")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class C0008a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f681t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f682u;

                public C0008a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f681t = obj;
                    this.f682u |= Integer.MIN_VALUE;
                    return C0007a.this.emit(null, this);
                }
            }

            public C0007a(nu.i iVar) {
                this.f680a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.i
            @Nullable
            public Object emit(Object obj, @NotNull nt.b bVar) {
                C0008a c0008a;
                if (bVar instanceof C0008a) {
                    c0008a = (C0008a) bVar;
                    int i10 = c0008a.f682u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0008a.f682u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0008a = new C0008a(bVar);
                    }
                } else {
                    c0008a = new C0008a(bVar);
                }
                Object obj2 = c0008a.f681t;
                Object objE = ot.c.e();
                int i11 = c0008a.f682u;
                if (i11 == 0) {
                    jt.o.b(obj2);
                    nu.i iVar = this.f680a;
                    Object objA = ((ym.g) obj).a();
                    c0008a.f682u = 1;
                    if (iVar.emit(objA, c0008a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj2);
                }
                return Unit.f22483a;
            }
        }

        public C0006a(nu.h hVar) {
            this.f679a = hVar;
        }

        @Override // nu.h
        @Nullable
        public Object collect(@NotNull nu.i iVar, @NotNull nt.b bVar) {
            Object objCollect = this.f679a.collect(new C0007a(iVar), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lym/g;", "it", "", "<anonymous>", "(Lym/g;)V"}, k = 3, mv = {1, 6, 0})
    @pt.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class b<RenderingT> extends pt.m implements Function2<ym.g<? extends RenderingT>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f685u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l0 f686v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f686v = l0Var;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            b bVar2 = new b(this.f686v, bVar);
            bVar2.f685u = obj;
            return bVar2;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ot.c.e();
            if (this.f684t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            ym.g gVar = (ym.g) this.f685u;
            l0 l0Var = this.f686v;
            if (l0Var != null) {
                l0Var.i("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new PickledTreesnapshot(gVar.getSnapshot()));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ym.g<? extends RenderingT> gVar, @Nullable nt.b<? super Unit> bVar) {
            return ((b) create(gVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> p0<RenderingT> a(@NotNull ym.q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull ku.p0 scope, @NotNull p0<? extends PropsT> props, @Nullable l0 l0Var, @NotNull List<? extends ym.t> interceptors, @NotNull Function2<? super OutputT, ? super nt.b<? super Unit>, ? extends Object> onOutput) {
        PickledTreesnapshot pickledTreesnapshot;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        p0 p0VarA = ym.f.a(workflow, scope, props, (l0Var == null || (pickledTreesnapshot = (PickledTreesnapshot) l0Var.b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : pickledTreesnapshot.getSnapshot(), interceptors, onOutput);
        return nu.j.L(new C0006a(nu.j.E(p0VarA, new b(l0Var, null))), scope, m0.INSTANCE.a(), ((ym.g) p0VarA.getValue()).a());
    }
}
