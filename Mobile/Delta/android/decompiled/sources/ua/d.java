package ua;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // ua.f
    public final boolean B(boolean z10) {
        Parcel parcelR2 = r2();
        c.a(parcelR2, true);
        Parcel parcelS2 = s2(2, parcelR2);
        boolean zB = c.b(parcelS2);
        parcelS2.recycle();
        return zB;
    }

    @Override // ua.f
    public final String zzc() {
        Parcel parcelS2 = s2(1, r2());
        String string = parcelS2.readString();
        parcelS2.recycle();
        return string;
    }
}
