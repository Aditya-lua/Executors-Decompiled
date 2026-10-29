package p306nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2039e2;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: nb.we */
/* JADX INFO: loaded from: classes.dex */
public final class C9357we implements InterfaceC9335v8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2039e2 f33617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f33618b;

    public C9357we(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2039e2 interfaceC2039e2) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f33618b = appMeasurementDynamiteService;
        this.f33617a = interfaceC2039e2;
    }

    @Override // p306nb.InterfaceC9335v8
    /* JADX INFO: renamed from: a */
    public final void mo36918a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f33617a.mo9774p(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C9094g7 c9094g7 = this.f33618b.f9484a;
            if (c9094g7 != null) {
                c9094g7.mo36321a().m37006r().m36912b("Event listener threw exception", e10);
            }
        }
    }
}
