package qg;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import lg.m;
import ng.i0;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30019a;

    public static abstract class b {
        public b() {
        }

        public abstract Method a(Class<?> cls, Field field);

        public abstract <T> Constructor<T> b(Class<T> cls);

        public abstract String[] c(Class<?> cls);

        public abstract boolean d(Class<?> cls);
    }

    public static class c extends b {
        public c() {
            super();
        }

        @Override // qg.a.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // qg.a.b
        public <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // qg.a.b
        public String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // qg.a.b
        public boolean d(Class<?> cls) {
            return false;
        }
    }

    public static class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f30020a;
        public final Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f30021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f30022d;

        @Override // qg.a.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        @Override // qg.a.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f30022d.invoke(objArr[i10], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        @Override // qg.a.b
        public String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f30021c.invoke(objArr[i10], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        @Override // qg.a.b
        public boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f30020a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        public d() throws ClassNotFoundException {
            super();
            this.f30020a = Class.class.getMethod("isRecord", null);
            this.b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f30021c = cls.getMethod("getName", null);
            this.f30022d = cls.getMethod("getType", null);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        f30019a = cVar;
    }

    public static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z10 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class<?> cls, Field field) {
        return f30019a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return f30019a.b(cls);
    }

    public static String j(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return BuildConfig.FLAVOR;
        }
        String message = exc.getMessage();
        return "\nSee " + i0.a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String[] k(Class<?> cls) {
        return f30019a.c(cls);
    }

    public static boolean l(Class<?> cls) {
        if (n(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean m(Class<?> cls) {
        return f30019a.d(cls);
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void o(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new m("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e10), e10);
        }
    }

    public static String p(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + j(e10);
        }
    }
}
