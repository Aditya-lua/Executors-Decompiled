package p471um;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p522wm.C12494c;

/* JADX INFO: renamed from: um.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C11865a implements AbstractC11873h.e {

    /* JADX INFO: renamed from: a */
    public final List<f> f42051a;

    /* JADX INFO: renamed from: b */
    public final List<f> f42052b;

    /* JADX INFO: renamed from: um.a$a */
    public class a extends AbstractC11873h<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f f42053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC11873h f42054b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C11888w f42055c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ f f42056d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Set f42057e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Type f42058f;

        public a(f fVar, AbstractC11873h abstractC11873h, C11888w c11888w, f fVar2, Set set, Type type) {
            this.f42053a = fVar;
            this.f42054b = abstractC11873h;
            this.f42055c = c11888w;
            this.f42056d = fVar2;
            this.f42057e = set;
            this.f42058f = type;
        }

        @Override // p471um.AbstractC11873h
        public Object fromJson(AbstractC11878m abstractC11878m) throws IOException {
            f fVar = this.f42056d;
            if (fVar == null) {
                return this.f42054b.fromJson(abstractC11878m);
            }
            if (!fVar.f42076g && abstractC11878m.mo44339u() == AbstractC11878m.c.NULL) {
                abstractC11878m.mo44336o();
                return null;
            }
            try {
                return this.f42056d.mo44286b(this.f42055c, abstractC11878m);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new C11875j(cause + " at " + abstractC11878m.getPath(), cause);
            }
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, Object obj) throws IOException {
            f fVar = this.f42053a;
            if (fVar == null) {
                this.f42054b.toJson(abstractC11885t, obj);
                return;
            }
            if (!fVar.f42076g && obj == null) {
                abstractC11885t.mo44381o();
                return;
            }
            try {
                fVar.mo44284e(this.f42055c, abstractC11885t, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new C11875j(cause + " at " + abstractC11885t.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f42057e + "(" + this.f42058f + ")";
        }
    }

    /* JADX INFO: renamed from: um.a$b */
    public class b extends f {
        public b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: e */
        public void mo44284e(C11888w c11888w, AbstractC11885t abstractC11885t, Object obj) {
            m44288d(abstractC11885t, obj);
        }
    }

    /* JADX INFO: renamed from: um.a$c */
    public class c extends f {

        /* JADX INFO: renamed from: h */
        public AbstractC11873h<Object> f42060h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Type[] f42061i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Type f42062j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Set f42063k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Set f42064l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f42061i = typeArr;
            this.f42062j = type2;
            this.f42063k = set2;
            this.f42064l = set3;
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: a */
        public void mo44285a(C11888w c11888w, AbstractC11873h.e eVar) {
            super.mo44285a(c11888w, eVar);
            this.f42060h = (C11866a0.m44292d(this.f42061i[0], this.f42062j) && this.f42063k.equals(this.f42064l)) ? c11888w.m44441i(eVar, this.f42062j, this.f42064l) : c11888w.m44438e(this.f42062j, this.f42064l);
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: e */
        public void mo44284e(C11888w c11888w, AbstractC11885t abstractC11885t, Object obj) {
            this.f42060h.toJson(abstractC11885t, m44287c(obj));
        }
    }

    /* JADX INFO: renamed from: um.a$d */
    public class d extends f {
        public d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: b */
        public Object mo44286b(C11888w c11888w, AbstractC11878m abstractC11878m) {
            return m44287c(abstractC11878m);
        }
    }

    /* JADX INFO: renamed from: um.a$e */
    public class e extends f {

        /* JADX INFO: renamed from: h */
        public AbstractC11873h<Object> f42065h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Type[] f42066i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Type f42067j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Set f42068k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Set f42069l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f42066i = typeArr;
            this.f42067j = type2;
            this.f42068k = set2;
            this.f42069l = set3;
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: a */
        public void mo44285a(C11888w c11888w, AbstractC11873h.e eVar) {
            super.mo44285a(c11888w, eVar);
            this.f42065h = (C11866a0.m44292d(this.f42066i[0], this.f42067j) && this.f42068k.equals(this.f42069l)) ? c11888w.m44441i(eVar, this.f42066i[0], this.f42068k) : c11888w.m44438e(this.f42066i[0], this.f42068k);
        }

        @Override // p471um.C11865a.f
        /* JADX INFO: renamed from: b */
        public Object mo44286b(C11888w c11888w, AbstractC11878m abstractC11878m) {
            return m44287c(this.f42065h.fromJson(abstractC11878m));
        }
    }

    /* JADX INFO: renamed from: um.a$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public final Type f42070a;

        /* JADX INFO: renamed from: b */
        public final Set<? extends Annotation> f42071b;

        /* JADX INFO: renamed from: c */
        public final Object f42072c;

        /* JADX INFO: renamed from: d */
        public final Method f42073d;

        /* JADX INFO: renamed from: e */
        public final int f42074e;

        /* JADX INFO: renamed from: f */
        public final AbstractC11873h<?>[] f42075f;

        /* JADX INFO: renamed from: g */
        public final boolean f42076g;

        public f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f42070a = C12494c.m46788a(type);
            this.f42071b = set;
            this.f42072c = obj;
            this.f42073d = method;
            this.f42074e = i11;
            this.f42075f = new AbstractC11873h[i10 - i11];
            this.f42076g = z10;
        }

        /* JADX INFO: renamed from: a */
        public void mo44285a(C11888w c11888w, AbstractC11873h.e eVar) {
            if (this.f42075f.length > 0) {
                Type[] genericParameterTypes = this.f42073d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f42073d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f42074e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setM46799l = C12494c.m46799l(parameterAnnotations[i10]);
                    this.f42075f[i10 - this.f42074e] = (C11866a0.m44292d(this.f42070a, type) && this.f42071b.equals(setM46799l)) ? c11888w.m44441i(eVar, type, setM46799l) : c11888w.m44438e(type, setM46799l);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public Object mo44286b(C11888w c11888w, AbstractC11878m abstractC11878m) {
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: c */
        public Object m44287c(Object obj) {
            AbstractC11873h<?>[] abstractC11873hArr = this.f42075f;
            Object[] objArr = new Object[abstractC11873hArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(abstractC11873hArr, 0, objArr, 1, abstractC11873hArr.length);
            try {
                return this.f42073d.invoke(this.f42072c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* JADX INFO: renamed from: d */
        public Object m44288d(Object obj, Object obj2) {
            AbstractC11873h<?>[] abstractC11873hArr = this.f42075f;
            Object[] objArr = new Object[abstractC11873hArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(abstractC11873hArr, 0, objArr, 2, abstractC11873hArr.length);
            try {
                return this.f42073d.invoke(this.f42072c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* JADX INFO: renamed from: e */
        public void mo44284e(C11888w c11888w, AbstractC11885t abstractC11885t, Object obj) {
            throw new AssertionError();
        }
    }

    public C11865a(List<f> list, List<f> list2) {
        this.f42051a = list;
        this.f42052b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static f m44279a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setM46798k = C12494c.m46798k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == AbstractC11878m.class && genericReturnType != cls && m44282d(1, genericParameterTypes)) {
            return new d(genericReturnType, setM46798k, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setM46798k, obj, method, genericParameterTypes.length, 1, C12494c.m46793f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, C12494c.m46799l(parameterAnnotations[0]), setM46798k);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    /* JADX INFO: renamed from: b */
    public static f m44280b(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (C11866a0.m44292d(fVar.f42070a, type) && fVar.f42071b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C11865a m44281c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(InterfaceC11891z.class)) {
                    f fVarM44283e = m44283e(obj, method);
                    f fVarM44280b = m44280b(arrayList, fVarM44283e.f42070a, fVarM44283e.f42071b);
                    if (fVarM44280b != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarM44280b.f42073d + "\n    " + fVarM44283e.f42073d);
                    }
                    arrayList.add(fVarM44283e);
                }
                if (method.isAnnotationPresent(InterfaceC11871f.class)) {
                    f fVarM44279a = m44279a(obj, method);
                    f fVarM44280b2 = m44280b(arrayList2, fVarM44279a.f42070a, fVarM44279a.f42071b);
                    if (fVarM44280b2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarM44280b2.f42073d + "\n    " + fVarM44279a.f42073d);
                    }
                    arrayList2.add(fVarM44279a);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new C11865a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m44282d(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != AbstractC11873h.class) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static f m44283e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == AbstractC11885t.class && genericReturnType == cls && m44282d(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], C12494c.m46799l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setM46798k = C12494c.m46798k(method);
            Set<? extends Annotation> setM46799l = C12494c.m46799l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setM46799l, obj, method, genericParameterTypes.length, 1, C12494c.m46793f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setM46799l, setM46798k);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // p471um.AbstractC11873h.e
    public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
        f fVarM44280b = m44280b(this.f42051a, type, set);
        f fVarM44280b2 = m44280b(this.f42052b, type, set);
        AbstractC11873h abstractC11873hM44441i = null;
        if (fVarM44280b == null && fVarM44280b2 == null) {
            return null;
        }
        if (fVarM44280b == null || fVarM44280b2 == null) {
            try {
                abstractC11873hM44441i = c11888w.m44441i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarM44280b == null ? "@ToJson" : "@FromJson") + " adapter for " + C12494c.m46808u(type, set), e10);
            }
        }
        AbstractC11873h abstractC11873h = abstractC11873hM44441i;
        if (fVarM44280b != null) {
            fVarM44280b.mo44285a(c11888w, this);
        }
        if (fVarM44280b2 != null) {
            fVarM44280b2.mo44285a(c11888w, this);
        }
        return new a(fVarM44280b, abstractC11873h, c11888w, fVarM44280b2, set, type);
    }
}
