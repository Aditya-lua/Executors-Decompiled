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
import p242k9.AbstractC7495e;
import p305n9.C8953m;

/* JADX INFO: renamed from: va.m0 */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class ExecutorC12136m0 implements OnCompleteListener, Executor {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AbstractC7495e f42755a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f42756b;

    /* JADX INFO: renamed from: c */
    public final Queue f42757c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f42758d = 0;

    public ExecutorC12136m0(@NonNull AbstractC7495e abstractC7495e) {
        this.f42755a = abstractC7495e;
        this.f42756b = new HandlerC12119e(abstractC7495e.m31141I());
    }

    /* JADX INFO: renamed from: d */
    public final Task m44972d(zzg zzgVar) {
        boolean zIsEmpty;
        C12134l0 c12134l0 = new C12134l0(this, zzgVar);
        Task taskM44965a = c12134l0.m44965a();
        taskM44965a.mo11889c(this, this);
        synchronized (this.f42757c) {
            zIsEmpty = this.f42757c.isEmpty();
            this.f42757c.add(c12134l0);
        }
        if (zIsEmpty) {
            c12134l0.m44966d();
        }
        return taskM44965a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f42756b.post(runnable);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        C12134l0 c12134l0;
        synchronized (this.f42757c) {
            try {
                if (this.f42758d == 2) {
                    c12134l0 = (C12134l0) this.f42757c.peek();
                    C8953m.m36051p(c12134l0 != null);
                } else {
                    c12134l0 = null;
                }
                this.f42758d = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c12134l0 != null) {
            c12134l0.m44966d();
        }
    }
}
