package n5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f25880a;
    public static Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f25881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f25882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f25883e;

    public static void a(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    public static void b(@NonNull String str, int i10) {
        try {
            if (f25881c == null) {
                f25881c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f25881c.invoke(null, Long.valueOf(f25880a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(@NonNull String str) {
        b.a(l(str));
    }

    public static void d(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    public static void e(@NonNull String str, int i10) {
        try {
            if (f25882d == null) {
                f25882d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f25882d.invoke(null, Long.valueOf(f25880a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    public static void g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    public static boolean i() {
        try {
            if (b == null) {
                f25880a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(f25880a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    public static void k(@NonNull String str, int i10) {
        try {
            if (f25883e == null) {
                f25883e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f25883e.invoke(null, Long.valueOf(f25880a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    @NonNull
    public static String l(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
