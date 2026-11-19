package ok;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class d0 implements c0 {
    @Override // ok.c0
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // ok.c0
    public long b() {
        return SystemClock.elapsedRealtime();
    }
}
