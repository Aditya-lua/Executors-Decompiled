package la;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        ComponentName componentName = null;
        String strH2 = null;
        int iW = 0;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                jY = p9.b.y(parcel, iU);
            } else if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 4) {
                componentName = (ComponentName) p9.b.g(parcel, iU, ComponentName.CREATOR);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                strH2 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new q(jY, strH, iW, componentName, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
