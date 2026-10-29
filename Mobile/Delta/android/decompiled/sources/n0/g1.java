package n0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements h0.a.InterfaceC0334a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f24643a = new StringBuilder();
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.a f24645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<g0.l, a> f24646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24647f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p0.a f24648a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f24649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f24650d;

        public a(p0.a aVar, Executor executor, b bVar, c cVar) {
            this.f24648a = aVar;
            this.b = executor;
            this.f24649c = bVar;
            this.f24650d = cVar;
        }

        public p0.a a() {
            return this.f24648a;
        }

        public void b() {
            try {
                Executor executor = this.b;
                final b bVar = this.f24649c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: n0.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        public void c() {
            try {
                Executor executor = this.b;
                final c cVar = this.f24650d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: n0.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        public p0.a d(p0.a aVar) {
            p0.a aVar2 = this.f24648a;
            this.f24648a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public g1(h0.a aVar, int i10) {
        Object obj = new Object();
        this.b = obj;
        this.f24646e = new HashMap();
        this.f24644c = i10;
        synchronized (obj) {
            this.f24645d = aVar;
            this.f24647f = this.f24644c;
        }
    }

    public static boolean d(p0.a aVar) {
        return aVar != null && aVar.b();
    }

    public static void h(g0.l lVar, p0.a aVar) {
        if (n5.a.h()) {
            n5.a.j("CX:State[" + lVar + "]", aVar.ordinal());
        }
    }

    @Override // h0.a.InterfaceC0334a
    public void a(int i10, int i11) {
        synchronized (this.b) {
            boolean z10 = true;
            this.f24644c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public final a b(String str) {
        for (g0.l lVar : this.f24646e.keySet()) {
            if (str.equals(((o0) lVar.d()).e())) {
                return this.f24646e.get(lVar);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.b) {
            try {
                Iterator<Map.Entry<g0.l, a>> it = this.f24646e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == p0.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public void e(g0.l lVar, p0.a aVar, boolean z10) {
        a aVarB;
        synchronized (this.b) {
            try {
                int i10 = this.f24647f;
                if ((aVar == p0.a.RELEASED ? k(lVar) : l(lVar, aVar)) == aVar) {
                    return;
                }
                HashMap map = null;
                if (this.f24645d.e() == 2 && aVar == p0.a.CONFIGURED) {
                    String strD = this.f24645d.d(((o0) lVar.d()).e());
                    if (strD != null) {
                        aVarB = b(strD);
                    } else {
                        aVarB = null;
                    }
                } else {
                    aVarB = null;
                }
                if (i10 < 1 && this.f24647f > 0) {
                    map = new HashMap();
                    for (Map.Entry<g0.l, a> entry : this.f24646e.entrySet()) {
                        if (entry.getValue().a() == p0.a.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar == p0.a.PENDING_OPEN && this.f24647f > 0) {
                    map = new HashMap();
                    map.put(lVar, this.f24646e.get(lVar));
                }
                if (map != null && !z10) {
                    map.remove(lVar);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).c();
                    }
                }
                if (aVarB != null) {
                    aVarB.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        if (g0.r1.f("CameraStateRegistry")) {
            this.f24643a.setLength(0);
            this.f24643a.append("Recalculating open cameras:\n");
            this.f24643a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f24643a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<g0.l, a> entry : this.f24646e.entrySet()) {
            if (g0.r1.f("CameraStateRegistry")) {
                this.f24643a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i10++;
            }
        }
        if (g0.r1.f("CameraStateRegistry")) {
            this.f24643a.append("-------------------------------------------------------------------\n");
            this.f24643a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f24644c)));
            g0.r1.a("CameraStateRegistry", this.f24643a.toString());
        }
        this.f24647f = Math.max(this.f24644c - i10, 0);
    }

    public void g(g0.l lVar, Executor executor, b bVar, c cVar) {
        synchronized (this.b) {
            x2.g.j(!this.f24646e.containsKey(lVar), "Camera is already registered: " + lVar);
            this.f24646e.put(lVar, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(g0.l lVar) {
        boolean z10;
        synchronized (this.b) {
            try {
                a aVar = (a) x2.g.h(this.f24646e.get(lVar), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (g0.r1.f("CameraStateRegistry")) {
                    this.f24643a.setLength(0);
                    this.f24643a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", lVar, Integer.valueOf(this.f24647f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f24647f > 0 || d(aVar.a())) {
                    p0.a aVar2 = p0.a.OPENING;
                    aVar.d(aVar2);
                    h(lVar, aVar2);
                    z10 = true;
                }
                if (g0.r1.f("CameraStateRegistry")) {
                    this.f24643a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    g0.r1.a("CameraStateRegistry", this.f24643a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean j(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z10 = true;
                if (this.f24645d.e() != 2) {
                    return true;
                }
                a aVarB = b(str);
                p0.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                p0.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                p0.a aVar = p0.a.OPEN;
                boolean z11 = aVar.equals(aVarA) || p0.a.CONFIGURED.equals(aVarA);
                boolean z12 = aVar.equals(aVarA2) || p0.a.CONFIGURED.equals(aVarA2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p0.a k(g0.l lVar) {
        a aVarRemove = this.f24646e.remove(lVar);
        if (aVarRemove == null) {
            return null;
        }
        f();
        return aVarRemove.a();
    }

    public final p0.a l(g0.l lVar, p0.a aVar) {
        p0.a aVarD = ((a) x2.g.h(this.f24646e.get(lVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        p0.a aVar2 = p0.a.OPENING;
        if (aVar == aVar2) {
            x2.g.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(lVar, aVar);
            f();
        }
        return aVarD;
    }
}
