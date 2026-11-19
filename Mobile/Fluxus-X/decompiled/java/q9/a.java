package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o9.w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends cb.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void u2(w wVar) {
        Parcel parcelR2 = r2();
        cb.c.c(parcelR2, wVar);
        t2(1, parcelR2);
    }
}
