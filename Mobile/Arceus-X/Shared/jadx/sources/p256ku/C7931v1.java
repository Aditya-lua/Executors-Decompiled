package p256ku;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ku.v1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, m31665d2 = {"Ljava/util/concurrent/ExecutorService;", "Lku/t1;", "c", "(Ljava/util/concurrent/ExecutorService;)Lku/t1;", "Ljava/util/concurrent/Executor;", "Lku/l0;", "b", "(Ljava/util/concurrent/Executor;)Lku/l0;", "a", "(Lku/l0;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7931v1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Executor m32924a(@NotNull AbstractC7888l0 abstractC7888l0) {
        Executor executor;
        AbstractC7923t1 abstractC7923t1 = abstractC7888l0 instanceof AbstractC7923t1 ? (AbstractC7923t1) abstractC7888l0 : null;
        return (abstractC7923t1 == null || (executor = abstractC7923t1.getExecutor()) == null) ? new ExecutorC7859f1(abstractC7888l0) : executor;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC7888l0 m32925b(@NotNull Executor executor) {
        AbstractC7888l0 abstractC7888l0;
        ExecutorC7859f1 executorC7859f1 = executor instanceof ExecutorC7859f1 ? (ExecutorC7859f1) executor : null;
        return (executorC7859f1 == null || (abstractC7888l0 = executorC7859f1.dispatcher) == null) ? new C7927u1(executor) : abstractC7888l0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC7923t1 m32926c(@NotNull ExecutorService executorService) {
        return new C7927u1(executorService);
    }
}
