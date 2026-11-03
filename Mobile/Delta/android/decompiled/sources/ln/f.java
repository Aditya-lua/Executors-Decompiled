package ln;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, on.e<?>> f23671a = new HashMap();

    public <D> void a(on.e<D> eVar) {
        on.e eVarC = c(eVar.c());
        if (eVarC == null) {
            this.f23671a.put(eVar.c(), eVar);
        } else {
            eVarC.a(eVar);
        }
    }

    public <V> V b(Class<V> cls, String str) {
        on.e<V> eVarC = c(cls);
        if (eVarC == null) {
            return null;
        }
        return eVarC.b(str);
    }

    public final <V> on.e<V> c(Class<V> cls) {
        return (on.e) this.f23671a.get(cls);
    }
}
