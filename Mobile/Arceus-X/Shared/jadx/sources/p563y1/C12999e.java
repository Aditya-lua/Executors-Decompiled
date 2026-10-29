package p563y1;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7905p;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: y1.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m31665d2 = {"T", "Lne/x;", "b", "(Lne/x;Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, m31666k = 2, m31667mv = {1, 4, 0})
public final class C12999e {

    /* JADX INFO: renamed from: y1.e$a */
    @Metadata(m31663bv = {1, 0, 3}, m31664d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"<anonymous>", "", "T", "it", "", "invoke", "androidx/concurrent/futures/ListenableFutureKt$await$2$1"}, m31666k = 3, m31667mv = {1, 1, 16})
    public static final class a extends AbstractC7746m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceFutureC9440x f46031i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceFutureC9440x interfaceFutureC9440x) {
            super(1);
            this.f46031i = interfaceFutureC9440x;
        }

        /* JADX INFO: renamed from: a */
        public final void m48324a(@Nullable Throwable th2) {
            this.f46031i.cancel(false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m48324a(th2);
            return Unit.f29331a;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m48322b(@NotNull InterfaceFutureC9440x<T> interfaceFutureC9440x, @NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
        try {
            if (interfaceFutureC9440x.isDone()) {
                return AbstractC12995a.m48293r(interfaceFutureC9440x);
            }
            C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
            interfaceFutureC9440x.mo37173a(new RunnableC13001g(interfaceFutureC9440x, c7905p), EnumC12998d.INSTANCE);
            c7905p.mo32815n(new a(interfaceFutureC9440x));
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A;
        } catch (ExecutionException e10) {
            throw m48323c(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Throwable m48323c(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            Intrinsics.m31992o();
        }
        return cause;
    }
}
