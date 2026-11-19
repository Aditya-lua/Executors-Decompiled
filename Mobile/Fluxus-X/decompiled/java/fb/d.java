package fb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o9.i {
    public d(Context context, Looper looper, o9.f fVar, l9.h.a aVar, l9.h.b bVar) {
        super(context, looper, 119, fVar, aVar, bVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return iInterfaceQueryLocalInterface instanceof x4 ? (x4) iInterfaceQueryLocalInterface : new x4(iBinder);
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
