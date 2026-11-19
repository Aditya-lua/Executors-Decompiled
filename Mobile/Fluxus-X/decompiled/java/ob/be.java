package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class be implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        byte[] bArrC = null;
        String strH = null;
        Bundle bundleB = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 2:
                    bArrC = p9.b.c(parcel, iU);
                    break;
                case 3:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 4:
                    bundleB = p9.b.b(parcel, iU);
                    break;
                case 5:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 6:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 7:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new ae(jY, bArrC, strH, bundleB, iW, jY2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ae[i10];
    }
}
