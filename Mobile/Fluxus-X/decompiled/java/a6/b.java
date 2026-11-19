package a6;

import android.content.Context;
import android.text.TextUtils;
import av.d2;
import c6.i;
import c6.l;
import c6.m;
import e6.n;
import g6.WorkGenerationalId;
import g6.o1;
import h6.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import y5.j0;
import y5.o0;
import y5.w;
import z5.b1;
import z5.e;
import z5.s;
import z5.u;
import z5.y;
import z5.z;

/* JADX INFO: loaded from: classes.dex */
public class b implements u, i, e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f256o = w.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f257a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a6.a f258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f259d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f264i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i6.b f268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f269n;
    public final Map<WorkGenerationalId, d2> b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f260e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f261f = z.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<WorkGenerationalId, C0006b> f265j = new HashMap();

    /* JADX INFO: renamed from: a6.b$b, reason: collision with other inner class name */
    public static class C0006b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f270a;
        public final long b;

        public C0006b(int i10, long j10) {
            this.f270a = i10;
            this.b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, s sVar, b1 b1Var, i6.b bVar) {
        this.f257a = context;
        j0 runnableScheduler = aVar.getRunnableScheduler();
        this.f258c = new a6.a(this, runnableScheduler, aVar.getClock());
        this.f269n = new d(runnableScheduler, b1Var);
        this.f268m = bVar;
        this.f267l = new l(nVar);
        this.f264i = aVar;
        this.f262g = sVar;
        this.f263h = b1Var;
    }

    @Override // z5.e
    public void a(WorkGenerationalId workGenerationalId, boolean z10) {
        y yVarF = this.f261f.f(workGenerationalId);
        if (yVarF != null) {
            this.f269n.b(yVarF);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f260e) {
            this.f265j.remove(workGenerationalId);
        }
    }

    @Override // z5.u
    public void b(String str) {
        if (this.f266k == null) {
            f();
        }
        if (!this.f266k.booleanValue()) {
            w.e().f(f256o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        w.e().a(f256o, "Cancelling work ID " + str);
        a6.a aVar = this.f258c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f261f.remove(str)) {
            this.f269n.b(yVar);
            this.f263h.d(yVar);
        }
    }

    @Override // c6.i
    public void c(g6.j0 j0Var, c6.b bVar) {
        WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
        if (bVar instanceof c6.b.a) {
            if (this.f261f.b(workGenerationalIdA)) {
                return;
            }
            w.e().a(f256o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            y yVarC = this.f261f.c(workGenerationalIdA);
            this.f269n.c(yVarC);
            this.f263h.e(yVarC);
            return;
        }
        w.e().a(f256o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        y yVarF = this.f261f.f(workGenerationalIdA);
        if (yVarF != null) {
            this.f269n.b(yVarF);
            this.f263h.c(yVarF, ((c6.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // z5.u
    public boolean d() {
        return false;
    }

    @Override // z5.u
    public void e(g6.j0... j0VarArr) {
        if (this.f266k == null) {
            f();
        }
        if (!this.f266k.booleanValue()) {
            w.e().f(f256o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<g6.j0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (g6.j0 j0Var : j0VarArr) {
            if (!this.f261f.b(o1.a(j0Var))) {
                long jMax = Math.max(j0Var.c(), i(j0Var));
                long jA = this.f264i.getClock().a();
                if (j0Var.state == o0.c.ENQUEUED) {
                    if (jA < jMax) {
                        a6.a aVar = this.f258c;
                        if (aVar != null) {
                            aVar.a(j0Var, jMax);
                        }
                    } else if (j0Var.m()) {
                        y5.d dVar = j0Var.constraints;
                        if (dVar.getRequiresDeviceIdle()) {
                            w.e().a(f256o, "Ignoring " + j0Var + ". Requires device idle.");
                        } else if (dVar.g()) {
                            w.e().a(f256o, "Ignoring " + j0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(j0Var);
                            hashSet2.add(j0Var.id);
                        }
                    } else if (!this.f261f.b(o1.a(j0Var))) {
                        w.e().a(f256o, "Starting work for " + j0Var.id);
                        y yVarE = this.f261f.e(j0Var);
                        this.f269n.c(yVarE);
                        this.f263h.e(yVarE);
                    }
                }
            }
        }
        synchronized (this.f260e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.e().a(f256o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (g6.j0 j0Var2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = o1.a(j0Var2);
                        if (!this.b.containsKey(workGenerationalIdA)) {
                            this.b.put(workGenerationalIdA, m.e(this.f267l, j0Var2, this.f268m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        this.f266k = Boolean.valueOf(x.b(this.f257a, this.f264i));
    }

    public final void g() {
        if (this.f259d) {
            return;
        }
        this.f262g.e(this);
        this.f259d = true;
    }

    public final void h(WorkGenerationalId workGenerationalId) {
        d2 d2VarRemove;
        synchronized (this.f260e) {
            d2VarRemove = this.b.remove(workGenerationalId);
        }
        if (d2VarRemove != null) {
            w.e().a(f256o, "Stopping tracking for " + workGenerationalId);
            d2VarRemove.c(null);
        }
    }

    public final long i(g6.j0 j0Var) {
        long jMax;
        synchronized (this.f260e) {
            try {
                WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
                C0006b c0006b = this.f265j.get(workGenerationalIdA);
                if (c0006b == null) {
                    c0006b = new C0006b(j0Var.runAttemptCount, this.f264i.getClock().a());
                    this.f265j.put(workGenerationalIdA, c0006b);
                }
                jMax = c0006b.b + (((long) Math.max((j0Var.runAttemptCount - c0006b.f270a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
