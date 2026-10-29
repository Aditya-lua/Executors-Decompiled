package n9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f25298a;

    public r0(ConnectionResult connectionResult) {
        m.b(connectionResult.z3(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f25298a = connectionResult;
    }
}
