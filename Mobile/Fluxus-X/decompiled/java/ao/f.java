package ao;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, eo.e<?>> f3074a = new HashMap();

    public <D> void a(eo.e<D> eVar) {
        eo.e eVarC = c(eVar.c());
        if (eVarC == null) {
            this.f3074a.put(eVar.c(), eVar);
        } else {
            eVarC.a(eVar);
        }
    }

    public <V> V b(Class<V> cls, String str) {
        eo.e<V> eVarC = c(cls);
        if (eVarC == null) {
            return null;
        }
        return eVarC.b(str);
    }

    public final <V> eo.e<V> c(Class<V> cls) {
        return (eo.e) this.f3074a.get(cls);
    }
}
