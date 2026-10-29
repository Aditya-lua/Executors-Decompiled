package zd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f37490a = new HashMap();

    public final l0 a(String str, String str2, String str3) {
        if (!this.f37490a.containsKey(str2)) {
            this.f37490a.put(str2, new HashMap());
        }
        ((Map) this.f37490a.get(str2)).put(str, str3);
        return this;
    }

    public final n0 b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f37490a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new n0(Collections.unmodifiableMap(map), null);
    }
}
