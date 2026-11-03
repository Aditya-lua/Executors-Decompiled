package vk;

import hv.f;
import hv.x;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public class b<T> implements hv.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33546a;
    public final hv.d<T> b;

    public class a implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<T> f33547a;
        public boolean b;

        /* JADX INFO: renamed from: vk.b$a$a, reason: collision with other inner class name */
        public class RunnableC0614a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f33549a;

            public RunnableC0614a(x xVar) {
                this.f33549a = xVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.isCanceled()) {
                    a.this.f33547a.b(b.this, new IOException("Canceled"));
                } else {
                    a.this.f33547a.a(b.this, this.f33549a);
                }
            }
        }

        /* JADX INFO: renamed from: vk.b$a$b, reason: collision with other inner class name */
        public class RunnableC0615b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Throwable f33550a;

            public RunnableC0615b(Throwable th2) {
                this.f33550a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f33547a.b(b.this, this.f33550a);
            }
        }

        public a(b bVar, f<T> fVar) {
            this(fVar, false);
        }

        @Override // hv.f
        public void a(hv.d<T> dVar, x<T> xVar) {
            if (xVar.b() != 403 || xVar.f().get("X-CSRF-TOKEN") == null || this.b) {
                b.this.f33546a.execute(new RunnableC0614a(xVar));
            } else {
                b.this.b.m225clone().m(new a(this.f33547a, true));
            }
        }

        @Override // hv.f
        public void b(hv.d<T> dVar, Throwable th2) {
            b.this.f33546a.execute(new RunnableC0615b(th2));
        }

        public a(f<T> fVar, boolean z10) {
            this.f33547a = fVar;
            this.b = z10;
        }
    }

    public b(Executor executor, hv.d<T> dVar) {
        this.f33546a = executor;
        this.b = dVar;
    }

    @Override // hv.d
    public void cancel() {
        this.b.cancel();
    }

    @Override // hv.d
    public x<T> execute() {
        x<T> xVarExecute = this.b.execute();
        return (xVarExecute.b() != 403 || xVarExecute.f().get("X-CSRF-TOKEN") == null) ? xVarExecute : this.b.m225clone().execute();
    }

    @Override // hv.d
    public boolean isCanceled() {
        return this.b.isCanceled();
    }

    @Override // hv.d
    public void m(f<T> fVar) {
        if (fVar == null) {
            throw new NullPointerException("callback == null");
        }
        this.b.m(new a(this, fVar));
    }

    @Override // hv.d
    public Request request() {
        return this.b.request();
    }

    @Override // hv.d
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public hv.d<T> m225clone() {
        return new b(this.f33546a, this.b.m225clone());
    }
}
