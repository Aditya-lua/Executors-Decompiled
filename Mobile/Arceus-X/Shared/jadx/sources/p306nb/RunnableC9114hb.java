package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.hb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9114hb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f33012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33014c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f33015d;

    public RunnableC9114hb(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2383x1 interfaceC2383x1, String str, String str2) {
        this.f33012a = interfaceC2383x1;
        this.f33013b = str;
        this.f33014c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33015d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33015d.f9484a.m36315J().m36890f0(this.f33012a, this.f33013b, this.f33014c);
    }
}
