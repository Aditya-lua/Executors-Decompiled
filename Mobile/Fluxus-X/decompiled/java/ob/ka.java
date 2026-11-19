package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ka implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oe f27518a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public ka(AppMeasurementDynamiteService appMeasurementDynamiteService, oe oeVar) {
        this.f27518a = oeVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f7393a.B().I(this.f27518a);
    }
}
