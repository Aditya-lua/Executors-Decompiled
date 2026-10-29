package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30576a;
    public final /* synthetic */ c0 b;

    public b0(c0 c0Var, Task task) {
        this.b = c0Var;
        this.f30576a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            try {
                c0 c0Var = this.b;
                if (c0Var.f30578c != null) {
                    c0Var.f30578c.onFailure((Exception) n9.m.l(this.f30576a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
