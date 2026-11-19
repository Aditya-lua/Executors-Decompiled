package o9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Account account = null;
        int iW = 0;
        int iW2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                iW = p9.b.w(parcel, iU);
            } else if (iN == 2) {
                account = (Account) p9.b.g(parcel, iU, Account.CREATOR);
            } else if (iN == 3) {
                iW2 = p9.b.w(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                googleSignInAccount = (GoogleSignInAccount) p9.b.g(parcel, iU, GoogleSignInAccount.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new r0(iW, account, iW2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r0[i10];
    }
}
