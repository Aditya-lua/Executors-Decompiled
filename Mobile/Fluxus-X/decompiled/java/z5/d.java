package z5;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class d implements y5.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f38991a = u2.i.a(Looper.getMainLooper());

    @Override // y5.j0
    public void a(Runnable runnable) {
        this.f38991a.removeCallbacks(runnable);
    }

    @Override // y5.j0
    public void b(long j10, Runnable runnable) {
        this.f38991a.postDelayed(runnable, j10);
    }
}
