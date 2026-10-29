package p243ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import p073da.C4506j;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: ka.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7531q extends AbstractC8929e {
    public C7531q(Context context, Looper looper, C8926d c8926d, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 1, c8926d, interfaceC8030e, interfaceC8057n);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
        return iInterfaceQueryLocalInterface instanceof C7532r ? (C7532r) iInterfaceQueryLocalInterface : new C7532r(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return new Feature[]{C4506j.f18542g};
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.appshortcuts.service.START";
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
