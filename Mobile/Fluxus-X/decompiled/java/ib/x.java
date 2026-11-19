package ib;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import mb.d0;

/* JADX INFO: loaded from: classes.dex */
public class x extends o9.i<f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t<f> f19343f;

    public x(Context context, Looper looper, l9.h.a aVar, l9.h.b bVar, String str, o9.f fVar) {
        super(context, looper, 23, fVar, aVar, bVar);
        this.f19343f = new w(this);
        this.f19342e = str;
    }

    @Override // o9.d
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return d0.f23108f;
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f19342e);
        return bundle;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
