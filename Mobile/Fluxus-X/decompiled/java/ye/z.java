package ye;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public static final z b = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, re.x> f37838a = new HashMap();

    public static z a() {
        return b;
    }

    public synchronized void b(String str, re.x xVar) {
        try {
            if (!this.f37838a.containsKey(str)) {
                this.f37838a.put(str, xVar);
                return;
            }
            if (this.f37838a.get(str).equals(xVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f37838a.get(str) + "), cannot insert " + xVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(Map<String, re.x> map) {
        for (Map.Entry<String, re.x> entry : map.entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
    }
}
