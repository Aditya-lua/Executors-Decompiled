package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30607a;
    public final /* synthetic */ u b;

    public t(u uVar, Task task) {
        this.b = uVar;
        this.f30607a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30607a.l()) {
            this.b.f30609c.r();
            return;
        }
        try {
            this.b.f30609c.q(this.b.b.then(this.f30607a));
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                this.b.f30609c.p((Exception) e10.getCause());
            } else {
                this.b.f30609c.p(e10);
            }
        } catch (Exception e11) {
            this.b.f30609c.p(e11);
        }
    }
}
