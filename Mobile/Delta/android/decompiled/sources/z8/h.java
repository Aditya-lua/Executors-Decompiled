package z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        int iW = 0;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 6:
                    iW = o9.a.w(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new GetSignInIntentRequest(strH, strH2, strH3, strH4, zO, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetSignInIntentRequest[i10];
    }
}
