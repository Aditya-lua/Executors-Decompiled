package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26733a;
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f26734c;

    public qb(tc tcVar, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26733a = zzrVar;
        this.b = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26734c = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve veVarC;
        String strA0 = null;
        try {
            try {
                tc tcVar = this.f26734c;
                g7 g7Var = tcVar.f26446a;
                if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
                    d5 d5VarN = tcVar.N();
                    if (d5VarN != null) {
                        zzr zzrVar = this.f26733a;
                        n9.m.l(zzrVar);
                        strA0 = d5VarN.A0(zzrVar);
                        if (strA0 != null) {
                            tcVar.f26446a.B().E(strA0);
                            g7Var.x().f26494h.b(strA0);
                        }
                        tcVar.J();
                        tc tcVar2 = this.f26734c;
                        x1Var = this.b;
                        veVarC = tcVar2.f26446a.C();
                        veVarC.a0(x1Var, strA0);
                    }
                    g7Var.a().o().a("Failed to get app instance id");
                } else {
                    g7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                    tcVar.f26446a.B().E(null);
                    g7Var.x().f26494h.b(null);
                }
                veVarC = g7Var.C();
                x1Var = this.b;
            } catch (RemoteException e10) {
                this.f26734c.f26446a.a().o().b("Failed to get app instance id", e10);
            }
            veVarC.a0(x1Var, strA0);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26734c;
            tcVar3.f26446a.C().a0(this.b, null);
            throw th2;
        }
    }
}
