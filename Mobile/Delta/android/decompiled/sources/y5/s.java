package y5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f6.WorkGenerationalId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class s implements e6.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f36560l = x5.w.i("Processor");
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f36562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h6.b f36563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkDatabase f36564e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, q1> f36566g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, q1> f36565f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set<String> f36568i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<e> f36569j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f36561a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f36570k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, Set<y>> f36567h = new HashMap();

    public s(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase) {
        this.b = context;
        this.f36562c = aVar;
        this.f36563d = bVar;
        this.f36564e = workDatabase;
    }

    public static /* synthetic */ f6.j0 b(s sVar, ArrayList arrayList, String str) {
        arrayList.addAll(sVar.f36564e.d0().a(str));
        return sVar.f36564e.c0().k(str);
    }

    public static /* synthetic */ void c(s sVar, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (sVar.f36570k) {
            try {
                Iterator<e> it = sVar.f36569j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(s sVar, ne.x xVar, q1 q1Var) {
        boolean zBooleanValue;
        sVar.getClass();
        try {
            zBooleanValue = ((Boolean) xVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        sVar.l(q1Var, zBooleanValue);
    }

    public static boolean i(String str, q1 q1Var, int i10) {
        if (q1Var == null) {
            x5.w.e().a(f36560l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        q1Var.p(i10);
        x5.w.e().a(f36560l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // e6.a
    public void a(String str, x5.k kVar) {
        synchronized (this.f36570k) {
            try {
                x5.w.e().f(f36560l, "Moving WorkSpec (" + str + ") to the foreground");
                q1 q1VarRemove = this.f36566g.remove(str);
                if (q1VarRemove != null) {
                    if (this.f36561a == null) {
                        PowerManager.WakeLock wakeLockA = g6.a0.a(this.b, "ProcessorForegroundLck");
                        this.f36561a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f36565f.put(str, q1VarRemove);
                    l2.b.q(this.b, androidx.work.impl.foreground.a.f(this.b, q1VarRemove.m(), kVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(e eVar) {
        synchronized (this.f36570k) {
            this.f36569j.add(eVar);
        }
    }

    public final q1 f(String str) {
        q1 q1VarRemove = this.f36565f.remove(str);
        boolean z10 = q1VarRemove != null;
        if (!z10) {
            q1VarRemove = this.f36566g.remove(str);
        }
        this.f36567h.remove(str);
        if (z10) {
            q();
        }
        return q1VarRemove;
    }

    public f6.j0 g(String str) {
        synchronized (this.f36570k) {
            try {
                q1 q1VarH = h(str);
                if (q1VarH == null) {
                    return null;
                }
                return q1VarH.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q1 h(String str) {
        q1 q1Var = this.f36565f.get(str);
        return q1Var == null ? this.f36566g.get(str) : q1Var;
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f36570k) {
            zContains = this.f36568i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f36570k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public final void l(q1 q1Var, boolean z10) {
        synchronized (this.f36570k) {
            try {
                WorkGenerationalId workGenerationalIdM = q1Var.m();
                String workSpecId = workGenerationalIdM.getWorkSpecId();
                if (h(workSpecId) == q1Var) {
                    f(workSpecId);
                }
                x5.w.e().a(f36560l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<e> it = this.f36569j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalIdM, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(e eVar) {
        synchronized (this.f36570k) {
            this.f36569j.remove(eVar);
        }
    }

    public final void n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f36563d.a().execute(new Runnable() { // from class: y5.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(this.f36557a, workGenerationalId, z10);
            }
        });
    }

    public boolean o(y yVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = yVar.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        f6.j0 j0Var = (f6.j0) this.f36564e.P(new Callable() { // from class: y5.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.b(this.f36514a, arrayList, workSpecId);
            }
        });
        if (j0Var == null) {
            x5.w.e().k(f36560l, "Didn't find WorkSpec for id " + id2);
            n(id2, false);
            return false;
        }
        synchronized (this.f36570k) {
            try {
                try {
                    try {
                        if (k(workSpecId)) {
                            Set<y> set = this.f36567h.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(yVar);
                                x5.w.e().a(f36560l, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                n(id2, false);
                            }
                            return false;
                        }
                        if (j0Var.getGeneration() != id2.getGeneration()) {
                            n(id2, false);
                            return false;
                        }
                        final q1 q1VarA = new q1.a(this.b, this.f36562c, this.f36563d, this, this.f36564e, j0Var, arrayList).k(aVar).a();
                        final ne.x<Boolean> xVarR = q1VarA.r();
                        xVarR.a(new Runnable() { // from class: y5.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                s.d(this.f36518a, xVarR, q1VarA);
                            }
                        }, this.f36563d.a());
                        this.f36566g.put(workSpecId, q1VarA);
                        HashSet hashSet = new HashSet();
                        hashSet.add(yVar);
                        this.f36567h.put(workSpecId, hashSet);
                        x5.w.e().a(f36560l, getClass().getSimpleName() + ": processing " + id2);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
            }
            throw th2;
        }
    }

    public boolean p(String str, int i10) {
        q1 q1VarF;
        synchronized (this.f36570k) {
            x5.w.e().a(f36560l, "Processor cancelling " + str);
            this.f36568i.add(str);
            q1VarF = f(str);
        }
        return i(str, q1VarF, i10);
    }

    public final void q() {
        synchronized (this.f36570k) {
            try {
                if (this.f36565f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th2) {
                        x5.w.e().d(f36560l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f36561a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f36561a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean r(y yVar, int i10) {
        q1 q1VarF;
        String workSpecId = yVar.getId().getWorkSpecId();
        synchronized (this.f36570k) {
            q1VarF = f(workSpecId);
        }
        return i(workSpecId, q1VarF, i10);
    }

    public boolean s(y yVar, int i10) {
        String workSpecId = yVar.getId().getWorkSpecId();
        synchronized (this.f36570k) {
            try {
                if (this.f36565f.get(workSpecId) == null) {
                    Set<y> set = this.f36567h.get(workSpecId);
                    if (set != null && set.contains(yVar)) {
                        return i(workSpecId, f(workSpecId), i10);
                    }
                    return false;
                }
                x5.w.e().a(f36560l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
