package androidx.fragment.app;

import androidx.annotation.NonNull;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j<ClassLoader, j<String, Class<?>>> f2664a = new j<>();

    public static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    public static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        j<ClassLoader, j<String, Class<?>>> jVar = f2664a;
        j<String, Class<?>> jVar2 = jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new j<>();
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
    public static Class<? extends c> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new c.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new c.k("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    @NonNull
    public c a(@NonNull ClassLoader classLoader, @NonNull String str) {
        throw null;
    }
}
