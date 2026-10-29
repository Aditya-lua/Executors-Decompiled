package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C11279u implements InterfaceC11259h0 {

    /* JADX INFO: renamed from: a */
    public final Executor f39605a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11248c f39606b;

    /* JADX INFO: renamed from: c */
    public final C11271n0 f39607c;

    public C11279u(@NonNull Executor executor, @NonNull InterfaceC11248c interfaceC11248c, @NonNull C11271n0 c11271n0) {
        this.f39605a = executor;
        this.f39606b = interfaceC11248c;
        this.f39607c = c11271n0;
    }

    @Override // sb.InterfaceC11259h0
    /* JADX INFO: renamed from: b */
    public final void mo42312b(@NonNull Task task) {
        this.f39605a.execute(new RunnableC11278t(this, task));
    }

    @Override // sb.InterfaceC11259h0
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
