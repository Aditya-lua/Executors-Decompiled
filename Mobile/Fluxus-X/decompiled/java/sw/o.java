package sw;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f31970a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f31971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f31972d;

    public o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f31970a = cls;
        this.b = obj;
        this.f31971c = method;
        this.f31972d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f31971c;
    }

    public Class<?> b() {
        return this.f31970a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f31970a.getName(), this.f31971c.getName(), this.f31972d);
    }
}
