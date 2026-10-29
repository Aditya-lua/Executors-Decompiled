package p169he;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: he.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C6391u {

    /* JADX INFO: renamed from: a */
    public static final Object f24320a;

    /* JADX INFO: renamed from: b */
    public static final Method f24321b;

    /* JADX INFO: renamed from: c */
    public static final Method f24322c;

    static {
        Object objM27962b = m27962b();
        f24320a = objM27962b;
        f24321b = objM27962b == null ? null : m27961a();
        f24322c = objM27962b != null ? m27964d(objM27962b) : null;
    }

    /* JADX INFO: renamed from: a */
    public static Method m27961a() {
        return m27963c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* JADX INFO: renamed from: b */
    public static Object m27962b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m27963c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m27964d(Object obj) {
        try {
            Method methodM27963c = m27963c("getStackTraceDepth", Throwable.class);
            if (methodM27963c == null) {
                return null;
            }
            methodM27963c.invoke(obj, new Throwable());
            return methodM27963c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static RuntimeException m27965e(Throwable th2) {
        m27970j(th2);
        throw new RuntimeException(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Deprecated
    /* JADX INFO: renamed from: f */
    public static <X extends Throwable> void m27966f(Throwable th2, Class<X> cls) throws X {
        if (th2 != null) {
            m27969i(th2, cls);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static void m27967g(Throwable th2) {
        if (th2 != null) {
            m27970j(th2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    /* JADX INFO: renamed from: h */
    public static <X extends Throwable> void m27968h(Throwable th2, Class<X> cls) throws X {
        m27966f(th2, cls);
        m27967g(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: i */
    public static <X extends Throwable> void m27969i(Throwable th2, Class<X> cls) throws X {
        C6384n.m27928l(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m27970j(Throwable th2) {
        C6384n.m27928l(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
