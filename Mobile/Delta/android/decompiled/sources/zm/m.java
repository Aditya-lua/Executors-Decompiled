package zm;

import java.util.concurrent.CancellationException;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import mu.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.WorkflowOutput;
import ym.q;
import ym.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lzm/m;", "PropsT", "OutputT", "RenderingT", "", "Lku/p0;", "scope", "Lym/q;", "protoWorkflow", "Lnu/p0;", "props", "Lym/m;", "snapshot", "Lym/t;", "interceptor", "<init>", "(Lku/p0;Lym/q;Lnu/p0;Lym/m;Lym/t;)V", "Lym/g;", "g", "()Lym/g;", "Lym/v;", "f", "(Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "e", "(Ljava/util/concurrent/CancellationException;)V", "Lym/k;", "a", "Lym/k;", "workflow", "Lzm/d;", "b", "Lzm/d;", "idCounter", "c", "Ljava/lang/Object;", "currentProps", "Lmu/x;", "d", "Lmu/x;", "getPropsChannel$annotations", "()V", "propsChannel", "Lzm/j;", "Lzm/j;", "rootNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class m<PropsT, OutputT, RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ym.k<PropsT, ?, OutputT, RenderingT> workflow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d idCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public PropsT currentProps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x<PropsT> propsChannel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j<PropsT, ? extends Object, OutputT, RenderingT> rootNode;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lmu/k;", "channelResult", "Lym/v;", "<anonymous>", "(Lmu/k;)Lym/v;"}, k = 3, mv = {1, 6, 0})
    @pt.f(c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<mu.k<? extends PropsT>, nt.b<? super WorkflowOutput<? extends OutputT>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37713t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37714u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ m<PropsT, OutputT, RenderingT> f37715v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<PropsT, OutputT, RenderingT> mVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f37715v = mVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            a aVar = new a(this.f37715v, bVar);
            aVar.f37714u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return q(((mu.k) obj).getHolder(), (nt.b) obj2);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ot.c.e();
            if (this.f37713t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Object holder = ((mu.k) this.f37714u).getHolder();
            Throwable thE = mu.k.e(holder);
            if (thE != null) {
                throw thE;
            }
            Object objF = mu.k.f(holder);
            if (objF == null) {
                return null;
            }
            m<PropsT, OutputT, RenderingT> mVar = this.f37715v;
            if (Intrinsics.c(mVar.currentProps, objF)) {
                return null;
            }
            mVar.currentProps = objF;
            return null;
        }

        @Nullable
        public final Object q(@NotNull Object obj, @Nullable nt.b<? super WorkflowOutput<? extends OutputT>> bVar) {
            return ((a) create(mu.k.b(obj), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @pt.f(c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<PropsT, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37716t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37717u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ m<PropsT, OutputT, RenderingT> f37718v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m<PropsT, OutputT, RenderingT> mVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f37718v = mVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            b bVar2 = new b(this.f37718v, bVar);
            bVar2.f37717u = obj;
            return bVar2;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ot.c.e();
            if (this.f37716t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return pt.b.a(Intrinsics.c(this.f37717u, this.f37718v.currentProps));
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PropsT propst, @Nullable nt.b<? super Boolean> bVar) {
            return ((b) create(propst, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public m(@NotNull p0 scope, @NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, @NotNull nu.p0<? extends PropsT> props, @Nullable ym.m mVar, @NotNull t interceptor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(protoWorkflow, "protoWorkflow");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        ym.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> kVarB = protoWorkflow.b();
        this.workflow = kVarB;
        d dVar = new d();
        this.idCounter = dVar;
        this.currentProps = props.getValue();
        this.propsChannel = nu.j.G(nu.j.o(props, new b(this, null)), scope);
        this.rootNode = new j<>(l.b(kVarB, null, 1, null), kVarB, this.currentProps, mVar, scope.getCoroutineContext(), null, null, interceptor, dVar, 96, null);
    }

    public final void e(@Nullable CancellationException cause) {
        this.rootNode.e(cause);
    }

    @Nullable
    public final Object f(@NotNull nt.b<? super WorkflowOutput<? extends OutputT>> bVar) {
        tu.e eVar = new tu.e(bVar);
        try {
            if (!this.propsChannel.h()) {
                eVar.c(this.propsChannel.A(), new a(this, null));
            }
            this.rootNode.p(eVar);
        } catch (Throwable th2) {
            eVar.C(th2);
        }
        Object objB = eVar.B();
        if (objB == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objB;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final ym.g<RenderingT> g() {
        return new ym.g<>(this.rootNode.m((ym.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT>) this.workflow, this.currentProps), this.rootNode.o((ym.k<?, ?, ?, ?>) this.workflow));
    }
}
