package mb;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator<w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = BuildConfig.FLAVOR;
        String strH2 = BuildConfig.FLAVOR;
        String strH3 = strH2;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                strH3 = p9.b.h(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new w(strH, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w[] newArray(int i10) {
        return new w[i10];
    }
}
