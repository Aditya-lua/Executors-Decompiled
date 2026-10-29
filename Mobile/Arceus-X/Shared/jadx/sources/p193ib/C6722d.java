package p193ib;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: ib.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6722d {

    /* JADX INFO: renamed from: a */
    public final String f25827a;

    public C6722d(String str) {
        this.f25827a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m28818e(String str, String str2, Object... objArr) {
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
    public final int m28819a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m28818e(this.f25827a, "onError(%d)", objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m28820b(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m28818e(this.f25827a, str, objArr), th2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m28821c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m28818e(this.f25827a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m28822d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m28818e(this.f25827a, str, objArr));
        }
        return 0;
    }
}
