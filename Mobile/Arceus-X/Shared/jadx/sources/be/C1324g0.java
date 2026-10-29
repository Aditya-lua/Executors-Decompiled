package be;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: be.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1324g0 {
    /* JADX INFO: renamed from: a */
    public static C1318e0 m7157a(Object obj, String str, Class cls) {
        return new C1318e0(obj, m7163g(obj, str), cls);
    }

    /* JADX INFO: renamed from: b */
    public static C1321f0 m7158b(Object obj, String str, Class cls) {
        return new C1321f0(obj, m7163g(obj, str), cls);
    }

    /* JADX INFO: renamed from: c */
    public static Object m7159c(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to invoke default constructor on class %s", cls.getName()), e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m7160d(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(m7164h(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m7161e(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(m7164h(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m7162f(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(m7164h(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m7163g(Object obj, String str) {
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
        throw new C1327h0(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    /* JADX INFO: renamed from: h */
    public static Method m7164h(Class cls, String str, Class... clsArr) {
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
        throw new C1327h0(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
