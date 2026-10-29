package p601zd;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: zd.d */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC13775d implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
