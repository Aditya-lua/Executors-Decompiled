package m9;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements o9.d.c, e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a.f f23038a;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o9.l f23039c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f23040d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23041e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f23042f;

    public n0(f fVar, l9.a.f fVar2, b bVar) {
        this.f23042f = fVar;
        this.f23038a = fVar2;
        this.b = bVar;
    }

    @Override // m9.e1
    public final void a(k9.b bVar) {
        j0 j0Var = (j0) this.f23042f.f22998o.get(this.b);
        if (j0Var != null) {
            j0Var.G(bVar);
        }
    }

    @Override // m9.e1
    public final void b(o9.l lVar, Set set) {
        if (lVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new k9.b(4));
        } else {
            this.f23039c = lVar;
            this.f23040d = set;
            i();
        }
    }

    @Override // o9.d.c
    public final void c(@NonNull k9.b bVar) {
        this.f23042f.f23002s.post(new m0(this, bVar));
    }

    @Override // m9.e1
    public final void d(int i10) {
        j0 j0Var = (j0) this.f23042f.f22998o.get(this.b);
        if (j0Var != null) {
            if (j0Var.f23025i) {
                j0Var.G(new k9.b(17));
            } else {
                j0Var.onConnectionSuspended(i10);
            }
        }
    }

    public final void i() {
        o9.l lVar;
        if (!this.f23041e || (lVar = this.f23039c) == null) {
            return;
        }
        this.f23038a.getRemoteService(lVar, this.f23040d);
    }
}
