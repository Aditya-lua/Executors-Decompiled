package x4;

import iu.b3;
import iu.p0;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"R", "Lx4/u;", "Lkotlin/Function1;", "Llt/b;", "", "block", "e", "(Lx4/u;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Liu/p0;", "transactionBlock", "d", "(Lx4/u;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lx4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<R> f35389a;
        public final /* synthetic */ u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, lt.b<? super R>, Object> f35390c;

        /* JADX INFO: renamed from: x4.x$a$a, reason: collision with other inner class name */
        @nt.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C0646a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35391t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f35392u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u f35393v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ iu.n<R> f35394w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, lt.b<? super R>, Object> f35395x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0646a(u uVar, iu.n<? super R> nVar, Function2<? super p0, ? super lt.b<? super R>, ? extends Object> function2, lt.b<? super C0646a> bVar) {
                super(2, bVar);
                this.f35393v = uVar;
                this.f35394w = nVar;
                this.f35395x = function2;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                C0646a c0646a = new C0646a(this.f35393v, this.f35394w, this.f35395x, bVar);
                c0646a.f35392u = obj;
                return c0646a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((C0646a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                lt.b bVar;
                Object objE = mt.c.e();
                int i10 = this.f35391t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    CoroutineContext.Element element = ((p0) this.f35392u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextC = x.c(this.f35393v, (kotlin.coroutines.d) element);
                    lt.b bVar2 = this.f35394w;
                    gt.n.Companion companion = gt.n.INSTANCE;
                    Function2<p0, lt.b<? super R>, Object> function2 = this.f35395x;
                    this.f35392u = bVar2;
                    this.f35391t = 1;
                    obj = iu.i.g(coroutineContextC, function2, this);
                    if (obj == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (lt.b) this.f35392u;
                    gt.o.b(obj);
                }
                bVar.resumeWith(gt.n.b(obj));
                return Unit.f22938a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(iu.n<? super R> nVar, u uVar, Function2<? super p0, ? super lt.b<? super R>, ? extends Object> function2) {
            this.f35389a = nVar;
            this.b = uVar;
            this.f35390c = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                iu.i.e(this.f35389a.getContext().minusKey(kotlin.coroutines.d.INSTANCE), new C0646a(this.b, this.f35389a, this.f35390c, null));
            } catch (Throwable th2) {
                this.f35389a.t(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b<R> extends nt.m implements Function2<p0, lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35396t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35397u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super R>, Object> f35398v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super lt.b<? super R>, ? extends Object> function1, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f35398v = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = new b(this.f35398v, bVar);
            bVar2.f35397u = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f35396t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            if (((p0) this.f35397u).getCoroutineContext().get(c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            Function1<lt.b<? super R>, Object> function1 = this.f35398v;
            this.f35396t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }
    }

    @Nullable
    public static final <R> Object b(@NotNull u uVar, @NotNull Function1<? super lt.b<? super R>, ? extends Object> function1, @NotNull lt.b<? super R> bVar) {
        if ((!uVar.F() || !uVar.M() || !uVar.G()) && bVar.getContext().get(y.f35399a) != null) {
            return v.e(uVar, function1, bVar);
        }
        return function1.invoke(bVar);
    }

    public static final CoroutineContext c(u uVar, kotlin.coroutines.d dVar) {
        CoroutineContext coroutineContextPlus = dVar.plus(new c0(dVar));
        return coroutineContextPlus.plus(b3.a(uVar.B(), coroutineContextPlus));
    }

    public static final <R> Object d(u uVar, Function2<? super p0, ? super lt.b<? super R>, ? extends Object> function2, lt.b<? super R> bVar) {
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        try {
            uVar.D().execute(new a(pVar, uVar, function2));
        } catch (RejectedExecutionException e10) {
            pVar.t(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, @NotNull Function1<? super lt.b<? super R>, ? extends Object> function1, @NotNull lt.b<? super R> bVar) {
        b bVar2 = new b(function1, null);
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        kotlin.coroutines.d transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? iu.i.g(transactionDispatcher, bVar2, bVar) : d(uVar, bVar2, bVar);
    }
}
