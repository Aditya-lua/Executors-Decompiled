package ob;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class v5 extends o9.d {
    public v5(Context context, Looper looper, o9.d.a aVar, o9.d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof i5 ? (i5) iInterfaceQueryLocalInterface : new f5(iBinder);
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
