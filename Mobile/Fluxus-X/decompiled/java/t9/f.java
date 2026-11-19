package t9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        ArrayList arrayListL = null;
        String strH = null;
        boolean zO = false;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                arrayListL = p9.b.l(parcel, iU, k9.d.CREATOR);
            } else if (iN == 2) {
                zO = p9.b.o(parcel, iU);
            } else if (iN == 3) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new a(arrayListL, zO, strH2, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
