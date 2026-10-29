package p282m1;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: m1.n1 */
/* JADX INFO: loaded from: classes.dex */
public class C8377n1 implements InterfaceC8380o1 {
    @Override // p282m1.InterfaceC8380o1
    /* JADX INFO: renamed from: a */
    public long mo34003a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // p282m1.InterfaceC8380o1
    /* JADX INFO: renamed from: b */
    public long mo34004b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
