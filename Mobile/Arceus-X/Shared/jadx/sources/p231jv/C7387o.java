package p231jv;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: jv.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7387o {

    /* JADX INFO: renamed from: a */
    public final Class<?> f28327a;

    /* JADX INFO: renamed from: b */
    public final Object f28328b;

    /* JADX INFO: renamed from: c */
    public final Method f28329c;

    /* JADX INFO: renamed from: d */
    public final List<?> f28330d;

    public C7387o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f28327a = cls;
        this.f28328b = obj;
        this.f28329c = method;
        this.f28330d = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: a */
    public Method m30594a() {
        return this.f28329c;
    }

    /* JADX INFO: renamed from: b */
    public Class<?> m30595b() {
        return this.f28327a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f28327a.getName(), this.f28329c.getName(), this.f28330d);
    }
}
