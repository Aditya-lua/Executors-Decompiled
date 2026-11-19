package n0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class c3 implements n1 {
    public static final Comparator<n1.a<?>> Q;
    public static final c3 R;
    public final TreeMap<n1.a<?>, Map<n1.c, Object>> P;

    static {
        Comparator<n1.a<?>> comparator = new Comparator() { // from class: n0.b3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((n1.a) obj).c().compareTo(((n1.a) obj2).c());
            }
        };
        Q = comparator;
        R = new c3(new TreeMap(comparator));
    }

    public c3(TreeMap<n1.a<?>, Map<n1.c, Object>> treeMap) {
        this.P = treeMap;
    }

    public static c3 i0() {
        return R;
    }

    public static c3 j0(n1 n1Var) {
        if (c3.class.equals(n1Var.getClass())) {
            return (c3) n1Var;
        }
        TreeMap treeMap = new TreeMap(Q);
        for (n1.a<?> aVar : n1Var.b()) {
            Set<n1.c> setF = n1Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n1.c cVar : setF) {
                arrayMap.put(cVar, n1Var.c(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new c3(treeMap);
    }

    @Override // n0.n1
    public boolean a(n1.a<?> aVar) {
        return this.P.containsKey(aVar);
    }

    @Override // n0.n1
    public Set<n1.a<?>> b() {
        return Collections.unmodifiableSet(this.P.keySet());
    }

    @Override // n0.n1
    public <ValueT> ValueT c(n1.a<ValueT> aVar, n1.c cVar) {
        Map<n1.c, Object> map = this.P.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // n0.n1
    public void d(String str, n1.b bVar) {
        for (Map.Entry<n1.a<?>, Map<n1.c, Object>> entry : this.P.tailMap(n1.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // n0.n1
    public <ValueT> ValueT e(n1.a<ValueT> aVar) {
        Map<n1.c, Object> map = this.P.get(aVar);
        if (map != null) {
            return (ValueT) map.get((n1.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // n0.n1
    public Set<n1.c> f(n1.a<?> aVar) {
        Map<n1.c, Object> map = this.P.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // n0.n1
    public n1.c g(n1.a<?> aVar) {
        Map<n1.c, Object> map = this.P.get(aVar);
        if (map != null) {
            return (n1.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // n0.n1
    public <ValueT> ValueT h(n1.a<ValueT> aVar, ValueT valuet) {
        Map<n1.c, Object> map = this.P.get(aVar);
        return map == null ? valuet : (ValueT) map.get((n1.c) Collections.min(map.keySet()));
    }
}
