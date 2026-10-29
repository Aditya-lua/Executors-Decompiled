package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26073a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26075d;

    public wb(tc tcVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26073a = zzbgVar;
        this.b = str;
        this.f26074c = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26075d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve veVarC;
        byte[] bArrH0 = null;
        try {
            try {
                tc tcVar = this.f26075d;
                d5 d5VarN = tcVar.N();
                if (d5VarN == null) {
                    g7 g7Var = tcVar.f25625a;
                    g7Var.a().o().a("Discarding data. Failed to send event to service to bundle");
                    veVarC = g7Var.C();
                    x1Var = this.f26074c;
                } else {
                    bArrH0 = d5VarN.h0(this.f26073a, this.b);
                    tcVar.J();
                    tc tcVar2 = this.f26075d;
                    x1Var = this.f26074c;
                    veVarC = tcVar2.f25625a.C();
                }
            } catch (RemoteException e10) {
                this.f26075d.f25625a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            veVarC.d0(x1Var, bArrH0);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26075d;
            tcVar3.f25625a.C().d0(this.f26074c, null);
            throw th2;
        }
    }
}
