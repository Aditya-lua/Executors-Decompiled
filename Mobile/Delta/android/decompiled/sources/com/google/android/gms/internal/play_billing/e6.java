package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class e6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e6 f7034c = new e6();
    public final ConcurrentMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5 f7035a = new o5();

    public static e6 a() {
        return f7034c;
    }

    public final h6 b(Class cls) {
        Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (h6) obj;
    }

    public final <T> h6<T> c(Class<T> cls) {
        ConcurrentMap concurrentMap = this.b;
        h6<T> h6VarA = this.f7035a.a(cls);
        h6<T> h6Var = (h6) concurrentMap.putIfAbsent(cls, h6VarA);
        return h6Var != null ? h6Var : h6VarA;
    }
}
