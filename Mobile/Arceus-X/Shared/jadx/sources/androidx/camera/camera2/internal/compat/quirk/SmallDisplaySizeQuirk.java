package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class SmallDisplaySizeQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Size> f1757a;

    static {
        HashMap map = new HashMap();
        f1757a = map;
        map.put("REDMI NOTE 8", new Size(1080, 2340));
        map.put("REDMI NOTE 7", new Size(1080, 2340));
        map.put("SM-A207M", new Size(720, 1560));
        map.put("REDMI NOTE 7S", new Size(1080, 2340));
        map.put("SM-A127F", new Size(720, 1600));
        map.put("SM-A536E", new Size(1080, 2400));
        map.put("220233L2I", new Size(720, 1600));
        map.put("V2149", new Size(720, 1600));
        map.put("VIVO 1920", new Size(1080, 2340));
        map.put("CPH2223", new Size(1080, 2400));
        map.put("V2029", new Size(720, 1600));
        map.put("CPH1901", new Size(720, 1520));
        map.put("REDMI Y3", new Size(720, 1520));
        map.put("SM-A045M", new Size(720, 1600));
        map.put("SM-A146U", new Size(1080, 2408));
        map.put("CPH1909", new Size(720, 1520));
        map.put("NOKIA 4.2", new Size(720, 1520));
        map.put("SM-G960U1", new Size(1440, 2960));
        map.put("SM-A137F", new Size(1080, 2408));
        map.put("VIVO 1816", new Size(720, 1520));
        map.put("INFINIX X6817", new Size(720, 1612));
        map.put("SM-A037F", new Size(720, 1600));
        map.put("NOKIA 2.4", new Size(720, 1600));
        map.put("SM-A125M", new Size(720, 1600));
        map.put("INFINIX X670", new Size(1080, 2400));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2145h() {
        return f1757a.containsKey(Build.MODEL.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: g */
    public Size m2146g() {
        return f1757a.get(Build.MODEL.toUpperCase(Locale.US));
    }
}
