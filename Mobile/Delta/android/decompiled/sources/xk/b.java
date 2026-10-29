package xk;

import java.io.IOException;
import java.util.concurrent.Executor;
import jv.f;
import jv.x;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public class b<T> implements jv.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f35224a;
    public final jv.d<T> b;

    public class a implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<T> f35225a;
        public boolean b;

        /* JADX INFO: renamed from: xk.b$a$a, reason: collision with other inner class name */
        public class RunnableC0642a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f35227a;

            public RunnableC0642a(x xVar) {
                this.f35227a = xVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.isCanceled()) {
                    a.this.f35225a.b(b.this, new IOException("Canceled"));
                } else {
                    a.this.f35225a.a(b.this, this.f35227a);
                }
            }
        }

        /* JADX INFO: renamed from: xk.b$a$b, reason: collision with other inner class name */
        public class RunnableC0643b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Throwable f35228a;

            public RunnableC0643b(Throwable th2) {
                this.f35228a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f35225a.b(b.this, this.f35228a);
            }
        }

        public a(b bVar, f<T> fVar) {
            this(fVar, false);
        }

        @Override // jv.f
        public void a(jv.d<T> dVar, x<T> xVar) {
            if (xVar.b() != 403 || xVar.f().get("X-CSRF-TOKEN") == null || this.b) {
                b.this.f35224a.execute(new RunnableC0642a(xVar));
            } else {
                b.this.b.clone().B(new a(this.f35225a, true));
            }
        }

        @Override // jv.f
        public void b(jv.d<T> dVar, Throwable th2) {
            b.this.f35224a.execute(new RunnableC0643b(th2));
        }

        public a(f<T> fVar, boolean z10) {
            this.f35225a = fVar;
            this.b = z10;
        }
    }

    public b(Executor executor, jv.d<T> dVar) {
        this.f35224a = executor;
        this.b = dVar;
    }

    @Override // jv.d
    public void B(f<T> fVar) {
        if (fVar == null) {
            throw new NullPointerException("callback == null");
        }
        this.b.B(new a(this, fVar));
    }

    @Override // jv.d
    public void cancel() {
        this.b.cancel();
    }

    @Override // jv.d
    public x<T> execute() {
        x<T> xVarExecute = this.b.execute();
        return (xVarExecute.b() != 403 || xVarExecute.f().get("X-CSRF-TOKEN") == null) ? xVarExecute : this.b.clone().execute();
    }

    @Override // jv.d
    public boolean isCanceled() {
        return this.b.isCanceled();
    }

    @Override // jv.d
    public Request request() {
        return this.b.request();
    }

    @Override // jv.d
    public jv.d<T> clone() {
        return new b(this.f35224a, this.b.clone());
    }
}
