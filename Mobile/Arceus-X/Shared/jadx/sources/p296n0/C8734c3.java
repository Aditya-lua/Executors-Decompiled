package p296n0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: n0.c3 */
/* JADX INFO: loaded from: classes.dex */
public class C8734c3 implements InterfaceC8795n1 {

    /* JADX INFO: renamed from: Q */
    public static final Comparator<InterfaceC8795n1.a<?>> f31784Q;

    /* JADX INFO: renamed from: R */
    public static final C8734c3 f31785R;

    /* JADX INFO: renamed from: P */
    public final TreeMap<InterfaceC8795n1.a<?>, Map<InterfaceC8795n1.c, Object>> f31786P;

    static {
        Comparator<InterfaceC8795n1.a<?>> comparator = new Comparator() { // from class: n0.b3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((InterfaceC8795n1.a) obj).mo35216c().compareTo(((InterfaceC8795n1.a) obj2).mo35216c());
            }
        };
        f31784Q = comparator;
        f31785R = new C8734c3(new TreeMap(comparator));
    }

    public C8734c3(TreeMap<InterfaceC8795n1.a<?>, Map<InterfaceC8795n1.c, Object>> treeMap) {
        this.f31786P = treeMap;
    }

    /* JADX INFO: renamed from: i0 */
    public static C8734c3 m35021i0() {
        return f31785R;
    }

    /* JADX INFO: renamed from: j0 */
    public static C8734c3 m35022j0(InterfaceC8795n1 interfaceC8795n1) {
        if (C8734c3.class.equals(interfaceC8795n1.getClass())) {
            return (C8734c3) interfaceC8795n1;
        }
        TreeMap treeMap = new TreeMap(f31784Q);
        for (InterfaceC8795n1.a<?> aVar : interfaceC8795n1.mo35024b()) {
            Set<InterfaceC8795n1.c> setMo35028f = interfaceC8795n1.mo35028f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC8795n1.c cVar : setMo35028f) {
                arrayMap.put(cVar, interfaceC8795n1.mo35025c(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C8734c3(treeMap);
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: a */
    public boolean mo35023a(InterfaceC8795n1.a<?> aVar) {
        return this.f31786P.containsKey(aVar);
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: b */
    public Set<InterfaceC8795n1.a<?>> mo35024b() {
        return Collections.unmodifiableSet(this.f31786P.keySet());
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: c */
    public <ValueT> ValueT mo35025c(InterfaceC8795n1.a<ValueT> aVar, InterfaceC8795n1.c cVar) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: d */
    public void mo35026d(String str, InterfaceC8795n1.b bVar) {
        for (Map.Entry<InterfaceC8795n1.a<?>, Map<InterfaceC8795n1.c, Object>> entry : this.f31786P.tailMap(InterfaceC8795n1.a.m35291a(str, Void.class)).entrySet()) {
            if (!entry.getKey().mo35216c().startsWith(str) || !bVar.mo24213a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: e */
    public <ValueT> ValueT mo35027e(InterfaceC8795n1.a<ValueT> aVar) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        if (map != null) {
            return (ValueT) map.get((InterfaceC8795n1.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: f */
    public Set<InterfaceC8795n1.c> mo35028f(InterfaceC8795n1.a<?> aVar) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: g */
    public InterfaceC8795n1.c mo35029g(InterfaceC8795n1.a<?> aVar) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        if (map != null) {
            return (InterfaceC8795n1.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p296n0.InterfaceC8795n1
    /* JADX INFO: renamed from: h */
    public <ValueT> ValueT mo35030h(InterfaceC8795n1.a<ValueT> aVar, ValueT valuet) {
        Map<InterfaceC8795n1.c, Object> map = this.f31786P.get(aVar);
        return map == null ? valuet : (ValueT) map.get((InterfaceC8795n1.c) Collections.min(map.keySet()));
    }
}
