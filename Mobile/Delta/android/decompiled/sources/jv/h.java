package jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface h<F, T> {

    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return c0.g(i10, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return c0.h(type);
        }

        public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
            return null;
        }

        public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }

        public h<?, String> e(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }
    }

    T a(F f10);
}
