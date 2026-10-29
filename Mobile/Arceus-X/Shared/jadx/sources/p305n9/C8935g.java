package p305n9;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: n9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8935g {

    /* JADX INFO: renamed from: a */
    public final String f32596a;

    /* JADX INFO: renamed from: b */
    public final String f32597b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8935g(@NonNull String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m36001a(int i10) {
        return Log.isLoggable(this.f32596a, i10);
    }

    /* JADX INFO: renamed from: b */
    public void m36002b(@NonNull String str, @NonNull String str2) {
        if (m36001a(3)) {
            Log.d(str, m36010j(str2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m36003c(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (m36001a(3)) {
            Log.d(str, m36010j(str2), th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m36004d(@NonNull String str, @NonNull String str2) {
        if (m36001a(6)) {
            Log.e(str, m36010j(str2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m36005e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (m36001a(6)) {
            Log.e(str, m36010j(str2), th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m36006f(@NonNull String str, @NonNull String str2) {
        if (m36001a(4)) {
            Log.i(str, m36010j(str2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m36007g(@NonNull String str, @NonNull String str2) {
        if (m36001a(2)) {
            Log.v(str, m36010j(str2));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m36008h(@NonNull String str, @NonNull String str2) {
        if (m36001a(5)) {
            Log.w(str, m36010j(str2));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m36009i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (m36001a(5)) {
            Log.w(str, m36010j(str2), th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m36010j(String str) {
        String str2 = this.f32597b;
        return str2 == null ? str : str2.concat(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8935g(@NonNull String str, String str2) {
        C8953m.m36048m(str, "log tag cannot be null");
        C8953m.m36038c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f32596a = str;
        this.f32597b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
