package z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        SignInPassword signInPassword = null;
        String strH = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                signInPassword = (SignInPassword) o9.a.g(parcel, iU, SignInPassword.CREATOR);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new SavePasswordRequest(signInPassword, strH, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SavePasswordRequest[i10];
    }
}
