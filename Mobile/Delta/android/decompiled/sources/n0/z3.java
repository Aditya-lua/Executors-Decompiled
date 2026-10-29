package n0;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z3 {
    public static final z3 b = new z3(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f24976a;

    public z3(Map<String, Object> map) {
        this.f24976a = map;
    }

    public static z3 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new z3(arrayMap);
    }

    public static z3 b() {
        return b;
    }

    public static z3 c(z3 z3Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : z3Var.e()) {
            arrayMap.put(str, z3Var.d(str));
        }
        return new z3(arrayMap);
    }

    public Object d(String str) {
        return this.f24976a.get(str);
    }

    public Set<String> e() {
        return this.f24976a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
