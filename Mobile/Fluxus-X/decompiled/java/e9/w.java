package e9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 2) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 5) {
                p9.b.C(parcel, iU);
            } else {
                googleSignInOptions = (GoogleSignInOptions) p9.b.g(parcel, iU, GoogleSignInOptions.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new SignInConfiguration(strH, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
