package la;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class t extends o9.i {
    public t(Context context, Looper looper, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, 1, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new u(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return new k9.d[]{ea.s.f13284g};
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.appshortcuts.service.START";
    }

    @Override // o9.d, l9.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
