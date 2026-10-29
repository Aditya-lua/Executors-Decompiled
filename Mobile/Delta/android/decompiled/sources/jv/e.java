package jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface e<R, T> {

    public static abstract class a {
        public static Type b(int i10, ParameterizedType parameterizedType) {
            return c0.g(i10, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return c0.h(type);
        }

        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    T b(d<R> dVar);
}
