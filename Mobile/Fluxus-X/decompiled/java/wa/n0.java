package wa;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class n0 implements OnCompleteListener, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final l9.g f35722a;

    @NonNull
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f35723c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35724d = 0;

    public n0(@NonNull l9.g gVar) {
        this.f35722a = gVar;
        this.b = new e(gVar.I());
    }

    public final Task d(nf.g gVar) {
        boolean zIsEmpty;
        m0 m0Var = new m0(this, gVar);
        Task taskA = m0Var.a();
        taskA.c(this, this);
        synchronized (this.f35723c) {
            zIsEmpty = this.f35723c.isEmpty();
            this.f35723c.add(m0Var);
        }
        if (zIsEmpty) {
            m0Var.d();
        }
        return taskA;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        m0 m0Var;
        synchronized (this.f35723c) {
            try {
                if (this.f35724d == 2) {
                    m0Var = (m0) this.f35723c.peek();
                    o9.s.p(m0Var != null);
                } else {
                    m0Var = null;
                }
                this.f35724d = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m0Var != null) {
            m0Var.d();
        }
    }
}
