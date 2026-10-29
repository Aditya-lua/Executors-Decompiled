package p045c9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: renamed from: c9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1572e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        Uri uri = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        ArrayList arrayListM38438l = null;
        String strM38434h7 = null;
        String strM38434h8 = null;
        long jM38451y = 0;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 7:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 9:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 10:
                    arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Scope.CREATOR);
                    break;
                case 11:
                    strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 12:
                    strM38434h8 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GoogleSignInAccount(iM38449w, strM38434h, strM38434h2, strM38434h3, strM38434h4, uri, strM38434h5, jM38451y, strM38434h6, arrayListM38438l, strM38434h7, strM38434h8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
