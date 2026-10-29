package za;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void t2(h hVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, hVar);
        s2(1, parcelR2);
    }
}
