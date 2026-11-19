package f9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        boolean zO = false;
        ArrayList<String> arrayListJ = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                arrayListJ = p9.b.j(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                zO = p9.b.o(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new c(arrayListJ, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
