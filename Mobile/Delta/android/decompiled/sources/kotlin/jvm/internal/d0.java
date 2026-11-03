package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f23009a;
    public static final fu.c[] b;

    static {
        e0 e0Var = null;
        try {
            e0Var = (e0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e0Var == null) {
            e0Var = new e0();
        }
        f23009a = e0Var;
        b = new fu.c[0];
    }

    public static fu.g a(j jVar) {
        return f23009a.a(jVar);
    }

    public static fu.c b(Class cls) {
        return f23009a.b(cls);
    }

    public static fu.f c(Class cls) {
        return f23009a.c(cls, "");
    }

    public static fu.h d(n nVar) {
        return f23009a.d(nVar);
    }

    public static fu.m e(Class cls) {
        return f23009a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static fu.i f(r rVar) {
        return f23009a.e(rVar);
    }

    public static fu.j g(t tVar) {
        return f23009a.f(tVar);
    }

    public static fu.k h(v vVar) {
        return f23009a.g(vVar);
    }

    public static String i(i iVar) {
        return f23009a.h(iVar);
    }

    public static String j(m mVar) {
        return f23009a.i(mVar);
    }

    public static fu.m k(Class cls) {
        return f23009a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static fu.m l(Class cls, KTypeProjection kTypeProjection) {
        return f23009a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }
}
