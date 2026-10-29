package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f25484a;
    public final /* synthetic */ zzbg b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f25486d;

    public e8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        this.f25484a = x1Var;
        this.b = zzbgVar;
        this.f25485c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f25486d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25486d.f7405a.J().B(this.f25484a, this.b, this.f25485c);
    }
}
