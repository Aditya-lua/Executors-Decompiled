package p563y1;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ne.InterfaceFutureC9440x;

/* JADX INFO: renamed from: y1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12997c {

    /* JADX INFO: renamed from: y1.c$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public Object f46022a;

        /* JADX INFO: renamed from: b */
        public d<T> f46023b;

        /* JADX INFO: renamed from: c */
        public C13000f<Void> f46024c = C13000f.m48325B();

        /* JADX INFO: renamed from: d */
        public boolean f46025d;

        /* JADX INFO: renamed from: a */
        public void m48312a(@NonNull Runnable runnable, @NonNull Executor executor) {
            C13000f<Void> c13000f = this.f46024c;
            if (c13000f != null) {
                c13000f.mo37173a(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m48313b() {
            this.f46022a = null;
            this.f46023b = null;
            this.f46024c.mo48300x(null);
        }

        /* JADX INFO: renamed from: c */
        public boolean m48314c(T t8) {
            this.f46025d = true;
            d<T> dVar = this.f46023b;
            boolean z10 = dVar != null && dVar.m48319d(t8);
            if (z10) {
                m48316e();
            }
            return z10;
        }

        /* JADX INFO: renamed from: d */
        public boolean m48315d() {
            this.f46025d = true;
            d<T> dVar = this.f46023b;
            boolean z10 = dVar != null && dVar.m48318c(true);
            if (z10) {
                m48316e();
            }
            return z10;
        }

        /* JADX INFO: renamed from: e */
        public final void m48316e() {
            this.f46022a = null;
            this.f46023b = null;
            this.f46024c = null;
        }

        /* JADX INFO: renamed from: f */
        public boolean m48317f(@NonNull Throwable th2) {
            this.f46025d = true;
            d<T> dVar = this.f46023b;
            boolean z10 = dVar != null && dVar.m48320e(th2);
            if (z10) {
                m48316e();
            }
            return z10;
        }

        public void finalize() {
            C13000f<Void> c13000f;
            d<T> dVar = this.f46023b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m48320e(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f46022a));
            }
            if (this.f46025d || (c13000f = this.f46024c) == null) {
                return;
            }
            c13000f.mo48300x(null);
        }
    }

    /* JADX INFO: renamed from: y1.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: y1.c$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        Object mo22051a(@NonNull a<T> aVar);
    }

    /* JADX INFO: renamed from: y1.c$d */
    public static final class d<T> implements InterfaceFutureC9440x<T> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<a<T>> f46026a;

        /* JADX INFO: renamed from: b */
        public final AbstractC12995a<T> f46027b = new a();

        /* JADX INFO: renamed from: y1.c$d$a */
        public class a extends AbstractC12995a<T> {
            public a() {
            }

            @Override // p563y1.AbstractC12995a
            /* JADX INFO: renamed from: u */
            public String mo48298u() {
                a<T> aVar = d.this.f46026a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f46022a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f46026a = new WeakReference<>(aVar);
        }

        @Override // ne.InterfaceFutureC9440x
        /* JADX INFO: renamed from: a */
        public void mo37173a(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f46027b.mo37173a(runnable, executor);
        }

        /* JADX INFO: renamed from: c */
        public boolean m48318c(boolean z10) {
            return this.f46027b.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f46026a.get();
            boolean zCancel = this.f46027b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.m48313b();
            }
            return zCancel;
        }

        /* JADX INFO: renamed from: d */
        public boolean m48319d(T t8) {
            return this.f46027b.mo48300x(t8);
        }

        /* JADX INFO: renamed from: e */
        public boolean m48320e(Throwable th2) {
            return this.f46027b.mo48301y(th2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.concurrent.Future
        public T get() {
            return this.f46027b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f46027b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f46027b.isDone();
        }

        public String toString() {
            return this.f46027b.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) {
            return this.f46027b.get(j10, timeUnit);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> InterfaceFutureC9440x<T> m48311a(@NonNull c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f46023b = dVar;
        aVar.f46022a = cVar.getClass();
        try {
            Object objMo22051a = cVar.mo22051a(aVar);
            if (objMo22051a == null) {
                return dVar;
            }
            aVar.f46022a = objMo22051a;
            return dVar;
        } catch (Exception e10) {
            dVar.m48320e(e10);
            return dVar;
        }
    }
}
