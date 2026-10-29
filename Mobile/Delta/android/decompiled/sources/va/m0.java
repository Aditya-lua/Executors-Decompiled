package va;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class m0 implements OnCompleteListener, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final k9.e f32899a;

    @NonNull
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f32900c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32901d = 0;

    public m0(@NonNull k9.e eVar) {
        this.f32899a = eVar;
        this.b = new e(eVar.I());
    }

    public final Task d(zzg zzgVar) {
        boolean zIsEmpty;
        l0 l0Var = new l0(this, zzgVar);
        Task taskA = l0Var.a();
        taskA.c(this, this);
        synchronized (this.f32900c) {
            zIsEmpty = this.f32900c.isEmpty();
            this.f32900c.add(l0Var);
        }
        if (zIsEmpty) {
            l0Var.d();
        }
        return taskA;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        l0 l0Var;
        synchronized (this.f32900c) {
            try {
                if (this.f32901d == 2) {
                    l0Var = (l0) this.f32900c.peek();
                    n9.m.p(l0Var != null);
                } else {
                    l0Var = null;
                }
                this.f32901d = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l0Var != null) {
            l0Var.d();
        }
    }
}
