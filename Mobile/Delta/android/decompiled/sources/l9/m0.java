package l9;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f23050a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, ConnectionResult connectionResult) {
        this.b = n0Var;
        this.f23050a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = this.b;
        j0 j0Var = (j0) n0Var.f23057f.f23013o.get(n0Var.b);
        if (j0Var == null) {
            return;
        }
        if (!this.f23050a.A3()) {
            j0Var.F(this.f23050a, null);
            return;
        }
        this.b.f23056e = true;
        if (this.b.f23053a.requiresSignIn()) {
            this.b.i();
            return;
        }
        try {
            n0 n0Var2 = this.b;
            n0Var2.f23053a.getRemoteService(null, n0Var2.f23053a.b());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.b.f23053a.disconnect("Failed to get service from broker.");
            j0Var.F(new ConnectionResult(10), null);
        }
    }
}
