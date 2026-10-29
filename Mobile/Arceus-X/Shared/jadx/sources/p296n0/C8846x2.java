package p296n0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: n0.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8846x2 extends C8734c3 implements InterfaceC8841w2 {

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.c f32205S = InterfaceC8795n1.c.OPTIONAL;

    public C8846x2(TreeMap<InterfaceC8795n1.a<?>, Map<InterfaceC8795n1.c, Object>> treeMap) {
        super(treeMap);
    }

    /* JADX INFO: renamed from: k0 */
    public static C8846x2 m35505k0() {
        return new C8846x2(new TreeMap(C8734c3.f31784Q));
    }

    /* JADX INFO: renamed from: l0 */
    public static C8846x2 m35506l0(InterfaceC8795n1 interfaceC8795n1) {
        TreeMap treeMap = new TreeMap(C8734c3.f31784Q);
        for (InterfaceC8795n1.a<?> aVar : interfaceC8795n1.mo35024b()) {
            Set<InterfaceC8795n1.c> setMo35028f = interfaceC8795n1.mo35028f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC8795n1.c cVar : setMo35028f) {
                arrayMap.put(cVar, interfaceC8795n1.mo35025c(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C8846x2(treeMap);
    }

    @Override // p296n0.InterfaceC8841w2
    /* JADX INFO: renamed from: D */
    public <ValueT> void mo35472D(InterfaceC8795n1.a<ValueT> aVar, InterfaceC8795n1.c cVar, ValueT valuet) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f31786P.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        InterfaceC8795n1.c cVar2 = (InterfaceC8795n1.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !InterfaceC8795n1.m35290y(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo35216c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // p296n0.InterfaceC8841w2
    /* JADX INFO: renamed from: G */
    public <ValueT> void mo35473G(InterfaceC8795n1.a<ValueT> aVar, ValueT valuet) {
        mo35472D(aVar, f32205S, valuet);
    }

    /* JADX INFO: renamed from: m0 */
    public <ValueT> ValueT m35507m0(InterfaceC8795n1.a<ValueT> aVar) {
        return (ValueT) this.f31786P.remove(aVar);
    }
}
