package ce;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4996a;

    public final Map a(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.f4996a.keySet()) {
            if (this.f4996a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.f4996a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
