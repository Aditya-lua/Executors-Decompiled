package kotlin.jvm.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Intrinsics {

    public static class a {
    }

    public static boolean a(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            m();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) j(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static int f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int g(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static String h(String str) {
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

    public static void i(int i10, String str) {
        r();
    }

    public static <T extends Throwable> T j(T t8) {
        return (T) k(t8, Intrinsics.class.getName());
    }

    public static <T extends Throwable> T k(T t8, String str) {
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

    public static String l(String str, Object obj) {
        return str + obj;
    }

    public static void m() {
        throw ((NullPointerException) j(new NullPointerException()));
    }

    public static void n(String str) {
        throw ((NullPointerException) j(new NullPointerException(str)));
    }

    public static void o() {
        throw ((jt.e) j(new jt.e()));
    }

    public static void p(String str) {
        throw ((IllegalArgumentException) j(new IllegalArgumentException(h(str))));
    }

    public static void q(String str) {
        throw ((NullPointerException) j(new NullPointerException(h(str))));
    }

    public static void r() {
        s("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void s(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void t(String str) {
        throw ((jt.d0) j(new jt.d0(str)));
    }

    public static void u(String str) {
        t("lateinit property " + str + " has not been initialized");
    }
}
