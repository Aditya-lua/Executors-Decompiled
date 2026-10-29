package p355p9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bb.C1293a;
import bb.C1295c;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: renamed from: p9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10178a extends C1293a implements IInterface {
    public C10178a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m39204u2(TelemetryData telemetryData) {
        Parcel parcelM7086r2 = m7086r2();
        C1295c.m7092c(parcelM7086r2, telemetryData);
        m7088t2(1, parcelM7086r2);
    }
}
