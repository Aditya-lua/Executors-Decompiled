package ve;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final x b = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends oe.x>, a<? extends oe.x>> f33024a = new HashMap();

    public interface a<ParametersT extends oe.x> {
    }

    public static x b() {
        return b;
    }

    public synchronized <ParametersT extends oe.x> void a(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends oe.x> aVar2 = this.f33024a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f33024a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
