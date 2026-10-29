package p515we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import pe.AbstractC10243x;

/* JADX INFO: renamed from: we.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C12399x {

    /* JADX INFO: renamed from: b */
    public static final C12399x f44361b = new C12399x();

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends AbstractC10243x>, a<? extends AbstractC10243x>> f44362a = new HashMap();

    /* JADX INFO: renamed from: we.x$a */
    public interface a<ParametersT extends AbstractC10243x> {
    }

    /* JADX INFO: renamed from: b */
    public static C12399x m46473b() {
        return f44361b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <ParametersT extends AbstractC10243x> void m46474a(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends AbstractC10243x> aVar2 = this.f44362a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f44362a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
