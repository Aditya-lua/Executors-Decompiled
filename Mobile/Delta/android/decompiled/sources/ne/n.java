package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n<V> extends m<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x<V> f27143h;

    public n(x<V> xVar) {
        this.f27143h = (x) he.n.l(xVar);
    }

    @Override // ne.b, ne.x
    public void a(Runnable runnable, Executor executor) {
        this.f27143h.a(runnable, executor);
    }

    @Override // ne.b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f27143h.cancel(z10);
    }

    @Override // ne.b, java.util.concurrent.Future
    public V get() {
        return this.f27143h.get();
    }

    @Override // ne.b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f27143h.isCancelled();
    }

    @Override // ne.b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f27143h.isDone();
    }

    @Override // ne.b
    public String toString() {
        return this.f27143h.toString();
    }

    @Override // ne.b, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f27143h.get(j10, timeUnit);
    }
}
