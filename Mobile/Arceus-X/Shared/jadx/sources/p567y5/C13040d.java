package p567y5;

import android.os.Handler;
import android.os.Looper;
import p456u2.C11780i;
import p536x5.InterfaceC12707j0;

/* JADX INFO: renamed from: y5.d */
/* JADX INFO: loaded from: classes.dex */
public class C13040d implements InterfaceC12707j0 {

    /* JADX INFO: renamed from: a */
    public final Handler f46170a = C11780i.m44064a(Looper.getMainLooper());

    @Override // p536x5.InterfaceC12707j0
    /* JADX INFO: renamed from: a */
    public void mo47381a(Runnable runnable) {
        this.f46170a.removeCallbacks(runnable);
    }

    @Override // p536x5.InterfaceC12707j0
    /* JADX INFO: renamed from: b */
    public void mo47382b(long j10, Runnable runnable) {
        this.f46170a.postDelayed(runnable, j10);
    }
}
