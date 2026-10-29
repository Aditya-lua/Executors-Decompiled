package p488v9;

import android.os.Process;

/* JADX INFO: renamed from: v9.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC12110c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Runnable f42728a;

    public RunnableC12110c(Runnable runnable, int i10) {
        this.f42728a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f42728a.run();
    }
}
