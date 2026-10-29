package p306nb;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import p305n9.AbstractC8923c;

/* JADX INFO: renamed from: nb.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9252q5 extends AbstractC8923c {
    public C9252q5(Context context, Looper looper, AbstractC8923c.a aVar, AbstractC8923c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9042d5 ? (InterfaceC9042d5) iInterfaceQueryLocalInterface : new C8991a5(iBinder);
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
