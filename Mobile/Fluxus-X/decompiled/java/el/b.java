package el;

import java.io.IOException;
import java.util.concurrent.Executor;
import mv.f0;
import sw.f;
import sw.x;

/* JADX INFO: loaded from: classes2.dex */
public class b<T> implements sw.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13818a;
    public final sw.d<T> b;

    public class a implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<T> f13819a;
        public boolean b;

        /* JADX INFO: renamed from: el.b$a$a, reason: collision with other inner class name */
        public class RunnableC0265a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f13821a;

            public RunnableC0265a(x xVar) {
                this.f13821a = xVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.m()) {
                    a.this.f13819a.a(b.this, new IOException("Canceled"));
                } else {
                    a.this.f13819a.b(b.this, this.f13821a);
                }
            }
        }

        /* JADX INFO: renamed from: el.b$a$b, reason: collision with other inner class name */
        public class RunnableC0266b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Throwable f13822a;

            public RunnableC0266b(Throwable th2) {
                this.f13822a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f13819a.a(b.this, this.f13822a);
            }
        }

        public a(b bVar, f<T> fVar) {
            this(fVar, false);
        }

        @Override // sw.f
        public void a(sw.d<T> dVar, Throwable th2) {
            b.this.f13818a.execute(new RunnableC0266b(th2));
        }

        @Override // sw.f
        public void b(sw.d<T> dVar, x<T> xVar) {
            if (xVar.b() != 403 || xVar.f().a("X-CSRF-TOKEN") == null || this.b) {
                b.this.f13818a.execute(new RunnableC0265a(xVar));
            } else {
                b.this.b.clone().L(new a(this.f13819a, true));
            }
        }

        public a(f<T> fVar, boolean z10) {
            this.f13819a = fVar;
            this.b = z10;
        }
    }

    public b(Executor executor, sw.d<T> dVar) {
        this.f13818a = executor;
        this.b = dVar;
    }

    @Override // sw.d
    public void L(f<T> fVar) {
        if (fVar == null) {
            throw new NullPointerException("callback == null");
        }
        this.b.L(new a(this, fVar));
    }

    @Override // sw.d
    public void cancel() {
        this.b.cancel();
    }

    @Override // sw.d
    public f0 h() {
        return this.b.h();
    }

    @Override // sw.d
    public x<T> j() {
        x<T> xVarJ = this.b.j();
        return (xVarJ.b() != 403 || xVarJ.f().a("X-CSRF-TOKEN") == null) ? xVarJ : this.b.clone().j();
    }

    @Override // sw.d
    public boolean m() {
        return this.b.m();
    }

    @Override // sw.d
    public sw.d<T> clone() {
        return new b(this.f13818a, this.b.clone());
    }
}
