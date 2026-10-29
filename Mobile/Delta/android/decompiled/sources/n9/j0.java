package n9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Account account = null;
        int iW = 0;
        int iW2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                account = (Account) o9.a.g(parcel, iU, Account.CREATOR);
            } else if (iN == 3) {
                iW2 = o9.a.w(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                googleSignInAccount = (GoogleSignInAccount) o9.a.g(parcel, iU, GoogleSignInAccount.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new zat(iW, account, iW2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zat[i10];
    }
}
