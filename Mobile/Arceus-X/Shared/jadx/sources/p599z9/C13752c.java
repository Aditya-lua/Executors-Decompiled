package p599z9;

import android.os.Process;

/* JADX INFO: renamed from: z9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13752c extends Thread {
    public C13752c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
