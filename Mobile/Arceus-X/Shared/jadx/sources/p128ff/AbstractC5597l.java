package p128ff;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ff.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5597l {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC5597l m25288a(long j10, long j11, long j12) {
        return new C5586a(j10, j11, j12);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static AbstractC5597l m25289e() {
        return m25288a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo25249b();

    /* JADX INFO: renamed from: c */
    public abstract long mo25250c();

    /* JADX INFO: renamed from: d */
    public abstract long mo25251d();
}
