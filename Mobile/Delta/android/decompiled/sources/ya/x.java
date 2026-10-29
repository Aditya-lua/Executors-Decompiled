package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class x extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f35812e;

    public x(Context context, Looper looper, z8.e eVar, n9.d dVar, l9.e eVar2, l9.n nVar) {
        super(context, looper, 223, dVar, eVar2, nVar);
        this.f35812e = new Bundle();
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new a0(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return q.f35808i;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f35812e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
