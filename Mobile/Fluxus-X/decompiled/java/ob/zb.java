package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f28040a;
    public final /* synthetic */ yc b;

    public zb(yc ycVar, gb gbVar) {
        this.f28040a = gbVar;
        Objects.requireNonNull(ycVar);
        this.b = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.b;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            gb gbVar = this.f28040a;
            if (gbVar == null) {
                i5VarN.d1(0L, null, null, ycVar.f27641a.d().getPackageName());
            } else {
                i5VarN.d1(gbVar.f27355c, gbVar.f27354a, gbVar.b, ycVar.f27641a.d().getPackageName());
            }
            ycVar.J();
        } catch (RemoteException e10) {
            this.b.f27641a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
