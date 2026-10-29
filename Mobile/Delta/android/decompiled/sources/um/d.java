package um;

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
    public static final h.e f32382d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f32383a;
    public final b<?>[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f32384c;

    public class a implements h.e {
        public final void a(w wVar, Type type, Map<String, b<?>> map) {
            g gVar;
            Class<?> clsG = a0.g(type);
            boolean zJ = wm.c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (b(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = wm.c.q(type, clsG, field.getGenericType());
                    Set<? extends Annotation> setK = wm.c.k(field);
                    String name = field.getName();
                    h<T> hVarF = wVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strN = wm.c.n(name, gVar);
                    b<?> bVar = new b<>(strN, field, hVarF);
                    b<?> bVarPut = map.put(strN, bVar);
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

        @Override // um.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsG = a0.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (wm.c.j(clsG)) {
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
            if (wm.c.i(clsG)) {
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
        public final String f32385a;
        public final Field b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h<T> f32386c;

        public b(String str, Field field, h<T> hVar) {
            this.f32385a = str;
            this.b = field;
            this.f32386c = hVar;
        }

        public void a(m mVar, Object obj) throws IllegalAccessException {
            this.b.set(obj, this.f32386c.fromJson(mVar));
        }

        public void b(t tVar, Object obj) throws IllegalAccessException {
            this.f32386c.toJson(tVar, (T) this.b.get(obj));
        }
    }

    public d(c<T> cVar, Map<String, b<?>> map) {
        this.f32383a = cVar;
        this.b = (b[]) map.values().toArray(new b[map.size()]);
        this.f32384c = m.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // um.h
    public T fromJson(m mVar) {
        try {
            T tB = this.f32383a.b();
            try {
                mVar.b();
                while (mVar.f()) {
                    int iF = mVar.F(this.f32384c);
                    if (iF == -1) {
                        mVar.M();
                        mVar.P();
                    } else {
                        this.b[iF].a(mVar, tB);
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
            throw wm.c.t(e11);
        }
    }

    @Override // um.h
    public void toJson(t tVar, T t8) {
        try {
            tVar.c();
            for (b<?> bVar : this.b) {
                tVar.n(bVar.f32385a);
                bVar.b(tVar, t8);
            }
            tVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f32383a + ")";
    }
}
