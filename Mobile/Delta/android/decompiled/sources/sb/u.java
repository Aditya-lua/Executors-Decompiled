package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f30608a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f30609c;

    public u(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f30608a = executor;
        this.b = cVar;
        this.f30609c = n0Var;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f30608a.execute(new t(this, task));
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
