package c5;

import iu.p0;
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
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"R", "Lx4/u;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lf5/b;", "block", "d", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "b", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Llt/b;", "", "c", "(Lx4/u;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "(Lx4/u;ZLlt/b;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", "", "e", "(Ljava/io/File;)I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a<R> extends nt.m implements Function2<p0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4705t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f4706u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f4707v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4708w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4709x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.b, R> f4710y;

        /* JADX INFO: renamed from: c5.c$a$a, reason: collision with other inner class name */
        @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C0095a extends nt.m implements Function2<p0, lt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4711t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ u f4712u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ boolean f4713v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4714w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function1<f5.b, R> f4715x;

            /* JADX INFO: renamed from: c5.c$a$a$a, reason: collision with other inner class name */
            @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            public static final class C0096a extends nt.m implements Function2<g0, lt.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f4716t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f4717u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public /* synthetic */ Object f4718v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f4719w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f4720x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ u f4721y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ Function1 f4722z;

                /* JADX INFO: renamed from: c5.c$a$a$a$a, reason: collision with other inner class name */
                @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                public static final class C0097a extends nt.m implements Function2<f0<R>, lt.b<? super R>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f4723t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public /* synthetic */ Object f4724u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ Function1 f4725v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0097a(lt.b bVar, Function1 function1) {
                        super(2, bVar);
                        this.f4725v = function1;
                    }

                    @Override // nt.a
                    public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                        C0097a c0097a = new C0097a(bVar, this.f4725v);
                        c0097a.f4724u = obj;
                        return c0097a;
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        mt.c.e();
                        if (this.f4723t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        f0 f0Var = (f0) this.f4724u;
                        Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f4725v.invoke(((q) f0Var).getDelegate());
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(f0<R> f0Var, lt.b<? super R> bVar) {
                        return ((C0097a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0096a(boolean z10, boolean z11, u uVar, lt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4719w = z10;
                    this.f4720x = z11;
                    this.f4721y = uVar;
                    this.f4722z = function1;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    C0096a c0096a = new C0096a(this.f4719w, this.f4720x, this.f4721y, bVar, this.f4722z);
                    c0096a.f4718v = obj;
                    return c0096a;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
                  0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    g0.a aVar;
                    g0 g0Var;
                    g0 g0Var2;
                    g0.a aVar2;
                    g0 g0Var3;
                    Object objB;
                    Object obj2;
                    Object objE = mt.c.e();
                    int i10 = this.f4717u;
                    if (i10 == 0) {
                        gt.o.b(obj);
                        g0 g0Var4 = (g0) this.f4718v;
                        if (!this.f4719w) {
                            Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                            return this.f4722z.invoke(((q) g0Var4).getDelegate());
                        }
                        boolean z10 = this.f4720x;
                        aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                        if (z10) {
                            g0Var = g0Var4;
                            C0097a c0097a = new C0097a(null, this.f4722z);
                            this.f4718v = g0Var;
                            this.f4716t = null;
                            this.f4717u = 3;
                            obj = g0Var.d(aVar, c0097a, this);
                            if (obj != objE) {
                                if (this.f4720x) {
                                    return obj;
                                }
                                this.f4718v = obj;
                                this.f4717u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f4721y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f4718v = g0Var4;
                            this.f4716t = aVar;
                            this.f4717u = 1;
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
                        aVar2 = (g0.a) this.f4716t;
                        g0Var2 = (g0) this.f4718v;
                        gt.o.b(obj);
                    } else {
                        if (i10 == 2) {
                            aVar2 = (g0.a) this.f4716t;
                            g0Var3 = (g0) this.f4718v;
                            gt.o.b(obj);
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0097a c0097a2 = new C0097a(null, this.f4722z);
                            this.f4718v = g0Var;
                            this.f4716t = null;
                            this.f4717u = 3;
                            obj = g0Var.d(aVar, c0097a2, this);
                            if (obj != objE) {
                                if (this.f4720x) {
                                    return obj;
                                }
                                this.f4718v = obj;
                                this.f4717u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                }
                            }
                            return objE;
                        }
                        if (i10 == 3) {
                            g0Var = (g0) this.f4718v;
                            gt.o.b(obj);
                            if (this.f4720x) {
                                return obj;
                            }
                            this.f4718v = obj;
                            this.f4717u = 4;
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
                        obj2 = this.f4718v;
                        gt.o.b(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        this.f4721y.t().u();
                    }
                    return obj2;
                    if (((Boolean) obj).booleanValue()) {
                        aVar = aVar2;
                        g0Var = g0Var2;
                        C0097a c0097a3 = new C0097a(null, this.f4722z);
                        this.f4718v = g0Var;
                        this.f4716t = null;
                        this.f4717u = 3;
                        obj = g0Var.d(aVar, c0097a3, this);
                        if (obj != objE) {
                            if (this.f4720x) {
                                return obj;
                            }
                            this.f4718v = obj;
                            this.f4717u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f4721y.t().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        androidx.room.c cVarT = this.f4721y.t();
                        this.f4718v = g0Var2;
                        this.f4716t = aVar2;
                        this.f4717u = 2;
                        if (cVarT.A(this) != objE) {
                            g0Var3 = g0Var2;
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0097a c0097a4 = new C0097a(null, this.f4722z);
                            this.f4718v = g0Var;
                            this.f4716t = null;
                            this.f4717u = 3;
                            obj = g0Var.d(aVar, c0097a4, this);
                            if (obj != objE) {
                                if (this.f4720x) {
                                    return obj;
                                }
                                this.f4718v = obj;
                                this.f4717u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f4721y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        }
                    }
                    return objE;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g0 g0Var, lt.b<? super R> bVar) {
                    return ((C0096a) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0095a(u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, lt.b<? super C0095a> bVar) {
                super(2, bVar);
                this.f4712u = uVar;
                this.f4713v = z10;
                this.f4714w = z11;
                this.f4715x = function1;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0095a(this.f4712u, this.f4713v, this.f4714w, this.f4715x, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super R> bVar) {
                return ((C0095a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f4711t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                boolean z10 = !(this.f4712u.F() && this.f4712u.G()) && this.f4713v;
                u uVar = this.f4712u;
                boolean z11 = this.f4714w;
                C0096a c0096a = new C0096a(z10, z11, uVar, null, this.f4715x);
                this.f4711t = 1;
                Object objW = uVar.W(z11, c0096a, this);
                return objW == objE ? objE : objW;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f4706u = coroutineContext;
            this.f4707v = uVar;
            this.f4708w = z10;
            this.f4709x = z11;
            this.f4710y = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f4706u, this.f4707v, this.f4708w, this.f4709x, this.f4710y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super R> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4705t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            CoroutineContext coroutineContext = this.f4706u;
            C0095a c0095a = new C0095a(this.f4707v, this.f4708w, this.f4709x, this.f4710y, null);
            this.f4705t = 1;
            Object objG = iu.i.g(coroutineContext, c0095a, this);
            return objG == objE ? objE : objG;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b<R> extends nt.m implements Function2<p0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4726t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4727u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1 f4728v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lt.b bVar, u uVar, Function1 function1) {
            super(2, bVar);
            this.f4727u = uVar;
            this.f4728v = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(bVar, this.f4727u, this.f4728v);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4726t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4727u;
            e eVar = new e(true, false, uVar, null, this.f4728v);
            this.f4726t = 1;
            Object objW = uVar.W(false, eVar, this);
            return objW == objE ? objE : objW;
        }
    }

    /* JADX INFO: renamed from: c5.c$c, reason: collision with other inner class name */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0098c<R> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4729t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4730u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4731v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4732w;

        public C0098c(lt.b<? super C0098c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4731v = obj;
            this.f4732w |= Integer.MIN_VALUE;
            return c5.a.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<R> extends nt.m implements Function1<lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4733t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4734u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super R>, Object> f4735v;

        @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<g0, lt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f4736t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f4737u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f4738v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4739w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ boolean f4740x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ u f4741y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Function1 f4742z;

            /* JADX INFO: renamed from: c5.c$d$a$a, reason: collision with other inner class name */
            @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            public static final class C0099a extends nt.m implements Function2<f0<R>, lt.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f4743t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f4744u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Function1 f4745v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0099a(lt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4745v = function1;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    C0099a c0099a = new C0099a(bVar, this.f4745v);
                    c0099a.f4744u = obj;
                    return c0099a;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = mt.c.e();
                    int i10 = this.f4743t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        return obj;
                    }
                    gt.o.b(obj);
                    Function1 function1 = this.f4745v;
                    this.f4743t = 1;
                    kotlin.jvm.internal.l.c(6);
                    Object objInvoke = function1.invoke(this);
                    kotlin.jvm.internal.l.c(7);
                    return objInvoke == objE ? objE : objInvoke;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f0<R> f0Var, lt.b<? super R> bVar) {
                    return ((C0099a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, u uVar, lt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4739w = z10;
                this.f4740x = z11;
                this.f4741y = uVar;
                this.f4742z = function1;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f4739w, this.f4740x, this.f4741y, bVar, this.f4742z);
                aVar.f4738v = obj;
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
            @Override // nt.a
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
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, lt.b<? super R> bVar) {
                return ((a) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(u uVar, Function1<? super lt.b<? super R>, ? extends Object> function1, lt.b<? super d> bVar) {
            super(1, bVar);
            this.f4734u = uVar;
            this.f4735v = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new d(this.f4734u, this.f4735v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4733t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4734u;
            a aVar = new a(true, false, uVar, null, this.f4735v);
            this.f4733t = 1;
            Object objW = uVar.W(false, aVar, this);
            return objW == objE ? objE : objW;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super R> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e<R> extends nt.m implements Function2<g0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4746t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4747u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4748v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4749w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4750x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4751y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4752z;

        @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<f0<R>, lt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4753t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4754u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4755v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4755v = function1;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(bVar, this.f4755v);
                aVar.f4754u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f4753t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                Function1 function1 = this.f4755v;
                this.f4753t = 1;
                kotlin.jvm.internal.l.c(6);
                Object objInvoke = function1.invoke(this);
                kotlin.jvm.internal.l.c(7);
                return objInvoke == objE ? objE : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, lt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, u uVar, lt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4749w = z10;
            this.f4750x = z11;
            this.f4751y = uVar;
            this.f4752z = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            e eVar = new e(this.f4749w, this.f4750x, this.f4751y, bVar, this.f4752z);
            eVar.f4748v = obj;
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
        @Override // nt.a
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, lt.b<? super R> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f<R> extends nt.m implements Function2<p0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4756t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4757u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f4758v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4759w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function1 f4760x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lt.b bVar, u uVar, boolean z10, boolean z11, Function1 function1) {
            super(2, bVar);
            this.f4757u = uVar;
            this.f4758v = z10;
            this.f4759w = z11;
            this.f4760x = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(bVar, this.f4757u, this.f4758v, this.f4759w, this.f4760x);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super R> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4756t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4757u;
            boolean z10 = this.f4758v;
            h hVar = new h(this.f4759w, z10, uVar, null, this.f4760x);
            this.f4756t = 1;
            Object objW = uVar.W(z10, hVar, this);
            return objW == objE ? objE : objW;
        }
    }

    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<R> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4761t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4762u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f4763v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f4764w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4765x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f4766y;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4765x = obj;
            this.f4766y |= Integer.MIN_VALUE;
            return c5.a.e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h<R> extends nt.m implements Function2<g0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4767t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4768u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4769v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4770w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4771x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4772y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4773z;

        @nt.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<f0<R>, lt.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4774t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4775u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4776v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4776v = function1;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(bVar, this.f4776v);
                aVar.f4775u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f4774t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                f0 f0Var = (f0) this.f4775u;
                Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f4776v.invoke(((q) f0Var).getDelegate());
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, lt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, boolean z11, u uVar, lt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4770w = z10;
            this.f4771x = z11;
            this.f4772y = uVar;
            this.f4773z = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            h hVar = new h(this.f4770w, this.f4771x, this.f4772y, bVar, this.f4773z);
            hVar.f4769v = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            g0.a aVar;
            g0 g0Var;
            g0 g0Var2;
            g0.a aVar2;
            g0 g0Var3;
            Object objB;
            Object obj2;
            Object objE = mt.c.e();
            int i10 = this.f4768u;
            if (i10 == 0) {
                gt.o.b(obj);
                g0 g0Var4 = (g0) this.f4769v;
                if (!this.f4770w) {
                    Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f4773z.invoke(((q) g0Var4).getDelegate());
                }
                boolean z10 = this.f4771x;
                aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                if (z10) {
                    g0Var = g0Var4;
                    a aVar3 = new a(null, this.f4773z);
                    this.f4769v = g0Var;
                    this.f4767t = null;
                    this.f4768u = 3;
                    obj = g0Var.d(aVar, aVar3, this);
                    if (obj != objE) {
                        if (this.f4771x) {
                            return obj;
                        }
                        this.f4769v = obj;
                        this.f4768u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f4772y.t().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f4769v = g0Var4;
                    this.f4767t = aVar;
                    this.f4768u = 1;
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
                aVar2 = (g0.a) this.f4767t;
                g0Var2 = (g0) this.f4769v;
                gt.o.b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (g0.a) this.f4767t;
                    g0Var3 = (g0) this.f4769v;
                    gt.o.b(obj);
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar4 = new a(null, this.f4773z);
                    this.f4769v = g0Var;
                    this.f4767t = null;
                    this.f4768u = 3;
                    obj = g0Var.d(aVar, aVar4, this);
                    if (obj != objE) {
                        if (this.f4771x) {
                            return obj;
                        }
                        this.f4769v = obj;
                        this.f4768u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                        }
                    }
                    return objE;
                }
                if (i10 == 3) {
                    g0Var = (g0) this.f4769v;
                    gt.o.b(obj);
                    if (this.f4771x) {
                        return obj;
                    }
                    this.f4769v = obj;
                    this.f4768u = 4;
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
                obj2 = this.f4769v;
                gt.o.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f4772y.t().u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                g0Var = g0Var2;
                a aVar5 = new a(null, this.f4773z);
                this.f4769v = g0Var;
                this.f4767t = null;
                this.f4768u = 3;
                obj = g0Var.d(aVar, aVar5, this);
                if (obj != objE) {
                    if (this.f4771x) {
                        return obj;
                    }
                    this.f4769v = obj;
                    this.f4768u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f4772y.t().u();
                        }
                        return obj2;
                    }
                }
            } else {
                androidx.room.c cVarT = this.f4772y.t();
                this.f4769v = g0Var2;
                this.f4767t = aVar2;
                this.f4768u = 2;
                if (cVarT.A(this) != objE) {
                    g0Var3 = g0Var2;
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar6 = new a(null, this.f4773z);
                    this.f4769v = g0Var;
                    this.f4767t = null;
                    this.f4768u = 3;
                    obj = g0Var.d(aVar, aVar6, this);
                    if (obj != objE) {
                        if (this.f4771x) {
                            return obj;
                        }
                        this.f4769v = obj;
                        this.f4768u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f4772y.t().u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return objE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, lt.b<? super R> bVar) {
            return ((h) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @Nullable
    public static final Object a(@NotNull u uVar, boolean z10, @NotNull lt.b<? super CoroutineContext> bVar) {
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
            transactionDispatcher = kotlin.coroutines.e.f22980a;
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
            coroutineContext = kotlin.coroutines.e.f22980a;
        }
        return (R) r.a(new a(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final <R> Object c(@NotNull u uVar, @NotNull Function1<? super lt.b<? super R>, ? extends Object> function1, @NotNull lt.b<? super R> bVar) {
        C0098c c0098c;
        u uVar2;
        Function1<? super lt.b<? super R>, ? extends Object> function2;
        if (bVar instanceof C0098c) {
            c0098c = (C0098c) bVar;
            int i10 = c0098c.f4732w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0098c.f4732w = i10 - Integer.MIN_VALUE;
            } else {
                c0098c = new C0098c(bVar);
            }
        } else {
            c0098c = new C0098c(bVar);
        }
        C0098c c0098c2 = c0098c;
        Object objB = c0098c2.f4731v;
        Object objE = mt.c.e();
        int i11 = c0098c2.f4732w;
        if (i11 == 0) {
            gt.o.b(objB);
            if (uVar.F()) {
                d dVar = new d(uVar, function1, null);
                c0098c2.f4732w = 1;
                Object objE2 = v.e(uVar, dVar, c0098c2);
                if (objE2 != objE) {
                    return objE2;
                }
            } else if (uVar.F() && uVar.M() && uVar.G()) {
                e eVar = new e(true, false, uVar, null, function1);
                c0098c2.f4732w = 2;
                Object objW = uVar.W(false, eVar, c0098c2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                c0098c2.f4729t = uVar;
                c0098c2.f4730u = function1;
                c0098c2.f4732w = 3;
                objB = c5.a.b(uVar, true, c0098c2);
                if (objB != objE) {
                    uVar2 = uVar;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            gt.o.b(objB);
            return objB;
        }
        if (i11 == 2) {
            gt.o.b(objB);
            return objB;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objB);
            return objB;
        }
        function2 = (Function1) c0098c2.f4730u;
        uVar2 = (u) c0098c2.f4729t;
        gt.o.b(objB);
        b bVar2 = new b(null, uVar2, function2);
        c0098c2.f4729t = null;
        c0098c2.f4730u = null;
        c0098c2.f4732w = 4;
        Object objG = iu.i.g((CoroutineContext) objB, bVar2, c0098c2);
        return objG == objE ? objE : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final <R> Object d(@NotNull u uVar, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> function1, @NotNull lt.b<? super R> bVar) {
        g gVar;
        u uVar2;
        boolean z12;
        Function1<? super f5.b, ? extends R> function2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f4766y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f4766y = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f4765x;
        Object objE = mt.c.e();
        int i11 = gVar2.f4766y;
        if (i11 == 0) {
            gt.o.b(obj);
            if (uVar.F() && uVar.M() && uVar.G()) {
                h hVar = new h(z11, z10, uVar, null, function1);
                gVar2.f4766y = 1;
                Object objW = uVar.W(z10, hVar, gVar2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                gVar2.f4761t = uVar;
                gVar2.f4762u = function1;
                gVar2.f4763v = z10;
                gVar2.f4764w = z11;
                gVar2.f4766y = 2;
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
            gt.o.b(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return obj;
        }
        boolean z13 = gVar2.f4764w;
        z10 = gVar2.f4763v;
        Function1<? super f5.b, ? extends R> function3 = (Function1) gVar2.f4762u;
        u uVar3 = (u) gVar2.f4761t;
        gt.o.b(obj);
        z12 = z13;
        function2 = function3;
        uVar2 = uVar3;
        f fVar = new f(null, uVar2, z10, z12, function2);
        gVar2.f4761t = null;
        gVar2.f4762u = null;
        gVar2.f4766y = 3;
        Object objG = iu.i.g((CoroutineContext) obj, fVar, gVar2);
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
            st.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                st.c.a(channel, th2);
                throw th3;
            }
        }
    }
}
