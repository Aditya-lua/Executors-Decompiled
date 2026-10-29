package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25459a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f25460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f25461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f25462e;

    public dc(tc tcVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f25459a = str;
        this.b = str2;
        this.f25460c = zzrVar;
        this.f25461d = x1Var;
        Objects.requireNonNull(tcVar);
        this.f25462e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve veVarC;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                tc tcVar = this.f25462e;
                d5 d5VarN = tcVar.N();
                if (d5VarN == null) {
                    g7 g7Var = tcVar.f25625a;
                    g7Var.a().o().c("Failed to get conditional properties; not connected to service", this.f25459a, this.b);
                    veVarC = g7Var.C();
                    x1Var = this.f25461d;
                } else {
                    zzr zzrVar = this.f25460c;
                    n9.m.l(zzrVar);
                    arrayList = ve.h0(d5VarN.e2(this.f25459a, this.b, zzrVar));
                    tcVar.J();
                    tc tcVar2 = this.f25462e;
                    x1Var = this.f25461d;
                    veVarC = tcVar2.f25625a.C();
                }
            } catch (RemoteException e10) {
                this.f25462e.f25625a.a().o().d("Failed to get conditional properties; remote exception", this.f25459a, this.b, e10);
            }
            veVarC.g0(x1Var, arrayList);
        } catch (Throwable th2) {
            tc tcVar3 = this.f25462e;
            tcVar3.f25625a.C().g0(this.f25461d, arrayList);
            throw th2;
        }
    }
}
