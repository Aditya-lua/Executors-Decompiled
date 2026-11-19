package n0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24926a = new Object();
    public final Map<String, p0> b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<p0> f24927c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pe.x<Void> f24928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Void> f24929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f24930f;

    public static /* synthetic */ void i(d1 d1Var, p0 p0Var) {
        synchronized (d1Var.f24926a) {
            try {
                d1Var.f24927c.remove(p0Var);
                if (d1Var.f24927c.isEmpty()) {
                    x2.g.g(d1Var.f24929e);
                    d1Var.f24929e.c(null);
                    d1Var.f24929e = null;
                    d1Var.f24928d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object j(d1 d1Var, y1.c.a aVar) {
        synchronized (d1Var.f24926a) {
            d1Var.f24929e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // n0.l2
    public void f(List<String> list) throws i1 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f24926a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f24930f.b(str));
            }
            synchronized (this.f24926a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (p0) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p0 p0Var = (p0) obj;
                        if (p0Var != null) {
                            p0Var.p();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.x e10) {
            throw new i1("Failed to create CameraInternal", e10);
        }
    }

    public pe.x<Void> k() {
        synchronized (this.f24926a) {
            try {
                if (this.b.isEmpty()) {
                    pe.x<Void> xVarP = this.f24928d;
                    if (xVarP == null) {
                        xVarP = r0.n.p(null);
                    }
                    return xVarP;
                }
                pe.x<Void> xVarA = this.f24928d;
                if (xVarA == null) {
                    xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: n0.b1
                        @Override // y1.c.InterfaceC0761c
                        public final Object a(y1.c.a aVar) {
                            return d1.j(this.f24908a, aVar);
                        }
                    });
                    this.f24928d = xVarA;
                }
                this.f24927c.addAll(this.b.values());
                for (final p0 p0Var : this.b.values()) {
                    p0Var.a().a(new Runnable() { // from class: n0.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d1.i(this.f24919a, p0Var);
                        }
                    }, q0.c.b());
                }
                this.b.clear();
                return xVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p0 l(String str) {
        p0 p0Var;
        synchronized (this.f24926a) {
            try {
                p0Var = this.b.get(str);
                if (p0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0Var;
    }

    public LinkedHashSet<p0> m() {
        LinkedHashSet<p0> linkedHashSet;
        synchronized (this.f24926a) {
            linkedHashSet = new LinkedHashSet<>(this.b.values());
        }
        return linkedHashSet;
    }

    public void n(n0 n0Var) {
        this.f24930f = n0Var;
        synchronized (this.f24926a) {
            try {
                for (String str : n0Var.d()) {
                    g0.r1.a("CameraRepository", "Added camera: " + str);
                    p0 p0VarPut = this.b.put(str, n0Var.b(str));
                    if (p0VarPut != null) {
                        p0VarPut.a();
                    }
                }
            } catch (g0.x e10) {
                throw new g0.p1(e10);
            }
        }
    }
}
