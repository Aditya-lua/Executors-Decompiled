package n2;

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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f25305a = new ThreadLocal<>();
    public static final WeakHashMap<e, SparseArray<d>> b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f25306c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    public static class b {
        public static ColorStateList a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class c {
        public static float a(Resources resources, int i10) {
            return resources.getFloat(i10);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f25307a;
        public final Configuration b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25308c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f25307a = colorStateList;
            this.b = configuration;
            this.f25308c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f25309a;
        public final Resources.Theme b;

        public e(Resources resources, Resources.Theme theme) {
            this.f25309a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f25309a.equals(eVar.f25309a) && x2.b.a(this.b, eVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return x2.b.b(this.f25309a, this.b);
        }
    }

    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: n2.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25313a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: n2.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25312a.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(Typeface typeface);
    }

    public static final class g {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f25310a = new Object();
            public static Method b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f25311c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @SuppressLint({"BanUncheckedReflection"})
            public static void a(Resources.Theme theme) {
                Method method;
                synchronized (f25310a) {
                    if (f25311c) {
                        method = b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f25311c = true;
                        method = b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(e eVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f25306c) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = b;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i10, new d(colorStateList, eVar.f25309a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f25308c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(e eVar, int i10) {
        d dVar;
        synchronized (f25306c) {
            try {
                SparseArray<d> sparseArray = b.get(eVar);
                if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i10)) != null) {
                    if (dVar.b.equals(eVar.f25309a.getConfiguration())) {
                        Resources.Theme theme = eVar.b;
                        if (theme != null || dVar.f25308c != 0) {
                            if (theme != null) {
                            }
                        }
                        return dVar.f25307a;
                    }
                    sparseArray.remove(i10);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListB = b(eVar, i10);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i10, theme);
        if (colorStateListL == null) {
            return b.a(resources, i10, theme);
        }
        a(eVar, i10, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable e(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable f(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static float g(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i10);
        }
        TypedValue typedValueK = k();
        resources.getValue(i10, typedValueK, true);
        if (typedValueK.type == 4) {
            return typedValueK.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueK.type) + " is not valid");
    }

    public static Typeface h(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, fVar, null, true, false);
    }

    public static void j(Context context, int i10, f fVar, Handler handler) {
        x2.g.g(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    public static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f25305a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return n2.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean m(Resources resources, int i10) {
        TypedValue typedValueK = k();
        resources.getValue(i10, typedValueK, true);
        int i11 = typedValueK.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface n(Context context, int i10, TypedValue typedValue, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (typefaceO != null || fVar != null || z11) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    public static Typeface o(Context context, Resources resources, TypedValue typedValue, int i10, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fVar != null) {
                fVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceG = androidx.core.graphics.k.g(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceG != null) {
            if (fVar != null) {
                fVar.d(typefaceG, handler);
            }
            return typefaceG;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceE = androidx.core.graphics.k.e(context, resources, i10, string, typedValue.assetCookie, i11);
                if (fVar != null) {
                    if (typefaceE != null) {
                        fVar.d(typefaceE, handler);
                        return typefaceE;
                    }
                    fVar.c(-3, handler);
                }
                return typefaceE;
            }
            n2.e.b bVarB = n2.e.b(resources.getXml(i10), resources);
            if (bVarB == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            }
            try {
                return androidx.core.graphics.k.d(context, bVarB, resources, i10, string, typedValue.assetCookie, i11, fVar, handler, z10);
            } catch (IOException e10) {
                e = e10;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e11) {
                e = e11;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (fVar != null) {
                    fVar.c(-3, handler);
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
