package sm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f31541a;
    public final List<f> b;

    /* JADX INFO: renamed from: sm.a$a, reason: collision with other inner class name */
    public class C0558a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31542a;
        public final /* synthetic */ h b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f31543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f31544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set f31545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Type f31546f;

        public C0558a(f fVar, h hVar, w wVar, f fVar2, Set set, Type type) {
            this.f31542a = fVar;
            this.b = hVar;
            this.f31543c = wVar;
            this.f31544d = fVar2;
            this.f31545e = set;
            this.f31546f = type;
        }

        @Override // sm.h
        public Object fromJson(m mVar) throws IOException {
            f fVar = this.f31544d;
            if (fVar == null) {
                return this.b.fromJson(mVar);
            }
            if (!fVar.f31563g && mVar.u() == m.c.NULL) {
                mVar.o();
                return null;
            }
            try {
                return this.f31544d.b(this.f31543c, mVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + mVar.getPath(), cause);
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) throws IOException {
            f fVar = this.f31542a;
            if (fVar == null) {
                this.b.toJson(tVar, obj);
                return;
            }
            if (!fVar.f31563g && obj == null) {
                tVar.o();
                return;
            }
            try {
                fVar.e(this.f31543c, tVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + tVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f31545e + "(" + this.f31546f + ")";
        }
    }

    public class b extends f {
        public b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // sm.a.f
        public void e(w wVar, t tVar, Object obj) {
            d(tVar, obj);
        }
    }

    public class c extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h<Object> f31548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f31549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f31550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f31551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f31552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f31549i = typeArr;
            this.f31550j = type2;
            this.f31551k = set2;
            this.f31552l = set3;
        }

        @Override // sm.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f31548h = (a0.d(this.f31549i[0], this.f31550j) && this.f31551k.equals(this.f31552l)) ? wVar.i(eVar, this.f31550j, this.f31552l) : wVar.e(this.f31550j, this.f31552l);
        }

        @Override // sm.a.f
        public void e(w wVar, t tVar, Object obj) {
            this.f31548h.toJson(tVar, c(obj));
        }
    }

    public class d extends f {
        public d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // sm.a.f
        public Object b(w wVar, m mVar) {
            return c(mVar);
        }
    }

    public class e extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h<Object> f31553h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f31554i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f31555j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f31556k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f31557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f31554i = typeArr;
            this.f31555j = type2;
            this.f31556k = set2;
            this.f31557l = set3;
        }

        @Override // sm.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f31553h = (a0.d(this.f31554i[0], this.f31555j) && this.f31556k.equals(this.f31557l)) ? wVar.i(eVar, this.f31554i[0], this.f31556k) : wVar.e(this.f31554i[0], this.f31556k);
        }

        @Override // sm.a.f
        public Object b(w wVar, m mVar) {
            return c(this.f31553h.fromJson(mVar));
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f31558a;
        public final Set<? extends Annotation> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f31559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f31560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final h<?>[] f31562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f31563g;

        public f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f31558a = um.c.a(type);
            this.b = set;
            this.f31559c = obj;
            this.f31560d = method;
            this.f31561e = i11;
            this.f31562f = new h[i10 - i11];
            this.f31563g = z10;
        }

        public void a(w wVar, h.e eVar) {
            if (this.f31562f.length > 0) {
                Type[] genericParameterTypes = this.f31560d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f31560d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f31561e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setL = um.c.l(parameterAnnotations[i10]);
                    this.f31562f[i10 - this.f31561e] = (a0.d(this.f31558a, type) && this.b.equals(setL)) ? wVar.i(eVar, type, setL) : wVar.e(type, setL);
                }
            }
        }

        public Object b(w wVar, m mVar) {
            throw new AssertionError();
        }

        public Object c(Object obj) {
            h<?>[] hVarArr = this.f31562f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f31560d.invoke(this.f31559c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public Object d(Object obj, Object obj2) {
            h<?>[] hVarArr = this.f31562f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f31560d.invoke(this.f31559c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(w wVar, t tVar, Object obj) {
            throw new AssertionError();
        }
    }

    public a(List<f> list, List<f> list2) {
        this.f31541a = list;
        this.b = list2;
    }

    public static f a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setK = um.c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == m.class && genericReturnType != cls && d(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, um.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, um.c.l(parameterAnnotations[0]), setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    public static f b(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (a0.d(fVar.f31558a, type) && fVar.b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(z.class)) {
                    f fVarE = e(obj, method);
                    f fVarB = b(arrayList, fVarE.f31558a, fVarE.b);
                    if (fVarB != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarB.f31560d + "\n    " + fVarE.f31560d);
                    }
                    arrayList.add(fVarE);
                }
                if (method.isAnnotationPresent(sm.f.class)) {
                    f fVarA = a(obj, method);
                    f fVarB2 = b(arrayList2, fVarA.f31558a, fVarA.b);
                    if (fVarB2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarB2.f31560d + "\n    " + fVarA.f31560d);
                    }
                    arrayList2.add(fVarA);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    public static boolean d(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != h.class) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static f e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == t.class && genericReturnType == cls && d(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], um.c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setK = um.c.k(method);
            Set<? extends Annotation> setL = um.c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, um.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // sm.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        f fVarB = b(this.f31541a, type, set);
        f fVarB2 = b(this.b, type, set);
        h hVarI = null;
        if (fVarB == null && fVarB2 == null) {
            return null;
        }
        if (fVarB == null || fVarB2 == null) {
            try {
                hVarI = wVar.i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarB == null ? "@ToJson" : "@FromJson") + " adapter for " + um.c.u(type, set), e10);
            }
        }
        h hVar = hVarI;
        if (fVarB != null) {
            fVarB.a(wVar, this);
        }
        if (fVarB2 != null) {
            fVarB2.a(wVar, this);
        }
        return new C0558a(fVarB, hVar, wVar, fVarB2, set, type);
    }
}
