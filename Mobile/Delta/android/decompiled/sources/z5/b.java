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
import iu.d2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
    public static final String f37981o = w.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37982a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5.a f37983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37984d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f37987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f37988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f37989i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f37991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f37992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h6.b f37993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f37994n;
    public final Map<WorkGenerationalId, d2> b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37985e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f37986f = z.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<WorkGenerationalId, C0686b> f37990j = new HashMap();

    /* JADX INFO: renamed from: z5.b$b, reason: collision with other inner class name */
    public static class C0686b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37995a;
        public final long b;

        public C0686b(int i10, long j10) {
            this.f37995a = i10;
            this.b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, s sVar, b1 b1Var, h6.b bVar) {
        this.f37982a = context;
        j0 runnableScheduler = aVar.getRunnableScheduler();
        this.f37983c = new z5.a(this, runnableScheduler, aVar.getClock());
        this.f37994n = new d(runnableScheduler, b1Var);
        this.f37993m = bVar;
        this.f37992l = new l(nVar);
        this.f37989i = aVar;
        this.f37987g = sVar;
        this.f37988h = b1Var;
    }

    @Override // y5.u
    public void a(f6.j0... j0VarArr) {
        if (this.f37991k == null) {
            f();
        }
        if (!this.f37991k.booleanValue()) {
            w.e().f(f37981o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<f6.j0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (f6.j0 j0Var : j0VarArr) {
            if (!this.f37986f.e(o1.a(j0Var))) {
                long jMax = Math.max(j0Var.c(), i(j0Var));
                long jA = this.f37989i.getClock().a();
                if (j0Var.state == o0.c.ENQUEUED) {
                    if (jA < jMax) {
                        z5.a aVar = this.f37983c;
                        if (aVar != null) {
                            aVar.a(j0Var, jMax);
                        }
                    } else if (j0Var.m()) {
                        x5.d dVar = j0Var.constraints;
                        if (dVar.getRequiresDeviceIdle()) {
                            w.e().a(f37981o, "Ignoring " + j0Var + ". Requires device idle.");
                        } else if (dVar.g()) {
                            w.e().a(f37981o, "Ignoring " + j0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(j0Var);
                            hashSet2.add(j0Var.id);
                        }
                    } else if (!this.f37986f.e(o1.a(j0Var))) {
                        w.e().a(f37981o, "Starting work for " + j0Var.id);
                        y yVarD = this.f37986f.d(j0Var);
                        this.f37994n.c(yVarD);
                        this.f37988h.d(yVarD);
                    }
                }
            }
        }
        synchronized (this.f37985e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.e().a(f37981o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (f6.j0 j0Var2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = o1.a(j0Var2);
                        if (!this.b.containsKey(workGenerationalIdA)) {
                            this.b.put(workGenerationalIdA, m.e(this.f37992l, j0Var2, this.f37993m.b(), this));
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
        if (this.f37991k == null) {
            f();
        }
        if (!this.f37991k.booleanValue()) {
            w.e().f(f37981o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        w.e().a(f37981o, "Cancelling work ID " + str);
        z5.a aVar = this.f37983c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f37986f.remove(str)) {
            this.f37994n.b(yVar);
            this.f37988h.a(yVar);
        }
    }

    @Override // y5.u
    public boolean c() {
        return false;
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        y yVarC = this.f37986f.c(workGenerationalId);
        if (yVarC != null) {
            this.f37994n.b(yVarC);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f37985e) {
            this.f37990j.remove(workGenerationalId);
        }
    }

    @Override // b6.i
    public void e(f6.j0 j0Var, b6.b bVar) {
        WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
        if (bVar instanceof b6.b.a) {
            if (this.f37986f.e(workGenerationalIdA)) {
                return;
            }
            w.e().a(f37981o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            y yVarF = this.f37986f.f(workGenerationalIdA);
            this.f37994n.c(yVarF);
            this.f37988h.d(yVarF);
            return;
        }
        w.e().a(f37981o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        y yVarC = this.f37986f.c(workGenerationalIdA);
        if (yVarC != null) {
            this.f37994n.b(yVarC);
            this.f37988h.c(yVarC, ((b6.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    public final void f() {
        this.f37991k = Boolean.valueOf(x.b(this.f37982a, this.f37989i));
    }

    public final void g() {
        if (this.f37984d) {
            return;
        }
        this.f37987g.e(this);
        this.f37984d = true;
    }

    public final void h(WorkGenerationalId workGenerationalId) {
        d2 d2VarRemove;
        synchronized (this.f37985e) {
            d2VarRemove = this.b.remove(workGenerationalId);
        }
        if (d2VarRemove != null) {
            w.e().a(f37981o, "Stopping tracking for " + workGenerationalId);
            d2VarRemove.c(null);
        }
    }

    public final long i(f6.j0 j0Var) {
        long jMax;
        synchronized (this.f37985e) {
            try {
                WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
                C0686b c0686b = this.f37990j.get(workGenerationalIdA);
                if (c0686b == null) {
                    c0686b = new C0686b(j0Var.runAttemptCount, this.f37989i.getClock().a());
                    this.f37990j.put(workGenerationalIdA, c0686b);
                }
                jMax = c0686b.b + (((long) Math.max((j0Var.runAttemptCount - c0686b.f37995a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
