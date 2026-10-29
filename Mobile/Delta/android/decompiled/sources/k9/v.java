package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        boolean zO = true;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN == 3) {
                iW3 = o9.a.w(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                zO = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new ComplianceOptions(iW, iW2, iW3, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ComplianceOptions[i10];
    }
}
