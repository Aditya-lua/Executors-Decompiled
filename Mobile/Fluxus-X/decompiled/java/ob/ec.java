package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ec implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27306a;
    public final /* synthetic */ yc b;

    public ec(yc ycVar, hf hfVar) {
        this.f27306a = hfVar;
        Objects.requireNonNull(ycVar);
        this.b = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.b;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            hf hfVar = this.f27306a;
            o9.s.l(hfVar);
            i5VarN.O(hfVar);
            ycVar.J();
        } catch (RemoteException e10) {
            this.b.f27641a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
