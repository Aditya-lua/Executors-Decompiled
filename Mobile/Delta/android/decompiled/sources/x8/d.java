package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zza createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                strH2 = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zza(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i10) {
        return new zza[i10];
    }
}
