package p296n0;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: n0.z3 */
/* JADX INFO: loaded from: classes.dex */
public class C8857z3 {

    /* JADX INFO: renamed from: b */
    public static final C8857z3 f32242b = new C8857z3(new ArrayMap());

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f32243a;

    public C8857z3(Map<String, Object> map) {
        this.f32243a = map;
    }

    /* JADX INFO: renamed from: a */
    public static C8857z3 m35561a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new C8857z3(arrayMap);
    }

    /* JADX INFO: renamed from: b */
    public static C8857z3 m35562b() {
        return f32242b;
    }

    /* JADX INFO: renamed from: c */
    public static C8857z3 m35563c(C8857z3 c8857z3) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c8857z3.m35565e()) {
            arrayMap.put(str, c8857z3.m35564d(str));
        }
        return new C8857z3(arrayMap);
    }

    /* JADX INFO: renamed from: d */
    public Object m35564d(String str) {
        return this.f32243a.get(str);
    }

    /* JADX INFO: renamed from: e */
    public Set<String> m35565e() {
        return this.f32243a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
