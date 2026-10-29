package ve;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public static final z b = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, oe.x> f33027a = new HashMap();

    public static z a() {
        return b;
    }

    public synchronized void b(String str, oe.x xVar) {
        try {
            if (!this.f33027a.containsKey(str)) {
                this.f33027a.put(str, xVar);
                return;
            }
            if (this.f33027a.get(str).equals(xVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f33027a.get(str) + "), cannot insert " + xVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(Map<String, oe.x> map) {
        for (Map.Entry<String, oe.x> entry : map.entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
    }
}
