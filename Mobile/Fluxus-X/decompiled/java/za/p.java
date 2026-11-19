package za;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f39199e;

    public p(Context context, Looper looper, a9.y yVar, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, 212, fVar, eVar, nVar);
        this.f39199e = new Bundle();
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new h0(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return q.f39207i;
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f39199e;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
