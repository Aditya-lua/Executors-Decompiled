package p499vr;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7865g2;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: vr.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003:\u0002 \"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R.\u00104\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103RF\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m31665d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "State", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lku/p0;", "baseScope", "<init>", "(Landroidx/lifecycle/l0;Lku/p0;)V", "T", "Lvr/h;", "worker", "Lkotlin/Function1;", "", "handler", "n", "(Lvr/h;Lkotlin/jvm/functions/Function1;)V", "", "tag", "Lnt/b;", "function", "m", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "newState", "p", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V", "k", "g", "()V", "j", "()Lku/p0;", "a", "Landroidx/lifecycle/l0;", "b", "Lku/p0;", "Lnu/p0;", "c", "Lnu/p0;", "stateFlow", "Luu/a;", "d", "Luu/a;", "mutex", "e", "coroutineScope", "", "Ljava/lang/Class;", "", "Lvr/f$b;", "f", "Ljava/util/Map;", "workers", "Lku/d2;", "sideEffects", "value", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)V", "onStateChangeListener", "i", "()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "state", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12255f<State extends WorkflowState> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 baseScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9592p0<State> stateFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<Class<?>, List<b<?>>> workers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC7850d2> sideEffects;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public Function1<? super State, Unit> onStateChangeListener;

    /* JADX INFO: renamed from: vr.f$b */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lvr/f$b;", "T", "", "Lvr/h;", "worker", "Lkotlin/Function1;", "", "handler", "<init>", "(Lvr/h;Lkotlin/jvm/functions/Function1;)V", "a", "Lvr/h;", "c", "()Lvr/h;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "e", "(Lkotlin/jvm/functions/Function1;)V", "Lku/d2;", "Lku/d2;", "()Lku/d2;", "d", "(Lku/d2;)V", "currentJob", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC12257h<T> worker;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Function1<? super T, Unit> handler;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC7850d2 currentJob;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: vr.h<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull InterfaceC12257h<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.worker = worker;
            this.handler = handler;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC7850d2 getCurrentJob() {
            return this.currentJob;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Function1<T, Unit> m45419b() {
            return this.handler;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final InterfaceC12257h<T> m45420c() {
            return this.worker;
        }

        /* JADX INFO: renamed from: d */
        public final void m45421d(@Nullable InterfaceC7850d2 interfaceC7850d2) {
            this.currentJob = interfaceC7850d2;
        }

        /* JADX INFO: renamed from: e */
        public final void m45422e(@NotNull Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.handler = function1;
        }
    }

    /* JADX INFO: renamed from: vr.f$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningSideEffect$1", m39664f = "WorkflowContextAdapter.kt", m39665l = {127}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f43310t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<InterfaceC9557b<? super Unit>, Object> f43311u;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f43311u = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f43311u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f43310t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Function1<InterfaceC9557b<? super Unit>, Object> function1 = this.f43311u;
                this.f43310t = 1;
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
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
    /* JADX WARN: Unknown type variable: T in type: vr.h<T> */
    /* JADX INFO: renamed from: vr.f$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1", m39664f = "WorkflowContextAdapter.kt", m39665l = {163}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ InterfaceC12257h<T> f43312A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ Function1<T, Unit> f43313B;

        /* JADX INFO: renamed from: t */
        public Object f43314t;

        /* JADX INFO: renamed from: u */
        public Object f43315u;

        /* JADX INFO: renamed from: v */
        public Object f43316v;

        /* JADX INFO: renamed from: w */
        public Object f43317w;

        /* JADX INFO: renamed from: x */
        public int f43318x;

        /* JADX INFO: renamed from: y */
        public int f43319y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ C12255f<State> f43320z;

        /* JADX WARN: Unknown type variable: T in type: java.lang.Class<vr.h<T>> */
        /* JADX WARN: Unknown type variable: T in type: vr.f$b<T> */
        /* JADX WARN: Unknown type variable: T in type: vr.h<T> */
        /* JADX INFO: renamed from: vr.f$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2", m39664f = "WorkflowContextAdapter.kt", m39665l = {102}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f43321t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC12257h<T> f43322u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C12255f<State> f43323v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ Class<InterfaceC12257h<T>> f43324w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ b<T> f43325x;

            /* JADX INFO: renamed from: vr.f$d$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14272a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C12255f<State> f43326a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ b<T> f43327b;

                /* JADX INFO: renamed from: vr.f$d$a$a$a, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
                @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2$1$1", m39664f = "WorkflowContextAdapter.kt", m39665l = {}, m39666m = "invokeSuspend")
                public static final class C14273a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t */
                    public int f43328t;

                    /* JADX INFO: renamed from: u */
                    public final /* synthetic */ b<T> f43329u;

                    /* JADX INFO: renamed from: v */
                    public final /* synthetic */ T f43330v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14273a(b<T> bVar, T t8, InterfaceC9557b<? super C14273a> interfaceC9557b) {
                        super(2, interfaceC9557b);
                        this.f43329u = bVar;
                        this.f43330v = t8;
                    }

                    @Override // pt.AbstractC10339a
                    public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                        return new C14273a(this.f43329u, this.f43330v, interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        C10047c.m38805e();
                        if (this.f43328t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        this.f43329u.m45419b().invoke(this.f43330v);
                        return Unit.f29331a;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                        return ((C14273a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                    }
                }

                public C14272a(C12255f<State> c12255f, b<T> bVar) {
                    this.f43326a = c12255f;
                    this.f43327b = bVar;
                }

                @Override // nu.InterfaceC9577i
                public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    C7882k.m32780d(this.f43326a.coroutineScope, null, null, new C14273a(this.f43327b, t8, null), 3, null);
                    return Unit.f29331a;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: vr.h<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: java.lang.Class<vr.h<T>> */
            /* JADX WARN: Unknown type variable: T in type: vr.f$b<T> */
            /* JADX WARN: Unknown type variable: T in type: vr.h<? extends T> */
            public a(InterfaceC12257h<? extends T> interfaceC12257h, C12255f<State> c12255f, Class<InterfaceC12257h<T>> cls, b<T> bVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f43322u = interfaceC12257h;
                this.f43323v = c12255f;
                this.f43324w = cls;
                this.f43325x = bVar;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f43322u, this.f43323v, this.f43324w, this.f43325x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f43321t;
                try {
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC9575h interfaceC9575hRun = this.f43322u.run();
                        C14272a c14272a = new C14272a(this.f43323v, this.f43325x);
                        this.f43321t = 1;
                        if (interfaceC9575hRun.collect(c14272a, this) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                } catch (Exception unused) {
                }
                Map map = this.f43323v.workers;
                GenericDeclaration genericDeclaration = this.f43324w;
                Object arrayList = this.f43323v.workers.get(this.f43324w);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                map.put(genericDeclaration, CollectionsKt.m31724v0((Iterable) arrayList, this.f43325x));
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: vr.h<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Unknown type variable: T in type: vr.h<? extends T> */
        public d(C12255f<State> c12255f, InterfaceC12257h<? extends T> interfaceC12257h, Function1<? super T, Unit> function1, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f43320z = c12255f;
            this.f43312A = interfaceC12257h;
            this.f43313B = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f43320z, this.f43312A, this.f43313B, interfaceC9557b);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: vr.h */
        /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: vr.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            InterfaceC12257h interfaceC12257h;
            C12255f<State> c12255f;
            Function1 function1;
            Object next;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f43319y;
            int i11 = 0;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = this.f43320z.mutex;
                interfaceC12257h = this.f43312A;
                c12255f = this.f43320z;
                Function1 function2 = this.f43313B;
                this.f43314t = interfaceC11970a;
                this.f43315u = interfaceC12257h;
                this.f43316v = c12255f;
                this.f43317w = function2;
                this.f43318x = 0;
                this.f43319y = 1;
                if (interfaceC11970a.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f43317w;
                c12255f = (C12255f) this.f43316v;
                interfaceC12257h = (InterfaceC12257h) this.f43315u;
                interfaceC11970a = (InterfaceC11970a) this.f43314t;
                C7348o.m30470b(obj);
            }
            C12255f<State> c12255f2 = c12255f;
            InterfaceC11970a interfaceC11970a2 = interfaceC11970a;
            InterfaceC12257h interfaceC12257h2 = interfaceC12257h;
            try {
                Class<?> cls = interfaceC12257h2.getClass();
                Object arrayList = c12255f2.workers.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list = (List) arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((b) obj2).m45420c().mo7572a(interfaceC12257h2)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((b) next).m45420c().mo7574c(interfaceC12257h2));
                b bVar = (b) next;
                if (bVar != null) {
                    Intrinsics.m31981d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>");
                    bVar.m45422e((Function1) C7739h0.m32040e(function1, 1));
                    Unit unit = Unit.f29331a;
                    interfaceC11970a2.mo44673e(null);
                    return unit;
                }
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        InterfaceC7850d2 currentJob = ((b) obj3).getCurrentJob();
                        if (currentJob != null) {
                            InterfaceC7850d2.a.m32603a(currentJob, null, 1, null);
                        }
                    }
                }
                b bVar2 = new b(interfaceC12257h2, function1);
                c12255f2.workers.put(cls, CollectionsKt.m31726x0(list, bVar2));
                bVar2.m45421d(C7882k.m32780d(c12255f2.coroutineScope, null, null, new a(interfaceC12257h2, c12255f2, cls, bVar2, null), 3, null));
                Unit unit2 = Unit.f29331a;
                interfaceC11970a2.mo44673e(null);
                return Unit.f29331a;
            } catch (Throwable th2) {
                interfaceC11970a2.mo44673e(null);
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: vr.f$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1", m39664f = "WorkflowContextAdapter.kt", m39665l = {163}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f43331t;

        /* JADX INFO: renamed from: u */
        public Object f43332u;

        /* JADX INFO: renamed from: v */
        public Object f43333v;

        /* JADX INFO: renamed from: w */
        public int f43334w;

        /* JADX INFO: renamed from: x */
        public int f43335x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C12255f<State> f43336y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ State f43337z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C12255f<State> c12255f, State state, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f43336y = c12255f;
            this.f43337z = state;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f43336y, this.f43337z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C12255f<State> c12255f;
            InterfaceC11970a interfaceC11970a;
            WorkflowState workflowState;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f43335x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC11970a interfaceC11970a2 = this.f43336y.mutex;
                c12255f = this.f43336y;
                State state = this.f43337z;
                this.f43331t = interfaceC11970a2;
                this.f43332u = c12255f;
                this.f43333v = state;
                this.f43334w = 0;
                this.f43335x = 1;
                if (interfaceC11970a2.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                interfaceC11970a = interfaceC11970a2;
                workflowState = state;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflowState = (WorkflowState) this.f43333v;
                c12255f = (C12255f) this.f43332u;
                interfaceC11970a = (InterfaceC11970a) this.f43331t;
                C7348o.m30470b(obj);
            }
            try {
                c12255f.m45413k(workflowState);
                c12255f.savedStateHandle.m4954i("WorkflowContextAdapter.state", workflowState);
                c12255f.m45410h().invoke(workflowState);
                Unit unit = Unit.f29331a;
                return Unit.f29331a;
            } finally {
                interfaceC11970a.mo44673e(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C12255f(@NotNull C0967l0 savedStateHandle, @NotNull InterfaceC7906p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.savedStateHandle = savedStateHandle;
        this.baseScope = baseScope;
        this.stateFlow = savedStateHandle.m4951f("WorkflowContextAdapter.state", null);
        this.mutex = C11976g.m44697b(false, 1, null);
        this.coroutineScope = m45412j();
        this.workers = new LinkedHashMap();
        this.sideEffects = new LinkedHashMap();
        this.onStateChangeListener = new Function1() { // from class: vr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12255f.m45408l((WorkflowState) obj);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m45408l(WorkflowState workflowState) {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public final void m45409g() {
        C7910q0.m32890f(this.coroutineScope, null, 1, null);
        this.coroutineScope = m45412j();
        this.workers.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Function1<State, Unit> m45410h() {
        return this.onStateChangeListener;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final State m45411i() {
        return this.stateFlow.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC7906p0 m45412j() {
        return C7910q0.m32885a(C7864g1.m32645c().plus(C7948z2.m32942a(C7865g2.m32654h(this.baseScope.getCoroutineContext()))));
    }

    /* JADX INFO: renamed from: k */
    public final void m45413k(State newState) {
        WorkflowState workflowStateM45411i = m45411i();
        if (newState == null || !(workflowStateM45411i == null || workflowStateM45411i.mo16478t0(newState))) {
            m45409g();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m45414m(@NotNull String tag, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(function, "function");
        InterfaceC7850d2 interfaceC7850d2 = this.sideEffects.get(tag);
        if (interfaceC7850d2 == null || !interfaceC7850d2.mo32556b()) {
            this.sideEffects.put(tag, C7882k.m32780d(this.coroutineScope, null, null, new c(function, null), 3, null));
        }
    }

    /* JADX INFO: renamed from: n */
    public final <T> void m45415n(@NotNull InterfaceC12257h<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(handler, "handler");
        C7882k.m32780d(this.coroutineScope, C7864g1.m32646d(), null, new d(this, worker, handler, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m45416o(@NotNull Function1<? super State, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onStateChangeListener = value;
        value.invoke(m45411i());
    }

    /* JADX INFO: renamed from: p */
    public final void m45417p(State newState) {
        C7882k.m32780d(this.coroutineScope, C7864g1.m32646d(), null, new e(this, newState, null), 2, null);
    }
}
