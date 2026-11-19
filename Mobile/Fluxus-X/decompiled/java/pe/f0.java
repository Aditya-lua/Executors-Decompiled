package pe;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29068a = null;
    public Boolean b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f29069c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f29070d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ThreadFactory f29071e = null;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f29072a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f29073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f29074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f29075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f29076f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f29072a = threadFactory;
            this.b = str;
            this.f29073c = atomicLong;
            this.f29074d = bool;
            this.f29075e = num;
            this.f29076f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f29072a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                AtomicLong atomicLong = this.f29073c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(f0.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f29074d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f29075e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f29076f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(f0 f0Var) {
        String str = f0Var.f29068a;
        Boolean bool = f0Var.b;
        Integer num = f0Var.f29069c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f0Var.f29070d;
        ThreadFactory threadFactoryDefaultThreadFactory = f0Var.f29071e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public f0 e(boolean z10) {
        this.b = Boolean.valueOf(z10);
        return this;
    }

    public f0 f(String str) {
        d(str, 0);
        this.f29068a = str;
        return this;
    }

    public f0 g(int i10) {
        je.n.g(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        je.n.g(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f29069c = Integer.valueOf(i10);
        return this;
    }

    public f0 h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29070d = (Thread.UncaughtExceptionHandler) je.n.l(uncaughtExceptionHandler);
        return this;
    }
}
