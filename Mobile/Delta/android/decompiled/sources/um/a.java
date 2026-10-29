package um;

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
    public final List<f> f32351a;
    public final List<f> b;

    /* JADX INFO: renamed from: um.a$a, reason: collision with other inner class name */
    public class C0586a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f32352a;
        public final /* synthetic */ h b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f32353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f32354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set f32355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Type f32356f;

        public C0586a(f fVar, h hVar, w wVar, f fVar2, Set set, Type type) {
            this.f32352a = fVar;
            this.b = hVar;
            this.f32353c = wVar;
            this.f32354d = fVar2;
            this.f32355e = set;
            this.f32356f = type;
        }

        @Override // um.h
        public Object fromJson(m mVar) throws IOException {
            f fVar = this.f32354d;
            if (fVar == null) {
                return this.b.fromJson(mVar);
            }
            if (!fVar.f32373g && mVar.u() == m.c.NULL) {
                mVar.o();
                return null;
            }
            try {
                return this.f32354d.b(this.f32353c, mVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + mVar.getPath(), cause);
            }
        }

        @Override // um.h
        public void toJson(t tVar, Object obj) throws IOException {
            f fVar = this.f32352a;
            if (fVar == null) {
                this.b.toJson(tVar, obj);
                return;
            }
            if (!fVar.f32373g && obj == null) {
                tVar.o();
                return;
            }
            try {
                fVar.e(this.f32353c, tVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + tVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f32355e + "(" + this.f32356f + ")";
        }
    }

    public class b extends f {
        public b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // um.a.f
        public void e(w wVar, t tVar, Object obj) {
            d(tVar, obj);
        }
    }

    public class c extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h<Object> f32358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f32359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f32360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f32361k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f32362l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f32359i = typeArr;
            this.f32360j = type2;
            this.f32361k = set2;
            this.f32362l = set3;
        }

        @Override // um.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f32358h = (a0.d(this.f32359i[0], this.f32360j) && this.f32361k.equals(this.f32362l)) ? wVar.i(eVar, this.f32360j, this.f32362l) : wVar.e(this.f32360j, this.f32362l);
        }

        @Override // um.a.f
        public void e(w wVar, t tVar, Object obj) {
            this.f32358h.toJson(tVar, c(obj));
        }
    }

    public class d extends f {
        public d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // um.a.f
        public Object b(w wVar, m mVar) {
            return c(mVar);
        }
    }

    public class e extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h<Object> f32363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f32364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f32365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f32366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f32367l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f32364i = typeArr;
            this.f32365j = type2;
            this.f32366k = set2;
            this.f32367l = set3;
        }

        @Override // um.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f32363h = (a0.d(this.f32364i[0], this.f32365j) && this.f32366k.equals(this.f32367l)) ? wVar.i(eVar, this.f32364i[0], this.f32366k) : wVar.e(this.f32364i[0], this.f32366k);
        }

        @Override // um.a.f
        public Object b(w wVar, m mVar) {
            return c(this.f32363h.fromJson(mVar));
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f32368a;
        public final Set<? extends Annotation> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f32369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f32370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final h<?>[] f32372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f32373g;

        public f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f32368a = wm.c.a(type);
            this.b = set;
            this.f32369c = obj;
            this.f32370d = method;
            this.f32371e = i11;
            this.f32372f = new h[i10 - i11];
            this.f32373g = z10;
        }

        public void a(w wVar, h.e eVar) {
            if (this.f32372f.length > 0) {
                Type[] genericParameterTypes = this.f32370d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f32370d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f32371e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setL = wm.c.l(parameterAnnotations[i10]);
                    this.f32372f[i10 - this.f32371e] = (a0.d(this.f32368a, type) && this.b.equals(setL)) ? wVar.i(eVar, type, setL) : wVar.e(type, setL);
                }
            }
        }

        public Object b(w wVar, m mVar) {
            throw new AssertionError();
        }

        public Object c(Object obj) {
            h<?>[] hVarArr = this.f32372f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f32370d.invoke(this.f32369c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public Object d(Object obj, Object obj2) {
            h<?>[] hVarArr = this.f32372f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f32370d.invoke(this.f32369c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(w wVar, t tVar, Object obj) {
            throw new AssertionError();
        }
    }

    public a(List<f> list, List<f> list2) {
        this.f32351a = list;
        this.b = list2;
    }

    public static f a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setK = wm.c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == m.class && genericReturnType != cls && d(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, wm.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, wm.c.l(parameterAnnotations[0]), setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    public static f b(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (a0.d(fVar.f32368a, type) && fVar.b.equals(set)) {
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
                    f fVarB = b(arrayList, fVarE.f32368a, fVarE.b);
                    if (fVarB != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarB.f32370d + "\n    " + fVarE.f32370d);
                    }
                    arrayList.add(fVarE);
                }
                if (method.isAnnotationPresent(um.f.class)) {
                    f fVarA = a(obj, method);
                    f fVarB2 = b(arrayList2, fVarA.f32368a, fVarA.b);
                    if (fVarB2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarB2.f32370d + "\n    " + fVarA.f32370d);
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
            return new b(genericParameterTypes[1], wm.c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setK = wm.c.k(method);
            Set<? extends Annotation> setL = wm.c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, wm.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // um.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        f fVarB = b(this.f32351a, type, set);
        f fVarB2 = b(this.b, type, set);
        h hVarI = null;
        if (fVarB == null && fVarB2 == null) {
            return null;
        }
        if (fVarB == null || fVarB2 == null) {
            try {
                hVarI = wVar.i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarB == null ? "@ToJson" : "@FromJson") + " adapter for " + wm.c.u(type, set), e10);
            }
        }
        h hVar = hVarI;
        if (fVarB != null) {
            fVarB.a(wVar, this);
        }
        if (fVarB2 != null) {
            fVarB2.a(wVar, this);
        }
        return new C0586a(fVarB, hVar, wVar, fVarB2, set, type);
    }
}
