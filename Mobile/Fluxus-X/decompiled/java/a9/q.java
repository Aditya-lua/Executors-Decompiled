package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        int iW = 0;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 6:
                    iW = p9.b.w(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new e(strH, strH2, strH3, strH4, zO, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
