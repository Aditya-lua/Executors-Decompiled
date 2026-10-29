package n5;

import android.os.Trace;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static void a(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
