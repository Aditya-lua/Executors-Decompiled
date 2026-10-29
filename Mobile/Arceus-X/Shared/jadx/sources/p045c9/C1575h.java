package p045c9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: c9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1575h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        ArrayList arrayListM38438l = null;
        Account account = null;
        String strM38434h = null;
        String strM38434h2 = null;
        ArrayList arrayListM38438l2 = null;
        String strM38434h3 = null;
        int iM38449w = 0;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C9717a.m38433g(parcel, iM38447u, Account.CREATOR);
                    break;
                case 4:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 6:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    arrayListM38438l2 = C9717a.m38438l(parcel, iM38447u, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GoogleSignInOptions(iM38449w, arrayListM38438l, account, zM38441o, zM38441o2, zM38441o3, strM38434h, strM38434h2, arrayListM38438l2, strM38434h3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
