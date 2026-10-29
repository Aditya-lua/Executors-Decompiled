package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p296n0.InterfaceC8758g3;
import p296n0.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Range<Integer>> f1733a;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$a */
    public static /* synthetic */ class C0487a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1734a;

        static {
            int[] iArr = new int[SurfaceConfig.d.values().length];
            f1734a = iArr;
            try {
                iArr[SurfaceConfig.d.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1734a[SurfaceConfig.d.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1734a[SurfaceConfig.d.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f1733a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2073h() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f1733a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range<Integer> range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2074i() {
        return m2073h();
    }

    /* JADX INFO: renamed from: g */
    public Size m2075g(SurfaceConfig.d dVar) {
        if (!m2073h()) {
            return null;
        }
        int i10 = C0487a.f1734a[dVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(1280, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
