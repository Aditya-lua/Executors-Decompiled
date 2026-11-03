package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f31157a;
    public final /* synthetic */ w b;

    public v(w wVar, Task task) {
        this.b = wVar;
        this.f31157a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.b.b.then(this.f31157a);
            if (task == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            w wVar = this.b;
            Executor executor = l.b;
            task.f(executor, wVar);
            task.d(executor, this.b);
            task.a(executor, this.b);
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                this.b.f31159c.p((Exception) e10.getCause());
            } else {
                this.b.f31159c.p(e10);
            }
        } catch (Exception e11) {
            this.b.f31159c.p(e11);
        }
    }
}
