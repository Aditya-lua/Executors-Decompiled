package v2;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f34151a;
    public final Executor b;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    public class RunnableC0696a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f34152a;
        public final /* synthetic */ Typeface b;

        public RunnableC0696a(g.c cVar, Typeface typeface) {
            this.f34152a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34152a.b(this.b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f34154a;
        public final /* synthetic */ int b;

        public b(g.c cVar, int i10) {
            this.f34154a = cVar;
            this.b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34154a.a(this.b);
        }
    }

    public a(g.c cVar, Executor executor) {
        this.f34151a = cVar;
        this.b = executor;
    }

    public final void a(int i10) {
        this.b.execute(new b(this.f34151a, i10));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f34178a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.execute(new RunnableC0696a(this.f34151a, typeface));
    }
}
