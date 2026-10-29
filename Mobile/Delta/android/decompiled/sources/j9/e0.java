package j9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        long jY = -1;
        boolean zO = false;
        int iW = 0;
        int iW2 = 0;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                zO = o9.a.o(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                jY = o9.a.y(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzr(zO, strH, iW, iW2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
