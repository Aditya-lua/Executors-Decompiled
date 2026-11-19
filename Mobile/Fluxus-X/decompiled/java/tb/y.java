package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32322a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f32323c;

    public y(@NonNull Executor executor, @NonNull e eVar) {
        this.f32322a = executor;
        this.f32323c = eVar;
    }

    @Override // tb.h0
    public final void b(@NonNull Task task) {
        if (task.l()) {
            synchronized (this.b) {
                try {
                    if (this.f32323c == null) {
                        return;
                    }
                    this.f32322a.execute(new x(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // tb.h0
    public final void zzc() {
        synchronized (this.b) {
            this.f32323c = null;
        }
    }
}
