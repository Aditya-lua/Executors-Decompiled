package n9;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25267a;
    public final String b;

    public g(@NonNull String str) {
        this(str, null);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f25267a, i10);
    }

    public void b(@NonNull String str, @NonNull String str2) {
        if (a(3)) {
            Log.d(str, j(str2));
        }
    }

    public void c(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(3)) {
            Log.d(str, j(str2), th2);
        }
    }

    public void d(@NonNull String str, @NonNull String str2) {
        if (a(6)) {
            Log.e(str, j(str2));
        }
    }

    public void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(6)) {
            Log.e(str, j(str2), th2);
        }
    }

    public void f(@NonNull String str, @NonNull String str2) {
        if (a(4)) {
            Log.i(str, j(str2));
        }
    }

    public void g(@NonNull String str, @NonNull String str2) {
        if (a(2)) {
            Log.v(str, j(str2));
        }
    }

    public void h(@NonNull String str, @NonNull String str2) {
        if (a(5)) {
            Log.w(str, j(str2));
        }
    }

    public void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(5)) {
            Log.w(str, j(str2), th2);
        }
    }

    public final String j(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2.concat(str);
    }

    public g(@NonNull String str, String str2) {
        m.m(str, "log tag cannot be null");
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f25267a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
