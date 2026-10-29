package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30616a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, Task task) {
        this.b = a0Var;
        this.f30616a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            try {
                a0 a0Var = this.b;
                if (a0Var.f30574c != null) {
                    a0Var.f30574c.onComplete(this.f30616a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
