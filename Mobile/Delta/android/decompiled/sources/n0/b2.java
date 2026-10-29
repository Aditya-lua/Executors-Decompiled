package n0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24611a = new Object();
    public static final Map<Object, j0> b = new HashMap();

    public static j0 a(Object obj) {
        j0 j0Var;
        synchronized (f24611a) {
            j0Var = b.get(obj);
        }
        return j0Var == null ? j0.f24704a : j0Var;
    }
}
