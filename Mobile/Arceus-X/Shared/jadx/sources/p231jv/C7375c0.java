package p231jv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;
import p560xu.C12924e;

/* JADX INFO: renamed from: jv.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7375c0 {

    /* JADX INFO: renamed from: a */
    public static final Type[] f28286a = new Type[0];

    /* JADX INFO: renamed from: b */
    public static boolean f28287b = true;

    /* JADX INFO: renamed from: jv.c0$a */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        public final Type f28288a;

        public a(Type type) {
            this.f28288a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C7375c0.m30553d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f28288a;
        }

        public int hashCode() {
            return this.f28288a.hashCode();
        }

        public String toString() {
            return C7375c0.m30570u(this.f28288a) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: renamed from: jv.c0$b */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        public final Type f28289a;

        /* JADX INFO: renamed from: b */
        public final Type f28290b;

        /* JADX INFO: renamed from: c */
        public final Type[] f28291c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C7375c0.m30551b(type3);
            }
            this.f28289a = type;
            this.f28290b = type2;
            this.f28291c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C7375c0.m30553d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f28291c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f28289a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f28290b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f28291c) ^ this.f28290b.hashCode();
            Type type = this.f28289a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f28291c;
            if (typeArr.length == 0) {
                return C7375c0.m30570u(this.f28290b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(C7375c0.m30570u(this.f28290b));
            sb2.append("<");
            sb2.append(C7375c0.m30570u(this.f28291c[0]));
            for (int i10 = 1; i10 < this.f28291c.length; i10++) {
                sb2.append(", ");
                sb2.append(C7375c0.m30570u(this.f28291c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: jv.c0$c */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a */
        public final Type f28292a;

        /* JADX INFO: renamed from: b */
        public final Type f28293b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C7375c0.m30551b(typeArr[0]);
                this.f28293b = null;
                this.f28292a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            C7375c0.m30551b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f28293b = typeArr2[0];
            this.f28292a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C7375c0.m30553d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f28293b;
            return type != null ? new Type[]{type} : C7375c0.f28286a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f28292a};
        }

        public int hashCode() {
            Type type = this.f28293b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f28292a.hashCode() + 31);
        }

        public String toString() {
            if (this.f28293b != null) {
                return "? super " + C7375c0.m30570u(this.f28293b);
            }
            if (this.f28292a == Object.class) {
                return "?";
            }
            return "? extends " + C7375c0.m30570u(this.f28292a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ResponseBody m30550a(ResponseBody responseBody) {
        C12924e c12924e = new C12924e();
        responseBody.source().mo48003K2(c12924e);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), c12924e);
    }

    /* JADX INFO: renamed from: b */
    public static void m30551b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m30552c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m30553d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m30553d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m30554e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m30554e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m30554e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: f */
    public static Type m30555f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* JADX INFO: renamed from: g */
    public static Type m30556g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* JADX INFO: renamed from: h */
    public static Class<?> m30557h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m30557h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m30557h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: i */
    public static Type m30558i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m30567r(type, cls, m30554e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m30559j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m30559j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m30559j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: k */
    public static int m30560k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m30561l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m30562m(Type type) {
        return f28287b && type == Unit.class;
    }

    /* JADX INFO: renamed from: n */
    public static RuntimeException m30563n(Method method, String str, Object... objArr) {
        return m30564o(method, null, str, objArr);
    }

    /* JADX INFO: renamed from: o */
    public static RuntimeException m30564o(Method method, Throwable th2, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th2);
    }

    /* JADX INFO: renamed from: p */
    public static RuntimeException m30565p(Method method, int i10, String str, Object... objArr) {
        return m30563n(method, str + " (" + C7392t.f28408b.mo30621a(method, i10) + ")", objArr);
    }

    /* JADX INFO: renamed from: q */
    public static RuntimeException m30566q(Method method, Throwable th2, int i10, String str, Object... objArr) {
        return m30564o(method, th2, str + " (" + C7392t.f28408b.mo30621a(method, i10) + ")", objArr);
    }

    /* JADX INFO: renamed from: r */
    public static Type m30567r(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeM30567r;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeM30568s = m30568s(type, cls, typeVariable);
            if (typeM30568s == typeVariable) {
                return typeM30568s;
            }
            type4 = typeM30568s;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM30567r2 = m30567r(type, cls, componentType);
                return componentType == typeM30567r2 ? cls2 : new a(typeM30567r2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM30567r3 = m30567r(type, cls, genericComponentType);
            return genericComponentType == typeM30567r3 ? genericArrayType : new a(typeM30567r3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM30567r4 = m30567r(type, cls, ownerType);
            boolean z10 = typeM30567r4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeM30567r5 = m30567r(type, cls, actualTypeArguments[i10]);
                if (typeM30567r5 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeM30567r5;
                }
            }
            return z10 ? new b(typeM30567r4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM30567r6 = m30567r(type, cls, lowerBounds[0]);
                if (typeM30567r6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new c(new Type[]{Object.class}, new Type[]{typeM30567r6});
                }
            } else if (upperBounds.length == 1 && (typeM30567r = m30567r(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new c(new Type[]{typeM30567r}, f28286a);
            }
        }
        type3 = type4;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        return type3;
    }

    /* JADX INFO: renamed from: s */
    public static Type m30568s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM30552c = m30552c(typeVariable);
        if (clsM30552c != null) {
            Type typeM30554e = m30554e(type, cls, clsM30552c);
            if (typeM30554e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM30554e).getActualTypeArguments()[m30560k(clsM30552c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX INFO: renamed from: t */
    public static void m30569t(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m30570u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
