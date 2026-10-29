package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;
import eb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN == 2) {
                bArrC2 = o9.a.c(parcel, iU);
            } else if (iN == 3) {
                bArrC3 = o9.a.c(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzai(bArrC == null ? null : m3.m(bArrC, 0, bArrC.length), bArrC2 == null ? null : m3.m(bArrC2, 0, bArrC2.length), bArrC3 != null ? m3.m(bArrC3, 0, bArrC3.length) : null, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzai[i10];
    }
}
