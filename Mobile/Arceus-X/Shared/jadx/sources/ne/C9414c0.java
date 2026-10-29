package ne;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ne.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9414c0 {
    /* JADX INFO: renamed from: a */
    public static void m37195a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
