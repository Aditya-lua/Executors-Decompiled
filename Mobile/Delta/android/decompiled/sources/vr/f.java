package vr;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import ku.d2;
import ku.g1;
import ku.g2;
import ku.k;
import ku.p0;
import ku.q0;
import ku.z2;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003:\u0002 \"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R.\u00104\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103RF\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lvr/f;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "State", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lku/p0;", "baseScope", "<init>", "(Landroidx/lifecycle/l0;Lku/p0;)V", "T", "Lvr/h;", "worker", "Lkotlin/Function1;", "", "handler", "n", "(Lvr/h;Lkotlin/jvm/functions/Function1;)V", "", "tag", "Lnt/b;", "function", "m", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "newState", "p", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V", "k", "g", "()V", "j", "()Lku/p0;", "a", "Landroidx/lifecycle/l0;", "b", "Lku/p0;", "Lnu/p0;", "c", "Lnu/p0;", "stateFlow", "Luu/a;", "d", "Luu/a;", "mutex", "e", "coroutineScope", "", "Ljava/lang/Class;", "", "Lvr/f$b;", "f", "Ljava/util/Map;", "workers", "Lku/d2;", "sideEffects", "value", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)V", "onStateChangeListener", "i", "()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "state", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<State extends WorkflowState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 baseScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.p0<State> stateFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public p0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Class<?>, List<b<?>>> workers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, d2> sideEffects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super State, Unit> onStateChangeListener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvr/f$b;", "T", "", "Lvr/h;", "worker", "Lkotlin/Function1;", "", "handler", "<init>", "(Lvr/h;Lkotlin/jvm/functions/Function1;)V", "a", "Lvr/h;", "c", "()Lvr/h;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "e", "(Lkotlin/jvm/functions/Function1;)V", "Lku/d2;", "Lku/d2;", "()Lku/d2;", "d", "(Lku/d2;)V", "currentJob", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final h<T> worker;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Function1<? super T, Unit> handler;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public d2 currentJob;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull h<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.worker = worker;
            this.handler = handler;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d2 getCurrentJob() {
            return this.currentJob;
        }

        @NotNull
        public final Function1<T, Unit> b() {
            return this.handler;
        }

        @NotNull
        public final h<T> c() {
            return this.worker;
        }

        public final void d(@Nullable d2 d2Var) {
            this.currentJob = d2Var;
        }

        public final void e(@NotNull Function1<? super T, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.handler = function1;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningSideEffect$1", f = "WorkflowContextAdapter.kt", l = {127}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33441t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<nt.b<? super Unit>, Object> f33442u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super nt.b<? super Unit>, ? extends Object> function1, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f33442u = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f33442u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f33441t;
            if (i10 == 0) {
                o.b(obj);
                Function1<nt.b<? super Unit>, Object> function1 = this.f33442u;
                this.f33441t = 1;
                if (function1.invoke(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
    /* JADX WARN: Unknown type variable: T in type: vr.h<T> */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ h<T> A;
        public final /* synthetic */ Function1<T, Unit> B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33443t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33444u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33445v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33446w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33447x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33448y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ f<State> f33449z;

        /* JADX WARN: Unknown type variable: T in type: java.lang.Class<vr.h<T>> */
        /* JADX WARN: Unknown type variable: T in type: vr.f$b<T> */
        /* JADX WARN: Unknown type variable: T in type: vr.h<T> */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2", f = "WorkflowContextAdapter.kt", l = {102}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33450t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T> f33451u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f<State> f33452v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Class<h<T>> f33453w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ b<T> f33454x;

            /* JADX INFO: renamed from: vr.f$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0605a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f<State> f33455a;
                public final /* synthetic */ b<T> b;

                /* JADX INFO: renamed from: vr.f$d$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
                @pt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2$1$1", f = "WorkflowContextAdapter.kt", l = {}, m = "invokeSuspend")
                public static final class C0606a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f33456t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ b<T> f33457u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ T f33458v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0606a(b<T> bVar, T t8, nt.b<? super C0606a> bVar2) {
                        super(2, bVar2);
                        this.f33457u = bVar;
                        this.f33458v = t8;
                    }

                    @Override // pt.a
                    public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                        return new C0606a(this.f33457u, this.f33458v, bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        ot.c.e();
                        if (this.f33456t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                        this.f33457u.b().invoke(this.f33458v);
                        return Unit.f22483a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                        return ((C0606a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                    }
                }

                public C0605a(f<State> fVar, b<T> bVar) {
                    this.f33455a = fVar;
                    this.b = bVar;
                }

                @Override // nu.i
                public final Object emit(T t8, nt.b<? super Unit> bVar) {
                    k.d(this.f33455a.coroutineScope, null, null, new C0606a(this.b, t8, null), 3, null);
                    return Unit.f22483a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: java.lang.Class<vr.h<T>> */
            /* JADX WARN: Unknown type variable: T in type: vr.f$b<T> */
            /* JADX WARN: Unknown type variable: T in type: vr.h<? extends T> */
            public a(h<? extends T> hVar, f<State> fVar, Class<h<T>> cls, b<T> bVar, nt.b<? super a> bVar2) {
                super(2, bVar2);
                this.f33451u = hVar;
                this.f33452v = fVar;
                this.f33453w = cls;
                this.f33454x = bVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f33451u, this.f33452v, this.f33453w, this.f33454x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f33450t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        nu.h hVarRun = this.f33451u.run();
                        C0605a c0605a = new C0605a(this.f33452v, this.f33454x);
                        this.f33450t = 1;
                        if (hVarRun.collect(c0605a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                } catch (Exception unused) {
                }
                Map map = this.f33452v.workers;
                GenericDeclaration genericDeclaration = this.f33453w;
                Object arrayList = this.f33452v.workers.get(this.f33453w);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                map.put(genericDeclaration, CollectionsKt.v0((Iterable) arrayList, this.f33454x));
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Unknown type variable: T in type: vr.h<? extends T> */
        public d(f<State> fVar, h<? extends T> hVar, Function1<? super T, Unit> function1, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f33449z = fVar;
            this.A = hVar;
            this.B = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f33449z, this.A, this.B, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            uu.a aVar;
            h hVar;
            f<State> fVar;
            Function1 function1;
            Object next;
            Object objE = ot.c.e();
            int i10 = this.f33448y;
            int i11 = 0;
            if (i10 == 0) {
                o.b(obj);
                aVar = this.f33449z.mutex;
                hVar = this.A;
                fVar = this.f33449z;
                Function1 function2 = this.B;
                this.f33443t = aVar;
                this.f33444u = hVar;
                this.f33445v = fVar;
                this.f33446w = function2;
                this.f33447x = 0;
                this.f33448y = 1;
                if (aVar.f(null, this) == objE) {
                    return objE;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f33446w;
                fVar = (f) this.f33445v;
                hVar = (h) this.f33444u;
                aVar = (uu.a) this.f33443t;
                o.b(obj);
            }
            f<State> fVar2 = fVar;
            uu.a aVar2 = aVar;
            h hVar2 = hVar;
            try {
                Class<?> cls = hVar2.getClass();
                Object arrayList = fVar2.workers.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list = (List) arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((b) obj2).c().a(hVar2)) {
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
                } while (!((b) next).c().c(hVar2));
                b bVar = (b) next;
                if (bVar != null) {
                    Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>");
                    bVar.e((Function1) h0.e(function1, 1));
                    Unit unit = Unit.f22483a;
                    aVar2.e(null);
                    return unit;
                }
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        d2 currentJob = ((b) obj3).getCurrentJob();
                        if (currentJob != null) {
                            d2.a.a(currentJob, null, 1, null);
                        }
                    }
                }
                b bVar2 = new b(hVar2, function1);
                fVar2.workers.put(cls, CollectionsKt.x0(list, bVar2));
                bVar2.d(k.d(fVar2.coroutineScope, null, null, new a(hVar2, fVar2, cls, bVar2, null), 3, null));
                Unit unit2 = Unit.f22483a;
                aVar2.e(null);
                return Unit.f22483a;
            } catch (Throwable th2) {
                aVar2.e(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33459t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33460u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33461v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33462w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33463x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ f<State> f33464y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ State f33465z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f<State> fVar, State state, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f33464y = fVar;
            this.f33465z = state;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f33464y, this.f33465z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            f<State> fVar;
            uu.a aVar;
            WorkflowState workflowState;
            Object objE = ot.c.e();
            int i10 = this.f33463x;
            if (i10 == 0) {
                o.b(obj);
                uu.a aVar2 = this.f33464y.mutex;
                fVar = this.f33464y;
                State state = this.f33465z;
                this.f33459t = aVar2;
                this.f33460u = fVar;
                this.f33461v = state;
                this.f33462w = 0;
                this.f33463x = 1;
                if (aVar2.f(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
                workflowState = state;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflowState = (WorkflowState) this.f33461v;
                fVar = (f) this.f33460u;
                aVar = (uu.a) this.f33459t;
                o.b(obj);
            }
            try {
                fVar.k(workflowState);
                fVar.savedStateHandle.i("WorkflowContextAdapter.state", workflowState);
                fVar.h().invoke(workflowState);
                Unit unit = Unit.f22483a;
                return Unit.f22483a;
            } finally {
                aVar.e(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public f(@NotNull l0 savedStateHandle, @NotNull p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.savedStateHandle = savedStateHandle;
        this.baseScope = baseScope;
        this.stateFlow = savedStateHandle.f("WorkflowContextAdapter.state", null);
        this.mutex = uu.g.b(false, 1, null);
        this.coroutineScope = j();
        this.workers = new LinkedHashMap();
        this.sideEffects = new LinkedHashMap();
        this.onStateChangeListener = new Function1() { // from class: vr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.l((WorkflowState) obj);
            }
        };
    }

    public static final Unit l(WorkflowState workflowState) {
        return Unit.f22483a;
    }

    public final void g() {
        q0.f(this.coroutineScope, null, 1, null);
        this.coroutineScope = j();
        this.workers.clear();
    }

    @NotNull
    public final Function1<State, Unit> h() {
        return this.onStateChangeListener;
    }

    @Nullable
    public final State i() {
        return this.stateFlow.getValue();
    }

    public final p0 j() {
        return q0.a(g1.c().plus(z2.a(g2.h(this.baseScope.getCoroutineContext()))));
    }

    public final void k(State newState) {
        WorkflowState workflowStateI = i();
        if (newState == null || !(workflowStateI == null || workflowStateI.t0(newState))) {
            g();
        }
    }

    public final void m(@NotNull String tag, @NotNull Function1<? super nt.b<? super Unit>, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(function, "function");
        d2 d2Var = this.sideEffects.get(tag);
        if (d2Var == null || !d2Var.b()) {
            this.sideEffects.put(tag, k.d(this.coroutineScope, null, null, new c(function, null), 3, null));
        }
    }

    public final <T> void n(@NotNull h<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(handler, "handler");
        k.d(this.coroutineScope, g1.d(), null, new d(this, worker, handler, null), 2, null);
    }

    public final void o(@NotNull Function1<? super State, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onStateChangeListener = value;
        value.invoke(i());
    }

    public final void p(State newState) {
        k.d(this.coroutineScope, g1.d(), null, new e(this, newState, null), 2, null);
    }
}
