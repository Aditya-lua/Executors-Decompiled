package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: renamed from: nb.e8 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9062e8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f32884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbg f32885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f32887d;

    public RunnableC9062e8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2383x1 interfaceC2383x1, zzbg zzbgVar, String str) {
        this.f32884a = interfaceC2383x1;
        this.f32885b = zzbgVar;
        this.f32886c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f32887d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32887d.f9484a.m36315J().m36861B(this.f32884a, this.f32885b, this.f32886c);
    }
}
