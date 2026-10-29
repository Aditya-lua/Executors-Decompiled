package ne;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9420f0 {

    /* JADX INFO: renamed from: a */
    public String f33921a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f33922b = null;

    /* JADX INFO: renamed from: c */
    public Integer f33923c = null;

    /* JADX INFO: renamed from: d */
    public Thread.UncaughtExceptionHandler f33924d = null;

    /* JADX INFO: renamed from: e */
    public ThreadFactory f33925e = null;

    /* JADX INFO: renamed from: ne.f0$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ThreadFactory f33926a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33927b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicLong f33928c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean f33929d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Integer f33930e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f33931f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f33926a = threadFactory;
            this.f33927b = str;
            this.f33928c = atomicLong;
            this.f33929d = bool;
            this.f33930e = num;
            this.f33931f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f33926a.newThread(runnable);
            String str = this.f33927b;
            if (str != null) {
                AtomicLong atomicLong = this.f33928c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(C9420f0.m37207d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f33929d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f33930e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33931f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ThreadFactory m37206c(C9420f0 c9420f0) {
        String str = c9420f0.f33921a;
        Boolean bool = c9420f0.f33922b;
        Integer num = c9420f0.f33923c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c9420f0.f33924d;
        ThreadFactory threadFactoryDefaultThreadFactory = c9420f0.f33925e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: renamed from: d */
    public static String m37207d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public ThreadFactory m37208b() {
        return m37206c(this);
    }

    /* JADX INFO: renamed from: e */
    public C9420f0 m37209e(boolean z10) {
        this.f33922b = Boolean.valueOf(z10);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C9420f0 m37210f(String str) {
        m37207d(str, 0);
        this.f33921a = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C9420f0 m37211g(int i10) {
        C6384n.m27923g(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        C6384n.m27923g(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f33923c = Integer.valueOf(i10);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C9420f0 m37212h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33924d = (Thread.UncaughtExceptionHandler) C6384n.m27928l(uncaughtExceptionHandler);
        return this;
    }
}
