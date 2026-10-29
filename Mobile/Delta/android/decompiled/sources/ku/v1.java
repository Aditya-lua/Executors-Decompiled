package ku;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lku/t1;", "c", "(Ljava/util/concurrent/ExecutorService;)Lku/t1;", "Ljava/util/concurrent/Executor;", "Lku/l0;", "b", "(Ljava/util/concurrent/Executor;)Lku/l0;", "a", "(Lku/l0;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {
    @NotNull
    public static final Executor a(@NotNull l0 l0Var) {
        Executor executor;
        t1 t1Var = l0Var instanceof t1 ? (t1) l0Var : null;
        return (t1Var == null || (executor = t1Var.getExecutor()) == null) ? new f1(l0Var) : executor;
    }

    @NotNull
    public static final l0 b(@NotNull Executor executor) {
        l0 l0Var;
        f1 f1Var = executor instanceof f1 ? (f1) executor : null;
        return (f1Var == null || (l0Var = f1Var.dispatcher) == null) ? new u1(executor) : l0Var;
    }

    @NotNull
    public static final t1 c(@NotNull ExecutorService executorService) {
        return new u1(executorService);
    }
}
