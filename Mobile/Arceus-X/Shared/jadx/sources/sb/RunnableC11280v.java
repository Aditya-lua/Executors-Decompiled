package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11280v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11281w f39609b;

    public RunnableC11280v(C11281w c11281w, Task task) {
        this.f39609b = c11281w;
        this.f39608a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f39609b.f39611b.then(this.f39608a);
            if (task == null) {
                this.f39609b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            C11281w c11281w = this.f39609b;
            Executor executor = C11266l.f39581b;
            task.mo11892f(executor, c11281w);
            task.mo11890d(executor, this.f39609b);
            task.mo11887a(executor, this.f39609b);
        } catch (C11260i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39609b.f39612c.m42343p((Exception) e10.getCause());
            } else {
                this.f39609b.f39612c.m42343p(e10);
            }
        } catch (Exception e11) {
            this.f39609b.f39612c.m42343p(e11);
        }
    }
}
