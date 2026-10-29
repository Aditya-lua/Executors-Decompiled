package p572ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p242k9.AbstractC7496f;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p570y8.C13129f;
import p570y8.C13130g;

/* JADX INFO: renamed from: ya.v */
/* JADX INFO: loaded from: classes.dex */
public final class C13165v extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final C13130g f46427e;

    public C13165v(Context context, Looper looper, C8926d c8926d, C13130g c13130g, AbstractC7496f.a aVar, AbstractC7496f.b bVar) {
        super(context, looper, 68, c8926d, aVar, bVar);
        C13129f c13129f = new C13129f(c13130g == null ? C13130g.f46386d : c13130g);
        c13129f.m48736a(C13161r.m48764a());
        this.f46427e = new C13130g(c13129f);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C13166w ? (C13166w) iInterfaceQueryLocalInterface : new C13166w(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f46427e.m48740a();
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
