package la;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        ArrayList<String> arrayListJ = null;
        ArrayList arrayListL = null;
        ArrayList<String> arrayListJ2 = null;
        ArrayList<String> arrayListJ3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                arrayListJ = p9.b.j(parcel, iU);
            } else if (iN == 2) {
                arrayListL = p9.b.l(parcel, iU, ShortcutInfo.CREATOR);
            } else if (iN == 3) {
                arrayListJ2 = p9.b.j(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                arrayListJ3 = p9.b.j(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new f(arrayListJ, arrayListL, arrayListJ2, arrayListJ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
