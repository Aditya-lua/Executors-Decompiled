package nb;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ub implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26836a;
    public final /* synthetic */ tc b;

    public ub(tc tcVar, bb bbVar) {
        this.f26836a = bbVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f26446a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            bb bbVar = this.f26836a;
            if (bbVar == null) {
                d5VarN.V0(0L, null, null, tcVar.f26446a.d().getPackageName());
            } else {
                d5VarN.V0(bbVar.f26187c, bbVar.f26186a, bbVar.b, tcVar.f26446a.d().getPackageName());
            }
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f26446a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
