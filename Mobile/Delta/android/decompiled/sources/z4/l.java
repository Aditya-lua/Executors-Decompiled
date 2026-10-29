package z4;

import android.database.SQLException;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.f0;
import x4.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0082@¢\u0006\u0004\b\u001c\u0010\u0018RQ\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00060#j\u0002`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006+"}, d2 = {"Lz4/l;", "Lx4/g0;", "Lz4/q;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lf5/b;", "delegate", "<init>", "(Lkotlin/jvm/functions/Function2;Lf5/b;)V", "R", "", "sql", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lx4/g0$a;", Payload.TYPE, "Lx4/f0;", "c", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "g", "Lkotlin/jvm/functions/Function2;", "getTransactionWrapper", "()Lkotlin/jvm/functions/Function2;", "Lf5/b;", "f", "()Lf5/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nestedTransactionCount", "d", "Lx4/g0$a;", "currentTransactionType", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super nt.b<Object>, ? extends Object>, nt.b<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f5.b delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AtomicInteger nestedTransactionCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz4/l$a;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lf5/b;", "d", "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T> implements f0<T>, q {
        public a() {
        }

        @Override // x4.m
        @Nullable
        public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull nt.b<? super R> bVar) {
            return l.this.a(str, function1, bVar);
        }

        @Override // z4.q
        @NotNull
        /* JADX INFO: renamed from: d */
        public f5.b getDelegate() {
            return l.this.getDelegate();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37194a;

        static {
            int[] iArr = new int[g0.a.values().length];
            try {
                iArr[g0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37194a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = "transaction")
    public static final class c<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37195t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37196u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37198w;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37196u = obj;
            this.f37198w |= Integer.MIN_VALUE;
            return l.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {89, 91}, m = "usePrepared")
    public static final class d<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37199t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37200u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37201v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37203x;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37201v = obj;
            this.f37203x |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function1<nt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37204t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37206v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.d, R> f37207w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, Function1<? super f5.d, ? extends R> function1, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f37206v = str;
            this.f37207w = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return l.this.new e(this.f37206v, this.f37207w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Exception {
            ot.c.e();
            if (this.f37204t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            f5.d dVarR3 = l.this.f().r3(this.f37206v);
            try {
                Object objInvoke = this.f37207w.invoke(dVarR3);
                xt.a.a(dVarR3, null);
                return objInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xt.a.a(dVarR3, th2);
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<Object> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {103}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function1<nt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37208t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0.a f37210v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<f0<R>, nt.b<? super R>, Object> f37211w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(g0.a aVar, Function2<? super f0<R>, ? super nt.b<? super R>, ? extends Object> function2, nt.b<? super f> bVar) {
            super(1, bVar);
            this.f37210v = aVar;
            this.f37211w = function2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return l.this.new f(this.f37210v, this.f37211w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = ot.c.e();
            int i10 = this.f37208t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            l lVar = l.this;
            g0.a aVar = this.f37210v;
            Function2<f0<R>, nt.b<? super R>, Object> function2 = this.f37211w;
            this.f37208t = 1;
            Object objG = lVar.g(aVar, function2, this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<Object> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Nullable Function2<? super Function1<? super nt.b<Object>, ? extends Object>, ? super nt.b<Object>, ? extends Object> function2, @NotNull f5.b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.transactionWrapper = function2;
        this.delegate = delegate;
        this.nestedTransactionCount = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x4.m
    @Nullable
    public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull nt.b<? super R> bVar) throws Exception {
        d dVar;
        Function2<Function1<? super nt.b<Object>, ? extends Object>, nt.b<Object>, Object> function2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f37203x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f37203x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objB = dVar.f37201v;
        Object objE = ot.c.e();
        int i11 = dVar.f37203x;
        if (i11 == 0) {
            jt.o.b(objB);
            dVar.f37199t = str;
            dVar.f37200u = function1;
            dVar.f37203x = 1;
            objB = b(dVar);
            if (objB != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objB);
            return objB;
        }
        function1 = (Function1) dVar.f37200u;
        str = (String) dVar.f37199t;
        jt.o.b(objB);
        if (((Boolean) objB).booleanValue() && (function2 = this.transactionWrapper) != null) {
            e eVar = new e(str, function1, null);
            dVar.f37199t = null;
            dVar.f37200u = null;
            dVar.f37203x = 2;
            Object objInvoke = function2.invoke(eVar, dVar);
            return objInvoke == objE ? objE : objInvoke;
        }
        f5.d dVarR3 = this.delegate.r3(str);
        try {
            R rInvoke = function1.invoke(dVarR3);
            xt.a.a(dVarR3, null);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    @Override // x4.g0
    @Nullable
    public Object b(@NotNull nt.b<? super Boolean> bVar) {
        return pt.b.a(this.currentTransactionType != null || this.delegate.D());
    }

    @Override // x4.g0
    @Nullable
    public <R> Object c(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        Function2<Function1<? super nt.b<Object>, ? extends Object>, nt.b<Object>, Object> function3 = this.transactionWrapper;
        if (function3 == null) {
            return g(aVar, function2, bVar);
        }
        Object objInvoke = function3.invoke(new f(aVar, function2, null), bVar);
        ot.c.e();
        return objInvoke;
    }

    @Override // z4.q
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public f5.b getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final f5.b f() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[Catch: SQLException -> 0x00c9, TryCatch #0 {SQLException -> 0x00c9, blocks: (B:56:0x00be, B:58:0x00c6, B:61:0x00cb), top: B:67:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <R> Object g(g0.a aVar, Function2<? super f0<R>, ? super nt.b<? super R>, ? extends Object> function2, nt.b<? super R> bVar) throws Throwable {
        c cVar;
        z4.c.a aVar2;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f37198w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f37198w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objInvoke = cVar.f37196u;
        Object objE = ot.c.e();
        int i11 = cVar.f37198w;
        int i12 = 1;
        try {
            if (i11 == 0) {
                jt.o.b(objInvoke);
                int i13 = b.f37194a[aVar.ordinal()];
                if (i13 == 1) {
                    f5.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i13 == 2) {
                    f5.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i13 != 3) {
                        throw new jt.l();
                    }
                    f5.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.nestedTransactionCount.incrementAndGet() > 0) {
                    this.currentTransactionType = aVar;
                }
                a aVar3 = new a();
                cVar.f37195t = 1;
                cVar.f37198w = 1;
                objInvoke = function2.invoke(aVar3, cVar);
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = cVar.f37195t;
                jt.o.b(objInvoke);
            }
            if (this.nestedTransactionCount.decrementAndGet() == 0) {
                this.currentTransactionType = null;
            }
            if (i12 != 0) {
                f5.a.a(this.delegate, "END TRANSACTION");
                return objInvoke;
            }
            f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof z4.c.a) {
                    Object objA = th2.a();
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
                    return objA;
                }
                try {
                    throw th2;
                } catch (Throwable th3) {
                    aVar2 = th2;
                    th = th3;
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                aVar2 = null;
            }
            try {
                if (this.nestedTransactionCount.decrementAndGet() == 0) {
                    this.currentTransactionType = null;
                }
                f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
                throw th;
            } catch (SQLException e10) {
                if (aVar2 == null) {
                    throw e10;
                }
                jt.a.a(aVar2, e10);
                throw th;
            }
        }
    }
}
