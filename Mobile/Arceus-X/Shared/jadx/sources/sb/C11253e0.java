package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11253e0 implements InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39567a;

    /* JADX INFO: renamed from: b */
    public final Object f39568b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC11256g f39569c;

    public C11253e0(@NonNull Executor executor, @NonNull InterfaceC11256g interfaceC11256g) {
        this.f39567a = executor;
        this.f39569c = interfaceC11256g;
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f39568b) {
                try {
                    if (this.f39569c == null) {
                        return;
                    }
                    this.f39567a.execute(new RunnableC11251d0(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        synchronized (this.f39568b) {
            this.f39569c = null;
        }
    }
}
