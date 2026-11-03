package z5;

import java.util.HashMap;
import java.util.Map;
import x5.j0;
import x5.w;
import y5.u;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37976e = w.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f37977a;
    public final j0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5.b f37978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Runnable> f37979d = new HashMap();

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    public class RunnableC0685a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.j0 f37980a;

        public RunnableC0685a(f6.j0 j0Var) {
            this.f37980a = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.e().a(a.f37976e, "Scheduling work " + this.f37980a.id);
            a.this.f37977a.a(this.f37980a);
        }
    }

    public a(u uVar, j0 j0Var, x5.b bVar) {
        this.f37977a = uVar;
        this.b = j0Var;
        this.f37978c = bVar;
    }

    public void a(f6.j0 j0Var, long j10) {
        Runnable runnableRemove = this.f37979d.remove(j0Var.id);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
        RunnableC0685a runnableC0685a = new RunnableC0685a(j0Var);
        this.f37979d.put(j0Var.id, runnableC0685a);
        this.b.b(j10 - this.f37978c.a(), runnableC0685a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f37979d.remove(str);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
    }
}
