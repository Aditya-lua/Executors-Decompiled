package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31155a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f31156c;

    public u(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f31155a = executor;
        this.b = cVar;
        this.f31156c = n0Var;
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31155a.execute(new t(this, task));
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
