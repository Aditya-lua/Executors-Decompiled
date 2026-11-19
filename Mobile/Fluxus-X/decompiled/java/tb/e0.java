package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32288a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f32289c;

    public e0(@NonNull Executor executor, @NonNull g gVar) {
        this.f32288a = executor;
        this.f32289c = gVar;
    }

    @Override // tb.h0
    public final void b(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.b) {
                try {
                    if (this.f32289c == null) {
                        return;
                    }
                    this.f32288a.execute(new d0(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // tb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f32289c = null;
        }
    }
}
