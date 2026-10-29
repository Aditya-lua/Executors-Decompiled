package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzbo;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 1;
        int iW2 = 1;
        long jY = -1;
        long jY2 = -1;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                jY = o9.a.y(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                jY2 = o9.a.y(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzbo(iW, iW2, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i10) {
        return new zzbo[i10];
    }
}
