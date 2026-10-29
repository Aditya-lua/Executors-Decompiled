package j9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        boolean zO = false;
        long jY = -1;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                jY = o9.a.y(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                zO = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new Feature(strH, iW, jY, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
