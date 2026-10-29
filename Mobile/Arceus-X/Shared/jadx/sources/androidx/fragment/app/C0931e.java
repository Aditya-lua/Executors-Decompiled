package androidx.fragment.app;

import androidx.annotation.NonNull;
import p504w1.C12286j;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public class C0931e {

    /* JADX INFO: renamed from: a */
    public static final C12286j<ClassLoader, C12286j<String, Class<?>>> f3509a = new C12286j<>();

    /* JADX INFO: renamed from: b */
    public static boolean m4735b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return ComponentCallbacksC0929c.class.isAssignableFrom(m4736c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static Class<?> m4736c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        C12286j<ClassLoader, C12286j<String, Class<?>>> c12286j = f3509a;
        C12286j<String, Class<?>> c12286j2 = c12286j.get(classLoader);
        if (c12286j2 == null) {
            c12286j2 = new C12286j<>();
            c12286j.put(classLoader, c12286j2);
        }
        Class<?> cls = c12286j2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c12286j2.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.c> */
    @NonNull
    /* JADX INFO: renamed from: d */
    public static Class<? extends ComponentCallbacksC0929c> m4737d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return m4736c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new ComponentCallbacksC0929c.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new ComponentCallbacksC0929c.k("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0929c mo4483a(@NonNull ClassLoader classLoader, @NonNull String str) {
        throw null;
    }
}
