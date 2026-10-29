package fb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f16515e;

    public b2(Context context, Looper looper, n9.d dVar, p1 p1Var, l9.e eVar, l9.n nVar) {
        super(context, looper, 1, dVar, eVar, nVar);
        this.f16515e = p1Var;
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return iInterfaceQueryLocalInterface instanceof g2 ? (g2) iInterfaceQueryLocalInterface : new g2(iBinder);
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        p1 p1Var = this.f16515e;
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", p1Var.f16567a);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", p1Var.b);
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 213000000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
