package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f31154a;
    public final /* synthetic */ u b;

    public t(u uVar, Task task) {
        this.b = uVar;
        this.f31154a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31154a.l()) {
            this.b.f31156c.r();
            return;
        }
        try {
            this.b.f31156c.q(this.b.b.then(this.f31154a));
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                this.b.f31156c.p((Exception) e10.getCause());
            } else {
                this.b.f31156c.p(e10);
            }
        } catch (Exception e11) {
            this.b.f31156c.p(e11);
        }
    }
}
