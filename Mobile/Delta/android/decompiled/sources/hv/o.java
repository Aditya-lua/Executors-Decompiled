package hv;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f19873a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f19874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f19875d;

    public o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f19873a = cls;
        this.b = obj;
        this.f19874c = method;
        this.f19875d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f19874c;
    }

    public Class<?> b() {
        return this.f19873a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f19873a.getName(), this.f19874c.getName(), this.f19875d);
    }
}
