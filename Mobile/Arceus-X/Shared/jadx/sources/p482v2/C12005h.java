package p482v2;

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
import p533x2.C12637g;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: v2.h */
/* JADX INFO: loaded from: classes.dex */
public class C12005h {

    /* JADX INFO: renamed from: v2.h$a */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f42526a;

        /* JADX INFO: renamed from: b */
        public int f42527b;

        /* JADX INFO: renamed from: v2.h$a$a, reason: collision with other inner class name */
        public static class C14269a extends Thread {

            /* JADX INFO: renamed from: a */
            public final int f42528a;

            public C14269a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f42528a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f42528a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f42526a = str;
            this.f42527b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C14269a(runnable, this.f42526a, this.f42527b);
        }
    }

    /* JADX INFO: renamed from: v2.h$b */
    public static class b implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f42529a;

        public b(Handler handler) {
            this.f42529a = (Handler) C12637g.m47075g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f42529a.post((Runnable) C12637g.m47075g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f42529a + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: v2.h$c */
    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public Callable<T> f42530a;

        /* JADX INFO: renamed from: b */
        public InterfaceC12631a<T> f42531b;

        /* JADX INFO: renamed from: c */
        public Handler f42532c;

        /* JADX INFO: renamed from: v2.h$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC12631a f42533a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f42534b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(InterfaceC12631a interfaceC12631a, Object obj) {
                this.f42533a = interfaceC12631a;
                this.f42534b = obj;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: x2.a */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f42533a.accept(this.f42534b);
            }
        }

        public c(Handler handler, Callable<T> callable, InterfaceC12631a<T> interfaceC12631a) {
            this.f42530a = callable;
            this.f42531b = interfaceC12631a;
            this.f42532c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f42530a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f42532c.post(new a(this.f42531b, tCall));
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m44825a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m44826b(Handler handler) {
        return new b(handler);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m44827c(Executor executor, Callable<T> callable, InterfaceC12631a<T> interfaceC12631a) {
        executor.execute(new c(C11999b.m44778a(), callable, interfaceC12631a));
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m44828d(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
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
