package nb;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26305a;
    public final /* synthetic */ zzbg b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26307d;

    public e8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        this.f26305a = x1Var;
        this.b = zzbgVar;
        this.f26306c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26307d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26307d.f7479a.J().B(this.f26305a, this.b, this.f26306c);
    }
}
