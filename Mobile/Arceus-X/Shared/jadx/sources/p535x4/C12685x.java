package p535x4;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7841b3;
import p256ku.C7872i;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x4.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m31665d2 = {"R", "Lx4/u;", "Lkotlin/Function1;", "Lnt/b;", "", "block", "e", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lku/p0;", "transactionBlock", "d", "(Lx4/u;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lx4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", "b", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class C12685x {

    /* JADX INFO: renamed from: x4.x$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<R> f45194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC12682u f45195b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> f45196c;

        /* JADX INFO: renamed from: x4.x$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", m39664f = "RoomDatabase.android.kt", m39665l = {2087}, m39666m = "invokeSuspend")
        public static final class C14282a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f45197t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f45198u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ AbstractC12682u f45199v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ InterfaceC7897n<R> f45200w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> f45201x;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super R> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super R>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14282a(AbstractC12682u abstractC12682u, InterfaceC7897n<? super R> interfaceC7897n, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super C14282a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f45199v = abstractC12682u;
                this.f45200w = interfaceC7897n;
                this.f45201x = function2;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                C14282a c14282a = new C14282a(this.f45199v, this.f45200w, this.f45201x, interfaceC9557b);
                c14282a.f45198u = obj;
                return c14282a;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                InterfaceC9557b interfaceC9557b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f45197t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    CoroutineContext.Element element = ((InterfaceC7906p0) this.f45198u).getCoroutineContext().get(InterfaceC7720d.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextM47318c = C12685x.m47318c(this.f45199v, (InterfaceC7720d) element);
                    InterfaceC9557b interfaceC9557b2 = this.f45200w;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> function2 = this.f45201x;
                    this.f45198u = interfaceC9557b2;
                    this.f45197t = 1;
                    obj = C7872i.m32684g(coroutineContextM47318c, function2, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                    interfaceC9557b = interfaceC9557b2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC9557b = (InterfaceC9557b) this.f45198u;
                    C7348o.m30470b(obj);
                }
                interfaceC9557b.resumeWith(C7347n.m30460b(obj));
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14282a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC7897n<? super R> interfaceC7897n, AbstractC12682u abstractC12682u, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2) {
            this.f45194a = interfaceC7897n;
            this.f45195b = abstractC12682u;
            this.f45196c = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C7872i.m32682e(this.f45194a.getContext().minusKey(InterfaceC7720d.INSTANCE), new C14282a(this.f45195b, this.f45194a, this.f45196c, null));
            } catch (Throwable th2) {
                this.f45194a.mo32817p(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x4.x$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m39664f = "RoomDatabase.android.kt", m39665l = {2058}, m39666m = "invokeSuspend")
    public static final class b<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45202t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45203u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function1<InterfaceC9557b<? super R>, Object> f45204v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f45204v = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f45204v, interfaceC9557b);
            bVar.f45203u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f45202t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            if (((InterfaceC7906p0) this.f45203u).getCoroutineContext().get(C12655c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            Function1<InterfaceC9557b<? super R>, Object> function1 = this.f45204v;
            this.f45202t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <R> Object m47317b(@NotNull AbstractC12682u abstractC12682u, @NotNull Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        if ((!abstractC12682u.m47254F() || !abstractC12682u.m47261M() || !abstractC12682u.m47255G()) && interfaceC9557b.getContext().get(C12686y.f45205a) != null) {
            return C12683v.m47312e(abstractC12682u, function1, interfaceC9557b);
        }
        return function1.invoke(interfaceC9557b);
    }

    /* JADX INFO: renamed from: c */
    public static final CoroutineContext m47318c(AbstractC12682u abstractC12682u, InterfaceC7720d interfaceC7720d) {
        CoroutineContext coroutineContextPlus = interfaceC7720d.plus(new C12655c0(interfaceC7720d));
        return coroutineContextPlus.plus(C7841b3.m32576a(abstractC12682u.m47250B(), coroutineContextPlus));
    }

    /* JADX INFO: renamed from: d */
    public static final <R> Object m47319d(AbstractC12682u abstractC12682u, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super R> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        try {
            abstractC12682u.m47252D().execute(new a(c7905p, abstractC12682u, function2));
        } catch (RejectedExecutionException e10) {
            c7905p.mo32817p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <R> Object m47320e(@NotNull AbstractC12682u abstractC12682u, @NotNull Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        b bVar = new b(function1, null);
        C12655c0 c12655c0 = (C12655c0) interfaceC9557b.getContext().get(C12655c0.INSTANCE);
        InterfaceC7720d transactionDispatcher = c12655c0 != null ? c12655c0.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? C7872i.m32684g(transactionDispatcher, bVar, interfaceC9557b) : m47319d(abstractC12682u, bVar, interfaceC9557b);
    }
}
