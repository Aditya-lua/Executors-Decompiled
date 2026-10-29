package c5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.c0;
import x4.f0;
import x4.g0;
import x4.u;
import x4.v;
import z4.q;
import z4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"R", "Lx4/u;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lf5/b;", "block", "d", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "b", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lnt/b;", "", "c", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "(Lx4/u;ZLnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", "", "e", "(Ljava/io/File;)I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
    public static final class a<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f4540u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f4541v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4542w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4543x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.b, R> f4544y;

        /* JADX INFO: renamed from: c5.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
        public static final class C0095a extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4545t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ u f4546u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ boolean f4547v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4548w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function1<f5.b, R> f4549x;

            /* JADX INFO: renamed from: c5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
            public static final class C0096a extends pt.m implements Function2<g0, nt.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f4550t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f4551u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public /* synthetic */ Object f4552v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f4553w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f4554x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ u f4555y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ Function1 f4556z;

                /* JADX INFO: renamed from: c5.c$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
                public static final class C0097a extends pt.m implements Function2<f0<R>, nt.b<? super R>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f4557t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public /* synthetic */ Object f4558u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ Function1 f4559v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0097a(nt.b bVar, Function1 function1) {
                        super(2, bVar);
                        this.f4559v = function1;
                    }

                    @Override // pt.a
                    public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                        C0097a c0097a = new C0097a(bVar, this.f4559v);
                        c0097a.f4558u = obj;
                        return c0097a;
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        ot.c.e();
                        if (this.f4557t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj);
                        f0 f0Var = (f0) this.f4558u;
                        Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f4559v.invoke(((q) f0Var).getDelegate());
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(f0<R> f0Var, nt.b<? super R> bVar) {
                        return ((C0097a) create(f0Var, bVar)).invokeSuspend(Unit.f22483a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0096a(boolean z10, boolean z11, u uVar, nt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4553w = z10;
                    this.f4554x = z11;
                    this.f4555y = uVar;
                    this.f4556z = function1;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    C0096a c0096a = new C0096a(this.f4553w, this.f4554x, this.f4555y, bVar, this.f4556z);
                    c0096a.f4552v = obj;
                    return c0096a;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
                  0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    g0.a aVar;
                    g0 g0Var;
                    g0 g0Var2;
                    g0.a aVar2;
                    g0 g0Var3;
                    Object objB;
                    Object obj2;
                    Object objE = ot.c.e();
                    int i10 = this.f4551u;
                    if (i10 == 0) {
                        jt.o.b(obj);
                        g0 g0Var4 = (g0) this.f4552v;
                        if (!this.f4553w) {
                            Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                            return this.f4556z.invoke(((q) g0Var4).getDelegate());
                        }
                        boolean z10 = this.f4554x;
                        aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                        if (z10) {
                            g0Var = g0Var4;
                            C0097a c0097a = new C0097a(null, this.f4556z);
                            this.f4552v = g0Var;
                            this.f4550t = null;
                            this.f4551u = 3;
                            obj = g0Var.c(aVar, c0097a, this);
                            if (obj != objE) {
                                if (this.f4554x) {
                                    return obj;
                                }
                                this.f4552v = obj;
                                this.f4551u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f4555y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f4552v = g0Var4;
                            this.f4550t = aVar;
                            this.f4551u = 1;
                            Object objB2 = g0Var4.b(this);
                            if (objB2 != objE) {
                                g0Var2 = g0Var4;
                                obj = objB2;
                                aVar2 = aVar;
                            }
                        }
                        return objE;
                    }
                    if (i10 == 1) {
                        aVar2 = (g0.a) this.f4550t;
                        g0Var2 = (g0) this.f4552v;
                        jt.o.b(obj);
                    } else {
                        if (i10 == 2) {
                            aVar2 = (g0.a) this.f4550t;
                            g0Var3 = (g0) this.f4552v;
                            jt.o.b(obj);
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0097a c0097a2 = new C0097a(null, this.f4556z);
                            this.f4552v = g0Var;
                            this.f4550t = null;
                            this.f4551u = 3;
                            obj = g0Var.c(aVar, c0097a2, this);
                            if (obj != objE) {
                                if (this.f4554x) {
                                    return obj;
                                }
                                this.f4552v = obj;
                                this.f4551u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                }
                            }
                            return objE;
                        }
                        if (i10 == 3) {
                            g0Var = (g0) this.f4552v;
                            jt.o.b(obj);
                            if (this.f4554x) {
                                return obj;
                            }
                            this.f4552v = obj;
                            this.f4551u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                            }
                            return objE;
                        }
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f4552v;
                        jt.o.b(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        this.f4555y.t().u();
                    }
                    return obj2;
                    if (((Boolean) obj).booleanValue()) {
                        aVar = aVar2;
                        g0Var = g0Var2;
                        C0097a c0097a3 = new C0097a(null, this.f4556z);
                        this.f4552v = g0Var;
                        this.f4550t = null;
                        this.f4551u = 3;
                        obj = g0Var.c(aVar, c0097a3, this);
                        if (obj != objE) {
                            if (this.f4554x) {
                                return obj;
                            }
                            this.f4552v = obj;
                            this.f4551u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f4555y.t().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        androidx.room.c cVarT = this.f4555y.t();
                        this.f4552v = g0Var2;
                        this.f4550t = aVar2;
                        this.f4551u = 2;
                        if (cVarT.A(this) != objE) {
                            g0Var3 = g0Var2;
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0097a c0097a4 = new C0097a(null, this.f4556z);
                            this.f4552v = g0Var;
                            this.f4550t = null;
                            this.f4551u = 3;
                            obj = g0Var.c(aVar, c0097a4, this);
                            if (obj != objE) {
                                if (this.f4554x) {
                                    return obj;
                                }
                                this.f4552v = obj;
                                this.f4551u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f4555y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        }
                    }
                    return objE;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g0 g0Var, nt.b<? super R> bVar) {
                    return ((C0096a) create(g0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0095a(u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, nt.b<? super C0095a> bVar) {
                super(2, bVar);
                this.f4546u = uVar;
                this.f4547v = z10;
                this.f4548w = z11;
                this.f4549x = function1;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0095a(this.f4546u, this.f4547v, this.f4548w, this.f4549x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f4545t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                boolean z10 = !(this.f4546u.F() && this.f4546u.G()) && this.f4547v;
                u uVar = this.f4546u;
                boolean z11 = this.f4548w;
                C0096a c0096a = new C0096a(z10, z11, uVar, null, this.f4549x);
                this.f4545t = 1;
                Object objW = uVar.W(z11, c0096a, this);
                return objW == objE ? objE : objW;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
                return ((C0095a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f4540u = coroutineContext;
            this.f4541v = uVar;
            this.f4542w = z10;
            this.f4543x = z11;
            this.f4544y = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f4540u, this.f4541v, this.f4542w, this.f4543x, this.f4544y, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f4539t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            CoroutineContext coroutineContext = this.f4540u;
            C0095a c0095a = new C0095a(this.f4541v, this.f4542w, this.f4543x, this.f4544y, null);
            this.f4539t = 1;
            Object objG = ku.i.g(coroutineContext, c0095a, this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class b<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4560t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4561u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1 f4562v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nt.b bVar, u uVar, Function1 function1) {
            super(2, bVar);
            this.f4561u = uVar;
            this.f4562v = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(bVar, this.f4561u, this.f4562v);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f4560t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            u uVar = this.f4561u;
            e eVar = new e(true, false, uVar, null, this.f4562v);
            this.f4560t = 1;
            Object objW = uVar.W(false, eVar, this);
            return objW == objE ? objE : objW;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: c5.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
    public static final class C0098c<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4563t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4564u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4566w;

        public C0098c(nt.b<? super C0098c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4565v = obj;
            this.f4566w |= Integer.MIN_VALUE;
            return c5.a.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    public static final class d<R> extends pt.m implements Function1<nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4567t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4568u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<nt.b<? super R>, Object> f4569v;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<g0, nt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f4570t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f4571u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f4572v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4573w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ boolean f4574x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ u f4575y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Function1 f4576z;

            /* JADX INFO: renamed from: c5.c$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
            public static final class C0099a extends pt.m implements Function2<f0<R>, nt.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f4577t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f4578u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Function1 f4579v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0099a(nt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4579v = function1;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    C0099a c0099a = new C0099a(bVar, this.f4579v);
                    c0099a.f4578u = obj;
                    return c0099a;
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = ot.c.e();
                    int i10 = this.f4577t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj);
                        return obj;
                    }
                    jt.o.b(obj);
                    Function1 function1 = this.f4579v;
                    this.f4577t = 1;
                    kotlin.jvm.internal.l.c(6);
                    Object objInvoke = function1.invoke(this);
                    kotlin.jvm.internal.l.c(7);
                    return objInvoke == objE ? objE : objInvoke;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f0<R> f0Var, nt.b<? super R> bVar) {
                    return ((C0099a) create(f0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, u uVar, nt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4573w = z10;
                this.f4574x = z11;
                this.f4575y = uVar;
                this.f4576z = function1;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(this.f4573w, this.f4574x, this.f4575y, bVar, this.f4576z);
                aVar.f4572v = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
              0x00a8: PHI (r1v12 x4.g0) = (r1v9 x4.g0), (r1v19 x4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
            
                if (r9.A(r8) == r0) goto L51;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c5.c.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, nt.b<? super R> bVar) {
                return ((a) create(g0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(u uVar, Function1<? super nt.b<? super R>, ? extends Object> function1, nt.b<? super d> bVar) {
            super(1, bVar);
            this.f4568u = uVar;
            this.f4569v = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new d(this.f4568u, this.f4569v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f4567t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            u uVar = this.f4568u;
            a aVar = new a(true, false, uVar, null, this.f4569v);
            this.f4567t = 1;
            Object objW = uVar.W(false, aVar, this);
            return objW == objE ? objE : objW;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super R> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
    public static final class e<R> extends pt.m implements Function2<g0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4580t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4581u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4582v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4583w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4584x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4585y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4586z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<f0<R>, nt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4587t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4588u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4589v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(nt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4589v = function1;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(bVar, this.f4589v);
                aVar.f4588u = obj;
                return aVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f4587t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                Function1 function1 = this.f4589v;
                this.f4587t = 1;
                kotlin.jvm.internal.l.c(6);
                Object objInvoke = function1.invoke(this);
                kotlin.jvm.internal.l.c(7);
                return objInvoke == objE ? objE : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, nt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, u uVar, nt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4583w = z10;
            this.f4584x = z11;
            this.f4585y = uVar;
            this.f4586z = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            e eVar = new e(this.f4583w, this.f4584x, this.f4585y, bVar, this.f4586z);
            eVar.f4582v = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
          0x00a8: PHI (r1v12 x4.g0) = (r1v9 x4.g0), (r1v19 x4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.A(r8) == r0) goto L51;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, nt.b<? super R> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class f<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4590t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4591u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f4592v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4593w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function1 f4594x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(nt.b bVar, u uVar, boolean z10, boolean z11, Function1 function1) {
            super(2, bVar);
            this.f4591u = uVar;
            this.f4592v = z10;
            this.f4593w = z11;
            this.f4594x = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(bVar, this.f4591u, this.f4592v, this.f4593w, this.f4594x);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f4590t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            u uVar = this.f4591u;
            boolean z10 = this.f4592v;
            h hVar = new h(this.f4593w, z10, uVar, null, this.f4594x);
            this.f4590t = 1;
            Object objW = uVar.W(z10, hVar, this);
            return objW == objE ? objE : objW;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    public static final class g<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4595t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4596u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f4597v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f4598w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4599x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f4600y;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4599x = obj;
            this.f4600y |= Integer.MIN_VALUE;
            return c5.a.e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    public static final class h<R> extends pt.m implements Function2<g0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4601t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4602u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4603v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4604w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4605x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4606y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4607z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<f0<R>, nt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4608t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4609u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4610v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(nt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4610v = function1;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(bVar, this.f4610v);
                aVar.f4609u = obj;
                return aVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f4608t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                f0 f0Var = (f0) this.f4609u;
                Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f4610v.invoke(((q) f0Var).getDelegate());
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, nt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, boolean z11, u uVar, nt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4604w = z10;
            this.f4605x = z11;
            this.f4606y = uVar;
            this.f4607z = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            h hVar = new h(this.f4604w, this.f4605x, this.f4606y, bVar, this.f4607z);
            hVar.f4603v = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            g0.a aVar;
            g0 g0Var;
            g0 g0Var2;
            g0.a aVar2;
            g0 g0Var3;
            Object objB;
            Object obj2;
            Object objE = ot.c.e();
            int i10 = this.f4602u;
            if (i10 == 0) {
                jt.o.b(obj);
                g0 g0Var4 = (g0) this.f4603v;
                if (!this.f4604w) {
                    Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f4607z.invoke(((q) g0Var4).getDelegate());
                }
                boolean z10 = this.f4605x;
                aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                if (z10) {
                    g0Var = g0Var4;
                    a aVar3 = new a(null, this.f4607z);
                    this.f4603v = g0Var;
                    this.f4601t = null;
                    this.f4602u = 3;
                    obj = g0Var.c(aVar, aVar3, this);
                    if (obj != objE) {
                        if (this.f4605x) {
                            return obj;
                        }
                        this.f4603v = obj;
                        this.f4602u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f4606y.t().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f4603v = g0Var4;
                    this.f4601t = aVar;
                    this.f4602u = 1;
                    Object objB2 = g0Var4.b(this);
                    if (objB2 != objE) {
                        g0Var2 = g0Var4;
                        obj = objB2;
                        aVar2 = aVar;
                    }
                }
                return objE;
            }
            if (i10 == 1) {
                aVar2 = (g0.a) this.f4601t;
                g0Var2 = (g0) this.f4603v;
                jt.o.b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (g0.a) this.f4601t;
                    g0Var3 = (g0) this.f4603v;
                    jt.o.b(obj);
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar4 = new a(null, this.f4607z);
                    this.f4603v = g0Var;
                    this.f4601t = null;
                    this.f4602u = 3;
                    obj = g0Var.c(aVar, aVar4, this);
                    if (obj != objE) {
                        if (this.f4605x) {
                            return obj;
                        }
                        this.f4603v = obj;
                        this.f4602u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                        }
                    }
                    return objE;
                }
                if (i10 == 3) {
                    g0Var = (g0) this.f4603v;
                    jt.o.b(obj);
                    if (this.f4605x) {
                        return obj;
                    }
                    this.f4603v = obj;
                    this.f4602u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                    }
                    return objE;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f4603v;
                jt.o.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f4606y.t().u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                g0Var = g0Var2;
                a aVar5 = new a(null, this.f4607z);
                this.f4603v = g0Var;
                this.f4601t = null;
                this.f4602u = 3;
                obj = g0Var.c(aVar, aVar5, this);
                if (obj != objE) {
                    if (this.f4605x) {
                        return obj;
                    }
                    this.f4603v = obj;
                    this.f4602u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f4606y.t().u();
                        }
                        return obj2;
                    }
                }
            } else {
                androidx.room.c cVarT = this.f4606y.t();
                this.f4603v = g0Var2;
                this.f4601t = aVar2;
                this.f4602u = 2;
                if (cVarT.A(this) != objE) {
                    g0Var3 = g0Var2;
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar6 = new a(null, this.f4607z);
                    this.f4603v = g0Var;
                    this.f4601t = null;
                    this.f4602u = 3;
                    obj = g0Var.c(aVar, aVar6, this);
                    if (obj != objE) {
                        if (this.f4605x) {
                            return obj;
                        }
                        this.f4603v = obj;
                        this.f4602u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f4606y.t().u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return objE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, nt.b<? super R> bVar) {
            return ((h) create(g0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final Object a(@NotNull u uVar, boolean z10, @NotNull nt.b<? super CoroutineContext> bVar) {
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        CoroutineContext transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        if (uVar.F()) {
            if (transactionDispatcher != null) {
                return uVar.v().plus(transactionDispatcher);
            }
            return z10 ? uVar.C() : uVar.v();
        }
        CoroutineContext coroutineContextV = uVar.v();
        if (transactionDispatcher == null) {
            transactionDispatcher = kotlin.coroutines.e.f22525a;
        }
        return coroutineContextV.plus(transactionDispatcher);
    }

    public static final <R> R b(@NotNull u db2, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.g();
        db2.h();
        CoroutineContext coroutineContext = db2.B().get();
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.e.f22525a;
        }
        return (R) r.a(new a(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final <R> Object c(@NotNull u uVar, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1, @NotNull nt.b<? super R> bVar) {
        C0098c c0098c;
        u uVar2;
        Function1<? super nt.b<? super R>, ? extends Object> function2;
        if (bVar instanceof C0098c) {
            c0098c = (C0098c) bVar;
            int i10 = c0098c.f4566w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0098c.f4566w = i10 - Integer.MIN_VALUE;
            } else {
                c0098c = new C0098c(bVar);
            }
        } else {
            c0098c = new C0098c(bVar);
        }
        C0098c c0098c2 = c0098c;
        Object objB = c0098c2.f4565v;
        Object objE = ot.c.e();
        int i11 = c0098c2.f4566w;
        if (i11 == 0) {
            jt.o.b(objB);
            if (uVar.F()) {
                d dVar = new d(uVar, function1, null);
                c0098c2.f4566w = 1;
                Object objE2 = v.e(uVar, dVar, c0098c2);
                if (objE2 != objE) {
                    return objE2;
                }
            } else if (uVar.F() && uVar.M() && uVar.G()) {
                e eVar = new e(true, false, uVar, null, function1);
                c0098c2.f4566w = 2;
                Object objW = uVar.W(false, eVar, c0098c2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                c0098c2.f4563t = uVar;
                c0098c2.f4564u = function1;
                c0098c2.f4566w = 3;
                objB = c5.a.b(uVar, true, c0098c2);
                if (objB != objE) {
                    uVar2 = uVar;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            jt.o.b(objB);
            return objB;
        }
        if (i11 == 2) {
            jt.o.b(objB);
            return objB;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objB);
            return objB;
        }
        function2 = (Function1) c0098c2.f4564u;
        uVar2 = (u) c0098c2.f4563t;
        jt.o.b(objB);
        b bVar2 = new b(null, uVar2, function2);
        c0098c2.f4563t = null;
        c0098c2.f4564u = null;
        c0098c2.f4566w = 4;
        Object objG = ku.i.g((CoroutineContext) objB, bVar2, c0098c2);
        return objG == objE ? objE : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final <R> Object d(@NotNull u uVar, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> function1, @NotNull nt.b<? super R> bVar) {
        g gVar;
        u uVar2;
        boolean z12;
        Function1<? super f5.b, ? extends R> function2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f4600y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f4600y = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f4599x;
        Object objE = ot.c.e();
        int i11 = gVar2.f4600y;
        if (i11 == 0) {
            jt.o.b(obj);
            if (uVar.F() && uVar.M() && uVar.G()) {
                h hVar = new h(z11, z10, uVar, null, function1);
                gVar2.f4600y = 1;
                Object objW = uVar.W(z10, hVar, gVar2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                gVar2.f4595t = uVar;
                gVar2.f4596u = function1;
                gVar2.f4597v = z10;
                gVar2.f4598w = z11;
                gVar2.f4600y = 2;
                Object objB = c5.a.b(uVar, z11, gVar2);
                if (objB != objE) {
                    uVar2 = uVar;
                    obj = objB;
                    z12 = z11;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            jt.o.b(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return obj;
        }
        boolean z13 = gVar2.f4598w;
        z10 = gVar2.f4597v;
        Function1<? super f5.b, ? extends R> function3 = (Function1) gVar2.f4596u;
        u uVar3 = (u) gVar2.f4595t;
        jt.o.b(obj);
        z12 = z13;
        function2 = function3;
        uVar2 = uVar3;
        f fVar = new f(null, uVar2, z10, z12, function2);
        gVar2.f4595t = null;
        gVar2.f4596u = null;
        gVar2.f4600y = 3;
        Object objG = ku.i.g((CoroutineContext) obj, fVar, gVar2);
        return objG == objE ? objE : objG;
    }

    public static final int e(@NotNull File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            ut.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ut.c.a(channel, th2);
                throw th3;
            }
        }
    }
}
