package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32316a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f32317c;

    public u(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f32316a = executor;
        this.b = cVar;
        this.f32317c = n0Var;
    }

    @Override // tb.h0
    public final void b(@NonNull Task task) {
        this.f32316a.execute(new t(this, task));
    }

    @Override // tb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
