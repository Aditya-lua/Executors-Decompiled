package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fe f26338a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public fa(AppMeasurementDynamiteService appMeasurementDynamiteService, fe feVar) {
        this.f26338a = feVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f7479a.B().I(this.f26338a);
    }
}
