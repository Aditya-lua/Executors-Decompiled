package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k9.a.g f32903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k9.a.AbstractC0392a f32904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k9.a f32905g;

    static {
        k9.a.g gVar = new k9.a.g();
        f32903e = gVar;
        o0 o0Var = new o0();
        f32904f = o0Var;
        f32905g = new k9.a("AppIndexing.API", o0Var, gVar);
    }

    public p0(Context context, Looper looper, n9.d dVar, l9.e eVar, l9.n nVar) {
        super(context, looper, 113, dVar, eVar, nVar);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return kf.c.s2(iBinder);
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
