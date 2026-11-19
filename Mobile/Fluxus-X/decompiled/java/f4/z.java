package f4;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1.j<ClassLoader, w1.j<String, Class<?>>> f15620a = new w1.j<>();

    public static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return q.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    public static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        w1.j<ClassLoader, w1.j<String, Class<?>>> jVar = f15620a;
        w1.j<String, Class<?>> jVar2 = jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new w1.j<>();
            jVar.put(classLoader, jVar2);
        }
        Class<?> cls = jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends q> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new q.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new q.k("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    @NonNull
    public q a(@NonNull ClassLoader classLoader, @NonNull String str) {
        throw null;
    }
}
