package p355p9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import bb.C1298f;
import com.google.android.gms.common.Feature;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p305n9.C8965r;

/* JADX INFO: renamed from: p9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10182e extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final C8965r f36752e;

    public C10182e(Context context, Looper looper, C8926d c8926d, C8965r c8965r, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 270, c8926d, interfaceC8030e, interfaceC8057n);
        this.f36752e = c8965r;
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C10178a ? (C10178a) iInterfaceQueryLocalInterface : new C10178a(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return C1298f.f5335b;
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f36752e.m36069b();
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p305n9.AbstractC8923c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
