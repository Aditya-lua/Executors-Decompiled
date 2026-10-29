package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f22554a;
    public static final hu.c[] b;

    static {
        e0 e0Var = null;
        try {
            e0Var = (e0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e0Var == null) {
            e0Var = new e0();
        }
        f22554a = e0Var;
        b = new hu.c[0];
    }

    public static hu.g a(j jVar) {
        return f22554a.a(jVar);
    }

    public static hu.c b(Class cls) {
        return f22554a.b(cls);
    }

    public static hu.f c(Class cls) {
        return f22554a.c(cls, "");
    }

    public static hu.h d(n nVar) {
        return f22554a.d(nVar);
    }

    public static hu.m e(Class cls) {
        return f22554a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static hu.i f(r rVar) {
        return f22554a.e(rVar);
    }

    public static hu.j g(t tVar) {
        return f22554a.f(tVar);
    }

    public static hu.k h(v vVar) {
        return f22554a.g(vVar);
    }

    public static String i(i iVar) {
        return f22554a.h(iVar);
    }

    public static String j(m mVar) {
        return f22554a.i(mVar);
    }

    public static hu.m k(Class cls) {
        return f22554a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static hu.m l(Class cls, KTypeProjection kTypeProjection) {
        return f22554a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }
}
