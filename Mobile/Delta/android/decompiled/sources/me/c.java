package me;

import e.k0;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends AbstractExecutorService implements z, AutoCloseable {
    @Override // me.z, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t8) {
        return g0.M(runnable, t8);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return g0.N(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, me.z
    public x<?> submit(Runnable runnable) {
        return (x) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, me.z
    public <T> x<T> submit(Runnable runnable, T t8) {
        return (x) super.submit(runnable, (Object) t8);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, me.z
    public <T> x<T> submit(Callable<T> callable) {
        return (x) super.submit((Callable) callable);
    }
}
