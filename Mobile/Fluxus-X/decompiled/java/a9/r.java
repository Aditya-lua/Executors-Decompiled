package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        ArrayList<String> arrayListJ = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 2:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 3:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 5:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 6:
                    arrayListJ = p9.b.j(parcel, iU);
                    break;
                case 7:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new a.b(zO, strH, strH2, zO2, strH3, arrayListJ, zO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.b[i10];
    }
}
