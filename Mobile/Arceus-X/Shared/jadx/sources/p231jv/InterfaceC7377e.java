package p231jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: jv.e */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7377e<R, T> {

    /* JADX INFO: renamed from: jv.e$a */
    public static abstract class a {
        /* JADX INFO: renamed from: b */
        public static Type m30574b(int i10, ParameterizedType parameterizedType) {
            return C7375c0.m30556g(i10, parameterizedType);
        }

        /* JADX INFO: renamed from: c */
        public static Class<?> m30575c(Type type) {
            return C7375c0.m30557h(type);
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC7377e<?, ?> mo30576a(Type type, Annotation[] annotationArr, C7397y c7397y);
    }

    /* JADX INFO: renamed from: a */
    Type mo30572a();

    /* JADX INFO: renamed from: b */
    T mo30573b(InterfaceC7376d<R> interfaceC7376d);
}
