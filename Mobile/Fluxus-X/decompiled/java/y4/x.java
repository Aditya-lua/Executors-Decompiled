package y4;

import av.b3;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"R", "Ly4/u;", "Lkotlin/Function1;", "Leu/b;", BuildConfig.FLAVOR, "block", "e", "(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lav/p0;", "transactionBlock", "d", "(Ly4/u;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<R> f37435a;
        public final /* synthetic */ u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, eu.b<? super R>, Object> f37436c;

        /* JADX INFO: renamed from: y4.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
        public static final class C0765a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37437t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f37438u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u f37439v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ av.n<R> f37440w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, eu.b<? super R>, Object> f37441x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0765a(u uVar, av.n<? super R> nVar, Function2<? super p0, ? super eu.b<? super R>, ? extends Object> function2, eu.b<? super C0765a> bVar) {
                super(2, bVar);
                this.f37439v = uVar;
                this.f37440w = nVar;
                this.f37441x = function2;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                C0765a c0765a = new C0765a(this.f37439v, this.f37440w, this.f37441x, bVar);
                c0765a.f37438u = obj;
                return c0765a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0765a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                eu.b bVar;
                Object objE = fu.c.e();
                int i10 = this.f37437t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    CoroutineContext.Element element = ((p0) this.f37438u).getCoroutineContext().get(p001kotlin.coroutines.d.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextC = x.c(this.f37439v, (p001kotlin.coroutines.d) element);
                    eu.b bVar2 = this.f37440w;
                    zt.n.Companion companion = zt.n.INSTANCE;
                    Function2<p0, eu.b<? super R>, Object> function2 = this.f37441x;
                    this.f37438u = bVar2;
                    this.f37437t = 1;
                    obj = av.i.g(coroutineContextC, function2, this);
                    if (obj == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (eu.b) this.f37438u;
                    zt.o.b(obj);
                }
                bVar.resumeWith(zt.n.b(obj));
                return Unit.f21506a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(av.n<? super R> nVar, u uVar, Function2<? super p0, ? super eu.b<? super R>, ? extends Object> function2) {
            this.f37435a = nVar;
            this.b = uVar;
            this.f37436c = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                av.i.e(this.f37435a.getContext().minusKey(p001kotlin.coroutines.d.INSTANCE), new C0765a(this.b, this.f37435a, this.f37436c, null));
            } catch (Throwable th2) {
                this.f37435a.t(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
    public static final class b<R> extends gu.m implements Function2<p0, eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37442t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37443u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super R>, Object> f37444v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super eu.b<? super R>, ? extends Object> function1, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f37444v = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f37444v, bVar);
            bVar2.f37443u = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f37442t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            if (((p0) this.f37443u).getCoroutineContext().get(c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            Function1<eu.b<? super R>, Object> function1 = this.f37444v;
            this.f37442t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }
    }

    @Nullable
    public static final <R> Object b(@NotNull u uVar, @NotNull Function1<? super eu.b<? super R>, ? extends Object> function1, @NotNull eu.b<? super R> bVar) {
        if ((!uVar.F() || !uVar.M() || !uVar.G()) && bVar.getContext().get(y.f37445a) != null) {
            return v.e(uVar, function1, bVar);
        }
        return function1.invoke(bVar);
    }

    public static final CoroutineContext c(u uVar, p001kotlin.coroutines.d dVar) {
        CoroutineContext coroutineContextPlus = dVar.plus(new c0(dVar));
        return coroutineContextPlus.plus(b3.a(uVar.B(), coroutineContextPlus));
    }

    public static final <R> Object d(u uVar, Function2<? super p0, ? super eu.b<? super R>, ? extends Object> function2, eu.b<? super R> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        try {
            uVar.D().execute(new a(pVar, uVar, function2));
        } catch (RejectedExecutionException e10) {
            pVar.t(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, @NotNull Function1<? super eu.b<? super R>, ? extends Object> function1, @NotNull eu.b<? super R> bVar) {
        b bVar2 = new b(function1, null);
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        p001kotlin.coroutines.d transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? av.i.g(transactionDispatcher, bVar2, bVar) : d(uVar, bVar2, bVar);
    }
}
