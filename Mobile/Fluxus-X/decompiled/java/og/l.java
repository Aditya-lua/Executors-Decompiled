package og;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lg.a0;
import lg.b0;
import lg.u;
import ng.d0;
import ng.f0;
import ng.g0;
import ng.i0;
import ng.v;
import ng.w;
import ng.x;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f28160a;
    public final lg.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f28161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final og.e f28162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<lg.w> f28163e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends a0<T> {
        public a() {
        }

        @Override // lg.a0
        public T read(tg.a aVar) throws IOException {
            aVar.n0();
            return null;
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        @Override // lg.a0
        public void write(tg.c cVar, T t8) throws IOException {
            cVar.s();
        }
    }

    public class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f28165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Method f28166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a0 f28167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a0 f28168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f28169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f28170i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Field field, boolean z10, Method method, a0 a0Var, a0 a0Var2, boolean z11, boolean z12) {
            super(str, field);
            this.f28165d = z10;
            this.f28166e = method;
            this.f28167f = a0Var;
            this.f28168g = a0Var2;
            this.f28169h = z11;
            this.f28170i = z12;
        }

        @Override // og.l.d
        public void a(tg.a aVar, int i10, Object[] objArr) {
            Object obj = this.f28168g.read(aVar);
            if (obj != null || !this.f28169h) {
                objArr[i10] = obj;
                return;
            }
            throw new lg.p("null is not allowed as value for record component '" + this.f28174c + "' of primitive type; at path " + aVar.x());
        }

        @Override // og.l.d
        public void b(tg.a aVar, Object obj) throws IllegalAccessException {
            Object obj2 = this.f28168g.read(aVar);
            if (obj2 == null && this.f28169h) {
                return;
            }
            if (this.f28165d) {
                l.b(obj, this.b);
            } else if (this.f28170i) {
                throw new lg.m("Cannot set value of 'static final' " + qg.a.g(this.b, false));
            }
            this.b.set(obj, obj2);
        }

        @Override // og.l.d
        public void c(tg.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f28165d) {
                Method method = this.f28166e;
                if (method == null) {
                    l.b(obj, this.b);
                } else {
                    l.b(obj, method);
                }
            }
            Method method2 = this.f28166e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new lg.m("Accessor " + qg.a.g(this.f28166e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.p(this.f28173a);
            this.f28167f.write(cVar, objInvoke);
        }
    }

    public static abstract class c<T, A> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f28172a;

        public c(f fVar) {
            this.f28172a = fVar;
        }

        public abstract A a();

        public abstract T b(A a10);

        public abstract void c(A a10, tg.a aVar, d dVar);

        @Override // lg.a0
        public T read(tg.a aVar) throws IOException {
            if (aVar.Q() == tg.b.NULL) {
                aVar.K();
                return null;
            }
            A a10 = a();
            Map<String, d> map = this.f28172a.f28176a;
            try {
                aVar.c();
                while (aVar.p()) {
                    d dVar = map.get(aVar.E());
                    if (dVar == null) {
                        aVar.n0();
                    } else {
                        c(a10, aVar, dVar);
                    }
                }
                aVar.h();
                return b(a10);
            } catch (IllegalAccessException e10) {
                throw qg.a.e(e10);
            } catch (IllegalStateException e11) {
                throw new u(e11);
            }
        }

        @Override // lg.a0
        public void write(tg.c cVar, T t8) throws IOException {
            if (t8 == null) {
                cVar.s();
                return;
            }
            cVar.e();
            try {
                Iterator<d> it = this.f28172a.b.iterator();
                while (it.hasNext()) {
                    it.next().c(cVar, t8);
                }
                cVar.h();
            } catch (IllegalAccessException e10) {
                throw qg.a.e(e10);
            }
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28173a;
        public final Field b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28174c;

        public d(String str, Field field) {
            this.f28173a = str;
            this.b = field;
            this.f28174c = field.getName();
        }

        public abstract void a(tg.a aVar, int i10, Object[] objArr);

        public abstract void b(tg.a aVar, Object obj);

        public abstract void c(tg.c cVar, Object obj);
    }

    public static final class e<T> extends c<T, T> {
        public final d0<T> b;

        public e(d0<T> d0Var, f fVar) {
            super(fVar);
            this.b = d0Var;
        }

        @Override // og.l.c
        public T a() {
            return this.b.a();
        }

        @Override // og.l.c
        public T b(T t8) {
            return t8;
        }

        @Override // og.l.c
        public void c(T t8, tg.a aVar, d dVar) {
            dVar.b(aVar, t8);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f28175c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, d> f28176a;
        public final List<d> b;

        public f(Map<String, d> map, List<d> list) {
            this.f28176a = map;
            this.b = list;
        }
    }

    public static final class g<T> extends c<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Map<Class<?>, Object> f28177e = f();
        public final Constructor<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f28178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, Integer> f28179d;

        public g(Class<T> cls, f fVar, boolean z10) {
            super(fVar);
            this.f28179d = new HashMap();
            Constructor<T> constructorI = qg.a.i(cls);
            this.b = constructorI;
            if (z10) {
                l.b(null, constructorI);
            } else {
                qg.a.o(constructorI);
            }
            String[] strArrK = qg.a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f28179d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.f28178c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f28178c[i11] = f28177e.get(parameterTypes[i11]);
            }
        }

        public static Map<Class<?>, Object> f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // og.l.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.f28178c.clone();
        }

        @Override // og.l.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(Object[] objArr) {
            try {
                return this.b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw qg.a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + qg.a.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + qg.a.c(this.b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + qg.a.c(this.b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        @Override // og.l.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, tg.a aVar, d dVar) {
            Integer num = this.f28179d.get(dVar.f28174c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + qg.a.c(this.b) + "' for field with name '" + dVar.f28174c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public l(v vVar, lg.d dVar, w wVar, og.e eVar, List<lg.w> list) {
        this.f28160a = vVar;
        this.b = dVar;
        this.f28161c = wVar;
        this.f28162d = eVar;
        this.f28163e = list;
    }

    public static <M extends AccessibleObject & Member> void b(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (g0.a(m10, obj)) {
            return;
        }
        throw new lg.m(qg.a.g(m10, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public static IllegalArgumentException d(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + qg.a.f(field) + " and " + qg.a.f(field2) + "\nSee " + i0.a("duplicate-fields"));
    }

    public final d c(lg.f fVar, Field field, Method method, String str, sg.a<?> aVar, boolean z10, boolean z11) {
        a0<?> oVar;
        boolean zA = f0.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z12 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = true;
        }
        mg.b bVar = (mg.b) field.getAnnotation(mg.b.class);
        a0<?> a0VarC = bVar != null ? this.f28162d.c(this.f28160a, fVar, aVar, bVar, false) : null;
        boolean z13 = a0VarC != null;
        if (a0VarC == null) {
            a0VarC = fVar.m(aVar);
        }
        a0<?> a0Var = a0VarC;
        if (z10) {
            oVar = z13 ? a0Var : new o<>(fVar, a0Var, aVar.d());
        } else {
            oVar = a0Var;
        }
        return new b(str, field, z11, method, oVar, a0Var, zA, z12);
    }

    @Override // lg.b0
    public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (qg.a.l(clsC)) {
            return new a();
        }
        lg.w.a aVarB = g0.b(this.f28163e, clsC);
        if (aVarB != lg.w.a.BLOCK_ALL) {
            boolean z10 = aVarB == lg.w.a.BLOCK_INACCESSIBLE;
            return qg.a.m(clsC) ? new g(clsC, e(fVar, aVar, clsC, z10, true), z10) : new e(this.f28160a.w(aVar, true), e(fVar, aVar, clsC, z10, false));
        }
        throw new lg.m("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final f e(lg.f fVar, sg.a<?> aVar, Class<?> cls, boolean z10, boolean z11) {
        boolean z12;
        sg.a<?> aVar2;
        boolean z13;
        int i10;
        int i11;
        d dVar;
        if (cls.isInterface()) {
            return f.f28175c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        sg.a<?> aVarB = aVar;
        boolean z14 = z10;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            boolean z15 = true;
            boolean z16 = false;
            if (clsC != cls && declaredFields.length > 0) {
                lg.w.a aVarB2 = g0.b(this.f28163e, clsC);
                if (aVarB2 == lg.w.a.BLOCK_ALL) {
                    throw new lg.m("ReflectionAccessFilter does not permit using reflection for " + clsC + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z14 = aVarB2 == lg.w.a.BLOCK_INACCESSIBLE;
            }
            boolean z17 = z14;
            int length = declaredFields.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12;
                Field field = declaredFields[i13];
                boolean zG = this.g(field, z15);
                boolean zG2 = this.g(field, z16);
                if (zG || zG2) {
                    Method methodH = null;
                    if (!z11) {
                        z12 = zG2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z12 = z16;
                    } else {
                        methodH = qg.a.h(clsC, field);
                        if (!z17) {
                            qg.a.o(methodH);
                        }
                        if (methodH.getAnnotation(mg.c.class) != null && field.getAnnotation(mg.c.class) == null) {
                            throw new lg.m("@SerializedName on " + qg.a.g(methodH, z16) + " is not supported");
                        }
                        z12 = zG2;
                    }
                    if (!z17 && methodH == null) {
                        qg.a.o(field);
                    }
                    Type typeP = x.p(aVarB.d(), clsC, field.getGenericType());
                    List<String> listF = this.f(field);
                    aVar2 = aVarB;
                    z13 = false;
                    String str = listF.get(0);
                    i10 = i13;
                    i11 = length;
                    d dVarC = this.c(fVar, field, methodH, str, sg.a.b(typeP), zG, z17);
                    if (z12) {
                        for (String str2 : listF) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarC);
                            if (dVar2 != null) {
                                throw d(cls, str2, dVar2.b, field);
                            }
                        }
                    }
                    if (zG && (dVar = (d) linkedHashMap2.put(str, dVarC)) != null) {
                        throw d(cls, str, dVar.b, field);
                    }
                } else {
                    i11 = length;
                    i10 = i13;
                    aVar2 = aVarB;
                    z13 = z16;
                }
                i12 = i10 + 1;
                this = this;
                z16 = z13;
                aVarB = aVar2;
                length = i11;
                z15 = true;
            }
            aVarB = sg.a.b(x.p(aVarB.d(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
            z14 = z17;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final List<String> f(Field field) {
        String strB;
        List<String> listA;
        mg.c cVar = (mg.c) field.getAnnotation(mg.c.class);
        if (cVar == null) {
            strB = this.b.b(field);
            listA = this.b.a(field);
        } else {
            String strValue = cVar.value();
            List<String> listAsList = Arrays.asList(cVar.alternate());
            strB = strValue;
            listA = listAsList;
        }
        if (listA.isEmpty()) {
            return Collections.singletonList(strB);
        }
        ArrayList arrayList = new ArrayList(listA.size() + 1);
        arrayList.add(strB);
        arrayList.addAll(listA);
        return arrayList;
    }

    public final boolean g(Field field, boolean z10) {
        return !this.f28161c.c(field, z10);
    }
}
