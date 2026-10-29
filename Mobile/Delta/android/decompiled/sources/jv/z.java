package jv;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z<T> {
    public static <T> z<T> b(y yVar, Class<?> cls, Method method) {
        w wVarB = w.b(yVar, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (c0.j(genericReturnType)) {
            throw c0.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return n.f(yVar, method, wVarB);
        }
        throw c0.n(method, "Service methods cannot return void.", new Object[0]);
    }

    public abstract T a(Object obj, Object[] objArr);
}
