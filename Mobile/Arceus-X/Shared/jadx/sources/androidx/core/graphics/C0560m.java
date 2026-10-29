package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p298n2.C8867e;
import p482v2.C12004g;

/* JADX INFO: renamed from: androidx.core.graphics.m */
/* JADX INFO: loaded from: classes.dex */
public class C0560m extends C0559l {

    /* JADX INFO: renamed from: g */
    public final Class<?> f2337g;

    /* JADX INFO: renamed from: h */
    public final Constructor<?> f2338h;

    /* JADX INFO: renamed from: i */
    public final Method f2339i;

    /* JADX INFO: renamed from: j */
    public final Method f2340j;

    /* JADX INFO: renamed from: k */
    public final Method f2341k;

    /* JADX INFO: renamed from: l */
    public final Method f2342l;

    /* JADX INFO: renamed from: m */
    public final Method f2343m;

    public C0560m() {
        Class<?> clsM2766u;
        Constructor<?> constructorM2767v;
        Method methodM2763r;
        Method methodM2764s;
        Method methodM2768w;
        Method methodM2762q;
        Method methodMo2765t;
        try {
            clsM2766u = m2766u();
            constructorM2767v = m2767v(clsM2766u);
            methodM2763r = m2763r(clsM2766u);
            methodM2764s = m2764s(clsM2766u);
            methodM2768w = m2768w(clsM2766u);
            methodM2762q = m2762q(clsM2766u);
            methodMo2765t = mo2765t(clsM2766u);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsM2766u = null;
            constructorM2767v = null;
            methodM2763r = null;
            methodM2764s = null;
            methodM2768w = null;
            methodM2762q = null;
            methodMo2765t = null;
        }
        this.f2337g = clsM2766u;
        this.f2338h = constructorM2767v;
        this.f2339i = methodM2763r;
        this.f2340j = methodM2764s;
        this.f2341k = methodM2768w;
        this.f2342l = methodM2762q;
        this.f2343m = methodMo2765t;
    }

    @Override // androidx.core.graphics.C0559l, androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: a */
    public Typeface mo2751a(Context context, C8867e.c cVar, Resources resources, int i10) {
        if (!m2761p()) {
            return super.mo2751a(context, cVar, resources, i10);
        }
        Object objM2756k = m2756k();
        if (objM2756k == null) {
            return null;
        }
        C8867e.d[] dVarArrM35640a = cVar.m35640a();
        int length = dVarArrM35640a.length;
        int i11 = 0;
        while (i11 < length) {
            C8867e.d dVar = dVarArrM35640a[i11];
            Context context2 = context;
            if (!m2758m(context2, objM2756k, dVar.m35641a(), dVar.m35643c(), dVar.m35645e(), dVar.m35646f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m35644d()))) {
                m2757l(objM2756k);
                return null;
            }
            i11++;
            context = context2;
        }
        if (m2760o(objM2756k)) {
            return mo2755i(objM2756k);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0091 */
    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: b */
    public Typeface mo2752b(Context context, CancellationSignal cancellationSignal, C12004g.b[] bVarArr, int i10) {
        Typeface typefaceMo2755i;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m2761p()) {
            C12004g.b bVarMo2770g = mo2770g(bVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo2770g.m44820e(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarMo2770g.m44822g()).setItalic(bVarMo2770g.m44823h()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM2788f = C0565r.m2788f(context, bVarArr, cancellationSignal);
        Object objM2756k = m2756k();
        if (objM2756k == null) {
            return null;
        }
        int length = bVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            C12004g.b bVar = bVarArr[i11];
            ByteBuffer byteBuffer = mapM2788f.get(bVar.m44820e());
            if (byteBuffer == null) {
                obj = objM2756k;
            } else {
                boolean zM2759n = m2759n(objM2756k, byteBuffer, bVar.m44819d(), bVar.m44822g(), bVar.m44823h() ? 1 : 0);
                obj = objM2756k;
                if (!zM2759n) {
                    m2757l(obj);
                    return null;
                }
                z10 = true;
            }
            i11++;
            objM2756k = obj;
            z10 = z10;
        }
        Object obj2 = objM2756k;
        if (!z10) {
            m2757l(obj2);
            return null;
        }
        if (m2760o(obj2) && (typefaceMo2755i = mo2755i(obj2)) != null) {
            return Typeface.create(typefaceMo2755i, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Typeface mo2753c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.mo2753c(context, cancellationSignal, list, i10);
    }

    @Override // androidx.core.graphics.C0564q
    /* JADX INFO: renamed from: d */
    public Typeface mo2754d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m2761p()) {
            return super.mo2754d(context, resources, i10, str, i11);
        }
        Object objM2756k = m2756k();
        if (objM2756k == null) {
            return null;
        }
        if (!m2758m(context, objM2756k, str, 0, -1, -1, null)) {
            m2757l(objM2756k);
            return null;
        }
        if (m2760o(objM2756k)) {
            return mo2755i(objM2756k);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public Typeface mo2755i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f2337g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2343m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m2756k() {
        try {
            return this.f2338h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2757l(Object obj) {
        try {
            this.f2342l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2758m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2339i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2759n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f2340j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2760o(Object obj) {
        try {
            return ((Boolean) this.f2341k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2761p() {
        if (this.f2339i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2339i != null;
    }

    /* JADX INFO: renamed from: q */
    public Method m2762q(Class<?> cls) {
        return cls.getMethod("abortCreation", null);
    }

    /* JADX INFO: renamed from: r */
    public Method m2763r(Class<?> cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: s */
    public Method m2764s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: t */
    public Method mo2765t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: u */
    public Class<?> m2766u() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: v */
    public Constructor<?> m2767v(Class<?> cls) {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: w */
    public Method m2768w(Class<?> cls) {
        return cls.getMethod("freeze", null);
    }
}
