package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27824a;
    public final /* synthetic */ yc b;

    public tb(yc ycVar, hf hfVar) {
        this.f27824a = hfVar;
        Objects.requireNonNull(ycVar);
        this.b = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.b;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            hf hfVar = this.f27824a;
            o9.s.l(hfVar);
            i5VarN.v(hfVar);
        } catch (RemoteException e10) {
            this.b.f27641a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.b.J();
    }
}
