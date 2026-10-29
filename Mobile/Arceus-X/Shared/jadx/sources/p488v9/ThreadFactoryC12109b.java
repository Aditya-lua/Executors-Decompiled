package p488v9;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p305n9.C8953m;

/* JADX INFO: renamed from: v9.b */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC12109b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f42726a;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f42727b = Executors.defaultThreadFactory();

    public ThreadFactoryC12109b(@NonNull String str) {
        C8953m.m36048m(str, "Name must not be null");
        this.f42726a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.f42727b.newThread(new RunnableC12110c(runnable, 0));
        threadNewThread.setName(this.f42726a);
        return threadNewThread;
    }
}
