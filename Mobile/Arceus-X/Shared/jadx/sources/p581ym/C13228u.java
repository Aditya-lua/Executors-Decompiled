package p581ym;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ym.u */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"P", "S", "O", "R", "Lym/t;", "Lym/k;", "workflow", "Lym/t$c;", "workflowSession", "a", "(Lym/t;Lym/k;Lym/t$c;)Lym/k;", "wf1-workflow-runtime"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13228u {

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    /* JADX INFO: renamed from: ym.u$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001J!\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"ym/u$a", "Lym/k;", "props", "Lym/i;", "snapshot", "d", "(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Lym/k$a;", "context", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Lym/i;", "", "toString", "()Ljava/lang/String;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class InterceptedWorkflow<O, P, R, S> extends AbstractC13218k<P, S, O, R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13227t f46560a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC13218k<P, S, O, R> f46561b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC13227t.c f46562c;

        /* JADX INFO: renamed from: ym.u$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
        public /* synthetic */ class C14291a extends C7744k implements Function2<P, Snapshot, S> {
            public C14291a(Object obj) {
                super(2, obj, AbstractC13218k.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final S invoke(P p8, @Nullable Snapshot snapshot) {
                return (S) ((AbstractC13218k) this.receiver).mo16430d(p8, snapshot);
            }
        }

        /* JADX INFO: renamed from: ym.u$a$b */
        @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
        public /* synthetic */ class b extends C7744k implements InterfaceC14057n<P, P, S, S> {
            public b(Object obj) {
                super(3, obj, AbstractC13218k.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @Override // p615zt.InterfaceC14057n
            public final S invoke(P p8, P p10, S s8) {
                return (S) ((AbstractC13218k) this.receiver).mo48882e(p8, p10, s8);
            }
        }

        /* JADX INFO: renamed from: ym.u$a$c */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"P", "S", "O", "R", "props", "state", "Lym/t$b;", "interceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class c extends AbstractC7746m implements InterfaceC14057n<P, S, InterfaceC13227t.b<P, S, O>, R> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ AbstractC13218k<P, S, O, R>.a f46563i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ AbstractC13218k<P, S, O, R> f46564j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ InterceptedWorkflow f46565k;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super P, S, ? extends O, ? extends R>$a */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super P, S, ? extends O, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(AbstractC13218k<? super P, S, ? extends O, ? extends R>.a aVar, AbstractC13218k<? super P, S, ? extends O, ? extends R> abstractC13218k, InterceptedWorkflow interceptedWorkflow) {
                super(3);
                this.f46563i = aVar;
                this.f46564j = abstractC13218k;
                this.f46565k = interceptedWorkflow;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14057n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p8, S s8, @Nullable InterfaceC13227t.b<P, S, O> bVar) {
                InterfaceC13205a c13211d = bVar == null ? null : new C13211d(this.f46563i, bVar);
                if (c13211d == null) {
                    c13211d = this.f46563i;
                }
                return this.f46564j.mo16431f(p8, s8, C13230w.m48926a(c13211d, this.f46565k));
            }
        }

        /* JADX INFO: renamed from: ym.u$a$d */
        @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
        public /* synthetic */ class d extends C7744k implements Function1<S, Snapshot> {
            public d(Object obj) {
                super(1, obj, AbstractC13218k.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Snapshot invoke(S s8) {
                return ((AbstractC13218k) this.receiver).mo16432g(s8);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super P, S, ? extends O, ? extends R> */
        /* JADX WARN: Multi-variable type inference failed */
        public InterceptedWorkflow(InterfaceC13227t interfaceC13227t, AbstractC13218k<? super P, S, ? extends O, ? extends R> abstractC13218k, InterfaceC13227t.c cVar) {
            this.f46560a = interfaceC13227t;
            this.f46561b = abstractC13218k;
            this.f46562c = cVar;
        }

        @Override // p581ym.AbstractC13218k
        /* JADX INFO: renamed from: d */
        public S mo16430d(P props, @Nullable Snapshot snapshot) {
            return (S) this.f46560a.mo48864d(props, snapshot, new C14291a(this.f46561b), this.f46562c);
        }

        @Override // p581ym.AbstractC13218k
        /* JADX INFO: renamed from: e */
        public S mo48882e(P old, P p8, S state) {
            return (S) this.f46560a.mo48862b(old, p8, state, new b(this.f46561b), this.f46562c);
        }

        @Override // p581ym.AbstractC13218k
        /* JADX INFO: renamed from: f */
        public R mo16431f(P renderProps, S renderState, @NotNull AbstractC13218k<? super P, S, ? extends O, ? extends R>.a context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (R) this.f46560a.mo48865e(renderProps, renderState, context, new c(context, this.f46561b, this), this.f46562c);
        }

        @Override // p581ym.AbstractC13218k
        @Nullable
        /* JADX INFO: renamed from: g */
        public Snapshot mo16432g(S state) {
            return this.f46560a.mo48861a(state, new d(this.f46561b), this.f46562c);
        }

        @NotNull
        public String toString() {
            return "InterceptedWorkflow(" + this.f46561b + ", " + this + "@intercept)";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super P, S, ? extends O, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <P, S, O, R> AbstractC13218k<P, S, O, R> m48921a(@NotNull InterfaceC13227t interfaceC13227t, @NotNull AbstractC13218k<? super P, S, ? extends O, ? extends R> workflow, @NotNull InterfaceC13227t.c workflowSession) {
        Intrinsics.checkNotNullParameter(interfaceC13227t, "<this>");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(workflowSession, "workflowSession");
        return interfaceC13227t == C13212e.f46507a ? workflow : new InterceptedWorkflow(interfaceC13227t, workflow, workflowSession);
    }
}
