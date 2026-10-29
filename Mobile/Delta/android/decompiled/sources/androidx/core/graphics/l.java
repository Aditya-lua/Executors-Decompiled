package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class l extends q {
    public static Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor<?> f1799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f1801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1802f;

    public static boolean h(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        j();
        try {
            return ((Boolean) f1800d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        j();
        try {
            Object objNewInstance = Array.newInstance(b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1801e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void j() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1802f) {
            return;
        }
        f1802f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f1799c = constructor;
        b = cls;
        f1800d = method2;
        f1801e = method;
    }

    private static Object k() throws NoSuchMethodException {
        j();
        try {
            return f1799c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.q
    public Typeface a(Context context, n2.e.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objK = k();
        for (n2.e.d dVar : cVar.a()) {
            File fileD = r.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!r.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!h(objK, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return i(objK);
    }
}
