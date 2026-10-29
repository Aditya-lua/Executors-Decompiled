package p296n0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ne.InterfaceFutureC9440x;
import p140g0.C5923p1;
import p140g0.C5931r1;
import p140g0.C5953x;
import p366q0.C10417c;
import p397r0.C10773n;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: n0.d1 */
/* JADX INFO: loaded from: classes.dex */
public class C8738d1 implements InterfaceC8786l2 {

    /* JADX INFO: renamed from: a */
    public final Object f31795a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<String, InterfaceC8804p0> f31796b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final Set<InterfaceC8804p0> f31797c = new HashSet();

    /* JADX INFO: renamed from: d */
    public InterfaceFutureC9440x<Void> f31798d;

    /* JADX INFO: renamed from: e */
    public C12997c.a<Void> f31799e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8794n0 f31800f;

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m35036i(C8738d1 c8738d1, InterfaceC8804p0 interfaceC8804p0) {
        synchronized (c8738d1.f31795a) {
            try {
                c8738d1.f31797c.remove(interfaceC8804p0);
                if (c8738d1.f31797c.isEmpty()) {
                    C12637g.m47075g(c8738d1.f31799e);
                    c8738d1.f31799e.m48314c(null);
                    c8738d1.f31799e = null;
                    c8738d1.f31798d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m35037j(C8738d1 c8738d1, C12997c.a aVar) {
        synchronized (c8738d1.f31795a) {
            c8738d1.f31799e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // p296n0.InterfaceC8786l2
    /* JADX INFO: renamed from: f */
    public void mo23117f(List<String> list) throws C8768i1 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f31795a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f31796b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f31800f.mo35283b(str));
            }
            synchronized (this.f31795a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f31796b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f31796b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : list) {
                        if (this.f31796b.containsKey(str2)) {
                            linkedHashMap.put(str2, this.f31796b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (InterfaceC8804p0) map.get(str2));
                        }
                    }
                    this.f31796b.clear();
                    this.f31796b.putAll(linkedHashMap);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        InterfaceC8804p0 interfaceC8804p0 = (InterfaceC8804p0) obj;
                        if (interfaceC8804p0 != null) {
                            interfaceC8804p0.mo35367p();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (C5953x e10) {
            throw new C8768i1("Failed to create CameraInternal", e10);
        }
    }

    /* JADX INFO: renamed from: k */
    public InterfaceFutureC9440x<Void> m35038k() {
        synchronized (this.f31795a) {
            try {
                if (this.f31796b.isEmpty()) {
                    InterfaceFutureC9440x<Void> interfaceFutureC9440xM40993p = this.f31798d;
                    if (interfaceFutureC9440xM40993p == null) {
                        interfaceFutureC9440xM40993p = C10773n.m40993p(null);
                    }
                    return interfaceFutureC9440xM40993p;
                }
                InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a = this.f31798d;
                if (interfaceFutureC9440xM48311a == null) {
                    interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: n0.b1
                        @Override // p563y1.C12997c.c
                        /* JADX INFO: renamed from: a */
                        public final Object mo22051a(C12997c.a aVar) {
                            return C8738d1.m35037j(this.f31768a, aVar);
                        }
                    });
                    this.f31798d = interfaceFutureC9440xM48311a;
                }
                this.f31797c.addAll(this.f31796b.values());
                for (final InterfaceC8804p0 interfaceC8804p0 : this.f31796b.values()) {
                    interfaceC8804p0.mo6692a().mo37173a(new Runnable() { // from class: n0.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8738d1.m35036i(this.f31781a, interfaceC8804p0);
                        }
                    }, C10417c.m40081b());
                }
                this.f31796b.clear();
                return interfaceFutureC9440xM48311a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC8804p0 m35039l(String str) {
        InterfaceC8804p0 interfaceC8804p0;
        synchronized (this.f31795a) {
            try {
                interfaceC8804p0 = this.f31796b.get(str);
                if (interfaceC8804p0 == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC8804p0;
    }

    /* JADX INFO: renamed from: m */
    public LinkedHashSet<InterfaceC8804p0> m35040m() {
        LinkedHashSet<InterfaceC8804p0> linkedHashSet;
        synchronized (this.f31795a) {
            linkedHashSet = new LinkedHashSet<>(this.f31796b.values());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: n */
    public void m35041n(InterfaceC8794n0 interfaceC8794n0) {
        this.f31800f = interfaceC8794n0;
        synchronized (this.f31795a) {
            try {
                for (String str : interfaceC8794n0.mo35285d()) {
                    C5931r1.m26561a("CameraRepository", "Added camera: " + str);
                    InterfaceC8804p0 interfaceC8804p0Put = this.f31796b.put(str, interfaceC8794n0.mo35283b(str));
                    if (interfaceC8804p0Put != null) {
                        interfaceC8804p0Put.mo6692a();
                    }
                }
            } catch (C5953x e10) {
                throw new C5923p1(e10);
            }
        }
    }
}
