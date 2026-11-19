package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f27122a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc f27124d;

    public bc(yc ycVar, i0 i0Var, String str, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27122a = i0Var;
        this.b = str;
        this.f27123c = x1Var;
        Objects.requireNonNull(ycVar);
        this.f27124d = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ff ffVarC;
        byte[] bArrV1 = null;
        try {
            try {
                yc ycVar = this.f27124d;
                i5 i5VarN = ycVar.N();
                if (i5VarN == null) {
                    l7 l7Var = ycVar.f27641a;
                    l7Var.a().o().a("Discarding data. Failed to send event to service to bundle");
                    ffVarC = l7Var.C();
                    x1Var = this.f27123c;
                } else {
                    bArrV1 = i5VarN.V1(this.f27122a, this.b);
                    ycVar.J();
                    yc ycVar2 = this.f27124d;
                    x1Var = this.f27123c;
                    ffVarC = ycVar2.f27641a.C();
                }
            } catch (RemoteException e10) {
                this.f27124d.f27641a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            ffVarC.d0(x1Var, bArrV1);
        } catch (Throwable th2) {
            yc ycVar3 = this.f27124d;
            ycVar3.f27641a.C().d0(this.f27123c, null);
            throw th2;
        }
    }
}
