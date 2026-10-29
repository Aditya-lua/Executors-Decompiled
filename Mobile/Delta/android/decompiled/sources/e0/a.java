package e0;

import a0.f;
import a0.p0;
import f0.h;
import g0.p1;
import g0.r1;
import g0.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n0.i1;
import z.x2;

/* JADX INFO: loaded from: classes.dex */
public class a implements h0.a {
    public final p0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14965a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f14967d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<Set<String>> f14968e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<t> f14969f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14970g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<h0.a.InterfaceC0334a> f14966c = new ArrayList();

    public a(p0 p0Var) {
        this.b = p0Var;
        try {
            f(Arrays.asList(p0Var.d()));
        } catch (f | i1 e10) {
            r1.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e10);
        }
    }

    @Override // h0.a
    public void c(h0.a.InterfaceC0334a interfaceC0334a) {
        synchronized (this.f14965a) {
            this.f14966c.add(interfaceC0334a);
        }
    }

    @Override // h0.a
    public String d(String str) {
        synchronized (this.f14965a) {
            try {
                if (!this.f14967d.containsKey(str)) {
                    return null;
                }
                List<String> list = this.f14967d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator<t> it = this.f14969f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(h.a(it.next()).c())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h0.a
    public int e() {
        int i10;
        synchronized (this.f14965a) {
            i10 = this.f14970g;
        }
        return i10;
    }

    @Override // n0.l2
    public void f(List<String> list) throws i1 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.b.e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (x2.a(this.b, str) && x2.a(this.b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (p1 unused) {
                            r1.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f14965a) {
                this.f14967d = map;
                this.f14968e = hashSet;
                r1.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f14967d);
            }
        } catch (f e10) {
            throw new i1("Failed to retrieve concurrent camera id info.", e10);
        }
    }

    @Override // h0.a
    public void h(int i10) {
        synchronized (this.f14965a) {
            try {
                int i11 = this.f14970g;
                if (i10 == i11) {
                    return;
                }
                this.f14970g = i10;
                ArrayList arrayList = new ArrayList(this.f14966c);
                if (i11 == 2 && i10 != 2) {
                    this.f14969f.clear();
                }
                i(arrayList, i11, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(List<h0.a.InterfaceC0334a> list, int i10, int i11) {
        Iterator<h0.a.InterfaceC0334a> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(i10, i11);
        }
    }

    @Override // h0.a
    public void shutdown() {
        synchronized (this.f14965a) {
            this.f14966c.clear();
            this.f14967d.clear();
            this.f14969f.clear();
            this.f14968e.clear();
            this.f14970g = 0;
        }
    }
}
