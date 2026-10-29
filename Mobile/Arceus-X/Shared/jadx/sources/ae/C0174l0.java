package ae;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ae.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0174l0 {

    /* JADX INFO: renamed from: a */
    public final Map f566a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final C0174l0 m529a(String str, String str2, String str3) {
        if (!this.f566a.containsKey(str2)) {
            this.f566a.put(str2, new HashMap());
        }
        ((Map) this.f566a.get(str2)).put(str, str3);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C0178n0 m530b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f566a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C0178n0(Collections.unmodifiableMap(map), null);
    }
}
