package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27514a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f27517e;

    public k9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        this.f27514a = x1Var;
        this.b = str;
        this.f27515c = str2;
        this.f27516d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f27517e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27517e.f7393a.J().h0(this.f27514a, this.b, this.f27515c, this.f27516d);
    }
}
