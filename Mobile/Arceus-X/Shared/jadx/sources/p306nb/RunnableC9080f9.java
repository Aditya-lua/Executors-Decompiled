package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.f9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9080f9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f32920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32922c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f32923d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f32924e;

    public RunnableC9080f9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2383x1 interfaceC2383x1, String str, String str2, boolean z10) {
        this.f32920a = interfaceC2383x1;
        this.f32921b = str;
        this.f32922c = str2;
        this.f32923d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f32924e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32924e.f9484a.m36315J().m36892h0(this.f32920a, this.f32921b, this.f32922c, this.f32923d);
    }
}
