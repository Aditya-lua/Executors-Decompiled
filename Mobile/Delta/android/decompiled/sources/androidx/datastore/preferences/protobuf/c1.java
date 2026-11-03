package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f1996c = new c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1997d = false;
    public final ConcurrentMap<Class<?>, g1<?>> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f1998a = new j0();

    public static c1 a() {
        return f1996c;
    }

    public g1<?> b(Class<?> cls, g1<?> g1Var) {
        z.b(cls, "messageType");
        z.b(g1Var, "schema");
        return this.b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> c(Class<T> cls) {
        z.b(cls, "messageType");
        g1<T> g1VarA = (g1) this.b.get(cls);
        if (g1VarA == null) {
            g1VarA = this.f1998a.a(cls);
            g1<T> g1Var = (g1<T>) b(cls, g1VarA);
            if (g1Var != null) {
                return g1Var;
            }
        }
        return g1VarA;
    }

    public <T> g1<T> d(T t8) {
        return c(t8.getClass());
    }
}
