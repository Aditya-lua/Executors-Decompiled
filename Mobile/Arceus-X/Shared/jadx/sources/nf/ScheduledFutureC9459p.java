package nf;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p563y1.AbstractC12995a;

/* JADX INFO: renamed from: nf.p */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public class ScheduledFutureC9459p<V> extends AbstractC12995a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h */
    public final ScheduledFuture<?> f34019h;

    /* JADX INFO: renamed from: nf.p$a */
    public class a implements b<V> {
        public a() {
        }

        @Override // nf.ScheduledFutureC9459p.b
        /* JADX INFO: renamed from: a */
        public void mo37295a(Throwable th2) {
            ScheduledFutureC9459p.this.mo48301y(th2);
        }

        @Override // nf.ScheduledFutureC9459p.b
        public void set(V v5) {
            ScheduledFutureC9459p.this.mo48300x(v5);
        }
    }

    /* JADX INFO: renamed from: nf.p$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo37295a(Throwable th2);

        void set(T t8);
    }

    /* JADX INFO: renamed from: nf.p$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        ScheduledFuture<?> mo37278a(b<T> bVar);
    }

    public ScheduledFutureC9459p(c<V> cVar) {
        this.f34019h = cVar.mo37278a(new a());
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f34019h.compareTo(delayed);
    }

    @Override // p563y1.AbstractC12995a
    /* JADX INFO: renamed from: d */
    public void mo37294d() {
        this.f34019h.cancel(m48295A());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f34019h.getDelay(timeUnit);
    }
}
