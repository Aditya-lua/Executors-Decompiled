package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11249c0 implements InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39562a;

    /* JADX INFO: renamed from: b */
    public final Object f39563b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC11254f f39564c;

    public C11249c0(@NonNull Executor executor, @NonNull InterfaceC11254f interfaceC11254f) {
        this.f39562a = executor;
        this.f39564c = interfaceC11254f;
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        if (task.isSuccessful() || task.mo11898l()) {
            return;
        }
        synchronized (this.f39563b) {
            try {
                if (this.f39564c == null) {
                    return;
                }
                this.f39562a.execute(new RunnableC11247b0(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        synchronized (this.f39563b) {
            this.f39564c = null;
        }
    }
}
