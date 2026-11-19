package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27895a;
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc f27896c;

    public vb(yc ycVar, hf hfVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27895a = hfVar;
        this.b = x1Var;
        Objects.requireNonNull(ycVar);
        this.f27896c = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ff ffVarC;
        String strY0 = null;
        try {
            try {
                yc ycVar = this.f27896c;
                l7 l7Var = ycVar.f27641a;
                if (l7Var.x().w().o(u8.ANALYTICS_STORAGE)) {
                    i5 i5VarN = ycVar.N();
                    if (i5VarN != null) {
                        hf hfVar = this.f27895a;
                        o9.s.l(hfVar);
                        strY0 = i5VarN.Y0(hfVar);
                        if (strY0 != null) {
                            ycVar.f27641a.B().E(strY0);
                            l7Var.x().f27688h.b(strY0);
                        }
                        ycVar.J();
                        yc ycVar2 = this.f27896c;
                        x1Var = this.b;
                        ffVarC = ycVar2.f27641a.C();
                        ffVarC.a0(x1Var, strY0);
                    }
                    l7Var.a().o().a("Failed to get app instance id");
                } else {
                    l7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                    ycVar.f27641a.B().E(null);
                    l7Var.x().f27688h.b(null);
                }
                ffVarC = l7Var.C();
                x1Var = this.b;
            } catch (RemoteException e10) {
                this.f27896c.f27641a.a().o().b("Failed to get app instance id", e10);
            }
            ffVarC.a0(x1Var, strY0);
        } catch (Throwable th2) {
            yc ycVar3 = this.f27896c;
            ycVar3.f27641a.C().a0(this.b, null);
            throw th2;
        }
    }
}
