package wa;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n9.e<g> {
    public d(Context context, Looper looper, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return x8.f.b;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
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
