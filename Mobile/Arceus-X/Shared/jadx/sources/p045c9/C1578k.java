package p045c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import p325o9.C9717a;

/* JADX INFO: renamed from: c9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1578k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strM38434h2 = "";
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 4) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 7) {
                googleSignInAccount = (GoogleSignInAccount) C9717a.m38433g(parcel, iM38447u, GoogleSignInAccount.CREATOR);
            } else if (iM38440n != 8) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SignInAccount(strM38434h, googleSignInAccount, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
