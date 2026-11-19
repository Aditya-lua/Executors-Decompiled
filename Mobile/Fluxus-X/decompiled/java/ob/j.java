package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        bf bfVar = null;
        String strH3 = null;
        i0 i0Var = null;
        i0 i0Var2 = null;
        i0 i0Var3 = null;
        long jY = 0;
        long jY2 = 0;
        long jY3 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 2:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    bfVar = (bf) p9.b.g(parcel, iU, bf.CREATOR);
                    break;
                case 5:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 6:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 7:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 8:
                    i0Var = (i0) p9.b.g(parcel, iU, i0.CREATOR);
                    break;
                case 9:
                    jY2 = p9.b.y(parcel, iU);
                    break;
                case 10:
                    i0Var2 = (i0) p9.b.g(parcel, iU, i0.CREATOR);
                    break;
                case 11:
                    jY3 = p9.b.y(parcel, iU);
                    break;
                case 12:
                    i0Var3 = (i0) p9.b.g(parcel, iU, i0.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new i(strH, strH2, bfVar, jY, zO, strH3, i0Var, jY2, i0Var2, jY3, i0Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
