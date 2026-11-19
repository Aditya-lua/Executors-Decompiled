package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = BuildConfig.FLAVOR;
        GoogleSignInAccount googleSignInAccount = null;
        String strH2 = BuildConfig.FLAVOR;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 4) {
                strH = p9.b.h(parcel, iU);
            } else if (iN == 7) {
                googleSignInAccount = (GoogleSignInAccount) p9.b.g(parcel, iU, GoogleSignInAccount.CREATOR);
            } else if (iN != 8) {
                p9.b.C(parcel, iU);
            } else {
                strH2 = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new SignInAccount(strH, googleSignInAccount, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
