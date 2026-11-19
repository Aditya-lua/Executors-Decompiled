package ig;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ig.a f19491a;
    public static volatile ig.a b;

    /* JADX INFO: renamed from: ig.b$b, reason: collision with other inner class name */
    public static class C0362b implements ig.a {
        public C0362b() {
        }

        @Override // ig.a
        @NonNull
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0362b c0362b = new C0362b();
        f19491a = c0362b;
        b = c0362b;
    }

    public static ig.a a() {
        return b;
    }
}
