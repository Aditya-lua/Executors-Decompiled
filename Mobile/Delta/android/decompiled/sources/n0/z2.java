package n0;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z2 extends z3 {
    public z2(Map<String, Object> map) {
        super(map);
    }

    public static z2 g() {
        return new z2(new ArrayMap());
    }

    public static z2 h(z3 z3Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : z3Var.e()) {
            arrayMap.put(str, z3Var.d(str));
        }
        return new z2(arrayMap);
    }

    public void f(z3 z3Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f24976a;
        if (map2 == null || (map = z3Var.f24976a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f24976a.put(str, obj);
    }
}
