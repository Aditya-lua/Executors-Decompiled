package p231jv;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: jv.z */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7398z<T> {
    /* JADX INFO: renamed from: b */
    public static <T> AbstractC7398z<T> m30677b(C7397y c7397y, Class<?> cls, Method method) {
        C7395w c7395wM30637b = C7395w.m30637b(c7397y, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C7375c0.m30559j(genericReturnType)) {
            throw C7375c0.m30563n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC7386n.m30591f(c7397y, method, c7395wM30637b);
        }
        throw C7375c0.m30563n(method, "Service methods cannot return void.", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo30592a(Object obj, Object[] objArr);
}
