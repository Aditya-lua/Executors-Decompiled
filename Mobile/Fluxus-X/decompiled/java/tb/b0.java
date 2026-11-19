package tb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f32284a;
    public final /* synthetic */ c0 b;

    public b0(c0 c0Var, Task task) {
        this.b = c0Var;
        this.f32284a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            try {
                c0 c0Var = this.b;
                if (c0Var.f32286c != null) {
                    c0Var.f32286c.onFailure((Exception) o9.s.l(this.f32284a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
