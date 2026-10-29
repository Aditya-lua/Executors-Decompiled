package z5;

import java.util.HashMap;
import java.util.Map;
import x5.j0;
import x5.w;
import y5.u;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37281e = w.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f37282a;
    public final j0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5.b f37283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Runnable> f37284d = new HashMap();

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    public class RunnableC0675a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.j0 f37285a;

        public RunnableC0675a(f6.j0 j0Var) {
            this.f37285a = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.e().a(a.f37281e, "Scheduling work " + this.f37285a.id);
            a.this.f37282a.a(this.f37285a);
        }
    }

    public a(u uVar, j0 j0Var, x5.b bVar) {
        this.f37282a = uVar;
        this.b = j0Var;
        this.f37283c = bVar;
    }

    public void a(f6.j0 j0Var, long j10) {
        Runnable runnableRemove = this.f37284d.remove(j0Var.id);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
        RunnableC0675a runnableC0675a = new RunnableC0675a(j0Var);
        this.f37284d.put(j0Var.id, runnableC0675a);
        this.b.b(j10 - this.f37283c.a(), runnableC0675a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f37284d.remove(str);
        if (runnableRemove != null) {
            this.b.a(runnableRemove);
        }
    }
}
