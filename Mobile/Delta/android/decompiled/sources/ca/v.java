package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        short sA = 0;
        short sA2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                sA = o9.a.A(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                sA2 = o9.a.A(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new UvmEntry(iW, sA, sA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new UvmEntry[i10];
    }
}
