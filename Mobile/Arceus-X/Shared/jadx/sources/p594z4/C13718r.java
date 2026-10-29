package p594z4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7872i;
import p256ku.C7877j;
import p256ku.C7935w1;
import p256ku.C7945z;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"T", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13718r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: z4.r$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m39664f = "RunBlockingUninterruptible.android.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a<T> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48232t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48233u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> f48234v;

        /* JADX INFO: renamed from: z4.r$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m39664f = "RunBlockingUninterruptible.android.kt", m39665l = {52}, m39666m = "invokeSuspend")
        public static final class C14295a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48235t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f48236u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC7937x<T> f48237v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> f48238w;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super T>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14295a(InterfaceC7937x<T> interfaceC7937x, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super C14295a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f48237v = interfaceC7937x;
                this.f48238w = function2;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                C14295a c14295a = new C14295a(this.f48237v, this.f48238w, interfaceC9557b);
                c14295a.f48236u = obj;
                return c14295a;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                InterfaceC7937x<T> interfaceC7937x;
                Object objM30460b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f48235t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f48236u;
                    InterfaceC7937x<T> interfaceC7937x2 = this.f48237v;
                    Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> function2 = this.f48238w;
                    try {
                        C7347n.Companion companion = C7347n.INSTANCE;
                        this.f48236u = interfaceC7937x2;
                        this.f48235t = 1;
                        obj = function2.invoke(interfaceC7906p0, this);
                        if (obj == objM38805e) {
                            return objM38805e;
                        }
                        interfaceC7937x = interfaceC7937x2;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC7937x = interfaceC7937x2;
                        C7347n.Companion companion2 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7937x = (InterfaceC7937x) this.f48236u;
                    try {
                        C7348o.m30470b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        C7347n.Companion companion3 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    }
                }
                objM30460b = C7347n.m30460b(obj);
                C7945z.m32936d(interfaceC7937x, objM30460b);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14295a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: z4.r$a$b */
        @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m39664f = "RunBlockingUninterruptible.android.kt", m39665l = {58}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48239t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC7937x<T> f48240u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC7937x<T> interfaceC7937x, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f48240u = interfaceC7937x;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f48240u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f48239t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC7937x<T> interfaceC7937x = this.f48240u;
                this.f48239t = 1;
                Object objMo32927B = interfaceC7937x.mo32927B(this);
                return objMo32927B == objM38805e ? objM38805e : objMo32927B;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super T> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48234v = function2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f48234v, interfaceC9557b);
            aVar.f48233u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f48232t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            CoroutineContext.Element element = ((InterfaceC7906p0) this.f48233u).getCoroutineContext().get(InterfaceC7720d.INSTANCE);
            Intrinsics.checkNotNull(element);
            InterfaceC7720d interfaceC7720d = (InterfaceC7720d) element;
            InterfaceC7937x interfaceC7937xM32935c = C7945z.m32935c(null, 1, null);
            C7872i.m32680c(C7935w1.f29814a, interfaceC7720d, EnumC7914r0.UNDISPATCHED, new C14295a(interfaceC7937xM32935c, this.f48234v, null));
            while (!interfaceC7937xM32935c.mo32598d()) {
                try {
                    return C7872i.m32682e(interfaceC7720d, new b(interfaceC7937xM32935c, null));
                } catch (InterruptedException unused) {
                }
            }
            return interfaceC7937xM32935c.mo32928g();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super T> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> T m50112a(@NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) C7877j.m32694b(null, new a(block, null), 1, null);
    }
}
