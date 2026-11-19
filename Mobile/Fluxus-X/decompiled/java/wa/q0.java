package wa;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9.a.g f35726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f35727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l9.a f35728g;

    static {
        l9.a.g gVar = new l9.a.g();
        f35726e = gVar;
        p0 p0Var = new p0();
        f35727f = p0Var;
        f35728g = new l9.a("AppIndexing.API", p0Var, gVar);
    }

    public q0(Context context, Looper looper, o9.f fVar, m9.e eVar, m9.n nVar) {
        super(context, looper, 113, fVar, eVar, nVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return nf.d.s2(iBinder);
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
