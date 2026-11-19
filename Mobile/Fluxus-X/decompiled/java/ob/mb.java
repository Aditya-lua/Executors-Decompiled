package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27587a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f27589d;

    public mb(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        this.f27587a = x1Var;
        this.b = str;
        this.f27588c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f27589d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27589d.f7393a.J().f0(this.f27587a, this.b, this.f27588c);
    }
}
