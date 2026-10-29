package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11257g0<TResult, TContinuationResult> implements InterfaceC11256g<TContinuationResult>, InterfaceC11254f, InterfaceC11252e, InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39572a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11262j f39573b;

    /* JADX INFO: renamed from: c */
    public final C11271n0 f39574c;

    public C11257g0(@NonNull Executor executor, @NonNull InterfaceC11262j interfaceC11262j, @NonNull C11271n0 c11271n0) {
        this.f39572a = executor;
        this.f39573b = interfaceC11262j;
        this.f39574c = c11271n0;
    }

    @Override // sb.InterfaceC11252e
    /* JADX INFO: renamed from: a */
    public final void mo42318a() {
        this.f39574c.m42345r();
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        this.f39572a.execute(new RunnableC11255f0(this, task));
    }

    @Override // sb.InterfaceC11254f
    public final void onFailure(@NonNull Exception exc) {
        this.f39574c.m42343p(exc);
    }

    @Override // sb.InterfaceC11256g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39574c.m42344q(tcontinuationresult);
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
