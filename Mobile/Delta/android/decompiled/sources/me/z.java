package me;

import e.k0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface z extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.ExecutorService, me.z
    x<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, me.z
    <T> x<T> submit(Runnable runnable, T t8);

    @Override // java.util.concurrent.ExecutorService, me.z
    <T> x<T> submit(Callable<T> callable);
}
