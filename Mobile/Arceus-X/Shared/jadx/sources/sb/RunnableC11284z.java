package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: sb.z */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11284z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11245a0 f39618b;

    public RunnableC11284z(C11245a0 c11245a0, Task task) {
        this.f39618b = c11245a0;
        this.f39617a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39618b.f39557b) {
            try {
                C11245a0 c11245a0 = this.f39618b;
                if (c11245a0.f39558c != null) {
                    c11245a0.f39558c.onComplete(this.f39617a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
