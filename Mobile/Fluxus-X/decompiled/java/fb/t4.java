package fb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends o9.i {
    public t4(Context context, Looper looper, o9.f fVar, l9.h.a aVar, l9.h.b bVar) {
        super(context, looper, 148, fVar, aVar, bVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof w4 ? (w4) iInterfaceQueryLocalInterface : new w4(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return new k9.d[]{ba.b.f3807h, ba.b.f3806g};
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
