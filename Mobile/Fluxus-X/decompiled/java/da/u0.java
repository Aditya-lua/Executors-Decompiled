package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        byte[] bArrC = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 3) {
                bArrC = p9.b.c(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                arrayListL = p9.b.l(parcel, iU, Transport.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new s(strH, bArrC, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
