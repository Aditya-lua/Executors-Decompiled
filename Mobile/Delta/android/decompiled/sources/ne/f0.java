package ne;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27112a = null;
    public Boolean b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f27113c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f27114d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ThreadFactory f27115e = null;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f27116a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f27117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f27118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f27119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f27120f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f27116a = threadFactory;
            this.b = str;
            this.f27117c = atomicLong;
            this.f27118d = bool;
            this.f27119e = num;
            this.f27120f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f27116a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                AtomicLong atomicLong = this.f27117c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(f0.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f27118d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f27119e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27120f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(f0 f0Var) {
        String str = f0Var.f27112a;
        Boolean bool = f0Var.b;
        Integer num = f0Var.f27113c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f0Var.f27114d;
        ThreadFactory threadFactoryDefaultThreadFactory = f0Var.f27115e;
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
        this.f27112a = str;
        return this;
    }

    public f0 g(int i10) {
        he.n.g(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        he.n.g(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f27113c = Integer.valueOf(i10);
        return this;
    }

    public f0 h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f27114d = (Thread.UncaughtExceptionHandler) he.n.l(uncaughtExceptionHandler);
        return this;
    }
}
