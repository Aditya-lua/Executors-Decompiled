package p125fb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: fb.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5503b2 extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final C5552p1 f21275e;

    public C5503b2(Context context, Looper looper, C8926d c8926d, C5552p1 c5552p1, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 1, c8926d, interfaceC8030e, interfaceC8057n);
        this.f21275e = c5552p1;
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return iInterfaceQueryLocalInterface instanceof C5523g2 ? (C5523g2) iInterfaceQueryLocalInterface : new C5523g2(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        C5552p1 c5552p1 = this.f21275e;
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", c5552p1.f21342a);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", c5552p1.f21343b);
        return bundle;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 213000000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
