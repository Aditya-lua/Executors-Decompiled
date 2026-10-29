package l9;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements n9.c.InterfaceC0440c, e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.a.f f23053a;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.b f23054c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f23055d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23056e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f23057f;

    public n0(f fVar, k9.a.f fVar2, b bVar) {
        this.f23057f = fVar;
        this.f23053a = fVar2;
        this.b = bVar;
    }

    @Override // n9.c.InterfaceC0440c
    public final void a(@NonNull ConnectionResult connectionResult) {
        this.f23057f.f23017s.post(new m0(this, connectionResult));
    }

    @Override // l9.e1
    public final void b(com.google.android.gms.common.internal.b bVar, Set set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
        } else {
            this.f23054c = bVar;
            this.f23055d = set;
            i();
        }
    }

    @Override // l9.e1
    public final void c(ConnectionResult connectionResult) {
        j0 j0Var = (j0) this.f23057f.f23013o.get(this.b);
        if (j0Var != null) {
            j0Var.G(connectionResult);
        }
    }

    @Override // l9.e1
    public final void d(int i10) {
        j0 j0Var = (j0) this.f23057f.f23013o.get(this.b);
        if (j0Var != null) {
            if (j0Var.f23040i) {
                j0Var.G(new ConnectionResult(17));
            } else {
                j0Var.onConnectionSuspended(i10);
            }
        }
    }

    public final void i() {
        com.google.android.gms.common.internal.b bVar;
        if (!this.f23056e || (bVar = this.f23054c) == null) {
            return;
        }
        this.f23053a.getRemoteService(bVar, this.f23055d);
    }
}
