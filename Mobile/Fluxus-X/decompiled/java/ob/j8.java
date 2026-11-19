package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27487a;
    public final /* synthetic */ i0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f27489d;

    public j8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, i0 i0Var, String str) {
        this.f27487a = x1Var;
        this.b = i0Var;
        this.f27488c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f27489d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27489d.f7393a.J().B(this.f27487a, this.b, this.f27488c);
    }
}
