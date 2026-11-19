package gb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f17605e;

    public c2(Context context, Looper looper, o9.f fVar, q1 q1Var, m9.e eVar, m9.n nVar) {
        super(context, looper, 1, fVar, eVar, nVar);
        this.f17605e = q1Var;
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new j2(iBinder);
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        q1 q1Var = this.f17605e;
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", q1Var.f17662a);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", q1Var.b);
        return bundle;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 213000000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
