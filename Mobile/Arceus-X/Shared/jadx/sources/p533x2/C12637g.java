package p533x2;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: x2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12637g {
    /* JADX INFO: renamed from: a */
    public static void m47069a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m47070b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m47071c(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX INFO: renamed from: d */
    public static int m47072d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: e */
    public static int m47073e(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m47074f(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m47075g(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m47076h(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i */
    public static void m47077i(boolean z10) {
        m47078j(z10, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m47078j(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static <T extends CharSequence> T m47079k(T t8, Object obj) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t8;
    }
}
