package p601zd;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: zd.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C13776e {

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor f48362a;

    /* JADX INFO: renamed from: a */
    public static Executor m50205a() {
        if (f48362a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC13775d());
            f48362a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48362a;
    }
}
