package ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n9.e {
    public q(Context context, Looper looper, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, 1, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return new Feature[]{da.j.f14513g};
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.appshortcuts.service.START";
    }

    @Override // n9.c, k9.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
