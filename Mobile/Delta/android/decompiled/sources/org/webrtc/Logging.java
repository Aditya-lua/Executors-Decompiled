package org.webrtc;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class Logging {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f27918a = a();
    public static volatile boolean b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27919a;

        static {
            int[] iArr = new int[b.values().length];
            f27919a = iArr;
            try {
                iArr[b.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27919a[b.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27919a[b.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public static Logger a() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void b(String str, String str2) {
        d(b.LS_INFO, str, str2);
    }

    public static void c(String str, String str2) {
        d(b.LS_ERROR, str, str2);
    }

    public static void d(b bVar, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (b) {
            nativeLog(bVar.ordinal(), str, str2);
            return;
        }
        int i10 = a.f27919a[bVar.ordinal()];
        if (i10 == 1) {
            level = Level.SEVERE;
        } else if (i10 != 2) {
            level = i10 != 3 ? Level.FINE : Level.INFO;
        } else {
            level = Level.WARNING;
        }
        f27918a.log(level, str + ": " + str2);
    }

    public static void e(String str, String str2) {
        d(b.LS_WARNING, str, str2);
    }

    private static native void nativeLog(int i10, String str, String str2);
}
