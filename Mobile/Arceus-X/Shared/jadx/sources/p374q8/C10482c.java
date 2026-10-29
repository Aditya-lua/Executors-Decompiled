package p374q8;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: q8.c */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class C10482c extends Thread {

    /* JADX INFO: renamed from: a */
    public final WeakReference<C10480a> f37693a;

    /* JADX INFO: renamed from: b */
    public final long f37694b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f37695c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public boolean f37696d = false;

    public C10482c(C10480a c10480a, long j10) {
        this.f37693a = new WeakReference<>(c10480a);
        this.f37694b = j10;
        start();
    }

    /* JADX INFO: renamed from: a */
    public final void m40288a() {
        C10480a c10480a = this.f37693a.get();
        if (c10480a != null) {
            c10480a.m40281c();
            this.f37696d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f37695c.await(this.f37694b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m40288a();
        } catch (InterruptedException unused) {
            m40288a();
        }
    }
}
