package gk;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f18242a = new a("rbx");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18243a;
        public final int b = 6;

        public a(String str) {
            this.f18243a = str;
        }

        public int a(String str) {
            return 0;
        }

        public int b(String str, String str2) {
            return 0;
        }

        public int c(String str, String str2, Throwable th2) {
            return Log.d(str, h(str2), th2);
        }

        public int d(String str) {
            return Log.e(this.f18243a, h(str));
        }

        public int e(String str, String str2) {
            return Log.e(str, h(str2));
        }

        public int f(String str, String str2, Throwable th2) {
            return Log.e(str, h(str2), th2);
        }

        public final String g(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            int iLastIndexOf = className.lastIndexOf(46);
            return iLastIndexOf == -1 ? className : className.substring(iLastIndexOf + 1);
        }

        public final String h(String str) {
            return i(6) + str;
        }

        public final String i(int i10) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            return (stackTrace == null || stackTrace.length <= i10) ? "[STACKTRACE MISMATCH]: " : String.format("[%s.%s()-%d]: ", g(stackTrace[i10]), stackTrace[i10].getMethodName(), Integer.valueOf(stackTrace[i10].getLineNumber()));
        }

        public int j(String str) {
            return Log.i(this.f18243a, h(str));
        }

        public int k(String str, String str2) {
            return Log.i(str, h(str2));
        }

        public int l(String str, String str2) {
            return Log.v(str, h(str2));
        }

        public int m(String str) {
            return Log.w(this.f18243a, h(str));
        }

        public int n(String str, String str2) {
            return Log.w(str, h(str2));
        }
    }

    public static int a(String str) {
        return f18242a.a(str);
    }

    public static int b(String str, String str2) {
        return f18242a.b(str, str2);
    }

    public static int c(String str, String str2, Throwable th2) {
        return f18242a.c(str, str2, th2);
    }

    public static int d(String str) {
        return f18242a.d(str);
    }

    public static int e(String str, String str2) {
        return f18242a.e(str, str2);
    }

    public static int f(String str, String str2, Throwable th2) {
        return f18242a.f(str, str2, th2);
    }

    public static int g(String str) {
        return f18242a.j(str);
    }

    public static int h(String str, String str2) {
        return f18242a.k(str, str2);
    }

    public static int i(String str, String str2) {
        return f18242a.l(str, str2);
    }

    public static int j(String str) {
        return f18242a.m(str);
    }

    public static int k(String str, String str2) {
        return f18242a.n(str, str2);
    }
}
