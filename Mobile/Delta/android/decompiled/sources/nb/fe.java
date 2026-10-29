package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fe implements u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e2 f25522a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public fe(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.e2 e2Var) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
        this.f25522a = e2Var;
    }

    @Override // nb.u8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f25522a.p(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            g7 g7Var = this.b.f7405a;
            if (g7Var != null) {
                g7Var.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}
