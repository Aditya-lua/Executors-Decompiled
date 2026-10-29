package be;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: be.q1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1355q1 {

    /* JADX INFO: renamed from: a */
    public final String f5401a;

    public C1355q1(String str) {
        this.f5401a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: f */
    public static String m7206f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m7207a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m7206f(this.f5401a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m7208b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m7206f(this.f5401a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m7209c(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m7206f(this.f5401a, str, objArr), th2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m7210d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m7206f(this.f5401a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m7211e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m7206f(this.f5401a, str, objArr));
        }
        return 0;
    }
}
