package ee;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: ee.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5096t0 {

    /* JADX INFO: renamed from: a */
    public final String f19910a;

    public C5096t0(String str) {
        this.f19910a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m23838e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m23839a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m23838e(this.f19910a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m23840b(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m23838e(this.f19910a, str, objArr), th2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m23841c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m23838e(this.f19910a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m23842d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m23838e(this.f19910a, str, objArr));
        }
        return 0;
    }
}
