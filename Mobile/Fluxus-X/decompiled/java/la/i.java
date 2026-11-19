package la;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        PersistableBundle persistableBundle = null;
        Boolean boolP = null;
        Boolean boolP2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                persistableBundle = (PersistableBundle) p9.b.g(parcel, iU, PersistableBundle.CREATOR);
            } else if (iN == 3) {
                boolP = p9.b.p(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                boolP2 = p9.b.p(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new h(strH, persistableBundle, boolP, boolP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
