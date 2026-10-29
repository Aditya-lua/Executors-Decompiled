package hb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import lb.a0;

/* JADX INFO: loaded from: classes.dex */
public class v extends n9.e<f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r<f> f18764f;

    public v(Context context, Looper looper, k9.f.a aVar, k9.f.b bVar, String str, n9.d dVar) {
        super(context, looper, 23, dVar, aVar, bVar);
        this.f18764f = new u(this);
        this.f18763e = str;
    }

    @Override // n9.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return a0.f23117f;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f18763e);
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
