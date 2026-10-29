package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzc(strH, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i10) {
        return new zzc[i10];
    }
}
