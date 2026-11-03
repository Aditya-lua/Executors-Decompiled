package ym;

import androidx.p000lifecycle.l0;
import com.squareup.workflow1.ui.PickledTreesnapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.m0;
import lu.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/q;", "workflow", "Liu/p0;", "scope", "Llu/p0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "", "Lwm/t;", "interceptors", "Lkotlin/Function2;", "Llt/b;", "", "", "onOutput", "a", "(Lwm/q;Liu/p0;Llu/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Llu/p0;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: ym.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0672a<RenderingT> implements lu.h<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f36824a;

        /* JADX INFO: renamed from: ym.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0673a implements lu.i<wm.g<? extends RenderingT>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.i f36825a;

            /* JADX INFO: renamed from: ym.a$a$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", l = {137}, m = "emit")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class C0674a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f36826t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f36827u;

                public C0674a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f36826t = obj;
                    this.f36827u |= Integer.MIN_VALUE;
                    return C0673a.this.emit(null, this);
                }
            }

            public C0673a(lu.i iVar) {
                this.f36825a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // lu.i
            @Nullable
            public Object emit(Object obj, @NotNull lt.b bVar) {
                C0674a c0674a;
                if (bVar instanceof C0674a) {
                    c0674a = (C0674a) bVar;
                    int i10 = c0674a.f36827u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0674a.f36827u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0674a = new C0674a(bVar);
                    }
                } else {
                    c0674a = new C0674a(bVar);
                }
                Object obj2 = c0674a.f36826t;
                Object objE = mt.c.e();
                int i11 = c0674a.f36827u;
                if (i11 == 0) {
                    gt.o.b(obj2);
                    lu.i iVar = this.f36825a;
                    Object objA = ((wm.g) obj).a();
                    c0674a.f36827u = 1;
                    if (iVar.emit(objA, c0674a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj2);
                }
                return Unit.f22938a;
            }
        }

        public C0672a(lu.h hVar) {
            this.f36824a = hVar;
        }

        @Override // lu.h
        @Nullable
        public Object collect(@NotNull lu.i iVar, @NotNull lt.b bVar) {
            Object objCollect = this.f36824a.collect(new C0673a(iVar), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @nt.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/g;", "it", "", "<anonymous>", "(Lwm/g;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b<RenderingT> extends nt.m implements Function2<wm.g<? extends RenderingT>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36829t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36830u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l0 f36831v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f36831v = l0Var;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            b bVar2 = new b(this.f36831v, bVar);
            bVar2.f36830u = obj;
            return bVar2;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mt.c.e();
            if (this.f36829t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            wm.g gVar = (wm.g) this.f36830u;
            l0 l0Var = this.f36831v;
            if (l0Var != null) {
                l0Var.i("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new PickledTreesnapshot(gVar.getSnapshot()));
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull wm.g<? extends RenderingT> gVar, @Nullable lt.b<? super Unit> bVar) {
            return ((b) create(gVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> p0<RenderingT> a(@NotNull wm.q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull iu.p0 scope, @NotNull p0<? extends PropsT> props, @Nullable l0 l0Var, @NotNull List<? extends wm.t> interceptors, @NotNull Function2<? super OutputT, ? super lt.b<? super Unit>, ? extends Object> onOutput) {
        PickledTreesnapshot pickledTreesnapshot;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        p0 p0VarA = wm.f.a(workflow, scope, props, (l0Var == null || (pickledTreesnapshot = (PickledTreesnapshot) l0Var.b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : pickledTreesnapshot.getSnapshot(), interceptors, onOutput);
        return lu.j.L(new C0672a(lu.j.E(p0VarA, new b(l0Var, null))), scope, m0.INSTANCE.a(), ((wm.g) p0VarA.getValue()).a());
    }
}
