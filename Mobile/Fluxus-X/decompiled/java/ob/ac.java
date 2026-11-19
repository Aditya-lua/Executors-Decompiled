package ob;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27078a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f27079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f27080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc f27081e;

    public ac(yc ycVar, boolean z10, hf hfVar, boolean z11, g0 g0Var, Bundle bundle) {
        this.f27078a = hfVar;
        this.b = z11;
        this.f27079c = g0Var;
        this.f27080d = bundle;
        Objects.requireNonNull(ycVar);
        this.f27081e = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.f27081e;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (ycVar.f27641a.w().H(null, e5.f27231c1)) {
            hf hfVar = this.f27078a;
            o9.s.l(hfVar);
            this.f27081e.b0(i5VarN, this.b ? null : this.f27079c, hfVar);
            return;
        }
        try {
            hf hfVar2 = this.f27078a;
            o9.s.l(hfVar2);
            i5VarN.L1(this.f27080d, hfVar2);
            ycVar.J();
        } catch (RemoteException e10) {
            this.f27081e.f27641a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
