package gk;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements b0 {
    @Override // gk.b0
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // gk.b0
    public long b() {
        return SystemClock.elapsedRealtime();
    }
}
