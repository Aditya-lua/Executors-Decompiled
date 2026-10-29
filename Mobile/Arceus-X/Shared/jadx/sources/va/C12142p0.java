package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p242k9.C7491a;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p271lf.AbstractBinderC8131c;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: va.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12142p0 extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public static final C7491a.g f42762e;

    /* JADX INFO: renamed from: f */
    public static final C7491a.a f42763f;

    /* JADX INFO: renamed from: g */
    public static final C7491a f42764g;

    static {
        C7491a.g gVar = new C7491a.g();
        f42762e = gVar;
        C12140o0 c12140o0 = new C12140o0();
        f42763f = c12140o0;
        f42764g = new C7491a("AppIndexing.API", c12140o0, gVar);
    }

    public C12142p0(Context context, Looper looper, C8926d c8926d, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        super(context, looper, 113, c8926d, interfaceC8030e, interfaceC8057n);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return AbstractBinderC8131c.m33352s2(iBinder);
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
