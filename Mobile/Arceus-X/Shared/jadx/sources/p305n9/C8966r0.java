package p305n9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: n9.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8966r0 extends Exception {

    /* JADX INFO: renamed from: a */
    public final ConnectionResult f32636a;

    public C8966r0(ConnectionResult connectionResult) {
        C8953m.m36037b(connectionResult.m9143z3(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f32636a = connectionResult;
    }
}
