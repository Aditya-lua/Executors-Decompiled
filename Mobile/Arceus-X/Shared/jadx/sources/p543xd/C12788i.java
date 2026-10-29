package p543xd;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: xd.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C12788i {

    /* JADX INFO: renamed from: a */
    public final String f45519a;

    public C12788i(String str) {
        this.f45519a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m47649e(String str, String str2, Object... objArr) {
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
    public final int m47650a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m47649e(this.f45519a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m47651b(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m47649e(this.f45519a, str, objArr), th2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m47652c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m47649e(this.f45519a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m47653d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m47649e(this.f45519a, str, objArr));
        }
        return 0;
    }
}
