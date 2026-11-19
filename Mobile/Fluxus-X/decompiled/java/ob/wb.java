package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27953a;
    public final /* synthetic */ yc b;

    public wb(yc ycVar, hf hfVar, boolean z10) {
        this.f27953a = hfVar;
        Objects.requireNonNull(ycVar);
        this.b = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.b;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            hf hfVar = this.f27953a;
            o9.s.l(hfVar);
            l7 l7Var = ycVar.f27641a;
            m mVarW = l7Var.w();
            d5 d5Var = e5.f27231c1;
            if (mVarW.H(null, d5Var)) {
                ycVar.b0(i5VarN, null, hfVar);
            }
            i5VarN.i0(hfVar);
            ycVar.f27641a.E().v();
            l7Var.w().H(null, d5Var);
            ycVar.b0(i5VarN, null, hfVar);
            ycVar.J();
        } catch (RemoteException e10) {
            this.b.f27641a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
