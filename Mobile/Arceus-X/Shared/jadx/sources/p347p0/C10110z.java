package p347p0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C10110z {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39007a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m39008b() {
        C12637g.m47078j(m39010d(), "Not in application's main thread");
    }

    /* JADX INFO: renamed from: c */
    public static Handler m39009c() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m39010d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: e */
    public static void m39011e(Runnable runnable) {
        if (m39010d()) {
            runnable.run();
        } else {
            C12637g.m47078j(m39009c().post(runnable), "Unable to post to main thread");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m39012f(final Runnable runnable) {
        if (m39010d()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C12637g.m47078j(m39009c().post(new Runnable() { // from class: p0.y
            @Override // java.lang.Runnable
            public final void run() {
                C10110z.m39007a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e10) {
            throw new C10096l(e10);
        }
    }
}
