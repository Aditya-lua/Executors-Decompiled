package p296n0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p140g0.C5931r1;
import p140g0.InterfaceC5905l;
import p155h0.InterfaceC6259a;
import p301n5.C8884a;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8756g1 implements InterfaceC6259a.a {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f31821a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final Object f31822b;

    /* JADX INFO: renamed from: c */
    public int f31823c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6259a f31824d;

    /* JADX INFO: renamed from: e */
    public final Map<InterfaceC5905l, a> f31825e;

    /* JADX INFO: renamed from: f */
    public int f31826f;

    /* JADX INFO: renamed from: n0.g1$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC8804p0.a f31827a;

        /* JADX INFO: renamed from: b */
        public final Executor f31828b;

        /* JADX INFO: renamed from: c */
        public final b f31829c;

        /* JADX INFO: renamed from: d */
        public final c f31830d;

        public a(InterfaceC8804p0.a aVar, Executor executor, b bVar, c cVar) {
            this.f31827a = aVar;
            this.f31828b = executor;
            this.f31829c = bVar;
            this.f31830d = cVar;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC8804p0.a m35117a() {
            return this.f31827a;
        }

        /* JADX INFO: renamed from: b */
        public void m35118b() {
            try {
                Executor executor = this.f31828b;
                final b bVar = this.f31829c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: n0.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.mo35121a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m35119c() {
            try {
                Executor executor = this.f31828b;
                final c cVar = this.f31830d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: n0.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.mo35122a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        /* JADX INFO: renamed from: d */
        public InterfaceC8804p0.a m35120d(InterfaceC8804p0.a aVar) {
            InterfaceC8804p0.a aVar2 = this.f31827a;
            this.f31827a = aVar;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: n0.g1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo35121a();
    }

    /* JADX INFO: renamed from: n0.g1$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo35122a();
    }

    public C8756g1(InterfaceC6259a interfaceC6259a, int i10) {
        Object obj = new Object();
        this.f31822b = obj;
        this.f31825e = new HashMap();
        this.f31823c = i10;
        synchronized (obj) {
            this.f31824d = interfaceC6259a;
            this.f31826f = this.f31823c;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m35106d(InterfaceC8804p0.a aVar) {
        return aVar != null && aVar.m35369b();
    }

    /* JADX INFO: renamed from: h */
    public static void m35107h(InterfaceC5905l interfaceC5905l, InterfaceC8804p0.a aVar) {
        if (C8884a.m35751h()) {
            C8884a.m35753j("CX:State[" + interfaceC5905l + "]", aVar.ordinal());
        }
    }

    @Override // p155h0.InterfaceC6259a.a
    /* JADX INFO: renamed from: a */
    public void mo27488a(int i10, int i11) {
        synchronized (this.f31822b) {
            boolean z10 = true;
            this.f31823c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                m35111f();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m35108b(String str) {
        for (InterfaceC5905l interfaceC5905l : this.f31825e.keySet()) {
            if (str.equals(((InterfaceC8799o0) interfaceC5905l.mo22074d()).mo6750e())) {
                return this.f31825e.get(interfaceC5905l);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m35109c() {
        synchronized (this.f31822b) {
            try {
                Iterator<Map.Entry<InterfaceC5905l, a>> it = this.f31825e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().m35117a() == InterfaceC8804p0.a.CLOSING) {
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
    /* JADX INFO: renamed from: e */
    public void m35110e(InterfaceC5905l interfaceC5905l, InterfaceC8804p0.a aVar, boolean z10) {
        a aVarM35108b;
        synchronized (this.f31822b) {
            try {
                int i10 = this.f31826f;
                if ((aVar == InterfaceC8804p0.a.RELEASED ? m35115k(interfaceC5905l) : m35116l(interfaceC5905l, aVar)) == aVar) {
                    return;
                }
                HashMap map = null;
                if (this.f31824d.mo23116e() == 2 && aVar == InterfaceC8804p0.a.CONFIGURED) {
                    String strMo23115d = this.f31824d.mo23115d(((InterfaceC8799o0) interfaceC5905l.mo22074d()).mo6750e());
                    if (strMo23115d != null) {
                        aVarM35108b = m35108b(strMo23115d);
                    } else {
                        aVarM35108b = null;
                    }
                } else {
                    aVarM35108b = null;
                }
                if (i10 < 1 && this.f31826f > 0) {
                    map = new HashMap();
                    for (Map.Entry<InterfaceC5905l, a> entry : this.f31825e.entrySet()) {
                        if (entry.getValue().m35117a() == InterfaceC8804p0.a.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar == InterfaceC8804p0.a.PENDING_OPEN && this.f31826f > 0) {
                    map = new HashMap();
                    map.put(interfaceC5905l, this.f31825e.get(interfaceC5905l));
                }
                if (map != null && !z10) {
                    map.remove(interfaceC5905l);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).m35119c();
                    }
                }
                if (aVarM35108b != null) {
                    aVarM35108b.m35118b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m35111f() {
        if (C5931r1.m26566f("CameraStateRegistry")) {
            this.f31821a.setLength(0);
            this.f31821a.append("Recalculating open cameras:\n");
            this.f31821a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f31821a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<InterfaceC5905l, a> entry : this.f31825e.entrySet()) {
            if (C5931r1.m26566f("CameraStateRegistry")) {
                this.f31821a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m35117a() != null ? entry.getValue().m35117a().toString() : "UNKNOWN"));
            }
            if (m35106d(entry.getValue().m35117a())) {
                i10++;
            }
        }
        if (C5931r1.m26566f("CameraStateRegistry")) {
            this.f31821a.append("-------------------------------------------------------------------\n");
            this.f31821a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f31823c)));
            C5931r1.m26561a("CameraStateRegistry", this.f31821a.toString());
        }
        this.f31826f = Math.max(this.f31823c - i10, 0);
    }

    /* JADX INFO: renamed from: g */
    public void m35112g(InterfaceC5905l interfaceC5905l, Executor executor, b bVar, c cVar) {
        synchronized (this.f31822b) {
            C12637g.m47078j(!this.f31825e.containsKey(interfaceC5905l), "Camera is already registered: " + interfaceC5905l);
            this.f31825e.put(interfaceC5905l, new a(null, executor, bVar, cVar));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m35113i(InterfaceC5905l interfaceC5905l) {
        boolean z10;
        synchronized (this.f31822b) {
            try {
                a aVar = (a) C12637g.m47076h(this.f31825e.get(interfaceC5905l), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (C5931r1.m26566f("CameraStateRegistry")) {
                    this.f31821a.setLength(0);
                    this.f31821a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC5905l, Integer.valueOf(this.f31826f), Boolean.valueOf(m35106d(aVar.m35117a())), aVar.m35117a()));
                }
                if (this.f31826f > 0 || m35106d(aVar.m35117a())) {
                    InterfaceC8804p0.a aVar2 = InterfaceC8804p0.a.OPENING;
                    aVar.m35120d(aVar2);
                    m35107h(interfaceC5905l, aVar2);
                    z10 = true;
                }
                if (C5931r1.m26566f("CameraStateRegistry")) {
                    this.f31821a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    C5931r1.m26561a("CameraStateRegistry", this.f31821a.toString());
                }
                if (z10) {
                    m35111f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: j */
    public boolean m35114j(String str, String str2) {
        synchronized (this.f31822b) {
            try {
                boolean z10 = true;
                if (this.f31824d.mo23116e() != 2) {
                    return true;
                }
                a aVarM35108b = m35108b(str);
                InterfaceC8804p0.a aVarM35117a = aVarM35108b != null ? aVarM35108b.m35117a() : null;
                a aVarM35108b2 = str2 != null ? m35108b(str2) : null;
                InterfaceC8804p0.a aVarM35117a2 = aVarM35108b2 != null ? aVarM35108b2.m35117a() : null;
                InterfaceC8804p0.a aVar = InterfaceC8804p0.a.OPEN;
                boolean z11 = aVar.equals(aVarM35117a) || InterfaceC8804p0.a.CONFIGURED.equals(aVarM35117a);
                boolean z12 = aVar.equals(aVarM35117a2) || InterfaceC8804p0.a.CONFIGURED.equals(aVarM35117a2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC8804p0.a m35115k(InterfaceC5905l interfaceC5905l) {
        a aVarRemove = this.f31825e.remove(interfaceC5905l);
        if (aVarRemove == null) {
            return null;
        }
        m35111f();
        return aVarRemove.m35117a();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC8804p0.a m35116l(InterfaceC5905l interfaceC5905l, InterfaceC8804p0.a aVar) {
        InterfaceC8804p0.a aVarM35120d = ((a) C12637g.m47076h(this.f31825e.get(interfaceC5905l), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m35120d(aVar);
        InterfaceC8804p0.a aVar2 = InterfaceC8804p0.a.OPENING;
        if (aVar == aVar2) {
            C12637g.m47078j(m35106d(aVar) || aVarM35120d == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarM35120d != aVar) {
            m35107h(interfaceC5905l, aVar);
            m35111f();
        }
        return aVarM35120d;
    }
}
