package p306nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2039e2;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.fe */
/* JADX INFO: loaded from: classes.dex */
public final class C9085fe implements InterfaceC9319u8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2039e2 f32934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f32935b;

    public C9085fe(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2039e2 interfaceC2039e2) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f32935b = appMeasurementDynamiteService;
        this.f32934a = interfaceC2039e2;
    }

    @Override // p306nb.InterfaceC9319u8
    /* JADX INFO: renamed from: a */
    public final void mo36297a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f32934a.mo9774p(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C9094g7 c9094g7 = this.f32935b.f9484a;
            if (c9094g7 != null) {
                c9094g7.mo36321a().m37006r().m36912b("Event interceptor threw exception", e10);
            }
        }
    }
}
