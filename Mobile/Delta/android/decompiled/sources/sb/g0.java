package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g0<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31130a;
    public final j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f31131c;

    public g0(@NonNull Executor executor, @NonNull j jVar, @NonNull n0 n0Var) {
        this.f31130a = executor;
        this.b = jVar;
        this.f31131c = n0Var;
    }

    @Override // sb.e
    public final void a() {
        this.f31131c.r();
    }

    @Override // sb.h0
    public final void b(@NonNull Task task) {
        this.f31130a.execute(new f0(this, task));
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f31131c.p(exc);
    }

    @Override // sb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f31131c.q(tcontinuationresult);
    }

    @Override // sb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
