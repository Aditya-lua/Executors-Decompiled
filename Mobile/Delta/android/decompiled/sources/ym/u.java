package ym;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"P", "S", "O", "R", "Lym/t;", "Lym/k;", "workflow", "Lym/t$c;", "workflowSession", "a", "(Lym/t;Lym/k;Lym/t$c;)Lym/k;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class u {

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    /* JADX INFO: renamed from: ym.u$a, reason: from toString */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001J!\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"ym/u$a", "Lym/k;", "props", "Lym/i;", "snapshot", "d", "(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Lym/k$a;", "context", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Lym/i;", "", "toString", "()Ljava/lang/String;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class InterceptedWorkflow<O, P, R, S> extends k<P, S, O, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f35974a;
        public final /* synthetic */ k<P, S, O, R> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t.c f35975c;

        /* JADX INFO: renamed from: ym.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class C0666a extends kotlin.jvm.internal.k implements Function2<P, Snapshot, S> {
            public C0666a(Object obj) {
                super(2, obj, k.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final S invoke(P p8, @Nullable Snapshot snapshot) {
                return (S) ((k) this.receiver).d(p8, snapshot);
            }
        }

        /* JADX INFO: renamed from: ym.u$a$b */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class b extends kotlin.jvm.internal.k implements zt.n<P, P, S, S> {
            public b(Object obj) {
                super(3, obj, k.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @Override // zt.n
            public final S invoke(P p8, P p10, S s8) {
                return (S) ((k) this.receiver).e(p8, p10, s8);
            }
        }

        /* JADX INFO: renamed from: ym.u$a$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "props", "state", "Lym/t$b;", "interceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class c extends kotlin.jvm.internal.m implements zt.n<P, S, t.b<P, S, O>, R> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ k<P, S, O, R>.a f35976i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ k<P, S, O, R> f35977j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ InterceptedWorkflow f35978k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(k<? super P, S, ? extends O, ? extends R>.a aVar, k<? super P, S, ? extends O, ? extends R> kVar, InterceptedWorkflow interceptedWorkflow) {
                super(3);
                this.f35976i = aVar;
                this.f35977j = kVar;
                this.f35978k = interceptedWorkflow;
            }

            @Override // zt.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p8, S s8, @Nullable t.b<P, S, O> bVar) {
                a dVar = bVar == null ? null : new ym.d(this.f35976i, bVar);
                if (dVar == null) {
                    dVar = this.f35976i;
                }
                return this.f35977j.f(p8, s8, w.a(dVar, this.f35978k));
            }
        }

        /* JADX INFO: renamed from: ym.u$a$d */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class d extends kotlin.jvm.internal.k implements Function1<S, Snapshot> {
            public d(Object obj) {
                super(1, obj, k.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Snapshot invoke(S s8) {
                return ((k) this.receiver).g(s8);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InterceptedWorkflow(t tVar, k<? super P, S, ? extends O, ? extends R> kVar, t.c cVar) {
            this.f35974a = tVar;
            this.b = kVar;
            this.f35975c = cVar;
        }

        @Override // ym.k
        public S d(P props, @Nullable Snapshot snapshot) {
            return (S) this.f35974a.d(props, snapshot, new C0666a(this.b), this.f35975c);
        }

        @Override // ym.k
        public S e(P old, P p8, S state) {
            return (S) this.f35974a.b(old, p8, state, new b(this.b), this.f35975c);
        }

        @Override // ym.k
        public R f(P renderProps, S renderState, @NotNull k<? super P, S, ? extends O, ? extends R>.a context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (R) this.f35974a.e(renderProps, renderState, context, new c(context, this.b, this), this.f35975c);
        }

        @Override // ym.k
        @Nullable
        public Snapshot g(S state) {
            return this.f35974a.a(state, new d(this.b), this.f35975c);
        }

        @NotNull
        public String toString() {
            return "InterceptedWorkflow(" + this.b + ", " + this + "@intercept)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <P, S, O, R> k<P, S, O, R> a(@NotNull t tVar, @NotNull k<? super P, S, ? extends O, ? extends R> workflow, @NotNull t.c workflowSession) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(workflowSession, "workflowSession");
        return tVar == e.f35931a ? workflow : new InterceptedWorkflow(tVar, workflow, workflowSession);
    }
}
