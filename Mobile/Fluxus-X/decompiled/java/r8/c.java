package r8;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<a> f30619a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f30620c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30621d = false;

    public c(a aVar, long j10) {
        this.f30619a = new WeakReference<>(aVar);
        this.b = j10;
        start();
    }

    public final void a() {
        a aVar = this.f30619a.get();
        if (aVar != null) {
            aVar.c();
            this.f30621d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f30620c.await(this.b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
