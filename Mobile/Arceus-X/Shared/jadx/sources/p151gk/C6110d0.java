package p151gk;

import android.os.SystemClock;

/* JADX INFO: renamed from: gk.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C6110d0 implements InterfaceC6108c0 {
    @Override // p151gk.InterfaceC6108c0
    /* JADX INFO: renamed from: a */
    public long mo27016a() {
        return System.currentTimeMillis();
    }

    @Override // p151gk.InterfaceC6108c0
    /* JADX INFO: renamed from: b */
    public long mo27017b() {
        return SystemClock.elapsedRealtime();
    }
}
