package backtraceio.library.common;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceMathHelper {
    public static double clamp(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static double uniform(double d10, double d11) {
        return (new Random().nextDouble() * (d11 - d10)) + d10;
    }
}
