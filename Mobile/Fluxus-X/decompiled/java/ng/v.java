package ng;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, lg.h<?>> f25565a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<lg.w> f25566c;

    public v(Map<Type, lg.h<?>> map, boolean z10, List<lg.w> list) {
        this.f25565a = map;
        this.b = z10;
        this.f25566c = list;
    }

    public static <T> d0<T> A(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (d0<T>) y(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (d0<T>) B(type, cls);
        }
        return null;
    }

    public static d0<? extends Map<? extends Object, Object>> B(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(b0.class) && x(type)) {
            return new d0() { // from class: ng.e
                @Override // ng.d0
                public final Object a() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new d0() { // from class: ng.f
                @Override // ng.d0
                public final Object a() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new d0() { // from class: ng.g
                @Override // ng.d0
                public final Object a() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new d0() { // from class: ng.h
                @Override // ng.d0
                public final Object a() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new d0() { // from class: ng.i
                @Override // ng.d0
                public final Object a() {
                    return v.h();
                }
            };
        }
        return null;
    }

    public static <T> d0<T> C(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new d0() { // from class: ng.c
                @Override // ng.d0
                public final Object a() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new d0() { // from class: ng.d
                @Override // ng.d0
                public final Object a() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new lg.m(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return j0.f25555a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new lg.m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new lg.m("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new lg.m(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new lg.m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new lg.m("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new lg.m(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new lg.m(str);
    }

    public static /* synthetic */ Map p() {
        return new b0();
    }

    public static /* synthetic */ Object q(String str) {
        throw new lg.m(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw qg.a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + qg.a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + qg.a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new lg.m(str);
    }

    public static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + i0.a("r8-abstract-class");
    }

    public static boolean x(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && x.k(actualTypeArguments[0]) == String.class;
    }

    public static d0<? extends Collection<? extends Object>> y(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new d0() { // from class: ng.q
                @Override // ng.d0
                public final Object a() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new d0() { // from class: ng.r
                @Override // ng.d0
                public final Object a() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new d0() { // from class: ng.s
                @Override // ng.d0
                public final Object a() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new d0() { // from class: ng.t
                @Override // ng.d0
                public final Object a() {
                    return v.t();
                }
            };
        }
        return null;
    }

    public static <T> d0<T> z(Class<? super T> cls, lg.w.a aVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            lg.w.a aVar2 = lg.w.a.ALLOW;
            if (aVar == aVar2 || (g0.a(declaredConstructor, null) && (aVar != lg.w.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strP = qg.a.p(declaredConstructor)) == null) ? new d0() { // from class: ng.m
                    @Override // ng.d0
                    public final Object a() {
                        return v.s(declaredConstructor);
                    }
                } : new d0() { // from class: ng.k
                    @Override // ng.d0
                    public final Object a() {
                        return v.k(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new d0() { // from class: ng.j
                @Override // ng.d0
                public final Object a() {
                    return v.n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> d0<T> D(final Class<? super T> cls) {
        if (this.b) {
            return new d0() { // from class: ng.u
                @Override // ng.d0
                public final Object a() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new d0() { // from class: ng.b
            @Override // ng.d0
            public final Object a() {
                return v.o(str);
            }
        };
    }

    public String toString() {
        return this.f25565a.toString();
    }

    public <T> d0<T> w(sg.a<T> aVar, boolean z10) {
        final Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        final lg.h<?> hVar = this.f25565a.get(typeD);
        if (hVar != null) {
            return new d0() { // from class: ng.a
                @Override // ng.d0
                public final Object a() {
                    return hVar.a(typeD);
                }
            };
        }
        final lg.h<?> hVar2 = this.f25565a.get(clsC);
        if (hVar2 != null) {
            return new d0() { // from class: ng.l
                @Override // ng.d0
                public final Object a() {
                    return hVar2.a(typeD);
                }
            };
        }
        d0<T> d0VarC = C(typeD, clsC);
        if (d0VarC != null) {
            return d0VarC;
        }
        lg.w.a aVarB = g0.b(this.f25566c, clsC);
        d0<T> d0VarZ = z(clsC, aVarB);
        if (d0VarZ != null) {
            return d0VarZ;
        }
        d0<T> d0VarA = A(typeD, clsC);
        if (d0VarA != null) {
            return d0VarA;
        }
        final String strV = v(clsC);
        if (strV != null) {
            return new d0() { // from class: ng.n
                @Override // ng.d0
                public final Object a() {
                    return v.q(strV);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + clsC + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new d0() { // from class: ng.o
                @Override // ng.d0
                public final Object a() {
                    return v.d(str);
                }
            };
        }
        if (aVarB == lg.w.a.ALLOW) {
            return D(clsC);
        }
        final String str2 = "Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new d0() { // from class: ng.p
            @Override // ng.d0
            public final Object a() {
                return v.u(str2);
            }
        };
    }
}
