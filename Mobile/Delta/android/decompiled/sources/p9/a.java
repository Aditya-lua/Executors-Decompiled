package p9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: loaded from: classes.dex */
public final class a extends bb.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void u2(TelemetryData telemetryData) {
        Parcel parcelR2 = r2();
        bb.c.c(parcelR2, telemetryData);
        t2(1, parcelR2);
    }
}
