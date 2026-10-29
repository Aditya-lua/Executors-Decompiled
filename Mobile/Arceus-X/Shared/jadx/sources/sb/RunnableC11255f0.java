package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11255f0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task f39570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11257g0 f39571b;

    public RunnableC11255f0(C11257g0 c11257g0, Task task) {
        this.f39571b = c11257g0;
        this.f39570a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f39571b.f39573b.then(this.f39570a.getResult());
            if (taskThen == null) {
                this.f39571b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            C11257g0 c11257g0 = this.f39571b;
            Executor executor = C11266l.f39581b;
            taskThen.mo11892f(executor, c11257g0);
            taskThen.mo11890d(executor, this.f39571b);
            taskThen.mo11887a(executor, this.f39571b);
        } catch (CancellationException unused) {
            this.f39571b.mo42318a();
        } catch (C11260i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39571b.onFailure((Exception) e10.getCause());
            } else {
                this.f39571b.onFailure(e10);
            }
        } catch (Exception e11) {
            this.f39571b.onFailure(e11);
        }
    }
}
