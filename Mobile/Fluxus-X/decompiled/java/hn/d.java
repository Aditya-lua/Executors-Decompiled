package hn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> extends h<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h.e f18327d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f18328a;
    public final b<?>[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f18329c;

    public class a implements h.e {
        public final void a(w wVar, Type type, Map<String, b<?>> map) {
            g gVar;
            Class<?> clsG = a0.g(type);
            boolean zJ = jn.c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (b(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = jn.c.q(type, clsG, field.getGenericType());
                    Set<? extends Annotation> setK = jn.c.k(field);
                    String name = field.getName();
                    h<T> hVarF = wVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strM = jn.c.m(name, gVar);
                    b<?> bVar = new b<>(strM, field, hVarF);
                    b<?> bVarPut = map.put(strM, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.b + "\n    " + bVar.b);
                    }
                }
            }
        }

        public final boolean b(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        public final void c(Type type, Class<?> cls) {
            Class<?> clsG = a0.g(type);
            if (cls.isAssignableFrom(clsG)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsG.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // hn.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsG = a0.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (jn.c.j(clsG)) {
                c(type, List.class);
                c(type, Set.class);
                c(type, Map.class);
                c(type, Collection.class);
                String str = "Platform " + clsG;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsG.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsG.getName());
            }
            if (clsG.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsG.getName());
            }
            if (clsG.getEnclosingClass() != null && !Modifier.isStatic(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsG.getName());
            }
            if (Modifier.isAbstract(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsG.getName());
            }
            if (jn.c.i(clsG)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsG.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c cVarA = c.a(clsG);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                a(wVar, type, treeMap);
                type = a0.f(type);
            }
            return new d(cVarA, treeMap).nullSafe();
        }
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18330a;
        public final Field b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h<T> f18331c;

        public b(String str, Field field, h<T> hVar) {
            this.f18330a = str;
            this.b = field;
            this.f18331c = hVar;
        }

        public void a(m mVar, Object obj) throws IllegalAccessException {
            this.b.set(obj, this.f18331c.fromJson(mVar));
        }

        public void b(t tVar, Object obj) throws IllegalAccessException {
            this.f18331c.toJson(tVar, (T) this.b.get(obj));
        }
    }

    public d(c<T> cVar, Map<String, b<?>> map) {
        this.f18328a = cVar;
        this.b = (b[]) map.values().toArray(new b[map.size()]);
        this.f18329c = m.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // hn.h
    public T fromJson(m mVar) {
        try {
            T tB = this.f18328a.b();
            try {
                mVar.b();
                while (mVar.f()) {
                    int I = mVar.I(this.f18329c);
                    if (I == -1) {
                        mVar.O();
                        mVar.Q();
                    } else {
                        this.b[I].a(mVar, tB);
                    }
                }
                mVar.d();
                return tB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw jn.c.t(e11);
        }
    }

    @Override // hn.h
    public void toJson(t tVar, T t8) {
        try {
            tVar.c();
            for (b<?> bVar : this.b) {
                tVar.o(bVar.f18330a);
                bVar.b(tVar, t8);
            }
            tVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f18328a + ")";
    }
}
