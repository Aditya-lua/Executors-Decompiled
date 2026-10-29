package p306nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.fa */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9081fa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9085fe f32925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f32926b;

    public RunnableC9081fa(AppMeasurementDynamiteService appMeasurementDynamiteService, C9085fe c9085fe) {
        this.f32925a = c9085fe;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f32926b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32926b.f9484a.m36307B().m36670I(this.f32925a);
    }
}
