package p151gk;

import android.util.Log;

/* JADX INFO: renamed from: gk.q */
/* JADX INFO: loaded from: classes2.dex */
public class C6124q {

    /* JADX INFO: renamed from: a */
    public static a f23460a = new a("rbx");

    /* JADX INFO: renamed from: gk.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f23461a;

        /* JADX INFO: renamed from: b */
        public final int f23462b = 6;

        public a(String str) {
            this.f23461a = str;
        }

        /* JADX INFO: renamed from: a */
        public int m27067a(String str) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int m27068b(String str, String str2) {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public int m27069c(String str, String str2, Throwable th2) {
            return Log.d(str, m27074h(str2), th2);
        }

        /* JADX INFO: renamed from: d */
        public int m27070d(String str) {
            return Log.e(this.f23461a, m27074h(str));
        }

        /* JADX INFO: renamed from: e */
        public int m27071e(String str, String str2) {
            return Log.e(str, m27074h(str2));
        }

        /* JADX INFO: renamed from: f */
        public int m27072f(String str, String str2, Throwable th2) {
            return Log.e(str, m27074h(str2), th2);
        }

        /* JADX INFO: renamed from: g */
        public final String m27073g(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            int iLastIndexOf = className.lastIndexOf(46);
            return iLastIndexOf == -1 ? className : className.substring(iLastIndexOf + 1);
        }

        /* JADX INFO: renamed from: h */
        public final String m27074h(String str) {
            return m27075i(6) + str;
        }

        /* JADX INFO: renamed from: i */
        public final String m27075i(int i10) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            return (stackTrace == null || stackTrace.length <= i10) ? "[STACKTRACE MISMATCH]: " : String.format("[%s.%s()-%d]: ", m27073g(stackTrace[i10]), stackTrace[i10].getMethodName(), Integer.valueOf(stackTrace[i10].getLineNumber()));
        }

        /* JADX INFO: renamed from: j */
        public int m27076j(String str) {
            return Log.i(this.f23461a, m27074h(str));
        }

        /* JADX INFO: renamed from: k */
        public int m27077k(String str, String str2) {
            return Log.i(str, m27074h(str2));
        }

        /* JADX INFO: renamed from: l */
        public int m27078l(String str, String str2) {
            return Log.v(str, m27074h(str2));
        }

        /* JADX INFO: renamed from: m */
        public int m27079m(String str) {
            return Log.w(this.f23461a, m27074h(str));
        }

        /* JADX INFO: renamed from: n */
        public int m27080n(String str, String str2) {
            return Log.w(str, m27074h(str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m27056a(String str) {
        return f23460a.m27067a(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m27057b(String str, String str2) {
        return f23460a.m27068b(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m27058c(String str, String str2, Throwable th2) {
        return f23460a.m27069c(str, str2, th2);
    }

    /* JADX INFO: renamed from: d */
    public static int m27059d(String str) {
        return f23460a.m27070d(str);
    }

    /* JADX INFO: renamed from: e */
    public static int m27060e(String str, String str2) {
        return f23460a.m27071e(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static int m27061f(String str, String str2, Throwable th2) {
        return f23460a.m27072f(str, str2, th2);
    }

    /* JADX INFO: renamed from: g */
    public static int m27062g(String str) {
        return f23460a.m27076j(str);
    }

    /* JADX INFO: renamed from: h */
    public static int m27063h(String str, String str2) {
        return f23460a.m27077k(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static int m27064i(String str, String str2) {
        return f23460a.m27078l(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static int m27065j(String str) {
        return f23460a.m27079m(str);
    }

    /* JADX INFO: renamed from: k */
    public static int m27066k(String str, String str2) {
        return f23460a.m27080n(str, str2);
    }
}
