package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p140g0.C5931r1;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: p */
    public static boolean m2055p() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2056q() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m2057r() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2058s() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2059t() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2060u() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m2061v() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m2062w() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m2063x() {
        return m2057r() || m2058s() || m2055p() || m2062w() || m2061v() || m2059t() || m2060u() || m2056q();
    }

    /* JADX INFO: renamed from: g */
    public List<Size> m2064g(String str, int i10) {
        if (m2057r()) {
            return m2067j(str, i10);
        }
        if (m2058s()) {
            return m2068k(str, i10);
        }
        if (m2055p()) {
            return m2065h(str, i10, null);
        }
        if (m2062w()) {
            return m2072o(str, i10, null);
        }
        if (m2061v()) {
            return m2071n(str, i10, null);
        }
        if (m2059t()) {
            return m2069l(str, i10);
        }
        if (m2060u()) {
            return m2070m(i10);
        }
        if (m2056q()) {
            return m2066i(i10);
        }
        C5931r1.m26572l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: h */
    public final List<Size> m2065h(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final List<Size> m2066i(int i10) {
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

    /* JADX INFO: renamed from: j */
    public final List<Size> m2067j(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final List<Size> m2068k(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<Size> m2069l(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final List<Size> m2070m(int i10) {
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

    /* JADX INFO: renamed from: n */
    public final List<Size> m2071n(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final List<Size> m2072o(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
            if (i10 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
                return arrayList;
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }
}
