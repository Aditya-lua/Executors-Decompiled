package me;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24104a = null;
    public Boolean b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f24105c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f24106d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ThreadFactory f24107e = null;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f24108a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f24109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f24110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f24111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f24112f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f24108a = threadFactory;
            this.b = str;
            this.f24109c = atomicLong;
            this.f24110d = bool;
            this.f24111e = num;
            this.f24112f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f24108a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                AtomicLong atomicLong = this.f24109c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(f0.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f24110d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f24111e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24112f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(f0 f0Var) {
        String str = f0Var.f24104a;
        Boolean bool = f0Var.b;
        Integer num = f0Var.f24105c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f0Var.f24106d;
        ThreadFactory threadFactoryDefaultThreadFactory = f0Var.f24107e;
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
        this.f24104a = str;
        return this;
    }

    public f0 g(int i10) {
        ge.n.g(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        ge.n.g(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f24105c = Integer.valueOf(i10);
        return this;
    }

    public f0 h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f24106d = (Thread.UncaughtExceptionHandler) ge.n.l(uncaughtExceptionHandler);
        return this;
    }
}
