package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final x b = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends pe.x>, a<? extends pe.x>> f34478a = new HashMap();

    public interface a<ParametersT extends pe.x> {
    }

    public static x b() {
        return b;
    }

    public synchronized <ParametersT extends pe.x> void a(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends pe.x> aVar2 = this.f34478a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f34478a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
