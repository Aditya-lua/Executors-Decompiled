package nb;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ub implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26015a;
    public final /* synthetic */ tc b;

    public ub(tc tcVar, bb bbVar) {
        this.f26015a = bbVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            bb bbVar = this.f26015a;
            if (bbVar == null) {
                d5VarN.Y0(0L, null, null, tcVar.f25625a.d().getPackageName());
            } else {
                d5VarN.Y0(bbVar.f25366c, bbVar.f25365a, bbVar.b, tcVar.f25625a.d().getPackageName());
            }
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f25625a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
