package kotlin.jvm.internal;

import java.util.Arrays;
import p229jt.C7335d0;
import p229jt.C7336e;

/* JADX INFO: loaded from: classes2.dex */
public class Intrinsics {

    /* JADX INFO: renamed from: kotlin.jvm.internal.Intrinsics$a */
    public static class C7723a {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m31978a(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m31979b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m31980c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            m31990m();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m31987j(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            m31994q(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m31981d(Object obj, String str) {
        if (obj == null) {
            m31991n(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m31982e(Object obj, String str) {
        if (obj == null) {
            m31993p(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m31983f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m31984g(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h */
    public static String m31985h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: i */
    public static void m31986i(int i10, String str) {
        m31995r();
    }

    /* JADX INFO: renamed from: j */
    public static <T extends Throwable> T m31987j(T t8) {
        return (T) m31988k(t8, Intrinsics.class.getName());
    }

    /* JADX INFO: renamed from: k */
    public static <T extends Throwable> T m31988k(T t8, String str) {
        StackTraceElement[] stackTrace = t8.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t8.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t8;
    }

    /* JADX INFO: renamed from: l */
    public static String m31989l(String str, Object obj) {
        return str + obj;
    }

    /* JADX INFO: renamed from: m */
    public static void m31990m() {
        throw ((NullPointerException) m31987j(new NullPointerException()));
    }

    /* JADX INFO: renamed from: n */
    public static void m31991n(String str) {
        throw ((NullPointerException) m31987j(new NullPointerException(str)));
    }

    /* JADX INFO: renamed from: o */
    public static void m31992o() {
        throw ((C7336e) m31987j(new C7336e()));
    }

    /* JADX INFO: renamed from: p */
    public static void m31993p(String str) {
        throw ((IllegalArgumentException) m31987j(new IllegalArgumentException(m31985h(str))));
    }

    /* JADX INFO: renamed from: q */
    public static void m31994q(String str) {
        throw ((NullPointerException) m31987j(new NullPointerException(m31985h(str))));
    }

    /* JADX INFO: renamed from: r */
    public static void m31995r() {
        m31996s("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: s */
    public static void m31996s(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m31997t(String str) {
        throw ((C7335d0) m31987j(new C7335d0(str)));
    }

    /* JADX INFO: renamed from: u */
    public static void m31998u(String str) {
        m31997t("lateinit property " + str + " has not been initialized");
    }
}
