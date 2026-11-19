package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27465a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public i7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27465a = x1Var;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f7393a.J().r(this.f27465a);
    }
}
