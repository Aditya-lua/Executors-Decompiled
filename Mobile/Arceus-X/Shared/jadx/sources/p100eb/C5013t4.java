package p100eb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import p011aa.C0103b;
import p242k9.AbstractC7496f;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: eb.t4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5013t4 extends AbstractC8929e {
    public C5013t4(Context context, Looper looper, C8926d c8926d, AbstractC7496f.a aVar, AbstractC7496f.b bVar) {
        super(context, looper, 148, c8926d, aVar, bVar);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof C5031w4 ? (C5031w4) iInterfaceQueryLocalInterface : new C5031w4(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return new Feature[]{C0103b.f340h, C0103b.f339g};
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
