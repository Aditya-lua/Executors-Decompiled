package za;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class x extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f39211e;

    public x(Context context, Looper looper, a9.n nVar, o9.f fVar, m9.e eVar, m9.n nVar2) {
        super(context, looper, 223, fVar, eVar, nVar2);
        this.f39211e = new Bundle();
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new a0(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return q.f39207i;
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f39211e;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
