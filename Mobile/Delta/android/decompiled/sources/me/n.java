package me;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n<V> extends m<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x<V> f24135h;

    public n(x<V> xVar) {
        this.f24135h = (x) ge.n.l(xVar);
    }

    @Override // me.b, me.x
    public void a(Runnable runnable, Executor executor) {
        this.f24135h.a(runnable, executor);
    }

    @Override // me.b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f24135h.cancel(z10);
    }

    @Override // me.b, java.util.concurrent.Future
    public V get() {
        return this.f24135h.get();
    }

    @Override // me.b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f24135h.isCancelled();
    }

    @Override // me.b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f24135h.isDone();
    }

    @Override // me.b
    public String toString() {
        return this.f24135h.toString();
    }

    @Override // me.b, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f24135h.get(j10, timeUnit);
    }
}
