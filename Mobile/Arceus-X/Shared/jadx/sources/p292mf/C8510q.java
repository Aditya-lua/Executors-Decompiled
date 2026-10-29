package p292mf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: mf.q */
/* JADX INFO: loaded from: classes2.dex */
public class C8510q {

    /* JADX INFO: renamed from: mf.q$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C8492c<?> f31254a;

        /* JADX INFO: renamed from: b */
        public final Set<b> f31255b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Set<b> f31256c = new HashSet();

        public b(C8492c<?> c8492c) {
            this.f31254a = c8492c;
        }

        /* JADX INFO: renamed from: a */
        public void m34347a(b bVar) {
            this.f31255b.add(bVar);
        }

        /* JADX INFO: renamed from: b */
        public void m34348b(b bVar) {
            this.f31256c.add(bVar);
        }

        /* JADX INFO: renamed from: c */
        public C8492c<?> m34349c() {
            return this.f31254a;
        }

        /* JADX INFO: renamed from: d */
        public Set<b> m34350d() {
            return this.f31255b;
        }

        /* JADX INFO: renamed from: e */
        public boolean m34351e() {
            return this.f31255b.isEmpty();
        }

        /* JADX INFO: renamed from: f */
        public boolean m34352f() {
            return this.f31256c.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        public void m34353g(b bVar) {
            this.f31256c.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: mf.q$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final C8497e0<?> f31257a;

        /* JADX INFO: renamed from: b */
        public final boolean f31258b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f31257a.equals(this.f31257a) && cVar.f31258b == this.f31258b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f31257a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f31258b).hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(C8497e0<?> c8497e0, boolean z10) {
            this.f31257a = c8497e0;
            this.f31258b = z10;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34344a(List<C8492c<?>> list) {
        Set<b> setM34346c = m34346c(list);
        Set<b> setM34345b = m34345b(setM34346c);
        int i10 = 0;
        while (!setM34345b.isEmpty()) {
            b next = setM34345b.iterator().next();
            setM34345b.remove(next);
            i10++;
            for (b bVar : next.m34350d()) {
                bVar.m34353g(next);
                if (bVar.m34352f()) {
                    setM34345b.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setM34346c) {
            if (!bVar2.m34352f() && !bVar2.m34351e()) {
                arrayList.add(bVar2.m34349c());
            }
        }
        throw new C8512s(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static Set<b> m34345b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m34352f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public static Set<b> m34346c(List<C8492c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<C8492c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C8511r c8511r : bVar.m34349c().m34281g()) {
                            if (c8511r.m34365d() && (set = (Set) map.get(new c(c8511r.m34363b(), c8511r.m34367f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m34347a(bVar2);
                                    bVar2.m34348b(bVar);
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
            C8492c<?> next = it.next();
            b bVar3 = new b(next);
            for (C8497e0<? super Object> c8497e0 : next.m34284j()) {
                c cVar = new c(c8497e0, !next.m34288p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f31258b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c8497e0));
                }
                set2.add(bVar3);
            }
        }
    }
}
