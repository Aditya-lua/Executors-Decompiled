package bb;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o9.i {
    public g(Context context, Looper looper, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, 258, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return c.f3860l;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // o9.d
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
