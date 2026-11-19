package za;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class v extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.g f39210e;

    public v(Context context, Looper looper, o9.f fVar, z8.g gVar, l9.h.a aVar, l9.h.b bVar) {
        super(context, looper, 68, fVar, aVar, bVar);
        z8.f fVar2 = new z8.f(gVar == null ? z8.g.f39176d : gVar);
        fVar2.a(r.a());
        this.f39210e = new z8.g(fVar2);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder);
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f39210e.a();
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
