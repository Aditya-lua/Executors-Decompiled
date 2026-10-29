package p598z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import p325o9.C9717a;

/* JADX INFO: renamed from: z8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13745i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        SignInPassword signInPassword = null;
        String strM38434h = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                signInPassword = (SignInPassword) C9717a.m38433g(parcel, iM38447u, SignInPassword.CREATOR);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SavePasswordRequest(signInPassword, strM38434h, iM38449w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SavePasswordRequest[i10];
    }
}
