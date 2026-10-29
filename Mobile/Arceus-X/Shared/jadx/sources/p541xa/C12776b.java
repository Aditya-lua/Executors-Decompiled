package p541xa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p570y8.C13125b;
import p570y8.C13126c;

/* JADX INFO: renamed from: xa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12776b extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final Bundle f45509e;

    public C12776b(Context context, Looper looper, C8926d c8926d, C13126c c13126c, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 16, c8926d, interfaceC8030e, interfaceC8057n);
        this.f45509e = c13126c == null ? new Bundle() : c13126c.m48735a();
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof C12777c ? (C12777c) iInterfaceQueryLocalInterface : new C12777c(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f45509e;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final boolean requiresSignIn() {
        C8926d c8926dM35979d = m35979d();
        return (TextUtils.isEmpty(c8926dM35979d.m35958b()) || c8926dM35979d.m35961e(C13125b.f46378a).isEmpty()) ? false : true;
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
