package ne;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p088e.C4713k0;

/* JADX INFO: renamed from: ne.z */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceExecutorServiceC9442z extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        C4713k0.m23004a(this);
    }

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    InterfaceFutureC9440x<?> submit(Runnable runnable);

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    <T> InterfaceFutureC9440x<T> submit(Runnable runnable, T t8);

    /* JADX DEBUG: Method merged with bridge method: submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future; */
    @Override // java.util.concurrent.ExecutorService, ne.InterfaceExecutorServiceC9442z
    <T> InterfaceFutureC9440x<T> submit(Callable<T> callable);
}
