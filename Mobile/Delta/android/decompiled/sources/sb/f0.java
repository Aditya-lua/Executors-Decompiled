package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30582a;
    public final /* synthetic */ g0 b;

    public f0(g0 g0Var, Task task) {
        this.b = g0Var;
        this.f30582a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.b.b.then(this.f30582a.getResult());
            if (taskThen == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            g0 g0Var = this.b;
            Executor executor = l.b;
            taskThen.f(executor, g0Var);
            taskThen.d(executor, this.b);
            taskThen.a(executor, this.b);
        } catch (CancellationException unused) {
            this.b.a();
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e10.getCause());
            } else {
                this.b.onFailure(e10);
            }
        } catch (Exception e11) {
            this.b.onFailure(e11);
        }
    }
}
