package y5;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class d implements x5.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f35592a = u2.i.a(Looper.getMainLooper());

    @Override // x5.j0
    public void a(Runnable runnable) {
        this.f35592a.removeCallbacks(runnable);
    }

    @Override // x5.j0
    public void b(long j10, Runnable runnable) {
        this.f35592a.postDelayed(runnable, j10);
    }
}
