package wa;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends o9.i {
    public e0(Context context, Looper looper, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, 19, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new a0(iBinder);
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
