package p301n5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: n5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8884a {

    /* JADX INFO: renamed from: a */
    public static long f32348a;

    /* JADX INFO: renamed from: b */
    public static Method f32349b;

    /* JADX INFO: renamed from: c */
    public static Method f32350c;

    /* JADX INFO: renamed from: d */
    public static Method f32351d;

    /* JADX INFO: renamed from: e */
    public static Method f32352e;

    /* JADX INFO: renamed from: a */
    public static void m35744a(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8886c.m35758a(m35755l(str), i10);
        } else {
            m35745b(m35755l(str), i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m35745b(@NonNull String str, int i10) {
        try {
            if (f32350c == null) {
                f32350c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f32350c.invoke(null, Long.valueOf(f32348a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            m35750g("asyncTraceBegin", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m35746c(@NonNull String str) {
        C8885b.m35756a(m35755l(str));
    }

    /* JADX INFO: renamed from: d */
    public static void m35747d(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8886c.m35759b(m35755l(str), i10);
        } else {
            m35748e(m35755l(str), i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m35748e(@NonNull String str, int i10) {
        try {
            if (f32351d == null) {
                f32351d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f32351d.invoke(null, Long.valueOf(f32348a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            m35750g("asyncTraceEnd", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m35749f() {
        C8885b.m35757b();
    }

    /* JADX INFO: renamed from: g */
    public static void m35750g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m35751h() {
        return Build.VERSION.SDK_INT >= 29 ? C8886c.m35760c() : m35752i();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m35752i() {
        try {
            if (f32349b == null) {
                f32348a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f32349b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f32349b.invoke(null, Long.valueOf(f32348a))).booleanValue();
        } catch (Exception e10) {
            m35750g("isTagEnabled", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m35753j(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8886c.m35761d(m35755l(str), i10);
        } else {
            m35754k(m35755l(str), i10);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m35754k(@NonNull String str, int i10) {
        try {
            if (f32352e == null) {
                f32352e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f32352e.invoke(null, Long.valueOf(f32348a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            m35750g("traceCounter", e10);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static String m35755l(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
