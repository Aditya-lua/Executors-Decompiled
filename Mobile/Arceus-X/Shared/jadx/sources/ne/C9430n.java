package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C9430n<V> extends AbstractC9429m<V> {

    /* JADX INFO: renamed from: h */
    public final InterfaceFutureC9440x<V> f33957h;

    public C9430n(InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        this.f33957h = (InterfaceFutureC9440x) C6384n.m27928l(interfaceFutureC9440x);
    }

    @Override // ne.AbstractC9411b, ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        this.f33957h.mo37173a(runnable, executor);
    }

    @Override // ne.AbstractC9411b, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f33957h.cancel(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ne.AbstractC9411b, java.util.concurrent.Future
    public V get() {
        return this.f33957h.get();
    }

    @Override // ne.AbstractC9411b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f33957h.isCancelled();
    }

    @Override // ne.AbstractC9411b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f33957h.isDone();
    }

    @Override // ne.AbstractC9411b
    public String toString() {
        return this.f33957h.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // ne.AbstractC9411b, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f33957h.get(j10, timeUnit);
    }
}
