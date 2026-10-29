package n0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends c3 implements w2 {
    public static final n1.c S = n1.c.OPTIONAL;

    public x2(TreeMap<n1.a<?>, Map<n1.c, Object>> treeMap) {
        super(treeMap);
    }

    public static x2 k0() {
        return new x2(new TreeMap(c3.Q));
    }

    public static x2 l0(n1 n1Var) {
        TreeMap treeMap = new TreeMap(c3.Q);
        for (n1.a<?> aVar : n1Var.b()) {
            Set<n1.c> setF = n1Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n1.c cVar : setF) {
                arrayMap.put(cVar, n1Var.c(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new x2(treeMap);
    }

    @Override // n0.w2
    public <ValueT> void D(n1.a<ValueT> aVar, n1.c cVar, ValueT valuet) {
        Map<n1.c, Object> map = this.P.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.P.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        n1.c cVar2 = (n1.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !n1.y(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // n0.w2
    public <ValueT> void G(n1.a<ValueT> aVar, ValueT valuet) {
        D(aVar, S, valuet);
    }

    public <ValueT> ValueT m0(n1.a<ValueT> aVar) {
        return (ValueT) this.P.remove(aVar);
    }
}
