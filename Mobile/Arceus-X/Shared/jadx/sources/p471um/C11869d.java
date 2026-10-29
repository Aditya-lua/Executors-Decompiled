package p471um;

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
import p522wm.C12494c;

/* JADX INFO: renamed from: um.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C11869d<T> extends AbstractC11873h<T> {

    /* JADX INFO: renamed from: d */
    public static final AbstractC11873h.e f42090d = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC11868c<T> f42091a;

    /* JADX INFO: renamed from: b */
    public final b<?>[] f42092b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11878m.b f42093c;

    /* JADX INFO: renamed from: um.d$a */
    public class a implements AbstractC11873h.e {
        /* JADX INFO: renamed from: a */
        public final void m44303a(C11888w c11888w, Type type, Map<String, b<?>> map) {
            InterfaceC11872g interfaceC11872g;
            Class<?> clsM44295g = C11866a0.m44295g(type);
            boolean zM46797j = C12494c.m46797j(clsM44295g);
            for (Field field : clsM44295g.getDeclaredFields()) {
                if (m44304b(zM46797j, field.getModifiers()) && ((interfaceC11872g = (InterfaceC11872g) field.getAnnotation(InterfaceC11872g.class)) == null || !interfaceC11872g.ignore())) {
                    Type typeM46804q = C12494c.m46804q(type, clsM44295g, field.getGenericType());
                    Set<? extends Annotation> setM46798k = C12494c.m46798k(field);
                    String name = field.getName();
                    AbstractC11873h<T> abstractC11873hM44439f = c11888w.m44439f(typeM46804q, setM46798k, name);
                    field.setAccessible(true);
                    String strM46801n = C12494c.m46801n(name, interfaceC11872g);
                    b<?> bVar = new b<>(strM46801n, field, abstractC11873hM44439f);
                    b<?> bVarPut = map.put(strM46801n, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f42095b + "\n    " + bVar.f42095b);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m44304b(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        /* JADX INFO: renamed from: c */
        public final void m44305c(Type type, Class<?> cls) {
            Class<?> clsM44295g = C11866a0.m44295g(type);
            if (cls.isAssignableFrom(clsM44295g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM44295g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsM44295g = C11866a0.m44295g(type);
            if (clsM44295g.isInterface() || clsM44295g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C12494c.m46797j(clsM44295g)) {
                m44305c(type, List.class);
                m44305c(type, Set.class);
                m44305c(type, Map.class);
                m44305c(type, Collection.class);
                String str = "Platform " + clsM44295g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsM44295g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsM44295g.getName());
            }
            if (clsM44295g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsM44295g.getName());
            }
            if (clsM44295g.getEnclosingClass() != null && !Modifier.isStatic(clsM44295g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsM44295g.getName());
            }
            if (Modifier.isAbstract(clsM44295g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsM44295g.getName());
            }
            if (C12494c.m46796i(clsM44295g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM44295g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            AbstractC11868c abstractC11868cM44301a = AbstractC11868c.m44301a(clsM44295g);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                m44303a(c11888w, type, treeMap);
                type = C11866a0.m44294f(type);
            }
            return new C11869d(abstractC11868cM44301a, treeMap).nullSafe();
        }
    }

    /* JADX INFO: renamed from: um.d$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public final String f42094a;

        /* JADX INFO: renamed from: b */
        public final Field f42095b;

        /* JADX INFO: renamed from: c */
        public final AbstractC11873h<T> f42096c;

        public b(String str, Field field, AbstractC11873h<T> abstractC11873h) {
            this.f42094a = str;
            this.f42095b = field;
            this.f42096c = abstractC11873h;
        }

        /* JADX INFO: renamed from: a */
        public void m44306a(AbstractC11878m abstractC11878m, Object obj) throws IllegalAccessException {
            this.f42095b.set(obj, this.f42096c.fromJson(abstractC11878m));
        }

        /* JADX INFO: renamed from: b */
        public void m44307b(AbstractC11885t abstractC11885t, Object obj) throws IllegalAccessException {
            this.f42096c.toJson(abstractC11885t, (T) this.f42095b.get(obj));
        }
    }

    public C11869d(AbstractC11868c<T> abstractC11868c, Map<String, b<?>> map) {
        this.f42091a = abstractC11868c;
        this.f42092b = (b[]) map.values().toArray(new b[map.size()]);
        this.f42093c = AbstractC11878m.b.m44343a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // p471um.AbstractC11873h
    public T fromJson(AbstractC11878m abstractC11878m) {
        try {
            T tMo44302b = this.f42091a.mo44302b();
            try {
                abstractC11878m.mo44325b();
                while (abstractC11878m.mo44329f()) {
                    int iMo44316F = abstractC11878m.mo44316F(this.f42093c);
                    if (iMo44316F == -1) {
                        abstractC11878m.mo44320M();
                        abstractC11878m.mo44321P();
                    } else {
                        this.f42092b[iMo44316F].m44306a(abstractC11878m, tMo44302b);
                    }
                }
                abstractC11878m.mo44327d();
                return tMo44302b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw C12494c.m46807t(e11);
        }
    }

    @Override // p471um.AbstractC11873h
    public void toJson(AbstractC11885t abstractC11885t, T t8) {
        try {
            abstractC11885t.mo44374c();
            for (b<?> bVar : this.f42092b) {
                abstractC11885t.mo44380n(bVar.f42094a);
                bVar.m44307b(abstractC11885t, t8);
            }
            abstractC11885t.mo44378g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f42091a + ")";
    }
}
