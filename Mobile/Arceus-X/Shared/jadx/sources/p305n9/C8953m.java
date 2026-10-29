package p305n9;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import p462u9.C11830u;

/* JADX INFO: renamed from: n9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8953m {
    /* JADX INFO: renamed from: a */
    public static void m36036a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m36037b(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m36038c(boolean z10, @NonNull String str, @NonNull Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m36039d(@NonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 35 + String.valueOf(name).length() + 1);
            sb2.append("Must be called on ");
            sb2.append(name2);
            sb2.append(" thread, but got ");
            sb2.append(name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m36040e(@NonNull String str) {
        if (!C11830u.m44216a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m36041f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static String m36042g(String str, @NonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static void m36043h() {
        m36044i("Must not be called on GoogleApiHandler thread.");
    }

    /* JADX INFO: renamed from: i */
    public static void m36044i(@NonNull String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m36045j() {
        m36046k("Must not be called on the main application thread");
    }

    /* JADX INFO: renamed from: k */
    public static void m36046k(@NonNull String str) {
        if (C11830u.m44216a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static <T> T m36047l(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static <T> T m36048m(@NonNull T t8, @NonNull Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: n */
    public static int m36049n(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* JADX INFO: renamed from: o */
    public static long m36050o(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    /* JADX INFO: renamed from: p */
    public static void m36051p(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m36052q(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m36053r(boolean z10, @NonNull String str, @NonNull Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
