package p593z3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes.dex */
public class C13691b {

    /* JADX INFO: renamed from: z3.b$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Handler m50014a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m50011a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m50012b(@NonNull final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: z3.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C13691b.m50011a(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m50013c() {
        return Build.VERSION.SDK_INT >= 28 ? a.m50014a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
