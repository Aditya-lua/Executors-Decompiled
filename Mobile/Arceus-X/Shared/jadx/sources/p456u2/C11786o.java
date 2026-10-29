package p456u2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u2.o */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C11786o {

    /* JADX INFO: renamed from: a */
    public static long f41506a;

    /* JADX INFO: renamed from: b */
    public static Method f41507b;

    /* JADX INFO: renamed from: c */
    public static Method f41508c;

    /* JADX INFO: renamed from: d */
    public static Method f41509d;

    /* JADX INFO: renamed from: e */
    public static Method f41510e;

    /* JADX INFO: renamed from: u2.o$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m44084a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f41506a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f41507b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f41508c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f41509d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f41510e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m44081a(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m44082b() {
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44083c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.m44084a();
        }
        try {
            return ((Boolean) f41507b.invoke(null, Long.valueOf(f41506a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
