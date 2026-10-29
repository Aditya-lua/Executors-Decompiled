package p296n0;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: renamed from: n0.z2 */
/* JADX INFO: loaded from: classes.dex */
public class C8856z2 extends C8857z3 {
    public C8856z2(Map<String, Object> map) {
        super(map);
    }

    /* JADX INFO: renamed from: g */
    public static C8856z2 m35557g() {
        return new C8856z2(new ArrayMap());
    }

    /* JADX INFO: renamed from: h */
    public static C8856z2 m35558h(C8857z3 c8857z3) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c8857z3.m35565e()) {
            arrayMap.put(str, c8857z3.m35564d(str));
        }
        return new C8856z2(arrayMap);
    }

    /* JADX INFO: renamed from: f */
    public void m35559f(C8857z3 c8857z3) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f32243a;
        if (map2 == null || (map = c8857z3.f32243a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: i */
    public void m35560i(String str, Object obj) {
        this.f32243a.put(str, obj);
    }
}
