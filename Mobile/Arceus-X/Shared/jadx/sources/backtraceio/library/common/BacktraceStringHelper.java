package backtraceio.library.common;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceStringHelper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isObjectNotNullOrNotEmptyString(Object obj) {
        if (obj instanceof String) {
            return !obj.toString().trim().isEmpty();
        }
        return obj != null;
    }
}
