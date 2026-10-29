package p305n9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8945j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Account account = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                account = (Account) C9717a.m38433g(parcel, iM38447u, Account.CREATOR);
            } else if (iM38440n == 3) {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C9717a.m38433g(parcel, iM38447u, GoogleSignInAccount.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zat(iM38449w, account, iM38449w2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zat[i10];
    }
}
