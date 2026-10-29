package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C11283y implements InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39614a;

    /* JADX INFO: renamed from: b */
    public final Object f39615b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC11252e f39616c;

    public C11283y(@NonNull Executor executor, @NonNull InterfaceC11252e interfaceC11252e) {
        this.f39614a = executor;
        this.f39616c = interfaceC11252e;
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        if (task.mo11898l()) {
            synchronized (this.f39615b) {
                try {
                    if (this.f39616c == null) {
                        return;
                    }
                    this.f39614a.execute(new RunnableC11282x(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        synchronized (this.f39615b) {
            this.f39616c = null;
        }
    }
}
