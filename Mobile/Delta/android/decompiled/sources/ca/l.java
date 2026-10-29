package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        byte[] bArrC = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                bArrC = o9.a.c(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                arrayListL = o9.a.l(parcel, iU, Transport.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new PublicKeyCredentialDescriptor(strH, bArrC, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialDescriptor[i10];
    }
}
