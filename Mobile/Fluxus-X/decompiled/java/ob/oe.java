package ob;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oe implements z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f27661a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public oe(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
        this.f27661a = e2Var;
    }

    @Override // ob.z8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f27661a.p(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            l7 l7Var = this.b.f7393a;
            if (l7Var != null) {
                l7Var.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}
