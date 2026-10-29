package p298n2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.C0558k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p533x2.C12632b;
import p533x2.C12637g;

/* JADX INFO: renamed from: n2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8870h {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f32281a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<e, SparseArray<d>> f32282b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f32283c = new Object();

    /* JADX INFO: renamed from: n2.h$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Drawable m35673a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m35674b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: renamed from: n2.h$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static ColorStateList m35675a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: renamed from: n2.h$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static float m35676a(Resources resources, int i10) {
            return resources.getFloat(i10);
        }
    }

    /* JADX INFO: renamed from: n2.h$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f32284a;

        /* JADX INFO: renamed from: b */
        public final Configuration f32285b;

        /* JADX INFO: renamed from: c */
        public final int f32286c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f32284a = colorStateList;
            this.f32285b = configuration;
            this.f32286c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: n2.h$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final Resources f32287a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f32288b;

        public e(Resources resources, Resources.Theme theme) {
            this.f32287a = resources;
            this.f32288b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f32287a.equals(eVar.f32287a) && C12632b.m47060a(this.f32288b, eVar.f32288b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C12632b.m47061b(this.f32287a, this.f32288b);
        }
    }

    /* JADX INFO: renamed from: n2.h$f */
    public static abstract class f {
        /* JADX INFO: renamed from: e */
        public static Handler m35679e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: c */
        public final void m35680c(final int i10, Handler handler) {
            m35679e(handler).post(new Runnable() { // from class: n2.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32294a.mo23760f(i10);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final void m35681d(final Typeface typeface, Handler handler) {
            m35679e(handler).post(new Runnable() { // from class: n2.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32292a.mo23761g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo23760f(int i10);

        /* JADX INFO: renamed from: g */
        public abstract void mo23761g(Typeface typeface);
    }

    /* JADX INFO: renamed from: n2.h$g */
    public static final class g {

        /* JADX INFO: renamed from: n2.h$g$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final Object f32289a = new Object();

            /* JADX INFO: renamed from: b */
            public static Method f32290b;

            /* JADX INFO: renamed from: c */
            public static boolean f32291c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            /* JADX INFO: renamed from: a */
            public static void m35683a(Resources.Theme theme) {
                Method method;
                synchronized (f32289a) {
                    if (f32291c) {
                        method = f32290b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f32290b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f32291c = true;
                        method = f32290b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                f32290b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: n2.h$g$b */
        public static class b {
            /* JADX INFO: renamed from: a */
            public static void m35684a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m35682a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m35684a(theme);
            } else {
                a.m35683a(theme);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m35658a(e eVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f32283c) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f32282b;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i10, new d(colorStateList, eVar.f32287a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f32286c == r5.hashCode()) goto L22;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m35659b(e eVar, int i10) {
        d dVar;
        synchronized (f32283c) {
            try {
                SparseArray<d> sparseArray = f32282b.get(eVar);
                if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i10)) != null) {
                    if (dVar.f32285b.equals(eVar.f32287a.getConfiguration())) {
                        Resources.Theme theme = eVar.f32288b;
                        if (theme != null || dVar.f32286c != 0) {
                            if (theme != null) {
                            }
                        }
                        return dVar.f32284a;
                    }
                    sparseArray.remove(i10);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m35660c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m35671n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m35661d(Resources resources, int i10, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListM35659b = m35659b(eVar, i10);
        if (colorStateListM35659b != null) {
            return colorStateListM35659b;
        }
        ColorStateList colorStateListM35669l = m35669l(resources, i10, theme);
        if (colorStateListM35669l == null) {
            return b.m35675a(resources, i10, theme);
        }
        m35658a(eVar, i10, colorStateListM35669l, theme);
        return colorStateListM35669l;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m35662e(Resources resources, int i10, Resources.Theme theme) {
        return a.m35673a(resources, i10, theme);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m35663f(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.m35674b(resources, i10, i11, theme);
    }

    /* JADX INFO: renamed from: g */
    public static float m35664g(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.m35676a(resources, i10);
        }
        TypedValue typedValueM35668k = m35668k();
        resources.getValue(i10, typedValueM35668k, true);
        if (typedValueM35668k.type == 4) {
            return typedValueM35668k.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueM35668k.type) + " is not valid");
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m35665h(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m35671n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX INFO: renamed from: i */
    public static Typeface m35666i(Context context, int i10, TypedValue typedValue, int i11, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m35671n(context, i10, typedValue, i11, fVar, null, true, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m35667j(Context context, int i10, f fVar, Handler handler) {
        C12637g.m47075g(fVar);
        if (context.isRestricted()) {
            fVar.m35680c(-4, handler);
        } else {
            m35671n(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static TypedValue m35668k() {
        ThreadLocal<TypedValue> threadLocal = f32281a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: l */
    public static ColorStateList m35669l(Resources resources, int i10, Resources.Theme theme) {
        if (m35670m(resources, i10)) {
            return null;
        }
        try {
            return C8865c.m35610a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m35670m(Resources resources, int i10) {
        TypedValue typedValueM35668k = m35668k();
        resources.getValue(i10, typedValueM35668k, true);
        int i11 = typedValueM35668k.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* JADX INFO: renamed from: n */
    public static Typeface m35671n(Context context, int i10, TypedValue typedValue, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceM35672o = m35672o(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (typefaceM35672o != null || fVar != null || z11) {
            return typefaceM35672o;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX INFO: renamed from: o */
    public static Typeface m35672o(Context context, Resources resources, TypedValue typedValue, int i10, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fVar != null) {
                fVar.m35680c(-3, handler);
            }
            return null;
        }
        Typeface typefaceM2741g = C0558k.m2741g(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceM2741g != null) {
            if (fVar != null) {
                fVar.m35681d(typefaceM2741g, handler);
            }
            return typefaceM2741g;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceM2739e = C0558k.m2739e(context, resources, i10, string, typedValue.assetCookie, i11);
                if (fVar != null) {
                    if (typefaceM2739e != null) {
                        fVar.m35681d(typefaceM2739e, handler);
                        return typefaceM2739e;
                    }
                    fVar.m35680c(-3, handler);
                }
                return typefaceM2739e;
            }
            C8867e.b bVarM35631b = C8867e.m35631b(resources.getXml(i10), resources);
            if (bVarM35631b == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (fVar != null) {
                    fVar.m35680c(-3, handler);
                }
                return null;
            }
            try {
                return C0558k.m2738d(context, bVarM35631b, resources, i10, string, typedValue.assetCookie, i11, fVar, handler, z10);
            } catch (IOException e10) {
                e = e10;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (fVar != null) {
                    fVar.m35680c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e11) {
                e = e11;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (fVar != null) {
                    fVar.m35680c(-3, handler);
                }
                return null;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }
}
