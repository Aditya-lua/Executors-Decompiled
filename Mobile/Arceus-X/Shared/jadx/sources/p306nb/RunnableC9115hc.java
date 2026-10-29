package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.hc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9115hc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f33016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f33017b;

    public RunnableC9115hc(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2383x1 interfaceC2383x1) {
        this.f33016a = interfaceC2383x1;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33017b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f33017b;
        appMeasurementDynamiteService.f9484a.m36308C().m36961e0(this.f33016a, appMeasurementDynamiteService.f9484a.m36326f());
    }
}
