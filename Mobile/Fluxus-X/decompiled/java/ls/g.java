package ls;

import androidx.p000lifecycle.l0;
import av.d2;
import av.g1;
import av.g2;
import av.k;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import gu.m;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ls.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.h0;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 >*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003:\u0002 \"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R.\u00104\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103RF\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lls/g;", "Lls/h;", "State", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lav/p0;", "baseScope", "<init>", "(Landroidx/lifecycle/l0;Lav/p0;)V", "T", "Lls/j;", "worker", "Lkotlin/Function1;", BuildConfig.FLAVOR, "handler", "n", "(Lls/j;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "tag", "Leu/b;", "function", "m", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "newState", "p", "(Lls/h;)V", "k", "g", "()V", "j", "()Lav/p0;", "a", "Landroidx/lifecycle/l0;", "b", "Lav/p0;", "Ldv/p0;", "c", "Ldv/p0;", "stateFlow", "Lkv/a;", "d", "Lkv/a;", "mutex", "e", "coroutineScope", BuildConfig.FLAVOR, "Ljava/lang/Class;", BuildConfig.FLAVOR, "Lls/g$b;", "f", "Ljava/util/Map;", "workers", "Lav/d2;", "sideEffects", "value", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)V", "onStateChangeListener", "i", "()Lls/h;", "state", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g<State extends h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 baseScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.p0<State> stateFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.a mutex;

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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lls/g$b;", "T", BuildConfig.FLAVOR, "Lls/j;", "worker", "Lkotlin/Function1;", BuildConfig.FLAVOR, "handler", "<init>", "(Lls/j;Lkotlin/jvm/functions/Function1;)V", "a", "Lls/j;", "c", "()Lls/j;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "e", "(Lkotlin/jvm/functions/Function1;)V", "Lav/d2;", "Lav/d2;", "()Lav/d2;", "d", "(Lav/d2;)V", "currentJob", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j<T> worker;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Function1<? super T, Unit> handler;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public d2 currentJob;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull j<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
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
        public final j<T> c() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningSideEffect$1", f = "WorkflowContextAdapter.kt", l = {127}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22486t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super Unit>, Object> f22487u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super eu.b<? super Unit>, ? extends Object> function1, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f22487u = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f22487u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22486t;
            if (i10 == 0) {
                o.b(obj);
                Function1<eu.b<? super Unit>, Object> function1 = this.f22487u;
                this.f22486t = 1;
                if (function1.invoke(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
    /* JADX WARN: Unknown type variable: T in type: ls.j<T> */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ j<T> A;
        public final /* synthetic */ Function1<T, Unit> B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22488t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22489u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f22490v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f22491w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22492x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22493y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ g<State> f22494z;

        /* JADX WARN: Unknown type variable: T in type: java.lang.Class<ls.j<T>> */
        /* JADX WARN: Unknown type variable: T in type: ls.g$b<T> */
        /* JADX WARN: Unknown type variable: T in type: ls.j<T> */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2", f = "WorkflowContextAdapter.kt", l = {MlKitException.MODEL_HASH_MISMATCH}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f22495t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j<T> f22496u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ g<State> f22497v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Class<j<T>> f22498w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ b<T> f22499x;

            /* JADX INFO: renamed from: ls.g$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0446a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g<State> f22500a;
                public final /* synthetic */ b<T> b;

                /* JADX INFO: renamed from: ls.g$d$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
                @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2$1$1", f = "WorkflowContextAdapter.kt", l = {}, m = "invokeSuspend")
                public static final class C0447a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f22501t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ b<T> f22502u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ T f22503v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0447a(b<T> bVar, T t8, eu.b<? super C0447a> bVar2) {
                        super(2, bVar2);
                        this.f22502u = bVar;
                        this.f22503v = t8;
                    }

                    @Override // gu.a
                    public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                        return new C0447a(this.f22502u, this.f22503v, bVar);
                    }

                    @Override // p001kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                        return ((C0447a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        fu.c.e();
                        if (this.f22501t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                        this.f22502u.b().invoke(this.f22503v);
                        return Unit.f21506a;
                    }
                }

                public C0446a(g<State> gVar, b<T> bVar) {
                    this.f22500a = gVar;
                    this.b = bVar;
                }

                @Override // dv.i
                public final Object emit(T t8, eu.b<? super Unit> bVar) {
                    k.d(this.f22500a.coroutineScope, null, null, new C0447a(this.b, t8, null), 3, null);
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: java.lang.Class<ls.j<T>> */
            /* JADX WARN: Unknown type variable: T in type: ls.g$b<T> */
            /* JADX WARN: Unknown type variable: T in type: ls.j<? extends T> */
            public a(j<? extends T> jVar, g<State> gVar, Class<j<T>> cls, b<T> bVar, eu.b<? super a> bVar2) {
                super(2, bVar2);
                this.f22496u = jVar;
                this.f22497v = gVar;
                this.f22498w = cls;
                this.f22499x = bVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f22496u, this.f22497v, this.f22498w, this.f22499x, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f22495t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        dv.h hVarRun = this.f22496u.run();
                        C0446a c0446a = new C0446a(this.f22497v, this.f22499x);
                        this.f22495t = 1;
                        if (hVarRun.collect(c0446a, this) == objE) {
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
                Map map = this.f22497v.workers;
                GenericDeclaration genericDeclaration = this.f22498w;
                Object arrayList = this.f22497v.workers.get(this.f22498w);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                map.put(genericDeclaration, CollectionsKt.v0((Iterable) arrayList, this.f22499x));
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Unknown type variable: T in type: ls.j<? extends T> */
        public d(g<State> gVar, j<? extends T> jVar, Function1<? super T, Unit> function1, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f22494z = gVar;
            this.A = jVar;
            this.B = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f22494z, this.A, this.B, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            kv.a aVar;
            j jVar;
            g<State> gVar;
            Function1 function1;
            Object next;
            Object objE = fu.c.e();
            int i10 = this.f22493y;
            int i11 = 0;
            if (i10 == 0) {
                o.b(obj);
                aVar = this.f22494z.mutex;
                jVar = this.A;
                gVar = this.f22494z;
                Function1 function2 = this.B;
                this.f22488t = aVar;
                this.f22489u = jVar;
                this.f22490v = gVar;
                this.f22491w = function2;
                this.f22492x = 0;
                this.f22493y = 1;
                if (aVar.d(null, this) == objE) {
                    return objE;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f22491w;
                gVar = (g) this.f22490v;
                jVar = (j) this.f22489u;
                aVar = (kv.a) this.f22488t;
                o.b(obj);
            }
            g<State> gVar2 = gVar;
            kv.a aVar2 = aVar;
            j jVar2 = jVar;
            try {
                Class<?> cls = jVar2.getClass();
                Object arrayList = gVar2.workers.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list = (List) arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((b) obj2).c().b(jVar2)) {
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
                } while (!((b) next).c().c(jVar2));
                b bVar = (b) next;
                if (bVar != null) {
                    Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>");
                    bVar.e((Function1) h0.e(function1, 1));
                    Unit unit = Unit.f21506a;
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
                b bVar2 = new b(jVar2, function1);
                gVar2.workers.put(cls, CollectionsKt.x0(list, bVar2));
                bVar2.d(k.d(gVar2.coroutineScope, null, null, new a(jVar2, gVar2, cls, bVar2, null), 3, null));
                Unit unit2 = Unit.f21506a;
                aVar2.f(null);
                return Unit.f21506a;
            } catch (Throwable th2) {
                aVar2.f(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1", f = "WorkflowContextAdapter.kt", l = {163}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22504t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22505u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f22506v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22507w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22508x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ g<State> f22509y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ State f22510z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g<State> gVar, State state, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f22509y = gVar;
            this.f22510z = state;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f22509y, this.f22510z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            g<State> gVar;
            kv.a aVar;
            h hVar;
            Object objE = fu.c.e();
            int i10 = this.f22508x;
            if (i10 == 0) {
                o.b(obj);
                kv.a aVar2 = this.f22509y.mutex;
                gVar = this.f22509y;
                State state = this.f22510z;
                this.f22504t = aVar2;
                this.f22505u = gVar;
                this.f22506v = state;
                this.f22507w = 0;
                this.f22508x = 1;
                if (aVar2.d(null, this) == objE) {
                    return objE;
                }
                aVar = aVar2;
                hVar = state;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (h) this.f22506v;
                gVar = (g) this.f22505u;
                aVar = (kv.a) this.f22504t;
                o.b(obj);
            }
            try {
                gVar.k(hVar);
                gVar.savedStateHandle.i("WorkflowContextAdapter.state", hVar);
                gVar.h().invoke(hVar);
                Unit unit = Unit.f21506a;
                return Unit.f21506a;
            } finally {
                aVar.f(null);
            }
        }
    }

    public g(@NotNull l0 savedStateHandle, @NotNull p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.savedStateHandle = savedStateHandle;
        this.baseScope = baseScope;
        this.stateFlow = savedStateHandle.f("WorkflowContextAdapter.state", null);
        this.mutex = kv.g.b(false, 1, null);
        this.coroutineScope = j();
        this.workers = new LinkedHashMap();
        this.sideEffects = new LinkedHashMap();
        this.onStateChangeListener = new Function1() { // from class: ls.f
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.l((h) obj);
            }
        };
    }

    public static final Unit l(h hVar) {
        return Unit.f21506a;
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
        return q0.a(g1.c().plus(z2.a(g2.j(this.baseScope.getCoroutineContext()))));
    }

    public final void k(State newState) {
        h hVarI = i();
        if (newState == null || !(hVarI == null || hVarI.N2(newState))) {
            g();
        }
    }

    public final void m(@NotNull String tag, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(function, "function");
        d2 d2Var = this.sideEffects.get(tag);
        if (d2Var == null || !d2Var.b()) {
            this.sideEffects.put(tag, k.d(this.coroutineScope, null, null, new c(function, null), 3, null));
        }
    }

    public final <T> void n(@NotNull j<? extends T> worker, @NotNull Function1<? super T, Unit> handler) {
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
