package p231jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: jv.h */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7380h<F, T> {

    /* JADX INFO: renamed from: jv.h$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public static Type m30579a(int i10, ParameterizedType parameterizedType) {
            return C7375c0.m30556g(i10, parameterizedType);
        }

        /* JADX INFO: renamed from: b */
        public static Class<?> m30580b(Type type) {
            return C7375c0.m30557h(type);
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC7380h<?, RequestBody> mo30538c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7397y c7397y) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public InterfaceC7380h<ResponseBody, ?> mo30539d(Type type, Annotation[] annotationArr, C7397y c7397y) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public InterfaceC7380h<?, String> m30581e(Type type, Annotation[] annotationArr, C7397y c7397y) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    T mo30540a(F f10);
}
