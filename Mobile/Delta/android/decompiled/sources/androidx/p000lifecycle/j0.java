package androidx.p000lifecycle;

import gt.o;
import iu.d2;
import iu.g1;
import iu.i;
import iu.k;
import iu.n;
import iu.n2;
import iu.p;
import iu.p0;
import iu.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import lt.b;
import mt.c;
import nt.f;
import nt.h;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/l$b;", "state", "Lkotlin/Function2;", "Liu/p0;", "Llt/b;", "", "", "block", "a", "(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/s;", "b", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j0 {

    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2629t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f2630u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l f2631v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l.b f2632w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2633x;

        /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a, reason: collision with other inner class name */
        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C0040a extends m implements Function2<p0, b<? super Unit>, Object> {
            public final /* synthetic */ l A;
            public final /* synthetic */ l.b B;
            public final /* synthetic */ p0 C;
            public final /* synthetic */ Function2<p0, b<? super Unit>, Object> D;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f2634t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f2635u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f2636v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f2637w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f2638x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f2639y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f2640z;

            /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0041a implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l.a f2641a;
                public final /* synthetic */ c0<d2> b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p0 f2642c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l.a f2643d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ n<Unit> f2644e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ su.a f2645f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2646g;

                /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a, reason: collision with other inner class name */
                @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 0, 0})
                public static final class C0042a extends m implements Function2<p0, b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public Object f2647t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public Object f2648u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f2649v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final /* synthetic */ su.a f2650w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2651x;

                    /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a$a, reason: collision with other inner class name */
                    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend", v = 1)
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 0, 0})
                    public static final class C0043a extends m implements Function2<p0, b<? super Unit>, Object> {

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public int f2652t;

                        /* JADX INFO: renamed from: u, reason: collision with root package name */
                        public /* synthetic */ Object f2653u;

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2654v;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0043a(Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0043a> bVar) {
                            super(2, bVar);
                            this.f2654v = function2;
                        }

                        @Override // nt.a
                        public final b<Unit> create(Object obj, b<?> bVar) {
                            C0043a c0043a = new C0043a(this.f2654v, bVar);
                            c0043a.f2653u = obj;
                            return c0043a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                            return ((C0043a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                        }

                        @Override // nt.a
                        public final Object invokeSuspend(Object obj) {
                            Object objE = c.e();
                            int i10 = this.f2652t;
                            if (i10 == 0) {
                                o.b(obj);
                                p0 p0Var = (p0) this.f2653u;
                                Function2<p0, b<? super Unit>, Object> function2 = this.f2654v;
                                this.f2652t = 1;
                                if (function2.invoke(p0Var, this) == objE) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0042a(su.a aVar, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0042a> bVar) {
                        super(2, bVar);
                        this.f2650w = aVar;
                        this.f2651x = function2;
                    }

                    @Override // nt.a
                    public final b<Unit> create(Object obj, b<?> bVar) {
                        return new C0042a(this.f2650w, this.f2651x, bVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                        return ((C0042a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        su.a aVar;
                        Function2<p0, b<? super Unit>, Object> function2;
                        su.a aVar2;
                        Throwable th2;
                        Object objE = c.e();
                        int i10 = this.f2649v;
                        try {
                            if (i10 == 0) {
                                o.b(obj);
                                aVar = this.f2650w;
                                function2 = this.f2651x;
                                this.f2647t = aVar;
                                this.f2648u = function2;
                                this.f2649v = 1;
                                if (aVar.b(null, this) != objE) {
                                }
                                return objE;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (su.a) this.f2647t;
                                try {
                                    o.b(obj);
                                    Unit unit = Unit.f22938a;
                                    aVar2.f(null);
                                    return Unit.f22938a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    aVar2.f(null);
                                    throw th2;
                                }
                            }
                            function2 = (Function2) this.f2648u;
                            su.a aVar3 = (su.a) this.f2647t;
                            o.b(obj);
                            aVar = aVar3;
                            C0043a c0043a = new C0043a(function2, null);
                            this.f2647t = aVar;
                            this.f2648u = null;
                            this.f2649v = 2;
                            if (q0.g(c0043a, this) != objE) {
                                aVar2 = aVar;
                                Unit unit2 = Unit.f22938a;
                                aVar2.f(null);
                                return Unit.f22938a;
                            }
                            return objE;
                        } catch (Throwable th4) {
                            aVar2 = aVar;
                            th2 = th4;
                            aVar2.f(null);
                            throw th2;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0041a(l.a aVar, c0<d2> c0Var, p0 p0Var, l.a aVar2, n<? super Unit> nVar, su.a aVar3, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2) {
                    this.f2641a = aVar;
                    this.b = c0Var;
                    this.f2642c = p0Var;
                    this.f2643d = aVar2;
                    this.f2644e = nVar;
                    this.f2645f = aVar3;
                    this.f2646g = function2;
                }

                /* JADX WARN: Type inference failed for: r9v5, types: [T, iu.d2] */
                @Override // androidx.p000lifecycle.p
                public final void f(s sVar, l.a event) {
                    Intrinsics.checkNotNullParameter(sVar, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == this.f2641a) {
                        this.b.f23007a = k.d(this.f2642c, null, null, new C0042a(this.f2645f, this.f2646g, null), 3, null);
                        return;
                    }
                    if (event == this.f2643d) {
                        d2 d2Var = this.b.f23007a;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        this.b.f23007a = null;
                    }
                    if (event == l.a.ON_DESTROY) {
                        n<Unit> nVar = this.f2644e;
                        gt.n.Companion companion = gt.n.INSTANCE;
                        nVar.resumeWith(gt.n.b(Unit.f22938a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0040a(l lVar, l.b bVar, p0 p0Var, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0040a> bVar2) {
                super(2, bVar2);
                this.A = lVar;
                this.B = bVar;
                this.C = p0Var;
                this.D = function2;
            }

            @Override // nt.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0040a(this.A, this.B, this.C, this.D, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0040a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.j0$a$a$a, java.lang.Object] */
            @Override // nt.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                c0 c0Var;
                Throwable th2;
                c0 c0Var2;
                d2 d2Var;
                p pVar;
                d2 d2Var2;
                p pVar2;
                Object objE = c.e();
                int i10 = this.f2640z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f2635u;
                    c0Var2 = (c0) this.f2634t;
                    try {
                        o.b(obj);
                        d2Var2 = (d2) c0Var2.f23007a;
                        if (d2Var2 != null) {
                            d2.a.a(d2Var2, null, 1, null);
                        }
                        pVar2 = (p) c0Var.f23007a;
                        if (pVar2 != null) {
                            this.A.d(pVar2);
                        }
                        return Unit.f22938a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        d2Var = (d2) c0Var2.f23007a;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        pVar = (p) c0Var.f23007a;
                        if (pVar != null) {
                            throw th2;
                        }
                        this.A.d(pVar);
                        throw th2;
                    }
                }
                o.b(obj);
                if (this.A.getState() == l.b.DESTROYED) {
                    return Unit.f22938a;
                }
                c0 c0Var3 = new c0();
                c0Var = new c0();
                try {
                    l.b bVar = this.B;
                    l lVar = this.A;
                    p0 p0Var = this.C;
                    Function2<p0, b<? super Unit>, Object> function2 = this.D;
                    this.f2634t = c0Var3;
                    this.f2635u = c0Var;
                    this.f2636v = bVar;
                    this.f2637w = lVar;
                    this.f2638x = p0Var;
                    this.f2639y = function2;
                    this.f2640z = 1;
                    p pVar3 = new p(mt.b.c(this), 1);
                    pVar3.H();
                    l.a.Companion companion = l.a.INSTANCE;
                    ?? c0041a = new C0041a(companion.c(bVar), c0Var3, p0Var, companion.a(bVar), pVar3, g.b(false, 1, null), function2);
                    c0Var.f23007a = c0041a;
                    Intrinsics.d(c0041a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lVar.a((p) c0041a);
                    Object objA = pVar3.A();
                    if (objA == c.e()) {
                        h.c(this);
                    }
                    if (objA == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var3;
                    d2Var2 = (d2) c0Var2.f23007a;
                    if (d2Var2 != null) {
                        d2.a.a(d2Var2, null, 1, null);
                    }
                    pVar2 = (p) c0Var.f23007a;
                    if (pVar2 != null) {
                        this.A.d(pVar2);
                    }
                    return Unit.f22938a;
                } catch (Throwable th4) {
                    th2 = th4;
                    c0Var2 = c0Var3;
                    d2Var = (d2) c0Var2.f23007a;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    pVar = (p) c0Var.f23007a;
                    if (pVar != null) {
                        throw th2;
                    }
                    this.A.d(pVar);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, l.b bVar, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super a> bVar2) {
            super(2, bVar2);
            this.f2631v = lVar;
            this.f2632w = bVar;
            this.f2633x = function2;
        }

        @Override // nt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f2631v, this.f2632w, this.f2633x, bVar);
            aVar.f2630u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f2629t;
            if (i10 == 0) {
                o.b(obj);
                p0 p0Var = (p0) this.f2630u;
                n2 immediate = g1.c().getImmediate();
                C0040a c0040a = new C0040a(this.f2631v, this.f2632w, p0Var, this.f2633x, null);
                this.f2629t = 1;
                if (i.g(immediate, c0040a, this) == objE) {
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

    @Nullable
    public static final Object a(@NotNull l lVar, @NotNull l.b bVar, @NotNull Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, @NotNull b<? super Unit> bVar2) {
        Object objG;
        if (bVar != l.b.INITIALIZED) {
            return (lVar.getState() != l.b.DESTROYED && (objG = q0.g(new a(lVar, bVar, function2, null), bVar2)) == c.e()) ? objG : Unit.f22938a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    @Nullable
    public static final Object b(@NotNull s sVar, @NotNull l.b bVar, @NotNull Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, @NotNull b<? super Unit> bVar2) {
        Object objA = a(sVar.a(), bVar, function2, bVar2);
        return objA == c.e() ? objA : Unit.f22938a;
    }
}
