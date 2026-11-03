package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31127a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f31128c;

    public e0(@NonNull Executor executor, @NonNull g gVar) {
        this.f31127a = executor;
        this.f31128c = gVar;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.b) {
                try {
                    if (this.f31128c == null) {
                        return;
                    }
                    this.f31127a.execute(new d0(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // sb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f31128c = null;
        }
    }
}
