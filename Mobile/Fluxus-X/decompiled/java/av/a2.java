package av;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends gu.m implements Function2<p0, eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3374t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f3375u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<T> f3376v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends T> function0, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f3376v = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f3376v, bVar);
            aVar.f3375u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f3374t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return a2.d(((p0) this.f3375u).getCoroutineContext(), this.f3376v);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull eu.b<? super T> bVar) {
        return i.g(coroutineContext, new a(function0, null), bVar);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, eu.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        return b(coroutineContext, function0, bVar);
    }

    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            d3 d3Var = new d3();
            d3Var.C(g2.j(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                d3Var.z();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
