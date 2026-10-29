package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f30577a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f30578c;

    public c0(@NonNull Executor executor, @NonNull f fVar) {
        this.f30577a = executor;
        this.f30578c = fVar;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        if (task.isSuccessful() || task.l()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.f30578c == null) {
                    return;
                }
                this.f30577a.execute(new b0(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f30578c = null;
        }
    }
}
