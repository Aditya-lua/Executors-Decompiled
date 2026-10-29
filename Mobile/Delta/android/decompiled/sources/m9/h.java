package m9;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String[] strArrI = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strArrI = o9.a.i(parcel, iU);
            } else if (iN == 2) {
                cursorWindowArr = (CursorWindow[]) o9.a.k(parcel, iU, CursorWindow.CREATOR);
            } else if (iN == 3) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 4) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN != 1000) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        DataHolder dataHolder = new DataHolder(iW, strArrI, cursorWindowArr, iW2, bundleB);
        dataHolder.E3();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
