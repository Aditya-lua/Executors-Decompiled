package androidx.p000lifecycle;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.d2;
import ku.g1;
import ku.i;
import ku.k;
import ku.n;
import ku.n2;
import ku.p;
import ku.p0;
import ku.q0;
import nt.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.h;
import pt.m;
import uu.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/l$b;", "state", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "", "block", "a", "(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/s;", "b", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2784t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f2785u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l f2786v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l.b f2787w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2788x;

        /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
        public static final class C0044a extends m implements Function2<p0, b<? super Unit>, Object> {
            public final /* synthetic */ l A;
            public final /* synthetic */ l.b B;
            public final /* synthetic */ p0 C;
            public final /* synthetic */ Function2<p0, b<? super Unit>, Object> D;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f2789t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f2790u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f2791v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f2792w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f2793x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f2794y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f2795z;

            /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0045a implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l.a f2796a;
                public final /* synthetic */ c0<d2> b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p0 f2797c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l.a f2798d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ n<Unit> f2799e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ uu.a f2800f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2801g;

                /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
                public static final class C0046a extends m implements Function2<p0, b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public Object f2802t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public Object f2803u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f2804v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final /* synthetic */ uu.a f2805w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2806x;

                    /* JADX INFO: renamed from: androidx.lifecycle.j0$a$a$a$a$a, reason: collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 0, 0})
                    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend", v = 1)
                    public static final class C0047a extends m implements Function2<p0, b<? super Unit>, Object> {

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public int f2807t;

                        /* JADX INFO: renamed from: u, reason: collision with root package name */
                        public /* synthetic */ Object f2808u;

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ Function2<p0, b<? super Unit>, Object> f2809v;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0047a(Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0047a> bVar) {
                            super(2, bVar);
                            this.f2809v = function2;
                        }

                        @Override // pt.a
                        public final b<Unit> create(Object obj, b<?> bVar) {
                            C0047a c0047a = new C0047a(this.f2809v, bVar);
                            c0047a.f2808u = obj;
                            return c0047a;
                        }

                        @Override // pt.a
                        public final Object invokeSuspend(Object obj) {
                            Object objE = c.e();
                            int i10 = this.f2807t;
                            if (i10 == 0) {
                                o.b(obj);
                                p0 p0Var = (p0) this.f2808u;
                                Function2<p0, b<? super Unit>, Object> function2 = this.f2809v;
                                this.f2807t = 1;
                                if (function2.invoke(p0Var, this) == objE) {
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
                        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                            return ((C0047a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0046a(uu.a aVar, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0046a> bVar) {
                        super(2, bVar);
                        this.f2805w = aVar;
                        this.f2806x = function2;
                    }

                    @Override // pt.a
                    public final b<Unit> create(Object obj, b<?> bVar) {
                        return new C0046a(this.f2805w, this.f2806x, bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        uu.a aVar;
                        Function2<p0, b<? super Unit>, Object> function2;
                        uu.a aVar2;
                        Throwable th2;
                        Object objE = c.e();
                        int i10 = this.f2804v;
                        try {
                            if (i10 == 0) {
                                o.b(obj);
                                aVar = this.f2805w;
                                function2 = this.f2806x;
                                this.f2802t = aVar;
                                this.f2803u = function2;
                                this.f2804v = 1;
                                if (aVar.f(null, this) != objE) {
                                }
                                return objE;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (uu.a) this.f2802t;
                                try {
                                    o.b(obj);
                                    Unit unit = Unit.f22483a;
                                    aVar2.e(null);
                                    return Unit.f22483a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    aVar2.e(null);
                                    throw th2;
                                }
                            }
                            function2 = (Function2) this.f2803u;
                            uu.a aVar3 = (uu.a) this.f2802t;
                            o.b(obj);
                            aVar = aVar3;
                            C0047a c0047a = new C0047a(function2, null);
                            this.f2802t = aVar;
                            this.f2803u = null;
                            this.f2804v = 2;
                            if (q0.g(c0047a, this) != objE) {
                                aVar2 = aVar;
                                Unit unit2 = Unit.f22483a;
                                aVar2.e(null);
                                return Unit.f22483a;
                            }
                            return objE;
                        } catch (Throwable th4) {
                            aVar2 = aVar;
                            th2 = th4;
                            aVar2.e(null);
                            throw th2;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                        return ((C0046a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0045a(l.a aVar, c0<d2> c0Var, p0 p0Var, l.a aVar2, n<? super Unit> nVar, uu.a aVar3, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2) {
                    this.f2796a = aVar;
                    this.b = c0Var;
                    this.f2797c = p0Var;
                    this.f2798d = aVar2;
                    this.f2799e = nVar;
                    this.f2800f = aVar3;
                    this.f2801g = function2;
                }

                /* JADX WARN: Type inference failed for: r9v5, types: [T, ku.d2] */
                @Override // androidx.p000lifecycle.p
                public final void g(s sVar, l.a event) {
                    Intrinsics.checkNotNullParameter(sVar, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == this.f2796a) {
                        this.b.f22552a = k.d(this.f2797c, null, null, new C0046a(this.f2800f, this.f2801g, null), 3, null);
                        return;
                    }
                    if (event == this.f2798d) {
                        d2 d2Var = this.b.f22552a;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        this.b.f22552a = null;
                    }
                    if (event == l.a.ON_DESTROY) {
                        n<Unit> nVar = this.f2799e;
                        jt.n.Companion companion = jt.n.INSTANCE;
                        nVar.resumeWith(jt.n.b(Unit.f22483a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0044a(l lVar, l.b bVar, p0 p0Var, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super C0044a> bVar2) {
                super(2, bVar2);
                this.A = lVar;
                this.B = bVar;
                this.C = p0Var;
                this.D = function2;
            }

            @Override // pt.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0044a(this.A, this.B, this.C, this.D, bVar);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.j0$a$a$a, java.lang.Object] */
            @Override // pt.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                c0 c0Var;
                Throwable th2;
                c0 c0Var2;
                d2 d2Var;
                p pVar;
                d2 d2Var2;
                p pVar2;
                Object objE = c.e();
                int i10 = this.f2795z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f2790u;
                    c0Var2 = (c0) this.f2789t;
                    try {
                        o.b(obj);
                        d2Var2 = (d2) c0Var2.f22552a;
                        if (d2Var2 != null) {
                            d2.a.a(d2Var2, null, 1, null);
                        }
                        pVar2 = (p) c0Var.f22552a;
                        if (pVar2 != null) {
                            this.A.d(pVar2);
                        }
                        return Unit.f22483a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        d2Var = (d2) c0Var2.f22552a;
                        if (d2Var != null) {
                            d2.a.a(d2Var, null, 1, null);
                        }
                        pVar = (p) c0Var.f22552a;
                        if (pVar != null) {
                            throw th2;
                        }
                        this.A.d(pVar);
                        throw th2;
                    }
                }
                o.b(obj);
                if (this.A.getState() == l.b.DESTROYED) {
                    return Unit.f22483a;
                }
                c0 c0Var3 = new c0();
                c0Var = new c0();
                try {
                    l.b bVar = this.B;
                    l lVar = this.A;
                    p0 p0Var = this.C;
                    Function2<p0, b<? super Unit>, Object> function2 = this.D;
                    this.f2789t = c0Var3;
                    this.f2790u = c0Var;
                    this.f2791v = bVar;
                    this.f2792w = lVar;
                    this.f2793x = p0Var;
                    this.f2794y = function2;
                    this.f2795z = 1;
                    p pVar3 = new p(ot.b.c(this), 1);
                    pVar3.H();
                    l.a.Companion companion = l.a.INSTANCE;
                    ?? c0045a = new C0045a(companion.c(bVar), c0Var3, p0Var, companion.a(bVar), pVar3, g.b(false, 1, null), function2);
                    c0Var.f22552a = c0045a;
                    Intrinsics.d(c0045a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lVar.a((p) c0045a);
                    Object objA = pVar3.A();
                    if (objA == c.e()) {
                        h.c(this);
                    }
                    if (objA == objE) {
                        return objE;
                    }
                    c0Var2 = c0Var3;
                    d2Var2 = (d2) c0Var2.f22552a;
                    if (d2Var2 != null) {
                        d2.a.a(d2Var2, null, 1, null);
                    }
                    pVar2 = (p) c0Var.f22552a;
                    if (pVar2 != null) {
                        this.A.d(pVar2);
                    }
                    return Unit.f22483a;
                } catch (Throwable th4) {
                    th2 = th4;
                    c0Var2 = c0Var3;
                    d2Var = (d2) c0Var2.f22552a;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    pVar = (p) c0Var.f22552a;
                    if (pVar != null) {
                        throw th2;
                    }
                    this.A.d(pVar);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0044a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, l.b bVar, Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, b<? super a> bVar2) {
            super(2, bVar2);
            this.f2786v = lVar;
            this.f2787w = bVar;
            this.f2788x = function2;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f2786v, this.f2787w, this.f2788x, bVar);
            aVar.f2785u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f2784t;
            if (i10 == 0) {
                o.b(obj);
                p0 p0Var = (p0) this.f2785u;
                n2 immediate = g1.c().getImmediate();
                C0044a c0044a = new C0044a(this.f2786v, this.f2787w, p0Var, this.f2788x, null);
                this.f2784t = 1;
                if (i.g(immediate, c0044a, this) == objE) {
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
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final Object a(@NotNull l lVar, @NotNull l.b bVar, @NotNull Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, @NotNull b<? super Unit> bVar2) {
        Object objG;
        if (bVar != l.b.INITIALIZED) {
            return (lVar.getState() != l.b.DESTROYED && (objG = q0.g(new a(lVar, bVar, function2, null), bVar2)) == c.e()) ? objG : Unit.f22483a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    @Nullable
    public static final Object b(@NotNull s sVar, @NotNull l.b bVar, @NotNull Function2<? super p0, ? super b<? super Unit>, ? extends Object> function2, @NotNull b<? super Unit> bVar2) {
        Object objA = a(sVar.a(), bVar, function2, bVar2);
        return objA == c.e() ? objA : Unit.f22483a;
    }
}
