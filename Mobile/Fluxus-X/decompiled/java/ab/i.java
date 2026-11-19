package ab;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m9.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o9.i {
    public i(Context context, Looper looper, o9.f fVar, m9.e eVar, n nVar) {
        super(context, looper, 126, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return c.f392e;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
