package n5;

import android.os.Trace;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static void a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
