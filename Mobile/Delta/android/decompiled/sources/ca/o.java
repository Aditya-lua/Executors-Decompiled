package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        byte[] bArrC = null;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN == 3) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 4) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                strH3 = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new PublicKeyCredentialUserEntity(bArrC, strH, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialUserEntity[i10];
    }
}
