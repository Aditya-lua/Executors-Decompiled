package ne;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import p088e.C4713k0;

/* JADX INFO: renamed from: ne.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9413c extends AbstractExecutorService implements InterfaceExecutorServiceC9442z, AutoCloseable {
    @Override // ne.InterfaceExecutorServiceC9442z, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C4713k0.m23004a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t8) {
        return RunnableFutureC9422g0.m37227M(runnable, t8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return RunnableFutureC9422g0.m37228N(callable);
    }

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    public InterfaceFutureC9440x<?> submit(Runnable runnable) {
        return (InterfaceFutureC9440x) super.submit(runnable);
    }

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    public <T> InterfaceFutureC9440x<T> submit(Runnable runnable, T t8) {
        return (InterfaceFutureC9440x) super.submit(runnable, (Object) t8);
    }

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    public <T> InterfaceFutureC9440x<T> submit(Callable<T> callable) {
        return (InterfaceFutureC9440x) super.submit((Callable) callable);
    }
}
