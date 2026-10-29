package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C11281w<TResult, TContinuationResult> implements InterfaceC11256g<TContinuationResult>, InterfaceC11254f, InterfaceC11252e, InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39610a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11248c f39611b;

    /* JADX INFO: renamed from: c */
    public final C11271n0 f39612c;

    public C11281w(@NonNull Executor executor, @NonNull InterfaceC11248c interfaceC11248c, @NonNull C11271n0 c11271n0) {
        this.f39610a = executor;
        this.f39611b = interfaceC11248c;
        this.f39612c = c11271n0;
    }

    @Override // sb.InterfaceC11252e
    /* JADX INFO: renamed from: a */
    public final void mo42318a() {
        this.f39612c.m42345r();
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        this.f39610a.execute(new RunnableC11280v(this, task));
    }

    @Override // sb.InterfaceC11254f
    public final void onFailure(@NonNull Exception exc) {
        this.f39612c.m42343p(exc);
    }

    @Override // sb.InterfaceC11256g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39612c.m42344q(tcontinuationresult);
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
