package ne;

import ie.AbstractC6786o;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ne.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFutureC9431o<V> extends AbstractC6786o implements Future<V> {
    /* JADX INFO: renamed from: c */
    public abstract Future<? extends V> mo37254c();

    public boolean cancel(boolean z10) {
        return mo37254c().cancel(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public V get() {
        return mo37254c().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return mo37254c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return mo37254c().isDone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return mo37254c().get(j10, timeUnit);
    }
}
