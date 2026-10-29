package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class v extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y8.g f35811e;

    public v(Context context, Looper looper, n9.d dVar, y8.g gVar, k9.f.a aVar, k9.f.b bVar) {
        super(context, looper, 68, dVar, aVar, bVar);
        y8.f fVar = new y8.f(gVar == null ? y8.g.f35777d : gVar);
        fVar.a(r.a());
        this.f35811e = new y8.g(fVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder);
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f35811e.a();
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
