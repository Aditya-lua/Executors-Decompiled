package me;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o<V> extends he.o implements Future<V> {
    public abstract Future<? extends V> c();

    public boolean cancel(boolean z10) {
        return c().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return c().get(j10, timeUnit);
    }
}
