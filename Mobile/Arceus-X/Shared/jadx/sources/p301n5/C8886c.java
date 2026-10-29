package p301n5;

import android.os.Trace;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: n5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8886c {
    /* JADX INFO: renamed from: a */
    public static void m35758a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    /* JADX INFO: renamed from: b */
    public static void m35759b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m35760c() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: d */
    public static void m35761d(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
