package m9;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k9.b f23035a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, k9.b bVar) {
        this.b = n0Var;
        this.f23035a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = this.b;
        j0 j0Var = (j0) n0Var.f23042f.f22998o.get(n0Var.b);
        if (j0Var == null) {
            return;
        }
        if (!this.f23035a.F3()) {
            j0Var.F(this.f23035a, null);
            return;
        }
        this.b.f23041e = true;
        if (this.b.f23038a.requiresSignIn()) {
            this.b.i();
            return;
        }
        try {
            n0 n0Var2 = this.b;
            n0Var2.f23038a.getRemoteService(null, n0Var2.f23038a.c());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.b.f23038a.disconnect("Failed to get service from broker.");
            j0Var.F(new k9.b(10), null);
        }
    }
}
