package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11245a0 implements InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39556a;

    /* JADX INFO: renamed from: b */
    public final Object f39557b = new Object();

    /* JADX INFO: renamed from: c */
    public OnCompleteListener f39558c;

    public C11245a0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f39556a = executor;
        this.f39558c = onCompleteListener;
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        synchronized (this.f39557b) {
            try {
                if (this.f39558c == null) {
                    return;
                }
                this.f39556a.execute(new RunnableC11284z(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        synchronized (this.f39557b) {
            this.f39558c = null;
        }
    }
}
