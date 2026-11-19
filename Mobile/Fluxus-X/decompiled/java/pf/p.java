package pf;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public class p<V> extends y1.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledFuture<?> f29141h;

    public class a implements b<V> {
        public a() {
        }

        @Override // pf.p.b
        public void a(Throwable th2) {
            p.this.y(th2);
        }

        @Override // pf.p.b
        public void set(V v8) {
            p.this.x(v8);
        }
    }

    public interface b<T> {
        void a(Throwable th2);

        void set(T t8);
    }

    public interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    public p(c<V> cVar) {
        this.f29141h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f29141h.compareTo(delayed);
    }

    @Override // y1.a
    public void d() {
        this.f29141h.cancel(A());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f29141h.getDelay(timeUnit);
    }
}
