package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements g3 {
    public static boolean p() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean q() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean r() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean s() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean t() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean u() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    public static boolean v() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean w() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean x() {
        return r() || s() || p() || w() || v() || t() || u() || q();
    }

    public List<Size> g(String str, int i10) {
        if (r()) {
            return j(str, i10);
        }
        if (s()) {
            return k(str, i10);
        }
        if (p()) {
            return h(str, i10, null);
        }
        if (w()) {
            return o(str, i10, null);
        }
        if (v()) {
            return n(str, i10, null);
        }
        if (t()) {
            return l(str, i10);
        }
        if (u()) {
            return m(i10);
        }
        if (q()) {
            return i(i10);
        }
        r1.l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    public final List<Size> h(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List<Size> i(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 == 35) {
            arrayList.add(new Size(4032, 3024));
            arrayList.add(new Size(4000, 3000));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(3024, 3024));
            arrayList.add(new Size(2976, 2976));
            arrayList.add(new Size(2448, 2448));
        }
        return arrayList;
    }

    public final List<Size> j(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List<Size> k(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List<Size> l(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    public final List<Size> m(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 == 35) {
            arrayList.add(new Size(3840, 2160));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(2688, 1512));
            arrayList.add(new Size(2592, 1944));
            arrayList.add(new Size(2592, 1940));
            arrayList.add(new Size(1920, 1440));
        }
        return arrayList;
    }

    public final List<Size> n(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
            arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    public final List<Size> o(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
                arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(Barcode.FORMAT_PDF417, 1536));
            arrayList.add(new Size(Barcode.FORMAT_PDF417, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }
}
