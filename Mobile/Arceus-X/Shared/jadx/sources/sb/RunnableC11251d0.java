package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: sb.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11251d0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11253e0 f39566b;

    public RunnableC11251d0(C11253e0 c11253e0, Task task) {
        this.f39566b = c11253e0;
        this.f39565a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39566b.f39568b) {
            try {
                C11253e0 c11253e0 = this.f39566b;
                if (c11253e0.f39569c != null) {
                    c11253e0.f39569c.onSuccess(this.f39565a.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
