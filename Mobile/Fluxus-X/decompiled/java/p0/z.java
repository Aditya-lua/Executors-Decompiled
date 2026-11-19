package p0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static /* synthetic */ void a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void b() {
        x2.g.j(d(), "Not in application's main thread");
    }

    public static Handler c() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void e(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            x2.g.j(c().post(runnable), "Unable to post to main thread");
        }
    }

    public static void f(final Runnable runnable) {
        if (d()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        x2.g.j(c().post(new Runnable() { // from class: p0.y
            @Override // java.lang.Runnable
            public final void run() {
                z.a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e10) {
            throw new l(e10);
        }
    }
}
