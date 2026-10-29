package y1;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import ku.p;
import me.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "Lme/x;", "b", "(Lme/x;Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "c", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 4, 0})
public final class e {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "androidx/concurrent/futures/ListenableFutureKt$await$2$1"}, k = 3, mv = {1, 1, 16})
    public static final class a extends m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x f35495i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            super(1);
            this.f35495i = xVar;
        }

        public final void a(@Nullable Throwable th2) {
            this.f35495i.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull x<T> xVar, @NotNull nt.b<? super T> bVar) throws Throwable {
        try {
            if (xVar.isDone()) {
                return y1.a.r(xVar);
            }
            p pVar = new p(ot.b.c(bVar), 1);
            xVar.a(new g(xVar, pVar), d.INSTANCE);
            pVar.n(new a(xVar));
            Object objA = pVar.A();
            if (objA == ot.c.e()) {
                h.c(bVar);
            }
            return objA;
        } catch (ExecutionException e10) {
            throw c(e10);
        }
    }

    public static final Throwable c(@NotNull ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            Intrinsics.o();
        }
        return cause;
    }
}
