package backtraceio.library.common;

import backtraceio.library.common.serialization.BacktraceGsonBuilder;
import kg.C7590f;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceSerializeHelper {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) fromJson(new BacktraceGsonBuilder().buildGson(), str, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String toJson(Object obj) {
        return toJson(new BacktraceGsonBuilder().buildGson(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static <T> T fromJson(C7590f c7590f, String str, Class<T> cls) {
        return (T) c7590f.m31410j(str, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String toJson(C7590f c7590f, Object obj) {
        return c7590f.m31419t(obj);
    }
}
