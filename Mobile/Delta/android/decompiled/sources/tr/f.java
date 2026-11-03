package tr;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import gt.o;
import iu.d2;
import iu.g1;
import iu.g2;
import iu.k;
import iu.p0;
import iu.q0;
import iu.z2;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import lu.i;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003:\u0002 \"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R.\u00104\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103RF\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Ltr/f;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "State", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Liu/p0;", "baseScope", "<init>", "(Landroidx/lifecycle/l0;Liu/p0;)V", "T", "Ltr/h;", "worker", "Lkotlin/Function1;", "", "handler", "n", "(Ltr/h;Lkotlin/jvm/functions/Function1;)V", "", "tag", "Llt/b;", "function", "m", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "newState", "p", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V", "k", "g", "()V", "j", "()Liu/p0;", "a", "Landroidx/lifecycle/l0;", "b", "Liu/p0;", "Llu/p0;", "c", "Llu/p0;", "stateFlow", "Lsu/a;", "d", "Lsu/a;", "mutex", "e", "coroutineScope", "", "Ljava/lang/Class;", "", "Ltr/f$b;", "f", "Ljava/util/Map;", "workers", "Liu/d2;", "sideEffects", "value", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)V", "onStateChangeListener", "i", "()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "state", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<State extends WorkflowState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 baseScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.p0<State> stateFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.a mutex;

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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltr/f$b;", "T", "", "Ltr/h;", "worker", "Lkotlin/Function1;", "", "handler", "<init>", "(Ltr/h;Lkotlin/jvm/functions/Function1;)V", "a", "Ltr/h;", "c", "()Ltr/h;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "e", "(Lkotlin/jvm/functions/Function1;)V", "Liu/d2;", "Liu/d2;", "()Liu/d2;", "d", "(Liu/d2;)V", "currentJob", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningSideEffect$1", f = "WorkflowContextAdapter.kt", l = {127}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32577t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super Unit>, Object> f32578u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super lt.b<? super Unit>, ? extends Object> function1, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f32578u = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f32578u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f32577t;
            if (i10 == 0) {
                o.b(obj);
                Function1<lt.b<? super Unit>, Object> function1 = this.f32578u;
                this.f32577t = 1;
                if (function1.invoke(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
    /* JADX WARN: Unknown type variable: T in type: tr.h<T> */
    @nt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {
        public final /* synthetic */ h<T> A;
        public final /* synthetic */ Function1<T, Unit> B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32579t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32580u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32581v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32582w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32583x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f32584y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ f<State> f32585z;

        /* JADX WARN: Unknown type variable: T in type: java.lang.Class<tr.h<T>> */
        /* JADX WARN: Unknown type variable: T in type: tr.f$b<T> */
        /* JADX WARN: Unknown type variable: T in type: tr.h<T> */
        @nt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2", f = "WorkflowContextAdapter.kt", l = {102}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f32586t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T> f32587u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f<State> f32588v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Class<h<T>> f32589w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ b<T> f32590x;

            /* JADX INFO: renamed from: tr.f$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0584a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f<State> f32591a;
                public final /* synthetic */ b<T> b;

                /* JADX INFO: renamed from: tr.f$d$a$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2$1$1", f = "WorkflowContextAdapter.kt", l = {}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
                public static final class C0585a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f32592t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ b<T> f32593u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ T f32594v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0585a(b<T> bVar, T t8, lt.b<? super C0585a> bVar2) {
                        super(2, bVar2);
                        this.f32593u = bVar;
                        this.f32594v = t8;
                    }

                    @Override // nt.a
                    public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                        return new C0585a(this.f32593u, this.f32594v, bVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                        return ((C0585a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        mt.c.e();
                        if (this.f32592t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                        this.f32593u.b().invoke(this.f32594v);
                        return Unit.f22938a;
                    }
                }

                public C0584a(f<State> fVar, b<T> bVar) {
                    this.f32591a = fVar;
                    this.b = bVar;
                }

                @Override // lu.i
                public final Object emit(T t8, lt.b<? super Unit> bVar) {
                    k.d(this.f32591a.coroutineScope, null, null, new C0585a(this.b, t8, null), 3, null);
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: java.lang.Class<tr.h<T>> */
            /* JADX WARN: Unknown type variable: T in type: tr.f$b<T> */
            /* JADX WARN: Unknown type variable: T in type: tr.h<? extends T> */
            public a(h<? extends T> hVar, f<State> fVar, Class<h<T>> cls, b<T> bVar, lt.b<? super a> bVar2) {
                super(2, bVar2);
                this.f32587u = hVar;
                this.f32588v = fVar;
                this.f32589w = cls;
                this.f32590x = bVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f32587u, this.f32588v, this.f32589w, this.f32590x, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f32586t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        lu.h hVarRun = this.f32587u.run();
                        C0584a c0584a = new C0584a(this.f32588v, this.f32590x);
                        this.f32586t = 1;
                        if (hVarRun.collect(c0584a, this) == objE) {
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
                Map map = this.f32588v.workers;
                GenericDeclaration genericDeclaration = this.f32589w;
                Object arrayList = this.f32588v.workers.get(this.f32589w);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                map.put(genericDeclaration, CollectionsKt.v0((Iterable) arrayList, this.f32590x));
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Unknown type variable: T in type: tr.h<? extends T> */
        public d(f<State> fVar, h<? extends T> hVar, Function1<? super T, Unit> function1, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f32585z = fVar;
            this.A = hVar;
            this.B = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f32585z, this.A, this.B, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            h hVar;
            f<State> fVar;
            Function1 function1;
            Object next;
            Object objE = mt.c.e();
            int i10 = this.f32584y;
            int i11 = 0;
            if (i10 == 0) {
                o.b(obj);
                aVar = this.f32585z.mutex;
                hVar = this.A;
                fVar = this.f32585z;
                Function1 function2 = this.B;
                this.f32579t = aVar;
                this.f32580u = hVar;
                this.f32581v = fVar;
                this.f32582w = function2;
                this.f32583x = 0;
                this.f32584y = 1;
                if (aVar.b(null, this) == objE) {
                    return objE;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f32582w;
                fVar = (f) this.f32581v;
                hVar = (h) this.f32580u;
                aVar = (su.a) this.f32579t;
                o.b(obj);
            }
            f<State> fVar2 = fVar;
            su.a aVar2 = aVar;
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
                    if (((b) obj2).c().b(hVar2)) {
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
                } while (!((b) next).c().a(hVar2));
                b bVar = (b) next;
                if (bVar != null) {
                    Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>");
                    bVar.e((Function1) h0.e(function1, 1));
                    Unit unit = Unit.f22938a;
                    aVar2.f(null);
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
                Unit unit2 = Unit.f22938a;
                aVar2.f(null);
                return Unit.f22938a;
            } catch (Throwable th2) {
                aVar2.f(null);
                throw th2;
            }
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32595t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32596u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32597v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f32598w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32599x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ f<State> f32600y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ State f32601z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f<State> fVar, State state, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f32600y = fVar;
            this.f32601z = state;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f32600y, this.f32601z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            f<State> fVar;
            su.a aVar;
            WorkflowState workflowState;
            Object objE = mt.c.e();
            int i10 = this.f32599x;
            if (i10 == 0) {
                o.b(obj);
                su.a aVar2 = this.f32600y.mutex;
                fVar = this.f32600y;
                State state = this.f32601z;
                this.f32595t = aVar2;
                this.f32596u = fVar;
                this.f32597v = state;
                this.f32598w = 0;
                this.f32599x = 1;
                if (aVar2.b(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
                workflowState = state;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflowState = (WorkflowState) this.f32597v;
                fVar = (f) this.f32596u;
                aVar = (su.a) this.f32595t;
                o.b(obj);
            }
            try {
                fVar.k(workflowState);
                fVar.savedStateHandle.i("WorkflowContextAdapter.state", workflowState);
                fVar.h().invoke(workflowState);
                Unit unit = Unit.f22938a;
                return Unit.f22938a;
            } finally {
                aVar.f(null);
            }
        }
    }

    public f(@NotNull l0 savedStateHandle, @NotNull p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.savedStateHandle = savedStateHandle;
        this.baseScope = baseScope;
        this.stateFlow = savedStateHandle.f("WorkflowContextAdapter.state", null);
        this.mutex = su.g.b(false, 1, null);
        this.coroutineScope = j();
        this.workers = new LinkedHashMap();
        this.sideEffects = new LinkedHashMap();
        this.onStateChangeListener = new Function1() { // from class: tr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.l((WorkflowState) obj);
            }
        };
    }

    public static final Unit l(WorkflowState workflowState) {
        return Unit.f22938a;
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
        if (newState == null || !(workflowStateI == null || workflowStateI.p0(newState))) {
            g();
        }
    }

    public final void m(@NotNull String tag, @NotNull Function1<? super lt.b<? super Unit>, ? extends Object> function) {
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
