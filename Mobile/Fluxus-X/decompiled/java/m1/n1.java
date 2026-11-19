package m1;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class n1 implements o1 {
    @Override // m1.o1
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // m1.o1
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
