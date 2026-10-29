package ae;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    public static e0 a(Object obj, String str, Class cls) {
        return new e0(obj, g(obj, str), cls);
    }

    public static f0 b(Object obj, String str, Class cls) {
        return new f0(obj, g(obj, str), cls);
    }

    public static Object c(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e10) {
            throw new h0(String.format("Failed to invoke default constructor on class %s", cls.getName()), e10);
        }
    }

    public static Object d(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(h(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e10) {
            throw new h0(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    public static Object e(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(h(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e10) {
            throw new h0(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    public static Object f(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(h(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e10) {
            throw new h0(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e10);
        }
    }

    public static Field g(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new h0(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    public static Method h(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new h0(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
