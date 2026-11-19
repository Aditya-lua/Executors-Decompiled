package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27590a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public mc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27590a = x1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.b;
        appMeasurementDynamiteService.f7393a.C().e0(this.f27590a, appMeasurementDynamiteService.f7393a.f());
    }
}
