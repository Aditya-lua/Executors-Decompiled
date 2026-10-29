package p567y5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1115a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1126a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import ne.InterfaceFutureC9440x;
import p095e6.InterfaceC4845a;
import p120f6.C5390j0;
import p120f6.WorkGenerationalId;
import p146g6.C6014a0;
import p161h6.InterfaceC6292b;
import p261l2.C7975b;
import p536x5.AbstractC12732w;
import p536x5.C12708k;

/* JADX INFO: renamed from: y5.s */
/* JADX INFO: loaded from: classes.dex */
public class C13085s implements InterfaceC4845a {

    /* JADX INFO: renamed from: l */
    public static final String f46296l = AbstractC12732w.m47443i("Processor");

    /* JADX INFO: renamed from: b */
    public Context f46298b;

    /* JADX INFO: renamed from: c */
    public C1115a f46299c;

    /* JADX INFO: renamed from: d */
    public InterfaceC6292b f46300d;

    /* JADX INFO: renamed from: e */
    public WorkDatabase f46301e;

    /* JADX INFO: renamed from: g */
    public Map<String, C13081q1> f46303g = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, C13081q1> f46302f = new HashMap();

    /* JADX INFO: renamed from: i */
    public Set<String> f46305i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC13043e> f46306j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f46297a = null;

    /* JADX INFO: renamed from: k */
    public final Object f46307k = new Object();

    /* JADX INFO: renamed from: h */
    public Map<String, Set<C13098y>> f46304h = new HashMap();

    public C13085s(Context context, C1115a c1115a, InterfaceC6292b interfaceC6292b, WorkDatabase workDatabase) {
        this.f46298b = context;
        this.f46299c = c1115a;
        this.f46300d = interfaceC6292b;
        this.f46301e = workDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5390j0 m48659b(C13085s c13085s, ArrayList arrayList, String str) {
        arrayList.addAll(c13085s.f46301e.mo6351d0().mo24880a(str));
        return c13085s.f46301e.mo6350c0().mo24787k(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48660c(C13085s c13085s, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (c13085s.f46307k) {
            try {
                Iterator<InterfaceC13043e> it = c13085s.f46306j.iterator();
                while (it.hasNext()) {
                    it.next().mo6396d(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48661d(C13085s c13085s, InterfaceFutureC9440x interfaceFutureC9440x, C13081q1 c13081q1) {
        boolean zBooleanValue;
        c13085s.getClass();
        try {
            zBooleanValue = ((Boolean) interfaceFutureC9440x.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c13085s.m48669l(c13081q1, zBooleanValue);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m48662i(String str, C13081q1 c13081q1, int i10) {
        if (c13081q1 == null) {
            AbstractC12732w.m47441e().mo47444a(f46296l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c13081q1.m48634p(i10);
        AbstractC12732w.m47441e().mo47444a(f46296l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // p095e6.InterfaceC4845a
    /* JADX INFO: renamed from: a */
    public void mo23403a(String str, C12708k c12708k) {
        synchronized (this.f46307k) {
            try {
                AbstractC12732w.m47441e().mo47448f(f46296l, "Moving WorkSpec (" + str + ") to the foreground");
                C13081q1 c13081q1Remove = this.f46303g.remove(str);
                if (c13081q1Remove != null) {
                    if (this.f46297a == null) {
                        PowerManager.WakeLock wakeLockM26796a = C6014a0.m26796a(this.f46298b, "ProcessorForegroundLck");
                        this.f46297a = wakeLockM26796a;
                        wakeLockM26796a.acquire();
                    }
                    this.f46302f.put(str, c13081q1Remove);
                    C7975b.m33019q(this.f46298b, C1126a.m6412f(this.f46298b, c13081q1Remove.m48631m(), c12708k));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m48663e(InterfaceC13043e interfaceC13043e) {
        synchronized (this.f46307k) {
            this.f46306j.add(interfaceC13043e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C13081q1 m48664f(String str) {
        C13081q1 c13081q1Remove = this.f46302f.remove(str);
        boolean z10 = c13081q1Remove != null;
        if (!z10) {
            c13081q1Remove = this.f46303g.remove(str);
        }
        this.f46304h.remove(str);
        if (z10) {
            m48674q();
        }
        return c13081q1Remove;
    }

    /* JADX INFO: renamed from: g */
    public C5390j0 m48665g(String str) {
        synchronized (this.f46307k) {
            try {
                C13081q1 c13081q1M48666h = m48666h(str);
                if (c13081q1M48666h == null) {
                    return null;
                }
                return c13081q1M48666h.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final C13081q1 m48666h(String str) {
        C13081q1 c13081q1 = this.f46302f.get(str);
        return c13081q1 == null ? this.f46303g.get(str) : c13081q1;
    }

    /* JADX INFO: renamed from: j */
    public boolean m48667j(String str) {
        boolean zContains;
        synchronized (this.f46307k) {
            zContains = this.f46305i.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: k */
    public boolean m48668k(String str) {
        boolean z10;
        synchronized (this.f46307k) {
            z10 = m48666h(str) != null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: l */
    public final void m48669l(C13081q1 c13081q1, boolean z10) {
        synchronized (this.f46307k) {
            try {
                WorkGenerationalId workGenerationalIdM48631m = c13081q1.m48631m();
                String workSpecId = workGenerationalIdM48631m.getWorkSpecId();
                if (m48666h(workSpecId) == c13081q1) {
                    m48664f(workSpecId);
                }
                AbstractC12732w.m47441e().mo47444a(f46296l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<InterfaceC13043e> it = this.f46306j.iterator();
                while (it.hasNext()) {
                    it.next().mo6396d(workGenerationalIdM48631m, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m48670m(InterfaceC13043e interfaceC13043e) {
        synchronized (this.f46307k) {
            this.f46306j.remove(interfaceC13043e);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m48671n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f46300d.mo27570a().execute(new Runnable() { // from class: y5.r
            @Override // java.lang.Runnable
            public final void run() {
                C13085s.m48660c(this.f46291a, workGenerationalId, z10);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public boolean m48672o(C13098y c13098y, WorkerParameters.C1114a c1114a) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = c13098y.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        C5390j0 c5390j0 = (C5390j0) this.f46301e.m47264P(new Callable() { // from class: y5.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C13085s.m48659b(this.f46244a, arrayList, workSpecId);
            }
        });
        if (c5390j0 == null) {
            AbstractC12732w.m47441e().mo47451k(f46296l, "Didn't find WorkSpec for id " + id2);
            m48671n(id2, false);
            return false;
        }
        synchronized (this.f46307k) {
            try {
                try {
                    try {
                        if (m48668k(workSpecId)) {
                            Set<C13098y> set = this.f46304h.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(c13098y);
                                AbstractC12732w.m47441e().mo47444a(f46296l, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                m48671n(id2, false);
                            }
                            return false;
                        }
                        if (c5390j0.getGeneration() != id2.getGeneration()) {
                            m48671n(id2, false);
                            return false;
                        }
                        final C13081q1 c13081q1M48643a = new C13081q1.a(this.f46298b, this.f46299c, this.f46300d, this, this.f46301e, c5390j0, arrayList).m48653k(c1114a).m48643a();
                        final InterfaceFutureC9440x<Boolean> interfaceFutureC9440xM48636r = c13081q1M48643a.m48636r();
                        interfaceFutureC9440xM48636r.mo37173a(new Runnable() { // from class: y5.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13085s.m48661d(this.f46249a, interfaceFutureC9440xM48636r, c13081q1M48643a);
                            }
                        }, this.f46300d.mo27570a());
                        this.f46303g.put(workSpecId, c13081q1M48643a);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c13098y);
                        this.f46304h.put(workSpecId, hashSet);
                        AbstractC12732w.m47441e().mo47444a(f46296l, getClass().getSimpleName() + ": processing " + id2);
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

    /* JADX INFO: renamed from: p */
    public boolean m48673p(String str, int i10) {
        C13081q1 c13081q1M48664f;
        synchronized (this.f46307k) {
            AbstractC12732w.m47441e().mo47444a(f46296l, "Processor cancelling " + str);
            this.f46305i.add(str);
            c13081q1M48664f = m48664f(str);
        }
        return m48662i(str, c13081q1M48664f, i10);
    }

    /* JADX INFO: renamed from: q */
    public final void m48674q() {
        synchronized (this.f46307k) {
            try {
                if (this.f46302f.isEmpty()) {
                    try {
                        this.f46298b.startService(C1126a.m6413g(this.f46298b));
                    } catch (Throwable th2) {
                        AbstractC12732w.m47441e().mo47447d(f46296l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f46297a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f46297a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m48675r(C13098y c13098y, int i10) {
        C13081q1 c13081q1M48664f;
        String workSpecId = c13098y.getId().getWorkSpecId();
        synchronized (this.f46307k) {
            c13081q1M48664f = m48664f(workSpecId);
        }
        return m48662i(workSpecId, c13081q1M48664f, i10);
    }

    /* JADX INFO: renamed from: s */
    public boolean m48676s(C13098y c13098y, int i10) {
        String workSpecId = c13098y.getId().getWorkSpecId();
        synchronized (this.f46307k) {
            try {
                if (this.f46302f.get(workSpecId) == null) {
                    Set<C13098y> set = this.f46304h.get(workSpecId);
                    if (set != null && set.contains(c13098y)) {
                        return m48662i(workSpecId, m48664f(workSpecId), i10);
                    }
                    return false;
                }
                AbstractC12732w.m47441e().mo47444a(f46296l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
