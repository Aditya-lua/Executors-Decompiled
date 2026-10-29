package org.webrtc;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class Logging {

    /* JADX INFO: renamed from: a */
    public static final Logger f36162a = m38779a();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f36163b;

    /* JADX INFO: renamed from: org.webrtc.Logging$a */
    public static /* synthetic */ class C10039a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36164a;

        static {
            int[] iArr = new int[EnumC10040b.values().length];
            f36164a = iArr;
            try {
                iArr[EnumC10040b.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36164a[EnumC10040b.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36164a[EnumC10040b.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.Logging$b */
    public enum EnumC10040b {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    /* JADX INFO: renamed from: a */
    public static Logger m38779a() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* JADX INFO: renamed from: b */
    public static void m38780b(String str, String str2) {
        m38782d(EnumC10040b.LS_INFO, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m38781c(String str, String str2) {
        m38782d(EnumC10040b.LS_ERROR, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m38782d(EnumC10040b enumC10040b, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (f36163b) {
            nativeLog(enumC10040b.ordinal(), str, str2);
            return;
        }
        int i10 = C10039a.f36164a[enumC10040b.ordinal()];
        if (i10 == 1) {
            level = Level.SEVERE;
        } else if (i10 != 2) {
            level = i10 != 3 ? Level.FINE : Level.INFO;
        } else {
            level = Level.WARNING;
        }
        f36162a.log(level, str + ": " + str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m38783e(String str, String str2) {
        m38782d(EnumC10040b.LS_WARNING, str, str2);
    }

    private static native void nativeLog(int i10, String str, String str2);
}
