package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Boolean boolP = null;
        String strH2 = null;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                boolP = o9.a.p(parcel, iU);
            } else if (iN == 4) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                strH3 = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new AuthenticatorSelectionCriteria(strH, boolP, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorSelectionCriteria[i10];
    }
}
