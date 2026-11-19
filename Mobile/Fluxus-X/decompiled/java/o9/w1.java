package o9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends eb.a implements y1 {
    public w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // o9.y1
    public final z9.a zzd() {
        Parcel parcelR2 = r2(1, s2());
        z9.a aVarS2 = z9.a.AbstractBinderC0786a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    @Override // o9.y1
    public final int zze() {
        Parcel parcelR2 = r2(2, s2());
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }
}
