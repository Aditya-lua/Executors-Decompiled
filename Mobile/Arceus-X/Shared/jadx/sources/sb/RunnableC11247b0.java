package sb;

import com.google.android.gms.tasks.Task;
import p305n9.C8953m;

/* JADX INFO: renamed from: sb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11247b0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11249c0 f39561b;

    public RunnableC11247b0(C11249c0 c11249c0, Task task) {
        this.f39561b = c11249c0;
        this.f39560a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39561b.f39563b) {
            try {
                C11249c0 c11249c0 = this.f39561b;
                if (c11249c0.f39564c != null) {
                    c11249c0.f39564c.onFailure((Exception) C8953m.m36047l(this.f39560a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
