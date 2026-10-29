package p598z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInPassword;
import p325o9.C9717a;

/* JADX INFO: renamed from: z8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C13749m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SignInPassword(strM38434h, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInPassword[i10];
    }
}
