package p572ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p598z8.C13748l;

/* JADX INFO: renamed from: ya.p */
/* JADX INFO: loaded from: classes.dex */
public final class C13159p extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final Bundle f46415e;

    public C13159p(Context context, Looper looper, C13748l c13748l, C8926d c8926d, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 212, c8926d, interfaceC8030e, interfaceC8057n);
        this.f46415e = new Bundle();
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C13151h0 ? (C13151h0) iInterfaceQueryLocalInterface : new C13151h0(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return C13160q.f46424i;
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f46415e;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
