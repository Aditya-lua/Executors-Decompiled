package p512wa;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.mlkit.common.MlKitException;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p539x8.C12772f;

/* JADX INFO: renamed from: wa.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12331d extends AbstractC8929e<C12334g> {
    public C12331d(Context context, Looper looper, C8926d c8926d, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, c8926d, interfaceC8030e, interfaceC8057n);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof C12334g ? (C12334g) iInterfaceQueryLocalInterface : new C12334g(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return C12772f.f45506b;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // p305n9.AbstractC8923c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
