package d5;

import a5.q;
import a5.r;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y4.c0;
import y4.f0;
import y4.g0;
import y4.u;
import y4.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"R", "Ly4/u;", "db", BuildConfig.FLAVOR, "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lg5/b;", "block", "d", "(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "b", "(Ly4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Leu/b;", BuildConfig.FLAVOR, "c", "(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "(Ly4/u;ZLeu/b;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", BuildConfig.FLAVOR, "e", "(Ljava/io/File;)I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
    public static final class a<R> extends gu.m implements Function2<p0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f11851u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f11852v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11853w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f11854x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<g5.b, R> f11855y;

        /* JADX INFO: renamed from: d5.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
        public static final class C0211a extends gu.m implements Function2<p0, eu.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11856t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ u f11857u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ boolean f11858v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f11859w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function1<g5.b, R> f11860x;

            /* JADX INFO: renamed from: d5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Ly4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
            public static final class C0212a extends gu.m implements Function2<g0, eu.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f11861t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f11862u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public /* synthetic */ Object f11863v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f11864w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f11865x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ u f11866y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ Function1 f11867z;

                /* JADX INFO: renamed from: d5.c$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Ly4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
                public static final class C0213a extends gu.m implements Function2<f0<R>, eu.b<? super R>, Object> {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public int f11868t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public /* synthetic */ Object f11869u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ Function1 f11870v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0213a(eu.b bVar, Function1 function1) {
                        super(2, bVar);
                        this.f11870v = function1;
                    }

                    @Override // gu.a
                    public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                        C0213a c0213a = new C0213a(bVar, this.f11870v);
                        c0213a.f11869u = obj;
                        return c0213a;
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        fu.c.e();
                        if (this.f11868t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                        f0 f0Var = (f0) this.f11869u;
                        Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f11870v.invoke(((q) f0Var).getDelegate());
                    }

                    @Override // p001kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(f0<R> f0Var, eu.b<? super R> bVar) {
                        return ((C0213a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0212a(boolean z10, boolean z11, u uVar, eu.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f11864w = z10;
                    this.f11865x = z11;
                    this.f11866y = uVar;
                    this.f11867z = function1;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    C0212a c0212a = new C0212a(this.f11864w, this.f11865x, this.f11866y, bVar, this.f11867z);
                    c0212a.f11863v = obj;
                    return c0212a;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
                  0x00a2: PHI (r1v11 y4.g0) = (r1v8 y4.g0), (r1v18 y4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    g0.a aVar;
                    g0 g0Var;
                    g0 g0Var2;
                    g0.a aVar2;
                    g0 g0Var3;
                    Object objB;
                    Object obj2;
                    Object objE = fu.c.e();
                    int i10 = this.f11862u;
                    if (i10 == 0) {
                        zt.o.b(obj);
                        g0 g0Var4 = (g0) this.f11863v;
                        if (!this.f11864w) {
                            Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                            return this.f11867z.invoke(((q) g0Var4).getDelegate());
                        }
                        boolean z10 = this.f11865x;
                        aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                        if (z10) {
                            g0Var = g0Var4;
                            C0213a c0213a = new C0213a(null, this.f11867z);
                            this.f11863v = g0Var;
                            this.f11861t = null;
                            this.f11862u = 3;
                            obj = g0Var.c(aVar, c0213a, this);
                            if (obj != objE) {
                                if (this.f11865x) {
                                    return obj;
                                }
                                this.f11863v = obj;
                                this.f11862u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f11866y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f11863v = g0Var4;
                            this.f11861t = aVar;
                            this.f11862u = 1;
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
                        aVar2 = (g0.a) this.f11861t;
                        g0Var2 = (g0) this.f11863v;
                        zt.o.b(obj);
                    } else {
                        if (i10 == 2) {
                            aVar2 = (g0.a) this.f11861t;
                            g0Var3 = (g0) this.f11863v;
                            zt.o.b(obj);
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0213a c0213a2 = new C0213a(null, this.f11867z);
                            this.f11863v = g0Var;
                            this.f11861t = null;
                            this.f11862u = 3;
                            obj = g0Var.c(aVar, c0213a2, this);
                            if (obj != objE) {
                                if (this.f11865x) {
                                    return obj;
                                }
                                this.f11863v = obj;
                                this.f11862u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                }
                            }
                            return objE;
                        }
                        if (i10 == 3) {
                            g0Var = (g0) this.f11863v;
                            zt.o.b(obj);
                            if (this.f11865x) {
                                return obj;
                            }
                            this.f11863v = obj;
                            this.f11862u = 4;
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
                        obj2 = this.f11863v;
                        zt.o.b(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        this.f11866y.t().u();
                    }
                    return obj2;
                    if (((Boolean) obj).booleanValue()) {
                        aVar = aVar2;
                        g0Var = g0Var2;
                        C0213a c0213a3 = new C0213a(null, this.f11867z);
                        this.f11863v = g0Var;
                        this.f11861t = null;
                        this.f11862u = 3;
                        obj = g0Var.c(aVar, c0213a3, this);
                        if (obj != objE) {
                            if (this.f11865x) {
                                return obj;
                            }
                            this.f11863v = obj;
                            this.f11862u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f11866y.t().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        androidx.room.c cVarT = this.f11866y.t();
                        this.f11863v = g0Var2;
                        this.f11861t = aVar2;
                        this.f11862u = 2;
                        if (cVarT.A(this) != objE) {
                            g0Var3 = g0Var2;
                            aVar = aVar2;
                            g0Var = g0Var3;
                            C0213a c0213a4 = new C0213a(null, this.f11867z);
                            this.f11863v = g0Var;
                            this.f11861t = null;
                            this.f11862u = 3;
                            obj = g0Var.c(aVar, c0213a4, this);
                            if (obj != objE) {
                                if (this.f11865x) {
                                    return obj;
                                }
                                this.f11863v = obj;
                                this.f11862u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f11866y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        }
                    }
                    return objE;
                }

                @Override // p001kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g0 g0Var, eu.b<? super R> bVar) {
                    return ((C0212a) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0211a(u uVar, boolean z10, boolean z11, Function1<? super g5.b, ? extends R> function1, eu.b<? super C0211a> bVar) {
                super(2, bVar);
                this.f11857u = uVar;
                this.f11858v = z10;
                this.f11859w = z11;
                this.f11860x = function1;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0211a(this.f11857u, this.f11858v, this.f11859w, this.f11860x, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super R> bVar) {
                return ((C0211a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f11856t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                boolean z10 = !(this.f11857u.F() && this.f11857u.G()) && this.f11858v;
                u uVar = this.f11857u;
                boolean z11 = this.f11859w;
                C0212a c0212a = new C0212a(z10, z11, uVar, null, this.f11860x);
                this.f11856t = 1;
                Object objW = uVar.W(z11, c0212a, this);
                return objW == objE ? objE : objW;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, u uVar, boolean z10, boolean z11, Function1<? super g5.b, ? extends R> function1, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f11851u = coroutineContext;
            this.f11852v = uVar;
            this.f11853w = z10;
            this.f11854x = z11;
            this.f11855y = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f11851u, this.f11852v, this.f11853w, this.f11854x, this.f11855y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super R> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11850t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            CoroutineContext coroutineContext = this.f11851u;
            C0211a c0211a = new C0211a(this.f11852v, this.f11853w, this.f11854x, this.f11855y, null);
            this.f11850t = 1;
            Object objG = av.i.g(coroutineContext, c0211a, this);
            return objG == objE ? objE : objG;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class b<R> extends gu.m implements Function2<p0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11871t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f11872u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1 f11873v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eu.b bVar, u uVar, Function1 function1) {
            super(2, bVar);
            this.f11872u = uVar;
            this.f11873v = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(bVar, this.f11872u, this.f11873v);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11871t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            u uVar = this.f11872u;
            e eVar = new e(true, false, uVar, null, this.f11873v);
            this.f11871t = 1;
            Object objW = uVar.W(false, eVar, this);
            return objW == objE ? objE : objW;
        }
    }

    /* JADX INFO: renamed from: d5.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
    public static final class C0214c<R> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11874t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11875u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11876v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11877w;

        public C0214c(eu.b<? super C0214c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11876v = obj;
            this.f11877w |= Integer.MIN_VALUE;
            return d5.a.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    public static final class d<R> extends gu.m implements Function1<eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11878t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f11879u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super R>, Object> f11880v;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Ly4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<g0, eu.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f11881t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f11882u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f11883v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f11884w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ boolean f11885x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ u f11886y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Function1 f11887z;

            /* JADX INFO: renamed from: d5.c$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Ly4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
            public static final class C0215a extends gu.m implements Function2<f0<R>, eu.b<? super R>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f11888t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f11889u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Function1 f11890v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0215a(eu.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f11890v = function1;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    C0215a c0215a = new C0215a(bVar, this.f11890v);
                    c0215a.f11889u = obj;
                    return c0215a;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = fu.c.e();
                    int i10 = this.f11888t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                        return obj;
                    }
                    zt.o.b(obj);
                    Function1 function1 = this.f11890v;
                    this.f11888t = 1;
                    p001kotlin.jvm.internal.l.c(6);
                    Object objInvoke = function1.invoke(this);
                    p001kotlin.jvm.internal.l.c(7);
                    return objInvoke == objE ? objE : objInvoke;
                }

                @Override // p001kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f0<R> f0Var, eu.b<? super R> bVar) {
                    return ((C0215a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, u uVar, eu.b bVar, Function1 function1) {
                super(2, bVar);
                this.f11884w = z10;
                this.f11885x = z11;
                this.f11886y = uVar;
                this.f11887z = function1;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.f11884w, this.f11885x, this.f11886y, bVar, this.f11887z);
                aVar.f11883v = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
              0x00a8: PHI (r1v12 y4.g0) = (r1v9 y4.g0), (r1v19 y4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
            
                if (r9.A(r8) == r0) goto L51;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                g0.a aVar;
                g0 g0Var;
                g0 g0Var2;
                g0.a aVar2;
                Object objB;
                Object obj2;
                Object objE = fu.c.e();
                int i10 = this.f11882u;
                if (i10 == 0) {
                    zt.o.b(obj);
                    g0 g0Var3 = (g0) this.f11883v;
                    if (this.f11884w) {
                        boolean z10 = this.f11885x;
                        aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                        if (z10) {
                            g0Var = g0Var3;
                            C0215a c0215a = new C0215a(null, this.f11887z);
                            this.f11883v = g0Var;
                            this.f11881t = null;
                            this.f11882u = 3;
                            obj = g0Var.c(aVar, c0215a, this);
                            if (obj != objE) {
                                if (!this.f11885x) {
                                    return obj;
                                }
                                this.f11883v = obj;
                                this.f11882u = 4;
                                objB = g0Var.b(this);
                                if (objB != objE) {
                                    obj2 = obj;
                                    obj = objB;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f11886y.t().u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f11883v = g0Var3;
                            this.f11881t = aVar;
                            this.f11882u = 1;
                            Object objB2 = g0Var3.b(this);
                            if (objB2 != objE) {
                                g0.a aVar3 = aVar;
                                g0Var2 = g0Var3;
                                obj = objB2;
                                aVar2 = aVar3;
                            }
                        }
                    } else {
                        Function1 function1 = this.f11887z;
                        this.f11882u = 5;
                        p001kotlin.jvm.internal.l.c(6);
                        Object objInvoke = function1.invoke(this);
                        p001kotlin.jvm.internal.l.c(7);
                        if (objInvoke != objE) {
                            return objInvoke;
                        }
                    }
                    return objE;
                }
                if (i10 == 1) {
                    aVar2 = (g0.a) this.f11881t;
                    g0Var2 = (g0) this.f11883v;
                    zt.o.b(obj);
                } else {
                    if (i10 == 2) {
                        aVar2 = (g0.a) this.f11881t;
                        g0Var2 = (g0) this.f11883v;
                        zt.o.b(obj);
                        g0 g0Var4 = g0Var2;
                        aVar = aVar2;
                        g0Var = g0Var4;
                        C0215a c0215a2 = new C0215a(null, this.f11887z);
                        this.f11883v = g0Var;
                        this.f11881t = null;
                        this.f11882u = 3;
                        obj = g0Var.c(aVar, c0215a2, this);
                        if (obj != objE) {
                            if (!this.f11885x) {
                                return obj;
                            }
                            this.f11883v = obj;
                            this.f11882u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                            }
                        }
                        return objE;
                    }
                    if (i10 == 3) {
                        g0Var = (g0) this.f11883v;
                        zt.o.b(obj);
                        if (!this.f11885x) {
                            return obj;
                        }
                        this.f11883v = obj;
                        this.f11882u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                        }
                        return objE;
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                        return obj;
                    }
                    obj2 = this.f11883v;
                    zt.o.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.f11886y.t().u();
                }
                return obj2;
                if (!((Boolean) obj).booleanValue()) {
                    androidx.room.c cVarT = this.f11886y.t();
                    this.f11883v = g0Var2;
                    this.f11881t = aVar2;
                    this.f11882u = 2;
                }
                g0 g0Var5 = g0Var2;
                aVar = aVar2;
                g0Var = g0Var5;
                C0215a c0215a3 = new C0215a(null, this.f11887z);
                this.f11883v = g0Var;
                this.f11881t = null;
                this.f11882u = 3;
                obj = g0Var.c(aVar, c0215a3, this);
                if (obj != objE) {
                    if (!this.f11885x) {
                        return obj;
                    }
                    this.f11883v = obj;
                    this.f11882u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f11886y.t().u();
                        }
                        return obj2;
                    }
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, eu.b<? super R> bVar) {
                return ((a) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(u uVar, Function1<? super eu.b<? super R>, ? extends Object> function1, eu.b<? super d> bVar) {
            super(1, bVar);
            this.f11879u = uVar;
            this.f11880v = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new d(this.f11879u, this.f11880v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11878t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            u uVar = this.f11879u;
            a aVar = new a(true, false, uVar, null, this.f11880v);
            this.f11878t = 1;
            Object objW = uVar.W(false, aVar, this);
            return objW == objE ? objE : objW;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super R> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Ly4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
    public static final class e<R> extends gu.m implements Function2<g0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11891t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11892u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11893v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11894w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f11895x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f11896y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f11897z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Ly4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<f0<R>, eu.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11898t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f11899u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f11900v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eu.b bVar, Function1 function1) {
                super(2, bVar);
                this.f11900v = function1;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(bVar, this.f11900v);
                aVar.f11899u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f11898t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                Function1 function1 = this.f11900v;
                this.f11898t = 1;
                p001kotlin.jvm.internal.l.c(6);
                Object objInvoke = function1.invoke(this);
                p001kotlin.jvm.internal.l.c(7);
                return objInvoke == objE ? objE : objInvoke;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, eu.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, u uVar, eu.b bVar, Function1 function1) {
            super(2, bVar);
            this.f11894w = z10;
            this.f11895x = z11;
            this.f11896y = uVar;
            this.f11897z = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = new e(this.f11894w, this.f11895x, this.f11896y, bVar, this.f11897z);
            eVar.f11893v = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
          0x00a8: PHI (r1v12 y4.g0) = (r1v9 y4.g0), (r1v19 y4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.A(r8) == r0) goto L51;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g0.a aVar;
            g0 g0Var;
            g0 g0Var2;
            g0.a aVar2;
            Object objB;
            Object obj2;
            Object objE = fu.c.e();
            int i10 = this.f11892u;
            if (i10 == 0) {
                zt.o.b(obj);
                g0 g0Var3 = (g0) this.f11893v;
                if (this.f11894w) {
                    boolean z10 = this.f11895x;
                    aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                    if (z10) {
                        g0Var = g0Var3;
                        a aVar3 = new a(null, this.f11897z);
                        this.f11893v = g0Var;
                        this.f11891t = null;
                        this.f11892u = 3;
                        obj = g0Var.c(aVar, aVar3, this);
                        if (obj != objE) {
                            if (!this.f11895x) {
                                return obj;
                            }
                            this.f11893v = obj;
                            this.f11892u = 4;
                            objB = g0Var.b(this);
                            if (objB != objE) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f11896y.t().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        this.f11893v = g0Var3;
                        this.f11891t = aVar;
                        this.f11892u = 1;
                        Object objB2 = g0Var3.b(this);
                        if (objB2 != objE) {
                            g0.a aVar4 = aVar;
                            g0Var2 = g0Var3;
                            obj = objB2;
                            aVar2 = aVar4;
                        }
                    }
                } else {
                    Function1 function1 = this.f11897z;
                    this.f11892u = 5;
                    p001kotlin.jvm.internal.l.c(6);
                    Object objInvoke = function1.invoke(this);
                    p001kotlin.jvm.internal.l.c(7);
                    if (objInvoke != objE) {
                        return objInvoke;
                    }
                }
                return objE;
            }
            if (i10 == 1) {
                aVar2 = (g0.a) this.f11891t;
                g0Var2 = (g0) this.f11893v;
                zt.o.b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (g0.a) this.f11891t;
                    g0Var2 = (g0) this.f11893v;
                    zt.o.b(obj);
                    g0 g0Var4 = g0Var2;
                    aVar = aVar2;
                    g0Var = g0Var4;
                    a aVar5 = new a(null, this.f11897z);
                    this.f11893v = g0Var;
                    this.f11891t = null;
                    this.f11892u = 3;
                    obj = g0Var.c(aVar, aVar5, this);
                    if (obj != objE) {
                        if (!this.f11895x) {
                            return obj;
                        }
                        this.f11893v = obj;
                        this.f11892u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                        }
                    }
                    return objE;
                }
                if (i10 == 3) {
                    g0Var = (g0) this.f11893v;
                    zt.o.b(obj);
                    if (!this.f11895x) {
                        return obj;
                    }
                    this.f11893v = obj;
                    this.f11892u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                    }
                    return objE;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                obj2 = this.f11893v;
                zt.o.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f11896y.t().u();
            }
            return obj2;
            if (!((Boolean) obj).booleanValue()) {
                androidx.room.c cVarT = this.f11896y.t();
                this.f11893v = g0Var2;
                this.f11891t = aVar2;
                this.f11892u = 2;
            }
            g0 g0Var5 = g0Var2;
            aVar = aVar2;
            g0Var = g0Var5;
            a aVar6 = new a(null, this.f11897z);
            this.f11893v = g0Var;
            this.f11891t = null;
            this.f11892u = 3;
            obj = g0Var.c(aVar, aVar6, this);
            if (obj != objE) {
                if (!this.f11895x) {
                    return obj;
                }
                this.f11893v = obj;
                this.f11892u = 4;
                objB = g0Var.b(this);
                if (objB != objE) {
                    obj2 = obj;
                    obj = objB;
                    if (!((Boolean) obj).booleanValue()) {
                        this.f11896y.t().u();
                    }
                    return obj2;
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, eu.b<? super R> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class f<R> extends gu.m implements Function2<p0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11901t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f11902u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f11903v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11904w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function1 f11905x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(eu.b bVar, u uVar, boolean z10, boolean z11, Function1 function1) {
            super(2, bVar);
            this.f11902u = uVar;
            this.f11903v = z10;
            this.f11904w = z11;
            this.f11905x = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(bVar, this.f11902u, this.f11903v, this.f11904w, this.f11905x);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super R> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11901t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            u uVar = this.f11902u;
            boolean z10 = this.f11903v;
            h hVar = new h(this.f11904w, z10, uVar, null, this.f11905x);
            this.f11901t = 1;
            Object objW = uVar.W(z10, hVar, this);
            return objW == objE ? objE : objW;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    public static final class g<R> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11906t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11907u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f11908v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f11909w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f11910x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f11911y;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11910x = obj;
            this.f11911y |= Integer.MIN_VALUE;
            return d5.a.e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Ly4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    public static final class h<R> extends gu.m implements Function2<g0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11912t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11913u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11914v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11915w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f11916x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f11917y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f11918z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Ly4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<f0<R>, eu.b<? super R>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11919t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f11920u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f11921v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eu.b bVar, Function1 function1) {
                super(2, bVar);
                this.f11921v = function1;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(bVar, this.f11921v);
                aVar.f11920u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f11919t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                f0 f0Var = (f0) this.f11920u;
                Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f11921v.invoke(((q) f0Var).getDelegate());
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, eu.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, boolean z11, u uVar, eu.b bVar, Function1 function1) {
            super(2, bVar);
            this.f11915w = z10;
            this.f11916x = z11;
            this.f11917y = uVar;
            this.f11918z = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            h hVar = new h(this.f11915w, this.f11916x, this.f11917y, bVar, this.f11918z);
            hVar.f11914v = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 y4.g0) = (r1v8 y4.g0), (r1v18 y4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            g0.a aVar;
            g0 g0Var;
            g0 g0Var2;
            g0.a aVar2;
            g0 g0Var3;
            Object objB;
            Object obj2;
            Object objE = fu.c.e();
            int i10 = this.f11913u;
            if (i10 == 0) {
                zt.o.b(obj);
                g0 g0Var4 = (g0) this.f11914v;
                if (!this.f11915w) {
                    Intrinsics.d(g0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f11918z.invoke(((q) g0Var4).getDelegate());
                }
                boolean z10 = this.f11916x;
                aVar = z10 ? g0.a.DEFERRED : g0.a.IMMEDIATE;
                if (z10) {
                    g0Var = g0Var4;
                    a aVar3 = new a(null, this.f11918z);
                    this.f11914v = g0Var;
                    this.f11912t = null;
                    this.f11913u = 3;
                    obj = g0Var.c(aVar, aVar3, this);
                    if (obj != objE) {
                        if (this.f11916x) {
                            return obj;
                        }
                        this.f11914v = obj;
                        this.f11913u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f11917y.t().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f11914v = g0Var4;
                    this.f11912t = aVar;
                    this.f11913u = 1;
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
                aVar2 = (g0.a) this.f11912t;
                g0Var2 = (g0) this.f11914v;
                zt.o.b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (g0.a) this.f11912t;
                    g0Var3 = (g0) this.f11914v;
                    zt.o.b(obj);
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar4 = new a(null, this.f11918z);
                    this.f11914v = g0Var;
                    this.f11912t = null;
                    this.f11913u = 3;
                    obj = g0Var.c(aVar, aVar4, this);
                    if (obj != objE) {
                        if (this.f11916x) {
                            return obj;
                        }
                        this.f11914v = obj;
                        this.f11913u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                        }
                    }
                    return objE;
                }
                if (i10 == 3) {
                    g0Var = (g0) this.f11914v;
                    zt.o.b(obj);
                    if (this.f11916x) {
                        return obj;
                    }
                    this.f11914v = obj;
                    this.f11913u = 4;
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
                obj2 = this.f11914v;
                zt.o.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f11917y.t().u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                g0Var = g0Var2;
                a aVar5 = new a(null, this.f11918z);
                this.f11914v = g0Var;
                this.f11912t = null;
                this.f11913u = 3;
                obj = g0Var.c(aVar, aVar5, this);
                if (obj != objE) {
                    if (this.f11916x) {
                        return obj;
                    }
                    this.f11914v = obj;
                    this.f11913u = 4;
                    objB = g0Var.b(this);
                    if (objB != objE) {
                        obj2 = obj;
                        obj = objB;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f11917y.t().u();
                        }
                        return obj2;
                    }
                }
            } else {
                androidx.room.c cVarT = this.f11917y.t();
                this.f11914v = g0Var2;
                this.f11912t = aVar2;
                this.f11913u = 2;
                if (cVarT.A(this) != objE) {
                    g0Var3 = g0Var2;
                    aVar = aVar2;
                    g0Var = g0Var3;
                    a aVar6 = new a(null, this.f11918z);
                    this.f11914v = g0Var;
                    this.f11912t = null;
                    this.f11913u = 3;
                    obj = g0Var.c(aVar, aVar6, this);
                    if (obj != objE) {
                        if (this.f11916x) {
                            return obj;
                        }
                        this.f11914v = obj;
                        this.f11913u = 4;
                        objB = g0Var.b(this);
                        if (objB != objE) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f11917y.t().u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, eu.b<? super R> bVar) {
            return ((h) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Nullable
    public static final Object a(@NotNull u uVar, boolean z10, @NotNull eu.b<? super CoroutineContext> bVar) {
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
            transactionDispatcher = p001kotlin.coroutines.e.f21548a;
        }
        return coroutineContextV.plus(transactionDispatcher);
    }

    public static final <R> R b(@NotNull u db2, boolean z10, boolean z11, @NotNull Function1<? super g5.b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.g();
        db2.h();
        CoroutineContext coroutineContext = db2.B().get();
        if (coroutineContext == null) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        return (R) r.a(new a(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public static final <R> Object c(@NotNull u uVar, @NotNull Function1<? super eu.b<? super R>, ? extends Object> function1, @NotNull eu.b<? super R> bVar) {
        C0214c c0214c;
        u uVar2;
        Function1<? super eu.b<? super R>, ? extends Object> function2;
        if (bVar instanceof C0214c) {
            c0214c = (C0214c) bVar;
            int i10 = c0214c.f11877w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0214c.f11877w = i10 - Integer.MIN_VALUE;
            } else {
                c0214c = new C0214c(bVar);
            }
        } else {
            c0214c = new C0214c(bVar);
        }
        C0214c c0214c2 = c0214c;
        Object objB = c0214c2.f11876v;
        Object objE = fu.c.e();
        int i11 = c0214c2.f11877w;
        if (i11 == 0) {
            zt.o.b(objB);
            if (uVar.F()) {
                d dVar = new d(uVar, function1, null);
                c0214c2.f11877w = 1;
                Object objE2 = v.e(uVar, dVar, c0214c2);
                if (objE2 != objE) {
                    return objE2;
                }
            } else if (uVar.F() && uVar.M() && uVar.G()) {
                e eVar = new e(true, false, uVar, null, function1);
                c0214c2.f11877w = 2;
                Object objW = uVar.W(false, eVar, c0214c2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                c0214c2.f11874t = uVar;
                c0214c2.f11875u = function1;
                c0214c2.f11877w = 3;
                objB = d5.a.b(uVar, true, c0214c2);
                if (objB != objE) {
                    uVar2 = uVar;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            zt.o.b(objB);
            return objB;
        }
        if (i11 == 2) {
            zt.o.b(objB);
            return objB;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objB);
            return objB;
        }
        function2 = (Function1) c0214c2.f11875u;
        uVar2 = (u) c0214c2.f11874t;
        zt.o.b(objB);
        b bVar2 = new b(null, uVar2, function2);
        c0214c2.f11874t = null;
        c0214c2.f11875u = null;
        c0214c2.f11877w = 4;
        Object objG = av.i.g((CoroutineContext) objB, bVar2, c0214c2);
        return objG == objE ? objE : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final <R> Object d(@NotNull u uVar, boolean z10, boolean z11, @NotNull Function1<? super g5.b, ? extends R> function1, @NotNull eu.b<? super R> bVar) {
        g gVar;
        u uVar2;
        boolean z12;
        Function1<? super g5.b, ? extends R> function2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f11911y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f11911y = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f11910x;
        Object objE = fu.c.e();
        int i11 = gVar2.f11911y;
        if (i11 == 0) {
            zt.o.b(obj);
            if (uVar.F() && uVar.M() && uVar.G()) {
                h hVar = new h(z11, z10, uVar, null, function1);
                gVar2.f11911y = 1;
                Object objW = uVar.W(z10, hVar, gVar2);
                if (objW != objE) {
                    return objW;
                }
            } else {
                gVar2.f11906t = uVar;
                gVar2.f11907u = function1;
                gVar2.f11908v = z10;
                gVar2.f11909w = z11;
                gVar2.f11911y = 2;
                Object objB = d5.a.b(uVar, z11, gVar2);
                if (objB != objE) {
                    uVar2 = uVar;
                    obj = objB;
                    z12 = z11;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            zt.o.b(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return obj;
        }
        boolean z13 = gVar2.f11909w;
        z10 = gVar2.f11908v;
        Function1<? super g5.b, ? extends R> function3 = (Function1) gVar2.f11907u;
        u uVar3 = (u) gVar2.f11906t;
        zt.o.b(obj);
        z12 = z13;
        function2 = function3;
        uVar2 = uVar3;
        f fVar = new f(null, uVar2, z10, z12, function2);
        gVar2.f11906t = null;
        gVar2.f11907u = null;
        gVar2.f11911y = 3;
        Object objG = av.i.g((CoroutineContext) obj, fVar, gVar2);
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
            lu.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(channel, th2);
                throw th3;
            }
        }
    }
}
