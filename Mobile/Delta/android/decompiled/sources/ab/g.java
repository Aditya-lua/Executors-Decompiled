package ab;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class g extends n9.e {
    public g(Context context, Looper looper, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, 258, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return c.f303l;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // n9.c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
