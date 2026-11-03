package xm;

import com.google.mlkit.vision.barcode.common.Barcode;
import gt.o;
import iu.CoroutineName;
import iu.d2;
import iu.g2;
import iu.p0;
import iu.q0;
import iu.r0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.WorkflowOutput;
import wm.r;
import wm.s;
import wm.t;
import wm.u;
import wm.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001f\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b!\u0010\"J>\u0010(\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\"\u0010'\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020&\"\u0004\b\u0004\u0010*2\u0014\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010,0+¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020&2\u0010\b\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00105\u001a\u00028\u0000H\u0002¢\u0006\u0004\b6\u0010 J7\u00108\u001a\u00020&2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00107\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109J5\u0010<\u001a\u0004\u0018\u00018\u0004\"\b\b\u0004\u0010**\u00020\u00122\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:H\u0002¢\u0006\u0004\b<\u0010=J>\u0010?\u001a\u00020>2\u0006\u0010#\u001a\u00020\u001b2\"\u0010'\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010JR\u001a\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010W\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010YR\u0016\u0010]\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R,\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010_R\u0016\u0010b\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010e\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010dR\u0014\u0010f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lxm/j;", "PropsT", "StateT", "OutputT", "RenderingT", "Liu/p0;", "Lxm/f$b;", "Lwm/t$c;", "Lxm/k;", "id", "Lwm/k;", "workflow", "initialProps", "Lwm/m;", "snapshot", "Lkotlin/coroutines/CoroutineContext;", "baseContext", "Lkotlin/Function1;", "", "emitOutputToParent", "parent", "Lwm/t;", "interceptor", "Lxm/d;", "idCounter", "<init>", "(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V", "", "toString", "()Ljava/lang/String;", "input", "m", "(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;", "o", "(Lwm/k;)Lwm/m;", "key", "Lkotlin/Function2;", "Llt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "T", "Lru/d;", "Lwm/v;", "selector", "p", "(Lru/d;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "e", "(Ljava/util/concurrent/CancellationException;)V", "props", "n", "newProps", "q", "(Lwm/k;Ljava/lang/Object;)V", "Lwm/r;", "action", "d", "(Lwm/r;)Ljava/lang/Object;", "Lxm/g;", "g", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lxm/g;", "a", "Lxm/k;", "h", "()Lxm/k;", "Lkotlin/jvm/functions/Function1;", "c", "Lwm/t$c;", "j", "()Lwm/t$c;", "Lwm/t;", "Lkotlin/coroutines/CoroutineContext;", "I", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "f", "J", "l", "()J", "sessionId", "Lxm/h;", "Lxm/h;", "subtreeManager", "Lxm/a;", "Lxm/a;", "sideEffects", "i", "Ljava/lang/Object;", "lastProps", "Lku/g;", "Lku/g;", "eventActionsChannel", "k", "state", "Lwm/s;", "()Lwm/s;", "identifier", "renderKey", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class j<PropsT, StateT, OutputT, RenderingT> implements p0, f.b, t.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkflowNodeId id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<OutputT, Object> emitOutputToParent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final t.c parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t interceptor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long sessionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<PropsT, StateT, OutputT> subtreeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xm.a<g> sideEffects;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public PropsT lastProps;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.g<r<PropsT, StateT, OutputT>> eventActionsChannel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public StateT state;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "it", "Lwm/v;", "a", "(Ljava/lang/Object;)Lwm/v;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<OutputT, WorkflowOutput<? extends OutputT>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f35825i = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowOutput<OutputT> invoke(OutputT outputt) {
            return new WorkflowOutput<>(outputt);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lxm/k;", "Lwm/m;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function0<Map<WorkflowNodeId, ? extends wm.m>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Map<WorkflowNodeId, wm.m> f35826i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<WorkflowNodeId, wm.m> map) {
            super(0);
            this.f35826i = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<WorkflowNodeId, wm.m> invoke() {
            return this.f35826i;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements Function1<r<? super PropsT, StateT, ? extends OutputT>, Object> {
        public c(Object obj) {
            super(1, obj, j.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull r<? super PropsT, StateT, ? extends OutputT> p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return ((j) this.receiver).d(p8);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @nt.f(c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", f = "WorkflowNode.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "PropsT", "StateT", "OutputT", "RenderingT", "Lwm/r;", "action", "Lwm/v;", "<anonymous>", "(Lwm/r;)Lwm/v;"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> extends nt.m implements Function2<r<? super PropsT, StateT, ? extends OutputT>, lt.b<? super WorkflowOutput<? extends T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35827t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35828u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j<PropsT, StateT, OutputT, RenderingT> f35829v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j<PropsT, StateT, OutputT, RenderingT> jVar, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f35829v = jVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            d dVar = new d(this.f35829v, bVar);
            dVar.f35828u = obj;
            return dVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mt.c.e();
            if (this.f35827t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f35829v.d((r) this.f35828u);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @Nullable lt.b<? super WorkflowOutput<? extends T>> bVar) {
            return ((d) create(rVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull WorkflowNodeId id2, @NotNull wm.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst, @Nullable wm.m mVar, @NotNull CoroutineContext baseContext, @NotNull Function1<? super OutputT, ? extends Object> emitOutputToParent, @Nullable t.c cVar, @NotNull t interceptor, @Nullable xm.d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(emitOutputToParent, "emitOutputToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.id = id2;
        this.emitOutputToParent = emitOutputToParent;
        this.parent = cVar;
        this.interceptor = interceptor;
        this.coroutineContext = baseContext.plus(g2.a((d2) baseContext.get(d2.INSTANCE))).plus(new CoroutineName(id2.toString()));
        this.sessionId = dVar == null ? 0L : dVar.a();
        this.subtreeManager = new h<>(mVar == null ? null : mVar.a(), getCoroutineContext(), new c(this), this, interceptor, dVar);
        this.sideEffects = new xm.a<>();
        this.lastProps = propst;
        this.eventActionsChannel = ku.j.b(Integer.MAX_VALUE, null, null, 6, null);
        interceptor.c(this, this);
        this.state = (StateT) u.a(interceptor, workflow, this).d(propst, mVar != null ? mVar.b() : null);
    }

    public static /* synthetic */ void f(j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        jVar.e(cancellationException);
    }

    @Override // iu.p0
    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // xm.f.b
    public void b(@NotNull String key, @NotNull Function2<? super p0, ? super lt.b<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        for (e.a aVarB = this.sideEffects.staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            if (Intrinsics.c(key, ((g) aVarB).getKey())) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + '\"').toString());
            }
        }
        xm.a<g> aVar = this.sideEffects;
        e eVar = aVar.active;
        e.a aVarG = null;
        e.a aVar2 = null;
        for (e.a aVarB2 = eVar.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            if (Intrinsics.c(key, ((g) aVarB2).getKey())) {
                if (aVar2 == null) {
                    eVar.e(aVarB2.getNextListNode());
                } else {
                    aVar2.b(aVarB2.getNextListNode());
                }
                if (Intrinsics.c(eVar.c(), aVarB2)) {
                    eVar.f(aVar2);
                }
                aVarB2.b(null);
                aVarG = aVarB2;
                break;
            }
            aVar2 = aVarB2;
        }
        if (aVarG == null) {
            aVarG = g(key, sideEffect);
        }
        aVar.staging.d(aVarG);
    }

    public final <T> T d(r<? super PropsT, StateT, ? extends OutputT> action) {
        Pair pairH = w.h(action, this.lastProps, this.state);
        StateT statet = (StateT) pairH.a();
        WorkflowOutput workflowOutput = (WorkflowOutput) pairH.b();
        this.state = statet;
        if (workflowOutput == null) {
            return null;
        }
        return (T) this.emitOutputToParent.invoke((OutputT) workflowOutput.a());
    }

    public final void e(@Nullable CancellationException cause) {
        g2.c(getCoroutineContext(), cause);
    }

    public final g g(String key, Function2<? super p0, ? super lt.b<? super Unit>, ? extends Object> sideEffect) {
        return new g(key, iu.k.d(q0.j(this, new CoroutineName("sideEffect[" + key + "] for " + this.id)), null, r0.LAZY, sideEffect, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final WorkflowNodeId getId() {
        return this.id;
    }

    @NotNull
    public s i() {
        return this.id.getIdentifier();
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public t.c getParent() {
        return this.parent;
    }

    @NotNull
    public String k() {
        return this.id.getName();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public long getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RenderingT m(@NotNull wm.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT input) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return n(workflow, input);
    }

    public final RenderingT n(wm.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT props) {
        q(workflow, props);
        f fVar = new f(this.subtreeManager, this, this.eventActionsChannel);
        RenderingT renderingt = (RenderingT) u.a(this.interceptor, workflow, this).f(props, this.state, w.a(fVar, workflow));
        fVar.f();
        this.subtreeManager.c();
        for (e.a aVarB = this.sideEffects.staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            ((g) aVarB).getJob().start();
        }
        xm.a<g> aVar = this.sideEffects;
        for (e.a aVarB2 = aVar.active.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            d2.a.a(((g) aVarB2).getJob(), null, 1, null);
        }
        e eVar = aVar.active;
        aVar.active = aVar.staging;
        aVar.staging = eVar;
        aVar.staging.a();
        return renderingt;
    }

    @NotNull
    public final wm.m o(@NotNull wm.k<?, ?, ?, ?> workflow) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return new wm.m(u.a(this.interceptor, workflow, this).g(this.state), new b(this.subtreeManager.f()));
    }

    public final <T> void p(@NotNull ru.d<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.subtreeManager.g(selector);
        selector.a(this.eventActionsChannel.B(), new d(this, null));
    }

    public final void q(wm.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT newProps) {
        if (!Intrinsics.c(newProps, this.lastProps)) {
            this.state = (StateT) u.a(this.interceptor, workflow, this).e(this.lastProps, newProps, this.state);
        }
        this.lastProps = newProps;
    }

    @NotNull
    public String toString() {
        return "WorkflowInstance(identifier=" + i() + ", renderKey=" + k() + ", instanceId=" + getSessionId() + ", parent=" + ((Object) (getParent() == null ? null : "WorkflowInstance(…)")) + ')';
    }

    public /* synthetic */ j(WorkflowNodeId workflowNodeId, wm.k kVar, Object obj, wm.m mVar, CoroutineContext coroutineContext, Function1 function1, t.c cVar, t tVar, xm.d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowNodeId, kVar, obj, mVar, coroutineContext, (i10 & 32) != 0 ? a.f35825i : function1, (i10 & 64) != 0 ? null : cVar, (i10 & 128) != 0 ? wm.e.f34560a : tVar, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : dVar);
    }
}
