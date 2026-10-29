package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzbj;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator<zzbj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = "";
        String strH2 = "";
        String strH3 = strH2;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                strH3 = o9.a.h(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                strH = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzbj(strH, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
