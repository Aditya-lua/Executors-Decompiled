package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.graphics.n */
/* JADX INFO: loaded from: classes.dex */
public class C0561n extends C0560m {
    @Override // androidx.core.graphics.C0560m
    /* JADX INFO: renamed from: i */
    public Typeface mo2755i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f2337g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2343m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C0560m
    /* JADX INFO: renamed from: t */
    public Method mo2765t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
