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
import p298n2.C8867e;

/* JADX INFO: renamed from: androidx.core.graphics.l */
/* JADX INFO: loaded from: classes.dex */
public class C0559l extends C0564q {

    /* JADX INFO: renamed from: b */
    public static Class<?> f2332b;

    /* JADX INFO: renamed from: c */
    public static Constructor<?> f2333c;

    /* JADX INFO: renamed from: d */
    public static Method f2334d;

    /* JADX INFO: renamed from: e */
    public static Method f2335e;

    /* JADX INFO: renamed from: f */
    public static boolean f2336f;

    /* JADX INFO: renamed from: h */
    public static boolean m2747h(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        m2749j();
        try {
            return ((Boolean) f2334d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m2748i(Object obj) throws NoSuchMethodException {
        m2749j();
        try {
            Object objNewInstance = Array.newInstance(f2332b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2335e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2749j() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2336f) {
            return;
        }
        f2336f = true;
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
        f2333c = constructor;
        f2332b = cls;
        f2334d = method2;
        f2335e = method;
    }

    /* JADX INFO: renamed from: k */
    private static Object m2750k() throws NoSuchMethodException {
        m2749j();
        try {
            return f2333c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: a */
    public Typeface mo2751a(Context context, C8867e.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objM2750k = m2750k();
        for (C8867e.d dVar : cVar.m35640a()) {
            File fileM2786d = C0565r.m2786d(context);
            if (fileM2786d == null) {
                return null;
            }
            try {
                if (!C0565r.m2784b(fileM2786d, resources, dVar.m35642b())) {
                    return null;
                }
                if (!m2747h(objM2750k, fileM2786d.getPath(), dVar.m35645e(), dVar.m35646f())) {
                    return null;
                }
                fileM2786d.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM2786d.delete();
            }
        }
        return m2748i(objM2750k);
    }
}
