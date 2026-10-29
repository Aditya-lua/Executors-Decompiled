package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30579a;
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var, Task task) {
        this.b = e0Var;
        this.f30579a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            try {
                e0 e0Var = this.b;
                if (e0Var.f30581c != null) {
                    e0Var.f30581c.onSuccess(this.f30579a.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
