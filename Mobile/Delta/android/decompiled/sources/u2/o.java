package u2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f32695a;
    public static Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f32696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f32697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f32698e;

    public static class a {
        public static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f32695a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f32696c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f32697d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f32698e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) b.invoke(null, Long.valueOf(f32695a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
