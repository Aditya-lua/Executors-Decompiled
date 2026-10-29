package y1;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import me.x;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f35489a;
        public d<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f<Void> f35490c = f.B();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f35491d;

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            f<Void> fVar = this.f35490c;
            if (fVar != null) {
                fVar.a(runnable, executor);
            }
        }

        public void b() {
            this.f35489a = null;
            this.b = null;
            this.f35490c.x(null);
        }

        public boolean c(T t8) {
            this.f35491d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.d(t8);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f35491d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.c(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f35489a = null;
            this.b = null;
            this.f35490c = null;
        }

        public boolean f(@NonNull Throwable th2) {
            this.f35491d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.e(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            f<Void> fVar;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.e(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f35489a));
            }
            if (this.f35491d || (fVar = this.f35490c) == null) {
                return;
            }
            fVar.x(null);
        }
    }

    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: y1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0650c<T> {
        Object a(@NonNull a<T> aVar);
    }

    public static final class d<T> implements x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f35492a;
        public final y1.a<T> b = new a();

        public class a extends y1.a<T> {
            public a() {
            }

            @Override // y1.a
            public String u() {
                a<T> aVar = d.this.f35492a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f35489a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f35492a = new WeakReference<>(aVar);
        }

        @Override // me.x
        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.b.a(runnable, executor);
        }

        public boolean c(boolean z10) {
            return this.b.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f35492a.get();
            boolean zCancel = this.b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        public boolean d(T t8) {
            return this.b.x(t8);
        }

        public boolean e(Throwable th2) {
            return this.b.y(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        public String toString() {
            return this.b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) {
            return this.b.get(j10, timeUnit);
        }
    }

    @NonNull
    public static <T> x<T> a(@NonNull InterfaceC0650c<T> interfaceC0650c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.f35489a = interfaceC0650c.getClass();
        try {
            Object objA = interfaceC0650c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f35489a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.e(e10);
            return dVar;
        }
    }
}
