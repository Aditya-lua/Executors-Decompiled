package sg;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import ng.i0;
import ng.x;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f31463a;
    public final Type b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31464c;

    public a() {
        Type typeE = e();
        this.b = typeE;
        this.f31463a = (Class<? super T>) x.k(typeE);
        this.f31464c = typeE.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public static boolean f() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    public static void g(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + i0.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            g(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                g(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                g(actualTypeArguments[i10]);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            g(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i10 < length2) {
            g(upperBounds[i10]);
            i10++;
        }
    }

    public final Class<? super T> c() {
        return this.f31463a;
    }

    public final Type d() {
        return this.b;
    }

    public final Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeB = x.b(parameterizedType.getActualTypeArguments()[0]);
                if (f()) {
                    g(typeB);
                }
                return typeB;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + i0.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && x.f(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.f31464c;
    }

    public final String toString() {
        return x.u(this.b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = x.b(type);
        this.b = typeB;
        this.f31463a = (Class<? super T>) x.k(typeB);
        this.f31464c = typeB.hashCode();
    }
}
