package of;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final of.c<?> f28110a;
        public final Set<b> b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<b> f28111c = new HashSet();

        public b(of.c<?> cVar) {
            this.f28110a = cVar;
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public void b(b bVar) {
            this.f28111c.add(bVar);
        }

        public of.c<?> c() {
            return this.f28110a;
        }

        public Set<b> d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.f28111c.isEmpty();
        }

        public void g(b bVar) {
            this.f28111c.remove(bVar);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0<?> f28112a;
        public final boolean b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f28112a.equals(this.f28112a) && cVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f28112a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        public c(e0<?> e0Var, boolean z10) {
            this.f28112a = e0Var;
            this.b = z10;
        }
    }

    public static void a(List<of.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new s(arrayList);
    }

    public static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<b> c(List<of.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<of.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.d() && (set = (Set) map.get(new c(rVar.b(), rVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            of.c<?> next = it.next();
            b bVar3 = new b(next);
            for (e0<? super Object> e0Var : next.j()) {
                c cVar = new c(e0Var, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
