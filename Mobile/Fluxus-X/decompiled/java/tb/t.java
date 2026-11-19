package tb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f32315a;
    public final /* synthetic */ u b;

    public t(u uVar, Task task) {
        this.b = uVar;
        this.f32315a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f32315a.l()) {
            this.b.f32317c.r();
            return;
        }
        try {
            this.b.f32317c.q(this.b.b.then(this.f32315a));
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                this.b.f32317c.p((Exception) e10.getCause());
            } else {
                this.b.f32317c.p(e10);
            }
        } catch (Exception e11) {
            this.b.f32317c.p(e11);
        }
    }
}
