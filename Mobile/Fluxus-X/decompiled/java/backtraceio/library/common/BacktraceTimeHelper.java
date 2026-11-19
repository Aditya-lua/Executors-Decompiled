package backtraceio.library.common;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceTimeHelper {
    public static long getTimestampSeconds() {
        return System.currentTimeMillis() / 1000;
    }
}
