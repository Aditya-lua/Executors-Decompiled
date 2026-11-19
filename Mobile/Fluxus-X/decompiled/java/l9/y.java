package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN != 2) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new Scope(iW, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
