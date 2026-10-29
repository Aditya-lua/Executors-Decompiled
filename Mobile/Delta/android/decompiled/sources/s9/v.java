package s9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class v extends n9.e {
    public v(Context context, Looper looper, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, HttpStatusCodesKt.HTTP_PERM_REDIRECT, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return bb.k.b;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // n9.c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
