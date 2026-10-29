package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import n0.SurfaceConfig;
import n0.g3;
import n0.v3;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3 f1327a = g();
    public static final v3 b = h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f1328c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<String> f1329d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));

    public static v3 g() {
        v3 v3Var = new v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        v3Var.a(SurfaceConfig.c(dVar, SurfaceConfig.b.f24908c));
        v3Var.a(SurfaceConfig.c(SurfaceConfig.d.PRIV, SurfaceConfig.b.f24911f));
        v3Var.a(SurfaceConfig.c(dVar, SurfaceConfig.b.f24918m));
        return v3Var;
    }

    public static v3 h() {
        v3 v3Var = new v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        v3Var.a(SurfaceConfig.c(dVar, SurfaceConfig.b.f24911f));
        v3Var.a(SurfaceConfig.c(dVar, SurfaceConfig.b.f24908c));
        v3Var.a(SurfaceConfig.c(SurfaceConfig.d.YUV, SurfaceConfig.b.f24918m));
        return v3Var;
    }

    public static boolean k() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean l() {
        return k() || m() || n();
    }

    public static boolean m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f1328c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean n() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = f1329d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public List<v3> i(String str) {
        if (k()) {
            return j(str);
        }
        return (m() || n()) ? Collections.singletonList(b) : Collections.EMPTY_LIST;
    }

    public final List<v3> j(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f1327a);
        }
        return arrayList;
    }
}
