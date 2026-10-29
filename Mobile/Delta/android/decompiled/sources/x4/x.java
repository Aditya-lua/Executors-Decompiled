package x4;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.b3;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"R", "Lx4/u;", "Lkotlin/Function1;", "Lnt/b;", "", "block", "e", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "transactionBlock", "d", "(Lx4/u;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lx4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<R> f34891a;
        public final /* synthetic */ u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, nt.b<? super R>, Object> f34892c;

        /* JADX INFO: renamed from: x4.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
        public static final class C0639a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f34893t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f34894u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u f34895v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ ku.n<R> f34896w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, nt.b<? super R>, Object> f34897x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0639a(u uVar, ku.n<? super R> nVar, Function2<? super p0, ? super nt.b<? super R>, ? extends Object> function2, nt.b<? super C0639a> bVar) {
                super(2, bVar);
                this.f34895v = uVar;
                this.f34896w = nVar;
                this.f34897x = function2;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                C0639a c0639a = new C0639a(this.f34895v, this.f34896w, this.f34897x, bVar);
                c0639a.f34894u = obj;
                return c0639a;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                nt.b bVar;
                Object objE = ot.c.e();
                int i10 = this.f34893t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    CoroutineContext.Element element = ((p0) this.f34894u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextC = x.c(this.f34895v, (kotlin.coroutines.d) element);
                    nt.b bVar2 = this.f34896w;
                    jt.n.Companion companion = jt.n.INSTANCE;
                    Function2<p0, nt.b<? super R>, Object> function2 = this.f34897x;
                    this.f34894u = bVar2;
                    this.f34893t = 1;
                    obj = ku.i.g(coroutineContextC, function2, this);
                    if (obj == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (nt.b) this.f34894u;
                    jt.o.b(obj);
                }
                bVar.resumeWith(jt.n.b(obj));
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0639a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(ku.n<? super R> nVar, u uVar, Function2<? super p0, ? super nt.b<? super R>, ? extends Object> function2) {
            this.f34891a = nVar;
            this.b = uVar;
            this.f34892c = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ku.i.e(this.f34891a.getContext().minusKey(kotlin.coroutines.d.INSTANCE), new C0639a(this.b, this.f34891a, this.f34892c, null));
            } catch (Throwable th2) {
                this.f34891a.p(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
    public static final class b<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34898t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f34899u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<nt.b<? super R>, Object> f34900v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super nt.b<? super R>, ? extends Object> function1, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f34900v = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = new b(this.f34900v, bVar);
            bVar2.f34899u = obj;
            return bVar2;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f34898t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            if (((p0) this.f34899u).getCoroutineContext().get(c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            Function1<nt.b<? super R>, Object> function1 = this.f34900v;
            this.f34898t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final <R> Object b(@NotNull u uVar, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1, @NotNull nt.b<? super R> bVar) {
        if ((!uVar.F() || !uVar.M() || !uVar.G()) && bVar.getContext().get(y.f34901a) != null) {
            return v.e(uVar, function1, bVar);
        }
        return function1.invoke(bVar);
    }

    public static final CoroutineContext c(u uVar, kotlin.coroutines.d dVar) {
        CoroutineContext coroutineContextPlus = dVar.plus(new c0(dVar));
        return coroutineContextPlus.plus(b3.a(uVar.B(), coroutineContextPlus));
    }

    public static final <R> Object d(u uVar, Function2<? super p0, ? super nt.b<? super R>, ? extends Object> function2, nt.b<? super R> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        try {
            uVar.D().execute(new a(pVar, uVar, function2));
        } catch (RejectedExecutionException e10) {
            pVar.p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1, @NotNull nt.b<? super R> bVar) {
        b bVar2 = new b(function1, null);
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        kotlin.coroutines.d transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? ku.i.g(transactionDispatcher, bVar2, bVar) : d(uVar, bVar2, bVar);
    }
}
