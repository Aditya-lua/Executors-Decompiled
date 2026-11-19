package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32319a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f32320c;

    public w(@NonNull Executor executor, @NonNull c cVar, @NonNull n0 n0Var) {
        this.f32319a = executor;
        this.b = cVar;
        this.f32320c = n0Var;
    }

    @Override // tb.e
    public final void a() {
        this.f32320c.r();
    }

    @Override // tb.h0
    public final void b(@NonNull Task task) {
        this.f32319a.execute(new v(this, task));
    }

    @Override // tb.f
    public final void onFailure(@NonNull Exception exc) {
        this.f32320c.p(exc);
    }

    @Override // tb.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f32320c.q(tcontinuationresult);
    }

    @Override // tb.h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
