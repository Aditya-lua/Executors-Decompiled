package a6;

import java.util.HashMap;
import java.util.Map;
import y5.j0;
import y5.w;
import z5.u;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f251e = w.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f252a;
    public final j0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5.b f253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Runnable> f254d = new HashMap();

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    public class RunnableC0005a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g6.j0 f255a;

        public RunnableC0005a(g6.j0 j0Var) {
            this.f255a = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.e().a(a.f251e, "Scheduling work " + this.f255a.id);
            a.this.f252a.e(this.f255a);
        }
    }

    public a(u uVar, j0 j0Var, y5.b bVar) {
        this.f252a = uVar;
        this.b = j0Var;
        this.f253c = bVar;
    }

    public void a(g6.j0 j0Var, long j10) {
        Runnable runnableRemove = this.f254d.remove(j0Var.id);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
        RunnableC0005a runnableC0005a = new RunnableC0005a(j0Var);
        this.f254d.put(j0Var.id, runnableC0005a);
        this.b.b(j10 - this.f253c.a(), runnableC0005a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f254d.remove(str);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
    }
}
