package p166hb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import lb.C8098a0;
import p242k9.AbstractC7496f;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: hb.v */
/* JADX INFO: loaded from: classes.dex */
public class C6348v extends AbstractC8929e<InterfaceC6332f> {

    /* JADX INFO: renamed from: e */
    public final String f24086e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC6344r<InterfaceC6332f> f24087f;

    public C6348v(Context context, Looper looper, AbstractC7496f.a aVar, AbstractC7496f.b bVar, String str, C8926d c8926d) {
        super(context, looper, 23, c8926d, aVar, bVar);
        this.f24087f = new C6347u(this);
        this.f24086e = str;
    }

    @Override // p305n9.AbstractC8923c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6332f ? (InterfaceC6332f) iInterfaceQueryLocalInterface : new C6331e(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return C8098a0.f30143f;
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f24086e);
        return bundle;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
