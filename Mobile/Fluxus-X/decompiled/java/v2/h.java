package v2;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34185a;
        public int b;

        /* JADX INFO: renamed from: v2.h$a$a, reason: collision with other inner class name */
        public static class C0697a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f34186a;

            public C0697a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f34186a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f34186a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f34185a = str;
            this.b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0697a(runnable, this.f34185a, this.b);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f34187a;

        public b(Handler handler) {
            this.f34187a = (Handler) x2.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f34187a.post((Runnable) x2.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f34187a + " is shutting down");
        }
    }

    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callable<T> f34188a;
        public x2.a<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f34189c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x2.a f34190a;
            public final /* synthetic */ Object b;

            public a(x2.a aVar, Object obj) {
                this.f34190a = aVar;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f34190a.accept(this.b);
            }
        }

        public c(Handler handler, Callable<T> callable, x2.a<T> aVar) {
            this.f34188a = callable;
            this.b = aVar;
            this.f34189c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f34188a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f34189c.post(new a(this.b, tCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static <T> void c(Executor executor, Callable<T> callable, x2.a<T> aVar) {
        executor.execute(new c(v2.b.a(), callable, aVar));
    }

    public static <T> T d(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
