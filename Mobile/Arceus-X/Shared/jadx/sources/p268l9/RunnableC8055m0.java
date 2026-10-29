package p268l9;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: l9.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8055m0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectionResult f30048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8058n0 f30049b;

    public RunnableC8055m0(C8058n0 c8058n0, ConnectionResult connectionResult) {
        this.f30049b = c8058n0;
        this.f30048a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8058n0 c8058n0 = this.f30049b;
        C8046j0 c8046j0 = (C8046j0) c8058n0.f30058f.f30003o.get(c8058n0.f30054b);
        if (c8046j0 == null) {
            return;
        }
        if (!this.f30048a.m9138A3()) {
            c8046j0.m33201F(this.f30048a, null);
            return;
        }
        this.f30049b.f30057e = true;
        if (this.f30049b.f30053a.requiresSignIn()) {
            this.f30049b.m33246i();
            return;
        }
        try {
            C8058n0 c8058n1 = this.f30049b;
            c8058n1.f30053a.getRemoteService(null, c8058n1.f30053a.mo26901b());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f30049b.f30053a.disconnect("Failed to get service from broker.");
            c8046j0.m33201F(new ConnectionResult(10), null);
        }
    }
}
