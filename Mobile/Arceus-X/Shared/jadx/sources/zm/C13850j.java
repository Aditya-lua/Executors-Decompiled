package zm;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.C8675j;
import mu.InterfaceC8672g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7865g2;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.CoroutineName;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p452tu.InterfaceC11752d;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13212e;
import p581ym.C13220m;
import p581ym.C13226s;
import p581ym.C13228u;
import p581ym.C13230w;
import p581ym.InterfaceC13227t;
import p581ym.WorkflowOutput;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zm.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001f\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b!\u0010\"J>\u0010(\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\"\u0010'\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020&\"\u0004\b\u0004\u0010*2\u0014\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010,0+¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020&2\u0010\b\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00105\u001a\u00028\u0000H\u0002¢\u0006\u0004\b6\u0010 J7\u00108\u001a\u00020&2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00107\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109J5\u0010<\u001a\u0004\u0018\u00018\u0004\"\b\b\u0004\u0010**\u00020\u00122\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:H\u0002¢\u0006\u0004\b<\u0010=J>\u0010?\u001a\u00020>2\u0006\u0010#\u001a\u00020\u001b2\"\u0010'\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010JR\u001a\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010W\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010YR\u0016\u0010]\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R,\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010_R\u0016\u0010b\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010e\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010dR\u0014\u0010f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, m31665d2 = {"Lzm/j;", "PropsT", "StateT", "OutputT", "RenderingT", "Lku/p0;", "Lzm/f$b;", "Lym/t$c;", "Lzm/k;", "id", "Lym/k;", "workflow", "initialProps", "Lym/m;", "snapshot", "Lkotlin/coroutines/CoroutineContext;", "baseContext", "Lkotlin/Function1;", "", "emitOutputToParent", "parent", "Lym/t;", "interceptor", "Lzm/d;", "idCounter", "<init>", "(Lzm/k;Lym/k;Ljava/lang/Object;Lym/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lym/t$c;Lym/t;Lzm/d;)V", "", "toString", "()Ljava/lang/String;", "input", "m", "(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;", "o", "(Lym/k;)Lym/m;", "key", "Lkotlin/Function2;", "Lnt/b;", "", "sideEffect", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "T", "Ltu/d;", "Lym/v;", "selector", "p", "(Ltu/d;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "e", "(Ljava/util/concurrent/CancellationException;)V", "props", "n", "newProps", "q", "(Lym/k;Ljava/lang/Object;)V", "Lym/r;", "action", "d", "(Lym/r;)Ljava/lang/Object;", "Lzm/g;", "g", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lzm/g;", "a", "Lzm/k;", "h", "()Lzm/k;", "Lkotlin/jvm/functions/Function1;", "c", "Lym/t$c;", "j", "()Lym/t$c;", "Lym/t;", "Lkotlin/coroutines/CoroutineContext;", "H", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "f", "J", "l", "()J", "sessionId", "Lzm/h;", "Lzm/h;", "subtreeManager", "Lzm/a;", "Lzm/a;", "sideEffects", "i", "Ljava/lang/Object;", "lastProps", "Lmu/g;", "Lmu/g;", "eventActionsChannel", "k", "state", "Lym/s;", "()Lym/s;", "identifier", "renderKey", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13850j<PropsT, StateT, OutputT, RenderingT> implements InterfaceC7906p0, C13846f.b, InterfaceC13227t.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkflowNodeId id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<OutputT, Object> emitOutputToParent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC13227t.c parent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13227t interceptor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long sessionId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C13848h<PropsT, StateT, OutputT> subtreeManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C13841a<C13847g> sideEffects;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PropsT lastProps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8672g<AbstractC13225r<PropsT, StateT, OutputT>> eventActionsChannel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public StateT state;

    /* JADX INFO: renamed from: zm.j$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "it", "Lym/v;", "a", "(Ljava/lang/Object;)Lym/v;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function1<OutputT, WorkflowOutput<? extends OutputT>> {

        /* JADX INFO: renamed from: i */
        public static final a f48530i = new a();

        public a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowOutput<OutputT> invoke(OutputT outputt) {
            return new WorkflowOutput<>(outputt);
        }
    }

    /* JADX INFO: renamed from: zm.j$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31665d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lzm/k;", "Lym/m;", "b", "()Ljava/util/Map;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function0<Map<WorkflowNodeId, ? extends C13220m>> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Map<WorkflowNodeId, C13220m> f48531i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<WorkflowNodeId, C13220m> map) {
            super(0);
            this.f48531i = map;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<WorkflowNodeId, C13220m> invoke() {
            return this.f48531i;
        }
    }

    /* JADX INFO: renamed from: zm.j$c */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public /* synthetic */ class c extends C7744k implements Function1<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>, Object> {
        public c(Object obj) {
            super(1, obj, C13850j.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT> p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return ((C13850j) this.receiver).m50393d(p8);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: zm.j$d */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"T", "PropsT", "StateT", "OutputT", "RenderingT", "Lym/r;", "action", "Lym/v;", "<anonymous>", "(Lym/r;)Lym/v;"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", m39664f = "WorkflowNode.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class d<T> extends AbstractC10351m implements Function2<AbstractC13225r<? super PropsT, StateT, ? extends OutputT>, InterfaceC9557b<? super WorkflowOutput<? extends T>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48532t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48533u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13850j<PropsT, StateT, OutputT, RenderingT> f48534v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C13850j<PropsT, StateT, OutputT, RenderingT> c13850j, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48534v = c13850j;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            d dVar = new d(this.f48534v, interfaceC9557b);
            dVar.f48533u = obj;
            return dVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f48532t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return this.f48534v.m50393d((AbstractC13225r) this.f48533u);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT> abstractC13225r, @Nullable InterfaceC9557b<? super WorkflowOutput<? extends T>> interfaceC9557b) {
            return ((d) create(abstractC13225r, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super OutputT, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13850j(@NotNull WorkflowNodeId id2, @NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst, @Nullable C13220m c13220m, @NotNull CoroutineContext baseContext, @NotNull Function1<? super OutputT, ? extends Object> emitOutputToParent, @Nullable InterfaceC13227t.c cVar, @NotNull InterfaceC13227t interceptor, @Nullable C13844d c13844d) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(emitOutputToParent, "emitOutputToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.id = id2;
        this.emitOutputToParent = emitOutputToParent;
        this.parent = cVar;
        this.interceptor = interceptor;
        this.coroutineContext = baseContext.plus(C7865g2.m32647a((InterfaceC7850d2) baseContext.get(InterfaceC7850d2.INSTANCE))).plus(new CoroutineName(id2.toString()));
        this.sessionId = c13844d == null ? 0L : c13844d.m50358a();
        this.subtreeManager = new C13848h<>(c13220m == null ? null : c13220m.m48885a(), getCoroutineContext(), new c(this), this, interceptor, c13844d);
        this.sideEffects = new C13841a<>();
        this.lastProps = propst;
        this.eventActionsChannel = C8675j.m34927b(Integer.MAX_VALUE, null, null, 6, null);
        interceptor.mo48863c(this, this);
        this.state = (StateT) C13228u.m48921a(interceptor, workflow, this).mo16430d(propst, c13220m != null ? c13220m.m48886b() : null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m50392f(C13850j c13850j, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c13850j.m50394e(cancellationException);
    }

    @Override // p256ku.InterfaceC7906p0
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // zm.C13846f.b
    /* JADX INFO: renamed from: b */
    public void mo50371b(@NotNull String key, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        for (C13845e.a aVarM50360b = this.sideEffects.staging.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            if (Intrinsics.m31980c(key, ((C13847g) aVarM50360b).getKey())) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + '\"').toString());
            }
        }
        C13841a<C13847g> c13841a = this.sideEffects;
        C13845e c13845e = c13841a.active;
        C13845e.a aVarM50395g = null;
        C13845e.a aVar = null;
        for (C13845e.a aVarM50360b2 = c13845e.m50360b(); aVarM50360b2 != null; aVarM50360b2 = aVarM50360b2.getNextListNode()) {
            if (Intrinsics.m31980c(key, ((C13847g) aVarM50360b2).getKey())) {
                if (aVar == null) {
                    c13845e.m50363e(aVarM50360b2.getNextListNode());
                } else {
                    aVar.mo50366b(aVarM50360b2.getNextListNode());
                }
                if (Intrinsics.m31980c(c13845e.m50361c(), aVarM50360b2)) {
                    c13845e.m50364f(aVar);
                }
                aVarM50360b2.mo50366b(null);
                aVarM50395g = aVarM50360b2;
                break;
            }
            aVar = aVarM50360b2;
        }
        if (aVarM50395g == null) {
            aVarM50395g = m50395g(key, sideEffect);
        }
        c13841a.staging.m50362d(aVarM50395g);
    }

    /* JADX INFO: renamed from: d */
    public final <T> T m50393d(AbstractC13225r<? super PropsT, StateT, ? extends OutputT> action) {
        Pair pairM48933h = C13230w.m48933h(action, this.lastProps, this.state);
        StateT statet = (StateT) pairM48933h.m31671a();
        WorkflowOutput workflowOutput = (WorkflowOutput) pairM48933h.m31672b();
        this.state = statet;
        if (workflowOutput == null) {
            return null;
        }
        return (T) this.emitOutputToParent.invoke((OutputT) workflowOutput.m48925a());
    }

    /* JADX INFO: renamed from: e */
    public final void m50394e(@Nullable CancellationException cause) {
        C7865g2.m32649c(getCoroutineContext(), cause);
    }

    /* JADX INFO: renamed from: g */
    public final C13847g m50395g(String key, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect) {
        return new C13847g(key, C7882k.m32780d(C7910q0.m32894j(this, new CoroutineName("sideEffect[" + key + "] for " + this.id)), null, EnumC7914r0.LAZY, sideEffect, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final WorkflowNodeId getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public C13226s m50397i() {
        return this.id.getIdentifier();
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public InterfaceC13227t.c getParent() {
        return this.parent;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public String m50399k() {
        return this.id.getName();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public long getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final RenderingT m50401m(@NotNull AbstractC13218k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT input) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return m50402n(workflow, input);
    }

    /* JADX INFO: renamed from: n */
    public final RenderingT m50402n(AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT props) {
        m50405q(workflow, props);
        C13846f c13846f = new C13846f(this.subtreeManager, this, this.eventActionsChannel);
        RenderingT renderingt = (RenderingT) C13228u.m48921a(this.interceptor, workflow, this).mo16431f(props, this.state, C13230w.m48926a(c13846f, workflow));
        c13846f.m50368f();
        this.subtreeManager.m50378c();
        for (C13845e.a aVarM50360b = this.sideEffects.staging.m50360b(); aVarM50360b != null; aVarM50360b = aVarM50360b.getNextListNode()) {
            ((C13847g) aVarM50360b).getJob().start();
        }
        C13841a<C13847g> c13841a = this.sideEffects;
        for (C13845e.a aVarM50360b2 = c13841a.active.m50360b(); aVarM50360b2 != null; aVarM50360b2 = aVarM50360b2.getNextListNode()) {
            InterfaceC7850d2.a.m32603a(((C13847g) aVarM50360b2).getJob(), null, 1, null);
        }
        C13845e c13845e = c13841a.active;
        c13841a.active = c13841a.staging;
        c13841a.staging = c13845e;
        c13841a.staging.m50359a();
        return renderingt;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final C13220m m50403o(@NotNull AbstractC13218k<?, ?, ?, ?> workflow) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return new C13220m(C13228u.m48921a(this.interceptor, workflow, this).mo16432g(this.state), new b(this.subtreeManager.m50380f()));
    }

    /* JADX INFO: renamed from: p */
    public final <T> void m50404p(@NotNull InterfaceC11752d<? super WorkflowOutput<? extends T>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.subtreeManager.m50381g(selector);
        selector.mo43993c(this.eventActionsChannel.mo34874z(), new d(this, null));
    }

    /* JADX INFO: renamed from: q */
    public final void m50405q(AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT newProps) {
        if (!Intrinsics.m31980c(newProps, this.lastProps)) {
            this.state = (StateT) C13228u.m48921a(this.interceptor, workflow, this).mo48882e(this.lastProps, newProps, this.state);
        }
        this.lastProps = newProps;
    }

    @NotNull
    public String toString() {
        return "WorkflowInstance(identifier=" + m50397i() + ", renderKey=" + m50399k() + ", instanceId=" + getSessionId() + ", parent=" + ((Object) (getParent() == null ? null : "WorkflowInstance(…)")) + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
      (r13v0 zm.k A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r14v0 ym.k A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r15v0 java.lang.Object A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r16v0 ym.m A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r17v0 kotlin.coroutines.CoroutineContext A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0002: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0008: SGET  A[WRAPPED] (LINE:21) zm.j.a.i zm.j$a) : (r18v0 kotlin.jvm.functions.Function1))
      (wrap ym.t$c:?: TERNARY null = ((wrap int:0x000c: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null ym.t$c) : (r19v0 ym.t$c))
      (wrap ym.t:?: TERNARY null = ((wrap int:0x0015: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x001b: SGET  A[WRAPPED] (LINE:22) ym.e.a ym.e) : (r20v0 ym.t))
      (wrap zm.d:?: TERNARY null = ((wrap int:0x001f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null zm.d) : (r21v0 zm.d))
     A[MD:(zm.k, ym.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>, PropsT, ym.m, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1<? super OutputT, ? extends java.lang.Object>, ym.t$c, ym.t, zm.d):void (m)] (LINE:23) call: zm.j.<init>(zm.k, ym.k, java.lang.Object, ym.m, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1, ym.t$c, ym.t, zm.d):void type: THIS */
    public /* synthetic */ C13850j(WorkflowNodeId workflowNodeId, AbstractC13218k abstractC13218k, Object obj, C13220m c13220m, CoroutineContext coroutineContext, Function1 function1, InterfaceC13227t.c cVar, InterfaceC13227t interfaceC13227t, C13844d c13844d, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowNodeId, abstractC13218k, obj, c13220m, coroutineContext, (i10 & 32) != 0 ? a.f48530i : function1, (i10 & 64) != 0 ? null : cVar, (i10 & 128) != 0 ? C13212e.f46507a : interfaceC13227t, (i10 & 256) != 0 ? null : c13844d);
    }
}
