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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0082@¢\u0006\u0004\b\u001c\u0010\u0018RQ\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00060#j\u0002`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006+"}, d2 = {"Lz4/l;", "Lx4/g0;", "Lz4/q;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Llt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lf5/b;", "delegate", "<init>", "(Lkotlin/jvm/functions/Function2;Lf5/b;)V", "R", "", "sql", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lx4/g0$a;", Payload.TYPE, "Lx4/f0;", "d", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "", "b", "(Llt/b;)Ljava/lang/Object;", "g", "Lkotlin/jvm/functions/Function2;", "getTransactionWrapper", "()Lkotlin/jvm/functions/Function2;", "Lf5/b;", "f", "()Lf5/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "nestedTransactionCount", "Lx4/g0$a;", "currentTransactionType", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super lt.b<Object>, ? extends Object>, lt.b<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f5.b delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AtomicInteger nestedTransactionCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz4/l$a;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lf5/b;", "c", "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T> implements f0<T>, q {
        public a() {
        }

        @Override // x4.m
        @Nullable
        public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull lt.b<? super R> bVar) {
            return l.this.a(str, function1, bVar);
        }

        @Override // z4.q
        @NotNull
        /* JADX INFO: renamed from: c */
        public f5.b getDelegate() {
            return l.this.getDelegate();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37889a;

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
            f37889a = iArr;
        }
    }

    @nt.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = "transaction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<R> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37890t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37891u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37893w;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37891u = obj;
            this.f37893w |= Integer.MIN_VALUE;
            return l.this.g(null, null, this);
        }
    }

    @nt.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {89, 91}, m = "usePrepared")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<R> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37894t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37895u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37896v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37898x;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37896v = obj;
            this.f37898x |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    @nt.f(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends nt.m implements Function1<lt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37899t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37901v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.d, R> f37902w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, Function1<? super f5.d, ? extends R> function1, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f37901v = str;
            this.f37902w = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return l.this.new e(this.f37901v, this.f37902w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Exception {
            mt.c.e();
            if (this.f37899t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            f5.d dVarR3 = l.this.f().r3(this.f37901v);
            try {
                Object objInvoke = this.f37902w.invoke(dVarR3);
                vt.a.a(dVarR3, null);
                return objInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    vt.a.a(dVarR3, th2);
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<Object> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {103}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends nt.m implements Function1<lt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37903t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0.a f37905v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<f0<R>, lt.b<? super R>, Object> f37906w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(g0.a aVar, Function2<? super f0<R>, ? super lt.b<? super R>, ? extends Object> function2, lt.b<? super f> bVar) {
            super(1, bVar);
            this.f37905v = aVar;
            this.f37906w = function2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return l.this.new f(this.f37905v, this.f37906w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = mt.c.e();
            int i10 = this.f37903t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            l lVar = l.this;
            g0.a aVar = this.f37905v;
            Function2<f0<R>, lt.b<? super R>, Object> function2 = this.f37906w;
            this.f37903t = 1;
            Object objG = lVar.g(aVar, function2, this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<Object> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Nullable Function2<? super Function1<? super lt.b<Object>, ? extends Object>, ? super lt.b<Object>, ? extends Object> function2, @NotNull f5.b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.transactionWrapper = function2;
        this.delegate = delegate;
        this.nestedTransactionCount = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x4.m
    @Nullable
    public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull lt.b<? super R> bVar) throws Exception {
        d dVar;
        Function2<Function1<? super lt.b<Object>, ? extends Object>, lt.b<Object>, Object> function2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f37898x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f37898x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objB = dVar.f37896v;
        Object objE = mt.c.e();
        int i11 = dVar.f37898x;
        if (i11 == 0) {
            gt.o.b(objB);
            dVar.f37894t = str;
            dVar.f37895u = function1;
            dVar.f37898x = 1;
            objB = b(dVar);
            if (objB != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objB);
            return objB;
        }
        function1 = (Function1) dVar.f37895u;
        str = (String) dVar.f37894t;
        gt.o.b(objB);
        if (((Boolean) objB).booleanValue() && (function2 = this.transactionWrapper) != null) {
            e eVar = new e(str, function1, null);
            dVar.f37894t = null;
            dVar.f37895u = null;
            dVar.f37898x = 2;
            Object objInvoke = function2.invoke(eVar, dVar);
            return objInvoke == objE ? objE : objInvoke;
        }
        f5.d dVarR3 = this.delegate.r3(str);
        try {
            R rInvoke = function1.invoke(dVarR3);
            vt.a.a(dVarR3, null);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    @Override // x4.g0
    @Nullable
    public Object b(@NotNull lt.b<? super Boolean> bVar) {
        return nt.b.a(this.currentTransactionType != null || this.delegate.D());
    }

    @Override // z4.q
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public f5.b getDelegate() {
        return this.delegate;
    }

    @Override // x4.g0
    @Nullable
    public <R> Object d(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super lt.b<? super R>, ? extends Object> function2, @NotNull lt.b<? super R> bVar) {
        Function2<Function1<? super lt.b<Object>, ? extends Object>, lt.b<Object>, Object> function3 = this.transactionWrapper;
        if (function3 == null) {
            return g(aVar, function2, bVar);
        }
        Object objInvoke = function3.invoke(new f(aVar, function2, null), bVar);
        mt.c.e();
        return objInvoke;
    }

    @NotNull
    public final f5.b f() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[Catch: SQLException -> 0x00c9, TryCatch #0 {SQLException -> 0x00c9, blocks: (B:56:0x00be, B:58:0x00c6, B:61:0x00cb), top: B:67:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <R> Object g(g0.a aVar, Function2<? super f0<R>, ? super lt.b<? super R>, ? extends Object> function2, lt.b<? super R> bVar) throws Throwable {
        c cVar;
        z4.c.a aVar2;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f37893w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f37893w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objInvoke = cVar.f37891u;
        Object objE = mt.c.e();
        int i11 = cVar.f37893w;
        int i12 = 1;
        try {
            if (i11 == 0) {
                gt.o.b(objInvoke);
                int i13 = b.f37889a[aVar.ordinal()];
                if (i13 == 1) {
                    f5.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i13 == 2) {
                    f5.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i13 != 3) {
                        throw new gt.l();
                    }
                    f5.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.nestedTransactionCount.incrementAndGet() > 0) {
                    this.currentTransactionType = aVar;
                }
                a aVar3 = new a();
                cVar.f37890t = 1;
                cVar.f37893w = 1;
                objInvoke = function2.invoke(aVar3, cVar);
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = cVar.f37890t;
                gt.o.b(objInvoke);
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
                gt.a.a(aVar2, e10);
                throw th;
            }
        }
    }
}
