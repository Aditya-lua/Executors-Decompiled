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
import p296n0.C8837v3;
import p296n0.InterfaceC8758g3;
import p296n0.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final C8837v3 f1735a = m2080g();

    /* JADX INFO: renamed from: b */
    public static final C8837v3 f1736b = m2081h();

    /* JADX INFO: renamed from: c */
    public static final Set<String> f1737c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));

    /* JADX INFO: renamed from: d */
    public static final Set<String> f1738d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));

    /* JADX INFO: renamed from: g */
    public static C8837v3 m2080g() {
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, SurfaceConfig.b.f32161c));
        c8837v3.m35467a(SurfaceConfig.m35476c(SurfaceConfig.d.PRIV, SurfaceConfig.b.f32164f));
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, SurfaceConfig.b.f32171m));
        return c8837v3;
    }

    /* JADX INFO: renamed from: h */
    public static C8837v3 m2081h() {
        C8837v3 c8837v3 = new C8837v3();
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, SurfaceConfig.b.f32164f));
        c8837v3.m35467a(SurfaceConfig.m35476c(dVar, SurfaceConfig.b.f32161c));
        c8837v3.m35467a(SurfaceConfig.m35476c(SurfaceConfig.d.YUV, SurfaceConfig.b.f32171m));
        return c8837v3;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2082k() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2083l() {
        return m2082k() || m2084m() || m2085n();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2084m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f1737c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2085n() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = f1738d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public List<C8837v3> m2086i(String str) {
        if (m2082k()) {
            return m2087j(str);
        }
        return (m2084m() || m2085n()) ? Collections.singletonList(f1736b) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: j */
    public final List<C8837v3> m2087j(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f1735a);
        }
        return arrayList;
    }
}
