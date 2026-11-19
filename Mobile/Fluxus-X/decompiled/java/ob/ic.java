package ob;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27475a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf f27476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc f27478e;

    public ic(yc ycVar, String str, String str2, hf hfVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27475a = str;
        this.b = str2;
        this.f27476c = hfVar;
        this.f27477d = x1Var;
        Objects.requireNonNull(ycVar);
        this.f27478e = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ff ffVarC;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                yc ycVar = this.f27478e;
                i5 i5VarN = ycVar.N();
                if (i5VarN == null) {
                    l7 l7Var = ycVar.f27641a;
                    l7Var.a().o().c("Failed to get conditional properties; not connected to service", this.f27475a, this.b);
                    ffVarC = l7Var.C();
                    x1Var = this.f27477d;
                } else {
                    hf hfVar = this.f27476c;
                    o9.s.l(hfVar);
                    arrayList = ff.h0(i5VarN.l1(this.f27475a, this.b, hfVar));
                    ycVar.J();
                    yc ycVar2 = this.f27478e;
                    x1Var = this.f27477d;
                    ffVarC = ycVar2.f27641a.C();
                }
            } catch (RemoteException e10) {
                this.f27478e.f27641a.a().o().d("Failed to get conditional properties; remote exception", this.f27475a, this.b, e10);
            }
            ffVarC.g0(x1Var, arrayList);
        } catch (Throwable th2) {
            yc ycVar3 = this.f27478e;
            ycVar3.f27641a.C().g0(this.f27477d, arrayList);
            throw th2;
        }
    }
}
