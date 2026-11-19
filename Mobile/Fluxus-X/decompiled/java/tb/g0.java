package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g0<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32291a;
    public final j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f32292c;

    public g0(@NonNull Executor executor, @NonNull j jVar, @NonNull n0 n0Var) {
        this.f32291a = executor;
        this.b = jVar;
        this.f32292c = n0Var;
    }

    @Override // tb.e
    public final void a() {
        this.f32292c.r();
    }

    @Override // tb.h0
    public final void b(@NonNull Task task) {
        this.f32291a.execute(new f0(this, task));
    }

    @Override // tb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f32292c.p(exc);
    }

    @Override // tb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f32292c.q(tcontinuationresult);
    }

    @Override // tb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
