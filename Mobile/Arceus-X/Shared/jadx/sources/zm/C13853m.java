package zm;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.C8676k;
import mu.InterfaceC8689x;
import nu.C9579j;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p452tu.C11753e;
import p581ym.AbstractC13218k;
import p581ym.C13214g;
import p581ym.C13220m;
import p581ym.InterfaceC13224q;
import p581ym.InterfaceC13227t;
import p581ym.WorkflowOutput;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zm.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m31665d2 = {"Lzm/m;", "PropsT", "OutputT", "RenderingT", "", "Lku/p0;", "scope", "Lym/q;", "protoWorkflow", "Lnu/p0;", "props", "Lym/m;", "snapshot", "Lym/t;", "interceptor", "<init>", "(Lku/p0;Lym/q;Lnu/p0;Lym/m;Lym/t;)V", "Lym/g;", "g", "()Lym/g;", "Lym/v;", "f", "(Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "e", "(Ljava/util/concurrent/CancellationException;)V", "Lym/k;", "a", "Lym/k;", "workflow", "Lzm/d;", "b", "Lzm/d;", "idCounter", "c", "Ljava/lang/Object;", "currentProps", "Lmu/x;", "d", "Lmu/x;", "getPropsChannel$annotations", "()V", "propsChannel", "Lzm/j;", "Lzm/j;", "rootNode", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13853m<PropsT, OutputT, RenderingT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC13218k<PropsT, ?, OutputT, RenderingT> workflow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13844d idCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public PropsT currentProps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8689x<PropsT> propsChannel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C13850j<PropsT, ? extends Object, OutputT, RenderingT> rootNode;

    /* JADX INFO: renamed from: zm.m$a */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"PropsT", "OutputT", "RenderingT", "Lmu/k;", "channelResult", "Lym/v;", "<anonymous>", "(Lmu/k;)Lym/v;"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", m39664f = "WorkflowRunner.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<C8676k<? extends PropsT>, InterfaceC9557b<? super WorkflowOutput<? extends OutputT>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48543t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48544u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13853m<PropsT, OutputT, RenderingT> f48545v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13853m<PropsT, OutputT, RenderingT> c13853m, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48545v = c13853m;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f48545v, interfaceC9557b);
            aVar.f48544u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m50424q(((C8676k) obj).getHolder(), (InterfaceC9557b) obj2);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C10047c.m38805e();
            if (this.f48543t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Object holder = ((C8676k) this.f48544u).getHolder();
            Throwable thM34932e = C8676k.m34932e(holder);
            if (thM34932e != null) {
                throw thM34932e;
            }
            Object objM34933f = C8676k.m34933f(holder);
            if (objM34933f == null) {
                return null;
            }
            C13853m<PropsT, OutputT, RenderingT> c13853m = this.f48545v;
            if (Intrinsics.m31980c(c13853m.currentProps, objM34933f)) {
                return null;
            }
            c13853m.currentProps = objM34933f;
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final Object m50424q(@NotNull Object obj, @Nullable InterfaceC9557b<? super WorkflowOutput<? extends OutputT>> interfaceC9557b) {
            return ((a) create(C8676k.m34929b(obj), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zm.m$b */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, m31665d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", m39664f = "WorkflowRunner.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<PropsT, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48546t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48547u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13853m<PropsT, OutputT, RenderingT> f48548v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13853m<PropsT, OutputT, RenderingT> c13853m, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48548v = c13853m;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f48548v, interfaceC9557b);
            bVar.f48547u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f48546t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C10340b.m39658a(Intrinsics.m31980c(this.f48547u, this.f48548v.currentProps));
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PropsT propst, @Nullable InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((b) create(propst, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C13853m(@NotNull InterfaceC7906p0 scope, @NotNull InterfaceC13224q<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, @NotNull InterfaceC9592p0<? extends PropsT> props, @Nullable C13220m c13220m, @NotNull InterfaceC13227t interceptor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(protoWorkflow, "protoWorkflow");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        AbstractC13218k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> abstractC13218kMo48881b = protoWorkflow.mo48881b();
        this.workflow = abstractC13218kMo48881b;
        C13844d c13844d = new C13844d();
        this.idCounter = c13844d;
        this.currentProps = props.getValue();
        this.propsChannel = C9579j.m37770G(C9579j.m37798o(props, new b(this, null)), scope);
        this.rootNode = new C13850j<>(C13852l.m50416b(abstractC13218kMo48881b, null, 1, null), abstractC13218kMo48881b, this.currentProps, c13220m, scope.getCoroutineContext(), null, null, interceptor, c13844d, 96, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m50421e(@Nullable CancellationException cause) {
        this.rootNode.m50394e(cause);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m50422f(@NotNull InterfaceC9557b<? super WorkflowOutput<? extends OutputT>> interfaceC9557b) {
        C11753e c11753e = new C11753e(interfaceC9557b);
        try {
            if (!this.propsChannel.mo34846h()) {
                c11753e.mo43993c(this.propsChannel.mo34793A(), new a(this, null));
            }
            this.rootNode.m50404p(c11753e);
        } catch (Throwable th2) {
            c11753e.m43997C(th2);
        }
        Object objM43996B = c11753e.m43996B();
        if (objM43996B == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM43996B;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    /* JADX INFO: renamed from: g */
    public final C13214g<RenderingT> m50423g() {
        return new C13214g<>(this.rootNode.m50401m((AbstractC13218k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT>) this.workflow, this.currentProps), this.rootNode.m50403o((AbstractC13218k<?, ?, ?, ?>) this.workflow));
    }
}
