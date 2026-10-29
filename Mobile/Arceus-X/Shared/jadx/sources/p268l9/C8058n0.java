package p268l9;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC1903b;
import java.util.Set;
import p242k9.C7491a;
import p305n9.AbstractC8923c;

/* JADX INFO: renamed from: l9.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8058n0 implements AbstractC8923c.c, InterfaceC8032e1 {

    /* JADX INFO: renamed from: a */
    public final C7491a.f f30053a;

    /* JADX INFO: renamed from: b */
    public final C8021b f30054b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1903b f30055c = null;

    /* JADX INFO: renamed from: d */
    public Set f30056d = null;

    /* JADX INFO: renamed from: e */
    public boolean f30057e = false;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C8033f f30058f;

    public C8058n0(C8033f c8033f, C7491a.f fVar, C8021b c8021b) {
        this.f30058f = c8033f;
        this.f30053a = fVar;
        this.f30054b = c8021b;
    }

    @Override // p305n9.AbstractC8923c.c
    /* JADX INFO: renamed from: a */
    public final void mo33245a(@NonNull ConnectionResult connectionResult) {
        this.f30058f.f30007s.post(new RunnableC8055m0(this, connectionResult));
    }

    @Override // p268l9.InterfaceC8032e1
    /* JADX INFO: renamed from: b */
    public final void mo33125b(InterfaceC1903b interfaceC1903b, Set set) {
        if (interfaceC1903b == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo33126c(new ConnectionResult(4));
        } else {
            this.f30055c = interfaceC1903b;
            this.f30056d = set;
            m33246i();
        }
    }

    @Override // p268l9.InterfaceC8032e1
    /* JADX INFO: renamed from: c */
    public final void mo33126c(ConnectionResult connectionResult) {
        C8046j0 c8046j0 = (C8046j0) this.f30058f.f30003o.get(this.f30054b);
        if (c8046j0 != null) {
            c8046j0.m33202G(connectionResult);
        }
    }

    @Override // p268l9.InterfaceC8032e1
    /* JADX INFO: renamed from: d */
    public final void mo33127d(int i10) {
        C8046j0 c8046j0 = (C8046j0) this.f30058f.f30003o.get(this.f30054b);
        if (c8046j0 != null) {
            if (c8046j0.f30034i) {
                c8046j0.m33202G(new ConnectionResult(17));
            } else {
                c8046j0.onConnectionSuspended(i10);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33246i() {
        InterfaceC1903b interfaceC1903b;
        if (!this.f30057e || (interfaceC1903b = this.f30055c) == null) {
            return;
        }
        this.f30053a.getRemoteService(interfaceC1903b, this.f30056d);
    }
}
