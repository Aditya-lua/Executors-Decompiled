package sb;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: sb.t */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11278t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11279u f39604b;

    public RunnableC11278t(C11279u c11279u, Task task) {
        this.f39604b = c11279u;
        this.f39603a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f39603a.mo11898l()) {
            this.f39604b.f39607c.m42345r();
            return;
        }
        try {
            this.f39604b.f39607c.m42344q(this.f39604b.f39606b.then(this.f39603a));
        } catch (C11260i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39604b.f39607c.m42343p((Exception) e10.getCause());
            } else {
                this.f39604b.f39607c.m42343p(e10);
            }
        } catch (Exception e11) {
            this.f39604b.f39607c.m42343p(e11);
        }
    }
}
