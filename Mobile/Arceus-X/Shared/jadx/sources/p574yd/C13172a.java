package p574yd;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: yd.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C13172a {

    /* JADX INFO: renamed from: a */
    public static final Map f46432a;

    /* JADX INFO: renamed from: b */
    public static final Map f46433b;

    static {
        HashMap map = new HashMap();
        f46432a = map;
        HashMap map2 = new HashMap();
        f46433b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    /* JADX INFO: renamed from: a */
    public static String m48775a(int i10) {
        Map map = f46432a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f46433b.get(numValueOf)) + ")";
    }
}
