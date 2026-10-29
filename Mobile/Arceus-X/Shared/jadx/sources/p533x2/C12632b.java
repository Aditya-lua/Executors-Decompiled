package p533x2;

import java.util.Objects;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: loaded from: classes.dex */
public class C12632b {
    /* JADX INFO: renamed from: a */
    public static boolean m47060a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m47061b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m47062c(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m47063d(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m47064e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
