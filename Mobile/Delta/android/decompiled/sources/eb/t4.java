package eb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends n9.e {
    public t4(Context context, Looper looper, n9.d dVar, k9.f.a aVar, k9.f.b bVar) {
        super(context, looper, 148, dVar, aVar, bVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof w4 ? (w4) iInterfaceQueryLocalInterface : new w4(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return new Feature[]{aa.b.f270h, aa.b.f269g};
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
