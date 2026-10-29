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
    public static final String f35703l = x5.w.i("Processor");
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f35705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h6.b f35706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkDatabase f35707e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, q1> f35709g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, q1> f35708f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set<String> f35711i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<e> f35712j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f35704a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f35713k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, Set<y>> f35710h = new HashMap();

    public s(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase) {
        this.b = context;
        this.f35705c = aVar;
        this.f35706d = bVar;
        this.f35707e = workDatabase;
    }

    public static /* synthetic */ f6.j0 b(s sVar, ArrayList arrayList, String str) {
        arrayList.addAll(sVar.f35707e.d0().a(str));
        return sVar.f35707e.c0().k(str);
    }

    public static /* synthetic */ void c(s sVar, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (sVar.f35713k) {
            try {
                Iterator<e> it = sVar.f35712j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(s sVar, me.x xVar, q1 q1Var) {
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
            x5.w.e().a(f35703l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        q1Var.p(i10);
        x5.w.e().a(f35703l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // e6.a
    public void a(String str, x5.k kVar) {
        synchronized (this.f35713k) {
            try {
                x5.w.e().f(f35703l, "Moving WorkSpec (" + str + ") to the foreground");
                q1 q1VarRemove = this.f35709g.remove(str);
                if (q1VarRemove != null) {
                    if (this.f35704a == null) {
                        PowerManager.WakeLock wakeLockA = g6.a0.a(this.b, "ProcessorForegroundLck");
                        this.f35704a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f35708f.put(str, q1VarRemove);
                    l2.b.q(this.b, androidx.work.impl.foreground.a.f(this.b, q1VarRemove.m(), kVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(e eVar) {
        synchronized (this.f35713k) {
            this.f35712j.add(eVar);
        }
    }

    public final q1 f(String str) {
        q1 q1VarRemove = this.f35708f.remove(str);
        boolean z10 = q1VarRemove != null;
        if (!z10) {
            q1VarRemove = this.f35709g.remove(str);
        }
        this.f35710h.remove(str);
        if (z10) {
            q();
        }
        return q1VarRemove;
    }

    public f6.j0 g(String str) {
        synchronized (this.f35713k) {
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
        q1 q1Var = this.f35708f.get(str);
        return q1Var == null ? this.f35709g.get(str) : q1Var;
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f35713k) {
            zContains = this.f35711i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f35713k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public final void l(q1 q1Var, boolean z10) {
        synchronized (this.f35713k) {
            try {
                WorkGenerationalId workGenerationalIdM = q1Var.m();
                String workSpecId = workGenerationalIdM.getWorkSpecId();
                if (h(workSpecId) == q1Var) {
                    f(workSpecId);
                }
                x5.w.e().a(f35703l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<e> it = this.f35712j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalIdM, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(e eVar) {
        synchronized (this.f35713k) {
            this.f35712j.remove(eVar);
        }
    }

    public final void n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f35706d.a().execute(new Runnable() { // from class: y5.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(this.f35700a, workGenerationalId, z10);
            }
        });
    }

    public boolean o(y yVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = yVar.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        f6.j0 j0Var = (f6.j0) this.f35707e.P(new Callable() { // from class: y5.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.b(this.f35657a, arrayList, workSpecId);
            }
        });
        if (j0Var == null) {
            x5.w.e().k(f35703l, "Didn't find WorkSpec for id " + id2);
            n(id2, false);
            return false;
        }
        synchronized (this.f35713k) {
            try {
                try {
                    try {
                        if (k(workSpecId)) {
                            Set<y> set = this.f35710h.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(yVar);
                                x5.w.e().a(f35703l, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                n(id2, false);
                            }
                            return false;
                        }
                        if (j0Var.getGeneration() != id2.getGeneration()) {
                            n(id2, false);
                            return false;
                        }
                        final q1 q1VarA = new q1.a(this.b, this.f35705c, this.f35706d, this, this.f35707e, j0Var, arrayList).k(aVar).a();
                        final me.x<Boolean> xVarR = q1VarA.r();
                        xVarR.a(new Runnable() { // from class: y5.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                s.d(this.f35661a, xVarR, q1VarA);
                            }
                        }, this.f35706d.a());
                        this.f35709g.put(workSpecId, q1VarA);
                        HashSet hashSet = new HashSet();
                        hashSet.add(yVar);
                        this.f35710h.put(workSpecId, hashSet);
                        x5.w.e().a(f35703l, getClass().getSimpleName() + ": processing " + id2);
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
        synchronized (this.f35713k) {
            x5.w.e().a(f35703l, "Processor cancelling " + str);
            this.f35711i.add(str);
            q1VarF = f(str);
        }
        return i(str, q1VarF, i10);
    }

    public final void q() {
        synchronized (this.f35713k) {
            try {
                if (this.f35708f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th2) {
                        x5.w.e().d(f35703l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f35704a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f35704a = null;
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
        synchronized (this.f35713k) {
            q1VarF = f(workSpecId);
        }
        return i(workSpecId, q1VarF, i10);
    }

    public boolean s(y yVar, int i10) {
        String workSpecId = yVar.getId().getWorkSpecId();
        synchronized (this.f35713k) {
            try {
                if (this.f35708f.get(workSpecId) == null) {
                    Set<y> set = this.f35710h.get(workSpecId);
                    if (set != null && set.contains(yVar)) {
                        return i(workSpecId, f(workSpecId), i10);
                    }
                    return false;
                }
                x5.w.e().a(f35703l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
