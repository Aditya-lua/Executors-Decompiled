package z5;

import android.content.Context;
import android.text.TextUtils;
import b6.i;
import b6.l;
import b6.m;
import d6.n;
import f6.WorkGenerationalId;
import f6.o1;
import g6.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ku.d2;
import x5.j0;
import x5.o0;
import x5.w;
import y5.b1;
import y5.e;
import y5.s;
import y5.u;
import y5.y;
import y5.z;

/* JADX INFO: loaded from: classes.dex */
public class b implements u, i, e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f37286o = w.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37287a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5.a f37288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37289d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f37292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f37293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f37294i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f37296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f37297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h6.b f37298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f37299n;
    public final Map<WorkGenerationalId, d2> b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37290e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f37291f = z.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<WorkGenerationalId, C0676b> f37295j = new HashMap();

    /* JADX INFO: renamed from: z5.b$b, reason: collision with other inner class name */
    public static class C0676b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37300a;
        public final long b;

        public C0676b(int i10, long j10) {
            this.f37300a = i10;
            this.b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, s sVar, b1 b1Var, h6.b bVar) {
        this.f37287a = context;
        j0 runnableScheduler = aVar.getRunnableScheduler();
        this.f37288c = new z5.a(this, runnableScheduler, aVar.getClock());
        this.f37299n = new d(runnableScheduler, b1Var);
        this.f37298m = bVar;
        this.f37297l = new l(nVar);
        this.f37294i = aVar;
        this.f37292g = sVar;
        this.f37293h = b1Var;
    }

    @Override // y5.u
    public void a(f6.j0... j0VarArr) {
        if (this.f37296k == null) {
            f();
        }
        if (!this.f37296k.booleanValue()) {
            w.e().f(f37286o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<f6.j0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (f6.j0 j0Var : j0VarArr) {
            if (!this.f37291f.e(o1.a(j0Var))) {
                long jMax = Math.max(j0Var.c(), i(j0Var));
                long jA = this.f37294i.getClock().a();
                if (j0Var.state == o0.c.ENQUEUED) {
                    if (jA < jMax) {
                        z5.a aVar = this.f37288c;
                        if (aVar != null) {
                            aVar.a(j0Var, jMax);
                        }
                    } else if (j0Var.m()) {
                        x5.d dVar = j0Var.constraints;
                        if (dVar.getRequiresDeviceIdle()) {
                            w.e().a(f37286o, "Ignoring " + j0Var + ". Requires device idle.");
                        } else if (dVar.g()) {
                            w.e().a(f37286o, "Ignoring " + j0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(j0Var);
                            hashSet2.add(j0Var.id);
                        }
                    } else if (!this.f37291f.e(o1.a(j0Var))) {
                        w.e().a(f37286o, "Starting work for " + j0Var.id);
                        y yVarD = this.f37291f.d(j0Var);
                        this.f37299n.c(yVarD);
                        this.f37293h.d(yVarD);
                    }
                }
            }
        }
        synchronized (this.f37290e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.e().a(f37286o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (f6.j0 j0Var2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = o1.a(j0Var2);
                        if (!this.b.containsKey(workGenerationalIdA)) {
                            this.b.put(workGenerationalIdA, m.e(this.f37297l, j0Var2, this.f37298m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y5.u
    public void b(String str) {
        if (this.f37296k == null) {
            f();
        }
        if (!this.f37296k.booleanValue()) {
            w.e().f(f37286o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        w.e().a(f37286o, "Cancelling work ID " + str);
        z5.a aVar = this.f37288c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f37291f.remove(str)) {
            this.f37299n.b(yVar);
            this.f37293h.a(yVar);
        }
    }

    @Override // y5.u
    public boolean c() {
        return false;
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        y yVarC = this.f37291f.c(workGenerationalId);
        if (yVarC != null) {
            this.f37299n.b(yVarC);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f37290e) {
            this.f37295j.remove(workGenerationalId);
        }
    }

    @Override // b6.i
    public void e(f6.j0 j0Var, b6.b bVar) {
        WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
        if (bVar instanceof b6.b.a) {
            if (this.f37291f.e(workGenerationalIdA)) {
                return;
            }
            w.e().a(f37286o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            y yVarF = this.f37291f.f(workGenerationalIdA);
            this.f37299n.c(yVarF);
            this.f37293h.d(yVarF);
            return;
        }
        w.e().a(f37286o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        y yVarC = this.f37291f.c(workGenerationalIdA);
        if (yVarC != null) {
            this.f37299n.b(yVarC);
            this.f37293h.c(yVarC, ((b6.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    public final void f() {
        this.f37296k = Boolean.valueOf(x.b(this.f37287a, this.f37294i));
    }

    public final void g() {
        if (this.f37289d) {
            return;
        }
        this.f37292g.e(this);
        this.f37289d = true;
    }

    public final void h(WorkGenerationalId workGenerationalId) {
        d2 d2VarRemove;
        synchronized (this.f37290e) {
            d2VarRemove = this.b.remove(workGenerationalId);
        }
        if (d2VarRemove != null) {
            w.e().a(f37286o, "Stopping tracking for " + workGenerationalId);
            d2VarRemove.c(null);
        }
    }

    public final long i(f6.j0 j0Var) {
        long jMax;
        synchronized (this.f37290e) {
            try {
                WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
                C0676b c0676b = this.f37295j.get(workGenerationalIdA);
                if (c0676b == null) {
                    c0676b = new C0676b(j0Var.runAttemptCount, this.f37294i.getClock().a());
                    this.f37295j.put(workGenerationalIdA, c0676b);
                }
                jMax = c0676b.b + (((long) Math.max((j0Var.runAttemptCount - c0676b.f37300a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
