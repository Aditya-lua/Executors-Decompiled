package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26280a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f26281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26283e;

    public dc(tc tcVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26280a = str;
        this.b = str2;
        this.f26281c = zzrVar;
        this.f26282d = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26283e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve veVarC;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                tc tcVar = this.f26283e;
                d5 d5VarN = tcVar.N();
                if (d5VarN == null) {
                    g7 g7Var = tcVar.f26446a;
                    g7Var.a().o().c("Failed to get conditional properties; not connected to service", this.f26280a, this.b);
                    veVarC = g7Var.C();
                    x1Var = this.f26282d;
                } else {
                    zzr zzrVar = this.f26281c;
                    n9.m.l(zzrVar);
                    arrayList = ve.h0(d5VarN.e2(this.f26280a, this.b, zzrVar));
                    tcVar.J();
                    tc tcVar2 = this.f26283e;
                    x1Var = this.f26282d;
                    veVarC = tcVar2.f26446a.C();
                }
            } catch (RemoteException e10) {
                this.f26283e.f26446a.a().o().d("Failed to get conditional properties; remote exception", this.f26280a, this.b, e10);
            }
            veVarC.g0(x1Var, arrayList);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26283e;
            tcVar3.f26446a.C().g0(this.f26282d, arrayList);
            throw th2;
        }
    }
}
