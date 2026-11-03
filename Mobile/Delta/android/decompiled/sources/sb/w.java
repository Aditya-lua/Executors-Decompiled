package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31158a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f31159c;

    public w(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f31158a = executor;
        this.b = cVar;
        this.f31159c = n0Var;
    }

    @Override // sb.e
    public final void a() {
        this.f31159c.r();
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31158a.execute(new v(this, task));
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31159c.p(exc);
    }

    @Override // sb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f31159c.q(tcontinuationresult);
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
