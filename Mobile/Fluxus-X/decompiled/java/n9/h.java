package n9;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String[] strArrI = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strArrI = p9.b.i(parcel, iU);
            } else if (iN == 2) {
                cursorWindowArr = (CursorWindow[]) p9.b.k(parcel, iU, CursorWindow.CREATOR);
            } else if (iN == 3) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN == 4) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN != 1000) {
                p9.b.C(parcel, iU);
            } else {
                iW = p9.b.w(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        DataHolder dataHolder = new DataHolder(iW, strArrI, cursorWindowArr, iW2, bundleB);
        dataHolder.J3();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
