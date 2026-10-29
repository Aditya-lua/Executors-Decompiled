package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f8412c = new c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f8413d = false;
    public final ConcurrentMap<Class<?>, g1<?>> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f8414a = new k0();

    public static c1 a() {
        return f8412c;
    }

    public g1<?> b(Class<?> cls, g1<?> g1Var) {
        a0.b(cls, "messageType");
        a0.b(g1Var, "schema");
        return this.b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> c(Class<T> cls) {
        a0.b(cls, "messageType");
        g1<T> g1VarA = (g1) this.b.get(cls);
        if (g1VarA == null) {
            g1VarA = this.f8414a.a(cls);
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
