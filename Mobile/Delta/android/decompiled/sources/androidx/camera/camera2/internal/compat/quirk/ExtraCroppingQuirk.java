package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import n0.SurfaceConfig;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Range<Integer>> f1325a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1326a;

        static {
            int[] iArr = new int[SurfaceConfig.d.values().length];
            f1326a = iArr;
            try {
                iArr[SurfaceConfig.d.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1326a[SurfaceConfig.d.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1326a[SurfaceConfig.d.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f1325a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static boolean h() {
        if (!Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f1325a;
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

    public static boolean i() {
        return h();
    }

    public Size g(SurfaceConfig.d dVar) {
        if (!h()) {
            return null;
        }
        int i10 = a.f1326a[dVar.ordinal()];
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
