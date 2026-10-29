package jv;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f21863a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f21864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f21865d;

    public o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f21863a = cls;
        this.b = obj;
        this.f21864c = method;
        this.f21865d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f21864c;
    }

    public Class<?> b() {
        return this.f21863a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f21863a.getName(), this.f21864c.getName(), this.f21865d);
    }
}
