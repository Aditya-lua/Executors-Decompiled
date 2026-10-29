package nn;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, qn.e<?>> f26382a = new HashMap();

    public <D> void a(qn.e<D> eVar) {
        qn.e eVarC = c(eVar.c());
        if (eVarC == null) {
            this.f26382a.put(eVar.c(), eVar);
        } else {
            eVarC.a(eVar);
        }
    }

    public <V> V b(Class<V> cls, String str) {
        qn.e<V> eVarC = c(cls);
        if (eVarC == null) {
            return null;
        }
        return eVarC.b(str);
    }

    public final <V> qn.e<V> c(Class<V> cls) {
        return (qn.e) this.f26382a.get(cls);
    }
}
