package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.d7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9044d7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f32840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f32841b;

    public RunnableC9044d7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2383x1 interfaceC2383x1) {
        this.f32840a = interfaceC2383x1;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f32841b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32841b.f9484a.m36315J().m36900r(this.f32840a);
    }
}
