package p091e2;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0516a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p116f2.C5315a;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: loaded from: classes.dex */
public class C4745a {

    /* JADX INFO: renamed from: e2.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19301a;

        static {
            int[] iArr = new int[C0516a.a.values().length];
            f19301a = iArr;
            try {
                iArr[C0516a.a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19301a[C0516a.a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19301a[C0516a.a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19301a[C0516a.a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19301a[C0516a.a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19301a[C0516a.a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19301a[C0516a.a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m23131a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: b */
    public static void m23132b(C0516a c0516a, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + c0516a.m2474b();
        try {
            int i10 = a.f19301a[c0516a.m2475c().ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z10 = true;
            switch (i10) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM23131a = (m23131a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m23131a((int) (fArr[3] * 255.0f)) << 24) | (m23131a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m23131a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM23131a);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((m23131a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m23131a((int) (fArr[3] * 255.0f)) << 24) | (m23131a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m23131a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + c0516a.m2474b());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e("CustomSupport", "Cannot access method " + str + " on View \"" + C5315a.m24626b(view) + "\"", e10);
        } catch (NoSuchMethodException e11) {
            Log.e("CustomSupport", "No method " + str + " on View \"" + C5315a.m24626b(view) + "\"", e11);
        } catch (InvocationTargetException e12) {
            Log.e("CustomSupport", "Cannot invoke method " + str + " on View \"" + C5315a.m24626b(view) + "\"", e12);
        }
    }
}
