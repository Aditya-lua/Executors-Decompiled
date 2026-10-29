package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f30573a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnCompleteListener f30574c;

    public a0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f30573a = executor;
        this.f30574c = onCompleteListener;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        synchronized (this.b) {
            try {
                if (this.f30574c == null) {
                    return;
                }
                this.f30573a.execute(new z(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f30574c = null;
        }
    }
}
