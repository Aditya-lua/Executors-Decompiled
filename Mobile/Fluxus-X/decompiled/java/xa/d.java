package xa;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o9.i<g> {
    public d(Context context, Looper looper, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return y8.h.b;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
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
