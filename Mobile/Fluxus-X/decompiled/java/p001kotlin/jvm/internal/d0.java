package p001kotlin.jvm.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.Collections;
import p001kotlin.reflect.KTypeProjection;
import xu.c;
import xu.f;
import xu.g;
import xu.h;
import xu.i;
import xu.j;
import xu.k;
import xu.m;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f21577a;
    public static final c[] b;

    static {
        e0 e0Var = null;
        try {
            e0Var = (e0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e0Var == null) {
            e0Var = new e0();
        }
        f21577a = e0Var;
        b = new c[0];
    }

    public static g a(j jVar) {
        return f21577a.a(jVar);
    }

    public static c b(Class cls) {
        return f21577a.b(cls);
    }

    public static f c(Class cls) {
        return f21577a.c(cls, BuildConfig.FLAVOR);
    }

    public static h d(n nVar) {
        return f21577a.d(nVar);
    }

    public static m e(Class cls) {
        return f21577a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static i f(r rVar) {
        return f21577a.e(rVar);
    }

    public static j g(t tVar) {
        return f21577a.f(tVar);
    }

    public static k h(v vVar) {
        return f21577a.g(vVar);
    }

    public static String i(i iVar) {
        return f21577a.h(iVar);
    }

    public static String j(m mVar) {
        return f21577a.i(mVar);
    }

    public static m k(Class cls) {
        return f21577a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static m l(Class cls, KTypeProjection kTypeProjection) {
        return f21577a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }
}
