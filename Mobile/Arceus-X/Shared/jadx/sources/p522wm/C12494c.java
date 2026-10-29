package p522wm;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.url._UrlKt;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.C11866a0;
import p471um.C11875j;
import p471um.C11888w;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11877l;

/* JADX INFO: renamed from: wm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C12494c {

    /* JADX INFO: renamed from: a */
    public static final Set<Annotation> f44656a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b */
    public static final Type[] f44657b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class<?> f44658c;

    /* JADX INFO: renamed from: d */
    public static final Class<? extends Annotation> f44659d;

    /* JADX INFO: renamed from: e */
    public static final Map<Class<?>, Class<?>> f44660e;

    /* JADX INFO: renamed from: wm.c$a */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        public final Type f44661a;

        public a(Type type) {
            this.f44661a = C12494c.m46788a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C11866a0.m44292d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f44661a;
        }

        public int hashCode() {
            return this.f44661a.hashCode();
        }

        public String toString() {
            return C12494c.m46809v(this.f44661a) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: renamed from: wm.c$b */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        public final Type f44662a;

        /* JADX INFO: renamed from: b */
        public final Type f44663b;

        /* JADX INFO: renamed from: c */
        public final Type[] f44664c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C11866a0.m44295g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f44662a = type == null ? null : C12494c.m46788a(type);
            this.f44663b = C12494c.m46788a(type2);
            this.f44664c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f44664c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                C12494c.m46789b(this.f44664c[i10]);
                Type[] typeArr3 = this.f44664c;
                typeArr3[i10] = C12494c.m46788a(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C11866a0.m44292d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f44664c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f44662a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f44663b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f44664c) ^ this.f44663b.hashCode()) ^ C12494c.m46794g(this.f44662a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f44664c.length + 1) * 30);
            sb2.append(C12494c.m46809v(this.f44663b));
            if (this.f44664c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(C12494c.m46809v(this.f44664c[0]));
            for (int i10 = 1; i10 < this.f44664c.length; i10++) {
                sb2.append(", ");
                sb2.append(C12494c.m46809v(this.f44664c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: wm.c$c */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a */
        public final Type f44665a;

        /* JADX INFO: renamed from: b */
        public final Type f44666b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C12494c.m46789b(typeArr[0]);
                this.f44666b = null;
                this.f44665a = C12494c.m46788a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C12494c.m46789b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f44666b = C12494c.m46788a(typeArr2[0]);
            this.f44665a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C11866a0.m44292d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f44666b;
            return type != null ? new Type[]{type} : C12494c.f44657b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f44665a};
        }

        public int hashCode() {
            Type type = this.f44666b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f44665a.hashCode() + 31);
        }

        public String toString() {
            if (this.f44666b != null) {
                return "? super " + C12494c.m46809v(this.f44666b);
            }
            if (this.f44665a == Object.class) {
                return "?";
            }
            return "? extends " + C12494c.m46809v(this.f44665a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f44659d = cls;
        f44658c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f44660e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m46788a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m46788a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m46789b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m46790c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC11873h<?> m46791d(C11888w c11888w, Type type, Class<?> cls) throws NoSuchMethodException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        InterfaceC11874i interfaceC11874i = (InterfaceC11874i) cls.getAnnotation(InterfaceC11874i.class);
        Class<?> cls2 = null;
        if (interfaceC11874i == null || !interfaceC11874i.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(C11866a0.m44293e(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(C11888w.class, Type[].class);
                            objArr = new Object[]{c11888w, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            objArr = new Object[]{c11888w};
                            declaredConstructor = cls3.getDeclaredConstructor(C11888w.class);
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((AbstractC11873h) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e11) {
                e = e11;
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
        } catch (InvocationTargetException e15) {
            throw m46807t(e15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Type m46792e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m46792e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m46792e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m46793f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static int m46794g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX INFO: renamed from: h */
    public static int m46795h(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m46796i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f44659d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m46797j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX INFO: renamed from: k */
    public static Set<? extends Annotation> m46798k(AnnotatedElement annotatedElement) {
        return m46799l(annotatedElement.getAnnotations());
    }

    /* JADX INFO: renamed from: l */
    public static Set<? extends Annotation> m46799l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC11877l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f44656a;
    }

    /* JADX INFO: renamed from: m */
    public static String m46800m(String str, AnnotatedElement annotatedElement) {
        return m46801n(str, (InterfaceC11872g) annotatedElement.getAnnotation(InterfaceC11872g.class));
    }

    /* JADX INFO: renamed from: n */
    public static String m46801n(String str, InterfaceC11872g interfaceC11872g) {
        if (interfaceC11872g != null) {
            String strName = interfaceC11872g.name();
            if (!"\u0000".equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public static C11875j m46802o(String str, String str2, AbstractC11878m abstractC11878m) {
        String path = abstractC11878m.getPath();
        return new C11875j(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    /* JADX INFO: renamed from: p */
    public static Type m46803p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: q */
    public static Type m46804q(Type type, Class<?> cls, Type type2) {
        return m46805r(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:? */
    /* JADX INFO: renamed from: r */
    public static Type m46805r(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        Type typeM46805r;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m46806s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM46805r2 = m46805r(type, cls, componentType, collection);
                return componentType == typeM46805r2 ? cls2 : C11866a0.m44290b(typeM46805r2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM46805r3 = m46805r(type, cls, genericComponentType, collection);
            return genericComponentType == typeM46805r3 ? genericArrayType : C11866a0.m44290b(typeM46805r3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM46805r4 = m46805r(type, cls, ownerType, collection);
            boolean z10 = typeM46805r4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeM46805r5 = m46805r(type, cls, actualTypeArguments[i10], collection);
                if (typeM46805r5 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeM46805r5;
                }
            }
            return z10 ? new b(typeM46805r4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM46805r6 = m46805r(type, cls, lowerBounds[0], collection);
                if (typeM46805r6 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return C11866a0.m44300l(typeM46805r6);
                }
            } else if (upperBounds.length == 1 && (typeM46805r = m46805r(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                return C11866a0.m44299k(typeM46805r);
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    /* JADX INFO: renamed from: s */
    public static Type m46806s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM46790c = m46790c(typeVariable);
        if (clsM46790c != null) {
            Type typeM46792e = m46792e(type, cls, clsM46790c);
            if (typeM46792e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM46792e).getActualTypeArguments()[m46795h(clsM46790c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX INFO: renamed from: t */
    public static RuntimeException m46807t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    /* JADX INFO: renamed from: u */
    public static String m46808u(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public static String m46809v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m46810w(Type type, Type type2) {
        return C11866a0.m44292d(type, type2);
    }

    /* JADX INFO: renamed from: x */
    public static C11875j m46811x(String str, String str2, AbstractC11878m abstractC11878m) {
        String path = abstractC11878m.getPath();
        return new C11875j(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }
}
