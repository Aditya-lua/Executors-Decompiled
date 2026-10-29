package n9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends db.a implements m1 {
    public k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // n9.m1
    public final y9.a zzd() {
        Parcel parcelR2 = r2(1, s2());
        y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    @Override // n9.m1
    public final int zze() {
        Parcel parcelR2 = r2(2, s2());
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }
}
