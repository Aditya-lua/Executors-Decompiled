package p471um;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import p522wm.C12494c;

/* JADX INFO: renamed from: um.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11866a0 {
    /* JADX INFO: renamed from: a */
    public static Type m44289a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static GenericArrayType m44290b(Type type) {
        return new C12494c.a(type);
    }

    /* JADX INFO: renamed from: c */
    public static Type m44291c(Type type, Class<?> cls) {
        Type typeM44296h = m44296h(type, cls, Collection.class);
        if (typeM44296h instanceof WildcardType) {
            typeM44296h = ((WildcardType) typeM44296h).getUpperBounds()[0];
        }
        return typeM44296h instanceof ParameterizedType ? ((ParameterizedType) typeM44296h).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m44292d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m44292d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m44292d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C12494c.b ? ((C12494c.b) parameterizedType).f44664c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C12494c.b ? ((C12494c.b) parameterizedType2).f44664c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m44292d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m44292d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: e */
    public static String m44293e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* JADX INFO: renamed from: f */
    public static Type m44294f(Type type) {
        Class<?> clsM44295g = m44295g(type);
        return C12494c.m46804q(type, clsM44295g, clsM44295g.getGenericSuperclass());
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m44295g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m44295g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m44295g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: h */
    public static Type m44296h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C12494c.m46804q(type, cls, C12494c.m46792e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: i */
    public static Type[] m44297i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM44296h = m44296h(type, cls, Map.class);
        return typeM44296h instanceof ParameterizedType ? ((ParameterizedType) typeM44296h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: j */
    public static ParameterizedType m44298j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C12494c.b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* JADX INFO: renamed from: k */
    public static WildcardType m44299k(Type type) {
        return new C12494c.c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, C12494c.f44657b);
    }

    /* JADX INFO: renamed from: l */
    public static WildcardType m44300l(Type type) {
        return new C12494c.c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}
