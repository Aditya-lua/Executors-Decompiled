package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ku.a2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7835a2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ku.a2$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m39664f = "Interruptible.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a<T> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f29681t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f29682u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function0<T> f29683v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends T> function0, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29683v = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f29683v, interfaceC9557b);
            aVar.f29682u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f29681t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C7835a2.m32564d(((InterfaceC7906p0) this.f29682u).getCoroutineContext(), this.f29683v);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super T> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m32562b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return C7872i.m32684g(coroutineContext, new a(function0, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m32563c(CoroutineContext coroutineContext, Function0 function0, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        return m32562b(coroutineContext, function0, interfaceC9557b);
    }

    /* JADX INFO: renamed from: d */
    public static final <T> T m32564d(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            C7851d3 c7851d3 = new C7851d3();
            c7851d3.m32610C(C7865g2.m32654h(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                c7851d3.m32611z();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
