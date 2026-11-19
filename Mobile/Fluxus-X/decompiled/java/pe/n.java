package pe;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n<V> extends m<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x<V> f29099h;

    public n(x<V> xVar) {
        this.f29099h = (x) je.n.l(xVar);
    }

    @Override // pe.b, pe.x
    public void a(Runnable runnable, Executor executor) {
        this.f29099h.a(runnable, executor);
    }

    @Override // pe.b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f29099h.cancel(z10);
    }

    @Override // pe.b, java.util.concurrent.Future
    public V get() {
        return this.f29099h.get();
    }

    @Override // pe.b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f29099h.isCancelled();
    }

    @Override // pe.b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f29099h.isDone();
    }

    @Override // pe.b
    public String toString() {
        return this.f29099h.toString();
    }

    @Override // pe.b, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f29099h.get(j10, timeUnit);
    }
}
