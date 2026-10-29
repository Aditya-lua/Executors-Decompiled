package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f35800e;

    public p(Context context, Looper looper, z8.l lVar, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, 212, dVar, eVar, nVar);
        this.f35800e = new Bundle();
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new h0(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return q.f35808i;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f35800e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
