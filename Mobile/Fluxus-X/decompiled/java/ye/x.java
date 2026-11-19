package ye;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final x b = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends re.x>, a<? extends re.x>> f37835a = new HashMap();

    public interface a<ParametersT extends re.x> {
    }

    public static x b() {
        return b;
    }

    public synchronized <ParametersT extends re.x> void a(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends re.x> aVar2 = this.f37835a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f37835a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
